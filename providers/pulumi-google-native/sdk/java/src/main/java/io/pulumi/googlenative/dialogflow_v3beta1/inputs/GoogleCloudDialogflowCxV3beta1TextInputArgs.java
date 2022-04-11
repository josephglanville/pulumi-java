// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the natural language text to be processed.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1TextInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1TextInputArgs Empty = new GoogleCloudDialogflowCxV3beta1TextInputArgs();

    /**
     * The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters.
     * 
     */
    @Import(name="text", required=true)
      private final Output<String> text;

    public Output<String> getText() {
        return this.text;
    }

    public GoogleCloudDialogflowCxV3beta1TextInputArgs(Output<String> text) {
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1TextInputArgs() {
        this.text = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TextInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TextInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(Output<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder text(String text) {
            this.text = Output.of(Objects.requireNonNull(text));
            return this;
        }        public GoogleCloudDialogflowCxV3beta1TextInputArgs build() {
            return new GoogleCloudDialogflowCxV3beta1TextInputArgs(text);
        }
    }
}
