// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Volume details using the backup policy
 * 
 */
public final class VolumeBackupsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeBackupsArgs Empty = new VolumeBackupsArgs();

    /**
     * Total count of backups for volume
     * 
     */
    @InputImport(name="backupsCount")
      private final @Nullable Input<Integer> backupsCount;

    public Input<Integer> getBackupsCount() {
        return this.backupsCount == null ? Input.empty() : this.backupsCount;
    }

    /**
     * Policy enabled
     * 
     */
    @InputImport(name="policyEnabled")
      private final @Nullable Input<Boolean> policyEnabled;

    public Input<Boolean> getPolicyEnabled() {
        return this.policyEnabled == null ? Input.empty() : this.policyEnabled;
    }

    /**
     * Volume name
     * 
     */
    @InputImport(name="volumeName")
      private final @Nullable Input<String> volumeName;

    public Input<String> getVolumeName() {
        return this.volumeName == null ? Input.empty() : this.volumeName;
    }

    public VolumeBackupsArgs(
        @Nullable Input<Integer> backupsCount,
        @Nullable Input<Boolean> policyEnabled,
        @Nullable Input<String> volumeName) {
        this.backupsCount = backupsCount;
        this.policyEnabled = policyEnabled;
        this.volumeName = volumeName;
    }

    private VolumeBackupsArgs() {
        this.backupsCount = Input.empty();
        this.policyEnabled = Input.empty();
        this.volumeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeBackupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> backupsCount;
        private @Nullable Input<Boolean> policyEnabled;
        private @Nullable Input<String> volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeBackupsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupsCount = defaults.backupsCount;
    	      this.policyEnabled = defaults.policyEnabled;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setBackupsCount(@Nullable Input<Integer> backupsCount) {
            this.backupsCount = backupsCount;
            return this;
        }

        public Builder setBackupsCount(@Nullable Integer backupsCount) {
            this.backupsCount = Input.ofNullable(backupsCount);
            return this;
        }

        public Builder setPolicyEnabled(@Nullable Input<Boolean> policyEnabled) {
            this.policyEnabled = policyEnabled;
            return this;
        }

        public Builder setPolicyEnabled(@Nullable Boolean policyEnabled) {
            this.policyEnabled = Input.ofNullable(policyEnabled);
            return this;
        }

        public Builder setVolumeName(@Nullable Input<String> volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = Input.ofNullable(volumeName);
            return this;
        }
        public VolumeBackupsArgs build() {
            return new VolumeBackupsArgs(backupsCount, policyEnabled, volumeName);
        }
    }
}
