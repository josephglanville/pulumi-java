// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.diagflow.inputs.CxPageEventHandlerTriggerFulfillmentArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageEventHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageEventHandlerArgs Empty = new CxPageEventHandlerArgs();

    /**
     * The name of the event to handle.
     * 
     */
    @Import(name="event")
      private final @Nullable Output<String> event;

    public Output<String> getEvent() {
        return this.event == null ? Output.empty() : this.event;
    }

    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The target flow to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @Import(name="targetFlow")
      private final @Nullable Output<String> targetFlow;

    public Output<String> getTargetFlow() {
        return this.targetFlow == null ? Output.empty() : this.targetFlow;
    }

    /**
     * The target page to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
     * 
     */
    @Import(name="targetPage")
      private final @Nullable Output<String> targetPage;

    public Output<String> getTargetPage() {
        return this.targetPage == null ? Output.empty() : this.targetPage;
    }

    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    @Import(name="triggerFulfillment")
      private final @Nullable Output<CxPageEventHandlerTriggerFulfillmentArgs> triggerFulfillment;

    public Output<CxPageEventHandlerTriggerFulfillmentArgs> getTriggerFulfillment() {
        return this.triggerFulfillment == null ? Output.empty() : this.triggerFulfillment;
    }

    public CxPageEventHandlerArgs(
        @Nullable Output<String> event,
        @Nullable Output<String> name,
        @Nullable Output<String> targetFlow,
        @Nullable Output<String> targetPage,
        @Nullable Output<CxPageEventHandlerTriggerFulfillmentArgs> triggerFulfillment) {
        this.event = event;
        this.name = name;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    private CxPageEventHandlerArgs() {
        this.event = Output.empty();
        this.name = Output.empty();
        this.targetFlow = Output.empty();
        this.targetPage = Output.empty();
        this.triggerFulfillment = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEventHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> event;
        private @Nullable Output<String> name;
        private @Nullable Output<String> targetFlow;
        private @Nullable Output<String> targetPage;
        private @Nullable Output<CxPageEventHandlerTriggerFulfillmentArgs> triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageEventHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder event(@Nullable Output<String> event) {
            this.event = event;
            return this;
        }
        public Builder event(@Nullable String event) {
            this.event = Output.ofNullable(event);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder targetFlow(@Nullable Output<String> targetFlow) {
            this.targetFlow = targetFlow;
            return this;
        }
        public Builder targetFlow(@Nullable String targetFlow) {
            this.targetFlow = Output.ofNullable(targetFlow);
            return this;
        }
        public Builder targetPage(@Nullable Output<String> targetPage) {
            this.targetPage = targetPage;
            return this;
        }
        public Builder targetPage(@Nullable String targetPage) {
            this.targetPage = Output.ofNullable(targetPage);
            return this;
        }
        public Builder triggerFulfillment(@Nullable Output<CxPageEventHandlerTriggerFulfillmentArgs> triggerFulfillment) {
            this.triggerFulfillment = triggerFulfillment;
            return this;
        }
        public Builder triggerFulfillment(@Nullable CxPageEventHandlerTriggerFulfillmentArgs triggerFulfillment) {
            this.triggerFulfillment = Output.ofNullable(triggerFulfillment);
            return this;
        }        public CxPageEventHandlerArgs build() {
            return new CxPageEventHandlerArgs(event, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
