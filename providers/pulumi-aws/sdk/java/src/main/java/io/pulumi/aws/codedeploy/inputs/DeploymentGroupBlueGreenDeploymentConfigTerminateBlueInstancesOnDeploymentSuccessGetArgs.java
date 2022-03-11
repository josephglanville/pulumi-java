// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs Empty = new DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs();

    /**
     * The action to take on instances in the original environment after a successful blue/green deployment.
     * * `TERMINATE`: Instances are terminated after a specified wait time.
     * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.
     * 
     */
    @InputImport(name="terminationWaitTimeInMinutes")
      private final @Nullable Output<Integer> terminationWaitTimeInMinutes;

    public Output<Integer> getTerminationWaitTimeInMinutes() {
        return this.terminationWaitTimeInMinutes == null ? Output.empty() : this.terminationWaitTimeInMinutes;
    }

    public DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs(
        @Nullable Output<String> action,
        @Nullable Output<Integer> terminationWaitTimeInMinutes) {
        this.action = action;
        this.terminationWaitTimeInMinutes = terminationWaitTimeInMinutes;
    }

    private DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs() {
        this.action = Output.empty();
        this.terminationWaitTimeInMinutes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<Integer> terminationWaitTimeInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.terminationWaitTimeInMinutes = defaults.terminationWaitTimeInMinutes;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable String action) {
            this.action = Output.ofNullable(action);
            return this;
        }

        public Builder terminationWaitTimeInMinutes(@Nullable Output<Integer> terminationWaitTimeInMinutes) {
            this.terminationWaitTimeInMinutes = terminationWaitTimeInMinutes;
            return this;
        }

        public Builder terminationWaitTimeInMinutes(@Nullable Integer terminationWaitTimeInMinutes) {
            this.terminationWaitTimeInMinutes = Output.ofNullable(terminationWaitTimeInMinutes);
            return this;
        }
        public DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs build() {
            return new DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs(action, terminationWaitTimeInMinutes);
        }
    }
}
