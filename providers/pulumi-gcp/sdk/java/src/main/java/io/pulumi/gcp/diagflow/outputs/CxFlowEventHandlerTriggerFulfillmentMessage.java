// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.diagflow.outputs.CxFlowEventHandlerTriggerFulfillmentMessageText;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxFlowEventHandlerTriggerFulfillmentMessage {
    /**
     * A collection of text responses.
     * 
     */
    private final @Nullable CxFlowEventHandlerTriggerFulfillmentMessageText text;

    @CustomType.Constructor
    private CxFlowEventHandlerTriggerFulfillmentMessage(@CustomType.Parameter("text") @Nullable CxFlowEventHandlerTriggerFulfillmentMessageText text) {
        this.text = text;
    }

    /**
     * A collection of text responses.
     * 
    */
    public Optional<CxFlowEventHandlerTriggerFulfillmentMessageText> getText() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowEventHandlerTriggerFulfillmentMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CxFlowEventHandlerTriggerFulfillmentMessageText text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowEventHandlerTriggerFulfillmentMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable CxFlowEventHandlerTriggerFulfillmentMessageText text) {
            this.text = text;
            return this;
        }        public CxFlowEventHandlerTriggerFulfillmentMessage build() {
            return new CxFlowEventHandlerTriggerFulfillmentMessage(text);
        }
    }
}
