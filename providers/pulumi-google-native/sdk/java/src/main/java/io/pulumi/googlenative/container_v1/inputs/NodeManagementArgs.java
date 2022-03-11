// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.AutoUpgradeOptionsArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NodeManagement defines the set of node management services turned on for the node pool.
 * 
 */
public final class NodeManagementArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeManagementArgs Empty = new NodeManagementArgs();

    /**
     * A flag that specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many times, an automatic repair action will be triggered.
     * 
     */
    @InputImport(name="autoRepair")
      private final @Nullable Output<Boolean> autoRepair;

    public Output<Boolean> getAutoRepair() {
        return this.autoRepair == null ? Output.empty() : this.autoRepair;
    }

    /**
     * A flag that specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release version of Kubernetes.
     * 
     */
    @InputImport(name="autoUpgrade")
      private final @Nullable Output<Boolean> autoUpgrade;

    public Output<Boolean> getAutoUpgrade() {
        return this.autoUpgrade == null ? Output.empty() : this.autoUpgrade;
    }

    /**
     * Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    @InputImport(name="upgradeOptions")
      private final @Nullable Output<AutoUpgradeOptionsArgs> upgradeOptions;

    public Output<AutoUpgradeOptionsArgs> getUpgradeOptions() {
        return this.upgradeOptions == null ? Output.empty() : this.upgradeOptions;
    }

    public NodeManagementArgs(
        @Nullable Output<Boolean> autoRepair,
        @Nullable Output<Boolean> autoUpgrade,
        @Nullable Output<AutoUpgradeOptionsArgs> upgradeOptions) {
        this.autoRepair = autoRepair;
        this.autoUpgrade = autoUpgrade;
        this.upgradeOptions = upgradeOptions;
    }

    private NodeManagementArgs() {
        this.autoRepair = Output.empty();
        this.autoUpgrade = Output.empty();
        this.upgradeOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoRepair;
        private @Nullable Output<Boolean> autoUpgrade;
        private @Nullable Output<AutoUpgradeOptionsArgs> upgradeOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeManagementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
    	      this.upgradeOptions = defaults.upgradeOptions;
        }

        public Builder autoRepair(@Nullable Output<Boolean> autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }

        public Builder autoRepair(@Nullable Boolean autoRepair) {
            this.autoRepair = Output.ofNullable(autoRepair);
            return this;
        }

        public Builder autoUpgrade(@Nullable Output<Boolean> autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }

        public Builder autoUpgrade(@Nullable Boolean autoUpgrade) {
            this.autoUpgrade = Output.ofNullable(autoUpgrade);
            return this;
        }

        public Builder upgradeOptions(@Nullable Output<AutoUpgradeOptionsArgs> upgradeOptions) {
            this.upgradeOptions = upgradeOptions;
            return this;
        }

        public Builder upgradeOptions(@Nullable AutoUpgradeOptionsArgs upgradeOptions) {
            this.upgradeOptions = Output.ofNullable(upgradeOptions);
            return this;
        }
        public NodeManagementArgs build() {
            return new NodeManagementArgs(autoRepair, autoUpgrade, upgradeOptions);
        }
    }
}
