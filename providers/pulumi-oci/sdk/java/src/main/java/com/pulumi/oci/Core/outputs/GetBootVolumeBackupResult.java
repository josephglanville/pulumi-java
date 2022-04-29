// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetBootVolumeBackupSourceDetail;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBootVolumeBackupResult {
    private final String bootVolumeBackupId;
    /**
     * @return The OCID of the boot volume.
     * 
     */
    private final String bootVolumeId;
    /**
     * @return The OCID of the compartment that contains the boot volume backup.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final String displayName;
    /**
     * @return The date and time the volume backup will expire and be automatically deleted. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that were created automatically by a scheduled-backup policy. For manually created backups, it will be absent, signifying that there is no expiration time and the backup will last forever until manually deleted.
     * 
     */
    private final String expirationTime;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the boot volume backup.
     * 
     */
    private final String id;
    /**
     * @return The image OCID used to create the boot volume the backup is taken from.
     * 
     */
    private final String imageId;
    /**
     * @return The OCID of the Key Management master encryption assigned to the boot volume backup. For more information about the Key Management service and encryption keys, see [Overview of Key Management](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     * 
     */
    private final String kmsKeyId;
    /**
     * @return The size of the boot volume, in GBs.
     * 
     */
    private final String sizeInGbs;
    /**
     * @return The OCID of the source boot volume backup.
     * 
     */
    private final String sourceBootVolumeBackupId;
    private final List<GetBootVolumeBackupSourceDetail> sourceDetails;
    /**
     * @return Specifies whether the backup was created manually, or via scheduled backup policy.
     * 
     */
    private final String sourceType;
    /**
     * @return The current state of a boot volume backup.
     * 
     */
    private final String state;
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> systemTags;
    /**
     * @return The date and time the boot volume backup was created. This is the time the actual point-in-time image of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the request to create the boot volume backup was received. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeRequestReceived;
    /**
     * @return The type of a volume backup. Supported values are &#39;FULL&#39; or &#39;INCREMENTAL&#39;.
     * 
     */
    private final String type;
    /**
     * @return The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space consumed on the boot volume and whether the backup is full or incremental.
     * 
     */
    private final String uniqueSizeInGbs;

    @CustomType.Constructor
    private GetBootVolumeBackupResult(
        @CustomType.Parameter("bootVolumeBackupId") String bootVolumeBackupId,
        @CustomType.Parameter("bootVolumeId") String bootVolumeId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("sizeInGbs") String sizeInGbs,
        @CustomType.Parameter("sourceBootVolumeBackupId") String sourceBootVolumeBackupId,
        @CustomType.Parameter("sourceDetails") List<GetBootVolumeBackupSourceDetail> sourceDetails,
        @CustomType.Parameter("sourceType") String sourceType,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemTags") Map<String,Object> systemTags,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeRequestReceived") String timeRequestReceived,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueSizeInGbs") String uniqueSizeInGbs) {
        this.bootVolumeBackupId = bootVolumeBackupId;
        this.bootVolumeId = bootVolumeId;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.expirationTime = expirationTime;
        this.freeformTags = freeformTags;
        this.id = id;
        this.imageId = imageId;
        this.kmsKeyId = kmsKeyId;
        this.sizeInGbs = sizeInGbs;
        this.sourceBootVolumeBackupId = sourceBootVolumeBackupId;
        this.sourceDetails = sourceDetails;
        this.sourceType = sourceType;
        this.state = state;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeRequestReceived = timeRequestReceived;
        this.type = type;
        this.uniqueSizeInGbs = uniqueSizeInGbs;
    }

    public String bootVolumeBackupId() {
        return this.bootVolumeBackupId;
    }
    /**
     * @return The OCID of the boot volume.
     * 
     */
    public String bootVolumeId() {
        return this.bootVolumeId;
    }
    /**
     * @return The OCID of the compartment that contains the boot volume backup.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The date and time the volume backup will expire and be automatically deleted. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that were created automatically by a scheduled-backup policy. For manually created backups, it will be absent, signifying that there is no expiration time and the backup will last forever until manually deleted.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the boot volume backup.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The image OCID used to create the boot volume the backup is taken from.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The OCID of the Key Management master encryption assigned to the boot volume backup. For more information about the Key Management service and encryption keys, see [Overview of Key Management](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return The size of the boot volume, in GBs.
     * 
     */
    public String sizeInGbs() {
        return this.sizeInGbs;
    }
    /**
     * @return The OCID of the source boot volume backup.
     * 
     */
    public String sourceBootVolumeBackupId() {
        return this.sourceBootVolumeBackupId;
    }
    public List<GetBootVolumeBackupSourceDetail> sourceDetails() {
        return this.sourceDetails;
    }
    /**
     * @return Specifies whether the backup was created manually, or via scheduled backup policy.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }
    /**
     * @return The current state of a boot volume backup.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> systemTags() {
        return this.systemTags;
    }
    /**
     * @return The date and time the boot volume backup was created. This is the time the actual point-in-time image of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the request to create the boot volume backup was received. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeRequestReceived() {
        return this.timeRequestReceived;
    }
    /**
     * @return The type of a volume backup. Supported values are &#39;FULL&#39; or &#39;INCREMENTAL&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space consumed on the boot volume and whether the backup is full or incremental.
     * 
     */
    public String uniqueSizeInGbs() {
        return this.uniqueSizeInGbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBootVolumeBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootVolumeBackupId;
        private String bootVolumeId;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String displayName;
        private String expirationTime;
        private Map<String,Object> freeformTags;
        private String id;
        private String imageId;
        private String kmsKeyId;
        private String sizeInGbs;
        private String sourceBootVolumeBackupId;
        private List<GetBootVolumeBackupSourceDetail> sourceDetails;
        private String sourceType;
        private String state;
        private Map<String,Object> systemTags;
        private String timeCreated;
        private String timeRequestReceived;
        private String type;
        private String uniqueSizeInGbs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBootVolumeBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootVolumeBackupId = defaults.bootVolumeBackupId;
    	      this.bootVolumeId = defaults.bootVolumeId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.expirationTime = defaults.expirationTime;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.sizeInGbs = defaults.sizeInGbs;
    	      this.sourceBootVolumeBackupId = defaults.sourceBootVolumeBackupId;
    	      this.sourceDetails = defaults.sourceDetails;
    	      this.sourceType = defaults.sourceType;
    	      this.state = defaults.state;
    	      this.systemTags = defaults.systemTags;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeRequestReceived = defaults.timeRequestReceived;
    	      this.type = defaults.type;
    	      this.uniqueSizeInGbs = defaults.uniqueSizeInGbs;
        }

        public Builder bootVolumeBackupId(String bootVolumeBackupId) {
            this.bootVolumeBackupId = Objects.requireNonNull(bootVolumeBackupId);
            return this;
        }
        public Builder bootVolumeId(String bootVolumeId) {
            this.bootVolumeId = Objects.requireNonNull(bootVolumeId);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder sizeInGbs(String sizeInGbs) {
            this.sizeInGbs = Objects.requireNonNull(sizeInGbs);
            return this;
        }
        public Builder sourceBootVolumeBackupId(String sourceBootVolumeBackupId) {
            this.sourceBootVolumeBackupId = Objects.requireNonNull(sourceBootVolumeBackupId);
            return this;
        }
        public Builder sourceDetails(List<GetBootVolumeBackupSourceDetail> sourceDetails) {
            this.sourceDetails = Objects.requireNonNull(sourceDetails);
            return this;
        }
        public Builder sourceDetails(GetBootVolumeBackupSourceDetail... sourceDetails) {
            return sourceDetails(List.of(sourceDetails));
        }
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemTags(Map<String,Object> systemTags) {
            this.systemTags = Objects.requireNonNull(systemTags);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeRequestReceived(String timeRequestReceived) {
            this.timeRequestReceived = Objects.requireNonNull(timeRequestReceived);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uniqueSizeInGbs(String uniqueSizeInGbs) {
            this.uniqueSizeInGbs = Objects.requireNonNull(uniqueSizeInGbs);
            return this;
        }        public GetBootVolumeBackupResult build() {
            return new GetBootVolumeBackupResult(bootVolumeBackupId, bootVolumeId, compartmentId, definedTags, displayName, expirationTime, freeformTags, id, imageId, kmsKeyId, sizeInGbs, sourceBootVolumeBackupId, sourceDetails, sourceType, state, systemTags, timeCreated, timeRequestReceived, type, uniqueSizeInGbs);
        }
    }
}
