// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetBatchTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetBatchTargetArgs Empty = new EventTargetBatchTargetArgs();

    /**
     * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * 
     */
    @Import(name="arraySize")
      private final @Nullable Output<Integer> arraySize;

    public Output<Integer> getArraySize() {
        return this.arraySize == null ? Output.empty() : this.arraySize;
    }

    /**
     * The number of times to attempt to retry, if the job fails. Valid values are 1 to 10.
     * 
     */
    @Import(name="jobAttempts")
      private final @Nullable Output<Integer> jobAttempts;

    public Output<Integer> getJobAttempts() {
        return this.jobAttempts == null ? Output.empty() : this.jobAttempts;
    }

    /**
     * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
     * 
     */
    @Import(name="jobDefinition", required=true)
      private final Output<String> jobDefinition;

    public Output<String> getJobDefinition() {
        return this.jobDefinition;
    }

    /**
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     * 
     */
    @Import(name="jobName", required=true)
      private final Output<String> jobName;

    public Output<String> getJobName() {
        return this.jobName;
    }

    public EventTargetBatchTargetArgs(
        @Nullable Output<Integer> arraySize,
        @Nullable Output<Integer> jobAttempts,
        Output<String> jobDefinition,
        Output<String> jobName) {
        this.arraySize = arraySize;
        this.jobAttempts = jobAttempts;
        this.jobDefinition = Objects.requireNonNull(jobDefinition, "expected parameter 'jobDefinition' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
    }

    private EventTargetBatchTargetArgs() {
        this.arraySize = Output.empty();
        this.jobAttempts = Output.empty();
        this.jobDefinition = Output.empty();
        this.jobName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetBatchTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> arraySize;
        private @Nullable Output<Integer> jobAttempts;
        private Output<String> jobDefinition;
        private Output<String> jobName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetBatchTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arraySize = defaults.arraySize;
    	      this.jobAttempts = defaults.jobAttempts;
    	      this.jobDefinition = defaults.jobDefinition;
    	      this.jobName = defaults.jobName;
        }

        public Builder arraySize(@Nullable Output<Integer> arraySize) {
            this.arraySize = arraySize;
            return this;
        }
        public Builder arraySize(@Nullable Integer arraySize) {
            this.arraySize = Output.ofNullable(arraySize);
            return this;
        }
        public Builder jobAttempts(@Nullable Output<Integer> jobAttempts) {
            this.jobAttempts = jobAttempts;
            return this;
        }
        public Builder jobAttempts(@Nullable Integer jobAttempts) {
            this.jobAttempts = Output.ofNullable(jobAttempts);
            return this;
        }
        public Builder jobDefinition(Output<String> jobDefinition) {
            this.jobDefinition = Objects.requireNonNull(jobDefinition);
            return this;
        }
        public Builder jobDefinition(String jobDefinition) {
            this.jobDefinition = Output.of(Objects.requireNonNull(jobDefinition));
            return this;
        }
        public Builder jobName(Output<String> jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public Builder jobName(String jobName) {
            this.jobName = Output.of(Objects.requireNonNull(jobName));
            return this;
        }        public EventTargetBatchTargetArgs build() {
            return new EventTargetBatchTargetArgs(arraySize, jobAttempts, jobDefinition, jobName);
        }
    }
}
