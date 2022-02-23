// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.enums.ConfigBandwidthUnits;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigFrequencyBandwidthArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigFrequencyBandwidthArgs Empty = new ConfigFrequencyBandwidthArgs();

    @InputImport(name="units")
      private final @Nullable Input<ConfigBandwidthUnits> units;

    public Input<ConfigBandwidthUnits> getUnits() {
        return this.units == null ? Input.empty() : this.units;
    }

    @InputImport(name="value")
      private final @Nullable Input<Double> value;

    public Input<Double> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ConfigFrequencyBandwidthArgs(
        @Nullable Input<ConfigBandwidthUnits> units,
        @Nullable Input<Double> value) {
        this.units = units;
        this.value = value;
    }

    private ConfigFrequencyBandwidthArgs() {
        this.units = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigFrequencyBandwidthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigBandwidthUnits> units;
        private @Nullable Input<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigFrequencyBandwidthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.units = defaults.units;
    	      this.value = defaults.value;
        }

        public Builder setUnits(@Nullable Input<ConfigBandwidthUnits> units) {
            this.units = units;
            return this;
        }

        public Builder setUnits(@Nullable ConfigBandwidthUnits units) {
            this.units = Input.ofNullable(units);
            return this;
        }

        public Builder setValue(@Nullable Input<Double> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public ConfigFrequencyBandwidthArgs build() {
            return new ConfigFrequencyBandwidthArgs(units, value);
        }
    }
}
