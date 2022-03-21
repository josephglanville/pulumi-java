// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an early termination policy based on running averages of the primary metric of all runs.
 * 
 */
public final class MedianStoppingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final MedianStoppingPolicyResponse Empty = new MedianStoppingPolicyResponse();

    /**
     * Number of intervals by which to delay the first evaluation.
     * 
     */
    @Import(name="delayEvaluation")
      private final @Nullable Integer delayEvaluation;

    public Optional<Integer> getDelayEvaluation() {
        return this.delayEvaluation == null ? Optional.empty() : Optional.ofNullable(this.delayEvaluation);
    }

    /**
     * Interval (number of runs) between policy evaluations.
     * 
     */
    @Import(name="evaluationInterval")
      private final @Nullable Integer evaluationInterval;

    public Optional<Integer> getEvaluationInterval() {
        return this.evaluationInterval == null ? Optional.empty() : Optional.ofNullable(this.evaluationInterval);
    }

    /**
     * Expected value is 'MedianStopping'.
     * 
     */
    @Import(name="policyType", required=true)
      private final String policyType;

    public String getPolicyType() {
        return this.policyType;
    }

    public MedianStoppingPolicyResponse(
        @Nullable Integer delayEvaluation,
        @Nullable Integer evaluationInterval,
        String policyType) {
        this.delayEvaluation = delayEvaluation;
        this.evaluationInterval = evaluationInterval;
        this.policyType = Objects.requireNonNull(policyType, "expected parameter 'policyType' to be non-null");
    }

    private MedianStoppingPolicyResponse() {
        this.delayEvaluation = null;
        this.evaluationInterval = null;
        this.policyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MedianStoppingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer delayEvaluation;
        private @Nullable Integer evaluationInterval;
        private String policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(MedianStoppingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayEvaluation = defaults.delayEvaluation;
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.policyType = defaults.policyType;
        }

        public Builder delayEvaluation(@Nullable Integer delayEvaluation) {
            this.delayEvaluation = delayEvaluation;
            return this;
        }
        public Builder evaluationInterval(@Nullable Integer evaluationInterval) {
            this.evaluationInterval = evaluationInterval;
            return this;
        }
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }        public MedianStoppingPolicyResponse build() {
            return new MedianStoppingPolicyResponse(delayEvaluation, evaluationInterval, policyType);
        }
    }
}
