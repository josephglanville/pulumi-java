// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentMonitor {
    /**
     * ARN of the Amazon CloudWatch alarm.
     * 
     */
    private final String alarmArn;
    /**
     * ARN of an IAM role for AWS AppConfig to monitor `alarm_arn`.
     * 
     */
    private final @Nullable String alarmRoleArn;

    @OutputCustomType.Constructor
    private EnvironmentMonitor(
        @OutputCustomType.Parameter("alarmArn") String alarmArn,
        @OutputCustomType.Parameter("alarmRoleArn") @Nullable String alarmRoleArn) {
        this.alarmArn = alarmArn;
        this.alarmRoleArn = alarmRoleArn;
    }

    /**
     * ARN of the Amazon CloudWatch alarm.
     * 
    */
    public String getAlarmArn() {
        return this.alarmArn;
    }
    /**
     * ARN of an IAM role for AWS AppConfig to monitor `alarm_arn`.
     * 
    */
    public Optional<String> getAlarmRoleArn() {
        return Optional.ofNullable(this.alarmRoleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMonitor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmArn;
        private @Nullable String alarmRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentMonitor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmArn = defaults.alarmArn;
    	      this.alarmRoleArn = defaults.alarmRoleArn;
        }

        public Builder setAlarmArn(String alarmArn) {
            this.alarmArn = Objects.requireNonNull(alarmArn);
            return this;
        }

        public Builder setAlarmRoleArn(@Nullable String alarmRoleArn) {
            this.alarmRoleArn = alarmRoleArn;
            return this;
        }
        public EnvironmentMonitor build() {
            return new EnvironmentMonitor(alarmArn, alarmRoleArn);
        }
    }
}
