// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ServiceDeploymentCircuitBreaker {
    /**
     * Whether to enable the deployment circuit breaker logic for the service.
     * 
     */
    private final Boolean enable;
    /**
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
     */
    private final Boolean rollback;

    @OutputCustomType.Constructor
    private ServiceDeploymentCircuitBreaker(
        @OutputCustomType.Parameter("enable") Boolean enable,
        @OutputCustomType.Parameter("rollback") Boolean rollback) {
        this.enable = enable;
        this.rollback = rollback;
    }

    /**
     * Whether to enable the deployment circuit breaker logic for the service.
     * 
    */
    public Boolean getEnable() {
        return this.enable;
    }
    /**
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
    */
    public Boolean getRollback() {
        return this.rollback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentCircuitBreaker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private Boolean rollback;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.rollback = defaults.rollback;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setRollback(Boolean rollback) {
            this.rollback = Objects.requireNonNull(rollback);
            return this;
        }
        public ServiceDeploymentCircuitBreaker build() {
            return new ServiceDeploymentCircuitBreaker(enable, rollback);
        }
    }
}
