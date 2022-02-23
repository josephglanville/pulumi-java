// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulPerInstanceConfigArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatusStatefulArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatusStatefulArgs Empty = new InstanceGroupManagerStatusStatefulArgs();

    /**
     * A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * 
     */
    @InputImport(name="hasStatefulConfig")
      private final @Nullable Input<Boolean> hasStatefulConfig;

    public Input<Boolean> getHasStatefulConfig() {
        return this.hasStatefulConfig == null ? Input.empty() : this.hasStatefulConfig;
    }

    /**
     * Status of per-instance configs on the instance.
     * 
     */
    @InputImport(name="perInstanceConfigs")
      private final @Nullable Input<List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs;

    public Input<List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> getPerInstanceConfigs() {
        return this.perInstanceConfigs == null ? Input.empty() : this.perInstanceConfigs;
    }

    public InstanceGroupManagerStatusStatefulArgs(
        @Nullable Input<Boolean> hasStatefulConfig,
        @Nullable Input<List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs) {
        this.hasStatefulConfig = hasStatefulConfig;
        this.perInstanceConfigs = perInstanceConfigs;
    }

    private InstanceGroupManagerStatusStatefulArgs() {
        this.hasStatefulConfig = Input.empty();
        this.perInstanceConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusStatefulArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> hasStatefulConfig;
        private @Nullable Input<List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusStatefulArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasStatefulConfig = defaults.hasStatefulConfig;
    	      this.perInstanceConfigs = defaults.perInstanceConfigs;
        }

        public Builder setHasStatefulConfig(@Nullable Input<Boolean> hasStatefulConfig) {
            this.hasStatefulConfig = hasStatefulConfig;
            return this;
        }

        public Builder setHasStatefulConfig(@Nullable Boolean hasStatefulConfig) {
            this.hasStatefulConfig = Input.ofNullable(hasStatefulConfig);
            return this;
        }

        public Builder setPerInstanceConfigs(@Nullable Input<List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs) {
            this.perInstanceConfigs = perInstanceConfigs;
            return this;
        }

        public Builder setPerInstanceConfigs(@Nullable List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs> perInstanceConfigs) {
            this.perInstanceConfigs = Input.ofNullable(perInstanceConfigs);
            return this;
        }
        public InstanceGroupManagerStatusStatefulArgs build() {
            return new InstanceGroupManagerStatusStatefulArgs(hasStatefulConfig, perInstanceConfigs);
        }
    }
}
