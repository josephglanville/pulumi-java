// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusStatefulArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusStatefulArgs Empty = new RegionInstanceGroupManagerStatusStatefulArgs();

    /**
     * A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * 
     */
    @Import(name="hasStatefulConfig")
      private final @Nullable Output<Boolean> hasStatefulConfig;

    public Output<Boolean> getHasStatefulConfig() {
        return this.hasStatefulConfig == null ? Output.empty() : this.hasStatefulConfig;
    }

    /**
     * Status of per-instance configs on the instance.
     * 
     */
    @Import(name="perInstanceConfigs")
      private final @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs;

    public Output<List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> getPerInstanceConfigs() {
        return this.perInstanceConfigs == null ? Output.empty() : this.perInstanceConfigs;
    }

    public RegionInstanceGroupManagerStatusStatefulArgs(
        @Nullable Output<Boolean> hasStatefulConfig,
        @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs) {
        this.hasStatefulConfig = hasStatefulConfig;
        this.perInstanceConfigs = perInstanceConfigs;
    }

    private RegionInstanceGroupManagerStatusStatefulArgs() {
        this.hasStatefulConfig = Output.empty();
        this.perInstanceConfigs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatusStatefulArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> hasStatefulConfig;
        private @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatusStatefulArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasStatefulConfig = defaults.hasStatefulConfig;
    	      this.perInstanceConfigs = defaults.perInstanceConfigs;
        }

        public Builder hasStatefulConfig(@Nullable Output<Boolean> hasStatefulConfig) {
            this.hasStatefulConfig = hasStatefulConfig;
            return this;
        }
        public Builder hasStatefulConfig(@Nullable Boolean hasStatefulConfig) {
            this.hasStatefulConfig = Output.ofNullable(hasStatefulConfig);
            return this;
        }
        public Builder perInstanceConfigs(@Nullable Output<List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs) {
            this.perInstanceConfigs = perInstanceConfigs;
            return this;
        }
        public Builder perInstanceConfigs(@Nullable List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs> perInstanceConfigs) {
            this.perInstanceConfigs = Output.ofNullable(perInstanceConfigs);
            return this;
        }
        public Builder perInstanceConfigs(RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs... perInstanceConfigs) {
            return perInstanceConfigs(List.of(perInstanceConfigs));
        }        public RegionInstanceGroupManagerStatusStatefulArgs build() {
            return new RegionInstanceGroupManagerStatusStatefulArgs(hasStatefulConfig, perInstanceConfigs);
        }
    }
}
