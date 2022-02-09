// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.MachineLearningComputeArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AmlComputeResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ComputeInstanceResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.DataFactoryResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.DataLakeAnalyticsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.DatabricksResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.HDInsightResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.VirtualMachineResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:machinelearningservices:MachineLearningCompute")
public class MachineLearningCompute extends io.pulumi.resources.CustomResource {
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
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
    @OutputExport(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    public Output<Object> getProperties() {
        return this.properties;
    }
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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

    public MachineLearningCompute(String name, MachineLearningComputeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:MachineLearningCompute", name, args == null ? MachineLearningComputeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MachineLearningCompute(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:MachineLearningCompute", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20180301preview:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20181119:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20190501:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20190601:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20191101:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200101:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200218preview:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200301:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200401:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200501preview:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200515preview:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200601:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200801:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200901preview:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210101:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210301preview:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210401:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210701:MachineLearningCompute").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20220101preview:MachineLearningCompute").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static MachineLearningCompute get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MachineLearningCompute(name, id, options);
    }
}
