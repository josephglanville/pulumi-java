// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PrivateZoneArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes a Private DNS zone.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:PrivateZone privatezone1.com /subscriptions/subscriptionId/resourceGroups/resourceGroup1/providers/Microsoft.Network/privateDnsZones/privatezone1.com 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PrivateZone")
public class PrivateZone extends io.pulumi.resources.CustomResource {
    /**
     * The ETag of the zone.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The ETag of the zone.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Private zone internal Id
     * 
     */
    @OutputExport(name="internalId", type=String.class, parameters={})
    private Output<String> internalId;

    /**
     * @return Private zone internal Id
     * 
     */
    public Output<String> getInternalId() {
        return this.internalId;
    }
    /**
     * The Azure Region where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The maximum number of record sets that can be created in this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @OutputExport(name="maxNumberOfRecordSets", type=Double.class, parameters={})
    private Output<Double> maxNumberOfRecordSets;

    /**
     * @return The maximum number of record sets that can be created in this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getMaxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }
    /**
     * The maximum number of virtual networks that can be linked to this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @OutputExport(name="maxNumberOfVirtualNetworkLinks", type=Double.class, parameters={})
    private Output<Double> maxNumberOfVirtualNetworkLinks;

    /**
     * @return The maximum number of virtual networks that can be linked to this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getMaxNumberOfVirtualNetworkLinks() {
        return this.maxNumberOfVirtualNetworkLinks;
    }
    /**
     * The maximum number of virtual networks that can be linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @OutputExport(name="maxNumberOfVirtualNetworkLinksWithRegistration", type=Double.class, parameters={})
    private Output<Double> maxNumberOfVirtualNetworkLinksWithRegistration;

    /**
     * @return The maximum number of virtual networks that can be linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getMaxNumberOfVirtualNetworkLinksWithRegistration() {
        return this.maxNumberOfVirtualNetworkLinksWithRegistration;
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
     * The current number of record sets in this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @OutputExport(name="numberOfRecordSets", type=Double.class, parameters={})
    private Output<Double> numberOfRecordSets;

    /**
     * @return The current number of record sets in this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getNumberOfRecordSets() {
        return this.numberOfRecordSets;
    }
    /**
     * The current number of virtual networks that are linked to this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @OutputExport(name="numberOfVirtualNetworkLinks", type=Double.class, parameters={})
    private Output<Double> numberOfVirtualNetworkLinks;

    /**
     * @return The current number of virtual networks that are linked to this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getNumberOfVirtualNetworkLinks() {
        return this.numberOfVirtualNetworkLinks;
    }
    /**
     * The current number of virtual networks that are linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @OutputExport(name="numberOfVirtualNetworkLinksWithRegistration", type=Double.class, parameters={})
    private Output<Double> numberOfVirtualNetworkLinksWithRegistration;

    /**
     * @return The current number of virtual networks that are linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getNumberOfVirtualNetworkLinksWithRegistration() {
        return this.numberOfVirtualNetworkLinksWithRegistration;
    }
    /**
     * The provisioning state of the resource. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. Example - 'Microsoft.Network/privateDnsZones'.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Example - 'Microsoft.Network/privateDnsZones'.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateZone(String name) {
        this(name, PrivateZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateZone(String name, PrivateZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateZone(String name, PrivateZoneArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateZone", name, args == null ? PrivateZoneArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateZone(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateZone", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180901:PrivateZone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200101:PrivateZone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:PrivateZone").build())
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
    public static PrivateZone get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateZone(name, id, options);
    }
}
