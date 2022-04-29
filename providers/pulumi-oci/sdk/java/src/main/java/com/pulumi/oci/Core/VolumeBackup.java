// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Core.VolumeBackupArgs;
import com.pulumi.oci.Core.inputs.VolumeBackupState;
import com.pulumi.oci.Core.outputs.VolumeBackupSourceDetails;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Volume Backup resource in Oracle Cloud Infrastructure Core service.
 * 
 * Creates a new backup of the specified volume. For general information about volume backups,
 * see [Overview of Block Volume Service Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumebackups.htm)
 * 
 * When the request is received, the backup object is in a REQUEST_RECEIVED state.
 * When the data is imaged, it goes into a CREATING state.
 * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VolumeBackups can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Core/volumeBackup:VolumeBackup test_volume_backup &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Core/volumeBackup:VolumeBackup")
public class VolumeBackup extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The OCID of the compartment that contains the volume backup.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment that contains the volume backup.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The date and time the volume backup will expire and be automatically deleted. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that were created automatically by a scheduled-backup policy. For manually created backups, it will be absent, signifying that there is no expiration time and the backup will last forever until manually deleted.
     * 
     */
    @Export(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return The date and time the volume backup will expire and be automatically deleted. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This parameter will always be present for backups that were created automatically by a scheduled-backup policy. For manually created backups, it will be absent, signifying that there is no expiration time and the backup will last forever until manually deleted.
     * 
     */
    public Output<String> expirationTime() {
        return this.expirationTime;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * The OCID of the KMS key in the destination region which will be the master encryption key for the copied volume backup.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The OCID of the KMS key in the destination region which will be the master encryption key for the copied volume backup.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The size of the volume, in GBs.
     * 
     */
    @Export(name="sizeInGbs", type=String.class, parameters={})
    private Output<String> sizeInGbs;

    /**
     * @return The size of the volume, in GBs.
     * 
     */
    public Output<String> sizeInGbs() {
        return this.sizeInGbs;
    }
    /**
     * The size of the volume in MBs. The value must be a multiple of 1024. This field is deprecated. Please use `size_in_gbs`.
     * 
     * @deprecated
     * The &#39;size_in_mbs&#39; field has been deprecated. Please use &#39;size_in_gbs&#39; instead.
     * 
     */
    @Deprecated /* The 'size_in_mbs' field has been deprecated. Please use 'size_in_gbs' instead. */
    @Export(name="sizeInMbs", type=String.class, parameters={})
    private Output<String> sizeInMbs;

    /**
     * @return The size of the volume in MBs. The value must be a multiple of 1024. This field is deprecated. Please use `size_in_gbs`.
     * 
     */
    public Output<String> sizeInMbs() {
        return this.sizeInMbs;
    }
    /**
     * Details of the volume backup source in the cloud.
     * 
     */
    @Export(name="sourceDetails", type=VolumeBackupSourceDetails.class, parameters={})
    private Output</* @Nullable */ VolumeBackupSourceDetails> sourceDetails;

    /**
     * @return Details of the volume backup source in the cloud.
     * 
     */
    public Output<Optional<VolumeBackupSourceDetails>> sourceDetails() {
        return Codegen.optional(this.sourceDetails);
    }
    /**
     * Specifies whether the backup was created manually, or via scheduled backup policy.
     * 
     */
    @Export(name="sourceType", type=String.class, parameters={})
    private Output<String> sourceType;

    /**
     * @return Specifies whether the backup was created manually, or via scheduled backup policy.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }
    /**
     * The OCID of the source volume backup.
     * 
     */
    @Export(name="sourceVolumeBackupId", type=String.class, parameters={})
    private Output<String> sourceVolumeBackupId;

    /**
     * @return The OCID of the source volume backup.
     * 
     */
    public Output<String> sourceVolumeBackupId() {
        return this.sourceVolumeBackupId;
    }
    /**
     * The current state of a volume backup.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of a volume backup.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The date and time the volume backup was created. This is the time the actual point-in-time image of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the volume backup was created. This is the time the actual point-in-time image of the volume data was taken. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
     * 
     */
    @Export(name="timeRequestReceived", type=String.class, parameters={})
    private Output<String> timeRequestReceived;

    /**
     * @return The date and time the request to create the volume backup was received. Format defined by [RFC3339]https://tools.ietf.org/html/rfc3339.
     * 
     */
    public Output<String> timeRequestReceived() {
        return this.timeRequestReceived;
    }
    /**
     * The type of backup to create. If omitted, defaults to INCREMENTAL. Supported values are &#39;FULL&#39; or &#39;INCREMENTAL&#39;.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of backup to create. If omitted, defaults to INCREMENTAL. Supported values are &#39;FULL&#39; or &#39;INCREMENTAL&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space consumed on the volume and whether the backup is full or incremental.
     * 
     */
    @Export(name="uniqueSizeInGbs", type=String.class, parameters={})
    private Output<String> uniqueSizeInGbs;

    /**
     * @return The size used by the backup, in GBs. It is typically smaller than sizeInGBs, depending on the space consumed on the volume and whether the backup is full or incremental.
     * 
     */
    public Output<String> uniqueSizeInGbs() {
        return this.uniqueSizeInGbs;
    }
    /**
     * The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space consumed on the volume and whether the backup is full or incremental. This field is deprecated. Please use uniqueSizeInGBs.
     * 
     * @deprecated
     * The &#39;unique_size_in_mbs&#39; field has been deprecated. Please use &#39;unique_size_in_gbs&#39; instead.
     * 
     */
    @Deprecated /* The 'unique_size_in_mbs' field has been deprecated. Please use 'unique_size_in_gbs' instead. */
    @Export(name="uniqueSizeInMbs", type=String.class, parameters={})
    private Output<String> uniqueSizeInMbs;

    /**
     * @return The size used by the backup, in MBs. It is typically smaller than sizeInMBs, depending on the space consumed on the volume and whether the backup is full or incremental. This field is deprecated. Please use uniqueSizeInGBs.
     * 
     */
    public Output<String> uniqueSizeInMbs() {
        return this.uniqueSizeInMbs;
    }
    /**
     * The OCID of the volume that needs to be backed up.**Note: To create the resource either `volume_id` or `source_details` is required to be set.
     * 
     */
    @Export(name="volumeId", type=String.class, parameters={})
    private Output<String> volumeId;

    /**
     * @return The OCID of the volume that needs to be backed up.**Note: To create the resource either `volume_id` or `source_details` is required to be set.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeBackup(String name) {
        this(name, VolumeBackupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeBackup(String name, @Nullable VolumeBackupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeBackup(String name, @Nullable VolumeBackupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/volumeBackup:VolumeBackup", name, args == null ? VolumeBackupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VolumeBackup(String name, Output<String> id, @Nullable VolumeBackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/volumeBackup:VolumeBackup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VolumeBackup get(String name, Output<String> id, @Nullable VolumeBackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeBackup(name, id, state, options);
    }
}
