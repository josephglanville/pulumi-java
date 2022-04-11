// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyMetricGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyMetricGetArgs Empty = new AutoscalarAutoscalingPolicyMetricGetArgs();

    /**
     * A filter string to be used as the filter string for
     * a Stackdriver Monitoring TimeSeries.list API call.
     * This filter is used to select a specific TimeSeries for
     * the purpose of autoscaling and to determine whether the metric
     * is exporting per-instance or per-group data.
     * You can only use the AND operator for joining selectors.
     * You can only use direct equality comparison operator (=) without
     * any functions for each selector.
     * You can specify the metric in both the filter string and in the
     * metric field. However, if specified in both places, the metric must
     * be identical.
     * The monitored resource type determines what kind of values are
     * expected for the metric. If it is a gce_instance, the autoscaler
     * expects the metric to include a separate TimeSeries for each
     * instance in a group. In such a case, you cannot filter on resource
     * labels.
     * If the resource type is any other value, the autoscaler expects
     * this metric to contain values that apply to the entire autoscaled
     * instance group and resource label filtering can be performed to
     * point autoscaler at the correct TimeSeries to scale upon.
     * This is called a per-group metric for the purpose of autoscaling.
     * If not specified, the type defaults to gce_instance.
     * You should provide a filter that is selective enough to pick just
     * one TimeSeries for the autoscaled group or for each of the instances
     * (if you are using gce_instance resource type). If multiple
     * TimeSeries are returned upon the query execution, the autoscaler
     * will sum their respective values to obtain its scaling value.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * If scaling is based on a per-group metric value that represents the
     * total amount of work to be done or resource usage, set this value to
     * an amount assigned for a single instance of the scaled group.
     * The autoscaler will keep the number of instances proportional to the
     * value of this metric, the metric itself should not change value due
     * to group resizing.
     * For example, a good metric to use with the target is
     * `pubsub.googleapis.com/subscription/num_undelivered_messages`
     * or a custom metric exporting the total number of requests coming to
     * your instances.
     * A bad example would be a metric exporting an average or median
     * latency, since this value can't include a chunk assignable to a
     * single instance, it could be better used with utilization_target
     * instead.
     * 
     */
    @Import(name="singleInstanceAssignment")
      private final @Nullable Output<Double> singleInstanceAssignment;

    public Output<Double> getSingleInstanceAssignment() {
        return this.singleInstanceAssignment == null ? Codegen.empty() : this.singleInstanceAssignment;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<Double> target;

    public Output<Double> getTarget() {
        return this.target == null ? Codegen.empty() : this.target;
    }

    /**
     * Defines how target utilization value is expressed for a
     * Stackdriver Monitoring metric.
     * Possible values are `GAUGE`, `DELTA_PER_SECOND`, and `DELTA_PER_MINUTE`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public AutoscalarAutoscalingPolicyMetricGetArgs(
        @Nullable Output<String> filter,
        Output<String> name,
        @Nullable Output<Double> singleInstanceAssignment,
        @Nullable Output<Double> target,
        @Nullable Output<String> type) {
        this.filter = filter;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.singleInstanceAssignment = singleInstanceAssignment;
        this.target = target;
        this.type = type;
    }

    private AutoscalarAutoscalingPolicyMetricGetArgs() {
        this.filter = Codegen.empty();
        this.name = Codegen.empty();
        this.singleInstanceAssignment = Codegen.empty();
        this.target = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyMetricGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filter;
        private Output<String> name;
        private @Nullable Output<Double> singleInstanceAssignment;
        private @Nullable Output<Double> target;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyMetricGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.singleInstanceAssignment = defaults.singleInstanceAssignment;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
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
        public Builder singleInstanceAssignment(@Nullable Output<Double> singleInstanceAssignment) {
            this.singleInstanceAssignment = singleInstanceAssignment;
            return this;
        }
        public Builder singleInstanceAssignment(@Nullable Double singleInstanceAssignment) {
            this.singleInstanceAssignment = Codegen.ofNullable(singleInstanceAssignment);
            return this;
        }
        public Builder target(@Nullable Output<Double> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable Double target) {
            this.target = Codegen.ofNullable(target);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public AutoscalarAutoscalingPolicyMetricGetArgs build() {
            return new AutoscalarAutoscalingPolicyMetricGetArgs(filter, name, singleInstanceAssignment, target, type);
        }
    }
}
