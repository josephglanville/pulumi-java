// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The role based access control (RBAC) authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeRbacAuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkedIntegrationRuntimeRbacAuthorizationResponse Empty = new LinkedIntegrationRuntimeRbacAuthorizationResponse();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is 'RBAC'.
     * 
     */
    @Import(name="authorizationType", required=true)
      private final String authorizationType;

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * The resource identifier of the integration runtime to be shared.
     * 
     */
    @Import(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    public LinkedIntegrationRuntimeRbacAuthorizationResponse(
        String authorizationType,
        String resourceId) {
        this.authorizationType = Objects.requireNonNull(authorizationType, "expected parameter 'authorizationType' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private LinkedIntegrationRuntimeRbacAuthorizationResponse() {
        this.authorizationType = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationType;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }        public LinkedIntegrationRuntimeRbacAuthorizationResponse build() {
            return new LinkedIntegrationRuntimeRbacAuthorizationResponse(authorizationType, resourceId);
        }
    }
}
