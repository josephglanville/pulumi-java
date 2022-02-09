// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementEventAggregationConditionResponse {
    private final @Nullable String operator;
    private final @Nullable Double threshold;
    private final @Nullable String windowSize;

    @OutputCustomType.Constructor({"operator","threshold","windowSize"})
    private ManagementEventAggregationConditionResponse(
        @Nullable String operator,
        @Nullable Double threshold,
        @Nullable String windowSize) {
        this.operator = operator;
        this.threshold = threshold;
        this.windowSize = windowSize;
    }

    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    public Optional<Double> getThreshold() {
        return Optional.ofNullable(this.threshold);
    }
    public Optional<String> getWindowSize() {
        return Optional.ofNullable(this.windowSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementEventAggregationConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operator;
        private @Nullable Double threshold;
        private @Nullable String windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementEventAggregationConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder setOperator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder setThreshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setWindowSize(@Nullable String windowSize) {
            this.windowSize = windowSize;
            return this;
        }

        public ManagementEventAggregationConditionResponse build() {
            return new ManagementEventAggregationConditionResponse(operator, threshold, windowSize);
        }
    }
}
