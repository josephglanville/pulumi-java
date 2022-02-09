// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualNetworkGatewayArgs;
import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.BgpSettingsResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkGatewayIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkGatewaySkuResponse;
import io.pulumi.azurenative.network.outputs.VpnClientConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:VirtualNetworkGateway")
public class VirtualNetworkGateway extends io.pulumi.resources.CustomResource {
    @OutputExport(name="activeActive", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> activeActive;

    public Output</* @Nullable */ Boolean> getActiveActive() {
        return this.activeActive;
    }
    @OutputExport(name="bgpSettings", type=BgpSettingsResponse.class, parameters={})
    private Output</* @Nullable */ BgpSettingsResponse> bgpSettings;

    public Output</* @Nullable */ BgpSettingsResponse> getBgpSettings() {
        return this.bgpSettings;
    }
    @OutputExport(name="customRoutes", type=AddressSpaceResponse.class, parameters={})
    private Output</* @Nullable */ AddressSpaceResponse> customRoutes;

    public Output</* @Nullable */ AddressSpaceResponse> getCustomRoutes() {
        return this.customRoutes;
    }
    @OutputExport(name="enableBgp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBgp;

    public Output</* @Nullable */ Boolean> getEnableBgp() {
        return this.enableBgp;
    }
    @OutputExport(name="enableDnsForwarding", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDnsForwarding;

    public Output</* @Nullable */ Boolean> getEnableDnsForwarding() {
        return this.enableDnsForwarding;
    }
    @OutputExport(name="enablePrivateIpAddress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePrivateIpAddress;

    public Output</* @Nullable */ Boolean> getEnablePrivateIpAddress() {
        return this.enablePrivateIpAddress;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    @OutputExport(name="gatewayDefaultSite", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> gatewayDefaultSite;

    public Output</* @Nullable */ SubResourceResponse> getGatewayDefaultSite() {
        return this.gatewayDefaultSite;
    }
    @OutputExport(name="gatewayType", type=String.class, parameters={})
    private Output</* @Nullable */ String> gatewayType;

    public Output</* @Nullable */ String> getGatewayType() {
        return this.gatewayType;
    }
    @OutputExport(name="inboundDnsForwardingEndpoint", type=String.class, parameters={})
    private Output<String> inboundDnsForwardingEndpoint;

    public Output<String> getInboundDnsForwardingEndpoint() {
        return this.inboundDnsForwardingEndpoint;
    }
    @OutputExport(name="ipConfigurations", type=List.class, parameters={VirtualNetworkGatewayIPConfigurationResponse.class})
    private Output</* @Nullable */ List<VirtualNetworkGatewayIPConfigurationResponse>> ipConfigurations;

    public Output</* @Nullable */ List<VirtualNetworkGatewayIPConfigurationResponse>> getIpConfigurations() {
        return this.ipConfigurations;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    @OutputExport(name="sku", type=VirtualNetworkGatewaySkuResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkGatewaySkuResponse> sku;

    public Output</* @Nullable */ VirtualNetworkGatewaySkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="vNetExtendedLocationResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vNetExtendedLocationResourceId;

    public Output</* @Nullable */ String> getVNetExtendedLocationResourceId() {
        return this.vNetExtendedLocationResourceId;
    }
    @OutputExport(name="vpnClientConfiguration", type=VpnClientConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ VpnClientConfigurationResponse> vpnClientConfiguration;

    public Output</* @Nullable */ VpnClientConfigurationResponse> getVpnClientConfiguration() {
        return this.vpnClientConfiguration;
    }
    @OutputExport(name="vpnGatewayGeneration", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnGatewayGeneration;

    public Output</* @Nullable */ String> getVpnGatewayGeneration() {
        return this.vpnGatewayGeneration;
    }
    @OutputExport(name="vpnType", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnType;

    public Output</* @Nullable */ String> getVpnType() {
        return this.vpnType;
    }

    public VirtualNetworkGateway(String name, VirtualNetworkGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetworkGateway", name, args == null ? VirtualNetworkGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualNetworkGateway(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetworkGateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20150615:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160330:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160601:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20160901:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20161201:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170301:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170601:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170801:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170901:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171001:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171101:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180101:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180201:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180401:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:VirtualNetworkGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:VirtualNetworkGateway").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static VirtualNetworkGateway get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkGateway(name, id, options);
    }
}
