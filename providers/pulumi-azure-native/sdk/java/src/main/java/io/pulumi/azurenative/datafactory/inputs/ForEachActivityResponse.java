// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.AppendVariableActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ControlActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.CopyActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.CustomActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DeleteActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExpressionResponse;
import io.pulumi.azurenative.datafactory.inputs.FailActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.FilterActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.GetMetadataActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.IfConditionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.LookupActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SetVariableActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SwitchActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.UntilActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.inputs.ValidationActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WaitActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WebActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WebHookActivityResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ForEachActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ForEachActivityResponse Empty = new ForEachActivityResponse();

    @InputImport(name="activities", required=true)
    private final List<Object> activities;

    public List<Object> getActivities() {
        return this.activities;
    }

    @InputImport(name="batchCount")
    private final @Nullable Integer batchCount;

    public Optional<Integer> getBatchCount() {
        return this.batchCount == null ? Optional.empty() : Optional.ofNullable(this.batchCount);
    }

    @InputImport(name="dependsOn")
    private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="isSequential")
    private final @Nullable Boolean isSequential;

    public Optional<Boolean> getIsSequential() {
        return this.isSequential == null ? Optional.empty() : Optional.ofNullable(this.isSequential);
    }

    @InputImport(name="items", required=true)
    private final ExpressionResponse items;

    public ExpressionResponse getItems() {
        return this.items;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="userProperties")
    private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public ForEachActivityResponse(
        List<Object> activities,
        @Nullable Integer batchCount,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Boolean isSequential,
        ExpressionResponse items,
        String name,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.activities = Objects.requireNonNull(activities, "expected parameter 'activities' to be non-null");
        this.batchCount = batchCount;
        this.dependsOn = dependsOn;
        this.description = description;
        this.isSequential = isSequential;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private ForEachActivityResponse() {
        this.activities = List.of();
        this.batchCount = null;
        this.dependsOn = List.of();
        this.description = null;
        this.isSequential = null;
        this.items = null;
        this.name = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForEachActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> activities;
        private @Nullable Integer batchCount;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Boolean isSequential;
        private ExpressionResponse items;
        private String name;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ForEachActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.batchCount = defaults.batchCount;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.isSequential = defaults.isSequential;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setActivities(List<Object> activities) {
            this.activities = Objects.requireNonNull(activities);
            return this;
        }

        public Builder setBatchCount(@Nullable Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIsSequential(@Nullable Boolean isSequential) {
            this.isSequential = isSequential;
            return this;
        }

        public Builder setItems(ExpressionResponse items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public ForEachActivityResponse build() {
            return new ForEachActivityResponse(activities, batchCount, dependsOn, description, isSequential, items, name, type, userProperties);
        }
    }
}
