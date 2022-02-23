// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationNoEncryptionConfig;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamKMSEncryptionConfig;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamEncryptionConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamEncryptionConfiguration Empty = new DeliveryStreamEncryptionConfiguration();

    @InputImport(name="kMSEncryptionConfig")
      private final @Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig;

    public Optional<DeliveryStreamKMSEncryptionConfig> getKMSEncryptionConfig() {
        return this.kMSEncryptionConfig == null ? Optional.empty() : Optional.ofNullable(this.kMSEncryptionConfig);
    }

    @InputImport(name="noEncryptionConfig")
      private final @Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig;

    public Optional<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> getNoEncryptionConfig() {
        return this.noEncryptionConfig == null ? Optional.empty() : Optional.ofNullable(this.noEncryptionConfig);
    }

    public DeliveryStreamEncryptionConfiguration(
        @Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig,
        @Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig) {
        this.kMSEncryptionConfig = kMSEncryptionConfig;
        this.noEncryptionConfig = noEncryptionConfig;
    }

    private DeliveryStreamEncryptionConfiguration() {
        this.kMSEncryptionConfig = null;
        this.noEncryptionConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig;
        private @Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kMSEncryptionConfig = defaults.kMSEncryptionConfig;
    	      this.noEncryptionConfig = defaults.noEncryptionConfig;
        }

        public Builder setKMSEncryptionConfig(@Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig) {
            this.kMSEncryptionConfig = kMSEncryptionConfig;
            return this;
        }

        public Builder setNoEncryptionConfig(@Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig) {
            this.noEncryptionConfig = noEncryptionConfig;
            return this;
        }
        public DeliveryStreamEncryptionConfiguration build() {
            return new DeliveryStreamEncryptionConfiguration(kMSEncryptionConfig, noEncryptionConfig);
        }
    }
}
