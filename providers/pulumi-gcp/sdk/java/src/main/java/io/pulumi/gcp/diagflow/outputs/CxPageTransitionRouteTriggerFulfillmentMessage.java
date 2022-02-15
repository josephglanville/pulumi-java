// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.diagflow.outputs.CxPageTransitionRouteTriggerFulfillmentMessageText;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxPageTransitionRouteTriggerFulfillmentMessage {
    private final @Nullable CxPageTransitionRouteTriggerFulfillmentMessageText text;

    @OutputCustomType.Constructor({"text"})
    private CxPageTransitionRouteTriggerFulfillmentMessage(@Nullable CxPageTransitionRouteTriggerFulfillmentMessageText text) {
        this.text = text;
    }

    public Optional<CxPageTransitionRouteTriggerFulfillmentMessageText> getText() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteTriggerFulfillmentMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CxPageTransitionRouteTriggerFulfillmentMessageText text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteTriggerFulfillmentMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable CxPageTransitionRouteTriggerFulfillmentMessageText text) {
            this.text = text;
            return this;
        }

        public CxPageTransitionRouteTriggerFulfillmentMessage build() {
            return new CxPageTransitionRouteTriggerFulfillmentMessage(text);
        }
    }
}