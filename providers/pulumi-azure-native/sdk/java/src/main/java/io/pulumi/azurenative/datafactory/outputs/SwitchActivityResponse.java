// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
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
import io.pulumi.azurenative.datafactory.outputs.ExpressionResponse;
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
import io.pulumi.azurenative.datafactory.outputs.SetVariableActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerStoredProcedureActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SwitchCaseResponse;
import io.pulumi.azurenative.datafactory.outputs.UntilActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.outputs.ValidationActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WaitActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WebActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WebHookActivityResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchActivityResponse {
    /**
     * List of cases that correspond to expected values of the 'on' property. This is an optional property and if not provided, the activity will execute activities provided in defaultActivities.
     * 
     */
    private final @Nullable List<SwitchCaseResponse> cases;
    /**
     * List of activities to execute if no case condition is satisfied. This is an optional property and if not provided, the activity will exit without any action.
     * 
     */
    private final @Nullable List<Object> defaultActivities;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * An expression that would evaluate to a string or integer. This is used to determine the block of activities in cases that will be executed.
     * 
     */
    private final ExpressionResponse on;
    /**
     * Type of activity.
     * Expected value is 'Switch'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private SwitchActivityResponse(
        @CustomType.Parameter("cases") @Nullable List<SwitchCaseResponse> cases,
        @CustomType.Parameter("defaultActivities") @Nullable List<Object> defaultActivities,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("on") ExpressionResponse on,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.cases = cases;
        this.defaultActivities = defaultActivities;
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = name;
        this.on = on;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * List of cases that correspond to expected values of the 'on' property. This is an optional property and if not provided, the activity will execute activities provided in defaultActivities.
     * 
    */
    public List<SwitchCaseResponse> getCases() {
        return this.cases == null ? List.of() : this.cases;
    }
    /**
     * List of activities to execute if no case condition is satisfied. This is an optional property and if not provided, the activity will exit without any action.
     * 
    */
    public List<Object> getDefaultActivities() {
        return this.defaultActivities == null ? List.of() : this.defaultActivities;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * An expression that would evaluate to a string or integer. This is used to determine the block of activities in cases that will be executed.
     * 
    */
    public ExpressionResponse getOn() {
        return this.on;
    }
    /**
     * Type of activity.
     * Expected value is 'Switch'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SwitchCaseResponse> cases;
        private @Nullable List<Object> defaultActivities;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private String name;
        private ExpressionResponse on;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(SwitchActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cases = defaults.cases;
    	      this.defaultActivities = defaults.defaultActivities;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.on = defaults.on;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder cases(@Nullable List<SwitchCaseResponse> cases) {
            this.cases = cases;
            return this;
        }
        public Builder cases(SwitchCaseResponse... cases) {
            return cases(List.of(cases));
        }
        public Builder defaultActivities(@Nullable List<Object> defaultActivities) {
            this.defaultActivities = defaultActivities;
            return this;
        }
        public Builder defaultActivities(Object... defaultActivities) {
            return defaultActivities(List.of(defaultActivities));
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder on(ExpressionResponse on) {
            this.on = Objects.requireNonNull(on);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public SwitchActivityResponse build() {
            return new SwitchActivityResponse(cases, defaultActivities, dependsOn, description, name, on, type, userProperties);
        }
    }
}
