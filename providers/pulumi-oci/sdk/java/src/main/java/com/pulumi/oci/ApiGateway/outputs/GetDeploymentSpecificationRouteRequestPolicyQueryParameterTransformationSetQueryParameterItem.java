// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationSetQueryParameterItem {
    /**
     * @return If a header with the same name already exists in the request, OVERWRITE will overwrite the value, APPEND will append to the existing value, or SKIP will keep the existing value.
     * 
     */
    private final String ifExists;
    /**
     * @return The case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    private final String name;
    /**
     * @return A list of new values.  Each value can be a constant or may include one or more expressions enclosed within ${} delimiters.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationSetQueryParameterItem(
        @CustomType.Parameter("ifExists") String ifExists,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("values") List<String> values) {
        this.ifExists = ifExists;
        this.name = name;
        this.values = values;
    }

    /**
     * @return If a header with the same name already exists in the request, OVERWRITE will overwrite the value, APPEND will append to the existing value, or SKIP will keep the existing value.
     * 
     */
    public String ifExists() {
        return this.ifExists;
    }
    /**
     * @return The case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of new values.  Each value can be a constant or may include one or more expressions enclosed within ${} delimiters.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationSetQueryParameterItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ifExists;
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationSetQueryParameterItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ifExists = defaults.ifExists;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder ifExists(String ifExists) {
            this.ifExists = Objects.requireNonNull(ifExists);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationSetQueryParameterItem build() {
            return new GetDeploymentSpecificationRouteRequestPolicyQueryParameterTransformationSetQueryParameterItem(ifExists, name, values);
        }
    }
}
