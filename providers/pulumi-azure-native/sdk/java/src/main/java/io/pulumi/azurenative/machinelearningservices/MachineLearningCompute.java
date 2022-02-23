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
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Machine Learning compute object wrapped into ARM resource envelope.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningservices:MachineLearningCompute compute123 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.MachineLearningServices/workspaces/workspaces123/computes/compute123 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:MachineLearningCompute")
public class MachineLearningCompute extends io.pulumi.resources.CustomResource {
    /**
     * The identity of the resource.
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Compute properties
     * 
     */
    @OutputExport(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Compute properties
     * 
     */
    public Output<Object> getProperties() {
        return this.properties;
    }
    /**
     * The sku of the workspace.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the workspace.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineLearningCompute(String name) {
        this(name, MachineLearningComputeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineLearningCompute(String name, MachineLearningComputeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
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

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MachineLearningCompute get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MachineLearningCompute(name, id, options);
    }
}
