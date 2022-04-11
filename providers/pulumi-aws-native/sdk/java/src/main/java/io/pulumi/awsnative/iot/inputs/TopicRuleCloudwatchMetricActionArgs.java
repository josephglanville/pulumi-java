// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleCloudwatchMetricActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleCloudwatchMetricActionArgs Empty = new TopicRuleCloudwatchMetricActionArgs();

    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
    }

    @Import(name="metricNamespace", required=true)
      private final Output<String> metricNamespace;

    public Output<String> getMetricNamespace() {
        return this.metricNamespace;
    }

    @Import(name="metricTimestamp")
      private final @Nullable Output<String> metricTimestamp;

    public Output<String> getMetricTimestamp() {
        return this.metricTimestamp == null ? Codegen.empty() : this.metricTimestamp;
    }

    @Import(name="metricUnit", required=true)
      private final Output<String> metricUnit;

    public Output<String> getMetricUnit() {
        return this.metricUnit;
    }

    @Import(name="metricValue", required=true)
      private final Output<String> metricValue;

    public Output<String> getMetricValue() {
        return this.metricValue;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleCloudwatchMetricActionArgs(
        Output<String> metricName,
        Output<String> metricNamespace,
        @Nullable Output<String> metricTimestamp,
        Output<String> metricUnit,
        Output<String> metricValue,
        Output<String> roleArn) {
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricNamespace = Objects.requireNonNull(metricNamespace, "expected parameter 'metricNamespace' to be non-null");
        this.metricTimestamp = metricTimestamp;
        this.metricUnit = Objects.requireNonNull(metricUnit, "expected parameter 'metricUnit' to be non-null");
        this.metricValue = Objects.requireNonNull(metricValue, "expected parameter 'metricValue' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleCloudwatchMetricActionArgs() {
        this.metricName = Codegen.empty();
        this.metricNamespace = Codegen.empty();
        this.metricTimestamp = Codegen.empty();
        this.metricUnit = Codegen.empty();
        this.metricValue = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchMetricActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> metricName;
        private Output<String> metricNamespace;
        private @Nullable Output<String> metricTimestamp;
        private Output<String> metricUnit;
        private Output<String> metricValue;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchMetricActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.metricTimestamp = defaults.metricTimestamp;
    	      this.metricUnit = defaults.metricUnit;
    	      this.metricValue = defaults.metricValue;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public Builder metricNamespace(Output<String> metricNamespace) {
            this.metricNamespace = Objects.requireNonNull(metricNamespace);
            return this;
        }
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = Output.of(Objects.requireNonNull(metricNamespace));
            return this;
        }
        public Builder metricTimestamp(@Nullable Output<String> metricTimestamp) {
            this.metricTimestamp = metricTimestamp;
            return this;
        }
        public Builder metricTimestamp(@Nullable String metricTimestamp) {
            this.metricTimestamp = Codegen.ofNullable(metricTimestamp);
            return this;
        }
        public Builder metricUnit(Output<String> metricUnit) {
            this.metricUnit = Objects.requireNonNull(metricUnit);
            return this;
        }
        public Builder metricUnit(String metricUnit) {
            this.metricUnit = Output.of(Objects.requireNonNull(metricUnit));
            return this;
        }
        public Builder metricValue(Output<String> metricValue) {
            this.metricValue = Objects.requireNonNull(metricValue);
            return this;
        }
        public Builder metricValue(String metricValue) {
            this.metricValue = Output.of(Objects.requireNonNull(metricValue));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public TopicRuleCloudwatchMetricActionArgs build() {
            return new TopicRuleCloudwatchMetricActionArgs(metricName, metricNamespace, metricTimestamp, metricUnit, metricValue, roleArn);
        }
    }
}
