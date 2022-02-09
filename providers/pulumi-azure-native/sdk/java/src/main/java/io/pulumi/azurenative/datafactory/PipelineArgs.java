// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.datafactory.inputs.AppendVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ControlActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.CopyActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.CustomActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DeleteActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecutionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.FailActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.FilterActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ForEachActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.GetMetadataActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.IfConditionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.LookupActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.PipelineFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.PipelinePolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.SetVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SwitchActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.UntilActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ValidationActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.VariableSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.WaitActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebHookActivityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    @InputImport(name="activities")
    private final @Nullable Input<List<Object>> activities;

    public Input<List<Object>> getActivities() {
        return this.activities == null ? Input.empty() : this.activities;
    }

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="concurrency")
    private final @Nullable Input<Integer> concurrency;

    public Input<Integer> getConcurrency() {
        return this.concurrency == null ? Input.empty() : this.concurrency;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="factoryName", required=true)
    private final Input<String> factoryName;

    public Input<String> getFactoryName() {
        return this.factoryName;
    }

    @InputImport(name="folder")
    private final @Nullable Input<PipelineFolderArgs> folder;

    public Input<PipelineFolderArgs> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="pipelineName")
    private final @Nullable Input<String> pipelineName;

    public Input<String> getPipelineName() {
        return this.pipelineName == null ? Input.empty() : this.pipelineName;
    }

    @InputImport(name="policy")
    private final @Nullable Input<PipelinePolicyArgs> policy;

    public Input<PipelinePolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="runDimensions")
    private final @Nullable Input<Map<String,Object>> runDimensions;

    public Input<Map<String,Object>> getRunDimensions() {
        return this.runDimensions == null ? Input.empty() : this.runDimensions;
    }

    @InputImport(name="variables")
    private final @Nullable Input<Map<String,VariableSpecificationArgs>> variables;

    public Input<Map<String,VariableSpecificationArgs>> getVariables() {
        return this.variables == null ? Input.empty() : this.variables;
    }

    public PipelineArgs(
        @Nullable Input<List<Object>> activities,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Integer> concurrency,
        @Nullable Input<String> description,
        Input<String> factoryName,
        @Nullable Input<PipelineFolderArgs> folder,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<String> pipelineName,
        @Nullable Input<PipelinePolicyArgs> policy,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,Object>> runDimensions,
        @Nullable Input<Map<String,VariableSpecificationArgs>> variables) {
        this.activities = activities;
        this.annotations = annotations;
        this.concurrency = concurrency;
        this.description = description;
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.folder = folder;
        this.parameters = parameters;
        this.pipelineName = pipelineName;
        this.policy = policy;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runDimensions = runDimensions;
        this.variables = variables;
    }

    private PipelineArgs() {
        this.activities = Input.empty();
        this.annotations = Input.empty();
        this.concurrency = Input.empty();
        this.description = Input.empty();
        this.factoryName = Input.empty();
        this.folder = Input.empty();
        this.parameters = Input.empty();
        this.pipelineName = Input.empty();
        this.policy = Input.empty();
        this.resourceGroupName = Input.empty();
        this.runDimensions = Input.empty();
        this.variables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> activities;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Integer> concurrency;
        private @Nullable Input<String> description;
        private Input<String> factoryName;
        private @Nullable Input<PipelineFolderArgs> folder;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<String> pipelineName;
        private @Nullable Input<PipelinePolicyArgs> policy;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,Object>> runDimensions;
        private @Nullable Input<Map<String,VariableSpecificationArgs>> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.annotations = defaults.annotations;
    	      this.concurrency = defaults.concurrency;
    	      this.description = defaults.description;
    	      this.factoryName = defaults.factoryName;
    	      this.folder = defaults.folder;
    	      this.parameters = defaults.parameters;
    	      this.pipelineName = defaults.pipelineName;
    	      this.policy = defaults.policy;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runDimensions = defaults.runDimensions;
    	      this.variables = defaults.variables;
        }

        public Builder setActivities(@Nullable Input<List<Object>> activities) {
            this.activities = activities;
            return this;
        }

        public Builder setActivities(@Nullable List<Object> activities) {
            this.activities = Input.ofNullable(activities);
            return this;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setConcurrency(@Nullable Input<Integer> concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        public Builder setConcurrency(@Nullable Integer concurrency) {
            this.concurrency = Input.ofNullable(concurrency);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFactoryName(Input<String> factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Input.of(Objects.requireNonNull(factoryName));
            return this;
        }

        public Builder setFolder(@Nullable Input<PipelineFolderArgs> folder) {
            this.folder = folder;
            return this;
        }

        public Builder setFolder(@Nullable PipelineFolderArgs folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPipelineName(@Nullable Input<String> pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        public Builder setPipelineName(@Nullable String pipelineName) {
            this.pipelineName = Input.ofNullable(pipelineName);
            return this;
        }

        public Builder setPolicy(@Nullable Input<PipelinePolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable PipelinePolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRunDimensions(@Nullable Input<Map<String,Object>> runDimensions) {
            this.runDimensions = runDimensions;
            return this;
        }

        public Builder setRunDimensions(@Nullable Map<String,Object> runDimensions) {
            this.runDimensions = Input.ofNullable(runDimensions);
            return this;
        }

        public Builder setVariables(@Nullable Input<Map<String,VariableSpecificationArgs>> variables) {
            this.variables = variables;
            return this;
        }

        public Builder setVariables(@Nullable Map<String,VariableSpecificationArgs> variables) {
            this.variables = Input.ofNullable(variables);
            return this;
        }

        public PipelineArgs build() {
            return new PipelineArgs(activities, annotations, concurrency, description, factoryName, folder, parameters, pipelineName, policy, resourceGroupName, runDimensions, variables);
        }
    }
}
