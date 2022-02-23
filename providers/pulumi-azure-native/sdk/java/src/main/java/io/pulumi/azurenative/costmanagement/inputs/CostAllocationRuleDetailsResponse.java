// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.SourceCostAllocationResourceResponse;
import io.pulumi.azurenative.costmanagement.inputs.TargetCostAllocationResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource details of the cost allocation rule
 * 
 */
public final class CostAllocationRuleDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CostAllocationRuleDetailsResponse Empty = new CostAllocationRuleDetailsResponse();

    /**
     * Source resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    @InputImport(name="sourceResources")
      private final @Nullable List<SourceCostAllocationResourceResponse> sourceResources;

    public List<SourceCostAllocationResourceResponse> getSourceResources() {
        return this.sourceResources == null ? List.of() : this.sourceResources;
    }

    /**
     * Target resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    @InputImport(name="targetResources")
      private final @Nullable List<TargetCostAllocationResourceResponse> targetResources;

    public List<TargetCostAllocationResourceResponse> getTargetResources() {
        return this.targetResources == null ? List.of() : this.targetResources;
    }

    public CostAllocationRuleDetailsResponse(
        @Nullable List<SourceCostAllocationResourceResponse> sourceResources,
        @Nullable List<TargetCostAllocationResourceResponse> targetResources) {
        this.sourceResources = sourceResources;
        this.targetResources = targetResources;
    }

    private CostAllocationRuleDetailsResponse() {
        this.sourceResources = List.of();
        this.targetResources = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostAllocationRuleDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SourceCostAllocationResourceResponse> sourceResources;
        private @Nullable List<TargetCostAllocationResourceResponse> targetResources;

        public Builder() {
    	      // Empty
        }

        public Builder(CostAllocationRuleDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceResources = defaults.sourceResources;
    	      this.targetResources = defaults.targetResources;
        }

        public Builder setSourceResources(@Nullable List<SourceCostAllocationResourceResponse> sourceResources) {
            this.sourceResources = sourceResources;
            return this;
        }

        public Builder setTargetResources(@Nullable List<TargetCostAllocationResourceResponse> targetResources) {
            this.targetResources = targetResources;
            return this;
        }
        public CostAllocationRuleDetailsResponse build() {
            return new CostAllocationRuleDetailsResponse(sourceResources, targetResources);
        }
    }
}
