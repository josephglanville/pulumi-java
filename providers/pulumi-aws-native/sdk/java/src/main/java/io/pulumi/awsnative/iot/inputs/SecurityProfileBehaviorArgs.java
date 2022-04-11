// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.SecurityProfileBehaviorCriteriaArgs;
import io.pulumi.awsnative.iot.inputs.SecurityProfileMetricDimensionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A security profile behavior.
 * 
 */
public final class SecurityProfileBehaviorArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileBehaviorArgs Empty = new SecurityProfileBehaviorArgs();

    @Import(name="criteria")
      private final @Nullable Output<SecurityProfileBehaviorCriteriaArgs> criteria;

    public Output<SecurityProfileBehaviorCriteriaArgs> getCriteria() {
        return this.criteria == null ? Codegen.empty() : this.criteria;
    }

    /**
     * What is measured by the behavior.
     * 
     */
    @Import(name="metric")
      private final @Nullable Output<String> metric;

    public Output<String> getMetric() {
        return this.metric == null ? Codegen.empty() : this.metric;
    }

    @Import(name="metricDimension")
      private final @Nullable Output<SecurityProfileMetricDimensionArgs> metricDimension;

    public Output<SecurityProfileMetricDimensionArgs> getMetricDimension() {
        return this.metricDimension == null ? Codegen.empty() : this.metricDimension;
    }

    /**
     * The name for the behavior.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Manage Detect alarm SNS notifications by setting behavior notification to on or suppressed. Detect will continue to performing device behavior evaluations. However, suppressed alarms wouldn't be forwarded for SNS notification.
     * 
     */
    @Import(name="suppressAlerts")
      private final @Nullable Output<Boolean> suppressAlerts;

    public Output<Boolean> getSuppressAlerts() {
        return this.suppressAlerts == null ? Codegen.empty() : this.suppressAlerts;
    }

    public SecurityProfileBehaviorArgs(
        @Nullable Output<SecurityProfileBehaviorCriteriaArgs> criteria,
        @Nullable Output<String> metric,
        @Nullable Output<SecurityProfileMetricDimensionArgs> metricDimension,
        Output<String> name,
        @Nullable Output<Boolean> suppressAlerts) {
        this.criteria = criteria;
        this.metric = metric;
        this.metricDimension = metricDimension;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.suppressAlerts = suppressAlerts;
    }

    private SecurityProfileBehaviorArgs() {
        this.criteria = Codegen.empty();
        this.metric = Codegen.empty();
        this.metricDimension = Codegen.empty();
        this.name = Codegen.empty();
        this.suppressAlerts = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityProfileBehaviorCriteriaArgs> criteria;
        private @Nullable Output<String> metric;
        private @Nullable Output<SecurityProfileMetricDimensionArgs> metricDimension;
        private Output<String> name;
        private @Nullable Output<Boolean> suppressAlerts;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileBehaviorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.metric = defaults.metric;
    	      this.metricDimension = defaults.metricDimension;
    	      this.name = defaults.name;
    	      this.suppressAlerts = defaults.suppressAlerts;
        }

        public Builder criteria(@Nullable Output<SecurityProfileBehaviorCriteriaArgs> criteria) {
            this.criteria = criteria;
            return this;
        }
        public Builder criteria(@Nullable SecurityProfileBehaviorCriteriaArgs criteria) {
            this.criteria = Codegen.ofNullable(criteria);
            return this;
        }
        public Builder metric(@Nullable Output<String> metric) {
            this.metric = metric;
            return this;
        }
        public Builder metric(@Nullable String metric) {
            this.metric = Codegen.ofNullable(metric);
            return this;
        }
        public Builder metricDimension(@Nullable Output<SecurityProfileMetricDimensionArgs> metricDimension) {
            this.metricDimension = metricDimension;
            return this;
        }
        public Builder metricDimension(@Nullable SecurityProfileMetricDimensionArgs metricDimension) {
            this.metricDimension = Codegen.ofNullable(metricDimension);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder suppressAlerts(@Nullable Output<Boolean> suppressAlerts) {
            this.suppressAlerts = suppressAlerts;
            return this;
        }
        public Builder suppressAlerts(@Nullable Boolean suppressAlerts) {
            this.suppressAlerts = Codegen.ofNullable(suppressAlerts);
            return this;
        }        public SecurityProfileBehaviorArgs build() {
            return new SecurityProfileBehaviorArgs(criteria, metric, metricDimension, name, suppressAlerts);
        }
    }
}
