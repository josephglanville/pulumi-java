// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.enums.TokenStatus;
import io.pulumi.azurenative.containerregistry.inputs.TokenCredentialsPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final TokenArgs Empty = new TokenArgs();

    @InputImport(name="credentials")
    private final @Nullable Input<TokenCredentialsPropertiesArgs> credentials;

    public Input<TokenCredentialsPropertiesArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    @InputImport(name="registryName", required=true)
    private final Input<String> registryName;

    public Input<String> getRegistryName() {
        return this.registryName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="scopeMapId")
    private final @Nullable Input<String> scopeMapId;

    public Input<String> getScopeMapId() {
        return this.scopeMapId == null ? Input.empty() : this.scopeMapId;
    }

    @InputImport(name="status")
    private final @Nullable Input<Either<String,TokenStatus>> status;

    public Input<Either<String,TokenStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="tokenName")
    private final @Nullable Input<String> tokenName;

    public Input<String> getTokenName() {
        return this.tokenName == null ? Input.empty() : this.tokenName;
    }

    public TokenArgs(
        @Nullable Input<TokenCredentialsPropertiesArgs> credentials,
        Input<String> registryName,
        Input<String> resourceGroupName,
        @Nullable Input<String> scopeMapId,
        @Nullable Input<Either<String,TokenStatus>> status,
        @Nullable Input<String> tokenName) {
        this.credentials = credentials;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scopeMapId = scopeMapId;
        this.status = status;
        this.tokenName = tokenName;
    }

    private TokenArgs() {
        this.credentials = Input.empty();
        this.registryName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scopeMapId = Input.empty();
        this.status = Input.empty();
        this.tokenName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TokenCredentialsPropertiesArgs> credentials;
        private Input<String> registryName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> scopeMapId;
        private @Nullable Input<Either<String,TokenStatus>> status;
        private @Nullable Input<String> tokenName;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeMapId = defaults.scopeMapId;
    	      this.status = defaults.status;
    	      this.tokenName = defaults.tokenName;
        }

        public Builder setCredentials(@Nullable Input<TokenCredentialsPropertiesArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable TokenCredentialsPropertiesArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setRegistryName(Input<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Input.of(Objects.requireNonNull(registryName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScopeMapId(@Nullable Input<String> scopeMapId) {
            this.scopeMapId = scopeMapId;
            return this;
        }

        public Builder setScopeMapId(@Nullable String scopeMapId) {
            this.scopeMapId = Input.ofNullable(scopeMapId);
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,TokenStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,TokenStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTokenName(@Nullable Input<String> tokenName) {
            this.tokenName = tokenName;
            return this;
        }

        public Builder setTokenName(@Nullable String tokenName) {
            this.tokenName = Input.ofNullable(tokenName);
            return this;
        }

        public TokenArgs build() {
            return new TokenArgs(credentials, registryName, resourceGroupName, scopeMapId, status, tokenName);
        }
    }
}
