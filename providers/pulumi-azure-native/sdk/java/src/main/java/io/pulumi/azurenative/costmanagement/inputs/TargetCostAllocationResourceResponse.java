// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.CostAllocationProportionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Target resources for cost allocation.
 * 
 */
public final class TargetCostAllocationResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final TargetCostAllocationResourceResponse Empty = new TargetCostAllocationResourceResponse();

    /**
     * If resource type is dimension, this must be either ResourceGroupName or SubscriptionId. If resource type is tag, this must be a valid Azure tag
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Method of cost allocation for the rule
     * 
     */
    @Import(name="policyType", required=true)
      private final String policyType;

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * Type of resources contained in this cost allocation rule
     * 
     */
    @Import(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Target resources for cost allocation. This list cannot contain more than 25 values.
     * 
     */
    @Import(name="values", required=true)
      private final List<CostAllocationProportionResponse> values;

    public List<CostAllocationProportionResponse> getValues() {
        return this.values;
    }

    public TargetCostAllocationResourceResponse(
        String name,
        String policyType,
        String resourceType,
        List<CostAllocationProportionResponse> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policyType = Objects.requireNonNull(policyType, "expected parameter 'policyType' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private TargetCostAllocationResourceResponse() {
        this.name = null;
        this.policyType = null;
        this.resourceType = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetCostAllocationResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String policyType;
        private String resourceType;
        private List<CostAllocationProportionResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetCostAllocationResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policyType = defaults.policyType;
    	      this.resourceType = defaults.resourceType;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder values(List<CostAllocationProportionResponse> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(CostAllocationProportionResponse... values) {
            return values(List.of(values));
        }        public TargetCostAllocationResourceResponse build() {
            return new TargetCostAllocationResourceResponse(name, policyType, resourceType, values);
        }
    }
}
