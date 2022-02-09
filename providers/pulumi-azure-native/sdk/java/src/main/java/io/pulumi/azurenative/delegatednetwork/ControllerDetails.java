// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.delegatednetwork.ControllerDetailsArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:delegatednetwork:ControllerDetails")
public class ControllerDetails extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dncAppId", type=String.class, parameters={})
    private Output<String> dncAppId;

    public Output<String> getDncAppId() {
        return this.dncAppId;
    }
    @OutputExport(name="dncEndpoint", type=String.class, parameters={})
    private Output<String> dncEndpoint;

    public Output<String> getDncEndpoint() {
        return this.dncEndpoint;
    }
    @OutputExport(name="dncTenantId", type=String.class, parameters={})
    private Output<String> dncTenantId;

    public Output<String> getDncTenantId() {
        return this.dncTenantId;
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

    public ControllerDetails(String name, ControllerDetailsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:delegatednetwork:ControllerDetails", name, args == null ? ControllerDetailsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ControllerDetails(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:delegatednetwork:ControllerDetails", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:delegatednetwork/v20200808preview:ControllerDetails").build()),
                Input.of(Alias.builder().setType("azure-native:delegatednetwork/v20210315:ControllerDetails").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ControllerDetails get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ControllerDetails(name, id, options);
    }
}
