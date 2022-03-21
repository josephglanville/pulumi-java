// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings that determine how to filter recent conversation context when generating suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs();

    /**
     * If set to true, the last message from virtual agent (hand off message) and the message before it (trigger message of hand off) are dropped.
     * 
     */
    @Import(name="dropHandoffMessages")
      private final @Nullable Output<Boolean> dropHandoffMessages;

    public Output<Boolean> getDropHandoffMessages() {
        return this.dropHandoffMessages == null ? Output.empty() : this.dropHandoffMessages;
    }

    /**
     * If set to true, all messages from ivr stage are dropped.
     * 
     */
    @Import(name="dropIvrMessages")
      private final @Nullable Output<Boolean> dropIvrMessages;

    public Output<Boolean> getDropIvrMessages() {
        return this.dropIvrMessages == null ? Output.empty() : this.dropIvrMessages;
    }

    /**
     * If set to true, all messages from virtual agent are dropped.
     * 
     */
    @Import(name="dropVirtualAgentMessages")
      private final @Nullable Output<Boolean> dropVirtualAgentMessages;

    public Output<Boolean> getDropVirtualAgentMessages() {
        return this.dropVirtualAgentMessages == null ? Output.empty() : this.dropVirtualAgentMessages;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs(
        @Nullable Output<Boolean> dropHandoffMessages,
        @Nullable Output<Boolean> dropIvrMessages,
        @Nullable Output<Boolean> dropVirtualAgentMessages) {
        this.dropHandoffMessages = dropHandoffMessages;
        this.dropIvrMessages = dropIvrMessages;
        this.dropVirtualAgentMessages = dropVirtualAgentMessages;
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs() {
        this.dropHandoffMessages = Output.empty();
        this.dropIvrMessages = Output.empty();
        this.dropVirtualAgentMessages = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> dropHandoffMessages;
        private @Nullable Output<Boolean> dropIvrMessages;
        private @Nullable Output<Boolean> dropVirtualAgentMessages;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dropHandoffMessages = defaults.dropHandoffMessages;
    	      this.dropIvrMessages = defaults.dropIvrMessages;
    	      this.dropVirtualAgentMessages = defaults.dropVirtualAgentMessages;
        }

        public Builder dropHandoffMessages(@Nullable Output<Boolean> dropHandoffMessages) {
            this.dropHandoffMessages = dropHandoffMessages;
            return this;
        }
        public Builder dropHandoffMessages(@Nullable Boolean dropHandoffMessages) {
            this.dropHandoffMessages = Output.ofNullable(dropHandoffMessages);
            return this;
        }
        public Builder dropIvrMessages(@Nullable Output<Boolean> dropIvrMessages) {
            this.dropIvrMessages = dropIvrMessages;
            return this;
        }
        public Builder dropIvrMessages(@Nullable Boolean dropIvrMessages) {
            this.dropIvrMessages = Output.ofNullable(dropIvrMessages);
            return this;
        }
        public Builder dropVirtualAgentMessages(@Nullable Output<Boolean> dropVirtualAgentMessages) {
            this.dropVirtualAgentMessages = dropVirtualAgentMessages;
            return this;
        }
        public Builder dropVirtualAgentMessages(@Nullable Boolean dropVirtualAgentMessages) {
            this.dropVirtualAgentMessages = Output.ofNullable(dropVirtualAgentMessages);
            return this;
        }        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettingsArgs(dropHandoffMessages, dropIvrMessages, dropVirtualAgentMessages);
        }
    }
}
