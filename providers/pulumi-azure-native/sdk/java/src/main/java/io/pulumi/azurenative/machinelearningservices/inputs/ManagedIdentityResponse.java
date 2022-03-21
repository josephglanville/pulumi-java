// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed identity configuration.
 * 
 */
public final class ManagedIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedIdentityResponse Empty = new ManagedIdentityResponse();

    /**
     * Specifies a user-assigned identity by client ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * Enum to determine identity framework.
     * Expected value is 'Managed'.
     * 
     */
    @Import(name="identityType", required=true)
      private final String identityType;

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * Specifies a user-assigned identity by object ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="objectId")
      private final @Nullable String objectId;

    public Optional<String> getObjectId() {
        return this.objectId == null ? Optional.empty() : Optional.ofNullable(this.objectId);
    }

    /**
     * Specifies a user-assigned identity by ARM resource ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public ManagedIdentityResponse(
        @Nullable String clientId,
        String identityType,
        @Nullable String objectId,
        @Nullable String resourceId) {
        this.clientId = clientId;
        this.identityType = Objects.requireNonNull(identityType, "expected parameter 'identityType' to be non-null");
        this.objectId = objectId;
        this.resourceId = resourceId;
    }

    private ManagedIdentityResponse() {
        this.clientId = null;
        this.identityType = null;
        this.objectId = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private String identityType;
        private @Nullable String objectId;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.identityType = defaults.identityType;
    	      this.objectId = defaults.objectId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder identityType(String identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public ManagedIdentityResponse build() {
            return new ManagedIdentityResponse(clientId, identityType, objectId, resourceId);
        }
    }
}
