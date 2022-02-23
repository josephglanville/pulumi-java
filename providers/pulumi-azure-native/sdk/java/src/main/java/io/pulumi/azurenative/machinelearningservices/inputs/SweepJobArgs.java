// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.SamplingAlgorithm;
import io.pulumi.azurenative.machinelearningservices.inputs.AmlTokenArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.BanditPolicyArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ManagedIdentityArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.MedianStoppingPolicyArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ObjectiveArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.TrialComponentArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.TruncationSelectionPolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sweep job definition.
 * 
 */
public final class SweepJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final SweepJobArgs Empty = new SweepJobArgs();

    /**
     * Type of the hyperparameter sampling algorithms
     * 
     */
    @InputImport(name="algorithm", required=true)
      private final Input<Either<String,SamplingAlgorithm>> algorithm;

    public Input<Either<String,SamplingAlgorithm>> getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Compute binding for the job.
     * 
     */
    @InputImport(name="compute", required=true)
      private final Input<ComputeConfigurationArgs> compute;

    public Input<ComputeConfigurationArgs> getCompute() {
        return this.compute;
    }

    /**
     * The asset description text.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Early termination policies enable canceling poor-performing runs before they complete.
     * 
     */
    @InputImport(name="earlyTermination")
      private final @Nullable Input<Object> earlyTermination;

    public Input<Object> getEarlyTermination() {
        return this.earlyTermination == null ? Input.empty() : this.earlyTermination;
    }

    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     * 
     */
    @InputImport(name="experimentName")
      private final @Nullable Input<String> experimentName;

    public Input<String> getExperimentName() {
        return this.experimentName == null ? Input.empty() : this.experimentName;
    }

    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity or null.
     * Defaults to AmlToken if null.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;

    public Input<Either<AmlTokenArgs,ManagedIdentityArgs>> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Enum to determine the type of job.
     * Expected value is 'Sweep'.
     * 
     */
    @InputImport(name="jobType", required=true)
      private final Input<String> jobType;

    public Input<String> getJobType() {
        return this.jobType;
    }

    /**
     * An upper bound on the number of trials performed in parallel.
     * 
     */
    @InputImport(name="maxConcurrentTrials")
      private final @Nullable Input<Integer> maxConcurrentTrials;

    public Input<Integer> getMaxConcurrentTrials() {
        return this.maxConcurrentTrials == null ? Input.empty() : this.maxConcurrentTrials;
    }

    /**
     * An upper bound on the number of trials to perform.
     * 
     */
    @InputImport(name="maxTotalTrials")
      private final @Nullable Input<Integer> maxTotalTrials;

    public Input<Integer> getMaxTotalTrials() {
        return this.maxTotalTrials == null ? Input.empty() : this.maxTotalTrials;
    }

    /**
     * Optimization objective.
     * 
     */
    @InputImport(name="objective", required=true)
      private final Input<ObjectiveArgs> objective;

    public Input<ObjectiveArgs> getObjective() {
        return this.objective;
    }

    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * A dictionary containing each parameter and its distribution. The dictionary key is the name of the parameter
     * 
     */
    @InputImport(name="searchSpace", required=true)
      private final Input<Map<String,Object>> searchSpace;

    public Input<Map<String,Object>> getSearchSpace() {
        return this.searchSpace;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The total timeout in ISO 8601 format. Only supports duration with precision as low as Minutes.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * Trial component definition.
     * 
     */
    @InputImport(name="trial")
      private final @Nullable Input<TrialComponentArgs> trial;

    public Input<TrialComponentArgs> getTrial() {
        return this.trial == null ? Input.empty() : this.trial;
    }

    public SweepJobArgs(
        Input<Either<String,SamplingAlgorithm>> algorithm,
        Input<ComputeConfigurationArgs> compute,
        @Nullable Input<String> description,
        @Nullable Input<Object> earlyTermination,
        @Nullable Input<String> experimentName,
        @Nullable Input<Either<AmlTokenArgs,ManagedIdentityArgs>> identity,
        Input<String> jobType,
        @Nullable Input<Integer> maxConcurrentTrials,
        @Nullable Input<Integer> maxTotalTrials,
        Input<ObjectiveArgs> objective,
        @Nullable Input<Integer> priority,
        @Nullable Input<Map<String,String>> properties,
        Input<Map<String,Object>> searchSpace,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> timeout,
        @Nullable Input<TrialComponentArgs> trial) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.compute = Objects.requireNonNull(compute, "expected parameter 'compute' to be non-null");
        this.description = description;
        this.earlyTermination = earlyTermination;
        this.experimentName = experimentName;
        this.identity = identity;
        this.jobType = Objects.requireNonNull(jobType, "expected parameter 'jobType' to be non-null");
        this.maxConcurrentTrials = maxConcurrentTrials;
        this.maxTotalTrials = maxTotalTrials;
        this.objective = Objects.requireNonNull(objective, "expected parameter 'objective' to be non-null");
        this.priority = priority;
        this.properties = properties;
        this.searchSpace = Objects.requireNonNull(searchSpace, "expected parameter 'searchSpace' to be non-null");
        this.tags = tags;
        this.timeout = timeout;
        this.trial = trial;
    }

    private SweepJobArgs() {
        this.algorithm = Input.empty();
        this.compute = Input.empty();
        this.description = Input.empty();
        this.earlyTermination = Input.empty();
        this.experimentName = Input.empty();
        this.identity = Input.empty();
        this.jobType = Input.empty();
        this.maxConcurrentTrials = Input.empty();
        this.maxTotalTrials = Input.empty();
        this.objective = Input.empty();
        this.priority = Input.empty();
        this.properties = Input.empty();
        this.searchSpace = Input.empty();
        this.tags = Input.empty();
        this.timeout = Input.empty();
        this.trial = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SweepJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,SamplingAlgorithm>> algorithm;
        private Input<ComputeConfigurationArgs> compute;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> earlyTermination;
        private @Nullable Input<String> experimentName;
        private @Nullable Input<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;
        private Input<String> jobType;
        private @Nullable Input<Integer> maxConcurrentTrials;
        private @Nullable Input<Integer> maxTotalTrials;
        private Input<ObjectiveArgs> objective;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<Map<String,String>> properties;
        private Input<Map<String,Object>> searchSpace;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> timeout;
        private @Nullable Input<TrialComponentArgs> trial;

        public Builder() {
    	      // Empty
        }

        public Builder(SweepJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.earlyTermination = defaults.earlyTermination;
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.jobType = defaults.jobType;
    	      this.maxConcurrentTrials = defaults.maxConcurrentTrials;
    	      this.maxTotalTrials = defaults.maxTotalTrials;
    	      this.objective = defaults.objective;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.searchSpace = defaults.searchSpace;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.trial = defaults.trial;
        }

        public Builder setAlgorithm(Input<Either<String,SamplingAlgorithm>> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setAlgorithm(Either<String,SamplingAlgorithm> algorithm) {
            this.algorithm = Input.of(Objects.requireNonNull(algorithm));
            return this;
        }

        public Builder setCompute(Input<ComputeConfigurationArgs> compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder setCompute(ComputeConfigurationArgs compute) {
            this.compute = Input.of(Objects.requireNonNull(compute));
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

        public Builder setEarlyTermination(@Nullable Input<Object> earlyTermination) {
            this.earlyTermination = earlyTermination;
            return this;
        }

        public Builder setEarlyTermination(@Nullable Object earlyTermination) {
            this.earlyTermination = Input.ofNullable(earlyTermination);
            return this;
        }

        public Builder setExperimentName(@Nullable Input<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setExperimentName(@Nullable String experimentName) {
            this.experimentName = Input.ofNullable(experimentName);
            return this;
        }

        public Builder setIdentity(@Nullable Input<Either<AmlTokenArgs,ManagedIdentityArgs>> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable Either<AmlTokenArgs,ManagedIdentityArgs> identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setJobType(Input<String> jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }

        public Builder setJobType(String jobType) {
            this.jobType = Input.of(Objects.requireNonNull(jobType));
            return this;
        }

        public Builder setMaxConcurrentTrials(@Nullable Input<Integer> maxConcurrentTrials) {
            this.maxConcurrentTrials = maxConcurrentTrials;
            return this;
        }

        public Builder setMaxConcurrentTrials(@Nullable Integer maxConcurrentTrials) {
            this.maxConcurrentTrials = Input.ofNullable(maxConcurrentTrials);
            return this;
        }

        public Builder setMaxTotalTrials(@Nullable Input<Integer> maxTotalTrials) {
            this.maxTotalTrials = maxTotalTrials;
            return this;
        }

        public Builder setMaxTotalTrials(@Nullable Integer maxTotalTrials) {
            this.maxTotalTrials = Input.ofNullable(maxTotalTrials);
            return this;
        }

        public Builder setObjective(Input<ObjectiveArgs> objective) {
            this.objective = Objects.requireNonNull(objective);
            return this;
        }

        public Builder setObjective(ObjectiveArgs objective) {
            this.objective = Input.of(Objects.requireNonNull(objective));
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setSearchSpace(Input<Map<String,Object>> searchSpace) {
            this.searchSpace = Objects.requireNonNull(searchSpace);
            return this;
        }

        public Builder setSearchSpace(Map<String,Object> searchSpace) {
            this.searchSpace = Input.of(Objects.requireNonNull(searchSpace));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setTrial(@Nullable Input<TrialComponentArgs> trial) {
            this.trial = trial;
            return this;
        }

        public Builder setTrial(@Nullable TrialComponentArgs trial) {
            this.trial = Input.ofNullable(trial);
            return this;
        }
        public SweepJobArgs build() {
            return new SweepJobArgs(algorithm, compute, description, earlyTermination, experimentName, identity, jobType, maxConcurrentTrials, maxTotalTrials, objective, priority, properties, searchSpace, tags, timeout, trial);
        }
    }
}
