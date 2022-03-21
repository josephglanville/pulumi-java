// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LoadBalancerHealthCheckGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerHealthCheckGetArgs Empty = new LoadBalancerHealthCheckGetArgs();

    /**
     * The number of checks before the instance is declared healthy.
     * 
     */
    @Import(name="healthyThreshold", required=true)
      private final Output<Integer> healthyThreshold;

    public Output<Integer> getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * The interval between checks.
     * 
     */
    @Import(name="interval", required=true)
      private final Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval;
    }

    /**
     * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
     * values are:
     * * `HTTP`, `HTTPS` - PORT and PATH are required
     * * `TCP`, `SSL` - PORT is required, PATH is not supported
     * 
     */
    @Import(name="target", required=true)
      private final Output<String> target;

    public Output<String> getTarget() {
        return this.target;
    }

    /**
     * The length of time before the check times out.
     * 
     */
    @Import(name="timeout", required=true)
      private final Output<Integer> timeout;

    public Output<Integer> getTimeout() {
        return this.timeout;
    }

    /**
     * The number of checks before the instance is declared unhealthy.
     * 
     */
    @Import(name="unhealthyThreshold", required=true)
      private final Output<Integer> unhealthyThreshold;

    public Output<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public LoadBalancerHealthCheckGetArgs(
        Output<Integer> healthyThreshold,
        Output<Integer> interval,
        Output<String> target,
        Output<Integer> timeout,
        Output<Integer> unhealthyThreshold) {
        this.healthyThreshold = Objects.requireNonNull(healthyThreshold, "expected parameter 'healthyThreshold' to be non-null");
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
        this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold, "expected parameter 'unhealthyThreshold' to be non-null");
    }

    private LoadBalancerHealthCheckGetArgs() {
        this.healthyThreshold = Output.empty();
        this.interval = Output.empty();
        this.target = Output.empty();
        this.timeout = Output.empty();
        this.unhealthyThreshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerHealthCheckGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> healthyThreshold;
        private Output<Integer> interval;
        private Output<String> target;
        private Output<Integer> timeout;
        private Output<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerHealthCheckGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.target = defaults.target;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder healthyThreshold(Output<Integer> healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Output.of(Objects.requireNonNull(healthyThreshold));
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
        public Builder target(Output<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(String target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }
        public Builder timeout(Output<Integer> timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder timeout(Integer timeout) {
            this.timeout = Output.of(Objects.requireNonNull(timeout));
            return this;
        }
        public Builder unhealthyThreshold(Output<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Output.of(Objects.requireNonNull(unhealthyThreshold));
            return this;
        }        public LoadBalancerHealthCheckGetArgs build() {
            return new LoadBalancerHealthCheckGetArgs(healthyThreshold, interval, target, timeout, unhealthyThreshold);
        }
    }
}
