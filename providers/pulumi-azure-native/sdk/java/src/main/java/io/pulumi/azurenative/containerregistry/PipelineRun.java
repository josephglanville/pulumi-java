// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.PipelineRunArgs;
import io.pulumi.azurenative.containerregistry.outputs.PipelineRunRequestResponse;
import io.pulumi.azurenative.containerregistry.outputs.PipelineRunResponseResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:containerregistry:PipelineRun")
public class PipelineRun extends io.pulumi.resources.CustomResource {
    @OutputExport(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    public Output</* @Nullable */ String> getForceUpdateTag() {
        return this.forceUpdateTag;
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
    @OutputExport(name="request", type=PipelineRunRequestResponse.class, parameters={})
    private Output</* @Nullable */ PipelineRunRequestResponse> request;

    public Output</* @Nullable */ PipelineRunRequestResponse> getRequest() {
        return this.request;
    }
    @OutputExport(name="response", type=PipelineRunResponseResponse.class, parameters={})
    private Output<PipelineRunResponseResponse> response;

    public Output<PipelineRunResponseResponse> getResponse() {
        return this.response;
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

    public PipelineRun(String name, PipelineRunArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:PipelineRun", name, args == null ? PipelineRunArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PipelineRun(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:PipelineRun", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20191201preview:PipelineRun").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20201101preview:PipelineRun").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210601preview:PipelineRun").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210801preview:PipelineRun").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20211201preview:PipelineRun").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PipelineRun get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PipelineRun(name, id, options);
    }
}
