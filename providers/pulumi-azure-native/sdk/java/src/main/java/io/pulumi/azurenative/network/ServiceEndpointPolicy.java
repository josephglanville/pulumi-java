// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ServiceEndpointPolicyArgs;
import io.pulumi.azurenative.network.outputs.ServiceEndpointPolicyDefinitionResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:ServiceEndpointPolicy")
public class ServiceEndpointPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
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
    @OutputExport(name="serviceEndpointPolicyDefinitions", type=List.class, parameters={ServiceEndpointPolicyDefinitionResponse.class})
    private Output</* @Nullable */ List<ServiceEndpointPolicyDefinitionResponse>> serviceEndpointPolicyDefinitions;

    public Output</* @Nullable */ List<ServiceEndpointPolicyDefinitionResponse>> getServiceEndpointPolicyDefinitions() {
        return this.serviceEndpointPolicyDefinitions;
    }
    @OutputExport(name="subnets", type=List.class, parameters={SubnetResponse.class})
    private Output<List<SubnetResponse>> subnets;

    public Output<List<SubnetResponse>> getSubnets() {
        return this.subnets;
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

    public ServiceEndpointPolicy(String name, ServiceEndpointPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ServiceEndpointPolicy", name, args == null ? ServiceEndpointPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceEndpointPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ServiceEndpointPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180701:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:ServiceEndpointPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:ServiceEndpointPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServiceEndpointPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceEndpointPolicy(name, id, options);
    }
}