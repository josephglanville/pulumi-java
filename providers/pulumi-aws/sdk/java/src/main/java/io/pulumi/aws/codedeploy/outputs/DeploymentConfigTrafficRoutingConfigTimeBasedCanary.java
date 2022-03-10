// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentConfigTrafficRoutingConfigTimeBasedCanary {
    /**
     * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary` deployment.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * The percentage of traffic to shift in the first increment of a `TimeBasedCanary` deployment.
     * 
     */
    private final @Nullable Integer percentage;

    @OutputCustomType.Constructor
    private DeploymentConfigTrafficRoutingConfigTimeBasedCanary(
        @OutputCustomType.Parameter("interval") @Nullable Integer interval,
        @OutputCustomType.Parameter("percentage") @Nullable Integer percentage) {
        this.interval = interval;
        this.percentage = percentage;
    }

    /**
     * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary` deployment.
     * 
    */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * The percentage of traffic to shift in the first increment of a `TimeBasedCanary` deployment.
     * 
    */
    public Optional<Integer> getPercentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentConfigTrafficRoutingConfigTimeBasedCanary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer interval;
        private @Nullable Integer percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentConfigTrafficRoutingConfigTimeBasedCanary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.percentage = defaults.percentage;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setPercentage(@Nullable Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public DeploymentConfigTrafficRoutingConfigTimeBasedCanary build() {
            return new DeploymentConfigTrafficRoutingConfigTimeBasedCanary(interval, percentage);
        }
    }
}
