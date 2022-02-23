// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.DataFlowReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.DataFlowStagingInfoArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityTypePropertiesComputeArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.PowerQuerySinkArgs;
import io.pulumi.azurenative.datafactory.inputs.PowerQuerySinkMappingArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Execute power query activity.
 * 
 */
public final class ExecuteWranglingDataflowActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecuteWranglingDataflowActivityArgs Empty = new ExecuteWranglingDataflowActivityArgs();

    /**
     * Compute properties for data flow activity.
     * 
     */
    @InputImport(name="compute")
      private final @Nullable Input<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute;

    public Input<ExecuteDataFlowActivityTypePropertiesComputeArgs> getCompute() {
        return this.compute == null ? Input.empty() : this.compute;
    }

    /**
     * Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
     * 
     */
    @InputImport(name="continueOnError")
      private final @Nullable Input<Object> continueOnError;

    public Input<Object> getContinueOnError() {
        return this.continueOnError == null ? Input.empty() : this.continueOnError;
    }

    /**
     * Data flow reference.
     * 
     */
    @InputImport(name="dataFlow", required=true)
      private final Input<DataFlowReferenceArgs> dataFlow;

    public Input<DataFlowReferenceArgs> getDataFlow() {
        return this.dataFlow;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="integrationRuntime")
      private final @Nullable Input<IntegrationRuntimeReferenceArgs> integrationRuntime;

    public Input<IntegrationRuntimeReferenceArgs> getIntegrationRuntime() {
        return this.integrationRuntime == null ? Input.empty() : this.integrationRuntime;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * List of mapping for Power Query mashup query to sink dataset(s).
     * 
     */
    @InputImport(name="queries")
      private final @Nullable Input<List<PowerQuerySinkMappingArgs>> queries;

    public Input<List<PowerQuerySinkMappingArgs>> getQueries() {
        return this.queries == null ? Input.empty() : this.queries;
    }

    /**
     * Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
     * 
     */
    @InputImport(name="runConcurrently")
      private final @Nullable Input<Object> runConcurrently;

    public Input<Object> getRunConcurrently() {
        return this.runConcurrently == null ? Input.empty() : this.runConcurrently;
    }

    /**
     * (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
     * 
     */
    @InputImport(name="sinks")
      private final @Nullable Input<Map<String,PowerQuerySinkArgs>> sinks;

    public Input<Map<String,PowerQuerySinkArgs>> getSinks() {
        return this.sinks == null ? Input.empty() : this.sinks;
    }

    /**
     * Staging info for execute data flow activity.
     * 
     */
    @InputImport(name="staging")
      private final @Nullable Input<DataFlowStagingInfoArgs> staging;

    public Input<DataFlowStagingInfoArgs> getStaging() {
        return this.staging == null ? Input.empty() : this.staging;
    }

    /**
     * Trace level setting used for data flow monitoring output. Supported values are: 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="traceLevel")
      private final @Nullable Input<Object> traceLevel;

    public Input<Object> getTraceLevel() {
        return this.traceLevel == null ? Input.empty() : this.traceLevel;
    }

    /**
     * Type of activity.
     * Expected value is 'ExecuteWranglingDataflow'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
      private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    public ExecuteWranglingDataflowActivityArgs(
        @Nullable Input<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute,
        @Nullable Input<Object> continueOnError,
        Input<DataFlowReferenceArgs> dataFlow,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<IntegrationRuntimeReferenceArgs> integrationRuntime,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        @Nullable Input<List<PowerQuerySinkMappingArgs>> queries,
        @Nullable Input<Object> runConcurrently,
        @Nullable Input<Map<String,PowerQuerySinkArgs>> sinks,
        @Nullable Input<DataFlowStagingInfoArgs> staging,
        @Nullable Input<Object> traceLevel,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.compute = compute;
        this.continueOnError = continueOnError;
        this.dataFlow = Objects.requireNonNull(dataFlow, "expected parameter 'dataFlow' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.integrationRuntime = integrationRuntime;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.queries = queries;
        this.runConcurrently = runConcurrently;
        this.sinks = sinks;
        this.staging = staging;
        this.traceLevel = traceLevel;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private ExecuteWranglingDataflowActivityArgs() {
        this.compute = Input.empty();
        this.continueOnError = Input.empty();
        this.dataFlow = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.integrationRuntime = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.queries = Input.empty();
        this.runConcurrently = Input.empty();
        this.sinks = Input.empty();
        this.staging = Input.empty();
        this.traceLevel = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteWranglingDataflowActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute;
        private @Nullable Input<Object> continueOnError;
        private Input<DataFlowReferenceArgs> dataFlow;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> integrationRuntime;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private @Nullable Input<List<PowerQuerySinkMappingArgs>> queries;
        private @Nullable Input<Object> runConcurrently;
        private @Nullable Input<Map<String,PowerQuerySinkArgs>> sinks;
        private @Nullable Input<DataFlowStagingInfoArgs> staging;
        private @Nullable Input<Object> traceLevel;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteWranglingDataflowActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compute = defaults.compute;
    	      this.continueOnError = defaults.continueOnError;
    	      this.dataFlow = defaults.dataFlow;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.integrationRuntime = defaults.integrationRuntime;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.queries = defaults.queries;
    	      this.runConcurrently = defaults.runConcurrently;
    	      this.sinks = defaults.sinks;
    	      this.staging = defaults.staging;
    	      this.traceLevel = defaults.traceLevel;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setCompute(@Nullable Input<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute) {
            this.compute = compute;
            return this;
        }

        public Builder setCompute(@Nullable ExecuteDataFlowActivityTypePropertiesComputeArgs compute) {
            this.compute = Input.ofNullable(compute);
            return this;
        }

        public Builder setContinueOnError(@Nullable Input<Object> continueOnError) {
            this.continueOnError = continueOnError;
            return this;
        }

        public Builder setContinueOnError(@Nullable Object continueOnError) {
            this.continueOnError = Input.ofNullable(continueOnError);
            return this;
        }

        public Builder setDataFlow(Input<DataFlowReferenceArgs> dataFlow) {
            this.dataFlow = Objects.requireNonNull(dataFlow);
            return this;
        }

        public Builder setDataFlow(DataFlowReferenceArgs dataFlow) {
            this.dataFlow = Input.of(Objects.requireNonNull(dataFlow));
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
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

        public Builder setIntegrationRuntime(@Nullable Input<IntegrationRuntimeReferenceArgs> integrationRuntime) {
            this.integrationRuntime = integrationRuntime;
            return this;
        }

        public Builder setIntegrationRuntime(@Nullable IntegrationRuntimeReferenceArgs integrationRuntime) {
            this.integrationRuntime = Input.ofNullable(integrationRuntime);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPolicy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setQueries(@Nullable Input<List<PowerQuerySinkMappingArgs>> queries) {
            this.queries = queries;
            return this;
        }

        public Builder setQueries(@Nullable List<PowerQuerySinkMappingArgs> queries) {
            this.queries = Input.ofNullable(queries);
            return this;
        }

        public Builder setRunConcurrently(@Nullable Input<Object> runConcurrently) {
            this.runConcurrently = runConcurrently;
            return this;
        }

        public Builder setRunConcurrently(@Nullable Object runConcurrently) {
            this.runConcurrently = Input.ofNullable(runConcurrently);
            return this;
        }

        public Builder setSinks(@Nullable Input<Map<String,PowerQuerySinkArgs>> sinks) {
            this.sinks = sinks;
            return this;
        }

        public Builder setSinks(@Nullable Map<String,PowerQuerySinkArgs> sinks) {
            this.sinks = Input.ofNullable(sinks);
            return this;
        }

        public Builder setStaging(@Nullable Input<DataFlowStagingInfoArgs> staging) {
            this.staging = staging;
            return this;
        }

        public Builder setStaging(@Nullable DataFlowStagingInfoArgs staging) {
            this.staging = Input.ofNullable(staging);
            return this;
        }

        public Builder setTraceLevel(@Nullable Input<Object> traceLevel) {
            this.traceLevel = traceLevel;
            return this;
        }

        public Builder setTraceLevel(@Nullable Object traceLevel) {
            this.traceLevel = Input.ofNullable(traceLevel);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }
        public ExecuteWranglingDataflowActivityArgs build() {
            return new ExecuteWranglingDataflowActivityArgs(compute, continueOnError, dataFlow, dependsOn, description, integrationRuntime, name, policy, queries, runConcurrently, sinks, staging, traceLevel, type, userProperties);
        }
    }
}
