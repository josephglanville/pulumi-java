// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.DataFlowReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.DataFlowStagingInfoResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityTypePropertiesResponseCompute;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExecuteDataFlowActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecuteDataFlowActivityResponse Empty = new ExecuteDataFlowActivityResponse();

    @InputImport(name="compute")
    private final @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute;

    public Optional<ExecuteDataFlowActivityTypePropertiesResponseCompute> getCompute() {
        return this.compute == null ? Optional.empty() : Optional.ofNullable(this.compute);
    }

    @InputImport(name="continueOnError")
    private final @Nullable Object continueOnError;

    public Optional<Object> getContinueOnError() {
        return this.continueOnError == null ? Optional.empty() : Optional.ofNullable(this.continueOnError);
    }

    @InputImport(name="dataFlow", required=true)
    private final DataFlowReferenceResponse dataFlow;

    public DataFlowReferenceResponse getDataFlow() {
        return this.dataFlow;
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

    @InputImport(name="integrationRuntime")
    private final @Nullable IntegrationRuntimeReferenceResponse integrationRuntime;

    public Optional<IntegrationRuntimeReferenceResponse> getIntegrationRuntime() {
        return this.integrationRuntime == null ? Optional.empty() : Optional.ofNullable(this.integrationRuntime);
    }

    @InputImport(name="linkedServiceName")
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="policy")
    private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    @InputImport(name="runConcurrently")
    private final @Nullable Object runConcurrently;

    public Optional<Object> getRunConcurrently() {
        return this.runConcurrently == null ? Optional.empty() : Optional.ofNullable(this.runConcurrently);
    }

    @InputImport(name="staging")
    private final @Nullable DataFlowStagingInfoResponse staging;

    public Optional<DataFlowStagingInfoResponse> getStaging() {
        return this.staging == null ? Optional.empty() : Optional.ofNullable(this.staging);
    }

    @InputImport(name="traceLevel")
    private final @Nullable Object traceLevel;

    public Optional<Object> getTraceLevel() {
        return this.traceLevel == null ? Optional.empty() : Optional.ofNullable(this.traceLevel);
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

    public ExecuteDataFlowActivityResponse(
        @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute,
        @Nullable Object continueOnError,
        DataFlowReferenceResponse dataFlow,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable IntegrationRuntimeReferenceResponse integrationRuntime,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable Object runConcurrently,
        @Nullable DataFlowStagingInfoResponse staging,
        @Nullable Object traceLevel,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.compute = compute;
        this.continueOnError = continueOnError;
        this.dataFlow = Objects.requireNonNull(dataFlow, "expected parameter 'dataFlow' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.integrationRuntime = integrationRuntime;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.runConcurrently = runConcurrently;
        this.staging = staging;
        this.traceLevel = traceLevel;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private ExecuteDataFlowActivityResponse() {
        this.compute = null;
        this.continueOnError = null;
        this.dataFlow = null;
        this.dependsOn = List.of();
        this.description = null;
        this.integrationRuntime = null;
        this.linkedServiceName = null;
        this.name = null;
        this.policy = null;
        this.runConcurrently = null;
        this.staging = null;
        this.traceLevel = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteDataFlowActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute;
        private @Nullable Object continueOnError;
        private DataFlowReferenceResponse dataFlow;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable IntegrationRuntimeReferenceResponse integrationRuntime;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Object runConcurrently;
        private @Nullable DataFlowStagingInfoResponse staging;
        private @Nullable Object traceLevel;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteDataFlowActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compute = defaults.compute;
    	      this.continueOnError = defaults.continueOnError;
    	      this.dataFlow = defaults.dataFlow;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.integrationRuntime = defaults.integrationRuntime;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.runConcurrently = defaults.runConcurrently;
    	      this.staging = defaults.staging;
    	      this.traceLevel = defaults.traceLevel;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setCompute(@Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute) {
            this.compute = compute;
            return this;
        }

        public Builder setContinueOnError(@Nullable Object continueOnError) {
            this.continueOnError = continueOnError;
            return this;
        }

        public Builder setDataFlow(DataFlowReferenceResponse dataFlow) {
            this.dataFlow = Objects.requireNonNull(dataFlow);
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

        public Builder setIntegrationRuntime(@Nullable IntegrationRuntimeReferenceResponse integrationRuntime) {
            this.integrationRuntime = integrationRuntime;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setRunConcurrently(@Nullable Object runConcurrently) {
            this.runConcurrently = runConcurrently;
            return this;
        }

        public Builder setStaging(@Nullable DataFlowStagingInfoResponse staging) {
            this.staging = staging;
            return this;
        }

        public Builder setTraceLevel(@Nullable Object traceLevel) {
            this.traceLevel = traceLevel;
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

        public ExecuteDataFlowActivityResponse build() {
            return new ExecuteDataFlowActivityResponse(compute, continueOnError, dataFlow, dependsOn, description, integrationRuntime, linkedServiceName, name, policy, runConcurrently, staging, traceLevel, type, userProperties);
        }
    }
}