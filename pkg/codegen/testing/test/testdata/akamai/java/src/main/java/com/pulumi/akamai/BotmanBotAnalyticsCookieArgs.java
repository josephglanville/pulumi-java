// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotmanBotAnalyticsCookieArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotmanBotAnalyticsCookieArgs Empty = new BotmanBotAnalyticsCookieArgs();

    @Import(name="botAnalyticsCookie", required=true)
    private Output<String> botAnalyticsCookie;

    public Output<String> botAnalyticsCookie() {
        return this.botAnalyticsCookie;
    }

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private BotmanBotAnalyticsCookieArgs() {}

    private BotmanBotAnalyticsCookieArgs(BotmanBotAnalyticsCookieArgs $) {
        this.botAnalyticsCookie = $.botAnalyticsCookie;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanBotAnalyticsCookieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanBotAnalyticsCookieArgs $;

        public Builder() {
            $ = new BotmanBotAnalyticsCookieArgs();
        }

        public Builder(BotmanBotAnalyticsCookieArgs defaults) {
            $ = new BotmanBotAnalyticsCookieArgs(Objects.requireNonNull(defaults));
        }

        public Builder botAnalyticsCookie(Output<String> botAnalyticsCookie) {
            $.botAnalyticsCookie = botAnalyticsCookie;
            return this;
        }

        public Builder botAnalyticsCookie(String botAnalyticsCookie) {
            return botAnalyticsCookie(Output.of(botAnalyticsCookie));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public BotmanBotAnalyticsCookieArgs build() {
            if ($.botAnalyticsCookie == null) {
                throw new MissingRequiredPropertyException("BotmanBotAnalyticsCookieArgs", "botAnalyticsCookie");
            }
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("BotmanBotAnalyticsCookieArgs", "configId");
            }
            return $;
        }
    }

}
