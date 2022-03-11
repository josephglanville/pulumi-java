// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerVersionTargetSizeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerVersionTargetSizeArgs Empty = new RegionInstanceGroupManagerVersionTargetSizeArgs();

    /**
     * , The number of instances which are managed for this version. Conflicts with `percent`.
     * 
     */
    @InputImport(name="fixed")
      private final @Nullable Output<Integer> fixed;

    public Output<Integer> getFixed() {
        return this.fixed == null ? Output.empty() : this.fixed;
    }

    /**
     * , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
     * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
     * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
     * 
     */
    @InputImport(name="percent")
      private final @Nullable Output<Integer> percent;

    public Output<Integer> getPercent() {
        return this.percent == null ? Output.empty() : this.percent;
    }

    public RegionInstanceGroupManagerVersionTargetSizeArgs(
        @Nullable Output<Integer> fixed,
        @Nullable Output<Integer> percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    private RegionInstanceGroupManagerVersionTargetSizeArgs() {
        this.fixed = Output.empty();
        this.percent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerVersionTargetSizeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> fixed;
        private @Nullable Output<Integer> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerVersionTargetSizeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(@Nullable Output<Integer> fixed) {
            this.fixed = fixed;
            return this;
        }

        public Builder fixed(@Nullable Integer fixed) {
            this.fixed = Output.ofNullable(fixed);
            return this;
        }

        public Builder percent(@Nullable Output<Integer> percent) {
            this.percent = percent;
            return this;
        }

        public Builder percent(@Nullable Integer percent) {
            this.percent = Output.ofNullable(percent);
            return this;
        }
        public RegionInstanceGroupManagerVersionTargetSizeArgs build() {
            return new RegionInstanceGroupManagerVersionTargetSizeArgs(fixed, percent);
        }
    }
}
