// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.PrivateCloudArgs;
import io.pulumi.azurenative.avs.outputs.CircuitResponse;
import io.pulumi.azurenative.avs.outputs.EndpointsResponse;
import io.pulumi.azurenative.avs.outputs.IdentitySourceResponse;
import io.pulumi.azurenative.avs.outputs.ManagementClusterResponse;
import io.pulumi.azurenative.avs.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:avs:PrivateCloud")
public class PrivateCloud extends io.pulumi.resources.CustomResource {
    @OutputExport(name="circuit", type=CircuitResponse.class, parameters={})
    private Output</* @Nullable */ CircuitResponse> circuit;

    public Output</* @Nullable */ CircuitResponse> getCircuit() {
        return this.circuit;
    }
    @OutputExport(name="endpoints", type=EndpointsResponse.class, parameters={})
    private Output<EndpointsResponse> endpoints;

    public Output<EndpointsResponse> getEndpoints() {
        return this.endpoints;
    }
    @OutputExport(name="identitySources", type=List.class, parameters={IdentitySourceResponse.class})
    private Output</* @Nullable */ List<IdentitySourceResponse>> identitySources;

    public Output</* @Nullable */ List<IdentitySourceResponse>> getIdentitySources() {
        return this.identitySources;
    }
    @OutputExport(name="internet", type=String.class, parameters={})
    private Output</* @Nullable */ String> internet;

    public Output</* @Nullable */ String> getInternet() {
        return this.internet;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="managementCluster", type=ManagementClusterResponse.class, parameters={})
    private Output<ManagementClusterResponse> managementCluster;

    public Output<ManagementClusterResponse> getManagementCluster() {
        return this.managementCluster;
    }
    @OutputExport(name="managementNetwork", type=String.class, parameters={})
    private Output<String> managementNetwork;

    public Output<String> getManagementNetwork() {
        return this.managementNetwork;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="networkBlock", type=String.class, parameters={})
    private Output<String> networkBlock;

    public Output<String> getNetworkBlock() {
        return this.networkBlock;
    }
    @OutputExport(name="nsxtCertificateThumbprint", type=String.class, parameters={})
    private Output<String> nsxtCertificateThumbprint;

    public Output<String> getNsxtCertificateThumbprint() {
        return this.nsxtCertificateThumbprint;
    }
    @OutputExport(name="nsxtPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> nsxtPassword;

    public Output</* @Nullable */ String> getNsxtPassword() {
        return this.nsxtPassword;
    }
    @OutputExport(name="provisioningNetwork", type=String.class, parameters={})
    private Output<String> provisioningNetwork;

    public Output<String> getProvisioningNetwork() {
        return this.provisioningNetwork;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
    @OutputExport(name="vcenterCertificateThumbprint", type=String.class, parameters={})
    private Output<String> vcenterCertificateThumbprint;

    public Output<String> getVcenterCertificateThumbprint() {
        return this.vcenterCertificateThumbprint;
    }
    @OutputExport(name="vcenterPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> vcenterPassword;

    public Output</* @Nullable */ String> getVcenterPassword() {
        return this.vcenterPassword;
    }
    @OutputExport(name="vmotionNetwork", type=String.class, parameters={})
    private Output<String> vmotionNetwork;

    public Output<String> getVmotionNetwork() {
        return this.vmotionNetwork;
    }

    public PrivateCloud(String name, PrivateCloudArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:PrivateCloud", name, args == null ? PrivateCloudArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateCloud(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:PrivateCloud", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:avs/v20200320:PrivateCloud").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20200717preview:PrivateCloud").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210101preview:PrivateCloud").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210601:PrivateCloud").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20211201:PrivateCloud").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PrivateCloud get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateCloud(name, id, options);
    }
}
