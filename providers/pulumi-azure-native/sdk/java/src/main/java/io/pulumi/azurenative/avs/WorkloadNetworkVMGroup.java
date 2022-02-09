// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.WorkloadNetworkVMGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:avs:WorkloadNetworkVMGroup")
public class WorkloadNetworkVMGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> members;

    public Output</* @Nullable */ List<String>> getMembers() {
        return this.members;
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
    @OutputExport(name="revision", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> revision;

    public Output</* @Nullable */ Double> getRevision() {
        return this.revision;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WorkloadNetworkVMGroup(String name, WorkloadNetworkVMGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkVMGroup", name, args == null ? WorkloadNetworkVMGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkloadNetworkVMGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkVMGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:avs/v20200717preview:WorkloadNetworkVMGroup").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210101preview:WorkloadNetworkVMGroup").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210601:WorkloadNetworkVMGroup").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20211201:WorkloadNetworkVMGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WorkloadNetworkVMGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadNetworkVMGroup(name, id, options);
    }
}
