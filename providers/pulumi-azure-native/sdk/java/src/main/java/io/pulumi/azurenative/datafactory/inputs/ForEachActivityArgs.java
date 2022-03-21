// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
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
import io.pulumi.azurenative.datafactory.inputs.ExpressionArgs;
import io.pulumi.azurenative.datafactory.inputs.FailActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.FilterActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.GetMetadataActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.IfConditionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.LookupActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SetVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SwitchActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.UntilActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.azurenative.datafactory.inputs.ValidationActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WaitActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebHookActivityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This activity is used for iterating over a collection and execute given activities.
 * 
 */
public final class ForEachActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ForEachActivityArgs Empty = new ForEachActivityArgs();

    /**
     * List of activities to execute .
     * 
     */
    @Import(name="activities", required=true)
      private final Output<List<Object>> activities;

    public Output<List<Object>> getActivities() {
        return this.activities;
    }

    /**
     * Batch count to be used for controlling the number of parallel execution (when isSequential is set to false).
     * 
     */
    @Import(name="batchCount")
      private final @Nullable Output<Integer> batchCount;

    public Output<Integer> getBatchCount() {
        return this.batchCount == null ? Output.empty() : this.batchCount;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Output.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Should the loop be executed in sequence or in parallel (max 50)
     * 
     */
    @Import(name="isSequential")
      private final @Nullable Output<Boolean> isSequential;

    public Output<Boolean> getIsSequential() {
        return this.isSequential == null ? Output.empty() : this.isSequential;
    }

    /**
     * Collection to iterate.
     * 
     */
    @Import(name="items", required=true)
      private final Output<ExpressionArgs> items;

    public Output<ExpressionArgs> getItems() {
        return this.items;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Type of activity.
     * Expected value is 'ForEach'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Output.empty() : this.userProperties;
    }

    public ForEachActivityArgs(
        Output<List<Object>> activities,
        @Nullable Output<Integer> batchCount,
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> isSequential,
        Output<ExpressionArgs> items,
        Output<String> name,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties) {
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

    private ForEachActivityArgs() {
        this.activities = Output.empty();
        this.batchCount = Output.empty();
        this.dependsOn = Output.empty();
        this.description = Output.empty();
        this.isSequential = Output.empty();
        this.items = Output.empty();
        this.name = Output.empty();
        this.type = Output.empty();
        this.userProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForEachActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Object>> activities;
        private @Nullable Output<Integer> batchCount;
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> isSequential;
        private Output<ExpressionArgs> items;
        private Output<String> name;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ForEachActivityArgs defaults) {
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

        public Builder activities(Output<List<Object>> activities) {
            this.activities = Objects.requireNonNull(activities);
            return this;
        }
        public Builder activities(List<Object> activities) {
            this.activities = Output.of(Objects.requireNonNull(activities));
            return this;
        }
        public Builder activities(Object... activities) {
            return activities(List.of(activities));
        }
        public Builder batchCount(@Nullable Output<Integer> batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Builder batchCount(@Nullable Integer batchCount) {
            this.batchCount = Output.ofNullable(batchCount);
            return this;
        }
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Output.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder isSequential(@Nullable Output<Boolean> isSequential) {
            this.isSequential = isSequential;
            return this;
        }
        public Builder isSequential(@Nullable Boolean isSequential) {
            this.isSequential = Output.ofNullable(isSequential);
            return this;
        }
        public Builder items(Output<ExpressionArgs> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(ExpressionArgs items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Output.ofNullable(userProperties);
            return this;
        }
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }        public ForEachActivityArgs build() {
            return new ForEachActivityArgs(activities, batchCount, dependsOn, description, isSequential, items, name, type, userProperties);
        }
    }
}
