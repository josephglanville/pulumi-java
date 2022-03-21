// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Detail human agent assistant config.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs();

    /**
     * Configuration of different suggestion features. One feature can have only one config.
     * 
     */
    @Import(name="featureConfigs")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs>> featureConfigs;

    public Output<List<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs>> getFeatureConfigs() {
        return this.featureConfigs == null ? Output.empty() : this.featureConfigs;
    }

    /**
     * If `group_suggestion_responses` is false, and there are multiple `feature_configs` in `event based suggestion` or StreamingAnalyzeContent, we will try to deliver suggestions to customers as soon as we get new suggestion. Different type of suggestions based on the same context will be in separate Pub/Sub event or `StreamingAnalyzeContentResponse`. If `group_suggestion_responses` set to true. All the suggestions to the same participant based on the same context will be grouped into a single Pub/Sub event or StreamingAnalyzeContentResponse.
     * 
     */
    @Import(name="groupSuggestionResponses")
      private final @Nullable Output<Boolean> groupSuggestionResponses;

    public Output<Boolean> getGroupSuggestionResponses() {
        return this.groupSuggestionResponses == null ? Output.empty() : this.groupSuggestionResponses;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs(
        @Nullable Output<List<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs>> featureConfigs,
        @Nullable Output<Boolean> groupSuggestionResponses) {
        this.featureConfigs = featureConfigs;
        this.groupSuggestionResponses = groupSuggestionResponses;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs() {
        this.featureConfigs = Output.empty();
        this.groupSuggestionResponses = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs>> featureConfigs;
        private @Nullable Output<Boolean> groupSuggestionResponses;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureConfigs = defaults.featureConfigs;
    	      this.groupSuggestionResponses = defaults.groupSuggestionResponses;
        }

        public Builder featureConfigs(@Nullable Output<List<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs>> featureConfigs) {
            this.featureConfigs = featureConfigs;
            return this;
        }
        public Builder featureConfigs(@Nullable List<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs> featureConfigs) {
            this.featureConfigs = Output.ofNullable(featureConfigs);
            return this;
        }
        public Builder featureConfigs(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs... featureConfigs) {
            return featureConfigs(List.of(featureConfigs));
        }
        public Builder groupSuggestionResponses(@Nullable Output<Boolean> groupSuggestionResponses) {
            this.groupSuggestionResponses = groupSuggestionResponses;
            return this;
        }
        public Builder groupSuggestionResponses(@Nullable Boolean groupSuggestionResponses) {
            this.groupSuggestionResponses = Output.ofNullable(groupSuggestionResponses);
            return this;
        }        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs(featureConfigs, groupSuggestionResponses);
        }
    }
}
