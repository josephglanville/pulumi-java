// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.AmlTokenArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.InputDataBindingArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ManagedIdentityArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.MpiArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.OutputDataBindingArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.PyTorchArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.TensorFlowArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Command job definition.
 * 
 */
public final class CommandJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommandJobArgs Empty = new CommandJobArgs();

    /**
     * ARM resource ID of the code asset.
     * 
     */
    @Import(name="codeId")
      private final @Nullable Output<String> codeId;

    public Output<String> getCodeId() {
        return this.codeId == null ? Output.empty() : this.codeId;
    }

    /**
     * The command to execute on startup of the job. eg. "python train.py"
     * 
     */
    @Import(name="command", required=true)
      private final Output<String> command;

    public Output<String> getCommand() {
        return this.command;
    }

    /**
     * Compute binding for the job.
     * 
     */
    @Import(name="compute", required=true)
      private final Output<ComputeConfigurationArgs> compute;

    public Output<ComputeConfigurationArgs> getCompute() {
        return this.compute;
    }

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    @Import(name="distribution")
      private final @Nullable Output<Object> distribution;

    public Output<Object> getDistribution() {
        return this.distribution == null ? Output.empty() : this.distribution;
    }

    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
     */
    @Import(name="environmentId")
      private final @Nullable Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId == null ? Output.empty() : this.environmentId;
    }

    /**
     * Environment variables included in the job.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Output.empty() : this.environmentVariables;
    }

    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     * 
     */
    @Import(name="experimentName")
      private final @Nullable Output<String> experimentName;

    public Output<String> getExperimentName() {
        return this.experimentName == null ? Output.empty() : this.experimentName;
    }

    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity, or null.
     * Defaults to AmlToken if null.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;

    public Output<Either<AmlTokenArgs,ManagedIdentityArgs>> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Mapping of input data bindings used in the job.
     * 
     */
    @Import(name="inputDataBindings")
      private final @Nullable Output<Map<String,InputDataBindingArgs>> inputDataBindings;

    public Output<Map<String,InputDataBindingArgs>> getInputDataBindings() {
        return this.inputDataBindings == null ? Output.empty() : this.inputDataBindings;
    }

    /**
     * Enum to determine the type of job.
     * Expected value is 'Command'.
     * 
     */
    @Import(name="jobType", required=true)
      private final Output<String> jobType;

    public Output<String> getJobType() {
        return this.jobType;
    }

    /**
     * Mapping of output data bindings used in the job.
     * 
     */
    @Import(name="outputDataBindings")
      private final @Nullable Output<Map<String,OutputDataBindingArgs>> outputDataBindings;

    public Output<Map<String,OutputDataBindingArgs>> getOutputDataBindings() {
        return this.outputDataBindings == null ? Output.empty() : this.outputDataBindings;
    }

    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The max run duration in ISO 8601 format, after which the job will be cancelled. Only supports duration with precision as low as Seconds.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public CommandJobArgs(
        @Nullable Output<String> codeId,
        Output<String> command,
        Output<ComputeConfigurationArgs> compute,
        @Nullable Output<String> description,
        @Nullable Output<Object> distribution,
        @Nullable Output<String> environmentId,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<String> experimentName,
        @Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity,
        @Nullable Output<Map<String,InputDataBindingArgs>> inputDataBindings,
        Output<String> jobType,
        @Nullable Output<Map<String,OutputDataBindingArgs>> outputDataBindings,
        @Nullable Output<Integer> priority,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> timeout) {
        this.codeId = codeId;
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
        this.compute = Objects.requireNonNull(compute, "expected parameter 'compute' to be non-null");
        this.description = description;
        this.distribution = distribution;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.experimentName = experimentName;
        this.identity = identity;
        this.inputDataBindings = inputDataBindings;
        this.jobType = Objects.requireNonNull(jobType, "expected parameter 'jobType' to be non-null");
        this.outputDataBindings = outputDataBindings;
        this.priority = priority;
        this.properties = properties;
        this.tags = tags;
        this.timeout = timeout;
    }

    private CommandJobArgs() {
        this.codeId = Output.empty();
        this.command = Output.empty();
        this.compute = Output.empty();
        this.description = Output.empty();
        this.distribution = Output.empty();
        this.environmentId = Output.empty();
        this.environmentVariables = Output.empty();
        this.experimentName = Output.empty();
        this.identity = Output.empty();
        this.inputDataBindings = Output.empty();
        this.jobType = Output.empty();
        this.outputDataBindings = Output.empty();
        this.priority = Output.empty();
        this.properties = Output.empty();
        this.tags = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> codeId;
        private Output<String> command;
        private Output<ComputeConfigurationArgs> compute;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> distribution;
        private @Nullable Output<String> environmentId;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<String> experimentName;
        private @Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;
        private @Nullable Output<Map<String,InputDataBindingArgs>> inputDataBindings;
        private Output<String> jobType;
        private @Nullable Output<Map<String,OutputDataBindingArgs>> outputDataBindings;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.command = defaults.command;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.distribution = defaults.distribution;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.inputDataBindings = defaults.inputDataBindings;
    	      this.jobType = defaults.jobType;
    	      this.outputDataBindings = defaults.outputDataBindings;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder codeId(@Nullable Output<String> codeId) {
            this.codeId = codeId;
            return this;
        }
        public Builder codeId(@Nullable String codeId) {
            this.codeId = Output.ofNullable(codeId);
            return this;
        }
        public Builder command(Output<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }
        public Builder command(String command) {
            this.command = Output.of(Objects.requireNonNull(command));
            return this;
        }
        public Builder compute(Output<ComputeConfigurationArgs> compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }
        public Builder compute(ComputeConfigurationArgs compute) {
            this.compute = Output.of(Objects.requireNonNull(compute));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder distribution(@Nullable Output<Object> distribution) {
            this.distribution = distribution;
            return this;
        }
        public Builder distribution(@Nullable Object distribution) {
            this.distribution = Output.ofNullable(distribution);
            return this;
        }
        public Builder environmentId(@Nullable Output<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Output.ofNullable(environmentId);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Output.ofNullable(environmentVariables);
            return this;
        }
        public Builder experimentName(@Nullable Output<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public Builder experimentName(@Nullable String experimentName) {
            this.experimentName = Output.ofNullable(experimentName);
            return this;
        }
        public Builder identity(@Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable Either<AmlTokenArgs,ManagedIdentityArgs> identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }
        public Builder inputDataBindings(@Nullable Output<Map<String,InputDataBindingArgs>> inputDataBindings) {
            this.inputDataBindings = inputDataBindings;
            return this;
        }
        public Builder inputDataBindings(@Nullable Map<String,InputDataBindingArgs> inputDataBindings) {
            this.inputDataBindings = Output.ofNullable(inputDataBindings);
            return this;
        }
        public Builder jobType(Output<String> jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }
        public Builder jobType(String jobType) {
            this.jobType = Output.of(Objects.requireNonNull(jobType));
            return this;
        }
        public Builder outputDataBindings(@Nullable Output<Map<String,OutputDataBindingArgs>> outputDataBindings) {
            this.outputDataBindings = outputDataBindings;
            return this;
        }
        public Builder outputDataBindings(@Nullable Map<String,OutputDataBindingArgs> outputDataBindings) {
            this.outputDataBindings = Output.ofNullable(outputDataBindings);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }        public CommandJobArgs build() {
            return new CommandJobArgs(codeId, command, compute, description, distribution, environmentId, environmentVariables, experimentName, identity, inputDataBindings, jobType, outputDataBindings, priority, properties, tags, timeout);
        }
    }
}
