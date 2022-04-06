#!/usr/bin/env bash

# When committing new PRs, this script builds and commits:
# - the new output codegen tests
# - each provider in providers(if it's added to make providers_all)

set -euo pipefail

git pull 2&> /dev/null || true
base_branch="$(git branch --show-current)"

echo $base_branch | grep -v '^codegen/' || (echo 'ERROR currently on codegen branch' && exit -1)

codegen_branch="codegen/$(git branch --show-current)"

git checkout -b "$codegen_branch"

git checkout 'origin/main' 'pkg/codegen/testing'
PULUMI_ACCEPT=true make install_sdk codegen_tests
git add -u 'pkg/codegen/testing' || true
git commit -m "[codegen] built and added added codegen_tests" || true

git checkout 'origin/main' 'providers'
make providers_all

for provider in `ls providers/*/ -d`; do
    echo adding $provider
    git add -u "$provider" > /dev/null || true
    git commit -m "[codegen] built and added added $provider" || true
done;

git push --set-upstream origin "$codegen_branch"
git checkout "$base_branch"