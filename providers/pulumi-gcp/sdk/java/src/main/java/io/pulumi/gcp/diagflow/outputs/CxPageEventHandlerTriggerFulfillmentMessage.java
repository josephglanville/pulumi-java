// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.diagflow.outputs.CxPageEventHandlerTriggerFulfillmentMessageText;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageEventHandlerTriggerFulfillmentMessage {
    /**
     * A collection of text responses.
     * 
     */
    private final @Nullable CxPageEventHandlerTriggerFulfillmentMessageText text;

    @CustomType.Constructor
    private CxPageEventHandlerTriggerFulfillmentMessage(@CustomType.Parameter("text") @Nullable CxPageEventHandlerTriggerFulfillmentMessageText text) {
        this.text = text;
    }

    /**
     * A collection of text responses.
     * 
    */
    public Optional<CxPageEventHandlerTriggerFulfillmentMessageText> getText() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEventHandlerTriggerFulfillmentMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CxPageEventHandlerTriggerFulfillmentMessageText text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageEventHandlerTriggerFulfillmentMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable CxPageEventHandlerTriggerFulfillmentMessageText text) {
            this.text = text;
            return this;
        }        public CxPageEventHandlerTriggerFulfillmentMessage build() {
            return new CxPageEventHandlerTriggerFulfillmentMessage(text);
        }
    }
}
