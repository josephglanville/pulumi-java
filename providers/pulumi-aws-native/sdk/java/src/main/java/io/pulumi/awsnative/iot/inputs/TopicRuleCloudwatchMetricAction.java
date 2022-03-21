// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleCloudwatchMetricAction extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleCloudwatchMetricAction Empty = new TopicRuleCloudwatchMetricAction();

    @Import(name="metricName", required=true)
      private final String metricName;

    public String getMetricName() {
        return this.metricName;
    }

    @Import(name="metricNamespace", required=true)
      private final String metricNamespace;

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    @Import(name="metricTimestamp")
      private final @Nullable String metricTimestamp;

    public Optional<String> getMetricTimestamp() {
        return this.metricTimestamp == null ? Optional.empty() : Optional.ofNullable(this.metricTimestamp);
    }

    @Import(name="metricUnit", required=true)
      private final String metricUnit;

    public String getMetricUnit() {
        return this.metricUnit;
    }

    @Import(name="metricValue", required=true)
      private final String metricValue;

    public String getMetricValue() {
        return this.metricValue;
    }

    @Import(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleCloudwatchMetricAction(
        String metricName,
        String metricNamespace,
        @Nullable String metricTimestamp,
        String metricUnit,
        String metricValue,
        String roleArn) {
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricNamespace = Objects.requireNonNull(metricNamespace, "expected parameter 'metricNamespace' to be non-null");
        this.metricTimestamp = metricTimestamp;
        this.metricUnit = Objects.requireNonNull(metricUnit, "expected parameter 'metricUnit' to be non-null");
        this.metricValue = Objects.requireNonNull(metricValue, "expected parameter 'metricValue' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleCloudwatchMetricAction() {
        this.metricName = null;
        this.metricNamespace = null;
        this.metricTimestamp = null;
        this.metricUnit = null;
        this.metricValue = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchMetricAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricName;
        private String metricNamespace;
        private @Nullable String metricTimestamp;
        private String metricUnit;
        private String metricValue;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchMetricAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.metricTimestamp = defaults.metricTimestamp;
    	      this.metricUnit = defaults.metricUnit;
    	      this.metricValue = defaults.metricValue;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = Objects.requireNonNull(metricNamespace);
            return this;
        }
        public Builder metricTimestamp(@Nullable String metricTimestamp) {
            this.metricTimestamp = metricTimestamp;
            return this;
        }
        public Builder metricUnit(String metricUnit) {
            this.metricUnit = Objects.requireNonNull(metricUnit);
            return this;
        }
        public Builder metricValue(String metricValue) {
            this.metricValue = Objects.requireNonNull(metricValue);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public TopicRuleCloudwatchMetricAction build() {
            return new TopicRuleCloudwatchMetricAction(metricName, metricNamespace, metricTimestamp, metricUnit, metricValue, roleArn);
        }
    }
}
