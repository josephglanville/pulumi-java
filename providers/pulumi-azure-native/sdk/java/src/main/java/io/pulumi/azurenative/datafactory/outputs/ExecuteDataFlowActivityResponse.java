// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.DataFlowReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.DataFlowStagingInfoResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteDataFlowActivityTypePropertiesResponseCompute;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExecuteDataFlowActivityResponse {
    private final @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute;
    private final @Nullable Object continueOnError;
    private final DataFlowReferenceResponse dataFlow;
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    private final @Nullable String description;
    private final @Nullable IntegrationRuntimeReferenceResponse integrationRuntime;
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    private final String name;
    private final @Nullable ActivityPolicyResponse policy;
    private final @Nullable Object runConcurrently;
    private final @Nullable DataFlowStagingInfoResponse staging;
    private final @Nullable Object traceLevel;
    private final String type;
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"compute","continueOnError","dataFlow","dependsOn","description","integrationRuntime","linkedServiceName","name","policy","runConcurrently","staging","traceLevel","type","userProperties"})
    private ExecuteDataFlowActivityResponse(
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
        this.dataFlow = Objects.requireNonNull(dataFlow);
        this.dependsOn = dependsOn;
        this.description = description;
        this.integrationRuntime = integrationRuntime;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name);
        this.policy = policy;
        this.runConcurrently = runConcurrently;
        this.staging = staging;
        this.traceLevel = traceLevel;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    public Optional<ExecuteDataFlowActivityTypePropertiesResponseCompute> getCompute() {
        return Optional.ofNullable(this.compute);
    }
    public Optional<Object> getContinueOnError() {
        return Optional.ofNullable(this.continueOnError);
    }
    public DataFlowReferenceResponse getDataFlow() {
        return this.dataFlow;
    }
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<IntegrationRuntimeReferenceResponse> getIntegrationRuntime() {
        return Optional.ofNullable(this.integrationRuntime);
    }
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    public String getName() {
        return this.name;
    }
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    public Optional<Object> getRunConcurrently() {
        return Optional.ofNullable(this.runConcurrently);
    }
    public Optional<DataFlowStagingInfoResponse> getStaging() {
        return Optional.ofNullable(this.staging);
    }
    public Optional<Object> getTraceLevel() {
        return Optional.ofNullable(this.traceLevel);
    }
    public String getType() {
        return this.type;
    }
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
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
