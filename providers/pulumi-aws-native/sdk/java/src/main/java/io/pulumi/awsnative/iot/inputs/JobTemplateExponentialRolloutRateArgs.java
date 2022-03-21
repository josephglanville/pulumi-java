// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.JobTemplateRateIncreaseCriteriaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Allows you to create an exponential rate of rollout for a job.
 * 
 */
public final class JobTemplateExponentialRolloutRateArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateExponentialRolloutRateArgs Empty = new JobTemplateExponentialRolloutRateArgs();

    /**
     * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This parameter allows you to define the initial rate of rollout.
     * 
     */
    @Import(name="baseRatePerMinute", required=true)
      private final Output<Integer> baseRatePerMinute;

    public Output<Integer> getBaseRatePerMinute() {
        return this.baseRatePerMinute;
    }

    /**
     * The exponential factor to increase the rate of rollout for a job.
     * 
     */
    @Import(name="incrementFactor", required=true)
      private final Output<Double> incrementFactor;

    public Output<Double> getIncrementFactor() {
        return this.incrementFactor;
    }

    /**
     * The criteria to initiate the increase in rate of rollout for a job.
     * 
     */
    @Import(name="rateIncreaseCriteria", required=true)
      private final Output<JobTemplateRateIncreaseCriteriaArgs> rateIncreaseCriteria;

    public Output<JobTemplateRateIncreaseCriteriaArgs> getRateIncreaseCriteria() {
        return this.rateIncreaseCriteria;
    }

    public JobTemplateExponentialRolloutRateArgs(
        Output<Integer> baseRatePerMinute,
        Output<Double> incrementFactor,
        Output<JobTemplateRateIncreaseCriteriaArgs> rateIncreaseCriteria) {
        this.baseRatePerMinute = Objects.requireNonNull(baseRatePerMinute, "expected parameter 'baseRatePerMinute' to be non-null");
        this.incrementFactor = Objects.requireNonNull(incrementFactor, "expected parameter 'incrementFactor' to be non-null");
        this.rateIncreaseCriteria = Objects.requireNonNull(rateIncreaseCriteria, "expected parameter 'rateIncreaseCriteria' to be non-null");
    }

    private JobTemplateExponentialRolloutRateArgs() {
        this.baseRatePerMinute = Output.empty();
        this.incrementFactor = Output.empty();
        this.rateIncreaseCriteria = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateExponentialRolloutRateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> baseRatePerMinute;
        private Output<Double> incrementFactor;
        private Output<JobTemplateRateIncreaseCriteriaArgs> rateIncreaseCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateExponentialRolloutRateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseRatePerMinute = defaults.baseRatePerMinute;
    	      this.incrementFactor = defaults.incrementFactor;
    	      this.rateIncreaseCriteria = defaults.rateIncreaseCriteria;
        }

        public Builder baseRatePerMinute(Output<Integer> baseRatePerMinute) {
            this.baseRatePerMinute = Objects.requireNonNull(baseRatePerMinute);
            return this;
        }
        public Builder baseRatePerMinute(Integer baseRatePerMinute) {
            this.baseRatePerMinute = Output.of(Objects.requireNonNull(baseRatePerMinute));
            return this;
        }
        public Builder incrementFactor(Output<Double> incrementFactor) {
            this.incrementFactor = Objects.requireNonNull(incrementFactor);
            return this;
        }
        public Builder incrementFactor(Double incrementFactor) {
            this.incrementFactor = Output.of(Objects.requireNonNull(incrementFactor));
            return this;
        }
        public Builder rateIncreaseCriteria(Output<JobTemplateRateIncreaseCriteriaArgs> rateIncreaseCriteria) {
            this.rateIncreaseCriteria = Objects.requireNonNull(rateIncreaseCriteria);
            return this;
        }
        public Builder rateIncreaseCriteria(JobTemplateRateIncreaseCriteriaArgs rateIncreaseCriteria) {
            this.rateIncreaseCriteria = Output.of(Objects.requireNonNull(rateIncreaseCriteria));
            return this;
        }        public JobTemplateExponentialRolloutRateArgs build() {
            return new JobTemplateExponentialRolloutRateArgs(baseRatePerMinute, incrementFactor, rateIncreaseCriteria);
        }
    }
}
