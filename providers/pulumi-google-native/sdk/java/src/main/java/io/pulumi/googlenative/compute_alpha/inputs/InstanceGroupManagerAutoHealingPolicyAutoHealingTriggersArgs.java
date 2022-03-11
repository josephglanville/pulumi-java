// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs Empty = new InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs();

    /**
     * If you have configured an application-based health check for the group, this field controls whether to trigger VM autohealing based on a failed health check. Valid values are: - ON (default): The group recreates running VMs that fail the application-based health check. - OFF: When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
     * 
     */
    @InputImport(name="onHealthCheck")
      private final @Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck> onHealthCheck;

    public Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck> getOnHealthCheck() {
        return this.onHealthCheck == null ? Output.empty() : this.onHealthCheck;
    }

    public InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs(@Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck> onHealthCheck) {
        this.onHealthCheck = onHealthCheck;
    }

    private InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs() {
        this.onHealthCheck = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck> onHealthCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onHealthCheck = defaults.onHealthCheck;
        }

        public Builder onHealthCheck(@Nullable Output<InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck> onHealthCheck) {
            this.onHealthCheck = onHealthCheck;
            return this;
        }

        public Builder onHealthCheck(@Nullable InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck onHealthCheck) {
            this.onHealthCheck = Output.ofNullable(onHealthCheck);
            return this;
        }
        public InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs build() {
            return new InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersArgs(onHealthCheck);
        }
    }
}
