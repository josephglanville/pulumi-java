// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendProxyContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendProxyContractResponse Empty = new BackendProxyContractResponse();

    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    @InputImport(name="username")
    private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public BackendProxyContractResponse(
        @Nullable String password,
        String url,
        @Nullable String username) {
        this.password = password;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.username = username;
    }

    private BackendProxyContractResponse() {
        this.password = null;
        this.url = null;
        this.username = null;
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
