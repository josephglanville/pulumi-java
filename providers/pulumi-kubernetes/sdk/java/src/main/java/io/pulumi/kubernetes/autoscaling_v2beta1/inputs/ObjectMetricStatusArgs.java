// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.CrossVersionObjectReferenceArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectMetricStatusArgs Empty = new ObjectMetricStatusArgs();

    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    @Import(name="averageValue")
      private final @Nullable Output<String> averageValue;

    public Output<String> getAverageValue() {
        return this.averageValue == null ? Codegen.empty() : this.averageValue;
    }

    /**
     * currentValue is the current value of the metric (as a quantity).
     * 
     */
    @Import(name="currentValue", required=true)
      private final Output<String> currentValue;

    public Output<String> getCurrentValue() {
        return this.currentValue;
    }

    /**
     * metricName is the name of the metric in question.
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<LabelSelectorArgs> selector;

    public Output<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Codegen.empty() : this.selector;
    }

    /**
     * target is the described Kubernetes object.
     * 
     */
    @Import(name="target", required=true)
      private final Output<CrossVersionObjectReferenceArgs> target;

    public Output<CrossVersionObjectReferenceArgs> getTarget() {
        return this.target;
    }

    public ObjectMetricStatusArgs(
        @Nullable Output<String> averageValue,
        Output<String> currentValue,
        Output<String> metricName,
        @Nullable Output<LabelSelectorArgs> selector,
        Output<CrossVersionObjectReferenceArgs> target) {
        this.averageValue = averageValue;
        this.currentValue = Objects.requireNonNull(currentValue, "expected parameter 'currentValue' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.selector = selector;
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ObjectMetricStatusArgs() {
        this.averageValue = Codegen.empty();
        this.currentValue = Codegen.empty();
        this.metricName = Codegen.empty();
        this.selector = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> averageValue;
        private Output<String> currentValue;
        private Output<String> metricName;
        private @Nullable Output<LabelSelectorArgs> selector;
        private Output<CrossVersionObjectReferenceArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageValue = defaults.averageValue;
    	      this.currentValue = defaults.currentValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.target = defaults.target;
        }

        public Builder averageValue(@Nullable Output<String> averageValue) {
            this.averageValue = averageValue;
            return this;
        }
        public Builder averageValue(@Nullable String averageValue) {
            this.averageValue = Codegen.ofNullable(averageValue);
            return this;
        }
        public Builder currentValue(Output<String> currentValue) {
            this.currentValue = Objects.requireNonNull(currentValue);
            return this;
        }
        public Builder currentValue(String currentValue) {
            this.currentValue = Output.of(Objects.requireNonNull(currentValue));
            return this;
        }
        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }
        public Builder selector(@Nullable LabelSelectorArgs selector) {
            this.selector = Codegen.ofNullable(selector);
            return this;
        }
        public Builder target(Output<CrossVersionObjectReferenceArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(CrossVersionObjectReferenceArgs target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public ObjectMetricStatusArgs build() {
            return new ObjectMetricStatusArgs(averageValue, currentValue, metricName, selector, target);
        }
    }
}
