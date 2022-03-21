// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings of suggestion trigger.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs();

    /**
     * Do not trigger if last utterance is small talk.
     * 
     */
    @Import(name="noSmallTalk")
      private final @Nullable Output<Boolean> noSmallTalk;

    public Output<Boolean> getNoSmallTalk() {
        return this.noSmallTalk == null ? Output.empty() : this.noSmallTalk;
    }

    /**
     * Only trigger suggestion if participant role of last utterance is END_USER.
     * 
     */
    @Import(name="onlyEndUser")
      private final @Nullable Output<Boolean> onlyEndUser;

    public Output<Boolean> getOnlyEndUser() {
        return this.onlyEndUser == null ? Output.empty() : this.onlyEndUser;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs(
        @Nullable Output<Boolean> noSmallTalk,
        @Nullable Output<Boolean> onlyEndUser) {
        this.noSmallTalk = noSmallTalk;
        this.onlyEndUser = onlyEndUser;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs() {
        this.noSmallTalk = Output.empty();
        this.onlyEndUser = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> noSmallTalk;
        private @Nullable Output<Boolean> onlyEndUser;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.noSmallTalk = defaults.noSmallTalk;
    	      this.onlyEndUser = defaults.onlyEndUser;
        }

        public Builder noSmallTalk(@Nullable Output<Boolean> noSmallTalk) {
            this.noSmallTalk = noSmallTalk;
            return this;
        }
        public Builder noSmallTalk(@Nullable Boolean noSmallTalk) {
            this.noSmallTalk = Output.ofNullable(noSmallTalk);
            return this;
        }
        public Builder onlyEndUser(@Nullable Output<Boolean> onlyEndUser) {
            this.onlyEndUser = onlyEndUser;
            return this;
        }
        public Builder onlyEndUser(@Nullable Boolean onlyEndUser) {
            this.onlyEndUser = Output.ofNullable(onlyEndUser);
            return this;
        }        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs(noSmallTalk, onlyEndUser);
        }
    }
}
