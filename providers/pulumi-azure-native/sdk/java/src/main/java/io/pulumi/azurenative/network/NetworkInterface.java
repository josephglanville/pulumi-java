// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.NetworkInterfaceArgs;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceDnsSettingsResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceTapConfigurationResponse;
import io.pulumi.azurenative.network.outputs.NetworkSecurityGroupResponse;
import io.pulumi.azurenative.network.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.network.outputs.PrivateLinkServiceResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A network interface in a resource group.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:NetworkInterface test-nic /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkInterfaces/test-nic 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:NetworkInterface")
public class NetworkInterface extends io.pulumi.resources.CustomResource {
    /**
     * The DNS settings in network interface.
     * 
     */
    @Export(name="dnsSettings", type=NetworkInterfaceDnsSettingsResponse.class, parameters={})
    private Output</* @Nullable */ NetworkInterfaceDnsSettingsResponse> dnsSettings;

    /**
     * @return The DNS settings in network interface.
     * 
     */
    public Output</* @Nullable */ NetworkInterfaceDnsSettingsResponse> getDnsSettings() {
        return this.dnsSettings;
    }
    /**
     * A reference to the dscp configuration to which the network interface is linked.
     * 
     */
    @Export(name="dscpConfiguration", type=SubResourceResponse.class, parameters={})
    private Output<SubResourceResponse> dscpConfiguration;

    /**
     * @return A reference to the dscp configuration to which the network interface is linked.
     * 
     */
    public Output<SubResourceResponse> getDscpConfiguration() {
        return this.dscpConfiguration;
    }
    /**
     * If the network interface is accelerated networking enabled.
     * 
     */
    @Export(name="enableAcceleratedNetworking", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAcceleratedNetworking;

    /**
     * @return If the network interface is accelerated networking enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }
    /**
     * Indicates whether IP forwarding is enabled on this network interface.
     * 
     */
    @Export(name="enableIPForwarding", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableIPForwarding;

    /**
     * @return Indicates whether IP forwarding is enabled on this network interface.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableIPForwarding() {
        return this.enableIPForwarding;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The extended location of the network interface.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the network interface.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * A list of references to linked BareMetal resources.
     * 
     */
    @Export(name="hostedWorkloads", type=List.class, parameters={String.class})
    private Output<List<String>> hostedWorkloads;

    /**
     * @return A list of references to linked BareMetal resources.
     * 
     */
    public Output<List<String>> getHostedWorkloads() {
        return this.hostedWorkloads;
    }
    /**
     * A list of IPConfigurations of the network interface.
     * 
     */
    @Export(name="ipConfigurations", type=List.class, parameters={NetworkInterfaceIPConfigurationResponse.class})
    private Output</* @Nullable */ List<NetworkInterfaceIPConfigurationResponse>> ipConfigurations;

    /**
     * @return A list of IPConfigurations of the network interface.
     * 
     */
    public Output</* @Nullable */ List<NetworkInterfaceIPConfigurationResponse>> getIpConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The MAC address of the network interface.
     * 
     */
    @Export(name="macAddress", type=String.class, parameters={})
    private Output<String> macAddress;

    /**
     * @return The MAC address of the network interface.
     * 
     */
    public Output<String> getMacAddress() {
        return this.macAddress;
    }
    /**
     * Migration phase of Network Interface resource.
     * 
     */
    @Export(name="migrationPhase", type=String.class, parameters={})
    private Output</* @Nullable */ String> migrationPhase;

    /**
     * @return Migration phase of Network Interface resource.
     * 
     */
    public Output</* @Nullable */ String> getMigrationPhase() {
        return this.migrationPhase;
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
     * The reference to the NetworkSecurityGroup resource.
     * 
     */
    @Export(name="networkSecurityGroup", type=NetworkSecurityGroupResponse.class, parameters={})
    private Output</* @Nullable */ NetworkSecurityGroupResponse> networkSecurityGroup;

    /**
     * @return The reference to the NetworkSecurityGroup resource.
     * 
     */
    public Output</* @Nullable */ NetworkSecurityGroupResponse> getNetworkSecurityGroup() {
        return this.networkSecurityGroup;
    }
    /**
     * Type of Network Interface resource.
     * 
     */
    @Export(name="nicType", type=String.class, parameters={})
    private Output</* @Nullable */ String> nicType;

    /**
     * @return Type of Network Interface resource.
     * 
     */
    public Output</* @Nullable */ String> getNicType() {
        return this.nicType;
    }
    /**
     * Whether this is a primary network interface on a virtual machine.
     * 
     */
    @Export(name="primary", type=Boolean.class, parameters={})
    private Output<Boolean> primary;

    /**
     * @return Whether this is a primary network interface on a virtual machine.
     * 
     */
    public Output<Boolean> getPrimary() {
        return this.primary;
    }
    /**
     * A reference to the private endpoint to which the network interface is linked.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output<PrivateEndpointResponse> privateEndpoint;

    /**
     * @return A reference to the private endpoint to which the network interface is linked.
     * 
     */
    public Output<PrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * Privatelinkservice of the network interface resource.
     * 
     */
    @Export(name="privateLinkService", type=PrivateLinkServiceResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkServiceResponse> privateLinkService;

    /**
     * @return Privatelinkservice of the network interface resource.
     * 
     */
    public Output</* @Nullable */ PrivateLinkServiceResponse> getPrivateLinkService() {
        return this.privateLinkService;
    }
    /**
     * The provisioning state of the network interface resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the network interface resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the network interface resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the network interface resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
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
     * A list of TapConfigurations of the network interface.
     * 
     */
    @Export(name="tapConfigurations", type=List.class, parameters={NetworkInterfaceTapConfigurationResponse.class})
    private Output<List<NetworkInterfaceTapConfigurationResponse>> tapConfigurations;

    /**
     * @return A list of TapConfigurations of the network interface.
     * 
     */
    public Output<List<NetworkInterfaceTapConfigurationResponse>> getTapConfigurations() {
        return this.tapConfigurations;
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
     * The reference to a virtual machine.
     * 
     */
    @Export(name="virtualMachine", type=SubResourceResponse.class, parameters={})
    private Output<SubResourceResponse> virtualMachine;

    /**
     * @return The reference to a virtual machine.
     * 
     */
    public Output<SubResourceResponse> getVirtualMachine() {
        return this.virtualMachine;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInterface(String name) {
        this(name, NetworkInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterface(String name, NetworkInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterface(String name, NetworkInterfaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkInterface", name, args == null ? NetworkInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkInterface(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkInterface", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150501preview:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20150615:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:NetworkInterface").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:NetworkInterface").build())
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
    public static NetworkInterface get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterface(name, id, options);
    }
}
