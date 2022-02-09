// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class TimeWindowCustomAlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeWindowCustomAlertRuleArgs Empty = new TimeWindowCustomAlertRuleArgs();

    @InputImport(name="isEnabled", required=true)
    private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    @InputImport(name="maxThreshold", required=true)
    private final Input<Integer> maxThreshold;

    public Input<Integer> getMaxThreshold() {
        return this.maxThreshold;
    }

    @InputImport(name="minThreshold", required=true)
    private final Input<Integer> minThreshold;

    public Input<Integer> getMinThreshold() {
        return this.minThreshold;
    }

    @InputImport(name="ruleType", required=true)
    private final Input<String> ruleType;

    public Input<String> getRuleType() {
        return this.ruleType;
    }

    @InputImport(name="timeWindowSize", required=true)
    private final Input<String> timeWindowSize;

    public Input<String> getTimeWindowSize() {
        return this.timeWindowSize;
    }

    public TimeWindowCustomAlertRuleArgs(
        Input<Boolean> isEnabled,
        Input<Integer> maxThreshold,
        Input<Integer> minThreshold,
        Input<String> ruleType,
        Input<String> timeWindowSize) {
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.maxThreshold = Objects.requireNonNull(maxThreshold, "expected parameter 'maxThreshold' to be non-null");
        this.minThreshold = Objects.requireNonNull(minThreshold, "expected parameter 'minThreshold' to be non-null");
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.timeWindowSize = Objects.requireNonNull(timeWindowSize, "expected parameter 'timeWindowSize' to be non-null");
    }

    private TimeWindowCustomAlertRuleArgs() {
        this.isEnabled = Input.empty();
        this.maxThreshold = Input.empty();
        this.minThreshold = Input.empty();
        this.ruleType = Input.empty();
        this.timeWindowSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeWindowCustomAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> isEnabled;
        private Input<Integer> maxThreshold;
        private Input<Integer> minThreshold;
        private Input<String> ruleType;
        private Input<String> timeWindowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeWindowCustomAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.maxThreshold = defaults.maxThreshold;
    	      this.minThreshold = defaults.minThreshold;
    	      this.ruleType = defaults.ruleType;
    	      this.timeWindowSize = defaults.timeWindowSize;
        }

        public Builder setIsEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder setMaxThreshold(Input<Integer> maxThreshold) {
            this.maxThreshold = Objects.requireNonNull(maxThreshold);
            return this;
        }

        public Builder setMaxThreshold(Integer maxThreshold) {
            this.maxThreshold = Input.of(Objects.requireNonNull(maxThreshold));
            return this;
        }

        public Builder setMinThreshold(Input<Integer> minThreshold) {
            this.minThreshold = Objects.requireNonNull(minThreshold);
            return this;
        }

        public Builder setMinThreshold(Integer minThreshold) {
            this.minThreshold = Input.of(Objects.requireNonNull(minThreshold));
            return this;
        }

        public Builder setRuleType(Input<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Input.of(Objects.requireNonNull(ruleType));
            return this;
        }

        public Builder setTimeWindowSize(Input<String> timeWindowSize) {
            this.timeWindowSize = Objects.requireNonNull(timeWindowSize);
            return this;
        }

        public Builder setTimeWindowSize(String timeWindowSize) {
            this.timeWindowSize = Input.of(Objects.requireNonNull(timeWindowSize));
            return this;
        }

        public TimeWindowCustomAlertRuleArgs build() {
            return new TimeWindowCustomAlertRuleArgs(isEnabled, maxThreshold, minThreshold, ruleType, timeWindowSize);
        }
    }
}
