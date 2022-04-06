// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameSessionQueuePlayerLatencyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameSessionQueuePlayerLatencyPolicyArgs Empty = new GameSessionQueuePlayerLatencyPolicyArgs();

    /**
     * Maximum latency value that is allowed for any player.
     * 
     */
    @Import(name="maximumIndividualPlayerLatencyMilliseconds", required=true)
      private final Output<Integer> maximumIndividualPlayerLatencyMilliseconds;

    public Output<Integer> getMaximumIndividualPlayerLatencyMilliseconds() {
        return this.maximumIndividualPlayerLatencyMilliseconds;
    }

    /**
     * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
     * 
     */
    @Import(name="policyDurationSeconds")
      private final @Nullable Output<Integer> policyDurationSeconds;

    public Output<Integer> getPolicyDurationSeconds() {
        return this.policyDurationSeconds == null ? Output.empty() : this.policyDurationSeconds;
    }

    public GameSessionQueuePlayerLatencyPolicyArgs(
        Output<Integer> maximumIndividualPlayerLatencyMilliseconds,
        @Nullable Output<Integer> policyDurationSeconds) {
        this.maximumIndividualPlayerLatencyMilliseconds = Objects.requireNonNull(maximumIndividualPlayerLatencyMilliseconds, "expected parameter 'maximumIndividualPlayerLatencyMilliseconds' to be non-null");
        this.policyDurationSeconds = policyDurationSeconds;
    }

    private GameSessionQueuePlayerLatencyPolicyArgs() {
        this.maximumIndividualPlayerLatencyMilliseconds = Output.empty();
        this.policyDurationSeconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameSessionQueuePlayerLatencyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maximumIndividualPlayerLatencyMilliseconds;
        private @Nullable Output<Integer> policyDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GameSessionQueuePlayerLatencyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumIndividualPlayerLatencyMilliseconds = defaults.maximumIndividualPlayerLatencyMilliseconds;
    	      this.policyDurationSeconds = defaults.policyDurationSeconds;
        }

        public Builder maximumIndividualPlayerLatencyMilliseconds(Output<Integer> maximumIndividualPlayerLatencyMilliseconds) {
            this.maximumIndividualPlayerLatencyMilliseconds = Objects.requireNonNull(maximumIndividualPlayerLatencyMilliseconds);
            return this;
        }
        public Builder maximumIndividualPlayerLatencyMilliseconds(Integer maximumIndividualPlayerLatencyMilliseconds) {
            this.maximumIndividualPlayerLatencyMilliseconds = Output.of(Objects.requireNonNull(maximumIndividualPlayerLatencyMilliseconds));
            return this;
        }
        public Builder policyDurationSeconds(@Nullable Output<Integer> policyDurationSeconds) {
            this.policyDurationSeconds = policyDurationSeconds;
            return this;
        }
        public Builder policyDurationSeconds(@Nullable Integer policyDurationSeconds) {
            this.policyDurationSeconds = Output.ofNullable(policyDurationSeconds);
            return this;
        }        public GameSessionQueuePlayerLatencyPolicyArgs build() {
            return new GameSessionQueuePlayerLatencyPolicyArgs(maximumIndividualPlayerLatencyMilliseconds, policyDurationSeconds);
        }
    }
}