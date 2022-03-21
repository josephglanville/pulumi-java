// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupResult {
    /**
     * UUID v4 used to identify the Backup
     * 
     */
    private final String backupId;
    /**
     * Type of backup Manual or Scheduled
     * 
     */
    private final String backupType;
    /**
     * The creation date of the backup
     * 
     */
    private final String creationDate;
    /**
     * Failure reason
     * 
     */
    private final String failureReason;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Label for backup
     * 
     */
    private final @Nullable String label;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * Size of backup
     * 
     */
    private final Double size;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Volume name
     * 
     */
    private final String volumeName;

    @CustomType.Constructor
    private GetBackupResult(
        @CustomType.Parameter("backupId") String backupId,
        @CustomType.Parameter("backupType") String backupType,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("failureReason") String failureReason,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("size") Double size,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumeName") String volumeName) {
        this.backupId = backupId;
        this.backupType = backupType;
        this.creationDate = creationDate;
        this.failureReason = failureReason;
        this.id = id;
        this.label = label;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.size = size;
        this.type = type;
        this.volumeName = volumeName;
    }

    /**
     * UUID v4 used to identify the Backup
     * 
    */
    public String getBackupId() {
        return this.backupId;
    }
    /**
     * Type of backup Manual or Scheduled
     * 
    */
    public String getBackupType() {
        return this.backupType;
    }
    /**
     * The creation date of the backup
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Failure reason
     * 
    */
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Label for backup
     * 
    */
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Size of backup
     * 
    */
    public Double getSize() {
        return this.size;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Volume name
     * 
    */
    public String getVolumeName() {
        return this.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupId;
        private String backupType;
        private String creationDate;
        private String failureReason;
        private String id;
        private @Nullable String label;
        private String location;
        private String name;
        private String provisioningState;
        private Double size;
        private String type;
        private String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.backupType = defaults.backupType;
    	      this.creationDate = defaults.creationDate;
    	      this.failureReason = defaults.failureReason;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder backupId(String backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        public Builder backupType(String backupType) {
            this.backupType = Objects.requireNonNull(backupType);
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder failureReason(String failureReason) {
            this.failureReason = Objects.requireNonNull(failureReason);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder size(Double size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder volumeName(String volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }        public GetBackupResult build() {
            return new GetBackupResult(backupId, backupType, creationDate, failureReason, id, label, location, name, provisioningState, size, type, volumeName);
        }
    }
}
