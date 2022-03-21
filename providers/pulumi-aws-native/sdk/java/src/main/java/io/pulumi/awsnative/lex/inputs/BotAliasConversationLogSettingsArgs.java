// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasAudioLogSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotAliasTextLogSettingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasConversationLogSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasConversationLogSettingsArgs Empty = new BotAliasConversationLogSettingsArgs();

    @Import(name="audioLogSettings")
      private final @Nullable Output<List<BotAliasAudioLogSettingArgs>> audioLogSettings;

    public Output<List<BotAliasAudioLogSettingArgs>> getAudioLogSettings() {
        return this.audioLogSettings == null ? Output.empty() : this.audioLogSettings;
    }

    @Import(name="textLogSettings")
      private final @Nullable Output<List<BotAliasTextLogSettingArgs>> textLogSettings;

    public Output<List<BotAliasTextLogSettingArgs>> getTextLogSettings() {
        return this.textLogSettings == null ? Output.empty() : this.textLogSettings;
    }

    public BotAliasConversationLogSettingsArgs(
        @Nullable Output<List<BotAliasAudioLogSettingArgs>> audioLogSettings,
        @Nullable Output<List<BotAliasTextLogSettingArgs>> textLogSettings) {
        this.audioLogSettings = audioLogSettings;
        this.textLogSettings = textLogSettings;
    }

    private BotAliasConversationLogSettingsArgs() {
        this.audioLogSettings = Output.empty();
        this.textLogSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasConversationLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BotAliasAudioLogSettingArgs>> audioLogSettings;
        private @Nullable Output<List<BotAliasTextLogSettingArgs>> textLogSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasConversationLogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioLogSettings = defaults.audioLogSettings;
    	      this.textLogSettings = defaults.textLogSettings;
        }

        public Builder audioLogSettings(@Nullable Output<List<BotAliasAudioLogSettingArgs>> audioLogSettings) {
            this.audioLogSettings = audioLogSettings;
            return this;
        }
        public Builder audioLogSettings(@Nullable List<BotAliasAudioLogSettingArgs> audioLogSettings) {
            this.audioLogSettings = Output.ofNullable(audioLogSettings);
            return this;
        }
        public Builder audioLogSettings(BotAliasAudioLogSettingArgs... audioLogSettings) {
            return audioLogSettings(List.of(audioLogSettings));
        }
        public Builder textLogSettings(@Nullable Output<List<BotAliasTextLogSettingArgs>> textLogSettings) {
            this.textLogSettings = textLogSettings;
            return this;
        }
        public Builder textLogSettings(@Nullable List<BotAliasTextLogSettingArgs> textLogSettings) {
            this.textLogSettings = Output.ofNullable(textLogSettings);
            return this;
        }
        public Builder textLogSettings(BotAliasTextLogSettingArgs... textLogSettings) {
            return textLogSettings(List.of(textLogSettings));
        }        public BotAliasConversationLogSettingsArgs build() {
            return new BotAliasConversationLogSettingsArgs(audioLogSettings, textLogSettings);
        }
    }
}
