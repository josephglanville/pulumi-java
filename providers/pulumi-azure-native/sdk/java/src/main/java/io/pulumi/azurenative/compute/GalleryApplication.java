// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.GalleryApplicationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Specifies information about the gallery Application Definition that you want to create or update.
 * API Version: 2020-09-30.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:GalleryApplication myGalleryApplicationName /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/galleries/myGalleryName/applications/myGalleryApplicationName 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:GalleryApplication")
public class GalleryApplication extends io.pulumi.resources.CustomResource {
    /**
     * The description of this gallery Application Definition resource. This property is updatable.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of this gallery Application Definition resource. This property is updatable.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    @Export(name="endOfLifeDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> endOfLifeDate;

    /**
     * @return The end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    public Output</* @Nullable */ String> getEndOfLifeDate() {
        return this.endOfLifeDate;
    }
    /**
     * The Eula agreement for the gallery Application Definition.
     * 
     */
    @Export(name="eula", type=String.class, parameters={})
    private Output</* @Nullable */ String> eula;

    /**
     * @return The Eula agreement for the gallery Application Definition.
     * 
     */
    public Output</* @Nullable */ String> getEula() {
        return this.eula;
    }
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
     * The privacy statement uri.
     * 
     */
    @Export(name="privacyStatementUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> privacyStatementUri;

    /**
     * @return The privacy statement uri.
     * 
     */
    public Output</* @Nullable */ String> getPrivacyStatementUri() {
        return this.privacyStatementUri;
    }
    /**
     * The release note uri.
     * 
     */
    @Export(name="releaseNoteUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> releaseNoteUri;

    /**
     * @return The release note uri.
     * 
     */
    public Output</* @Nullable */ String> getReleaseNoteUri() {
        return this.releaseNoteUri;
    }
    /**
     * This property allows you to specify the supported type of the OS that application is built for. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    @Export(name="supportedOSType", type=String.class, parameters={})
    private Output<String> supportedOSType;

    /**
     * @return This property allows you to specify the supported type of the OS that application is built for. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    public Output<String> getSupportedOSType() {
        return this.supportedOSType;
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GalleryApplication(String name) {
        this(name, GalleryApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GalleryApplication(String name, GalleryApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GalleryApplication(String name, GalleryApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:GalleryApplication", name, args == null ? GalleryApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GalleryApplication(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:GalleryApplication", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20190301:GalleryApplication").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:GalleryApplication").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:GalleryApplication").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200930:GalleryApplication").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:GalleryApplication").build())
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
    public static GalleryApplication get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GalleryApplication(name, id, options);
    }
}
