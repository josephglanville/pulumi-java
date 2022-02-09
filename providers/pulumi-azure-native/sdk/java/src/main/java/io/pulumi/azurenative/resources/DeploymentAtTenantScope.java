// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.DeploymentAtTenantScopeArgs;
import io.pulumi.azurenative.resources.outputs.DeploymentPropertiesExtendedResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:resources:DeploymentAtTenantScope")
public class DeploymentAtTenantScope extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="properties", type=DeploymentPropertiesExtendedResponse.class, parameters={})
    private Output<DeploymentPropertiesExtendedResponse> properties;

    public Output<DeploymentPropertiesExtendedResponse> getProperties() {
        return this.properties;
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

    public DeploymentAtTenantScope(String name, DeploymentAtTenantScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtTenantScope", name, args == null ? DeploymentAtTenantScopeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DeploymentAtTenantScope(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtTenantScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:resources/v20190701:DeploymentAtTenantScope").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20190801:DeploymentAtTenantScope").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20191001:DeploymentAtTenantScope").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20200601:DeploymentAtTenantScope").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20200801:DeploymentAtTenantScope").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20201001:DeploymentAtTenantScope").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20210101:DeploymentAtTenantScope").build()),
                Input.of(Alias.builder().setType("azure-native:resources/v20210401:DeploymentAtTenantScope").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DeploymentAtTenantScope get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentAtTenantScope(name, id, options);
    }
}
