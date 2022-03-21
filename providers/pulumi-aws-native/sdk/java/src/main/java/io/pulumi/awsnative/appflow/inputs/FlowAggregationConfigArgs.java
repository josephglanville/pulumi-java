// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowAggregationType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowAggregationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowAggregationConfigArgs Empty = new FlowAggregationConfigArgs();

    @Import(name="aggregationType")
      private final @Nullable Output<FlowAggregationType> aggregationType;

    public Output<FlowAggregationType> getAggregationType() {
        return this.aggregationType == null ? Output.empty() : this.aggregationType;
    }

    public FlowAggregationConfigArgs(@Nullable Output<FlowAggregationType> aggregationType) {
        this.aggregationType = aggregationType;
    }

    private FlowAggregationConfigArgs() {
        this.aggregationType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAggregationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowAggregationType> aggregationType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAggregationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationType = defaults.aggregationType;
        }

        public Builder aggregationType(@Nullable Output<FlowAggregationType> aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }
        public Builder aggregationType(@Nullable FlowAggregationType aggregationType) {
            this.aggregationType = Output.ofNullable(aggregationType);
            return this;
        }        public FlowAggregationConfigArgs build() {
            return new FlowAggregationConfigArgs(aggregationType);
        }
    }
}
