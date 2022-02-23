// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleCloudwatchAlarmAction extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleCloudwatchAlarmAction Empty = new TopicRuleCloudwatchAlarmAction();

    @InputImport(name="alarmName", required=true)
      private final String alarmName;

    public String getAlarmName() {
        return this.alarmName;
    }

    @InputImport(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="stateReason", required=true)
      private final String stateReason;

    public String getStateReason() {
        return this.stateReason;
    }

    @InputImport(name="stateValue", required=true)
      private final String stateValue;

    public String getStateValue() {
        return this.stateValue;
    }

    public TopicRuleCloudwatchAlarmAction(
        String alarmName,
        String roleArn,
        String stateReason,
        String stateValue) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stateReason = Objects.requireNonNull(stateReason, "expected parameter 'stateReason' to be non-null");
        this.stateValue = Objects.requireNonNull(stateValue, "expected parameter 'stateValue' to be non-null");
    }

    private TopicRuleCloudwatchAlarmAction() {
        this.alarmName = null;
        this.roleArn = null;
        this.stateReason = null;
        this.stateValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchAlarmAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmName;
        private String roleArn;
        private String stateReason;
        private String stateValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchAlarmAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.roleArn = defaults.roleArn;
    	      this.stateReason = defaults.stateReason;
    	      this.stateValue = defaults.stateValue;
        }

        public Builder setAlarmName(String alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setStateReason(String stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }

        public Builder setStateValue(String stateValue) {
            this.stateValue = Objects.requireNonNull(stateValue);
            return this;
        }
        public TopicRuleCloudwatchAlarmAction build() {
            return new TopicRuleCloudwatchAlarmAction(alarmName, roleArn, stateReason, stateValue);
        }
    }
}
