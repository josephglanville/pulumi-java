// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs Empty = new DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs();

    /**
     * The number of minutes between the first and second traffic shifts of a `TimeBasedCanary` deployment.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval == null ? Output.empty() : this.interval;
    }

    /**
     * The percentage of traffic to shift in the first increment of a `TimeBasedCanary` deployment.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Output<Integer> percentage;

    public Output<Integer> getPercentage() {
        return this.percentage == null ? Output.empty() : this.percentage;
    }

    public DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs(
        @Nullable Output<Integer> interval,
        @Nullable Output<Integer> percentage) {
        this.interval = interval;
        this.percentage = percentage;
    }

    private DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs() {
        this.interval = Output.empty();
        this.percentage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> interval;
        private @Nullable Output<Integer> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.percentage = defaults.percentage;
        }

        public Builder interval(@Nullable Output<Integer> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = Output.ofNullable(interval);
            return this;
        }
        public Builder percentage(@Nullable Output<Integer> percentage) {
            this.percentage = percentage;
            return this;
        }
        public Builder percentage(@Nullable Integer percentage) {
            this.percentage = Output.ofNullable(percentage);
            return this;
        }        public DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs build() {
            return new DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs(interval, percentage);
        }
    }
}