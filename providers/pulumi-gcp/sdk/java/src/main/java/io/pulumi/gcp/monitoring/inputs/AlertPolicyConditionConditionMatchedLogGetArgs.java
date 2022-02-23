// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionMatchedLogGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionMatchedLogGetArgs Empty = new AlertPolicyConditionConditionMatchedLogGetArgs();

    /**
     * A logs-based filter.
     * 
     */
    @InputImport(name="filter", required=true)
      private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    /**
     * A map from a label key to an extractor expression, which is used to
     * extract the value for this label key. Each entry in this map is
     * a specification for how data should be extracted from log entries that
     * match filter. Each combination of extracted values is treated as
     * a separate rule for the purposes of triggering notifications.
     * Label keys and corresponding values can be used in notifications
     * generated by this condition.
     * 
     */
    @InputImport(name="labelExtractors")
      private final @Nullable Input<Map<String,String>> labelExtractors;

    public Input<Map<String,String>> getLabelExtractors() {
        return this.labelExtractors == null ? Input.empty() : this.labelExtractors;
    }

    public AlertPolicyConditionConditionMatchedLogGetArgs(
        Input<String> filter,
        @Nullable Input<Map<String,String>> labelExtractors) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.labelExtractors = labelExtractors;
    }

    private AlertPolicyConditionConditionMatchedLogGetArgs() {
        this.filter = Input.empty();
        this.labelExtractors = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionMatchedLogGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> filter;
        private @Nullable Input<Map<String,String>> labelExtractors;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionMatchedLogGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.labelExtractors = defaults.labelExtractors;
        }

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder setLabelExtractors(@Nullable Input<Map<String,String>> labelExtractors) {
            this.labelExtractors = labelExtractors;
            return this;
        }

        public Builder setLabelExtractors(@Nullable Map<String,String> labelExtractors) {
            this.labelExtractors = Input.ofNullable(labelExtractors);
            return this;
        }
        public AlertPolicyConditionConditionMatchedLogGetArgs build() {
            return new AlertPolicyConditionConditionMatchedLogGetArgs(filter, labelExtractors);
        }
    }
}
