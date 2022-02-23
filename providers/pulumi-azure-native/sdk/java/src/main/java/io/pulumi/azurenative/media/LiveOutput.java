// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.LiveOutputArgs;
import io.pulumi.azurenative.media.outputs.HlsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Live Output.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:media:LiveOutput myLiveOutput1 /subscriptions/0a6ec948-5a62-437d-b9df-934dc7c1b722/resourceGroups/mediaresources/providers/Microsoft.Media/mediaservices/slitestmedia10/liveevents/myLiveEvent1/liveoutputs/myLiveOutput1 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:LiveOutput")
public class LiveOutput extends io.pulumi.resources.CustomResource {
    /**
     * ISO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     * 
     */
    @OutputExport(name="archiveWindowLength", type=String.class, parameters={})
    private Output<String> archiveWindowLength;

    /**
     * @return ISO 8601 time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     * 
     */
    public Output<String> getArchiveWindowLength() {
        return this.archiveWindowLength;
    }
    /**
     * The asset that the live output will write to.
     * 
     */
    @OutputExport(name="assetName", type=String.class, parameters={})
    private Output<String> assetName;

    /**
     * @return The asset that the live output will write to.
     * 
     */
    public Output<String> getAssetName() {
        return this.assetName;
    }
    /**
     * The creation time the live output.
     * 
     */
    @OutputExport(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The creation time the live output.
     * 
     */
    public Output<String> getCreated() {
        return this.created;
    }
    /**
     * The description of the live output.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the live output.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * HTTP Live Streaming (HLS) packing setting for the live output.
     * 
     */
    @OutputExport(name="hls", type=HlsResponse.class, parameters={})
    private Output</* @Nullable */ HlsResponse> hls;

    /**
     * @return HTTP Live Streaming (HLS) packing setting for the live output.
     * 
     */
    public Output</* @Nullable */ HlsResponse> getHls() {
        return this.hls;
    }
    /**
     * The time the live output was last modified.
     * 
     */
    @OutputExport(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The time the live output was last modified.
     * 
     */
    public Output<String> getLastModified() {
        return this.lastModified;
    }
    /**
     * The manifest file name. If not provided, the service will generate one automatically.
     * 
     */
    @OutputExport(name="manifestName", type=String.class, parameters={})
    private Output</* @Nullable */ String> manifestName;

    /**
     * @return The manifest file name. If not provided, the service will generate one automatically.
     * 
     */
    public Output</* @Nullable */ String> getManifestName() {
        return this.manifestName;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The initial timestamp that the live output will start at, any content before this value will not be archived.
     * 
     */
    @OutputExport(name="outputSnapTime", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> outputSnapTime;

    /**
     * @return The initial timestamp that the live output will start at, any content before this value will not be archived.
     * 
     */
    public Output</* @Nullable */ Double> getOutputSnapTime() {
        return this.outputSnapTime;
    }
    /**
     * The provisioning state of the live output.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the live output.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource state of the live output.
     * 
     */
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return The resource state of the live output.
     * 
     */
    public Output<String> getResourceState() {
        return this.resourceState;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LiveOutput(String name) {
        this(name, LiveOutputArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LiveOutput(String name, LiveOutputArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LiveOutput(String name, LiveOutputArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:LiveOutput", name, args == null ? LiveOutputArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LiveOutput(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:LiveOutput", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:media/v20180330preview:LiveOutput").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20180601preview:LiveOutput").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20180701:LiveOutput").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20190501preview:LiveOutput").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20200501:LiveOutput").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20210601:LiveOutput").build())
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
    public static LiveOutput get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LiveOutput(name, id, options);
    }
}
