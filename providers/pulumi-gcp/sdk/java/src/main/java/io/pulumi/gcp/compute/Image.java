// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ImageArgs;
import io.pulumi.gcp.compute.inputs.ImageState;
import io.pulumi.gcp.compute.outputs.ImageGuestOsFeature;
import io.pulumi.gcp.compute.outputs.ImageRawDisk;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents an Image resource.
 * 
 * Google Compute Engine uses operating system images to create the root
 * persistent disks for your instances. You specify an image when you create
 * an instance. Images contain a boot loader, an operating system, and a
 * root file system. Linux operating system images are also capable of
 * running containers on Compute Engine.
 * 
 * Images can be either public or custom.
 * 
 * Public images are provided and maintained by Google, open-source
 * communities, and third-party vendors. By default, all projects have
 * access to these images and can use them to create instances.  Custom
 * images are available only to your project. You can create a custom image
 * from root persistent disks and other images. Then, use the custom image
 * to create an instance.
 * 
 * To get more information about Image, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/images)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/images)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Image can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/image:Image default projects/{{project}}/global/images/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/image:Image default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/image:Image default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/image:Image")
public class Image extends io.pulumi.resources.CustomResource {
    /**
     * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
     * 
     */
    @Export(name="archiveSizeBytes", type=Integer.class, parameters={})
    private Output<Integer> archiveSizeBytes;

    /**
     * @return Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
     * 
     */
    public Output<Integer> getArchiveSizeBytes() {
        return this.archiveSizeBytes;
    }
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
     * Size of the image when restored onto a persistent disk (in GB).
     * 
     */
    @Export(name="diskSizeGb", type=Integer.class, parameters={})
    private Output<Integer> diskSizeGb;

    /**
     * @return Size of the image when restored onto a persistent disk (in GB).
     * 
     */
    public Output<Integer> getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * The name of the image family to which this image belongs. You can
     * create disks by specifying an image family instead of a specific
     * image name. The image family always returns its latest image that is
     * not deprecated. The name of the image family must comply with
     * RFC1035.
     * 
     */
    @Export(name="family", type=String.class, parameters={})
    private Output</* @Nullable */ String> family;

    /**
     * @return The name of the image family to which this image belongs. You can
     * create disks by specifying an image family instead of a specific
     * image name. The image family always returns its latest image that is
     * not deprecated. The name of the image family must comply with
     * RFC1035.
     * 
     */
    public Output</* @Nullable */ String> getFamily() {
        return this.family;
    }
    /**
     * A list of features to enable on the guest operating system.
     * Applicable only for bootable images.
     * Structure is documented below.
     * 
     */
    @Export(name="guestOsFeatures", type=List.class, parameters={ImageGuestOsFeature.class})
    private Output<List<ImageGuestOsFeature>> guestOsFeatures;

    /**
     * @return A list of features to enable on the guest operating system.
     * Applicable only for bootable images.
     * Structure is documented below.
     * 
     */
    public Output<List<ImageGuestOsFeature>> getGuestOsFeatures() {
        return this.guestOsFeatures;
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
     * Labels to apply to this Image.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this Image.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Any applicable license URI.
     * 
     */
    @Export(name="licenses", type=List.class, parameters={String.class})
    private Output<List<String>> licenses;

    /**
     * @return Any applicable license URI.
     * 
     */
    public Output<List<String>> getLicenses() {
        return this.licenses;
    }
    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * The parameters of the raw disk image.
     * Structure is documented below.
     * 
     */
    @Export(name="rawDisk", type=ImageRawDisk.class, parameters={})
    private Output</* @Nullable */ ImageRawDisk> rawDisk;

    /**
     * @return The parameters of the raw disk image.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ImageRawDisk> getRawDisk() {
        return this.rawDisk;
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
     * The source disk to create this image based on.
     * You must provide either this property or the
     * rawDisk.source property but not both to create an image.
     * 
     */
    @Export(name="sourceDisk", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceDisk;

    /**
     * @return The source disk to create this image based on.
     * You must provide either this property or the
     * rawDisk.source property but not both to create an image.
     * 
     */
    public Output</* @Nullable */ String> getSourceDisk() {
        return this.sourceDisk;
    }
    /**
     * URL of the source image used to create this image. In order to create an image, you must provide the full or partial
     * URL of one of the following:
     * * The selfLink URL
     * * This property
     * * The rawDisk.source URL
     * * The sourceDisk URL
     * 
     */
    @Export(name="sourceImage", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceImage;

    /**
     * @return URL of the source image used to create this image. In order to create an image, you must provide the full or partial
     * URL of one of the following:
     * * The selfLink URL
     * * This property
     * * The rawDisk.source URL
     * * The sourceDisk URL
     * 
     */
    public Output</* @Nullable */ String> getSourceImage() {
        return this.sourceImage;
    }
    /**
     * URL of the source snapshot used to create this image.
     * In order to create an image, you must provide the full or partial URL of one of the following:
     * * The selfLink URL
     * * This property
     * * The sourceImage URL
     * * The rawDisk.source URL
     * * The sourceDisk URL
     * 
     */
    @Export(name="sourceSnapshot", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceSnapshot;

    /**
     * @return URL of the source snapshot used to create this image.
     * In order to create an image, you must provide the full or partial URL of one of the following:
     * * The selfLink URL
     * * This property
     * * The sourceImage URL
     * * The rawDisk.source URL
     * * The sourceDisk URL
     * 
     */
    public Output</* @Nullable */ String> getSourceSnapshot() {
        return this.sourceSnapshot;
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
        super("gcp:compute/image:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable ImageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/image:Image", name, state, makeResourceOptions(options, id));
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
    public static Image get(String name, Output<String> id, @Nullable ImageState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}
