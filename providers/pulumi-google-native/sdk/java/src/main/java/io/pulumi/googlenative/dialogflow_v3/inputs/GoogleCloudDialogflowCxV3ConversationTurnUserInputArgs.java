// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3QueryInputArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The input from the human user.
 * 
 */
public final class GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs Empty = new GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs();

    /**
     * Whether sentiment analysis is enabled.
     * 
     */
    @Import(name="enableSentimentAnalysis")
      private final @Nullable Output<Boolean> enableSentimentAnalysis;

    public Output<Boolean> getEnableSentimentAnalysis() {
        return this.enableSentimentAnalysis == null ? Output.empty() : this.enableSentimentAnalysis;
    }

    /**
     * Parameters that need to be injected into the conversation during intent detection.
     * 
     */
    @Import(name="injectedParameters")
      private final @Nullable Output<Map<String,String>> injectedParameters;

    public Output<Map<String,String>> getInjectedParameters() {
        return this.injectedParameters == null ? Output.empty() : this.injectedParameters;
    }

    /**
     * Supports text input, event input, dtmf input in the test case.
     * 
     */
    @Import(name="input")
      private final @Nullable Output<GoogleCloudDialogflowCxV3QueryInputArgs> input;

    public Output<GoogleCloudDialogflowCxV3QueryInputArgs> getInput() {
        return this.input == null ? Output.empty() : this.input;
    }

    /**
     * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled.
     * 
     */
    @Import(name="isWebhookEnabled")
      private final @Nullable Output<Boolean> isWebhookEnabled;

    public Output<Boolean> getIsWebhookEnabled() {
        return this.isWebhookEnabled == null ? Output.empty() : this.isWebhookEnabled;
    }

    public GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs(
        @Nullable Output<Boolean> enableSentimentAnalysis,
        @Nullable Output<Map<String,String>> injectedParameters,
        @Nullable Output<GoogleCloudDialogflowCxV3QueryInputArgs> input,
        @Nullable Output<Boolean> isWebhookEnabled) {
        this.enableSentimentAnalysis = enableSentimentAnalysis;
        this.injectedParameters = injectedParameters;
        this.input = input;
        this.isWebhookEnabled = isWebhookEnabled;
    }

    private GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs() {
        this.enableSentimentAnalysis = Output.empty();
        this.injectedParameters = Output.empty();
        this.input = Output.empty();
        this.isWebhookEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableSentimentAnalysis;
        private @Nullable Output<Map<String,String>> injectedParameters;
        private @Nullable Output<GoogleCloudDialogflowCxV3QueryInputArgs> input;
        private @Nullable Output<Boolean> isWebhookEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
    	      this.injectedParameters = defaults.injectedParameters;
    	      this.input = defaults.input;
    	      this.isWebhookEnabled = defaults.isWebhookEnabled;
        }

        public Builder enableSentimentAnalysis(@Nullable Output<Boolean> enableSentimentAnalysis) {
            this.enableSentimentAnalysis = enableSentimentAnalysis;
            return this;
        }
        public Builder enableSentimentAnalysis(@Nullable Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = Output.ofNullable(enableSentimentAnalysis);
            return this;
        }
        public Builder injectedParameters(@Nullable Output<Map<String,String>> injectedParameters) {
            this.injectedParameters = injectedParameters;
            return this;
        }
        public Builder injectedParameters(@Nullable Map<String,String> injectedParameters) {
            this.injectedParameters = Output.ofNullable(injectedParameters);
            return this;
        }
        public Builder input(@Nullable Output<GoogleCloudDialogflowCxV3QueryInputArgs> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable GoogleCloudDialogflowCxV3QueryInputArgs input) {
            this.input = Output.ofNullable(input);
            return this;
        }
        public Builder isWebhookEnabled(@Nullable Output<Boolean> isWebhookEnabled) {
            this.isWebhookEnabled = isWebhookEnabled;
            return this;
        }
        public Builder isWebhookEnabled(@Nullable Boolean isWebhookEnabled) {
            this.isWebhookEnabled = Output.ofNullable(isWebhookEnabled);
            return this;
        }        public GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs build() {
            return new GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs(enableSentimentAnalysis, injectedParameters, input, isWebhookEnabled);
        }
    }
}
