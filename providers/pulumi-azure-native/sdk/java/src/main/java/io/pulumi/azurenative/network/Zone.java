// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ZoneArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes a DNS zone.
 * API Version: 2018-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:Zone zone1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/dnsZones/zone1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:Zone")
public class Zone extends io.pulumi.resources.CustomResource {
    /**
     * The etag of the zone.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The etag of the zone.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The maximum number of record sets that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @Export(name="maxNumberOfRecordSets", type=Double.class, parameters={})
    private Output<Double> maxNumberOfRecordSets;

    /**
     * @return The maximum number of record sets that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getMaxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }
    /**
     * The maximum number of records per record set that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @Export(name="maxNumberOfRecordsPerRecordSet", type=Double.class, parameters={})
    private Output<Double> maxNumberOfRecordsPerRecordSet;

    /**
     * @return The maximum number of records per record set that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getMaxNumberOfRecordsPerRecordSet() {
        return this.maxNumberOfRecordsPerRecordSet;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name servers for this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @Export(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    /**
     * @return The name servers for this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<List<String>> getNameServers() {
        return this.nameServers;
    }
    /**
     * The current number of record sets in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    @Export(name="numberOfRecordSets", type=Double.class, parameters={})
    private Output<Double> numberOfRecordSets;

    /**
     * @return The current number of record sets in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Output<Double> getNumberOfRecordSets() {
        return this.numberOfRecordSets;
    }
    /**
     * A list of references to virtual networks that register hostnames in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    @Export(name="registrationVirtualNetworks", type=List.class, parameters={SubResourceResponse.class})
    private Output</* @Nullable */ List<SubResourceResponse>> registrationVirtualNetworks;

    /**
     * @return A list of references to virtual networks that register hostnames in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    public Output</* @Nullable */ List<SubResourceResponse>> getRegistrationVirtualNetworks() {
        return this.registrationVirtualNetworks;
    }
    /**
     * A list of references to virtual networks that resolve records in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    @Export(name="resolutionVirtualNetworks", type=List.class, parameters={SubResourceResponse.class})
    private Output</* @Nullable */ List<SubResourceResponse>> resolutionVirtualNetworks;

    /**
     * @return A list of references to virtual networks that resolve records in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    public Output</* @Nullable */ List<SubResourceResponse>> getResolutionVirtualNetworks() {
        return this.resolutionVirtualNetworks;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The type of this DNS zone (Public or Private).
     * 
     */
    @Export(name="zoneType", type=String.class, parameters={})
    private Output</* @Nullable */ String> zoneType;

    /**
     * @return The type of this DNS zone (Public or Private).
     * 
     */
    public Output</* @Nullable */ String> getZoneType() {
        return this.zoneType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Zone(String name) {
        this(name, ZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Zone(String name, ZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Zone(String name, ZoneArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Zone", name, args == null ? ZoneArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Zone(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Zone", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150504preview:Zone").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160401:Zone").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:Zone").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:Zone").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180301preview:Zone").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180501:Zone").build())
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
    public static Zone get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Zone(name, id, options);
    }
}
