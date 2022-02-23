// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker;

import io.pulumi.azurenative.servicelinker.enums.ClientType;
import io.pulumi.azurenative.servicelinker.inputs.SecretAuthInfoArgs;
import io.pulumi.azurenative.servicelinker.inputs.ServicePrincipalCertificateAuthInfoArgs;
import io.pulumi.azurenative.servicelinker.inputs.ServicePrincipalSecretAuthInfoArgs;
import io.pulumi.azurenative.servicelinker.inputs.SystemAssignedIdentityAuthInfoArgs;
import io.pulumi.azurenative.servicelinker.inputs.UserAssignedIdentityAuthInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkerArgs Empty = new LinkerArgs();

    /**
     * The authentication type.
     * 
     */
    @InputImport(name="authInfo")
      private final @Nullable Input<Object> authInfo;

    public Input<Object> getAuthInfo() {
        return this.authInfo == null ? Input.empty() : this.authInfo;
    }

    /**
     * The application client type
     * 
     */
    @InputImport(name="clientType")
      private final @Nullable Input<Either<String,ClientType>> clientType;

    public Input<Either<String,ClientType>> getClientType() {
        return this.clientType == null ? Input.empty() : this.clientType;
    }

    /**
     * The name Linker resource.
     * 
     */
    @InputImport(name="linkerName")
      private final @Nullable Input<String> linkerName;

    public Input<String> getLinkerName() {
        return this.linkerName == null ? Input.empty() : this.linkerName;
    }

    /**
     * The fully qualified Azure Resource manager identifier of the resource to be connected.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final Input<String> resourceUri;

    public Input<String> getResourceUri() {
        return this.resourceUri;
    }

    /**
     * The resource Id of target service.
     * 
     */
    @InputImport(name="targetId")
      private final @Nullable Input<String> targetId;

    public Input<String> getTargetId() {
        return this.targetId == null ? Input.empty() : this.targetId;
    }

    public LinkerArgs(
        @Nullable Input<Object> authInfo,
        @Nullable Input<Either<String,ClientType>> clientType,
        @Nullable Input<String> linkerName,
        Input<String> resourceUri,
        @Nullable Input<String> targetId) {
        this.authInfo = authInfo;
        this.clientType = clientType;
        this.linkerName = linkerName;
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
        this.targetId = targetId;
    }

    private LinkerArgs() {
        this.authInfo = Input.empty();
        this.clientType = Input.empty();
        this.linkerName = Input.empty();
        this.resourceUri = Input.empty();
        this.targetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> authInfo;
        private @Nullable Input<Either<String,ClientType>> clientType;
        private @Nullable Input<String> linkerName;
        private Input<String> resourceUri;
        private @Nullable Input<String> targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.clientType = defaults.clientType;
    	      this.linkerName = defaults.linkerName;
    	      this.resourceUri = defaults.resourceUri;
    	      this.targetId = defaults.targetId;
        }

        public Builder setAuthInfo(@Nullable Input<Object> authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        public Builder setAuthInfo(@Nullable Object authInfo) {
            this.authInfo = Input.ofNullable(authInfo);
            return this;
        }

        public Builder setClientType(@Nullable Input<Either<String,ClientType>> clientType) {
            this.clientType = clientType;
            return this;
        }

        public Builder setClientType(@Nullable Either<String,ClientType> clientType) {
            this.clientType = Input.ofNullable(clientType);
            return this;
        }

        public Builder setLinkerName(@Nullable Input<String> linkerName) {
            this.linkerName = linkerName;
            return this;
        }

        public Builder setLinkerName(@Nullable String linkerName) {
            this.linkerName = Input.ofNullable(linkerName);
            return this;
        }

        public Builder setResourceUri(Input<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Input.of(Objects.requireNonNull(resourceUri));
            return this;
        }

        public Builder setTargetId(@Nullable Input<String> targetId) {
            this.targetId = targetId;
            return this;
        }

        public Builder setTargetId(@Nullable String targetId) {
            this.targetId = Input.ofNullable(targetId);
            return this;
        }
        public LinkerArgs build() {
            return new LinkerArgs(authInfo, clientType, linkerName, resourceUri, targetId);
        }
    }
}
