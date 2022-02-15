// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.inputs.ServiceDeploymentCircuitBreakerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceDeploymentConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceDeploymentConfigurationArgs Empty = new ServiceDeploymentConfigurationArgs();

    @InputImport(name="deploymentCircuitBreaker")
    private final @Nullable Input<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker;

    public Input<ServiceDeploymentCircuitBreakerArgs> getDeploymentCircuitBreaker() {
        return this.deploymentCircuitBreaker == null ? Input.empty() : this.deploymentCircuitBreaker;
    }

    @InputImport(name="maximumPercent")
    private final @Nullable Input<Integer> maximumPercent;

    public Input<Integer> getMaximumPercent() {
        return this.maximumPercent == null ? Input.empty() : this.maximumPercent;
    }

    @InputImport(name="minimumHealthyPercent")
    private final @Nullable Input<Integer> minimumHealthyPercent;

    public Input<Integer> getMinimumHealthyPercent() {
        return this.minimumHealthyPercent == null ? Input.empty() : this.minimumHealthyPercent;
    }

    public ServiceDeploymentConfigurationArgs(
        @Nullable Input<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker,
        @Nullable Input<Integer> maximumPercent,
        @Nullable Input<Integer> minimumHealthyPercent) {
        this.deploymentCircuitBreaker = deploymentCircuitBreaker;
        this.maximumPercent = maximumPercent;
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    private ServiceDeploymentConfigurationArgs() {
        this.deploymentCircuitBreaker = Input.empty();
        this.maximumPercent = Input.empty();
        this.minimumHealthyPercent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker;
        private @Nullable Input<Integer> maximumPercent;
        private @Nullable Input<Integer> minimumHealthyPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentCircuitBreaker = defaults.deploymentCircuitBreaker;
    	      this.maximumPercent = defaults.maximumPercent;
    	      this.minimumHealthyPercent = defaults.minimumHealthyPercent;
        }

        public Builder setDeploymentCircuitBreaker(@Nullable Input<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = deploymentCircuitBreaker;
            return this;
        }

        public Builder setDeploymentCircuitBreaker(@Nullable ServiceDeploymentCircuitBreakerArgs deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = Input.ofNullable(deploymentCircuitBreaker);
            return this;
        }

        public Builder setMaximumPercent(@Nullable Input<Integer> maximumPercent) {
            this.maximumPercent = maximumPercent;
            return this;
        }

        public Builder setMaximumPercent(@Nullable Integer maximumPercent) {
            this.maximumPercent = Input.ofNullable(maximumPercent);
            return this;
        }

        public Builder setMinimumHealthyPercent(@Nullable Input<Integer> minimumHealthyPercent) {
            this.minimumHealthyPercent = minimumHealthyPercent;
            return this;
        }

        public Builder setMinimumHealthyPercent(@Nullable Integer minimumHealthyPercent) {
            this.minimumHealthyPercent = Input.ofNullable(minimumHealthyPercent);
            return this;
        }

        public ServiceDeploymentConfigurationArgs build() {
            return new ServiceDeploymentConfigurationArgs(deploymentCircuitBreaker, maximumPercent, minimumHealthyPercent);
        }
    }
}