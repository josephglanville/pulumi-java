// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs Empty = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs();

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Output<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs> text;

    public Output<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs> getText() {
        return this.text == null ? Output.empty() : this.text;
    }

    public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs(@Nullable Output<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs> text) {
        this.text = text;
    }

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs() {
        this.text = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable Output<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextGetArgs text) {
            this.text = Output.ofNullable(text);
            return this;
        }
        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs build() {
            return new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageGetArgs(text);
        }
    }
}
