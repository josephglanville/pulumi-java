// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ServiceEndpointPolicyDefinitionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:ServiceEndpointPolicyDefinition")
public class ServiceEndpointPolicyDefinition extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
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
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="service", type=String.class, parameters={})
    private Output</* @Nullable */ String> service;

    public Output</* @Nullable */ String> getService() {
        return this.service;
    }
    @OutputExport(name="serviceResources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> serviceResources;

    public Output</* @Nullable */ List<String>> getServiceResources() {
        return this.serviceResources;
    }

    public ServiceEndpointPolicyDefinition(String name, ServiceEndpointPolicyDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ServiceEndpointPolicyDefinition", name, args == null ? ServiceEndpointPolicyDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceEndpointPolicyDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ServiceEndpointPolicyDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180701:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:ServiceEndpointPolicyDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:ServiceEndpointPolicyDefinition").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServiceEndpointPolicyDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceEndpointPolicyDefinition(name, id, options);
    }
}
