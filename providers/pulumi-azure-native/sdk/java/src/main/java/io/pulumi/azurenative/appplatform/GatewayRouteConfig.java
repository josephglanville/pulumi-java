// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.GatewayRouteConfigArgs;
import io.pulumi.azurenative.appplatform.outputs.GatewayRouteConfigPropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:appplatform:GatewayRouteConfig")
public class GatewayRouteConfig extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=GatewayRouteConfigPropertiesResponse.class, parameters={})
    private Output<GatewayRouteConfigPropertiesResponse> properties;

    public Output<GatewayRouteConfigPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public GatewayRouteConfig(String name, GatewayRouteConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:GatewayRouteConfig", name, args == null ? GatewayRouteConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GatewayRouteConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:GatewayRouteConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:appplatform/v20220101preview:GatewayRouteConfig").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static GatewayRouteConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GatewayRouteConfig(name, id, options);
    }
}