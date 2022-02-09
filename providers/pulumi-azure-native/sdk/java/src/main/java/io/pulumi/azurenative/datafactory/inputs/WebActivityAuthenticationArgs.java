// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebActivityAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebActivityAuthenticationArgs Empty = new WebActivityAuthenticationArgs();

    @InputImport(name="credential")
    private final @Nullable Input<CredentialReferenceArgs> credential;

    public Input<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Input.empty() : this.credential;
    }

    @InputImport(name="password")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="pfx")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPfx() {
        return this.pfx == null ? Input.empty() : this.pfx;
    }

    @InputImport(name="resource")
    private final @Nullable Input<Object> resource;

    public Input<Object> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="userTenant")
    private final @Nullable Input<Object> userTenant;

    public Input<Object> getUserTenant() {
        return this.userTenant == null ? Input.empty() : this.userTenant;
    }

    @InputImport(name="username")
    private final @Nullable Input<Object> username;

    public Input<Object> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public WebActivityAuthenticationArgs(
        @Nullable Input<CredentialReferenceArgs> credential,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx,
        @Nullable Input<Object> resource,
        @Nullable Input<String> type,
        @Nullable Input<Object> userTenant,
        @Nullable Input<Object> username) {
        this.credential = credential;
        this.password = password;
        this.pfx = pfx;
        this.resource = resource;
        this.type = type;
        this.userTenant = userTenant;
        this.username = username;
    }

    private WebActivityAuthenticationArgs() {
        this.credential = Input.empty();
        this.password = Input.empty();
        this.pfx = Input.empty();
        this.resource = Input.empty();
        this.type = Input.empty();
        this.userTenant = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebActivityAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CredentialReferenceArgs> credential;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx;
        private @Nullable Input<Object> resource;
        private @Nullable Input<String> type;
        private @Nullable Input<Object> userTenant;
        private @Nullable Input<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(WebActivityAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.password = defaults.password;
    	      this.pfx = defaults.pfx;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
    	      this.userTenant = defaults.userTenant;
    	      this.username = defaults.username;
        }

        public Builder setCredential(@Nullable Input<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Input.ofNullable(credential);
            return this;
        }

        public Builder setPassword(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setPfx(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx) {
            this.pfx = pfx;
            return this;
        }

        public Builder setPfx(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> pfx) {
            this.pfx = Input.ofNullable(pfx);
            return this;
        }

        public Builder setResource(@Nullable Input<Object> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable Object resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserTenant(@Nullable Input<Object> userTenant) {
            this.userTenant = userTenant;
            return this;
        }

        public Builder setUserTenant(@Nullable Object userTenant) {
            this.userTenant = Input.ofNullable(userTenant);
            return this;
        }

        public Builder setUsername(@Nullable Input<Object> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public WebActivityAuthenticationArgs build() {
            return new WebActivityAuthenticationArgs(credential, password, pfx, resource, type, userTenant, username);
        }
    }
}
