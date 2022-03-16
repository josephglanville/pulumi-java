// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.DiskArgs;
import io.pulumi.gcp.compute.inputs.DiskState;
import io.pulumi.gcp.compute.outputs.DiskDiskEncryptionKey;
import io.pulumi.gcp.compute.outputs.DiskSourceImageEncryptionKey;
import io.pulumi.gcp.compute.outputs.DiskSourceSnapshotEncryptionKey;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Persistent disks are durable storage devices that function similarly to
 * the physical disks in a desktop or a server. Compute Engine manages the
 * hardware behind these devices to ensure data redundancy and optimize
 * performance for you. Persistent disks are available as either standard
 * hard disk drives (HDD) or solid-state drives (SSD).
 * 
 * Persistent disks are located independently from your virtual machine
 * instances, so you can detach or move persistent disks to keep your data
 * even after you delete your instances. Persistent disk performance scales
 * automatically with size, so you can resize your existing persistent disks
 * or add more persistent disks to an instance to meet your performance and
 * storage space requirements.
 * 
 * Add a persistent disk to your instance when you need reliable and
 * affordable storage with consistent performance characteristics.
 * 
 * To get more information about Disk, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/disks)
 * * How-to Guides
 *     * [Adding a persistent disk](https://cloud.google.com/compute/docs/disks/add-persistent-disk)
 * 
 * > **Warning:** All arguments including `disk_encryption_key.raw_key` will be stored in the raw
 * state as plain-text. [Read more about secrets in state](https://www.pulumi.com/docs/intro/concepts/programming-model/#secrets).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Disk can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/disk:Disk default projects/{{project}}/zones/{{zone}}/disks/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/disk:Disk default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/disk:Disk default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/disk:Disk default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/disk:Disk")
public class Disk extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * Structure is documented below.
     * 
     */
    @Export(name="diskEncryptionKey", type=DiskDiskEncryptionKey.class, parameters={})
    private Output</* @Nullable */ DiskDiskEncryptionKey> diskEncryptionKey;

    /**
     * @return Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ DiskDiskEncryptionKey> getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * The image from which to initialize this disk. This can be
     * one of: the image's `self_link`, `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
     * images names must include the family name. If they don't, use the
     * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
     * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
     * These images can be referred by family name here.
     * 
     */
    @Export(name="image", type=String.class, parameters={})
    private Output</* @Nullable */ String> image;

    /**
     * @return The image from which to initialize this disk. This can be
     * one of: the image's `self_link`, `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
     * images names must include the family name. If they don't, use the
     * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
     * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
     * These images can be referred by family name here.
     * 
     */
    public Output</* @Nullable */ String> getImage() {
        return this.image;
    }
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     * @Deprecated
     * This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config.
     * 
     */
    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    @Export(name="interface", type=String.class, parameters={})
    private Output</* @Nullable */ String> $interface;

    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     */
    public Output</* @Nullable */ String> get$interface() {
        return this.$interface;
    }
    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this disk.  A list of key->value pairs.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this disk.  A list of key->value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Last attach timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastAttachTimestamp", type=String.class, parameters={})
    private Output<String> lastAttachTimestamp;

    /**
     * @return Last attach timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getLastAttachTimestamp() {
        return this.lastAttachTimestamp;
    }
    /**
     * Last detach timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastDetachTimestamp", type=String.class, parameters={})
    private Output<String> lastDetachTimestamp;

    /**
     * @return Last detach timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getLastDetachTimestamp() {
        return this.lastDetachTimestamp;
    }
    /**
     * Indicates whether or not the disk can be read/write attached to more than one instance.
     * 
     */
    @Export(name="multiWriter", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> multiWriter;

    /**
     * @return Indicates whether or not the disk can be read/write attached to more than one instance.
     * 
     */
    public Output</* @Nullable */ Boolean> getMultiWriter() {
        return this.multiWriter;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Physical block size of the persistent disk, in bytes. If not present
     * in a request, a default value is used. Currently supported sizes
     * are 4096 and 16384, other sizes may be added in the future.
     * If an unsupported value is requested, the error message will list
     * the supported values for the caller's project.
     * 
     */
    @Export(name="physicalBlockSizeBytes", type=Integer.class, parameters={})
    private Output<Integer> physicalBlockSizeBytes;

    /**
     * @return Physical block size of the persistent disk, in bytes. If not present
     * in a request, a default value is used. Currently supported sizes
     * are 4096 and 16384, other sizes may be added in the future.
     * If an unsupported value is requested, the error message will list
     * the supported values for the caller's project.
     * 
     */
    public Output<Integer> getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Indicates how many IOPS must be provisioned for the disk.
     * 
     */
    @Export(name="provisionedIops", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> provisionedIops;

    /**
     * @return Indicates how many IOPS must be provisioned for the disk.
     * 
     */
    public Output</* @Nullable */ Integer> getProvisionedIops() {
        return this.provisionedIops;
    }
    /**
     * Resource policies applied to this disk for automatic snapshot creations.
     * ~>**NOTE** This value does not support updating the
     * resource policy, as resource policies can not be updated more than
     * one at a time. Use
     * `gcp.compute.DiskResourcePolicyAttachment`
     * to allow for updating the resource policy attached to the disk.
     * 
     */
    @Export(name="resourcePolicies", type=List.class, parameters={String.class})
    private Output<List<String>> resourcePolicies;

    /**
     * @return Resource policies applied to this disk for automatic snapshot creations.
     * ~>**NOTE** This value does not support updating the
     * resource policy, as resource policies can not be updated more than
     * one at a time. Use
     * `gcp.compute.DiskResourcePolicyAttachment`
     * to allow for updating the resource policy attached to the disk.
     * 
     */
    public Output<List<String>> getResourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Size of the persistent disk, specified in GB. You can specify this
     * field when creating a persistent disk using the `image` or
     * `snapshot` parameter, or specify it alone to create an empty
     * persistent disk.
     * If you specify this field along with `image` or `snapshot`,
     * the value must not be less than the size of the image
     * or the size of the snapshot.
     * ~>**NOTE** If you change the size, the provider updates the disk size
     * if upsizing is detected but recreates the disk if downsizing is requested.
     * You can add `lifecycle.prevent_destroy` in the config to prevent destroying
     * and recreating.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return Size of the persistent disk, specified in GB. You can specify this
     * field when creating a persistent disk using the `image` or
     * `snapshot` parameter, or specify it alone to create an empty
     * persistent disk.
     * If you specify this field along with `image` or `snapshot`,
     * the value must not be less than the size of the image
     * or the size of the snapshot.
     * ~>**NOTE** If you change the size, the provider updates the disk size
     * if upsizing is detected but recreates the disk if downsizing is requested.
     * You can add `lifecycle.prevent_destroy` in the config to prevent destroying
     * and recreating.
     * 
     */
    public Output<Integer> getSize() {
        return this.size;
    }
    /**
     * The source snapshot used to create this disk. You can provide this as
     * a partial or full URL to the resource. If the snapshot is in another
     * project than this disk, you must supply a full URL. For example, the
     * following are valid values:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
     * * `projects/project/global/snapshots/snapshot`
     * * `global/snapshots/snapshot`
     * * `snapshot`
     * 
     */
    @Export(name="snapshot", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshot;

    /**
     * @return The source snapshot used to create this disk. You can provide this as
     * a partial or full URL to the resource. If the snapshot is in another
     * project than this disk, you must supply a full URL. For example, the
     * following are valid values:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
     * * `projects/project/global/snapshots/snapshot`
     * * `global/snapshots/snapshot`
     * * `snapshot`
     * 
     */
    public Output</* @Nullable */ String> getSnapshot() {
        return this.snapshot;
    }
    /**
     * The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    @Export(name="sourceImageEncryptionKey", type=DiskSourceImageEncryptionKey.class, parameters={})
    private Output</* @Nullable */ DiskSourceImageEncryptionKey> sourceImageEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source image. Required if
     * the source image is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ DiskSourceImageEncryptionKey> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    /**
     * The ID value of the image used to create this disk. This value identifies the exact image that was used to create this
     * persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated
     * under the same name, the source image ID would identify the exact version of the image that was used.
     * 
     */
    @Export(name="sourceImageId", type=String.class, parameters={})
    private Output<String> sourceImageId;

    /**
     * @return The ID value of the image used to create this disk. This value identifies the exact image that was used to create this
     * persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated
     * under the same name, the source image ID would identify the exact version of the image that was used.
     * 
     */
    public Output<String> getSourceImageId() {
        return this.sourceImageId;
    }
    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @Export(name="sourceSnapshotEncryptionKey", type=DiskSourceSnapshotEncryptionKey.class, parameters={})
    private Output</* @Nullable */ DiskSourceSnapshotEncryptionKey> sourceSnapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ DiskSourceSnapshotEncryptionKey> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    /**
     * The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
     * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
     * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    @Export(name="sourceSnapshotId", type=String.class, parameters={})
    private Output<String> sourceSnapshotId;

    /**
     * @return The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
     * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
     * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    public Output<String> getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    /**
     * URL of the disk type resource describing which disk type to use to
     * create the disk. Provide this when creating the disk.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return URL of the disk type resource describing which disk type to use to
     * create the disk. Provide this when creating the disk.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    /**
     * Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
     * 
     */
    @Export(name="users", type=List.class, parameters={String.class})
    private Output<List<String>> users;

    /**
     * @return Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
     * 
     */
    public Output<List<String>> getUsers() {
        return this.users;
    }
    /**
     * A reference to the zone where the disk resides.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return A reference to the zone where the disk resides.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DiskArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.DiskArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.DiskArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Disk(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Disk(String name) {
        this(name, DiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Disk(String name, @Nullable DiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Disk(String name, @Nullable DiskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/disk:Disk", name, args == null ? DiskArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Disk(String name, Output<String> id, @Nullable DiskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/disk:Disk", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static Disk get(String name, Output<String> id, @Nullable DiskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Disk(name, id, state, options);
    }
}
