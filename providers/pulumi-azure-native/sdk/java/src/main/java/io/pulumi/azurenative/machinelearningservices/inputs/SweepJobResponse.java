// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.AmlTokenResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.BanditPolicyResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.JobEndpointResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.JobOutputResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ManagedIdentityResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.MedianStoppingPolicyResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ObjectiveResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.TrialComponentResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.TruncationSelectionPolicyResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SweepJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final SweepJobResponse Empty = new SweepJobResponse();

    @InputImport(name="algorithm", required=true)
    private final String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    @InputImport(name="compute", required=true)
    private final ComputeConfigurationResponse compute;

    public ComputeConfigurationResponse getCompute() {
        return this.compute;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="earlyTermination")
    private final @Nullable Object earlyTermination;

    public Object getEarlyTermination() {
        return this.earlyTermination == null ? null : this.earlyTermination;
    }

    @InputImport(name="experimentName")
    private final @Nullable String experimentName;

    public Optional<String> getExperimentName() {
        return this.experimentName == null ? Optional.empty() : Optional.ofNullable(this.experimentName);
    }

    @InputImport(name="identity")
    private final @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;

    public Either<AmlTokenResponse,ManagedIdentityResponse> getIdentity() {
        return this.identity == null ? null : this.identity;
    }

    @InputImport(name="interactionEndpoints", required=true)
    private final Map<String,JobEndpointResponse> interactionEndpoints;

    public Map<String,JobEndpointResponse> getInteractionEndpoints() {
        return this.interactionEndpoints;
    }

    @InputImport(name="jobType", required=true)
    private final String jobType;

    public String getJobType() {
        return this.jobType;
    }

    @InputImport(name="maxConcurrentTrials")
    private final @Nullable Integer maxConcurrentTrials;

    public Optional<Integer> getMaxConcurrentTrials() {
        return this.maxConcurrentTrials == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentTrials);
    }

    @InputImport(name="maxTotalTrials")
    private final @Nullable Integer maxTotalTrials;

    public Optional<Integer> getMaxTotalTrials() {
        return this.maxTotalTrials == null ? Optional.empty() : Optional.ofNullable(this.maxTotalTrials);
    }

    @InputImport(name="objective", required=true)
    private final ObjectiveResponse objective;

    public ObjectiveResponse getObjective() {
        return this.objective;
    }

    @InputImport(name="output", required=true)
    private final JobOutputResponse output;

    public JobOutputResponse getOutput() {
        return this.output;
    }

    @InputImport(name="priority")
    private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="searchSpace", required=true)
    private final Map<String,Object> searchSpace;

    public Map<String,Object> getSearchSpace() {
        return this.searchSpace;
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    @InputImport(name="timeout")
    private final @Nullable String timeout;

    public Optional<String> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    @InputImport(name="trial")
    private final @Nullable TrialComponentResponse trial;

    public Optional<TrialComponentResponse> getTrial() {
        return this.trial == null ? Optional.empty() : Optional.ofNullable(this.trial);
    }

    public SweepJobResponse(
        String algorithm,
        ComputeConfigurationResponse compute,
        @Nullable String description,
        @Nullable Object earlyTermination,
        @Nullable String experimentName,
        @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity,
        Map<String,JobEndpointResponse> interactionEndpoints,
        String jobType,
        @Nullable Integer maxConcurrentTrials,
        @Nullable Integer maxTotalTrials,
        ObjectiveResponse objective,
        JobOutputResponse output,
        @Nullable Integer priority,
        @Nullable Map<String,String> properties,
        String provisioningState,
        Map<String,Object> searchSpace,
        String status,
        @Nullable Map<String,String> tags,
        @Nullable String timeout,
        @Nullable TrialComponentResponse trial) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.compute = Objects.requireNonNull(compute, "expected parameter 'compute' to be non-null");
        this.description = description;
        this.earlyTermination = earlyTermination;
        this.experimentName = experimentName;
        this.identity = identity;
        this.interactionEndpoints = Objects.requireNonNull(interactionEndpoints, "expected parameter 'interactionEndpoints' to be non-null");
        this.jobType = Objects.requireNonNull(jobType, "expected parameter 'jobType' to be non-null");
        this.maxConcurrentTrials = maxConcurrentTrials;
        this.maxTotalTrials = maxTotalTrials;
        this.objective = Objects.requireNonNull(objective, "expected parameter 'objective' to be non-null");
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.priority = priority;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.searchSpace = Objects.requireNonNull(searchSpace, "expected parameter 'searchSpace' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.tags = tags;
        this.timeout = timeout;
        this.trial = trial;
    }

    private SweepJobResponse() {
        this.algorithm = null;
        this.compute = null;
        this.description = null;
        this.earlyTermination = null;
        this.experimentName = null;
        this.identity = null;
        this.interactionEndpoints = Map.of();
        this.jobType = null;
        this.maxConcurrentTrials = null;
        this.maxTotalTrials = null;
        this.objective = null;
        this.output = null;
        this.priority = null;
        this.properties = Map.of();
        this.provisioningState = null;
        this.searchSpace = Map.of();
        this.status = null;
        this.tags = Map.of();
        this.timeout = null;
        this.trial = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SweepJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private ComputeConfigurationResponse compute;
        private @Nullable String description;
        private @Nullable Object earlyTermination;
        private @Nullable String experimentName;
        private @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
        private Map<String,JobEndpointResponse> interactionEndpoints;
        private String jobType;
        private @Nullable Integer maxConcurrentTrials;
        private @Nullable Integer maxTotalTrials;
        private ObjectiveResponse objective;
        private JobOutputResponse output;
        private @Nullable Integer priority;
        private @Nullable Map<String,String> properties;
        private String provisioningState;
        private Map<String,Object> searchSpace;
        private String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String timeout;
        private @Nullable TrialComponentResponse trial;

        public Builder() {
    	      // Empty
        }

        public Builder(SweepJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.earlyTermination = defaults.earlyTermination;
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.interactionEndpoints = defaults.interactionEndpoints;
    	      this.jobType = defaults.jobType;
    	      this.maxConcurrentTrials = defaults.maxConcurrentTrials;
    	      this.maxTotalTrials = defaults.maxTotalTrials;
    	      this.objective = defaults.objective;
    	      this.output = defaults.output;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.searchSpace = defaults.searchSpace;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.trial = defaults.trial;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setCompute(ComputeConfigurationResponse compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEarlyTermination(@Nullable Object earlyTermination) {
            this.earlyTermination = earlyTermination;
            return this;
        }

        public Builder setExperimentName(@Nullable String experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setIdentity(@Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInteractionEndpoints(Map<String,JobEndpointResponse> interactionEndpoints) {
            this.interactionEndpoints = Objects.requireNonNull(interactionEndpoints);
            return this;
        }

        public Builder setJobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }

        public Builder setMaxConcurrentTrials(@Nullable Integer maxConcurrentTrials) {
            this.maxConcurrentTrials = maxConcurrentTrials;
            return this;
        }

        public Builder setMaxTotalTrials(@Nullable Integer maxTotalTrials) {
            this.maxTotalTrials = maxTotalTrials;
            return this;
        }

        public Builder setObjective(ObjectiveResponse objective) {
            this.objective = Objects.requireNonNull(objective);
            return this;
        }

        public Builder setOutput(JobOutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSearchSpace(Map<String,Object> searchSpace) {
            this.searchSpace = Objects.requireNonNull(searchSpace);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTrial(@Nullable TrialComponentResponse trial) {
            this.trial = trial;
            return this;
        }

        public SweepJobResponse build() {
            return new SweepJobResponse(algorithm, compute, description, earlyTermination, experimentName, identity, interactionEndpoints, jobType, maxConcurrentTrials, maxTotalTrials, objective, output, priority, properties, provisioningState, searchSpace, status, tags, timeout, trial);
        }
    }
}
