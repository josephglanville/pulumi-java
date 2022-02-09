# Composite targets simplify local dev scenarios

build::	ensure build_go build_sdk

ensure::	ensure_go ensure_sdk

PKG_FILES := $(shell  find pkg -name '*.go' -type f)

# Go project rooted at `pkg/` implements Pulumi JVM language plugin
# and Java go as a Go library.

build_go::	ensure_go
	cd pkg && go build -v all

test_go:: build_go
	cd pkg && go test -test.v ./...

ensure_go::
	cd pkg && go mod tidy

bin/pulumi-language-jvm: ${PKG_FILES}
	mkdir -p bin
	cd pkg && go build -o ../bin github.com/pulumi/pulumi-java/pkg/cmd/pulumi-language-jvm

bin/pulumi-java-gen: ${PKG_FILES}
	mkdir -p bin
	cd pkg && go build -o ../bin github.com/pulumi/pulumi-java/pkg/cmd/pulumi-java-gen


# Java SDK is a gradle project rooted at `sdk/jvm`

install_sdk::
	cd sdk/jvm && make install

build_sdk::
	cd sdk/jvm && make build

ensure_sdk::
	cd sdk/jvm && make ensure

providers_all: provider.random.install provider.aws-native.install provider.kubernetes.install provider.azure-native.install provider.google-native.install provider.gcp.install

# Example: make provider.random.build
provider.%.build:	provider.%.generate
	cd providers/pulumi-$*/sdk/java && gradle build

# Example: make provider.random.generate
provider.%.generate:	bin/pulumi-java-gen
	./bin/pulumi-java-gen -config providers/pulumi-$*/pulumi-java-gen.yaml

.PHONY: lint_pkg
lint:: lint_pkg
lint_pkg:
	cd pkg && golangci-lint run -c ../.golangci.yml --timeout 5m

# Example: make provider.random.install
provider.%.install:	provider.%.build
	cd providers/pulumi-$*/sdk/java && gradle publishToMavenLocal

# Integration tests will use PULUMI_ACCESS_TOKEN to provision tests
# stacks in Pulumi service.
integration_tests::	bin/pulumi-language-jvm ensure_tests provider.random.install
	cd tests/examples && PATH=${PATH}:${PWD}/bin go test -run TestJava -test.v

ensure_tests::
	pulumi plugin install resource random v4.3.1
	git submodule update --init --recursive
	cd pulumi && git pull \
	&& find "./pkg/codegen/testing" "-name" "schema.json" "-exec" "cp" "--parents" "{}" "../" ";" \
	&& find "./pkg/codegen/testing" "-name" "schema.yaml" "-exec" "cp" "--parents" "{}" "../" ";"

codegen_tests::	ensure_tests
	cd ./pkg/codegen/jvm && go test ./...
