// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.MetricDimensionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The metric counter
 * 
 */
public final class MetricCounterArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricCounterArgs Empty = new MetricCounterArgs();

    /**
     * The additional dimensions to be added to metric.
     * 
     */
    @Import(name="additionalDimensions")
      private final @Nullable Output<List<MetricDimensionArgs>> additionalDimensions;

    public Output<List<MetricDimensionArgs>> getAdditionalDimensions() {
        return this.additionalDimensions == null ? Output.empty() : this.additionalDimensions;
    }

    /**
     * The dimension filter.
     * 
     */
    @Import(name="dimensionFilter")
      private final @Nullable Output<List<MetricDimensionArgs>> dimensionFilter;

    public Output<List<MetricDimensionArgs>> getDimensionFilter() {
        return this.dimensionFilter == null ? Output.empty() : this.dimensionFilter;
    }

    /**
     * The instance from which counter should be collected.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> getInstance() {
        return this.instance == null ? Output.empty() : this.instance;
    }

    /**
     * The counter name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public MetricCounterArgs(
        @Nullable Output<List<MetricDimensionArgs>> additionalDimensions,
        @Nullable Output<List<MetricDimensionArgs>> dimensionFilter,
        @Nullable Output<String> instance,
        Output<String> name) {
        this.additionalDimensions = additionalDimensions;
        this.dimensionFilter = dimensionFilter;
        this.instance = instance;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private MetricCounterArgs() {
        this.additionalDimensions = Output.empty();
        this.dimensionFilter = Output.empty();
        this.instance = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricCounterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<MetricDimensionArgs>> additionalDimensions;
        private @Nullable Output<List<MetricDimensionArgs>> dimensionFilter;
        private @Nullable Output<String> instance;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricCounterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDimensions = defaults.additionalDimensions;
    	      this.dimensionFilter = defaults.dimensionFilter;
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
        }

        public Builder additionalDimensions(@Nullable Output<List<MetricDimensionArgs>> additionalDimensions) {
            this.additionalDimensions = additionalDimensions;
            return this;
        }
        public Builder additionalDimensions(@Nullable List<MetricDimensionArgs> additionalDimensions) {
            this.additionalDimensions = Output.ofNullable(additionalDimensions);
            return this;
        }
        public Builder additionalDimensions(MetricDimensionArgs... additionalDimensions) {
            return additionalDimensions(List.of(additionalDimensions));
        }
        public Builder dimensionFilter(@Nullable Output<List<MetricDimensionArgs>> dimensionFilter) {
            this.dimensionFilter = dimensionFilter;
            return this;
        }
        public Builder dimensionFilter(@Nullable List<MetricDimensionArgs> dimensionFilter) {
            this.dimensionFilter = Output.ofNullable(dimensionFilter);
            return this;
        }
        public Builder dimensionFilter(MetricDimensionArgs... dimensionFilter) {
            return dimensionFilter(List.of(dimensionFilter));
        }
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Output.ofNullable(instance);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public MetricCounterArgs build() {
            return new MetricCounterArgs(additionalDimensions, dimensionFilter, instance, name);
        }
    }
}
