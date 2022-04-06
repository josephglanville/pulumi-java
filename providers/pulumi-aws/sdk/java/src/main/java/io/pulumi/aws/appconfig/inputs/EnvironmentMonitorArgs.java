// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentMonitorArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentMonitorArgs Empty = new EnvironmentMonitorArgs();

    /**
     * ARN of the Amazon CloudWatch alarm.
     * 
     */
    @Import(name="alarmArn", required=true)
      private final Output<String> alarmArn;

    public Output<String> getAlarmArn() {
        return this.alarmArn;
    }

    /**
     * ARN of an IAM role for AWS AppConfig to monitor `alarm_arn`.
     * 
     */
    @Import(name="alarmRoleArn")
      private final @Nullable Output<String> alarmRoleArn;

    public Output<String> getAlarmRoleArn() {
        return this.alarmRoleArn == null ? Output.empty() : this.alarmRoleArn;
    }

    public EnvironmentMonitorArgs(
        Output<String> alarmArn,
        @Nullable Output<String> alarmRoleArn) {
        this.alarmArn = Objects.requireNonNull(alarmArn, "expected parameter 'alarmArn' to be non-null");
        this.alarmRoleArn = alarmRoleArn;
    }

    private EnvironmentMonitorArgs() {
        this.alarmArn = Output.empty();
        this.alarmRoleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> alarmArn;
        private @Nullable Output<String> alarmRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentMonitorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmArn = defaults.alarmArn;
    	      this.alarmRoleArn = defaults.alarmRoleArn;
        }

        public Builder alarmArn(Output<String> alarmArn) {
            this.alarmArn = Objects.requireNonNull(alarmArn);
            return this;
        }
        public Builder alarmArn(String alarmArn) {
            this.alarmArn = Output.of(Objects.requireNonNull(alarmArn));
            return this;
        }
        public Builder alarmRoleArn(@Nullable Output<String> alarmRoleArn) {
            this.alarmRoleArn = alarmRoleArn;
            return this;
        }
        public Builder alarmRoleArn(@Nullable String alarmRoleArn) {
            this.alarmRoleArn = Output.ofNullable(alarmRoleArn);
            return this;
        }        public EnvironmentMonitorArgs build() {
            return new EnvironmentMonitorArgs(alarmArn, alarmRoleArn);
        }
    }
}