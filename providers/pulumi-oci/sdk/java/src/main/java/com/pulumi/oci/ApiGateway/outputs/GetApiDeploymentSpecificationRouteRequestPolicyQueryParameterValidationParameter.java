// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApiDeploymentSpecificationRouteRequestPolicyQueryParameterValidationParameter {
    /**
     * @return The case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    private final String name;
    /**
     * @return Determines if the parameter is required in the request.
     * 
     */
    private final Boolean required;

    @CustomType.Constructor
    private GetApiDeploymentSpecificationRouteRequestPolicyQueryParameterValidationParameter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("required") Boolean required) {
        this.name = name;
        this.required = required;
    }

    /**
     * @return The case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Determines if the parameter is required in the request.
     * 
     */
    public Boolean required() {
        return this.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiDeploymentSpecificationRouteRequestPolicyQueryParameterValidationParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Boolean required;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiDeploymentSpecificationRouteRequestPolicyQueryParameterValidationParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.required = defaults.required;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder required(Boolean required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }        public GetApiDeploymentSpecificationRouteRequestPolicyQueryParameterValidationParameter build() {
            return new GetApiDeploymentSpecificationRouteRequestPolicyQueryParameterValidationParameter(name, required);
        }
    }
}
