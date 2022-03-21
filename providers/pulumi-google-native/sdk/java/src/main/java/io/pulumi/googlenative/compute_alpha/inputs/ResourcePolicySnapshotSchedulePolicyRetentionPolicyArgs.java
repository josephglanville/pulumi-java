// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnPolicySwitch;
import io.pulumi.googlenative.compute_alpha.enums.ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Policy for retention of scheduled snapshots.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs Empty = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs();

    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    @Import(name="maxRetentionDays")
      private final @Nullable Output<Integer> maxRetentionDays;

    public Output<Integer> getMaxRetentionDays() {
        return this.maxRetentionDays == null ? Output.empty() : this.maxRetentionDays;
    }

    @Import(name="onPolicySwitch")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnPolicySwitch> onPolicySwitch;

    public Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnPolicySwitch> getOnPolicySwitch() {
        return this.onPolicySwitch == null ? Output.empty() : this.onPolicySwitch;
    }

    /**
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
     */
    @Import(name="onSourceDiskDelete")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete;

    public Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> getOnSourceDiskDelete() {
        return this.onSourceDiskDelete == null ? Output.empty() : this.onSourceDiskDelete;
    }

    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(
        @Nullable Output<Integer> maxRetentionDays,
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnPolicySwitch> onPolicySwitch,
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete) {
        this.maxRetentionDays = maxRetentionDays;
        this.onPolicySwitch = onPolicySwitch;
        this.onSourceDiskDelete = onSourceDiskDelete;
    }

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs() {
        this.maxRetentionDays = Output.empty();
        this.onPolicySwitch = Output.empty();
        this.onSourceDiskDelete = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxRetentionDays;
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnPolicySwitch> onPolicySwitch;
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.onPolicySwitch = defaults.onPolicySwitch;
    	      this.onSourceDiskDelete = defaults.onSourceDiskDelete;
        }

        public Builder maxRetentionDays(@Nullable Output<Integer> maxRetentionDays) {
            this.maxRetentionDays = maxRetentionDays;
            return this;
        }
        public Builder maxRetentionDays(@Nullable Integer maxRetentionDays) {
            this.maxRetentionDays = Output.ofNullable(maxRetentionDays);
            return this;
        }
        public Builder onPolicySwitch(@Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnPolicySwitch> onPolicySwitch) {
            this.onPolicySwitch = onPolicySwitch;
            return this;
        }
        public Builder onPolicySwitch(@Nullable ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnPolicySwitch onPolicySwitch) {
            this.onPolicySwitch = Output.ofNullable(onPolicySwitch);
            return this;
        }
        public Builder onSourceDiskDelete(@Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete) {
            this.onSourceDiskDelete = onSourceDiskDelete;
            return this;
        }
        public Builder onSourceDiskDelete(@Nullable ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete onSourceDiskDelete) {
            this.onSourceDiskDelete = Output.ofNullable(onSourceDiskDelete);
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(maxRetentionDays, onPolicySwitch, onSourceDiskDelete);
        }
    }
}
