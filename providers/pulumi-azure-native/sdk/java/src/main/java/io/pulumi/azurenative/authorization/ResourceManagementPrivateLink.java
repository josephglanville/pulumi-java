// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.ResourceManagementPrivateLinkArgs;
import io.pulumi.azurenative.authorization.outputs.ResourceManagementPrivateLinkEndpointConnectionsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:authorization:ResourceManagementPrivateLink")
public class ResourceManagementPrivateLink extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="properties", type=ResourceManagementPrivateLinkEndpointConnectionsResponse.class, parameters={})
    private Output<ResourceManagementPrivateLinkEndpointConnectionsResponse> properties;

    public Output<ResourceManagementPrivateLinkEndpointConnectionsResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ResourceManagementPrivateLink(String name, ResourceManagementPrivateLinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ResourceManagementPrivateLink", name, args == null ? ResourceManagementPrivateLinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceManagementPrivateLink(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ResourceManagementPrivateLink", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:authorization/v20200501:ResourceManagementPrivateLink").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ResourceManagementPrivateLink get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceManagementPrivateLink(name, id, options);
    }
}
