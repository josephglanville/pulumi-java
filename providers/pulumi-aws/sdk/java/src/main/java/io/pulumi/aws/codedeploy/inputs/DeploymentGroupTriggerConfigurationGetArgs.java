// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeploymentGroupTriggerConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupTriggerConfigurationGetArgs Empty = new DeploymentGroupTriggerConfigurationGetArgs();

    /**
     * The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
     * 
     */
    @Import(name="triggerEvents", required=true)
      private final Output<List<String>> triggerEvents;

    public Output<List<String>> getTriggerEvents() {
        return this.triggerEvents;
    }

    /**
     * The name of the notification trigger.
     * 
     */
    @Import(name="triggerName", required=true)
      private final Output<String> triggerName;

    public Output<String> getTriggerName() {
        return this.triggerName;
    }

    /**
     * The ARN of the SNS topic through which notifications are sent.
     * 
     */
    @Import(name="triggerTargetArn", required=true)
      private final Output<String> triggerTargetArn;

    public Output<String> getTriggerTargetArn() {
        return this.triggerTargetArn;
    }

    public DeploymentGroupTriggerConfigurationGetArgs(
        Output<List<String>> triggerEvents,
        Output<String> triggerName,
        Output<String> triggerTargetArn) {
        this.triggerEvents = Objects.requireNonNull(triggerEvents, "expected parameter 'triggerEvents' to be non-null");
        this.triggerName = Objects.requireNonNull(triggerName, "expected parameter 'triggerName' to be non-null");
        this.triggerTargetArn = Objects.requireNonNull(triggerTargetArn, "expected parameter 'triggerTargetArn' to be non-null");
    }

    private DeploymentGroupTriggerConfigurationGetArgs() {
        this.triggerEvents = Output.empty();
        this.triggerName = Output.empty();
        this.triggerTargetArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupTriggerConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> triggerEvents;
        private Output<String> triggerName;
        private Output<String> triggerTargetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupTriggerConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerEvents = defaults.triggerEvents;
    	      this.triggerName = defaults.triggerName;
    	      this.triggerTargetArn = defaults.triggerTargetArn;
        }

        public Builder triggerEvents(Output<List<String>> triggerEvents) {
            this.triggerEvents = Objects.requireNonNull(triggerEvents);
            return this;
        }
        public Builder triggerEvents(List<String> triggerEvents) {
            this.triggerEvents = Output.of(Objects.requireNonNull(triggerEvents));
            return this;
        }
        public Builder triggerEvents(String... triggerEvents) {
            return triggerEvents(List.of(triggerEvents));
        }
        public Builder triggerName(Output<String> triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }
        public Builder triggerName(String triggerName) {
            this.triggerName = Output.of(Objects.requireNonNull(triggerName));
            return this;
        }
        public Builder triggerTargetArn(Output<String> triggerTargetArn) {
            this.triggerTargetArn = Objects.requireNonNull(triggerTargetArn);
            return this;
        }
        public Builder triggerTargetArn(String triggerTargetArn) {
            this.triggerTargetArn = Output.of(Objects.requireNonNull(triggerTargetArn));
            return this;
        }        public DeploymentGroupTriggerConfigurationGetArgs build() {
            return new DeploymentGroupTriggerConfigurationGetArgs(triggerEvents, triggerName, triggerTargetArn);
        }
    }
}