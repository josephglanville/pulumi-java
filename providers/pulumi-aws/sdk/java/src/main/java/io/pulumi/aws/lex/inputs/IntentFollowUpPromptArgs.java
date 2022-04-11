// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.IntentFollowUpPromptPromptArgs;
import io.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class IntentFollowUpPromptArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentFollowUpPromptArgs Empty = new IntentFollowUpPromptArgs();

    /**
     * Prompts for information from the user. Attributes are documented under prompt.
     * 
     */
    @Import(name="prompt", required=true)
      private final Output<IntentFollowUpPromptPromptArgs> prompt;

    public Output<IntentFollowUpPromptPromptArgs> getPrompt() {
        return this.prompt;
    }

    /**
     * If the user answers "no" to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
     */
    @Import(name="rejectionStatement", required=true)
      private final Output<IntentFollowUpPromptRejectionStatementArgs> rejectionStatement;

    public Output<IntentFollowUpPromptRejectionStatementArgs> getRejectionStatement() {
        return this.rejectionStatement;
    }

    public IntentFollowUpPromptArgs(
        Output<IntentFollowUpPromptPromptArgs> prompt,
        Output<IntentFollowUpPromptRejectionStatementArgs> rejectionStatement) {
        this.prompt = Objects.requireNonNull(prompt, "expected parameter 'prompt' to be non-null");
        this.rejectionStatement = Objects.requireNonNull(rejectionStatement, "expected parameter 'rejectionStatement' to be non-null");
    }

    private IntentFollowUpPromptArgs() {
        this.prompt = Codegen.empty();
        this.rejectionStatement = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFollowUpPromptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<IntentFollowUpPromptPromptArgs> prompt;
        private Output<IntentFollowUpPromptRejectionStatementArgs> rejectionStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFollowUpPromptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prompt = defaults.prompt;
    	      this.rejectionStatement = defaults.rejectionStatement;
        }

        public Builder prompt(Output<IntentFollowUpPromptPromptArgs> prompt) {
            this.prompt = Objects.requireNonNull(prompt);
            return this;
        }
        public Builder prompt(IntentFollowUpPromptPromptArgs prompt) {
            this.prompt = Output.of(Objects.requireNonNull(prompt));
            return this;
        }
        public Builder rejectionStatement(Output<IntentFollowUpPromptRejectionStatementArgs> rejectionStatement) {
            this.rejectionStatement = Objects.requireNonNull(rejectionStatement);
            return this;
        }
        public Builder rejectionStatement(IntentFollowUpPromptRejectionStatementArgs rejectionStatement) {
            this.rejectionStatement = Output.of(Objects.requireNonNull(rejectionStatement));
            return this;
        }        public IntentFollowUpPromptArgs build() {
            return new IntentFollowUpPromptArgs(prompt, rejectionStatement);
        }
    }
}
