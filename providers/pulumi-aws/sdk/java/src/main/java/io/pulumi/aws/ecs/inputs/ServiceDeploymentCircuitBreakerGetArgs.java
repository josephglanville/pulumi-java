// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ServiceDeploymentCircuitBreakerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceDeploymentCircuitBreakerGetArgs Empty = new ServiceDeploymentCircuitBreakerGetArgs();

    /**
     * Whether to enable the deployment circuit breaker logic for the service.
     * 
     */
    @Import(name="enable", required=true)
      private final Output<Boolean> enable;

    public Output<Boolean> getEnable() {
        return this.enable;
    }

    /**
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
     */
    @Import(name="rollback", required=true)
      private final Output<Boolean> rollback;

    public Output<Boolean> getRollback() {
        return this.rollback;
    }

    public ServiceDeploymentCircuitBreakerGetArgs(
        Output<Boolean> enable,
        Output<Boolean> rollback) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.rollback = Objects.requireNonNull(rollback, "expected parameter 'rollback' to be non-null");
    }

    private ServiceDeploymentCircuitBreakerGetArgs() {
        this.enable = Output.empty();
        this.rollback = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentCircuitBreakerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enable;
        private Output<Boolean> rollback;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentCircuitBreakerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.rollback = defaults.rollback;
        }

        public Builder enable(Output<Boolean> enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder enable(Boolean enable) {
            this.enable = Output.of(Objects.requireNonNull(enable));
            return this;
        }
        public Builder rollback(Output<Boolean> rollback) {
            this.rollback = Objects.requireNonNull(rollback);
            return this;
        }
        public Builder rollback(Boolean rollback) {
            this.rollback = Output.of(Objects.requireNonNull(rollback));
            return this;
        }        public ServiceDeploymentCircuitBreakerGetArgs build() {
            return new ServiceDeploymentCircuitBreakerGetArgs(enable, rollback);
        }
    }
}
