// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set disk storage settings for SQL Server.
 * 
 */
public final class SqlStorageUpdateSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlStorageUpdateSettingsResponse Empty = new SqlStorageUpdateSettingsResponse();

    /**
     * Disk configuration to apply to SQL Server.
     * 
     */
    @InputImport(name="diskConfigurationType")
      private final @Nullable String diskConfigurationType;

    public Optional<String> getDiskConfigurationType() {
        return this.diskConfigurationType == null ? Optional.empty() : Optional.ofNullable(this.diskConfigurationType);
    }

    /**
     * Virtual machine disk count.
     * 
     */
    @InputImport(name="diskCount")
      private final @Nullable Integer diskCount;

    public Optional<Integer> getDiskCount() {
        return this.diskCount == null ? Optional.empty() : Optional.ofNullable(this.diskCount);
    }

    /**
     * Device id of the first disk to be updated.
     * 
     */
    @InputImport(name="startingDeviceId")
      private final @Nullable Integer startingDeviceId;

    public Optional<Integer> getStartingDeviceId() {
        return this.startingDeviceId == null ? Optional.empty() : Optional.ofNullable(this.startingDeviceId);
    }

    public SqlStorageUpdateSettingsResponse(
        @Nullable String diskConfigurationType,
        @Nullable Integer diskCount,
        @Nullable Integer startingDeviceId) {
        this.diskConfigurationType = diskConfigurationType;
        this.diskCount = diskCount;
        this.startingDeviceId = startingDeviceId;
    }

    private SqlStorageUpdateSettingsResponse() {
        this.diskConfigurationType = null;
        this.diskCount = null;
        this.startingDeviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlStorageUpdateSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskConfigurationType;
        private @Nullable Integer diskCount;
        private @Nullable Integer startingDeviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlStorageUpdateSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfigurationType = defaults.diskConfigurationType;
    	      this.diskCount = defaults.diskCount;
    	      this.startingDeviceId = defaults.startingDeviceId;
        }

        public Builder setDiskConfigurationType(@Nullable String diskConfigurationType) {
            this.diskConfigurationType = diskConfigurationType;
            return this;
        }

        public Builder setDiskCount(@Nullable Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }

        public Builder setStartingDeviceId(@Nullable Integer startingDeviceId) {
            this.startingDeviceId = startingDeviceId;
            return this;
        }
        public SqlStorageUpdateSettingsResponse build() {
            return new SqlStorageUpdateSettingsResponse(diskConfigurationType, diskCount, startingDeviceId);
        }
    }
}
