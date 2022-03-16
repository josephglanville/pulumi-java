// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.GalleryApplicationVersionArgs;
import io.pulumi.azurenative.compute.outputs.GalleryApplicationVersionPublishingProfileResponse;
import io.pulumi.azurenative.compute.outputs.ReplicationStatusResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Specifies information about the gallery Application Version that you want to create or update.
 * API Version: 2020-09-30.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:GalleryApplicationVersion 1.0.0 /subscriptions/01523d7c-60da-455e-adef-521b547922c4/resourceGroups/galleryPsTestRg98/providers/Microsoft.Compute/galleries/galleryPsTestGallery6165/applications/galleryPsTestGalleryApplication7825/versions/1.0.0 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:GalleryApplicationVersion")
public class GalleryApplicationVersion extends io.pulumi.resources.CustomResource {
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The publishing profile of a gallery image version.
     * 
     */
    @Export(name="publishingProfile", type=GalleryApplicationVersionPublishingProfileResponse.class, parameters={})
    private Output<GalleryApplicationVersionPublishingProfileResponse> publishingProfile;

    /**
     * @return The publishing profile of a gallery image version.
     * 
     */
    public Output<GalleryApplicationVersionPublishingProfileResponse> getPublishingProfile() {
        return this.publishingProfile;
    }
    /**
     * This is the replication status of the gallery image version.
     * 
     */
    @Export(name="replicationStatus", type=ReplicationStatusResponse.class, parameters={})
    private Output<ReplicationStatusResponse> replicationStatus;

    /**
     * @return This is the replication status of the gallery image version.
     * 
     */
    public Output<ReplicationStatusResponse> getReplicationStatus() {
        return this.replicationStatus;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(GalleryApplicationVersionArgs.Builder a);
    }
    private static io.pulumi.azurenative.compute.GalleryApplicationVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.compute.GalleryApplicationVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GalleryApplicationVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GalleryApplicationVersion(String name) {
        this(name, GalleryApplicationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GalleryApplicationVersion(String name, GalleryApplicationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GalleryApplicationVersion(String name, GalleryApplicationVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:GalleryApplicationVersion", name, args == null ? GalleryApplicationVersionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private GalleryApplicationVersion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:GalleryApplicationVersion", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20190301:GalleryApplicationVersion").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:GalleryApplicationVersion").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:GalleryApplicationVersion").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200930:GalleryApplicationVersion").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:GalleryApplicationVersion").build())
            ))
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
    public static GalleryApplicationVersion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GalleryApplicationVersion(name, id, options);
    }
}
