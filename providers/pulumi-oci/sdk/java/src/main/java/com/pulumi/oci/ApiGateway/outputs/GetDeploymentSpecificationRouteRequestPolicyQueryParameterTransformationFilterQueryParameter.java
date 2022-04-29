// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApiGateway.outputs.GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameterItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameter {
    /**
     * @return The list of headers.
     * 
     */
    private final List<GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameterItem> items;
    /**
     * @return Type of the Response Cache Store Policy.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameter(
        @CustomType.Parameter("items") List<GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameterItem> items,
        @CustomType.Parameter("type") String type) {
        this.items = items;
        this.type = type;
    }

    /**
     * @return The list of headers.
     * 
     */
    public List<GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameterItem> items() {
        return this.items;
    }
    /**
     * @return Type of the Response Cache Store Policy.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameterItem> items;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.type = defaults.type;
        }

        public Builder items(List<GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameterItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameterItem... items) {
            return items(List.of(items));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameter build() {
            return new GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationFilterQueryParameter(items, type);
        }
    }
}
