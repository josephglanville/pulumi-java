// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointDeploymentConfigBlueGreenUpdatePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigBlueGreenUpdatePolicyArgs Empty = new EndpointDeploymentConfigBlueGreenUpdatePolicyArgs();

    /**
     * Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total waiting time specified in `termination_wait_in_seconds` and `wait_interval_in_seconds`. Valid values are between `600` and `14400`.
     * 
     */
    @Import(name="maximumExecutionTimeoutInSeconds")
      private final @Nullable Output<Integer> maximumExecutionTimeoutInSeconds;

    public Output<Integer> getMaximumExecutionTimeoutInSeconds() {
        return this.maximumExecutionTimeoutInSeconds == null ? Codegen.empty() : this.maximumExecutionTimeoutInSeconds;
    }

    /**
     * Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old endpoint fleet. Default is `0`. Valid values are between `0` and `3600`.
     * 
     */
    @Import(name="terminationWaitInSeconds")
      private final @Nullable Output<Integer> terminationWaitInSeconds;

    public Output<Integer> getTerminationWaitInSeconds() {
        return this.terminationWaitInSeconds == null ? Codegen.empty() : this.terminationWaitInSeconds;
    }

    /**
     * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint deployment. See Traffic Routing Configuration.
     * 
     */
    @Import(name="trafficRoutingConfiguration", required=true)
      private final Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs> trafficRoutingConfiguration;

    public Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs> getTrafficRoutingConfiguration() {
        return this.trafficRoutingConfiguration;
    }

    public EndpointDeploymentConfigBlueGreenUpdatePolicyArgs(
        @Nullable Output<Integer> maximumExecutionTimeoutInSeconds,
        @Nullable Output<Integer> terminationWaitInSeconds,
        Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs> trafficRoutingConfiguration) {
        this.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
        this.terminationWaitInSeconds = terminationWaitInSeconds;
        this.trafficRoutingConfiguration = Objects.requireNonNull(trafficRoutingConfiguration, "expected parameter 'trafficRoutingConfiguration' to be non-null");
    }

    private EndpointDeploymentConfigBlueGreenUpdatePolicyArgs() {
        this.maximumExecutionTimeoutInSeconds = Codegen.empty();
        this.terminationWaitInSeconds = Codegen.empty();
        this.trafficRoutingConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigBlueGreenUpdatePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maximumExecutionTimeoutInSeconds;
        private @Nullable Output<Integer> terminationWaitInSeconds;
        private Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs> trafficRoutingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigBlueGreenUpdatePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumExecutionTimeoutInSeconds = defaults.maximumExecutionTimeoutInSeconds;
    	      this.terminationWaitInSeconds = defaults.terminationWaitInSeconds;
    	      this.trafficRoutingConfiguration = defaults.trafficRoutingConfiguration;
        }

        public Builder maximumExecutionTimeoutInSeconds(@Nullable Output<Integer> maximumExecutionTimeoutInSeconds) {
            this.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
            return this;
        }
        public Builder maximumExecutionTimeoutInSeconds(@Nullable Integer maximumExecutionTimeoutInSeconds) {
            this.maximumExecutionTimeoutInSeconds = Codegen.ofNullable(maximumExecutionTimeoutInSeconds);
            return this;
        }
        public Builder terminationWaitInSeconds(@Nullable Output<Integer> terminationWaitInSeconds) {
            this.terminationWaitInSeconds = terminationWaitInSeconds;
            return this;
        }
        public Builder terminationWaitInSeconds(@Nullable Integer terminationWaitInSeconds) {
            this.terminationWaitInSeconds = Codegen.ofNullable(terminationWaitInSeconds);
            return this;
        }
        public Builder trafficRoutingConfiguration(Output<EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs> trafficRoutingConfiguration) {
            this.trafficRoutingConfiguration = Objects.requireNonNull(trafficRoutingConfiguration);
            return this;
        }
        public Builder trafficRoutingConfiguration(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationArgs trafficRoutingConfiguration) {
            this.trafficRoutingConfiguration = Output.of(Objects.requireNonNull(trafficRoutingConfiguration));
            return this;
        }        public EndpointDeploymentConfigBlueGreenUpdatePolicyArgs build() {
            return new EndpointDeploymentConfigBlueGreenUpdatePolicyArgs(maximumExecutionTimeoutInSeconds, terminationWaitInSeconds, trafficRoutingConfiguration);
        }
    }
}
