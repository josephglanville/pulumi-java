// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationServiceGitRepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationServiceGitRepositoryResponse Empty = new ConfigurationServiceGitRepositoryResponse();

    @InputImport(name="hostKey")
    private final @Nullable String hostKey;

    public Optional<String> getHostKey() {
        return this.hostKey == null ? Optional.empty() : Optional.ofNullable(this.hostKey);
    }

    @InputImport(name="hostKeyAlgorithm")
    private final @Nullable String hostKeyAlgorithm;

    public Optional<String> getHostKeyAlgorithm() {
        return this.hostKeyAlgorithm == null ? Optional.empty() : Optional.ofNullable(this.hostKeyAlgorithm);
    }

    @InputImport(name="label", required=true)
    private final String label;

    public String getLabel() {
        return this.label;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    @InputImport(name="patterns", required=true)
    private final List<String> patterns;

    public List<String> getPatterns() {
        return this.patterns;
    }

    @InputImport(name="privateKey")
    private final @Nullable String privateKey;

    public Optional<String> getPrivateKey() {
        return this.privateKey == null ? Optional.empty() : Optional.ofNullable(this.privateKey);
    }

    @InputImport(name="searchPaths")
    private final @Nullable List<String> searchPaths;

    public List<String> getSearchPaths() {
        return this.searchPaths == null ? List.of() : this.searchPaths;
    }

    @InputImport(name="strictHostKeyChecking")
    private final @Nullable Boolean strictHostKeyChecking;

    public Optional<Boolean> getStrictHostKeyChecking() {
        return this.strictHostKeyChecking == null ? Optional.empty() : Optional.ofNullable(this.strictHostKeyChecking);
    }

    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    @InputImport(name="username")
    private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public ConfigurationServiceGitRepositoryResponse(
        @Nullable String hostKey,
        @Nullable String hostKeyAlgorithm,
        String label,
        String name,
        @Nullable String password,
        List<String> patterns,
        @Nullable String privateKey,
        @Nullable List<String> searchPaths,
        @Nullable Boolean strictHostKeyChecking,
        String uri,
        @Nullable String username) {
        this.hostKey = hostKey;
        this.hostKeyAlgorithm = hostKeyAlgorithm;
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.password = password;
        this.patterns = Objects.requireNonNull(patterns, "expected parameter 'patterns' to be non-null");
        this.privateKey = privateKey;
        this.searchPaths = searchPaths;
        this.strictHostKeyChecking = strictHostKeyChecking;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = username;
    }

    private ConfigurationServiceGitRepositoryResponse() {
        this.hostKey = null;
        this.hostKeyAlgorithm = null;
        this.label = null;
        this.name = null;
        this.password = null;
        this.patterns = List.of();
        this.privateKey = null;
        this.searchPaths = List.of();
        this.strictHostKeyChecking = null;
        this.uri = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceGitRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostKey;
        private @Nullable String hostKeyAlgorithm;
        private String label;
        private String name;
        private @Nullable String password;
        private List<String> patterns;
        private @Nullable String privateKey;
        private @Nullable List<String> searchPaths;
        private @Nullable Boolean strictHostKeyChecking;
        private String uri;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceGitRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostKey = defaults.hostKey;
    	      this.hostKeyAlgorithm = defaults.hostKeyAlgorithm;
    	      this.label = defaults.label;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.patterns = defaults.patterns;
    	      this.privateKey = defaults.privateKey;
    	      this.searchPaths = defaults.searchPaths;
    	      this.strictHostKeyChecking = defaults.strictHostKeyChecking;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder setHostKey(@Nullable String hostKey) {
            this.hostKey = hostKey;
            return this;
        }

        public Builder setHostKeyAlgorithm(@Nullable String hostKeyAlgorithm) {
            this.hostKeyAlgorithm = hostKeyAlgorithm;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setPatterns(List<String> patterns) {
            this.patterns = Objects.requireNonNull(patterns);
            return this;
        }

        public Builder setPrivateKey(@Nullable String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder setSearchPaths(@Nullable List<String> searchPaths) {
            this.searchPaths = searchPaths;
            return this;
        }

        public Builder setStrictHostKeyChecking(@Nullable Boolean strictHostKeyChecking) {
            this.strictHostKeyChecking = strictHostKeyChecking;
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public ConfigurationServiceGitRepositoryResponse build() {
            return new ConfigurationServiceGitRepositoryResponse(hostKey, hostKeyAlgorithm, label, name, password, patterns, privateKey, searchPaths, strictHostKeyChecking, uri, username);
        }
    }
}
