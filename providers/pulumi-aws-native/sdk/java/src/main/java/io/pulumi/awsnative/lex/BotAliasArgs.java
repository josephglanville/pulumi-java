// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.lex.inputs.BotAliasConversationLogSettingsArgs;
import io.pulumi.awsnative.lex.inputs.BotAliasLocaleSettingsItemArgs;
import io.pulumi.awsnative.lex.inputs.BotAliasTagArgs;
import io.pulumi.awsnative.lex.inputs.SentimentAnalysisSettingsPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasArgs Empty = new BotAliasArgs();

    @InputImport(name="botAliasLocaleSettings")
      private final @Nullable Input<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings;

    public Input<List<BotAliasLocaleSettingsItemArgs>> getBotAliasLocaleSettings() {
        return this.botAliasLocaleSettings == null ? Input.empty() : this.botAliasLocaleSettings;
    }

    @InputImport(name="botAliasName")
      private final @Nullable Input<String> botAliasName;

    public Input<String> getBotAliasName() {
        return this.botAliasName == null ? Input.empty() : this.botAliasName;
    }

    /**
     * A list of tags to add to the bot alias.
     * 
     */
    @InputImport(name="botAliasTags")
      private final @Nullable Input<List<BotAliasTagArgs>> botAliasTags;

    public Input<List<BotAliasTagArgs>> getBotAliasTags() {
        return this.botAliasTags == null ? Input.empty() : this.botAliasTags;
    }

    @InputImport(name="botId", required=true)
      private final Input<String> botId;

    public Input<String> getBotId() {
        return this.botId;
    }

    @InputImport(name="botVersion")
      private final @Nullable Input<String> botVersion;

    public Input<String> getBotVersion() {
        return this.botVersion == null ? Input.empty() : this.botVersion;
    }

    @InputImport(name="conversationLogSettings")
      private final @Nullable Input<BotAliasConversationLogSettingsArgs> conversationLogSettings;

    public Input<BotAliasConversationLogSettingsArgs> getConversationLogSettings() {
        return this.conversationLogSettings == null ? Input.empty() : this.conversationLogSettings;
    }

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
     * 
     */
    @InputImport(name="sentimentAnalysisSettings")
      private final @Nullable Input<SentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings;

    public Input<SentimentAnalysisSettingsPropertiesArgs> getSentimentAnalysisSettings() {
        return this.sentimentAnalysisSettings == null ? Input.empty() : this.sentimentAnalysisSettings;
    }

    public BotAliasArgs(
        @Nullable Input<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings,
        @Nullable Input<String> botAliasName,
        @Nullable Input<List<BotAliasTagArgs>> botAliasTags,
        Input<String> botId,
        @Nullable Input<String> botVersion,
        @Nullable Input<BotAliasConversationLogSettingsArgs> conversationLogSettings,
        @Nullable Input<String> description,
        @Nullable Input<SentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings) {
        this.botAliasLocaleSettings = botAliasLocaleSettings;
        this.botAliasName = botAliasName;
        this.botAliasTags = botAliasTags;
        this.botId = Objects.requireNonNull(botId, "expected parameter 'botId' to be non-null");
        this.botVersion = botVersion;
        this.conversationLogSettings = conversationLogSettings;
        this.description = description;
        this.sentimentAnalysisSettings = sentimentAnalysisSettings;
    }

    private BotAliasArgs() {
        this.botAliasLocaleSettings = Input.empty();
        this.botAliasName = Input.empty();
        this.botAliasTags = Input.empty();
        this.botId = Input.empty();
        this.botVersion = Input.empty();
        this.conversationLogSettings = Input.empty();
        this.description = Input.empty();
        this.sentimentAnalysisSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings;
        private @Nullable Input<String> botAliasName;
        private @Nullable Input<List<BotAliasTagArgs>> botAliasTags;
        private Input<String> botId;
        private @Nullable Input<String> botVersion;
        private @Nullable Input<BotAliasConversationLogSettingsArgs> conversationLogSettings;
        private @Nullable Input<String> description;
        private @Nullable Input<SentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botAliasLocaleSettings = defaults.botAliasLocaleSettings;
    	      this.botAliasName = defaults.botAliasName;
    	      this.botAliasTags = defaults.botAliasTags;
    	      this.botId = defaults.botId;
    	      this.botVersion = defaults.botVersion;
    	      this.conversationLogSettings = defaults.conversationLogSettings;
    	      this.description = defaults.description;
    	      this.sentimentAnalysisSettings = defaults.sentimentAnalysisSettings;
        }

        public Builder setBotAliasLocaleSettings(@Nullable Input<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings) {
            this.botAliasLocaleSettings = botAliasLocaleSettings;
            return this;
        }

        public Builder setBotAliasLocaleSettings(@Nullable List<BotAliasLocaleSettingsItemArgs> botAliasLocaleSettings) {
            this.botAliasLocaleSettings = Input.ofNullable(botAliasLocaleSettings);
            return this;
        }

        public Builder setBotAliasName(@Nullable Input<String> botAliasName) {
            this.botAliasName = botAliasName;
            return this;
        }

        public Builder setBotAliasName(@Nullable String botAliasName) {
            this.botAliasName = Input.ofNullable(botAliasName);
            return this;
        }

        public Builder setBotAliasTags(@Nullable Input<List<BotAliasTagArgs>> botAliasTags) {
            this.botAliasTags = botAliasTags;
            return this;
        }

        public Builder setBotAliasTags(@Nullable List<BotAliasTagArgs> botAliasTags) {
            this.botAliasTags = Input.ofNullable(botAliasTags);
            return this;
        }

        public Builder setBotId(Input<String> botId) {
            this.botId = Objects.requireNonNull(botId);
            return this;
        }

        public Builder setBotId(String botId) {
            this.botId = Input.of(Objects.requireNonNull(botId));
            return this;
        }

        public Builder setBotVersion(@Nullable Input<String> botVersion) {
            this.botVersion = botVersion;
            return this;
        }

        public Builder setBotVersion(@Nullable String botVersion) {
            this.botVersion = Input.ofNullable(botVersion);
            return this;
        }

        public Builder setConversationLogSettings(@Nullable Input<BotAliasConversationLogSettingsArgs> conversationLogSettings) {
            this.conversationLogSettings = conversationLogSettings;
            return this;
        }

        public Builder setConversationLogSettings(@Nullable BotAliasConversationLogSettingsArgs conversationLogSettings) {
            this.conversationLogSettings = Input.ofNullable(conversationLogSettings);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setSentimentAnalysisSettings(@Nullable Input<SentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings) {
            this.sentimentAnalysisSettings = sentimentAnalysisSettings;
            return this;
        }

        public Builder setSentimentAnalysisSettings(@Nullable SentimentAnalysisSettingsPropertiesArgs sentimentAnalysisSettings) {
            this.sentimentAnalysisSettings = Input.ofNullable(sentimentAnalysisSettings);
            return this;
        }
        public BotAliasArgs build() {
            return new BotAliasArgs(botAliasLocaleSettings, botAliasName, botAliasTags, botId, botVersion, conversationLogSettings, description, sentimentAnalysisSettings);
        }
    }
}
