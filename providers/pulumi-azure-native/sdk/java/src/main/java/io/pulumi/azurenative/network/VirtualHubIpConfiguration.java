// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualHubIpConfigurationArgs;
import io.pulumi.azurenative.network.outputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * IpConfigurations.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualHubIpConfiguration ipconfig1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1/ipConfigurations/ipconfig1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualHubIpConfiguration")
public class VirtualHubIpConfiguration extends io.pulumi.resources.CustomResource {
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
     * Name of the Ip Configuration.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the Ip Configuration.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The private IP address of the IP configuration.
     * 
     */
    @OutputExport(name="privateIPAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateIPAddress;

    /**
     * @return The private IP address of the IP configuration.
     * 
     */
    public Output</* @Nullable */ String> getPrivateIPAddress() {
        return this.privateIPAddress;
    }
    /**
     * The private IP address allocation method.
     * 
     */
    @OutputExport(name="privateIPAllocationMethod", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateIPAllocationMethod;

    /**
     * @return The private IP address allocation method.
     * 
     */
    public Output</* @Nullable */ String> getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }
    /**
     * The provisioning state of the IP configuration resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the IP configuration resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the public IP resource.
     * 
     */
    @OutputExport(name="publicIPAddress", type=PublicIPAddressResponse.class, parameters={})
    private Output</* @Nullable */ PublicIPAddressResponse> publicIPAddress;

    /**
     * @return The reference to the public IP resource.
     * 
     */
    public Output</* @Nullable */ PublicIPAddressResponse> getPublicIPAddress() {
        return this.publicIPAddress;
    }
    /**
     * The reference to the subnet resource.
     * 
     */
    @OutputExport(name="subnet", type=SubnetResponse.class, parameters={})
    private Output</* @Nullable */ SubnetResponse> subnet;

    /**
     * @return The reference to the subnet resource.
     * 
     */
    public Output</* @Nullable */ SubnetResponse> getSubnet() {
        return this.subnet;
    }
    /**
     * Ipconfiguration type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Ipconfiguration type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualHubIpConfiguration(String name) {
        this(name, VirtualHubIpConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualHubIpConfiguration(String name, VirtualHubIpConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualHubIpConfiguration(String name, VirtualHubIpConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHubIpConfiguration", name, args == null ? VirtualHubIpConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualHubIpConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHubIpConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20200501:VirtualHubIpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:VirtualHubIpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:VirtualHubIpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:VirtualHubIpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:VirtualHubIpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:VirtualHubIpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:VirtualHubIpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:VirtualHubIpConfiguration").build())
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
    public static VirtualHubIpConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualHubIpConfiguration(name, id, options);
    }
}
