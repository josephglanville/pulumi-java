// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointDeploymentConfigAutoRollbackConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigAutoRollbackConfigurationArgs Empty = new EndpointDeploymentConfigAutoRollbackConfigurationArgs();

    /**
     * List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker rolls back the deployment. See Alarms.
     * 
     */
    @Import(name="alarms")
      private final @Nullable Output<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs>> alarms;

    public Output<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs>> getAlarms() {
        return this.alarms == null ? Output.empty() : this.alarms;
    }

    public EndpointDeploymentConfigAutoRollbackConfigurationArgs(@Nullable Output<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs>> alarms) {
        this.alarms = alarms;
    }

    private EndpointDeploymentConfigAutoRollbackConfigurationArgs() {
        this.alarms = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigAutoRollbackConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs>> alarms;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigAutoRollbackConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarms = defaults.alarms;
        }

        public Builder alarms(@Nullable Output<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs>> alarms) {
            this.alarms = alarms;
            return this;
        }
        public Builder alarms(@Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs> alarms) {
            this.alarms = Output.ofNullable(alarms);
            return this;
        }
        public Builder alarms(EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs... alarms) {
            return alarms(List.of(alarms));
        }        public EndpointDeploymentConfigAutoRollbackConfigurationArgs build() {
            return new EndpointDeploymentConfigAutoRollbackConfigurationArgs(alarms);
        }
    }
}
