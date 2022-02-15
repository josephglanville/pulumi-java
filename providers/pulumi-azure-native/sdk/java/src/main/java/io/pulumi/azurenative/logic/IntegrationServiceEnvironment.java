// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationServiceEnvironmentArgs;
import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentPropertiesResponse;
import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentSkuResponse;
import io.pulumi.azurenative.logic.outputs.ManagedServiceIdentityResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:logic:IntegrationServiceEnvironment")
public class IntegrationServiceEnvironment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
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
    @OutputExport(name="properties", type=IntegrationServiceEnvironmentPropertiesResponse.class, parameters={})
    private Output<IntegrationServiceEnvironmentPropertiesResponse> properties;

    public Output<IntegrationServiceEnvironmentPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="sku", type=IntegrationServiceEnvironmentSkuResponse.class, parameters={})
    private Output</* @Nullable */ IntegrationServiceEnvironmentSkuResponse> sku;

    public Output</* @Nullable */ IntegrationServiceEnvironmentSkuResponse> getSku() {
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

    public IntegrationServiceEnvironment(String name, IntegrationServiceEnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironment", name, args == null ? IntegrationServiceEnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationServiceEnvironment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20190501:IntegrationServiceEnvironment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IntegrationServiceEnvironment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationServiceEnvironment(name, id, options);
    }
}