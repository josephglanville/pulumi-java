// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs Empty = new EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs();

    /**
     * The name of a CloudWatch alarm in your account.
     * 
     */
    @Import(name="alarmName", required=true)
      private final Output<String> alarmName;

    public Output<String> getAlarmName() {
        return this.alarmName;
    }

    public EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs(Output<String> alarmName) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
    }

    private EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs() {
        this.alarmName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> alarmName;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
        }

        public Builder alarmName(Output<String> alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }
        public Builder alarmName(String alarmName) {
            this.alarmName = Output.of(Objects.requireNonNull(alarmName));
            return this;
        }        public EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs build() {
            return new EndpointDeploymentConfigAutoRollbackConfigurationAlarmArgs(alarmName);
        }
    }
}