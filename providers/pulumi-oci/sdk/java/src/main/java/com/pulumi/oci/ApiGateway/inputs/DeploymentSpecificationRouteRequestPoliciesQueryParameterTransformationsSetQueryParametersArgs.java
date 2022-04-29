// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ApiGateway.inputs.DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItemArgs;
import java.util.List;
import java.util.Objects;


public final class DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs Empty = new DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs();

    /**
     * (Updatable) The list of headers.
     * 
     */
    @Import(name="items", required=true)
    private Output<List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItemArgs>> items;

    /**
     * @return (Updatable) The list of headers.
     * 
     */
    public Output<List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItemArgs>> items() {
        return this.items;
    }

    private DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs() {}

    private DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs(DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs $;

        public Builder() {
            $ = new DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs();
        }

        public Builder(DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs defaults) {
            $ = new DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items (Updatable) The list of headers.
         * 
         * @return builder
         * 
         */
        public Builder items(Output<List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items (Updatable) The list of headers.
         * 
         * @return builder
         * 
         */
        public Builder items(List<DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items (Updatable) The list of headers.
         * 
         * @return builder
         * 
         */
        public Builder items(DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersItemArgs... items) {
            return items(List.of(items));
        }

        public DeploymentSpecificationRouteRequestPoliciesQueryParameterTransformationsSetQueryParametersArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
