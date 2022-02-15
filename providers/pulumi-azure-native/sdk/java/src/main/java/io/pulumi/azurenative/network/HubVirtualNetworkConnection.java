// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.HubVirtualNetworkConnectionArgs;
import io.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:HubVirtualNetworkConnection")
public class HubVirtualNetworkConnection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowHubToRemoteVnetTransit", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowHubToRemoteVnetTransit;

    public Output</* @Nullable */ Boolean> getAllowHubToRemoteVnetTransit() {
        return this.allowHubToRemoteVnetTransit;
    }
    @OutputExport(name="allowRemoteVnetToUseHubVnetGateways", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowRemoteVnetToUseHubVnetGateways;

    public Output</* @Nullable */ Boolean> getAllowRemoteVnetToUseHubVnetGateways() {
        return this.allowRemoteVnetToUseHubVnetGateways;
    }
    @OutputExport(name="enableInternetSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableInternetSecurity;

    public Output</* @Nullable */ Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="remoteVirtualNetwork", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> remoteVirtualNetwork;

    public Output</* @Nullable */ SubResourceResponse> getRemoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }
    @OutputExport(name="routingConfiguration", type=RoutingConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ RoutingConfigurationResponse> routingConfiguration;

    public Output</* @Nullable */ RoutingConfigurationResponse> getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    public HubVirtualNetworkConnection(String name, HubVirtualNetworkConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:HubVirtualNetworkConnection", name, args == null ? HubVirtualNetworkConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HubVirtualNetworkConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:HubVirtualNetworkConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20200501:HubVirtualNetworkConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:HubVirtualNetworkConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:HubVirtualNetworkConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:HubVirtualNetworkConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:HubVirtualNetworkConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:HubVirtualNetworkConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:HubVirtualNetworkConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:HubVirtualNetworkConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static HubVirtualNetworkConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HubVirtualNetworkConnection(name, id, options);
    }
}