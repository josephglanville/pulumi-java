// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotAliasLocaleSettings;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BotAliasLocaleSettingsItem {
    private final BotAliasLocaleSettings botAliasLocaleSetting;
    /**
     * A string used to identify the locale
     * 
     */
    private final String localeId;

    @CustomType.Constructor
    private BotAliasLocaleSettingsItem(
        @CustomType.Parameter("botAliasLocaleSetting") BotAliasLocaleSettings botAliasLocaleSetting,
        @CustomType.Parameter("localeId") String localeId) {
        this.botAliasLocaleSetting = botAliasLocaleSetting;
        this.localeId = localeId;
    }

    public BotAliasLocaleSettings getBotAliasLocaleSetting() {
        return this.botAliasLocaleSetting;
    }
    /**
     * A string used to identify the locale
     * 
    */
    public String getLocaleId() {
        return this.localeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasLocaleSettingsItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasLocaleSettings botAliasLocaleSetting;
        private String localeId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasLocaleSettingsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botAliasLocaleSetting = defaults.botAliasLocaleSetting;
    	      this.localeId = defaults.localeId;
        }

        public Builder botAliasLocaleSetting(BotAliasLocaleSettings botAliasLocaleSetting) {
            this.botAliasLocaleSetting = Objects.requireNonNull(botAliasLocaleSetting);
            return this;
        }
        public Builder localeId(String localeId) {
            this.localeId = Objects.requireNonNull(localeId);
            return this;
        }        public BotAliasLocaleSettingsItem build() {
            return new BotAliasLocaleSettingsItem(botAliasLocaleSetting, localeId);
        }
    }
}
