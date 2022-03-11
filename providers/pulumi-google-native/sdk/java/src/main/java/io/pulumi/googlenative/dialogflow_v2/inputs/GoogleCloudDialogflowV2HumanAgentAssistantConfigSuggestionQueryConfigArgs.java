// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Config for suggestion query.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs();

    /**
     * Confidence threshold of query result. Agent Assist gives each suggestion a score in the range [0.0, 1.0], based on the relevance between the suggestion and the current conversation context. A score of 0.0 has no relevance, while a score of 1.0 has high relevance. Only suggestions with a score greater than or equal to the value of this field are included in the results. For a baseline model (the default), the recommended value is in the range [0.05, 0.1]. For a custom model, there is no recommended value. Tune this value by starting from a very low value and slowly increasing until you have desired results. If this field is not set, it defaults to 0.0, which means that all suggestions are returned. Supported features: ARTICLE_SUGGESTION, FAQ, SMART_REPLY, SMART_COMPOSE.
     * 
     */
    @InputImport(name="confidenceThreshold")
      private final @Nullable Output<Double> confidenceThreshold;

    public Output<Double> getConfidenceThreshold() {
        return this.confidenceThreshold == null ? Output.empty() : this.confidenceThreshold;
    }

    /**
     * Determines how recent conversation context is filtered when generating suggestions. If unspecified, no messages will be dropped.
     * 
     */
    @InputImport(name="contextFilterSettings")
      private final @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs> contextFilterSettings;

    public Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs> getContextFilterSettings() {
        return this.contextFilterSettings == null ? Output.empty() : this.contextFilterSettings;
    }

    /**
     * Query from Dialogflow agent. It is used by DIALOGFLOW_ASSIST.
     * 
     */
    @InputImport(name="dialogflowQuerySource")
      private final @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs> dialogflowQuerySource;

    public Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs> getDialogflowQuerySource() {
        return this.dialogflowQuerySource == null ? Output.empty() : this.dialogflowQuerySource;
    }

    /**
     * Query from knowledge base document. It is used by: SMART_REPLY, SMART_COMPOSE.
     * 
     */
    @InputImport(name="documentQuerySource")
      private final @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs> documentQuerySource;

    public Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs> getDocumentQuerySource() {
        return this.documentQuerySource == null ? Output.empty() : this.documentQuerySource;
    }

    /**
     * Query from knowledgebase. It is used by: ARTICLE_SUGGESTION, FAQ.
     * 
     */
    @InputImport(name="knowledgeBaseQuerySource")
      private final @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs> knowledgeBaseQuerySource;

    public Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs> getKnowledgeBaseQuerySource() {
        return this.knowledgeBaseQuerySource == null ? Output.empty() : this.knowledgeBaseQuerySource;
    }

    /**
     * Maximum number of results to return. Currently, if unset, defaults to 10. And the max number is 20.
     * 
     */
    @InputImport(name="maxResults")
      private final @Nullable Output<Integer> maxResults;

    public Output<Integer> getMaxResults() {
        return this.maxResults == null ? Output.empty() : this.maxResults;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs(
        @Nullable Output<Double> confidenceThreshold,
        @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs> contextFilterSettings,
        @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs> dialogflowQuerySource,
        @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs> documentQuerySource,
        @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs> knowledgeBaseQuerySource,
        @Nullable Output<Integer> maxResults) {
        this.confidenceThreshold = confidenceThreshold;
        this.contextFilterSettings = contextFilterSettings;
        this.dialogflowQuerySource = dialogflowQuerySource;
        this.documentQuerySource = documentQuerySource;
        this.knowledgeBaseQuerySource = knowledgeBaseQuerySource;
        this.maxResults = maxResults;
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs() {
        this.confidenceThreshold = Output.empty();
        this.contextFilterSettings = Output.empty();
        this.dialogflowQuerySource = Output.empty();
        this.documentQuerySource = Output.empty();
        this.knowledgeBaseQuerySource = Output.empty();
        this.maxResults = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> confidenceThreshold;
        private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs> contextFilterSettings;
        private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs> dialogflowQuerySource;
        private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs> documentQuerySource;
        private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs> knowledgeBaseQuerySource;
        private @Nullable Output<Integer> maxResults;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceThreshold = defaults.confidenceThreshold;
    	      this.contextFilterSettings = defaults.contextFilterSettings;
    	      this.dialogflowQuerySource = defaults.dialogflowQuerySource;
    	      this.documentQuerySource = defaults.documentQuerySource;
    	      this.knowledgeBaseQuerySource = defaults.knowledgeBaseQuerySource;
    	      this.maxResults = defaults.maxResults;
        }

        public Builder confidenceThreshold(@Nullable Output<Double> confidenceThreshold) {
            this.confidenceThreshold = confidenceThreshold;
            return this;
        }

        public Builder confidenceThreshold(@Nullable Double confidenceThreshold) {
            this.confidenceThreshold = Output.ofNullable(confidenceThreshold);
            return this;
        }

        public Builder contextFilterSettings(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs> contextFilterSettings) {
            this.contextFilterSettings = contextFilterSettings;
            return this;
        }

        public Builder contextFilterSettings(@Nullable GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs contextFilterSettings) {
            this.contextFilterSettings = Output.ofNullable(contextFilterSettings);
            return this;
        }

        public Builder dialogflowQuerySource(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs> dialogflowQuerySource) {
            this.dialogflowQuerySource = dialogflowQuerySource;
            return this;
        }

        public Builder dialogflowQuerySource(@Nullable GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs dialogflowQuerySource) {
            this.dialogflowQuerySource = Output.ofNullable(dialogflowQuerySource);
            return this;
        }

        public Builder documentQuerySource(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs> documentQuerySource) {
            this.documentQuerySource = documentQuerySource;
            return this;
        }

        public Builder documentQuerySource(@Nullable GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs documentQuerySource) {
            this.documentQuerySource = Output.ofNullable(documentQuerySource);
            return this;
        }

        public Builder knowledgeBaseQuerySource(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs> knowledgeBaseQuerySource) {
            this.knowledgeBaseQuerySource = knowledgeBaseQuerySource;
            return this;
        }

        public Builder knowledgeBaseQuerySource(@Nullable GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs knowledgeBaseQuerySource) {
            this.knowledgeBaseQuerySource = Output.ofNullable(knowledgeBaseQuerySource);
            return this;
        }

        public Builder maxResults(@Nullable Output<Integer> maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        public Builder maxResults(@Nullable Integer maxResults) {
            this.maxResults = Output.ofNullable(maxResults);
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigArgs(confidenceThreshold, contextFilterSettings, dialogflowQuerySource, documentQuerySource, knowledgeBaseQuerySource, maxResults);
        }
    }
}
