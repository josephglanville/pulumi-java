// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.ImageArgs;
import io.pulumi.googlenative.compute_beta.outputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_beta.outputs.DeprecationStatusResponse;
import io.pulumi.googlenative.compute_beta.outputs.GuestOsFeatureResponse;
import io.pulumi.googlenative.compute_beta.outputs.ImageRawDiskResponse;
import io.pulumi.googlenative.compute_beta.outputs.InitialStateConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.RolloutPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an image in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:Image")
public class Image extends io.pulumi.resources.CustomResource {
    /**
     * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
     * 
     */
    @OutputExport(name="archiveSizeBytes", type=String.class, parameters={})
    private Output<String> archiveSizeBytes;

    /**
     * @return Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
     * 
     */
    public Output<String> getArchiveSizeBytes() {
        return this.archiveSizeBytes;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The deprecation status associated with this image.
     * 
     */
    @OutputExport(name="deprecated", type=DeprecationStatusResponse.class, parameters={})
    private Output<DeprecationStatusResponse> deprecated;

    /**
     * @return The deprecation status associated with this image.
     * 
     */
    public Output<DeprecationStatusResponse> getDeprecated() {
        return this.deprecated;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Size of the image when restored onto a persistent disk (in GB).
     * 
     */
    @OutputExport(name="diskSizeGb", type=String.class, parameters={})
    private Output<String> diskSizeGb;

    /**
     * @return Size of the image when restored onto a persistent disk (in GB).
     * 
     */
    public Output<String> getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
     * 
     */
    @OutputExport(name="family", type=String.class, parameters={})
    private Output<String> family;

    /**
     * @return The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
     * 
     */
    public Output<String> getFamily() {
        return this.family;
    }
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. To see a list of available options, see the guestOSfeatures[].type parameter.
     * 
     */
    @OutputExport(name="guestOsFeatures", type=List.class, parameters={GuestOsFeatureResponse.class})
    private Output<List<GuestOsFeatureResponse>> guestOsFeatures;

    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. To see a list of available options, see the guestOSfeatures[].type parameter.
     * 
     */
    public Output<List<GuestOsFeatureResponse>> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * Encrypts the image using a customer-supplied encryption key. After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the image). Customer-supplied encryption keys do not protect access to metadata of the disk. If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the image later.
     * 
     */
    @OutputExport(name="imageEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> imageEncryptionKey;

    /**
     * @return Encrypts the image using a customer-supplied encryption key. After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the image). Customer-supplied encryption keys do not protect access to metadata of the disk. If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the image later.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> getImageEncryptionKey() {
        return this.imageEncryptionKey;
    }
    /**
     * Type of the resource. Always compute#image for images.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#image for images.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this image, which is essentially a hash of the labels used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an image.
     * 
     */
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this image, which is essentially a hash of the labels used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an image.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this image. These can be later modified by the setLabels method.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this image. These can be later modified by the setLabels method.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Integer license codes indicating which licenses are attached to this image.
     * 
     */
    @OutputExport(name="licenseCodes", type=List.class, parameters={String.class})
    private Output<List<String>> licenseCodes;

    /**
     * @return Integer license codes indicating which licenses are attached to this image.
     * 
     */
    public Output<List<String>> getLicenseCodes() {
        return this.licenseCodes;
    }
    /**
     * Any applicable license URI.
     * 
     */
    @OutputExport(name="licenses", type=List.class, parameters={String.class})
    private Output<List<String>> licenses;

    /**
     * @return Any applicable license URI.
     * 
     */
    public Output<List<String>> getLicenses() {
        return this.licenses;
    }
    /**
     * A flag for marketplace VM disk created from the image, which is designed for marketplace VM disk to prevent the proprietary data on the disk from being accessed unwantedly. The flag will be inherited by the disk created from the image. The disk with locked flag set to true will be prohibited from performing the operations below: - R/W or R/O disk attach - Disk detach, if disk is created via create-on-create - Create images - Create snapshots - Create disk clone (create disk from the current disk) The image with the locked field set to true will be prohibited from performing the operations below: - Create images from the current image - Update the locked field for the current image The instance with at least one disk with locked flag set to true will be prohibited from performing the operations below: - Secondary disk attach - Create instant snapshot - Create machine images - Create instance template - Delete the instance with --keep-disk parameter set to true
     * 
     */
    @OutputExport(name="locked", type=Boolean.class, parameters={})
    private Output<Boolean> locked;

    /**
     * @return A flag for marketplace VM disk created from the image, which is designed for marketplace VM disk to prevent the proprietary data on the disk from being accessed unwantedly. The flag will be inherited by the disk created from the image. The disk with locked flag set to true will be prohibited from performing the operations below: - R/W or R/O disk attach - Disk detach, if disk is created via create-on-create - Create images - Create snapshots - Create disk clone (create disk from the current disk) The image with the locked field set to true will be prohibited from performing the operations below: - Create images from the current image - Update the locked field for the current image The instance with at least one disk with locked flag set to true will be prohibited from performing the operations below: - Secondary disk attach - Create instant snapshot - Create machine images - Create instance template - Delete the instance with --keep-disk parameter set to true
     * 
     */
    public Output<Boolean> getLocked() {
        return this.locked;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parameters of the raw disk image.
     * 
     */
    @OutputExport(name="rawDisk", type=ImageRawDiskResponse.class, parameters={})
    private Output<ImageRawDiskResponse> rawDisk;

    /**
     * @return The parameters of the raw disk image.
     * 
     */
    public Output<ImageRawDiskResponse> getRawDisk() {
        return this.rawDisk;
    }
    /**
     * A rollout policy to apply to this image. When specified, the rollout policy overrides per-zone references to the image via the associated image family. The rollout policy restricts the zones where this image is accessible when using a zonal image family reference. When the rollout policy does not include the user specified zone, or if the zone is rolled out, this image is accessible. The rollout policy for this image is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
     */
    @OutputExport(name="rolloutOverride", type=RolloutPolicyResponse.class, parameters={})
    private Output<RolloutPolicyResponse> rolloutOverride;

    /**
     * @return A rollout policy to apply to this image. When specified, the rollout policy overrides per-zone references to the image via the associated image family. The rollout policy restricts the zones where this image is accessible when using a zonal image family reference. When the rollout policy does not include the user specified zone, or if the zone is rolled out, this image is accessible. The rollout policy for this image is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
     */
    public Output<RolloutPolicyResponse> getRolloutOverride() {
        return this.rolloutOverride;
    }
    /**
     * Reserved for future use.
     * 
     */
    @OutputExport(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Set the secure boot keys of shielded instance.
     * 
     */
    @OutputExport(name="shieldedInstanceInitialState", type=InitialStateConfigResponse.class, parameters={})
    private Output<InitialStateConfigResponse> shieldedInstanceInitialState;

    /**
     * @return Set the secure boot keys of shielded instance.
     * 
     */
    public Output<InitialStateConfigResponse> getShieldedInstanceInitialState() {
        return this.shieldedInstanceInitialState;
    }
    /**
     * URL of the source disk used to create this image. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @OutputExport(name="sourceDisk", type=String.class, parameters={})
    private Output<String> sourceDisk;

    /**
     * @return URL of the source disk used to create this image. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    public Output<String> getSourceDisk() {
        return this.sourceDisk;
    }
    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @OutputExport(name="sourceDiskEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceDiskEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey;
    }
    /**
     * The ID value of the disk used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given disk name.
     * 
     */
    @OutputExport(name="sourceDiskId", type=String.class, parameters={})
    private Output<String> sourceDiskId;

    /**
     * @return The ID value of the disk used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given disk name.
     * 
     */
    public Output<String> getSourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * URL of the source image used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ images/image_name - projects/project_id/global/images/image_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @OutputExport(name="sourceImage", type=String.class, parameters={})
    private Output<String> sourceImage;

    /**
     * @return URL of the source image used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ images/image_name - projects/project_id/global/images/image_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    public Output<String> getSourceImage() {
        return this.sourceImage;
    }
    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    @OutputExport(name="sourceImageEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceImageEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    /**
     * The ID value of the image used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given image name.
     * 
     */
    @OutputExport(name="sourceImageId", type=String.class, parameters={})
    private Output<String> sourceImageId;

    /**
     * @return The ID value of the image used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given image name.
     * 
     */
    public Output<String> getSourceImageId() {
        return this.sourceImageId;
    }
    /**
     * URL of the source snapshot used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ snapshots/snapshot_name - projects/project_id/global/snapshots/snapshot_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @OutputExport(name="sourceSnapshot", type=String.class, parameters={})
    private Output<String> sourceSnapshot;

    /**
     * @return URL of the source snapshot used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ snapshots/snapshot_name - projects/project_id/global/snapshots/snapshot_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    public Output<String> getSourceSnapshot() {
        return this.sourceSnapshot;
    }
    /**
     * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    @OutputExport(name="sourceSnapshotEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceSnapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    /**
     * The ID value of the snapshot used to create this image. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given snapshot name.
     * 
     */
    @OutputExport(name="sourceSnapshotId", type=String.class, parameters={})
    private Output<String> sourceSnapshotId;

    /**
     * @return The ID value of the snapshot used to create this image. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given snapshot name.
     * 
     */
    public Output<String> getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    /**
     * The type of the image used to create this disk. The default and only value is RAW
     * 
     */
    @OutputExport(name="sourceType", type=String.class, parameters={})
    private Output<String> sourceType;

    /**
     * @return The type of the image used to create this disk. The default and only value is RAW
     * 
     */
    public Output<String> getSourceType() {
        return this.sourceType;
    }
    /**
     * The status of the image. An image can be used to create other resources, such as instances, only after the image has been successfully created and the status is set to READY. Possible values are FAILED, PENDING, or READY.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the image. An image can be used to create other resources, such as instances, only after the image has been successfully created and the status is set to READY. Possible values are FAILED, PENDING, or READY.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Cloud Storage bucket storage location of the image (regional or multi-regional).
     * 
     */
    @OutputExport(name="storageLocations", type=List.class, parameters={String.class})
    private Output<List<String>> storageLocations;

    /**
     * @return Cloud Storage bucket storage location of the image (regional or multi-regional).
     * 
     */
    public Output<List<String>> getStorageLocations() {
        return this.storageLocations;
    }
    /**
     * A list of publicly visible user-licenses. Unlike regular licenses, user provided licenses can be modified after the disk is created. This includes a list of URLs to the license resource. For example, to provide a debian license: https://www.googleapis.com/compute/v1/projects/debian-cloud/global/licenses/debian-9-stretch
     * 
     */
    @OutputExport(name="userLicenses", type=List.class, parameters={String.class})
    private Output<List<String>> userLicenses;

    /**
     * @return A list of publicly visible user-licenses. Unlike regular licenses, user provided licenses can be modified after the disk is created. This includes a list of URLs to the license resource. For example, to provide a debian license: https://www.googleapis.com/compute/v1/projects/debian-cloud/global/licenses/debian-9-stretch
     * 
     */
    public Output<List<String>> getUserLicenses() {
        return this.userLicenses;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, @Nullable ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, @Nullable ImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Image(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Image", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Image get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, options);
    }
}
