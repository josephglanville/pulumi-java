// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.BotmanBotAnalyticsCookieArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.BotmanBotAnalyticsCookieState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/botmanBotAnalyticsCookie:BotmanBotAnalyticsCookie")
public class BotmanBotAnalyticsCookie extends com.pulumi.resources.CustomResource {
    @Export(name="botAnalyticsCookie", refs={String.class}, tree="[0]")
    private Output<String> botAnalyticsCookie;

    public Output<String> botAnalyticsCookie() {
        return this.botAnalyticsCookie;
    }
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotmanBotAnalyticsCookie(String name) {
        this(name, BotmanBotAnalyticsCookieArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotmanBotAnalyticsCookie(String name, BotmanBotAnalyticsCookieArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotmanBotAnalyticsCookie(String name, BotmanBotAnalyticsCookieArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanBotAnalyticsCookie:BotmanBotAnalyticsCookie", name, args == null ? BotmanBotAnalyticsCookieArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BotmanBotAnalyticsCookie(String name, Output<String> id, @Nullable BotmanBotAnalyticsCookieState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanBotAnalyticsCookie:BotmanBotAnalyticsCookie", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BotmanBotAnalyticsCookie get(String name, Output<String> id, @Nullable BotmanBotAnalyticsCookieState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotmanBotAnalyticsCookie(name, id, state, options);
    }
}
