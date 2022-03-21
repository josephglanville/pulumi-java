// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.TumblingWindowFrequency;
import io.pulumi.azurenative.datafactory.inputs.RetryPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.SelfDependencyTumblingWindowTriggerReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.TriggerDependencyReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.TumblingWindowTriggerDependencyReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger that schedules pipeline runs for all fixed time interval windows from a start time without gaps and also supports backfill scenarios (when start time is in the past).
 * 
 */
public final class TumblingWindowTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TumblingWindowTriggerArgs Empty = new TumblingWindowTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Specifies how long the trigger waits past due time before triggering new run. It doesn't alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="delay")
      private final @Nullable Output<Object> delay;

    public Output<Object> getDelay() {
        return this.delay == null ? Output.empty() : this.delay;
    }

    /**
     * Triggers that this trigger depends on. Only tumbling window triggers are supported.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<Object>> dependsOn;

    public Output<List<Object>> getDependsOn() {
        return this.dependsOn == null ? Output.empty() : this.dependsOn;
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The end time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * The frequency of the time windows.
     * 
     */
    @Import(name="frequency", required=true)
      private final Output<Either<String,TumblingWindowFrequency>> frequency;

    public Output<Either<String,TumblingWindowFrequency>> getFrequency() {
        return this.frequency;
    }

    /**
     * The interval of the time windows. The minimum interval allowed is 15 Minutes.
     * 
     */
    @Import(name="interval", required=true)
      private final Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval;
    }

    /**
     * The max number of parallel time windows (ready for execution) for which a new run is triggered.
     * 
     */
    @Import(name="maxConcurrency", required=true)
      private final Output<Integer> maxConcurrency;

    public Output<Integer> getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Pipeline for which runs are created when an event is fired for trigger window that is ready.
     * 
     */
    @Import(name="pipeline", required=true)
      private final Output<TriggerPipelineReferenceArgs> pipeline;

    public Output<TriggerPipelineReferenceArgs> getPipeline() {
        return this.pipeline;
    }

    /**
     * Retry policy that will be applied for failed pipeline runs.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RetryPolicyArgs> retryPolicy;

    public Output<RetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * The start time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
     */
    @Import(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    /**
     * Trigger type.
     * Expected value is 'TumblingWindowTrigger'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TumblingWindowTriggerArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> delay,
        @Nullable Output<List<Object>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<String> endTime,
        Output<Either<String,TumblingWindowFrequency>> frequency,
        Output<Integer> interval,
        Output<Integer> maxConcurrency,
        Output<TriggerPipelineReferenceArgs> pipeline,
        @Nullable Output<RetryPolicyArgs> retryPolicy,
        Output<String> startTime,
        Output<String> type) {
        this.annotations = annotations;
        this.delay = delay;
        this.dependsOn = dependsOn;
        this.description = description;
        this.endTime = endTime;
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.maxConcurrency = Objects.requireNonNull(maxConcurrency, "expected parameter 'maxConcurrency' to be non-null");
        this.pipeline = Objects.requireNonNull(pipeline, "expected parameter 'pipeline' to be non-null");
        this.retryPolicy = retryPolicy;
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TumblingWindowTriggerArgs() {
        this.annotations = Output.empty();
        this.delay = Output.empty();
        this.dependsOn = Output.empty();
        this.description = Output.empty();
        this.endTime = Output.empty();
        this.frequency = Output.empty();
        this.interval = Output.empty();
        this.maxConcurrency = Output.empty();
        this.pipeline = Output.empty();
        this.retryPolicy = Output.empty();
        this.startTime = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TumblingWindowTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> delay;
        private @Nullable Output<List<Object>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> endTime;
        private Output<Either<String,TumblingWindowFrequency>> frequency;
        private Output<Integer> interval;
        private Output<Integer> maxConcurrency;
        private Output<TriggerPipelineReferenceArgs> pipeline;
        private @Nullable Output<RetryPolicyArgs> retryPolicy;
        private Output<String> startTime;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TumblingWindowTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.delay = defaults.delay;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.pipeline = defaults.pipeline;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder delay(@Nullable Output<Object> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable Object delay) {
            this.delay = Output.ofNullable(delay);
            return this;
        }
        public Builder dependsOn(@Nullable Output<List<Object>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<Object> dependsOn) {
            this.dependsOn = Output.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(Object... dependsOn) {
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
        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }
        public Builder frequency(Output<Either<String,TumblingWindowFrequency>> frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        public Builder frequency(Either<String,TumblingWindowFrequency> frequency) {
            this.frequency = Output.of(Objects.requireNonNull(frequency));
            return this;
        }
        public Builder interval(Output<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Output.of(Objects.requireNonNull(interval));
            return this;
        }
        public Builder maxConcurrency(Output<Integer> maxConcurrency) {
            this.maxConcurrency = Objects.requireNonNull(maxConcurrency);
            return this;
        }
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = Output.of(Objects.requireNonNull(maxConcurrency));
            return this;
        }
        public Builder pipeline(Output<TriggerPipelineReferenceArgs> pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }
        public Builder pipeline(TriggerPipelineReferenceArgs pipeline) {
            this.pipeline = Output.of(Objects.requireNonNull(pipeline));
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }
        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public TumblingWindowTriggerArgs build() {
            return new TumblingWindowTriggerArgs(annotations, delay, dependsOn, description, endTime, frequency, interval, maxConcurrency, pipeline, retryPolicy, startTime, type);
        }
    }
}
