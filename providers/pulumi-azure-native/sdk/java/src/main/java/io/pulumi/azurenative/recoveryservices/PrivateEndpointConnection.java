// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.recoveryservices.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:recoveryservices:PrivateEndpointConnection")
public class PrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
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
    @OutputExport(name="properties", type=PrivateEndpointConnectionResponse.class, parameters={})
    private Output<PrivateEndpointConnectionResponse> properties;

    public Output<PrivateEndpointConnectionResponse> getProperties() {
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

    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateEndpointConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20200202:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20201001:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20201201:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210101:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210201:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210201preview:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210210:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210301:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210401:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210601:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210701:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210801:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211001:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211201:PrivateEndpointConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PrivateEndpointConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}