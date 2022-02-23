// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PacketCaptureArgs;
import io.pulumi.azurenative.network.outputs.PacketCaptureFilterResponse;
import io.pulumi.azurenative.network.outputs.PacketCaptureStorageLocationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Information about packet capture session.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:PacketCapture pc1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkWatchers/nw1/packetCaptures/pc1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PacketCapture")
public class PacketCapture extends io.pulumi.resources.CustomResource {
    /**
     * Number of bytes captured per packet, the remaining bytes are truncated.
     * 
     */
    @OutputExport(name="bytesToCapturePerPacket", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> bytesToCapturePerPacket;

    /**
     * @return Number of bytes captured per packet, the remaining bytes are truncated.
     * 
     */
    public Output</* @Nullable */ Double> getBytesToCapturePerPacket() {
        return this.bytesToCapturePerPacket;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * A list of packet capture filters.
     * 
     */
    @OutputExport(name="filters", type=List.class, parameters={PacketCaptureFilterResponse.class})
    private Output</* @Nullable */ List<PacketCaptureFilterResponse>> filters;

    /**
     * @return A list of packet capture filters.
     * 
     */
    public Output</* @Nullable */ List<PacketCaptureFilterResponse>> getFilters() {
        return this.filters;
    }
    /**
     * Name of the packet capture session.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the packet capture session.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the packet capture session.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the packet capture session.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The storage location for a packet capture session.
     * 
     */
    @OutputExport(name="storageLocation", type=PacketCaptureStorageLocationResponse.class, parameters={})
    private Output<PacketCaptureStorageLocationResponse> storageLocation;

    /**
     * @return The storage location for a packet capture session.
     * 
     */
    public Output<PacketCaptureStorageLocationResponse> getStorageLocation() {
        return this.storageLocation;
    }
    /**
     * The ID of the targeted resource, only VM is currently supported.
     * 
     */
    @OutputExport(name="target", type=String.class, parameters={})
    private Output<String> target;

    /**
     * @return The ID of the targeted resource, only VM is currently supported.
     * 
     */
    public Output<String> getTarget() {
        return this.target;
    }
    /**
     * Maximum duration of the capture session in seconds.
     * 
     */
    @OutputExport(name="timeLimitInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeLimitInSeconds;

    /**
     * @return Maximum duration of the capture session in seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getTimeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }
    /**
     * Maximum size of the capture output.
     * 
     */
    @OutputExport(name="totalBytesPerSession", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> totalBytesPerSession;

    /**
     * @return Maximum size of the capture output.
     * 
     */
    public Output</* @Nullable */ Double> getTotalBytesPerSession() {
        return this.totalBytesPerSession;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PacketCapture(String name) {
        this(name, PacketCaptureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PacketCapture(String name, PacketCaptureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PacketCapture(String name, PacketCaptureArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PacketCapture", name, args == null ? PacketCaptureArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PacketCapture(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PacketCapture", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20160901:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20161201:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170301:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170601:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170801:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170901:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171001:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171101:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180101:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180201:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180401:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:PacketCapture").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:PacketCapture").build())
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
    public static PacketCapture get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PacketCapture(name, id, options);
    }
}
