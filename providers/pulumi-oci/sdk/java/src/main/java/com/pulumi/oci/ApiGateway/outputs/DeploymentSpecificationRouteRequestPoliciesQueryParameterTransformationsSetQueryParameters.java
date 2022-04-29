// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParameters {
    /**
     * @return (Updatable) The list of headers.
     * 
     */
    private final List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItem> items;

    @CustomType.Constructor
    private DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParameters(@CustomType.Parameter("items") List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItem> items) {
        this.items = items;
    }

    /**
     * @return (Updatable) The list of headers.
     * 
     */
    public List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItem... items) {
            return items(List.of(items));
        }        public DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParameters build() {
            return new DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParameters(items);
        }
    }
}
