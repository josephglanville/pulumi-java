// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LoadBalancerHealthCheck {
    /**
     * The number of checks before the instance is declared healthy.
     * 
     */
    private final Integer healthyThreshold;
    /**
     * The interval between checks.
     * 
     */
    private final Integer interval;
    /**
     * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
     * values are:
     * * `HTTP`, `HTTPS` - PORT and PATH are required
     * * `TCP`, `SSL` - PORT is required, PATH is not supported
     * 
     */
    private final String target;
    /**
     * The length of time before the check times out.
     * 
     */
    private final Integer timeout;
    /**
     * The number of checks before the instance is declared unhealthy.
     * 
     */
    private final Integer unhealthyThreshold;

    @OutputCustomType.Constructor
    private LoadBalancerHealthCheck(
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

    /**
     * The number of checks before the instance is declared healthy.
     * 
    */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * The interval between checks.
     * 
    */
    public Integer getInterval() {
        return this.interval;
    }
    /**
     * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
     * values are:
     * * `HTTP`, `HTTPS` - PORT and PATH are required
     * * `TCP`, `SSL` - PORT is required, PATH is not supported
     * 
    */
    public String getTarget() {
        return this.target;
    }
    /**
     * The length of time before the check times out.
     * 
    */
    public Integer getTimeout() {
        return this.timeout;
    }
    /**
     * The number of checks before the instance is declared unhealthy.
     * 
    */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerHealthCheck defaults) {
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

        public Builder(LoadBalancerHealthCheck defaults) {
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
        public LoadBalancerHealthCheck build() {
            return new LoadBalancerHealthCheck(healthyThreshold, interval, target, timeout, unhealthyThreshold);
        }
    }
}
