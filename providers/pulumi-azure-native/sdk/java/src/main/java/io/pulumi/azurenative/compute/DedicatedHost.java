// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.DedicatedHostArgs;
import io.pulumi.azurenative.compute.outputs.DedicatedHostInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.SkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:compute:DedicatedHost")
public class DedicatedHost extends io.pulumi.resources.CustomResource {
    @OutputExport(name="autoReplaceOnFailure", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoReplaceOnFailure;

    public Output</* @Nullable */ Boolean> getAutoReplaceOnFailure() {
        return this.autoReplaceOnFailure;
    }
    @OutputExport(name="hostId", type=String.class, parameters={})
    private Output<String> hostId;

    public Output<String> getHostId() {
        return this.hostId;
    }
    @OutputExport(name="instanceView", type=DedicatedHostInstanceViewResponse.class, parameters={})
    private Output<DedicatedHostInstanceViewResponse> instanceView;

    public Output<DedicatedHostInstanceViewResponse> getInstanceView() {
        return this.instanceView;
    }
    @OutputExport(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    public Output</* @Nullable */ String> getLicenseType() {
        return this.licenseType;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="platformFaultDomain", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformFaultDomain;

    public Output</* @Nullable */ Integer> getPlatformFaultDomain() {
        return this.platformFaultDomain;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="provisioningTime", type=String.class, parameters={})
    private Output<String> provisioningTime;

    public Output<String> getProvisioningTime() {
        return this.provisioningTime;
    }
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    public Output<SkuResponse> getSku() {
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
    @OutputExport(name="virtualMachines", type=List.class, parameters={SubResourceReadOnlyResponse.class})
    private Output<List<SubResourceReadOnlyResponse>> virtualMachines;

    public Output<List<SubResourceReadOnlyResponse>> getVirtualMachines() {
        return this.virtualMachines;
    }

    public DedicatedHost(String name, DedicatedHostArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:DedicatedHost", name, args == null ? DedicatedHostArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DedicatedHost(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:DedicatedHost", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20190301:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20190701:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20191201:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20200601:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20201201:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210301:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210701:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20211101:DedicatedHost").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DedicatedHost get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedHost(name, id, options);
    }
}
