// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationServiceGitRepositoryResponse {
    private final @Nullable String hostKey;
    private final @Nullable String hostKeyAlgorithm;
    private final String label;
    private final String name;
    private final @Nullable String password;
    private final List<String> patterns;
    private final @Nullable String privateKey;
    private final @Nullable List<String> searchPaths;
    private final @Nullable Boolean strictHostKeyChecking;
    private final String uri;
    private final @Nullable String username;

    @OutputCustomType.Constructor({"hostKey","hostKeyAlgorithm","label","name","password","patterns","privateKey","searchPaths","strictHostKeyChecking","uri","username"})
    private ConfigurationServiceGitRepositoryResponse(
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
        this.label = Objects.requireNonNull(label);
        this.name = Objects.requireNonNull(name);
        this.password = password;
        this.patterns = Objects.requireNonNull(patterns);
        this.privateKey = privateKey;
        this.searchPaths = searchPaths;
        this.strictHostKeyChecking = strictHostKeyChecking;
        this.uri = Objects.requireNonNull(uri);
        this.username = username;
    }

    public Optional<String> getHostKey() {
        return Optional.ofNullable(this.hostKey);
    }
    public Optional<String> getHostKeyAlgorithm() {
        return Optional.ofNullable(this.hostKeyAlgorithm);
    }
    public String getLabel() {
        return this.label;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public List<String> getPatterns() {
        return this.patterns;
    }
    public Optional<String> getPrivateKey() {
        return Optional.ofNullable(this.privateKey);
    }
    public List<String> getSearchPaths() {
        return this.searchPaths == null ? List.of() : this.searchPaths;
    }
    public Optional<Boolean> getStrictHostKeyChecking() {
        return Optional.ofNullable(this.strictHostKeyChecking);
    }
    public String getUri() {
        return this.uri;
    }
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
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