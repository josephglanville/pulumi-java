// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the parameters for the origin group override action.
 * 
 */
public final class OriginGroupOverrideActionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final OriginGroupOverrideActionParametersResponse Empty = new OriginGroupOverrideActionParametersResponse();

    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * defines the OriginGroup that would override the DefaultOriginGroup.
     * 
     */
    @InputImport(name="originGroup", required=true)
      private final ResourceReferenceResponse originGroup;

    public ResourceReferenceResponse getOriginGroup() {
        return this.originGroup;
    }

    public OriginGroupOverrideActionParametersResponse(
        String odataType,
        ResourceReferenceResponse originGroup) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.originGroup = Objects.requireNonNull(originGroup, "expected parameter 'originGroup' to be non-null");
    }

    private OriginGroupOverrideActionParametersResponse() {
        this.odataType = null;
        this.originGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginGroupOverrideActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private ResourceReferenceResponse originGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginGroupOverrideActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.originGroup = defaults.originGroup;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOriginGroup(ResourceReferenceResponse originGroup) {
            this.originGroup = Objects.requireNonNull(originGroup);
            return this;
        }
        public OriginGroupOverrideActionParametersResponse build() {
            return new OriginGroupOverrideActionParametersResponse(odataType, originGroup);
        }
    }
}
