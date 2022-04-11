// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.azurenative.netapp.inputs.ReplicationObjectArgs;
import io.pulumi.azurenative.netapp.inputs.VolumeBackupPropertiesArgs;
import io.pulumi.azurenative.netapp.inputs.VolumeSnapshotPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DataProtection type volumes include an object containing details of the replication
 * 
 */
public final class VolumePropertiesDataProtectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumePropertiesDataProtectionArgs Empty = new VolumePropertiesDataProtectionArgs();

    /**
     * Backup Properties
     * 
     */
    @Import(name="backup")
      private final @Nullable Output<VolumeBackupPropertiesArgs> backup;

    public Output<VolumeBackupPropertiesArgs> getBackup() {
        return this.backup == null ? Codegen.empty() : this.backup;
    }

    /**
     * Replication properties
     * 
     */
    @Import(name="replication")
      private final @Nullable Output<ReplicationObjectArgs> replication;

    public Output<ReplicationObjectArgs> getReplication() {
        return this.replication == null ? Codegen.empty() : this.replication;
    }

    /**
     * Snapshot properties.
     * 
     */
    @Import(name="snapshot")
      private final @Nullable Output<VolumeSnapshotPropertiesArgs> snapshot;

    public Output<VolumeSnapshotPropertiesArgs> getSnapshot() {
        return this.snapshot == null ? Codegen.empty() : this.snapshot;
    }

    public VolumePropertiesDataProtectionArgs(
        @Nullable Output<VolumeBackupPropertiesArgs> backup,
        @Nullable Output<ReplicationObjectArgs> replication,
        @Nullable Output<VolumeSnapshotPropertiesArgs> snapshot) {
        this.backup = backup;
        this.replication = replication;
        this.snapshot = snapshot;
    }

    private VolumePropertiesDataProtectionArgs() {
        this.backup = Codegen.empty();
        this.replication = Codegen.empty();
        this.snapshot = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumePropertiesDataProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VolumeBackupPropertiesArgs> backup;
        private @Nullable Output<ReplicationObjectArgs> replication;
        private @Nullable Output<VolumeSnapshotPropertiesArgs> snapshot;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumePropertiesDataProtectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.replication = defaults.replication;
    	      this.snapshot = defaults.snapshot;
        }

        public Builder backup(@Nullable Output<VolumeBackupPropertiesArgs> backup) {
            this.backup = backup;
            return this;
        }
        public Builder backup(@Nullable VolumeBackupPropertiesArgs backup) {
            this.backup = Codegen.ofNullable(backup);
            return this;
        }
        public Builder replication(@Nullable Output<ReplicationObjectArgs> replication) {
            this.replication = replication;
            return this;
        }
        public Builder replication(@Nullable ReplicationObjectArgs replication) {
            this.replication = Codegen.ofNullable(replication);
            return this;
        }
        public Builder snapshot(@Nullable Output<VolumeSnapshotPropertiesArgs> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Builder snapshot(@Nullable VolumeSnapshotPropertiesArgs snapshot) {
            this.snapshot = Codegen.ofNullable(snapshot);
            return this;
        }        public VolumePropertiesDataProtectionArgs build() {
            return new VolumePropertiesDataProtectionArgs(backup, replication, snapshot);
        }
    }
}
