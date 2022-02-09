// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PrivateDnsZoneGroupArgs;
import io.pulumi.azurenative.network.outputs.PrivateDnsZoneConfigResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:PrivateDnsZoneGroup")
public class PrivateDnsZoneGroup extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="privateDnsZoneConfigs", type=List.class, parameters={PrivateDnsZoneConfigResponse.class})
    private Output</* @Nullable */ List<PrivateDnsZoneConfigResponse>> privateDnsZoneConfigs;

    public Output</* @Nullable */ List<PrivateDnsZoneConfigResponse>> getPrivateDnsZoneConfigs() {
        return this.privateDnsZoneConfigs;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }

    public PrivateDnsZoneGroup(String name, PrivateDnsZoneGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateDnsZoneGroup", name, args == null ? PrivateDnsZoneGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateDnsZoneGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateDnsZoneGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20200301:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:PrivateDnsZoneGroup").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:PrivateDnsZoneGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PrivateDnsZoneGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateDnsZoneGroup(name, id, options);
    }
}
