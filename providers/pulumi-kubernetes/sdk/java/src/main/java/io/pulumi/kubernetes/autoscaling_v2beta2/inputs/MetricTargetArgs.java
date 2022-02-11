// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricTargetArgs Empty = new MetricTargetArgs();

    @InputImport(name="averageUtilization")
    private final @Nullable Input<Integer> averageUtilization;

    public Input<Integer> getAverageUtilization() {
        return this.averageUtilization == null ? Input.empty() : this.averageUtilization;
    }

    @InputImport(name="averageValue")
    private final @Nullable Input<String> averageValue;

    public Input<String> getAverageValue() {
        return this.averageValue == null ? Input.empty() : this.averageValue;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public MetricTargetArgs(
        @Nullable Input<Integer> averageUtilization,
        @Nullable Input<String> averageValue,
        Input<String> type,
        @Nullable Input<String> value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = value;
    }

    private MetricTargetArgs() {
        this.averageUtilization = Input.empty();
        this.averageValue = Input.empty();
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> averageUtilization;
        private @Nullable Input<String> averageValue;
        private Input<String> type;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageUtilization = defaults.averageUtilization;
    	      this.averageValue = defaults.averageValue;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setAverageUtilization(@Nullable Input<Integer> averageUtilization) {
            this.averageUtilization = averageUtilization;
            return this;
        }

        public Builder setAverageUtilization(@Nullable Integer averageUtilization) {
            this.averageUtilization = Input.ofNullable(averageUtilization);
            return this;
        }

        public Builder setAverageValue(@Nullable Input<String> averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        public Builder setAverageValue(@Nullable String averageValue) {
            this.averageValue = Input.ofNullable(averageValue);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public MetricTargetArgs build() {
            return new MetricTargetArgs(averageUtilization, averageValue, type, value);
        }
    }
}
