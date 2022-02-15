// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.IntegrationRuntimeArgs;
import io.pulumi.azurenative.synapse.outputs.ManagedIntegrationRuntimeResponse;
import io.pulumi.azurenative.synapse.outputs.SelfHostedIntegrationRuntimeResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:synapse:IntegrationRuntime")
public class IntegrationRuntime extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=Either.class, parameters={ManagedIntegrationRuntimeResponse.class, SelfHostedIntegrationRuntimeResponse.class})
    private Output<Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse>> properties;

    public Output<Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse>> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public IntegrationRuntime(String name, IntegrationRuntimeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IntegrationRuntime", name, args == null ? IntegrationRuntimeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationRuntime(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IntegrationRuntime", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20190601preview:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20201201:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210301:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210501:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601:IntegrationRuntime").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:IntegrationRuntime").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IntegrationRuntime get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationRuntime(name, id, options);
    }
}