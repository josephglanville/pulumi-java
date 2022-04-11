// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageTextArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageTransitionRouteTriggerFulfillmentMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageTransitionRouteTriggerFulfillmentMessageArgs Empty = new CxPageTransitionRouteTriggerFulfillmentMessageArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<CxPageTransitionRouteTriggerFulfillmentMessageTextArgs> text;

    public Output<CxPageTransitionRouteTriggerFulfillmentMessageTextArgs> getText() {
        return this.text == null ? Codegen.empty() : this.text;
    }

    public CxPageTransitionRouteTriggerFulfillmentMessageArgs(@Nullable Output<CxPageTransitionRouteTriggerFulfillmentMessageTextArgs> text) {
        this.text = text;
    }

    private CxPageTransitionRouteTriggerFulfillmentMessageArgs() {
        this.text = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteTriggerFulfillmentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CxPageTransitionRouteTriggerFulfillmentMessageTextArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteTriggerFulfillmentMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable Output<CxPageTransitionRouteTriggerFulfillmentMessageTextArgs> text) {
            this.text = text;
            return this;
        }
        public Builder text(@Nullable CxPageTransitionRouteTriggerFulfillmentMessageTextArgs text) {
            this.text = Codegen.ofNullable(text);
            return this;
        }        public CxPageTransitionRouteTriggerFulfillmentMessageArgs build() {
            return new CxPageTransitionRouteTriggerFulfillmentMessageArgs(text);
        }
    }
}
