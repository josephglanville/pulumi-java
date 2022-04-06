// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GameSessionQueuePlayerLatencyPolicy {
    /**
     * Maximum latency value that is allowed for any player.
     * 
     */
    private final Integer maximumIndividualPlayerLatencyMilliseconds;
    /**
     * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
     * 
     */
    private final @Nullable Integer policyDurationSeconds;

    @CustomType.Constructor
    private GameSessionQueuePlayerLatencyPolicy(
        @CustomType.Parameter("maximumIndividualPlayerLatencyMilliseconds") Integer maximumIndividualPlayerLatencyMilliseconds,
        @CustomType.Parameter("policyDurationSeconds") @Nullable Integer policyDurationSeconds) {
        this.maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds;
        this.policyDurationSeconds = policyDurationSeconds;
    }

    /**
     * Maximum latency value that is allowed for any player.
     * 
    */
    public Integer getMaximumIndividualPlayerLatencyMilliseconds() {
        return this.maximumIndividualPlayerLatencyMilliseconds;
    }
    /**
     * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
     * 
    */
    public Optional<Integer> getPolicyDurationSeconds() {
        return Optional.ofNullable(this.policyDurationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameSessionQueuePlayerLatencyPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maximumIndividualPlayerLatencyMilliseconds;
        private @Nullable Integer policyDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GameSessionQueuePlayerLatencyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumIndividualPlayerLatencyMilliseconds = defaults.maximumIndividualPlayerLatencyMilliseconds;
    	      this.policyDurationSeconds = defaults.policyDurationSeconds;
        }

        public Builder maximumIndividualPlayerLatencyMilliseconds(Integer maximumIndividualPlayerLatencyMilliseconds) {
            this.maximumIndividualPlayerLatencyMilliseconds = Objects.requireNonNull(maximumIndividualPlayerLatencyMilliseconds);
            return this;
        }
        public Builder policyDurationSeconds(@Nullable Integer policyDurationSeconds) {
            this.policyDurationSeconds = policyDurationSeconds;
            return this;
        }        public GameSessionQueuePlayerLatencyPolicy build() {
            return new GameSessionQueuePlayerLatencyPolicy(maximumIndividualPlayerLatencyMilliseconds, policyDurationSeconds);
        }
    }
}