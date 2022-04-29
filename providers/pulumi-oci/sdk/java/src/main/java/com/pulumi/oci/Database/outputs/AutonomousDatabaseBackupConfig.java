// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutonomousDatabaseBackupConfig {
    /**
     * @return Name of [Object Storage](https://docs.cloud.oracle.com/iaas/Content/Object/Concepts/objectstorageoverview.htm) bucket to use for storing manual backups.
     * 
     */
    private final @Nullable String manualBackupBucketName;
    /**
     * @return The manual backup destination type.
     * 
     */
    private final @Nullable String manualBackupType;

    @CustomType.Constructor
    private AutonomousDatabaseBackupConfig(
        @CustomType.Parameter("manualBackupBucketName") @Nullable String manualBackupBucketName,
        @CustomType.Parameter("manualBackupType") @Nullable String manualBackupType) {
        this.manualBackupBucketName = manualBackupBucketName;
        this.manualBackupType = manualBackupType;
    }

    /**
     * @return Name of [Object Storage](https://docs.cloud.oracle.com/iaas/Content/Object/Concepts/objectstorageoverview.htm) bucket to use for storing manual backups.
     * 
     */
    public Optional<String> manualBackupBucketName() {
        return Optional.ofNullable(this.manualBackupBucketName);
    }
    /**
     * @return The manual backup destination type.
     * 
     */
    public Optional<String> manualBackupType() {
        return Optional.ofNullable(this.manualBackupType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutonomousDatabaseBackupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String manualBackupBucketName;
        private @Nullable String manualBackupType;

        public Builder() {
    	      // Empty
        }

        public Builder(AutonomousDatabaseBackupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manualBackupBucketName = defaults.manualBackupBucketName;
    	      this.manualBackupType = defaults.manualBackupType;
        }

        public Builder manualBackupBucketName(@Nullable String manualBackupBucketName) {
            this.manualBackupBucketName = manualBackupBucketName;
            return this;
        }
        public Builder manualBackupType(@Nullable String manualBackupType) {
            this.manualBackupType = manualBackupType;
            return this;
        }        public AutonomousDatabaseBackupConfig build() {
            return new AutonomousDatabaseBackupConfig(manualBackupBucketName, manualBackupType);
        }
    }
}
