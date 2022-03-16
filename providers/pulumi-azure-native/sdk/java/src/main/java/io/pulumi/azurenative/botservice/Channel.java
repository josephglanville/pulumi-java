// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.botservice.ChannelArgs;
import io.pulumi.azurenative.botservice.outputs.AlexaChannelResponse;
import io.pulumi.azurenative.botservice.outputs.DirectLineChannelResponse;
import io.pulumi.azurenative.botservice.outputs.DirectLineSpeechChannelResponse;
import io.pulumi.azurenative.botservice.outputs.EmailChannelResponse;
import io.pulumi.azurenative.botservice.outputs.FacebookChannelResponse;
import io.pulumi.azurenative.botservice.outputs.KikChannelResponse;
import io.pulumi.azurenative.botservice.outputs.LineChannelResponse;
import io.pulumi.azurenative.botservice.outputs.MsTeamsChannelResponse;
import io.pulumi.azurenative.botservice.outputs.SkuResponse;
import io.pulumi.azurenative.botservice.outputs.SkypeChannelResponse;
import io.pulumi.azurenative.botservice.outputs.SlackChannelResponse;
import io.pulumi.azurenative.botservice.outputs.SmsChannelResponse;
import io.pulumi.azurenative.botservice.outputs.TelegramChannelResponse;
import io.pulumi.azurenative.botservice.outputs.WebChatChannelResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Bot channel resource definition
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:botservice:Channel myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.BotService/botServices/{resourceName}/channels/{channelName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:botservice:Channel")
public class Channel extends io.pulumi.resources.CustomResource {
    /**
     * Entity Tag
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Entity Tag
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Required. Gets or sets the Kind of the resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Required. Gets or sets the Kind of the resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The set of properties specific to bot channel resource
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return The set of properties specific to bot channel resource
     * 
     */
    public Output<Object> getProperties() {
        return this.properties;
    }
    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Gets or sets the SKU of the resource.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Entity zones
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output<List<String>> zones;

    /**
     * @return Entity zones
     * 
     */
    public Output<List<String>> getZones() {
        return this.zones;
    }

    public interface BuilderApplicator {
        public void apply(ChannelArgs.Builder a);
    }
    private static io.pulumi.azurenative.botservice.ChannelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.botservice.ChannelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Channel(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Channel(String name) {
        this(name, ChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Channel(String name, ChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, ChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:botservice:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Channel(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:botservice:Channel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:botservice/v20171201:Channel").build()),
                Output.of(Alias.builder().type("azure-native:botservice/v20180712:Channel").build()),
                Output.of(Alias.builder().type("azure-native:botservice/v20200602:Channel").build()),
                Output.of(Alias.builder().type("azure-native:botservice/v20210301:Channel").build()),
                Output.of(Alias.builder().type("azure-native:botservice/v20210501preview:Channel").build())
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
    public static Channel get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, options);
    }
}
