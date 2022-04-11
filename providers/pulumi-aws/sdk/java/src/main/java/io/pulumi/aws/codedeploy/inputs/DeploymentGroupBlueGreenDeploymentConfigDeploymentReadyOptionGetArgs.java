// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs Empty = new DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs();

    /**
     * When to reroute traffic from an original environment to a replacement environment in a blue/green deployment.
     * * `CONTINUE_DEPLOYMENT`: Register new instances with the load balancer immediately after the new application revision is installed on the instances in the replacement environment.
     * * `STOP_DEPLOYMENT`: Do not register new instances with load balancer unless traffic is rerouted manually. If traffic is not rerouted manually before the end of the specified wait period, the deployment status is changed to Stopped.
     * 
     */
    @Import(name="actionOnTimeout")
      private final @Nullable Output<String> actionOnTimeout;

    public Output<String> getActionOnTimeout() {
        return this.actionOnTimeout == null ? Codegen.empty() : this.actionOnTimeout;
    }

    /**
     * The number of minutes to wait before the status of a blue/green deployment changed to Stopped if rerouting is not started manually. Applies only to the `STOP_DEPLOYMENT` option for `action_on_timeout`.
     * 
     */
    @Import(name="waitTimeInMinutes")
      private final @Nullable Output<Integer> waitTimeInMinutes;

    public Output<Integer> getWaitTimeInMinutes() {
        return this.waitTimeInMinutes == null ? Codegen.empty() : this.waitTimeInMinutes;
    }

    public DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs(
        @Nullable Output<String> actionOnTimeout,
        @Nullable Output<Integer> waitTimeInMinutes) {
        this.actionOnTimeout = actionOnTimeout;
        this.waitTimeInMinutes = waitTimeInMinutes;
    }

    private DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs() {
        this.actionOnTimeout = Codegen.empty();
        this.waitTimeInMinutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionOnTimeout;
        private @Nullable Output<Integer> waitTimeInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionOnTimeout = defaults.actionOnTimeout;
    	      this.waitTimeInMinutes = defaults.waitTimeInMinutes;
        }

        public Builder actionOnTimeout(@Nullable Output<String> actionOnTimeout) {
            this.actionOnTimeout = actionOnTimeout;
            return this;
        }
        public Builder actionOnTimeout(@Nullable String actionOnTimeout) {
            this.actionOnTimeout = Codegen.ofNullable(actionOnTimeout);
            return this;
        }
        public Builder waitTimeInMinutes(@Nullable Output<Integer> waitTimeInMinutes) {
            this.waitTimeInMinutes = waitTimeInMinutes;
            return this;
        }
        public Builder waitTimeInMinutes(@Nullable Integer waitTimeInMinutes) {
            this.waitTimeInMinutes = Codegen.ofNullable(waitTimeInMinutes);
            return this;
        }        public DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs build() {
            return new DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs(actionOnTimeout, waitTimeInMinutes);
        }
    }
}
