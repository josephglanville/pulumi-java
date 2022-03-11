// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete;
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
    @InputImport(name="maxRetentionDays")
      private final @Nullable Output<Integer> maxRetentionDays;

    public Output<Integer> getMaxRetentionDays() {
        return this.maxRetentionDays == null ? Output.empty() : this.maxRetentionDays;
    }

    /**
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
     */
    @InputImport(name="onSourceDiskDelete")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete;

    public Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> getOnSourceDiskDelete() {
        return this.onSourceDiskDelete == null ? Output.empty() : this.onSourceDiskDelete;
    }

    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(
        @Nullable Output<Integer> maxRetentionDays,
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete) {
        this.maxRetentionDays = maxRetentionDays;
        this.onSourceDiskDelete = onSourceDiskDelete;
    }

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs() {
        this.maxRetentionDays = Output.empty();
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
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
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

        public Builder onSourceDiskDelete(@Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete) {
            this.onSourceDiskDelete = onSourceDiskDelete;
            return this;
        }

        public Builder onSourceDiskDelete(@Nullable ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete onSourceDiskDelete) {
            this.onSourceDiskDelete = Output.ofNullable(onSourceDiskDelete);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(maxRetentionDays, onSourceDiskDelete);
        }
    }
}
