// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.EndpointDeploymentConfigAutoRollbackConfigurationAlarm;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointDeploymentConfigAutoRollbackConfiguration {
    /**
     * List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker rolls back the deployment. See Alarms.
     * 
     */
    private final @Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> alarms;

    @OutputCustomType.Constructor
    private EndpointDeploymentConfigAutoRollbackConfiguration(@OutputCustomType.Parameter("alarms") @Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> alarms) {
        this.alarms = alarms;
    }

    /**
     * List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker rolls back the deployment. See Alarms.
     * 
    */
    public List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> getAlarms() {
        return this.alarms == null ? List.of() : this.alarms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigAutoRollbackConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> alarms;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigAutoRollbackConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarms = defaults.alarms;
        }

        public Builder setAlarms(@Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarm> alarms) {
            this.alarms = alarms;
            return this;
        }
        public EndpointDeploymentConfigAutoRollbackConfiguration build() {
            return new EndpointDeploymentConfigAutoRollbackConfiguration(alarms);
        }
    }
}
