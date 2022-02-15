// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.KubernetesRoleArgs;
import io.pulumi.azurenative.databoxedge.outputs.KubernetesClusterInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.KubernetesRoleResourcesResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:databoxedge:KubernetesRole")
public class KubernetesRole extends io.pulumi.resources.CustomResource {
    @OutputExport(name="hostPlatform", type=String.class, parameters={})
    private Output<String> hostPlatform;

    public Output<String> getHostPlatform() {
        return this.hostPlatform;
    }
    @OutputExport(name="hostPlatformType", type=String.class, parameters={})
    private Output<String> hostPlatformType;

    public Output<String> getHostPlatformType() {
        return this.hostPlatformType;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="kubernetesClusterInfo", type=KubernetesClusterInfoResponse.class, parameters={})
    private Output<KubernetesClusterInfoResponse> kubernetesClusterInfo;

    public Output<KubernetesClusterInfoResponse> getKubernetesClusterInfo() {
        return this.kubernetesClusterInfo;
    }
    @OutputExport(name="kubernetesRoleResources", type=KubernetesRoleResourcesResponse.class, parameters={})
    private Output<KubernetesRoleResourcesResponse> kubernetesRoleResources;

    public Output<KubernetesRoleResourcesResponse> getKubernetesRoleResources() {
        return this.kubernetesRoleResources;
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
    @OutputExport(name="roleStatus", type=String.class, parameters={})
    private Output<String> roleStatus;

    public Output<String> getRoleStatus() {
        return this.roleStatus;
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

    public KubernetesRole(String name, KubernetesRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:KubernetesRole", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private KubernetesRole(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:KubernetesRole", name, null, makeResourceOptions(options, id));
    }

    private static KubernetesRoleArgs makeArgs(KubernetesRoleArgs args) {
        var builder = args == null ? KubernetesRoleArgs.builder() : KubernetesRoleArgs.builder(args);
        return builder
            .setKind("Kubernetes")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190301:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190701:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190801:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200501preview:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:KubernetesRole").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:KubernetesRole").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static KubernetesRole get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KubernetesRole(name, id, options);
    }
}