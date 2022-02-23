// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs Empty = new AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs();

    /**
     * The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    @InputImport(name="duration", required=true)
      private final Input<String> duration;

    public Input<String> getDuration() {
        return this.duration;
    }

    /**
     * Monitoring Query Language query that outputs a boolean stream.
     * 
     */
    @InputImport(name="query", required=true)
      private final Input<String> query;

    public Input<String> getQuery() {
        return this.query;
    }

    /**
     * The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    @InputImport(name="trigger")
      private final @Nullable Input<AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs> trigger;

    public Input<AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs> getTrigger() {
        return this.trigger == null ? Input.empty() : this.trigger;
    }

    public AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs(
        Input<String> duration,
        Input<String> query,
        @Nullable Input<AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs> trigger) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.trigger = trigger;
    }

    private AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs() {
        this.duration = Input.empty();
        this.query = Input.empty();
        this.trigger = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> duration;
        private Input<String> query;
        private @Nullable Input<AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.query = defaults.query;
    	      this.trigger = defaults.trigger;
        }

        public Builder setDuration(Input<String> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Input.of(Objects.requireNonNull(duration));
            return this;
        }

        public Builder setQuery(Input<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Input.of(Objects.requireNonNull(query));
            return this;
        }

        public Builder setTrigger(@Nullable Input<AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs> trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder setTrigger(@Nullable AlertPolicyConditionConditionMonitoringQueryLanguageTriggerGetArgs trigger) {
            this.trigger = Input.ofNullable(trigger);
            return this;
        }
        public AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs build() {
            return new AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs(duration, query, trigger);
        }
    }
}
