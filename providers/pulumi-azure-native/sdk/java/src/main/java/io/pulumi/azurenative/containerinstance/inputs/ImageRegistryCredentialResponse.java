// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageRegistryCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageRegistryCredentialResponse Empty = new ImageRegistryCredentialResponse();

    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    @InputImport(name="server", required=true)
    private final String server;

    public String getServer() {
        return this.server;
    }

    @InputImport(name="username", required=true)
    private final String username;

    public String getUsername() {
        return this.username;
    }

    public ImageRegistryCredentialResponse(
        @Nullable String password,
        String server,
        String username) {
        this.password = password;
        this.server = Objects.requireNonNull(server, "expected parameter 'server' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private ImageRegistryCredentialResponse() {
        this.password = null;
        this.server = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRegistryCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String server;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRegistryCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setServer(String server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public ImageRegistryCredentialResponse build() {
            return new ImageRegistryCredentialResponse(password, server, username);
        }
    }
}
