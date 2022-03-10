// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLoadBalancerHealthCheck {
    private final Integer healthyThreshold;
    private final Integer interval;
    private final String target;
    private final Integer timeout;
    private final Integer unhealthyThreshold;

    @OutputCustomType.Constructor
    private GetLoadBalancerHealthCheck(
        @OutputCustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @OutputCustomType.Parameter("interval") Integer interval,
        @OutputCustomType.Parameter("target") String target,
        @OutputCustomType.Parameter("timeout") Integer timeout,
        @OutputCustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.target = target;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    public Integer getInterval() {
        return this.interval;
    }
    public String getTarget() {
        return this.target;
    }
    public Integer getTimeout() {
        return this.timeout;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer healthyThreshold;
        private Integer interval;
        private String target;
        private Integer timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.target = defaults.target;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTimeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public GetLoadBalancerHealthCheck build() {
            return new GetLoadBalancerHealthCheck(healthyThreshold, interval, target, timeout, unhealthyThreshold);
        }
    }
}
