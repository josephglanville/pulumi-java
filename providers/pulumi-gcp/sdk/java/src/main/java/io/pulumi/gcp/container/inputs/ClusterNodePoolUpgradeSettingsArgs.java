// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterNodePoolUpgradeSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolUpgradeSettingsArgs Empty = new ClusterNodePoolUpgradeSettingsArgs();

    @InputImport(name="maxSurge", required=true)
      private final Input<Integer> maxSurge;

    public Input<Integer> getMaxSurge() {
        return this.maxSurge;
    }

    @InputImport(name="maxUnavailable", required=true)
      private final Input<Integer> maxUnavailable;

    public Input<Integer> getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public ClusterNodePoolUpgradeSettingsArgs(
        Input<Integer> maxSurge,
        Input<Integer> maxUnavailable) {
        this.maxSurge = Objects.requireNonNull(maxSurge, "expected parameter 'maxSurge' to be non-null");
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
    }

    private ClusterNodePoolUpgradeSettingsArgs() {
        this.maxSurge = Input.empty();
        this.maxUnavailable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolUpgradeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxSurge;
        private Input<Integer> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolUpgradeSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder setMaxSurge(Input<Integer> maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }

        public Builder setMaxSurge(Integer maxSurge) {
            this.maxSurge = Input.of(Objects.requireNonNull(maxSurge));
            return this;
        }

        public Builder setMaxUnavailable(Input<Integer> maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public Builder setMaxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Input.of(Objects.requireNonNull(maxUnavailable));
            return this;
        }
        public ClusterNodePoolUpgradeSettingsArgs build() {
            return new ClusterNodePoolUpgradeSettingsArgs(maxSurge, maxUnavailable);
        }
    }
}
