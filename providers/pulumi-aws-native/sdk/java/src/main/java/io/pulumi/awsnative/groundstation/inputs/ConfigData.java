// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.ConfigAntennaDownlinkConfig;
import io.pulumi.awsnative.groundstation.inputs.ConfigAntennaDownlinkDemodDecodeConfig;
import io.pulumi.awsnative.groundstation.inputs.ConfigAntennaUplinkConfig;
import io.pulumi.awsnative.groundstation.inputs.ConfigDataflowEndpointConfig;
import io.pulumi.awsnative.groundstation.inputs.ConfigS3RecordingConfig;
import io.pulumi.awsnative.groundstation.inputs.ConfigTrackingConfig;
import io.pulumi.awsnative.groundstation.inputs.ConfigUplinkEchoConfig;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigData extends io.pulumi.resources.InvokeArgs {

    public static final ConfigData Empty = new ConfigData();

    @Import(name="antennaDownlinkConfig")
      private final @Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig;

    public Optional<ConfigAntennaDownlinkConfig> getAntennaDownlinkConfig() {
        return this.antennaDownlinkConfig == null ? Optional.empty() : Optional.ofNullable(this.antennaDownlinkConfig);
    }

    @Import(name="antennaDownlinkDemodDecodeConfig")
      private final @Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig;

    public Optional<ConfigAntennaDownlinkDemodDecodeConfig> getAntennaDownlinkDemodDecodeConfig() {
        return this.antennaDownlinkDemodDecodeConfig == null ? Optional.empty() : Optional.ofNullable(this.antennaDownlinkDemodDecodeConfig);
    }

    @Import(name="antennaUplinkConfig")
      private final @Nullable ConfigAntennaUplinkConfig antennaUplinkConfig;

    public Optional<ConfigAntennaUplinkConfig> getAntennaUplinkConfig() {
        return this.antennaUplinkConfig == null ? Optional.empty() : Optional.ofNullable(this.antennaUplinkConfig);
    }

    @Import(name="dataflowEndpointConfig")
      private final @Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig;

    public Optional<ConfigDataflowEndpointConfig> getDataflowEndpointConfig() {
        return this.dataflowEndpointConfig == null ? Optional.empty() : Optional.ofNullable(this.dataflowEndpointConfig);
    }

    @Import(name="s3RecordingConfig")
      private final @Nullable ConfigS3RecordingConfig s3RecordingConfig;

    public Optional<ConfigS3RecordingConfig> getS3RecordingConfig() {
        return this.s3RecordingConfig == null ? Optional.empty() : Optional.ofNullable(this.s3RecordingConfig);
    }

    @Import(name="trackingConfig")
      private final @Nullable ConfigTrackingConfig trackingConfig;

    public Optional<ConfigTrackingConfig> getTrackingConfig() {
        return this.trackingConfig == null ? Optional.empty() : Optional.ofNullable(this.trackingConfig);
    }

    @Import(name="uplinkEchoConfig")
      private final @Nullable ConfigUplinkEchoConfig uplinkEchoConfig;

    public Optional<ConfigUplinkEchoConfig> getUplinkEchoConfig() {
        return this.uplinkEchoConfig == null ? Optional.empty() : Optional.ofNullable(this.uplinkEchoConfig);
    }

    public ConfigData(
        @Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig,
        @Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig,
        @Nullable ConfigAntennaUplinkConfig antennaUplinkConfig,
        @Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig,
        @Nullable ConfigS3RecordingConfig s3RecordingConfig,
        @Nullable ConfigTrackingConfig trackingConfig,
        @Nullable ConfigUplinkEchoConfig uplinkEchoConfig) {
        this.antennaDownlinkConfig = antennaDownlinkConfig;
        this.antennaDownlinkDemodDecodeConfig = antennaDownlinkDemodDecodeConfig;
        this.antennaUplinkConfig = antennaUplinkConfig;
        this.dataflowEndpointConfig = dataflowEndpointConfig;
        this.s3RecordingConfig = s3RecordingConfig;
        this.trackingConfig = trackingConfig;
        this.uplinkEchoConfig = uplinkEchoConfig;
    }

    private ConfigData() {
        this.antennaDownlinkConfig = null;
        this.antennaDownlinkDemodDecodeConfig = null;
        this.antennaUplinkConfig = null;
        this.dataflowEndpointConfig = null;
        this.s3RecordingConfig = null;
        this.trackingConfig = null;
        this.uplinkEchoConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig;
        private @Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig;
        private @Nullable ConfigAntennaUplinkConfig antennaUplinkConfig;
        private @Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig;
        private @Nullable ConfigS3RecordingConfig s3RecordingConfig;
        private @Nullable ConfigTrackingConfig trackingConfig;
        private @Nullable ConfigUplinkEchoConfig uplinkEchoConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antennaDownlinkConfig = defaults.antennaDownlinkConfig;
    	      this.antennaDownlinkDemodDecodeConfig = defaults.antennaDownlinkDemodDecodeConfig;
    	      this.antennaUplinkConfig = defaults.antennaUplinkConfig;
    	      this.dataflowEndpointConfig = defaults.dataflowEndpointConfig;
    	      this.s3RecordingConfig = defaults.s3RecordingConfig;
    	      this.trackingConfig = defaults.trackingConfig;
    	      this.uplinkEchoConfig = defaults.uplinkEchoConfig;
        }

        public Builder antennaDownlinkConfig(@Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig) {
            this.antennaDownlinkConfig = antennaDownlinkConfig;
            return this;
        }
        public Builder antennaDownlinkDemodDecodeConfig(@Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig) {
            this.antennaDownlinkDemodDecodeConfig = antennaDownlinkDemodDecodeConfig;
            return this;
        }
        public Builder antennaUplinkConfig(@Nullable ConfigAntennaUplinkConfig antennaUplinkConfig) {
            this.antennaUplinkConfig = antennaUplinkConfig;
            return this;
        }
        public Builder dataflowEndpointConfig(@Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig) {
            this.dataflowEndpointConfig = dataflowEndpointConfig;
            return this;
        }
        public Builder s3RecordingConfig(@Nullable ConfigS3RecordingConfig s3RecordingConfig) {
            this.s3RecordingConfig = s3RecordingConfig;
            return this;
        }
        public Builder trackingConfig(@Nullable ConfigTrackingConfig trackingConfig) {
            this.trackingConfig = trackingConfig;
            return this;
        }
        public Builder uplinkEchoConfig(@Nullable ConfigUplinkEchoConfig uplinkEchoConfig) {
            this.uplinkEchoConfig = uplinkEchoConfig;
            return this;
        }        public ConfigData build() {
            return new ConfigData(antennaDownlinkConfig, antennaDownlinkDemodDecodeConfig, antennaUplinkConfig, dataflowEndpointConfig, s3RecordingConfig, trackingConfig, uplinkEchoConfig);
        }
    }
}
