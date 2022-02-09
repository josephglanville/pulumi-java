// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.redhatopenshift.OpenShiftClusterArgs;
import io.pulumi.azurenative.redhatopenshift.outputs.APIServerProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.ClusterProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.ConsoleProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.IngressProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.MasterProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.ServicePrincipalProfileResponse;
import io.pulumi.azurenative.redhatopenshift.outputs.WorkerProfileResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:redhatopenshift:OpenShiftCluster")
public class OpenShiftCluster extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiserverProfile", type=APIServerProfileResponse.class, parameters={})
    private Output</* @Nullable */ APIServerProfileResponse> apiserverProfile;

    public Output</* @Nullable */ APIServerProfileResponse> getApiserverProfile() {
        return this.apiserverProfile;
    }
    @OutputExport(name="clusterProfile", type=ClusterProfileResponse.class, parameters={})
    private Output</* @Nullable */ ClusterProfileResponse> clusterProfile;

    public Output</* @Nullable */ ClusterProfileResponse> getClusterProfile() {
        return this.clusterProfile;
    }
    @OutputExport(name="consoleProfile", type=ConsoleProfileResponse.class, parameters={})
    private Output</* @Nullable */ ConsoleProfileResponse> consoleProfile;

    public Output</* @Nullable */ ConsoleProfileResponse> getConsoleProfile() {
        return this.consoleProfile;
    }
    @OutputExport(name="ingressProfiles", type=List.class, parameters={IngressProfileResponse.class})
    private Output</* @Nullable */ List<IngressProfileResponse>> ingressProfiles;

    public Output</* @Nullable */ List<IngressProfileResponse>> getIngressProfiles() {
        return this.ingressProfiles;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="masterProfile", type=MasterProfileResponse.class, parameters={})
    private Output</* @Nullable */ MasterProfileResponse> masterProfile;

    public Output</* @Nullable */ MasterProfileResponse> getMasterProfile() {
        return this.masterProfile;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    public Output</* @Nullable */ NetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="servicePrincipalProfile", type=ServicePrincipalProfileResponse.class, parameters={})
    private Output</* @Nullable */ ServicePrincipalProfileResponse> servicePrincipalProfile;

    public Output</* @Nullable */ ServicePrincipalProfileResponse> getServicePrincipalProfile() {
        return this.servicePrincipalProfile;
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
    @OutputExport(name="workerProfiles", type=List.class, parameters={WorkerProfileResponse.class})
    private Output</* @Nullable */ List<WorkerProfileResponse>> workerProfiles;

    public Output</* @Nullable */ List<WorkerProfileResponse>> getWorkerProfiles() {
        return this.workerProfiles;
    }

    public OpenShiftCluster(String name, OpenShiftClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:redhatopenshift:OpenShiftCluster", name, args == null ? OpenShiftClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private OpenShiftCluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:redhatopenshift:OpenShiftCluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:redhatopenshift/v20200430:OpenShiftCluster").build()),
                Input.of(Alias.builder().setType("azure-native:redhatopenshift/v20210901preview:OpenShiftCluster").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static OpenShiftCluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OpenShiftCluster(name, id, options);
    }
}
