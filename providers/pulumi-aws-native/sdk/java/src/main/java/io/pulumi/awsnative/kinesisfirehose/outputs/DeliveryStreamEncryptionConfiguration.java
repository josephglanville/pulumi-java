// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationNoEncryptionConfig;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamKMSEncryptionConfig;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamEncryptionConfiguration {
    private final @Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig;
    private final @Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig;

    @CustomType.Constructor
    private DeliveryStreamEncryptionConfiguration(
        @CustomType.Parameter("kMSEncryptionConfig") @Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig,
        @CustomType.Parameter("noEncryptionConfig") @Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig) {
        this.kMSEncryptionConfig = kMSEncryptionConfig;
        this.noEncryptionConfig = noEncryptionConfig;
    }

    public Optional<DeliveryStreamKMSEncryptionConfig> getKMSEncryptionConfig() {
        return Optional.ofNullable(this.kMSEncryptionConfig);
    }
    public Optional<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> getNoEncryptionConfig() {
        return Optional.ofNullable(this.noEncryptionConfig);
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

        public Builder kMSEncryptionConfig(@Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig) {
            this.kMSEncryptionConfig = kMSEncryptionConfig;
            return this;
        }
        public Builder noEncryptionConfig(@Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig) {
            this.noEncryptionConfig = noEncryptionConfig;
            return this;
        }        public DeliveryStreamEncryptionConfiguration build() {
            return new DeliveryStreamEncryptionConfiguration(kMSEncryptionConfig, noEncryptionConfig);
        }
    }
}
