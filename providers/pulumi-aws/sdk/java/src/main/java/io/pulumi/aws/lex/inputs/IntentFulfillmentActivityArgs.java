// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.IntentFulfillmentActivityCodeHookArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentFulfillmentActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentFulfillmentActivityArgs Empty = new IntentFulfillmentActivityArgs();

    /**
     * A description of the Lambda function that is run to fulfill the intent.
     * Required if type is CodeHook. Attributes are documented under code_hook.
     * 
     */
    @Import(name="codeHook")
      private final @Nullable Output<IntentFulfillmentActivityCodeHookArgs> codeHook;

    public Output<IntentFulfillmentActivityCodeHookArgs> getCodeHook() {
        return this.codeHook == null ? Output.empty() : this.codeHook;
    }

    /**
     * How the intent should be fulfilled, either by running a Lambda function or by
     * returning the slot data to the client application.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public IntentFulfillmentActivityArgs(
        @Nullable Output<IntentFulfillmentActivityCodeHookArgs> codeHook,
        Output<String> type) {
        this.codeHook = codeHook;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IntentFulfillmentActivityArgs() {
        this.codeHook = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFulfillmentActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IntentFulfillmentActivityCodeHookArgs> codeHook;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFulfillmentActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeHook = defaults.codeHook;
    	      this.type = defaults.type;
        }

        public Builder codeHook(@Nullable Output<IntentFulfillmentActivityCodeHookArgs> codeHook) {
            this.codeHook = codeHook;
            return this;
        }
        public Builder codeHook(@Nullable IntentFulfillmentActivityCodeHookArgs codeHook) {
            this.codeHook = Output.ofNullable(codeHook);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public IntentFulfillmentActivityArgs build() {
            return new IntentFulfillmentActivityArgs(codeHook, type);
        }
    }
}
