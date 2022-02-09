// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.managednetwork.ManagedNetworkGroupArgs;
import io.pulumi.azurenative.managednetwork.outputs.ResourceIdResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:managednetwork:ManagedNetworkGroup")
public class ManagedNetworkGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="managementGroups", type=List.class, parameters={ResourceIdResponse.class})
    private Output</* @Nullable */ List<ResourceIdResponse>> managementGroups;

    public Output</* @Nullable */ List<ResourceIdResponse>> getManagementGroups() {
        return this.managementGroups;
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
    @OutputExport(name="subnets", type=List.class, parameters={ResourceIdResponse.class})
    private Output</* @Nullable */ List<ResourceIdResponse>> subnets;

    public Output</* @Nullable */ List<ResourceIdResponse>> getSubnets() {
        return this.subnets;
    }
    @OutputExport(name="subscriptions", type=List.class, parameters={ResourceIdResponse.class})
    private Output</* @Nullable */ List<ResourceIdResponse>> subscriptions;

    public Output</* @Nullable */ List<ResourceIdResponse>> getSubscriptions() {
        return this.subscriptions;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="virtualNetworks", type=List.class, parameters={ResourceIdResponse.class})
    private Output</* @Nullable */ List<ResourceIdResponse>> virtualNetworks;

    public Output</* @Nullable */ List<ResourceIdResponse>> getVirtualNetworks() {
        return this.virtualNetworks;
    }

    public ManagedNetworkGroup(String name, ManagedNetworkGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managednetwork:ManagedNetworkGroup", name, args == null ? ManagedNetworkGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ManagedNetworkGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managednetwork:ManagedNetworkGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:managednetwork/v20190601preview:ManagedNetworkGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ManagedNetworkGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedNetworkGroup(name, id, options);
    }
}
