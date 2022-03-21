// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for analyses to run on each conversation message.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs();

    /**
     * Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="enableEntityExtraction")
      private final @Nullable Output<Boolean> enableEntityExtraction;

    public Output<Boolean> getEnableEntityExtraction() {
        return this.enableEntityExtraction == null ? Output.empty() : this.enableEntityExtraction;
    }

    /**
     * Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user's attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
     * 
     */
    @Import(name="enableSentimentAnalysis")
      private final @Nullable Output<Boolean> enableSentimentAnalysis;

    public Output<Boolean> getEnableSentimentAnalysis() {
        return this.enableSentimentAnalysis == null ? Output.empty() : this.enableSentimentAnalysis;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs(
        @Nullable Output<Boolean> enableEntityExtraction,
        @Nullable Output<Boolean> enableSentimentAnalysis) {
        this.enableEntityExtraction = enableEntityExtraction;
        this.enableSentimentAnalysis = enableSentimentAnalysis;
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs() {
        this.enableEntityExtraction = Output.empty();
        this.enableSentimentAnalysis = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableEntityExtraction;
        private @Nullable Output<Boolean> enableSentimentAnalysis;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableEntityExtraction = defaults.enableEntityExtraction;
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
        }

        public Builder enableEntityExtraction(@Nullable Output<Boolean> enableEntityExtraction) {
            this.enableEntityExtraction = enableEntityExtraction;
            return this;
        }
        public Builder enableEntityExtraction(@Nullable Boolean enableEntityExtraction) {
            this.enableEntityExtraction = Output.ofNullable(enableEntityExtraction);
            return this;
        }
        public Builder enableSentimentAnalysis(@Nullable Output<Boolean> enableSentimentAnalysis) {
            this.enableSentimentAnalysis = enableSentimentAnalysis;
            return this;
        }
        public Builder enableSentimentAnalysis(@Nullable Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = Output.ofNullable(enableSentimentAnalysis);
            return this;
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs(enableEntityExtraction, enableSentimentAnalysis);
        }
    }
}
