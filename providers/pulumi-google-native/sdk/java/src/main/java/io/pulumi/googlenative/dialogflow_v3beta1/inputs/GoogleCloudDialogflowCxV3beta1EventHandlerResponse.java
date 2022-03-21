// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An event handler specifies an event that can be handled during a session. When the specified event happens, the following actions are taken in order: * If there is a `trigger_fulfillment` associated with the event, it will be called. * If there is a `target_page` associated with the event, the session will transition into the specified page. * If there is a `target_flow` associated with the event, the session will transition into the specified flow.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1EventHandlerResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1EventHandlerResponse Empty = new GoogleCloudDialogflowCxV3beta1EventHandlerResponse();

    /**
     * The name of the event to handle.
     * 
     */
    @Import(name="event", required=true)
      private final String event;

    public String getEvent() {
        return this.event;
    }

    /**
     * The unique identifier of this event handler.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="targetFlow", required=true)
      private final String targetFlow;

    public String getTargetFlow() {
        return this.targetFlow;
    }

    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @Import(name="targetPage", required=true)
      private final String targetPage;

    public String getTargetPage() {
        return this.targetPage;
    }

    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * 
     */
    @Import(name="triggerFulfillment", required=true)
      private final GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment;

    public GoogleCloudDialogflowCxV3beta1FulfillmentResponse getTriggerFulfillment() {
        return this.triggerFulfillment;
    }

    public GoogleCloudDialogflowCxV3beta1EventHandlerResponse(
        String event,
        String name,
        String targetFlow,
        String targetPage,
        GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.targetFlow = Objects.requireNonNull(targetFlow, "expected parameter 'targetFlow' to be non-null");
        this.targetPage = Objects.requireNonNull(targetPage, "expected parameter 'targetPage' to be non-null");
        this.triggerFulfillment = Objects.requireNonNull(triggerFulfillment, "expected parameter 'triggerFulfillment' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1EventHandlerResponse() {
        this.event = null;
        this.name = null;
        this.targetFlow = null;
        this.targetPage = null;
        this.triggerFulfillment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EventHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;
        private String name;
        private String targetFlow;
        private String targetPage;
        private GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EventHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder event(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder targetFlow(String targetFlow) {
            this.targetFlow = Objects.requireNonNull(targetFlow);
            return this;
        }
        public Builder targetPage(String targetPage) {
            this.targetPage = Objects.requireNonNull(targetPage);
            return this;
        }
        public Builder triggerFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment) {
            this.triggerFulfillment = Objects.requireNonNull(triggerFulfillment);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1EventHandlerResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EventHandlerResponse(event, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
