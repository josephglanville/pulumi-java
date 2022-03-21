// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceAccessPolicyEntryResponse {
    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    private final String objectId;

    @CustomType.Constructor
    private ServiceAccessPolicyEntryResponse(@CustomType.Parameter("objectId") String objectId) {
        this.objectId = objectId;
    }

    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
    */
    public String getObjectId() {
        return this.objectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccessPolicyEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccessPolicyEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }        public ServiceAccessPolicyEntryResponse build() {
            return new ServiceAccessPolicyEntryResponse(objectId);
        }
    }
}
