// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Dialogflow source setting. Supported feature: DIALOGFLOW_ASSIST.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs();

    /**
     * The name of a Dialogflow virtual agent used for end user side intent detection and suggestion. Format: `projects//locations//agent`. When multiple agents are allowed in the same Dialogflow project.
     * 
     */
    @Import(name="agent", required=true)
      private final Output<String> agent;

    public Output<String> getAgent() {
        return this.agent;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs(Output<String> agent) {
        this.agent = Objects.requireNonNull(agent, "expected parameter 'agent' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs() {
        this.agent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> agent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agent = defaults.agent;
        }

        public Builder agent(Output<String> agent) {
            this.agent = Objects.requireNonNull(agent);
            return this;
        }
        public Builder agent(String agent) {
            this.agent = Output.of(Objects.requireNonNull(agent));
            return this;
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs(agent);
        }
    }
}
