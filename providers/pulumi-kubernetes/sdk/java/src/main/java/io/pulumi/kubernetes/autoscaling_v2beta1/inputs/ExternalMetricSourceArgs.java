// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExternalMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalMetricSourceArgs Empty = new ExternalMetricSourceArgs();

    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    @InputImport(name="metricSelector")
    private final @Nullable Input<LabelSelectorArgs> metricSelector;

    public Input<LabelSelectorArgs> getMetricSelector() {
        return this.metricSelector == null ? Input.empty() : this.metricSelector;
    }

    @InputImport(name="targetAverageValue")
    private final @Nullable Input<String> targetAverageValue;

    public Input<String> getTargetAverageValue() {
        return this.targetAverageValue == null ? Input.empty() : this.targetAverageValue;
    }

    @InputImport(name="targetValue")
    private final @Nullable Input<String> targetValue;

    public Input<String> getTargetValue() {
        return this.targetValue == null ? Input.empty() : this.targetValue;
    }

    public ExternalMetricSourceArgs(
        Input<String> metricName,
        @Nullable Input<LabelSelectorArgs> metricSelector,
        @Nullable Input<String> targetAverageValue,
        @Nullable Input<String> targetValue) {
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricSelector = metricSelector;
        this.targetAverageValue = targetAverageValue;
        this.targetValue = targetValue;
    }

    private ExternalMetricSourceArgs() {
        this.metricName = Input.empty();
        this.metricSelector = Input.empty();
        this.targetAverageValue = Input.empty();
        this.targetValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> metricName;
        private @Nullable Input<LabelSelectorArgs> metricSelector;
        private @Nullable Input<String> targetAverageValue;
        private @Nullable Input<String> targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.metricSelector = defaults.metricSelector;
    	      this.targetAverageValue = defaults.targetAverageValue;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setMetricSelector(@Nullable Input<LabelSelectorArgs> metricSelector) {
            this.metricSelector = metricSelector;
            return this;
        }

        public Builder setMetricSelector(@Nullable LabelSelectorArgs metricSelector) {
            this.metricSelector = Input.ofNullable(metricSelector);
            return this;
        }

        public Builder setTargetAverageValue(@Nullable Input<String> targetAverageValue) {
            this.targetAverageValue = targetAverageValue;
            return this;
        }

        public Builder setTargetAverageValue(@Nullable String targetAverageValue) {
            this.targetAverageValue = Input.ofNullable(targetAverageValue);
            return this;
        }

        public Builder setTargetValue(@Nullable Input<String> targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        public Builder setTargetValue(@Nullable String targetValue) {
            this.targetValue = Input.ofNullable(targetValue);
            return this;
        }

        public ExternalMetricSourceArgs build() {
            return new ExternalMetricSourceArgs(metricName, metricSelector, targetAverageValue, targetValue);
        }
    }
}
