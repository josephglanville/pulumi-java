// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Knowledge base source settings. Supported features: ARTICLE_SUGGESTION, FAQ.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs();

    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, at most 5 knowledge bases are supported.
     * 
     */
    @Import(name="knowledgeBases", required=true)
      private final Output<List<String>> knowledgeBases;

    public Output<List<String>> getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs(Output<List<String>> knowledgeBases) {
        this.knowledgeBases = Objects.requireNonNull(knowledgeBases, "expected parameter 'knowledgeBases' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs() {
        this.knowledgeBases = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> knowledgeBases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knowledgeBases = defaults.knowledgeBases;
        }

        public Builder knowledgeBases(Output<List<String>> knowledgeBases) {
            this.knowledgeBases = Objects.requireNonNull(knowledgeBases);
            return this;
        }
        public Builder knowledgeBases(List<String> knowledgeBases) {
            this.knowledgeBases = Output.of(Objects.requireNonNull(knowledgeBases));
            return this;
        }
        public Builder knowledgeBases(String... knowledgeBases) {
            return knowledgeBases(List.of(knowledgeBases));
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs(knowledgeBases);
        }
    }
}
