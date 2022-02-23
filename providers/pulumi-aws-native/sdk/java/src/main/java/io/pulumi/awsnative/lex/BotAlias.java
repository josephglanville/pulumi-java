// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lex.BotAliasArgs;
import io.pulumi.awsnative.lex.enums.BotAliasStatus;
import io.pulumi.awsnative.lex.outputs.BotAliasConversationLogSettings;
import io.pulumi.awsnative.lex.outputs.BotAliasLocaleSettingsItem;
import io.pulumi.awsnative.lex.outputs.BotAliasTag;
import io.pulumi.awsnative.lex.outputs.SentimentAnalysisSettingsProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Bot Alias enables you to change the version of a bot without updating applications that use the bot
 * 
 */
@ResourceType(type="aws-native:lex:BotAlias")
public class BotAlias extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="botAliasId", type=String.class, parameters={})
    private Output<String> botAliasId;

    public Output<String> getBotAliasId() {
        return this.botAliasId;
    }
    @OutputExport(name="botAliasLocaleSettings", type=List.class, parameters={BotAliasLocaleSettingsItem.class})
    private Output</* @Nullable */ List<BotAliasLocaleSettingsItem>> botAliasLocaleSettings;

    public Output</* @Nullable */ List<BotAliasLocaleSettingsItem>> getBotAliasLocaleSettings() {
        return this.botAliasLocaleSettings;
    }
    @OutputExport(name="botAliasName", type=String.class, parameters={})
    private Output<String> botAliasName;

    public Output<String> getBotAliasName() {
        return this.botAliasName;
    }
    @OutputExport(name="botAliasStatus", type=BotAliasStatus.class, parameters={})
    private Output<BotAliasStatus> botAliasStatus;

    public Output<BotAliasStatus> getBotAliasStatus() {
        return this.botAliasStatus;
    }
    /**
     * A list of tags to add to the bot alias.
     * 
     */
    @OutputExport(name="botAliasTags", type=List.class, parameters={BotAliasTag.class})
    private Output</* @Nullable */ List<BotAliasTag>> botAliasTags;

    /**
     * @return A list of tags to add to the bot alias.
     * 
     */
    public Output</* @Nullable */ List<BotAliasTag>> getBotAliasTags() {
        return this.botAliasTags;
    }
    @OutputExport(name="botId", type=String.class, parameters={})
    private Output<String> botId;

    public Output<String> getBotId() {
        return this.botId;
    }
    @OutputExport(name="botVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> botVersion;

    public Output</* @Nullable */ String> getBotVersion() {
        return this.botVersion;
    }
    @OutputExport(name="conversationLogSettings", type=BotAliasConversationLogSettings.class, parameters={})
    private Output</* @Nullable */ BotAliasConversationLogSettings> conversationLogSettings;

    public Output</* @Nullable */ BotAliasConversationLogSettings> getConversationLogSettings() {
        return this.conversationLogSettings;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
     * 
     */
    @OutputExport(name="sentimentAnalysisSettings", type=SentimentAnalysisSettingsProperties.class, parameters={})
    private Output</* @Nullable */ SentimentAnalysisSettingsProperties> sentimentAnalysisSettings;

    /**
     * @return Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
     * 
     */
    public Output</* @Nullable */ SentimentAnalysisSettingsProperties> getSentimentAnalysisSettings() {
        return this.sentimentAnalysisSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotAlias(String name) {
        this(name, BotAliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotAlias(String name, BotAliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotAlias(String name, BotAliasArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lex:BotAlias", name, args == null ? BotAliasArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BotAlias(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lex:BotAlias", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BotAlias get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BotAlias(name, id, options);
    }
}
