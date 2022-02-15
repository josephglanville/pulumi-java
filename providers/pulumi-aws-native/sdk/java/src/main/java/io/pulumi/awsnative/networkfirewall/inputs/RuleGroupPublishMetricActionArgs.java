// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupDimensionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupPublishMetricActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupPublishMetricActionArgs Empty = new RuleGroupPublishMetricActionArgs();

    @InputImport(name="dimensions", required=true)
    private final Input<List<RuleGroupDimensionArgs>> dimensions;

    public Input<List<RuleGroupDimensionArgs>> getDimensions() {
        return this.dimensions;
    }

    public RuleGroupPublishMetricActionArgs(Input<List<RuleGroupDimensionArgs>> dimensions) {
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
    }

    private RuleGroupPublishMetricActionArgs() {
        this.dimensions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupPublishMetricActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RuleGroupDimensionArgs>> dimensions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupPublishMetricActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
        }

        public Builder setDimensions(Input<List<RuleGroupDimensionArgs>> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }

        public Builder setDimensions(List<RuleGroupDimensionArgs> dimensions) {
            this.dimensions = Input.of(Objects.requireNonNull(dimensions));
            return this;
        }

        public RuleGroupPublishMetricActionArgs build() {
            return new RuleGroupPublishMetricActionArgs(dimensions);
        }
    }
}