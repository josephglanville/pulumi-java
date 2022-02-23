// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.MetricTriggerResponse;
import io.pulumi.azurenative.insights.inputs.ScaleActionResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * A rule that provide the triggers and parameters for the scaling action.
 * 
 */
public final class ScaleRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScaleRuleResponse Empty = new ScaleRuleResponse();

    /**
     * the trigger that results in a scaling action.
     * 
     */
    @InputImport(name="metricTrigger", required=true)
      private final MetricTriggerResponse metricTrigger;

    public MetricTriggerResponse getMetricTrigger() {
        return this.metricTrigger;
    }

    /**
     * the parameters for the scaling action.
     * 
     */
    @InputImport(name="scaleAction", required=true)
      private final ScaleActionResponse scaleAction;

    public ScaleActionResponse getScaleAction() {
        return this.scaleAction;
    }

    public ScaleRuleResponse(
        MetricTriggerResponse metricTrigger,
        ScaleActionResponse scaleAction) {
        this.metricTrigger = Objects.requireNonNull(metricTrigger, "expected parameter 'metricTrigger' to be non-null");
        this.scaleAction = Objects.requireNonNull(scaleAction, "expected parameter 'scaleAction' to be non-null");
    }

    private ScaleRuleResponse() {
        this.metricTrigger = null;
        this.scaleAction = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricTriggerResponse metricTrigger;
        private ScaleActionResponse scaleAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTrigger = defaults.metricTrigger;
    	      this.scaleAction = defaults.scaleAction;
        }

        public Builder setMetricTrigger(MetricTriggerResponse metricTrigger) {
            this.metricTrigger = Objects.requireNonNull(metricTrigger);
            return this;
        }

        public Builder setScaleAction(ScaleActionResponse scaleAction) {
            this.scaleAction = Objects.requireNonNull(scaleAction);
            return this;
        }
        public ScaleRuleResponse build() {
            return new ScaleRuleResponse(metricTrigger, scaleAction);
        }
    }
}
