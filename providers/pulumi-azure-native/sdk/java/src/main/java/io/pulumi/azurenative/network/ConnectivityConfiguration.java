// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ConnectivityConfigurationArgs;
import io.pulumi.azurenative.network.outputs.ConnectivityGroupItemResponse;
import io.pulumi.azurenative.network.outputs.HubResponse;
import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:ConnectivityConfiguration")
public class ConnectivityConfiguration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appliesToGroups", type=List.class, parameters={ConnectivityGroupItemResponse.class})
    private Output</* @Nullable */ List<ConnectivityGroupItemResponse>> appliesToGroups;

    public Output</* @Nullable */ List<ConnectivityGroupItemResponse>> getAppliesToGroups() {
        return this.appliesToGroups;
    }
    @OutputExport(name="connectivityTopology", type=String.class, parameters={})
    private Output<String> connectivityTopology;

    public Output<String> getConnectivityTopology() {
        return this.connectivityTopology;
    }
    @OutputExport(name="deleteExistingPeering", type=String.class, parameters={})
    private Output</* @Nullable */ String> deleteExistingPeering;

    public Output</* @Nullable */ String> getDeleteExistingPeering() {
        return this.deleteExistingPeering;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="hubs", type=List.class, parameters={HubResponse.class})
    private Output</* @Nullable */ List<HubResponse>> hubs;

    public Output</* @Nullable */ List<HubResponse>> getHubs() {
        return this.hubs;
    }
    @OutputExport(name="isGlobal", type=String.class, parameters={})
    private Output</* @Nullable */ String> isGlobal;

    public Output</* @Nullable */ String> getIsGlobal() {
        return this.isGlobal;
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

    public ConnectivityConfiguration(String name, ConnectivityConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ConnectivityConfiguration", name, args == null ? ConnectivityConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConnectivityConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ConnectivityConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20210201preview:ConnectivityConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501preview:ConnectivityConfiguration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ConnectivityConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConnectivityConfiguration(name, id, options);
    }
}
