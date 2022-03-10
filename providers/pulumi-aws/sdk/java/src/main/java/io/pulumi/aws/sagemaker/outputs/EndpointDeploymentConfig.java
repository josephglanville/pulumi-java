// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.EndpointDeploymentConfigAutoRollbackConfiguration;
import io.pulumi.aws.sagemaker.outputs.EndpointDeploymentConfigBlueGreenUpdatePolicy;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointDeploymentConfig {
    /**
     * Automatic rollback configuration for handling endpoint deployment failures and recovery. See Auto Rollback Configuration.
     * 
     */
    private final @Nullable EndpointDeploymentConfigAutoRollbackConfiguration autoRollbackConfiguration;
    /**
     * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet during the deployment while maintaining the old fleet. See Blue Green Update Config.
     * 
     */
    private final EndpointDeploymentConfigBlueGreenUpdatePolicy blueGreenUpdatePolicy;

    @OutputCustomType.Constructor
    private EndpointDeploymentConfig(
        @OutputCustomType.Parameter("autoRollbackConfiguration") @Nullable EndpointDeploymentConfigAutoRollbackConfiguration autoRollbackConfiguration,
        @OutputCustomType.Parameter("blueGreenUpdatePolicy") EndpointDeploymentConfigBlueGreenUpdatePolicy blueGreenUpdatePolicy) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        this.blueGreenUpdatePolicy = blueGreenUpdatePolicy;
    }

    /**
     * Automatic rollback configuration for handling endpoint deployment failures and recovery. See Auto Rollback Configuration.
     * 
    */
    public Optional<EndpointDeploymentConfigAutoRollbackConfiguration> getAutoRollbackConfiguration() {
        return Optional.ofNullable(this.autoRollbackConfiguration);
    }
    /**
     * Update policy for a blue/green deployment. If this update policy is specified, SageMaker creates a new fleet during the deployment while maintaining the old fleet. See Blue Green Update Config.
     * 
    */
    public EndpointDeploymentConfigBlueGreenUpdatePolicy getBlueGreenUpdatePolicy() {
        return this.blueGreenUpdatePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EndpointDeploymentConfigAutoRollbackConfiguration autoRollbackConfiguration;
        private EndpointDeploymentConfigBlueGreenUpdatePolicy blueGreenUpdatePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRollbackConfiguration = defaults.autoRollbackConfiguration;
    	      this.blueGreenUpdatePolicy = defaults.blueGreenUpdatePolicy;
        }

        public Builder setAutoRollbackConfiguration(@Nullable EndpointDeploymentConfigAutoRollbackConfiguration autoRollbackConfiguration) {
            this.autoRollbackConfiguration = autoRollbackConfiguration;
            return this;
        }

        public Builder setBlueGreenUpdatePolicy(EndpointDeploymentConfigBlueGreenUpdatePolicy blueGreenUpdatePolicy) {
            this.blueGreenUpdatePolicy = Objects.requireNonNull(blueGreenUpdatePolicy);
            return this;
        }
        public EndpointDeploymentConfig build() {
            return new EndpointDeploymentConfig(autoRollbackConfiguration, blueGreenUpdatePolicy);
        }
    }
}
