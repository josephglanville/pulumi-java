// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.peering.PeeringArgs;
import io.pulumi.azurenative.peering.outputs.PeeringPropertiesDirectResponse;
import io.pulumi.azurenative.peering.outputs.PeeringPropertiesExchangeResponse;
import io.pulumi.azurenative.peering.outputs.PeeringSkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Peering is a logical representation of a set of connections to the Microsoft Cloud Edge at a location.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:peering:Peering peeringName /subscriptions/subId/resourceGroups/rgName/providers/Microsoft.Peering/peerings/peeringName 
 * ```
 * 
 */
@ResourceType(type="azure-native:peering:Peering")
public class Peering extends io.pulumi.resources.CustomResource {
    /**
     * The properties that define a direct peering.
     * 
     */
    @OutputExport(name="direct", type=PeeringPropertiesDirectResponse.class, parameters={})
    private Output</* @Nullable */ PeeringPropertiesDirectResponse> direct;

    /**
     * @return The properties that define a direct peering.
     * 
     */
    public Output</* @Nullable */ PeeringPropertiesDirectResponse> getDirect() {
        return this.direct;
    }
    /**
     * The properties that define an exchange peering.
     * 
     */
    @OutputExport(name="exchange", type=PeeringPropertiesExchangeResponse.class, parameters={})
    private Output</* @Nullable */ PeeringPropertiesExchangeResponse> exchange;

    /**
     * @return The properties that define an exchange peering.
     * 
     */
    public Output</* @Nullable */ PeeringPropertiesExchangeResponse> getExchange() {
        return this.exchange;
    }
    /**
     * The kind of the peering.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the peering.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The location of the peering.
     * 
     */
    @OutputExport(name="peeringLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringLocation;

    /**
     * @return The location of the peering.
     * 
     */
    public Output</* @Nullable */ String> getPeeringLocation() {
        return this.peeringLocation;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU that defines the tier and kind of the peering.
     * 
     */
    @OutputExport(name="sku", type=PeeringSkuResponse.class, parameters={})
    private Output<PeeringSkuResponse> sku;

    /**
     * @return The SKU that defines the tier and kind of the peering.
     * 
     */
    public Output<PeeringSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(PeeringArgs.Builder a);
    }
    private static io.pulumi.azurenative.peering.PeeringArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.peering.PeeringArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Peering(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Peering(String name) {
        this(name, PeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Peering(String name, PeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Peering(String name, PeeringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:Peering", name, args == null ? PeeringArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Peering(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:Peering", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:peering/v20190801preview:Peering").build()),
                Output.of(Alias.builder().setType("azure-native:peering/v20190901preview:Peering").build()),
                Output.of(Alias.builder().setType("azure-native:peering/v20200101preview:Peering").build()),
                Output.of(Alias.builder().setType("azure-native:peering/v20200401:Peering").build()),
                Output.of(Alias.builder().setType("azure-native:peering/v20201001:Peering").build()),
                Output.of(Alias.builder().setType("azure-native:peering/v20210101:Peering").build()),
                Output.of(Alias.builder().setType("azure-native:peering/v20210601:Peering").build())
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
    public static Peering get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Peering(name, id, options);
    }
}
