// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationSettingResponse {
    private final @Nullable String actionAfterReboot;
    private final @Nullable Boolean allowModuleOverwrite;
    private final @Nullable String configurationMode;
    private final @Nullable Double configurationModeFrequencyMins;
    private final @Nullable Boolean rebootIfNeeded;
    private final @Nullable Double refreshFrequencyMins;

    @OutputCustomType.Constructor({"actionAfterReboot","allowModuleOverwrite","configurationMode","configurationModeFrequencyMins","rebootIfNeeded","refreshFrequencyMins"})
    private ConfigurationSettingResponse(
        @Nullable String actionAfterReboot,
        @Nullable Boolean allowModuleOverwrite,
        @Nullable String configurationMode,
        @Nullable Double configurationModeFrequencyMins,
        @Nullable Boolean rebootIfNeeded,
        @Nullable Double refreshFrequencyMins) {
        this.actionAfterReboot = actionAfterReboot;
        this.allowModuleOverwrite = allowModuleOverwrite;
        this.configurationMode = configurationMode;
        this.configurationModeFrequencyMins = configurationModeFrequencyMins;
        this.rebootIfNeeded = rebootIfNeeded;
        this.refreshFrequencyMins = refreshFrequencyMins;
    }

    public Optional<String> getActionAfterReboot() {
        return Optional.ofNullable(this.actionAfterReboot);
    }
    public Optional<Boolean> getAllowModuleOverwrite() {
        return Optional.ofNullable(this.allowModuleOverwrite);
    }
    public Optional<String> getConfigurationMode() {
        return Optional.ofNullable(this.configurationMode);
    }
    public Optional<Double> getConfigurationModeFrequencyMins() {
        return Optional.ofNullable(this.configurationModeFrequencyMins);
    }
    public Optional<Boolean> getRebootIfNeeded() {
        return Optional.ofNullable(this.rebootIfNeeded);
    }
    public Optional<Double> getRefreshFrequencyMins() {
        return Optional.ofNullable(this.refreshFrequencyMins);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionAfterReboot;
        private @Nullable Boolean allowModuleOverwrite;
        private @Nullable String configurationMode;
        private @Nullable Double configurationModeFrequencyMins;
        private @Nullable Boolean rebootIfNeeded;
        private @Nullable Double refreshFrequencyMins;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionAfterReboot = defaults.actionAfterReboot;
    	      this.allowModuleOverwrite = defaults.allowModuleOverwrite;
    	      this.configurationMode = defaults.configurationMode;
    	      this.configurationModeFrequencyMins = defaults.configurationModeFrequencyMins;
    	      this.rebootIfNeeded = defaults.rebootIfNeeded;
    	      this.refreshFrequencyMins = defaults.refreshFrequencyMins;
        }

        public Builder setActionAfterReboot(@Nullable String actionAfterReboot) {
            this.actionAfterReboot = actionAfterReboot;
            return this;
        }

        public Builder setAllowModuleOverwrite(@Nullable Boolean allowModuleOverwrite) {
            this.allowModuleOverwrite = allowModuleOverwrite;
            return this;
        }

        public Builder setConfigurationMode(@Nullable String configurationMode) {
            this.configurationMode = configurationMode;
            return this;
        }

        public Builder setConfigurationModeFrequencyMins(@Nullable Double configurationModeFrequencyMins) {
            this.configurationModeFrequencyMins = configurationModeFrequencyMins;
            return this;
        }

        public Builder setRebootIfNeeded(@Nullable Boolean rebootIfNeeded) {
            this.rebootIfNeeded = rebootIfNeeded;
            return this;
        }

        public Builder setRefreshFrequencyMins(@Nullable Double refreshFrequencyMins) {
            this.refreshFrequencyMins = refreshFrequencyMins;
            return this;
        }

        public ConfigurationSettingResponse build() {
            return new ConfigurationSettingResponse(actionAfterReboot, allowModuleOverwrite, configurationMode, configurationModeFrequencyMins, rebootIfNeeded, refreshFrequencyMins);
        }
    }
}
