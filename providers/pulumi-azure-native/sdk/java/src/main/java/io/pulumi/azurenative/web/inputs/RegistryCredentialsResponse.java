// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final RegistryCredentialsResponse Empty = new RegistryCredentialsResponse();

    @InputImport(name="passwordSecretRef")
    private final @Nullable String passwordSecretRef;

    public Optional<String> getPasswordSecretRef() {
        return this.passwordSecretRef == null ? Optional.empty() : Optional.ofNullable(this.passwordSecretRef);
    }

    @InputImport(name="server")
    private final @Nullable String server;

    public Optional<String> getServer() {
        return this.server == null ? Optional.empty() : Optional.ofNullable(this.server);
    }

    @InputImport(name="username")
    private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public RegistryCredentialsResponse(
        @Nullable String passwordSecretRef,
        @Nullable String server,
        @Nullable String username) {
        this.passwordSecretRef = passwordSecretRef;
        this.server = server;
        this.username = username;
    }

    private RegistryCredentialsResponse() {
        this.passwordSecretRef = null;
        this.server = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String passwordSecretRef;
        private @Nullable String server;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordSecretRef = defaults.passwordSecretRef;
    	      this.server = defaults.server;
    	      this.username = defaults.username;
        }

        public Builder setPasswordSecretRef(@Nullable String passwordSecretRef) {
            this.passwordSecretRef = passwordSecretRef;
            return this;
        }

        public Builder setServer(@Nullable String server) {
            this.server = server;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public RegistryCredentialsResponse build() {
            return new RegistryCredentialsResponse(passwordSecretRef, server, username);
        }
    }
}
