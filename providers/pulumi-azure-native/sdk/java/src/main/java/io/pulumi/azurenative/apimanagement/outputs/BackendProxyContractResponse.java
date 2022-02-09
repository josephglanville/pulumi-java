// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackendProxyContractResponse {
    private final @Nullable String password;
    private final String url;
    private final @Nullable String username;

    @OutputCustomType.Constructor({"password","url","username"})
    private BackendProxyContractResponse(
        @Nullable String password,
        String url,
        @Nullable String username) {
        this.password = password;
        this.url = Objects.requireNonNull(url);
        this.username = username;
    }

    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public String getUrl() {
        return this.url;
    }
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendProxyContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendProxyContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public BackendProxyContractResponse build() {
            return new BackendProxyContractResponse(password, url, username);
        }
    }
}
