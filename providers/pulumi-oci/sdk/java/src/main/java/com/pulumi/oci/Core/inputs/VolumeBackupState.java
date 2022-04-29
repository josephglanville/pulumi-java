// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.VolumeBackupSourceDetailsArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeBackupState extends com.pulumi.resources.ResourceArgs {

    public static final VolumeBackupState Empty = new VolumeBackupState();

    /**
     * (Updatable) The OCID of the compartment that contains the volume backup.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment that contains the volume backup.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The date and time the volume backup will expire and be automatically deleted. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that were created automatically by a scheduled-backup policy. For manually created backups, it will be absent, signifying that there is no expiration time and the backup will last forever until manually deleted.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return The date and time the volume backup will expire and be automatically deleted. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that were created automatically by a scheduled-backup policy. For manually created backups, it will be absent, signifying that there is no expiration time and the backup will last forever until manually deleted.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The OCID of the KMS key in the destination region which will be the master encryption key for the copied volume backup.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The OCID of the KMS key in the destination region which will be the master encryption key for the copied volume backup.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The size of the volume, in GBs.
     * 
     */
    @Import(name="sizeInGbs")
    private @Nullable Output<String> sizeInGbs;

    /**
     * @return The size of the volume, in GBs.
     * 
     */
    public Optional<Output<String>> sizeInGbs() {
        return Optional.ofNullable(this.sizeInGbs);
    }

    /**
     * The size of the volume in MBs. The value must be a multiple of 1024. This field is deprecated. Please use `size_in_gbs`.
     * 
     * @deprecated
     * The &#39;size_in_mbs&#39; field has been deprecated. Please use &#39;size_in_gbs&#39; instead.
     * 
     */
    @Deprecated /* The 'size_in_mbs' field has been deprecated. Please use 'size_in_gbs' instead. */
    @Import(name="sizeInMbs")
    private @Nullable Output<String> sizeInMbs;

    /**
     * @return The size of the volume in MBs. The value must be a multiple of 1024. This field is deprecated. Please use `size_in_gbs`.
     * 
     * @deprecated
     * The &#39;size_in_mbs&#39; field has been deprecated. Please use &#39;size_in_gbs&#39; instead.
     * 
     */
    @Deprecated /* The 'size_in_mbs' field has been deprecated. Please use 'size_in_gbs' instead. */
    public Optional<Output<String>> sizeInMbs() {
        return Optional.ofNullable(this.sizeInMbs);
    }

    /**
     * Details of the volume backup source in the cloud.
     * 
     */
    @Import(name="sourceDetails")
    private @Nullable Output<VolumeBackupSourceDetailsArgs> sourceDetails;

    /**
     * @return Details of the volume backup source in the cloud.
     * 
     */
    public Optional<Output<VolumeBackupSourceDetailsArgs>> sourceDetails() {
        return Optional.ofNullable(this.sourceDetails);
    }

    /**
     * Specifies whether the backup was created manually, or via scheduled backup policy.
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    /**
     * @return Specifies whether the backup was created manually, or via scheduled backup policy.
     * 
     */
    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    /**
     * The OCID of the source volume backup.
     * 
     */
    @Import(name="sourceVolumeBackupId")
    private @Nullable Output<String> sourceVolumeBackupId;

    /**
     * @return The OCID of the source volume backup.
     * 
     */
    public Optional<Output<String>> sourceVolumeBackupId() {
        return Optional.ofNullable(this.sourceVolumeBackupId);
    }

    /**
     * The current state of a volume backup.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of a volume backup.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="systemTags")
    private @Nullable Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> systemTags() {
        return Optional.ofNullable(this.systemTags);
    }

    /**
     * The date and time the volume backup was created. This is the time the actual point-in-time image of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the volume backup was created. This is the time the actual point-in-time image of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
     * 
     */
    @Import(name="timeRequestReceived")
    private @Nullable Output<String> timeRequestReceived;

    /**
     * @return The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
     * 
     */
    public Optional<Output<String>> timeRequestReceived() {
        return Optional.ofNullable(this.timeRequestReceived);
    }

    /**
     * The type of backup to create. If omitted, defaults to INCREMENTAL. Supported values are &#39;FULL&#39; or &#39;INCREMENTAL&#39;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of backup to create. If omitted, defaults to INCREMENTAL. Supported values are &#39;FULL&#39; or &#39;INCREMENTAL&#39;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space consumed on the volume and whether the backup is full or incremental.
     * 
     */
    @Import(name="uniqueSizeInGbs")
    private @Nullable Output<String> uniqueSizeInGbs;

    /**
     * @return The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space consumed on the volume and whether the backup is full or incremental.
     * 
     */
    public Optional<Output<String>> uniqueSizeInGbs() {
        return Optional.ofNullable(this.uniqueSizeInGbs);
    }

    /**
     * The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space consumed on the volume and whether the backup is full or incremental. This field is deprecated. Please use uniqueSizeInGBs.
     * 
     * @deprecated
     * The &#39;unique_size_in_mbs&#39; field has been deprecated. Please use &#39;unique_size_in_gbs&#39; instead.
     * 
     */
    @Deprecated /* The 'unique_size_in_mbs' field has been deprecated. Please use 'unique_size_in_gbs' instead. */
    @Import(name="uniqueSizeInMbs")
    private @Nullable Output<String> uniqueSizeInMbs;

    /**
     * @return The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space consumed on the volume and whether the backup is full or incremental. This field is deprecated. Please use uniqueSizeInGBs.
     * 
     * @deprecated
     * The &#39;unique_size_in_mbs&#39; field has been deprecated. Please use &#39;unique_size_in_gbs&#39; instead.
     * 
     */
    @Deprecated /* The 'unique_size_in_mbs' field has been deprecated. Please use 'unique_size_in_gbs' instead. */
    public Optional<Output<String>> uniqueSizeInMbs() {
        return Optional.ofNullable(this.uniqueSizeInMbs);
    }

    /**
     * The OCID of the volume that needs to be backed up.**Note: To create the resource either `volume_id` or `source_details` is required to be set.
     * 
     */
    @Import(name="volumeId")
    private @Nullable Output<String> volumeId;

    /**
     * @return The OCID of the volume that needs to be backed up.**Note: To create the resource either `volume_id` or `source_details` is required to be set.
     * 
     */
    public Optional<Output<String>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    private VolumeBackupState() {}

    private VolumeBackupState(VolumeBackupState $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.expirationTime = $.expirationTime;
        this.freeformTags = $.freeformTags;
        this.kmsKeyId = $.kmsKeyId;
        this.sizeInGbs = $.sizeInGbs;
        this.sizeInMbs = $.sizeInMbs;
        this.sourceDetails = $.sourceDetails;
        this.sourceType = $.sourceType;
        this.sourceVolumeBackupId = $.sourceVolumeBackupId;
        this.state = $.state;
        this.systemTags = $.systemTags;
        this.timeCreated = $.timeCreated;
        this.timeRequestReceived = $.timeRequestReceived;
        this.type = $.type;
        this.uniqueSizeInGbs = $.uniqueSizeInGbs;
        this.uniqueSizeInMbs = $.uniqueSizeInMbs;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeBackupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeBackupState $;

        public Builder() {
            $ = new VolumeBackupState();
        }

        public Builder(VolumeBackupState defaults) {
            $ = new VolumeBackupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment that contains the volume backup.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment that contains the volume backup.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param expirationTime The date and time the volume backup will expire and be automatically deleted. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that were created automatically by a scheduled-backup policy. For manually created backups, it will be absent, signifying that there is no expiration time and the backup will last forever until manually deleted.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime The date and time the volume backup will expire and be automatically deleted. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that were created automatically by a scheduled-backup policy. For manually created backups, it will be absent, signifying that there is no expiration time and the backup will last forever until manually deleted.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param kmsKeyId The OCID of the KMS key in the destination region which will be the master encryption key for the copied volume backup.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The OCID of the KMS key in the destination region which will be the master encryption key for the copied volume backup.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param sizeInGbs The size of the volume, in GBs.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGbs(@Nullable Output<String> sizeInGbs) {
            $.sizeInGbs = sizeInGbs;
            return this;
        }

        /**
         * @param sizeInGbs The size of the volume, in GBs.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGbs(String sizeInGbs) {
            return sizeInGbs(Output.of(sizeInGbs));
        }

        /**
         * @param sizeInMbs The size of the volume in MBs. The value must be a multiple of 1024. This field is deprecated. Please use `size_in_gbs`.
         * 
         * @return builder
         * 
         * @deprecated
         * The &#39;size_in_mbs&#39; field has been deprecated. Please use &#39;size_in_gbs&#39; instead.
         * 
         */
        @Deprecated /* The 'size_in_mbs' field has been deprecated. Please use 'size_in_gbs' instead. */
        public Builder sizeInMbs(@Nullable Output<String> sizeInMbs) {
            $.sizeInMbs = sizeInMbs;
            return this;
        }

        /**
         * @param sizeInMbs The size of the volume in MBs. The value must be a multiple of 1024. This field is deprecated. Please use `size_in_gbs`.
         * 
         * @return builder
         * 
         * @deprecated
         * The &#39;size_in_mbs&#39; field has been deprecated. Please use &#39;size_in_gbs&#39; instead.
         * 
         */
        @Deprecated /* The 'size_in_mbs' field has been deprecated. Please use 'size_in_gbs' instead. */
        public Builder sizeInMbs(String sizeInMbs) {
            return sizeInMbs(Output.of(sizeInMbs));
        }

        /**
         * @param sourceDetails Details of the volume backup source in the cloud.
         * 
         * @return builder
         * 
         */
        public Builder sourceDetails(@Nullable Output<VolumeBackupSourceDetailsArgs> sourceDetails) {
            $.sourceDetails = sourceDetails;
            return this;
        }

        /**
         * @param sourceDetails Details of the volume backup source in the cloud.
         * 
         * @return builder
         * 
         */
        public Builder sourceDetails(VolumeBackupSourceDetailsArgs sourceDetails) {
            return sourceDetails(Output.of(sourceDetails));
        }

        /**
         * @param sourceType Specifies whether the backup was created manually, or via scheduled backup policy.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType Specifies whether the backup was created manually, or via scheduled backup policy.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        /**
         * @param sourceVolumeBackupId The OCID of the source volume backup.
         * 
         * @return builder
         * 
         */
        public Builder sourceVolumeBackupId(@Nullable Output<String> sourceVolumeBackupId) {
            $.sourceVolumeBackupId = sourceVolumeBackupId;
            return this;
        }

        /**
         * @param sourceVolumeBackupId The OCID of the source volume backup.
         * 
         * @return builder
         * 
         */
        public Builder sourceVolumeBackupId(String sourceVolumeBackupId) {
            return sourceVolumeBackupId(Output.of(sourceVolumeBackupId));
        }

        /**
         * @param state The current state of a volume backup.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of a volume backup.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param systemTags System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(@Nullable Output<Map<String,Object>> systemTags) {
            $.systemTags = systemTags;
            return this;
        }

        /**
         * @param systemTags System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(Map<String,Object> systemTags) {
            return systemTags(Output.of(systemTags));
        }

        /**
         * @param timeCreated The date and time the volume backup was created. This is the time the actual point-in-time image of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the volume backup was created. This is the time the actual point-in-time image of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeRequestReceived The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
         * 
         * @return builder
         * 
         */
        public Builder timeRequestReceived(@Nullable Output<String> timeRequestReceived) {
            $.timeRequestReceived = timeRequestReceived;
            return this;
        }

        /**
         * @param timeRequestReceived The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
         * 
         * @return builder
         * 
         */
        public Builder timeRequestReceived(String timeRequestReceived) {
            return timeRequestReceived(Output.of(timeRequestReceived));
        }

        /**
         * @param type The type of backup to create. If omitted, defaults to INCREMENTAL. Supported values are &#39;FULL&#39; or &#39;INCREMENTAL&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of backup to create. If omitted, defaults to INCREMENTAL. Supported values are &#39;FULL&#39; or &#39;INCREMENTAL&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uniqueSizeInGbs The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space consumed on the volume and whether the backup is full or incremental.
         * 
         * @return builder
         * 
         */
        public Builder uniqueSizeInGbs(@Nullable Output<String> uniqueSizeInGbs) {
            $.uniqueSizeInGbs = uniqueSizeInGbs;
            return this;
        }

        /**
         * @param uniqueSizeInGbs The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space consumed on the volume and whether the backup is full or incremental.
         * 
         * @return builder
         * 
         */
        public Builder uniqueSizeInGbs(String uniqueSizeInGbs) {
            return uniqueSizeInGbs(Output.of(uniqueSizeInGbs));
        }

        /**
         * @param uniqueSizeInMbs The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space consumed on the volume and whether the backup is full or incremental. This field is deprecated. Please use uniqueSizeInGBs.
         * 
         * @return builder
         * 
         * @deprecated
         * The &#39;unique_size_in_mbs&#39; field has been deprecated. Please use &#39;unique_size_in_gbs&#39; instead.
         * 
         */
        @Deprecated /* The 'unique_size_in_mbs' field has been deprecated. Please use 'unique_size_in_gbs' instead. */
        public Builder uniqueSizeInMbs(@Nullable Output<String> uniqueSizeInMbs) {
            $.uniqueSizeInMbs = uniqueSizeInMbs;
            return this;
        }

        /**
         * @param uniqueSizeInMbs The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space consumed on the volume and whether the backup is full or incremental. This field is deprecated. Please use uniqueSizeInGBs.
         * 
         * @return builder
         * 
         * @deprecated
         * The &#39;unique_size_in_mbs&#39; field has been deprecated. Please use &#39;unique_size_in_gbs&#39; instead.
         * 
         */
        @Deprecated /* The 'unique_size_in_mbs' field has been deprecated. Please use 'unique_size_in_gbs' instead. */
        public Builder uniqueSizeInMbs(String uniqueSizeInMbs) {
            return uniqueSizeInMbs(Output.of(uniqueSizeInMbs));
        }

        /**
         * @param volumeId The OCID of the volume that needs to be backed up.**Note: To create the resource either `volume_id` or `source_details` is required to be set.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(@Nullable Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId The OCID of the volume that needs to be backed up.**Note: To create the resource either `volume_id` or `source_details` is required to be set.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public VolumeBackupState build() {
            return $;
        }
    }

}
