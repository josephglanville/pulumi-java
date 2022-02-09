// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ExpressRouteConnectionArgs;
import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringIdResponse;
import io.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:ExpressRouteConnection")
public class ExpressRouteConnection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    public Output</* @Nullable */ String> getAuthorizationKey() {
        return this.authorizationKey;
    }
    @OutputExport(name="enableInternetSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableInternetSecurity;

    public Output</* @Nullable */ Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity;
    }
    @OutputExport(name="expressRouteCircuitPeering", type=ExpressRouteCircuitPeeringIdResponse.class, parameters={})
    private Output<ExpressRouteCircuitPeeringIdResponse> expressRouteCircuitPeering;

    public Output<ExpressRouteCircuitPeeringIdResponse> getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }
    @OutputExport(name="expressRouteGatewayBypass", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> expressRouteGatewayBypass;

    public Output</* @Nullable */ Boolean> getExpressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
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
    @OutputExport(name="routingConfiguration", type=RoutingConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ RoutingConfigurationResponse> routingConfiguration;

    public Output</* @Nullable */ RoutingConfigurationResponse> getRoutingConfiguration() {
        return this.routingConfiguration;
    }
    @OutputExport(name="routingWeight", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> routingWeight;

    public Output</* @Nullable */ Integer> getRoutingWeight() {
        return this.routingWeight;
    }

    public ExpressRouteConnection(String name, ExpressRouteConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteConnection", name, args == null ? ExpressRouteConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ExpressRouteConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180801:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:ExpressRouteConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:ExpressRouteConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ExpressRouteConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteConnection(name, id, options);
    }
}
