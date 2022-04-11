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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="compute")
      private final @Nullable Output<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute;

    public Output<ExecuteDataFlowActivityTypePropertiesComputeArgs> getCompute() {
        return this.compute == null ? Codegen.empty() : this.compute;
    }

    /**
     * Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
     * 
     */
    @Import(name="continueOnError")
      private final @Nullable Output<Object> continueOnError;

    public Output<Object> getContinueOnError() {
        return this.continueOnError == null ? Codegen.empty() : this.continueOnError;
    }

    /**
     * Data flow reference.
     * 
     */
    @Import(name="dataFlow", required=true)
      private final Output<DataFlowReferenceArgs> dataFlow;

    public Output<DataFlowReferenceArgs> getDataFlow() {
        return this.dataFlow;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Codegen.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="integrationRuntime")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> integrationRuntime;

    public Output<IntegrationRuntimeReferenceArgs> getIntegrationRuntime() {
        return this.integrationRuntime == null ? Codegen.empty() : this.integrationRuntime;
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
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<ActivityPolicyArgs> policy;

    public Output<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * List of mapping for Power Query mashup query to sink dataset(s).
     * 
     */
    @Import(name="queries")
      private final @Nullable Output<List<PowerQuerySinkMappingArgs>> queries;

    public Output<List<PowerQuerySinkMappingArgs>> getQueries() {
        return this.queries == null ? Codegen.empty() : this.queries;
    }

    /**
     * Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
     * 
     */
    @Import(name="runConcurrently")
      private final @Nullable Output<Object> runConcurrently;

    public Output<Object> getRunConcurrently() {
        return this.runConcurrently == null ? Codegen.empty() : this.runConcurrently;
    }

    /**
     * (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
     * 
     */
    @Import(name="sinks")
      private final @Nullable Output<Map<String,PowerQuerySinkArgs>> sinks;

    public Output<Map<String,PowerQuerySinkArgs>> getSinks() {
        return this.sinks == null ? Codegen.empty() : this.sinks;
    }

    /**
     * Staging info for execute data flow activity.
     * 
     */
    @Import(name="staging")
      private final @Nullable Output<DataFlowStagingInfoArgs> staging;

    public Output<DataFlowStagingInfoArgs> getStaging() {
        return this.staging == null ? Codegen.empty() : this.staging;
    }

    /**
     * Trace level setting used for data flow monitoring output. Supported values are: 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="traceLevel")
      private final @Nullable Output<Object> traceLevel;

    public Output<Object> getTraceLevel() {
        return this.traceLevel == null ? Codegen.empty() : this.traceLevel;
    }

    /**
     * Type of activity.
     * Expected value is 'ExecuteWranglingDataflow'.
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
        return this.userProperties == null ? Codegen.empty() : this.userProperties;
    }

    public ExecuteWranglingDataflowActivityArgs(
        @Nullable Output<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute,
        @Nullable Output<Object> continueOnError,
        Output<DataFlowReferenceArgs> dataFlow,
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<IntegrationRuntimeReferenceArgs> integrationRuntime,
        Output<String> name,
        @Nullable Output<ActivityPolicyArgs> policy,
        @Nullable Output<List<PowerQuerySinkMappingArgs>> queries,
        @Nullable Output<Object> runConcurrently,
        @Nullable Output<Map<String,PowerQuerySinkArgs>> sinks,
        @Nullable Output<DataFlowStagingInfoArgs> staging,
        @Nullable Output<Object> traceLevel,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties) {
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
        this.compute = Codegen.empty();
        this.continueOnError = Codegen.empty();
        this.dataFlow = Codegen.empty();
        this.dependsOn = Codegen.empty();
        this.description = Codegen.empty();
        this.integrationRuntime = Codegen.empty();
        this.name = Codegen.empty();
        this.policy = Codegen.empty();
        this.queries = Codegen.empty();
        this.runConcurrently = Codegen.empty();
        this.sinks = Codegen.empty();
        this.staging = Codegen.empty();
        this.traceLevel = Codegen.empty();
        this.type = Codegen.empty();
        this.userProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteWranglingDataflowActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute;
        private @Nullable Output<Object> continueOnError;
        private Output<DataFlowReferenceArgs> dataFlow;
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> integrationRuntime;
        private Output<String> name;
        private @Nullable Output<ActivityPolicyArgs> policy;
        private @Nullable Output<List<PowerQuerySinkMappingArgs>> queries;
        private @Nullable Output<Object> runConcurrently;
        private @Nullable Output<Map<String,PowerQuerySinkArgs>> sinks;
        private @Nullable Output<DataFlowStagingInfoArgs> staging;
        private @Nullable Output<Object> traceLevel;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;

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

        public Builder compute(@Nullable Output<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute) {
            this.compute = compute;
            return this;
        }
        public Builder compute(@Nullable ExecuteDataFlowActivityTypePropertiesComputeArgs compute) {
            this.compute = Codegen.ofNullable(compute);
            return this;
        }
        public Builder continueOnError(@Nullable Output<Object> continueOnError) {
            this.continueOnError = continueOnError;
            return this;
        }
        public Builder continueOnError(@Nullable Object continueOnError) {
            this.continueOnError = Codegen.ofNullable(continueOnError);
            return this;
        }
        public Builder dataFlow(Output<DataFlowReferenceArgs> dataFlow) {
            this.dataFlow = Objects.requireNonNull(dataFlow);
            return this;
        }
        public Builder dataFlow(DataFlowReferenceArgs dataFlow) {
            this.dataFlow = Output.of(Objects.requireNonNull(dataFlow));
            return this;
        }
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Codegen.ofNullable(dependsOn);
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
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder integrationRuntime(@Nullable Output<IntegrationRuntimeReferenceArgs> integrationRuntime) {
            this.integrationRuntime = integrationRuntime;
            return this;
        }
        public Builder integrationRuntime(@Nullable IntegrationRuntimeReferenceArgs integrationRuntime) {
            this.integrationRuntime = Codegen.ofNullable(integrationRuntime);
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
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder queries(@Nullable Output<List<PowerQuerySinkMappingArgs>> queries) {
            this.queries = queries;
            return this;
        }
        public Builder queries(@Nullable List<PowerQuerySinkMappingArgs> queries) {
            this.queries = Codegen.ofNullable(queries);
            return this;
        }
        public Builder queries(PowerQuerySinkMappingArgs... queries) {
            return queries(List.of(queries));
        }
        public Builder runConcurrently(@Nullable Output<Object> runConcurrently) {
            this.runConcurrently = runConcurrently;
            return this;
        }
        public Builder runConcurrently(@Nullable Object runConcurrently) {
            this.runConcurrently = Codegen.ofNullable(runConcurrently);
            return this;
        }
        public Builder sinks(@Nullable Output<Map<String,PowerQuerySinkArgs>> sinks) {
            this.sinks = sinks;
            return this;
        }
        public Builder sinks(@Nullable Map<String,PowerQuerySinkArgs> sinks) {
            this.sinks = Codegen.ofNullable(sinks);
            return this;
        }
        public Builder staging(@Nullable Output<DataFlowStagingInfoArgs> staging) {
            this.staging = staging;
            return this;
        }
        public Builder staging(@Nullable DataFlowStagingInfoArgs staging) {
            this.staging = Codegen.ofNullable(staging);
            return this;
        }
        public Builder traceLevel(@Nullable Output<Object> traceLevel) {
            this.traceLevel = traceLevel;
            return this;
        }
        public Builder traceLevel(@Nullable Object traceLevel) {
            this.traceLevel = Codegen.ofNullable(traceLevel);
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
            this.userProperties = Codegen.ofNullable(userProperties);
            return this;
        }
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }        public ExecuteWranglingDataflowActivityArgs build() {
            return new ExecuteWranglingDataflowActivityArgs(compute, continueOnError, dataFlow, dependsOn, description, integrationRuntime, name, policy, queries, runConcurrently, sinks, staging, traceLevel, type, userProperties);
        }
    }
}
