// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.PipelineArgs;
import io.pulumi.azurenative.datafactory.outputs.AppendVariableActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataExplorerCommandActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFunctionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLBatchExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLUpdateResourceActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ControlActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.CopyActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.CustomActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DataLakeAnalyticsUSQLActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksNotebookActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksSparkJarActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksSparkPythonActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DeleteActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteDataFlowActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteSSISPackageActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteWranglingDataflowActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.FailActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.FilterActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ForEachActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.GetMetadataActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightHiveActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightMapReduceActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightPigActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightSparkActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightStreamingActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.IfConditionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.LookupActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.PipelinePolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.PipelineResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.SetVariableActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerStoredProcedureActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SwitchActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.UntilActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ValidationActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.VariableSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.WaitActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WebActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WebHookActivityResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Pipeline resource type.
 * API Version: 2018-06-01.
 * 
 */
@ResourceType(type="azure-native:datafactory:Pipeline")
public class Pipeline extends io.pulumi.resources.CustomResource {
    /**
     * List of activities in pipeline.
     * 
     */
    @Export(name="activities", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> activities;

    /**
     * @return List of activities in pipeline.
     * 
     */
    public Output</* @Nullable */ List<Object>> getActivities() {
        return this.activities;
    }
    /**
     * List of tags that can be used for describing the Pipeline.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the Pipeline.
     * 
     */
    public Output</* @Nullable */ List<Object>> getAnnotations() {
        return this.annotations;
    }
    /**
     * The max number of concurrent runs for the pipeline.
     * 
     */
    @Export(name="concurrency", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> concurrency;

    /**
     * @return The max number of concurrent runs for the pipeline.
     * 
     */
    public Output</* @Nullable */ Integer> getConcurrency() {
        return this.concurrency;
    }
    /**
     * The description of the pipeline.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the pipeline.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Etag identifies change in the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
     * 
     */
    @Export(name="folder", type=PipelineResponseFolder.class, parameters={})
    private Output</* @Nullable */ PipelineResponseFolder> folder;

    /**
     * @return The folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
     * 
     */
    public Output</* @Nullable */ PipelineResponseFolder> getFolder() {
        return this.folder;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of parameters for pipeline.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, ParameterSpecificationResponse.class})
    private Output</* @Nullable */ Map<String,ParameterSpecificationResponse>> parameters;

    /**
     * @return List of parameters for pipeline.
     * 
     */
    public Output</* @Nullable */ Map<String,ParameterSpecificationResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Pipeline Policy.
     * 
     */
    @Export(name="policy", type=PipelinePolicyResponse.class, parameters={})
    private Output</* @Nullable */ PipelinePolicyResponse> policy;

    /**
     * @return Pipeline Policy.
     * 
     */
    public Output</* @Nullable */ PipelinePolicyResponse> getPolicy() {
        return this.policy;
    }
    /**
     * Dimensions emitted by Pipeline.
     * 
     */
    @Export(name="runDimensions", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> runDimensions;

    /**
     * @return Dimensions emitted by Pipeline.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getRunDimensions() {
        return this.runDimensions;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * List of variables for pipeline.
     * 
     */
    @Export(name="variables", type=Map.class, parameters={String.class, VariableSpecificationResponse.class})
    private Output</* @Nullable */ Map<String,VariableSpecificationResponse>> variables;

    /**
     * @return List of variables for pipeline.
     * 
     */
    public Output</* @Nullable */ Map<String,VariableSpecificationResponse>> getVariables() {
        return this.variables;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:Pipeline", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datafactory/v20170901preview:Pipeline").build()),
                Output.of(Alias.builder().type("azure-native:datafactory/v20180601:Pipeline").build())
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
    public static Pipeline get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, options);
    }
}
