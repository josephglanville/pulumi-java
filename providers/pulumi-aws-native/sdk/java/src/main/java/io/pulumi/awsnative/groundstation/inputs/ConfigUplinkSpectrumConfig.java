// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.enums.ConfigPolarization;
import io.pulumi.awsnative.groundstation.inputs.ConfigFrequency;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigUplinkSpectrumConfig extends io.pulumi.resources.InvokeArgs {

    public static final ConfigUplinkSpectrumConfig Empty = new ConfigUplinkSpectrumConfig();

    @InputImport(name="centerFrequency")
      private final @Nullable ConfigFrequency centerFrequency;

    public Optional<ConfigFrequency> getCenterFrequency() {
        return this.centerFrequency == null ? Optional.empty() : Optional.ofNullable(this.centerFrequency);
    }

    @InputImport(name="polarization")
      private final @Nullable ConfigPolarization polarization;

    public Optional<ConfigPolarization> getPolarization() {
        return this.polarization == null ? Optional.empty() : Optional.ofNullable(this.polarization);
    }

    public ConfigUplinkSpectrumConfig(
        @Nullable ConfigFrequency centerFrequency,
        @Nullable ConfigPolarization polarization) {
        this.centerFrequency = centerFrequency;
        this.polarization = polarization;
    }

    private ConfigUplinkSpectrumConfig() {
        this.centerFrequency = null;
        this.polarization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigUplinkSpectrumConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigFrequency centerFrequency;
        private @Nullable ConfigPolarization polarization;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigUplinkSpectrumConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.centerFrequency = defaults.centerFrequency;
    	      this.polarization = defaults.polarization;
        }

        public Builder setCenterFrequency(@Nullable ConfigFrequency centerFrequency) {
            this.centerFrequency = centerFrequency;
            return this;
        }

        public Builder setPolarization(@Nullable ConfigPolarization polarization) {
            this.polarization = polarization;
            return this;
        }
        public ConfigUplinkSpectrumConfig build() {
            return new ConfigUplinkSpectrumConfig(centerFrequency, polarization);
        }
    }
}
