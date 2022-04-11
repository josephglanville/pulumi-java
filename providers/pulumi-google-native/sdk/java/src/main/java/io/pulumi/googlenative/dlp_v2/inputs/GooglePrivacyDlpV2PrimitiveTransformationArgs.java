// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BucketingConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CharacterMaskConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoDeterministicConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoHashConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DateShiftConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FixedSizeBucketingConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RedactConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ReplaceDictionaryConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ReplaceValueConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TimePartConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule for transforming a value.
 * 
 */
public final class GooglePrivacyDlpV2PrimitiveTransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2PrimitiveTransformationArgs Empty = new GooglePrivacyDlpV2PrimitiveTransformationArgs();

    /**
     * Bucketing
     * 
     */
    @Import(name="bucketingConfig")
      private final @Nullable Output<GooglePrivacyDlpV2BucketingConfigArgs> bucketingConfig;

    public Output<GooglePrivacyDlpV2BucketingConfigArgs> getBucketingConfig() {
        return this.bucketingConfig == null ? Codegen.empty() : this.bucketingConfig;
    }

    /**
     * Mask
     * 
     */
    @Import(name="characterMaskConfig")
      private final @Nullable Output<GooglePrivacyDlpV2CharacterMaskConfigArgs> characterMaskConfig;

    public Output<GooglePrivacyDlpV2CharacterMaskConfigArgs> getCharacterMaskConfig() {
        return this.characterMaskConfig == null ? Codegen.empty() : this.characterMaskConfig;
    }

    /**
     * Deterministic Crypto
     * 
     */
    @Import(name="cryptoDeterministicConfig")
      private final @Nullable Output<GooglePrivacyDlpV2CryptoDeterministicConfigArgs> cryptoDeterministicConfig;

    public Output<GooglePrivacyDlpV2CryptoDeterministicConfigArgs> getCryptoDeterministicConfig() {
        return this.cryptoDeterministicConfig == null ? Codegen.empty() : this.cryptoDeterministicConfig;
    }

    /**
     * Crypto
     * 
     */
    @Import(name="cryptoHashConfig")
      private final @Nullable Output<GooglePrivacyDlpV2CryptoHashConfigArgs> cryptoHashConfig;

    public Output<GooglePrivacyDlpV2CryptoHashConfigArgs> getCryptoHashConfig() {
        return this.cryptoHashConfig == null ? Codegen.empty() : this.cryptoHashConfig;
    }

    /**
     * Ffx-Fpe
     * 
     */
    @Import(name="cryptoReplaceFfxFpeConfig")
      private final @Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig;

    public Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs> getCryptoReplaceFfxFpeConfig() {
        return this.cryptoReplaceFfxFpeConfig == null ? Codegen.empty() : this.cryptoReplaceFfxFpeConfig;
    }

    /**
     * Date Shift
     * 
     */
    @Import(name="dateShiftConfig")
      private final @Nullable Output<GooglePrivacyDlpV2DateShiftConfigArgs> dateShiftConfig;

    public Output<GooglePrivacyDlpV2DateShiftConfigArgs> getDateShiftConfig() {
        return this.dateShiftConfig == null ? Codegen.empty() : this.dateShiftConfig;
    }

    /**
     * Fixed size bucketing
     * 
     */
    @Import(name="fixedSizeBucketingConfig")
      private final @Nullable Output<GooglePrivacyDlpV2FixedSizeBucketingConfigArgs> fixedSizeBucketingConfig;

    public Output<GooglePrivacyDlpV2FixedSizeBucketingConfigArgs> getFixedSizeBucketingConfig() {
        return this.fixedSizeBucketingConfig == null ? Codegen.empty() : this.fixedSizeBucketingConfig;
    }

    /**
     * Redact
     * 
     */
    @Import(name="redactConfig")
      private final @Nullable Output<GooglePrivacyDlpV2RedactConfigArgs> redactConfig;

    public Output<GooglePrivacyDlpV2RedactConfigArgs> getRedactConfig() {
        return this.redactConfig == null ? Codegen.empty() : this.redactConfig;
    }

    /**
     * Replace with a specified value.
     * 
     */
    @Import(name="replaceConfig")
      private final @Nullable Output<GooglePrivacyDlpV2ReplaceValueConfigArgs> replaceConfig;

    public Output<GooglePrivacyDlpV2ReplaceValueConfigArgs> getReplaceConfig() {
        return this.replaceConfig == null ? Codegen.empty() : this.replaceConfig;
    }

    /**
     * Replace with a value randomly drawn (with replacement) from a dictionary.
     * 
     */
    @Import(name="replaceDictionaryConfig")
      private final @Nullable Output<GooglePrivacyDlpV2ReplaceDictionaryConfigArgs> replaceDictionaryConfig;

    public Output<GooglePrivacyDlpV2ReplaceDictionaryConfigArgs> getReplaceDictionaryConfig() {
        return this.replaceDictionaryConfig == null ? Codegen.empty() : this.replaceDictionaryConfig;
    }

    /**
     * Replace with infotype
     * 
     */
    @Import(name="replaceWithInfoTypeConfig")
      private final @Nullable Output<GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs> replaceWithInfoTypeConfig;

    public Output<GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs> getReplaceWithInfoTypeConfig() {
        return this.replaceWithInfoTypeConfig == null ? Codegen.empty() : this.replaceWithInfoTypeConfig;
    }

    /**
     * Time extraction
     * 
     */
    @Import(name="timePartConfig")
      private final @Nullable Output<GooglePrivacyDlpV2TimePartConfigArgs> timePartConfig;

    public Output<GooglePrivacyDlpV2TimePartConfigArgs> getTimePartConfig() {
        return this.timePartConfig == null ? Codegen.empty() : this.timePartConfig;
    }

    public GooglePrivacyDlpV2PrimitiveTransformationArgs(
        @Nullable Output<GooglePrivacyDlpV2BucketingConfigArgs> bucketingConfig,
        @Nullable Output<GooglePrivacyDlpV2CharacterMaskConfigArgs> characterMaskConfig,
        @Nullable Output<GooglePrivacyDlpV2CryptoDeterministicConfigArgs> cryptoDeterministicConfig,
        @Nullable Output<GooglePrivacyDlpV2CryptoHashConfigArgs> cryptoHashConfig,
        @Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig,
        @Nullable Output<GooglePrivacyDlpV2DateShiftConfigArgs> dateShiftConfig,
        @Nullable Output<GooglePrivacyDlpV2FixedSizeBucketingConfigArgs> fixedSizeBucketingConfig,
        @Nullable Output<GooglePrivacyDlpV2RedactConfigArgs> redactConfig,
        @Nullable Output<GooglePrivacyDlpV2ReplaceValueConfigArgs> replaceConfig,
        @Nullable Output<GooglePrivacyDlpV2ReplaceDictionaryConfigArgs> replaceDictionaryConfig,
        @Nullable Output<GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs> replaceWithInfoTypeConfig,
        @Nullable Output<GooglePrivacyDlpV2TimePartConfigArgs> timePartConfig) {
        this.bucketingConfig = bucketingConfig;
        this.characterMaskConfig = characterMaskConfig;
        this.cryptoDeterministicConfig = cryptoDeterministicConfig;
        this.cryptoHashConfig = cryptoHashConfig;
        this.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
        this.dateShiftConfig = dateShiftConfig;
        this.fixedSizeBucketingConfig = fixedSizeBucketingConfig;
        this.redactConfig = redactConfig;
        this.replaceConfig = replaceConfig;
        this.replaceDictionaryConfig = replaceDictionaryConfig;
        this.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
        this.timePartConfig = timePartConfig;
    }

    private GooglePrivacyDlpV2PrimitiveTransformationArgs() {
        this.bucketingConfig = Codegen.empty();
        this.characterMaskConfig = Codegen.empty();
        this.cryptoDeterministicConfig = Codegen.empty();
        this.cryptoHashConfig = Codegen.empty();
        this.cryptoReplaceFfxFpeConfig = Codegen.empty();
        this.dateShiftConfig = Codegen.empty();
        this.fixedSizeBucketingConfig = Codegen.empty();
        this.redactConfig = Codegen.empty();
        this.replaceConfig = Codegen.empty();
        this.replaceDictionaryConfig = Codegen.empty();
        this.replaceWithInfoTypeConfig = Codegen.empty();
        this.timePartConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PrimitiveTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2BucketingConfigArgs> bucketingConfig;
        private @Nullable Output<GooglePrivacyDlpV2CharacterMaskConfigArgs> characterMaskConfig;
        private @Nullable Output<GooglePrivacyDlpV2CryptoDeterministicConfigArgs> cryptoDeterministicConfig;
        private @Nullable Output<GooglePrivacyDlpV2CryptoHashConfigArgs> cryptoHashConfig;
        private @Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig;
        private @Nullable Output<GooglePrivacyDlpV2DateShiftConfigArgs> dateShiftConfig;
        private @Nullable Output<GooglePrivacyDlpV2FixedSizeBucketingConfigArgs> fixedSizeBucketingConfig;
        private @Nullable Output<GooglePrivacyDlpV2RedactConfigArgs> redactConfig;
        private @Nullable Output<GooglePrivacyDlpV2ReplaceValueConfigArgs> replaceConfig;
        private @Nullable Output<GooglePrivacyDlpV2ReplaceDictionaryConfigArgs> replaceDictionaryConfig;
        private @Nullable Output<GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs> replaceWithInfoTypeConfig;
        private @Nullable Output<GooglePrivacyDlpV2TimePartConfigArgs> timePartConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PrimitiveTransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketingConfig = defaults.bucketingConfig;
    	      this.characterMaskConfig = defaults.characterMaskConfig;
    	      this.cryptoDeterministicConfig = defaults.cryptoDeterministicConfig;
    	      this.cryptoHashConfig = defaults.cryptoHashConfig;
    	      this.cryptoReplaceFfxFpeConfig = defaults.cryptoReplaceFfxFpeConfig;
    	      this.dateShiftConfig = defaults.dateShiftConfig;
    	      this.fixedSizeBucketingConfig = defaults.fixedSizeBucketingConfig;
    	      this.redactConfig = defaults.redactConfig;
    	      this.replaceConfig = defaults.replaceConfig;
    	      this.replaceDictionaryConfig = defaults.replaceDictionaryConfig;
    	      this.replaceWithInfoTypeConfig = defaults.replaceWithInfoTypeConfig;
    	      this.timePartConfig = defaults.timePartConfig;
        }

        public Builder bucketingConfig(@Nullable Output<GooglePrivacyDlpV2BucketingConfigArgs> bucketingConfig) {
            this.bucketingConfig = bucketingConfig;
            return this;
        }
        public Builder bucketingConfig(@Nullable GooglePrivacyDlpV2BucketingConfigArgs bucketingConfig) {
            this.bucketingConfig = Codegen.ofNullable(bucketingConfig);
            return this;
        }
        public Builder characterMaskConfig(@Nullable Output<GooglePrivacyDlpV2CharacterMaskConfigArgs> characterMaskConfig) {
            this.characterMaskConfig = characterMaskConfig;
            return this;
        }
        public Builder characterMaskConfig(@Nullable GooglePrivacyDlpV2CharacterMaskConfigArgs characterMaskConfig) {
            this.characterMaskConfig = Codegen.ofNullable(characterMaskConfig);
            return this;
        }
        public Builder cryptoDeterministicConfig(@Nullable Output<GooglePrivacyDlpV2CryptoDeterministicConfigArgs> cryptoDeterministicConfig) {
            this.cryptoDeterministicConfig = cryptoDeterministicConfig;
            return this;
        }
        public Builder cryptoDeterministicConfig(@Nullable GooglePrivacyDlpV2CryptoDeterministicConfigArgs cryptoDeterministicConfig) {
            this.cryptoDeterministicConfig = Codegen.ofNullable(cryptoDeterministicConfig);
            return this;
        }
        public Builder cryptoHashConfig(@Nullable Output<GooglePrivacyDlpV2CryptoHashConfigArgs> cryptoHashConfig) {
            this.cryptoHashConfig = cryptoHashConfig;
            return this;
        }
        public Builder cryptoHashConfig(@Nullable GooglePrivacyDlpV2CryptoHashConfigArgs cryptoHashConfig) {
            this.cryptoHashConfig = Codegen.ofNullable(cryptoHashConfig);
            return this;
        }
        public Builder cryptoReplaceFfxFpeConfig(@Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig) {
            this.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
            return this;
        }
        public Builder cryptoReplaceFfxFpeConfig(@Nullable GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs cryptoReplaceFfxFpeConfig) {
            this.cryptoReplaceFfxFpeConfig = Codegen.ofNullable(cryptoReplaceFfxFpeConfig);
            return this;
        }
        public Builder dateShiftConfig(@Nullable Output<GooglePrivacyDlpV2DateShiftConfigArgs> dateShiftConfig) {
            this.dateShiftConfig = dateShiftConfig;
            return this;
        }
        public Builder dateShiftConfig(@Nullable GooglePrivacyDlpV2DateShiftConfigArgs dateShiftConfig) {
            this.dateShiftConfig = Codegen.ofNullable(dateShiftConfig);
            return this;
        }
        public Builder fixedSizeBucketingConfig(@Nullable Output<GooglePrivacyDlpV2FixedSizeBucketingConfigArgs> fixedSizeBucketingConfig) {
            this.fixedSizeBucketingConfig = fixedSizeBucketingConfig;
            return this;
        }
        public Builder fixedSizeBucketingConfig(@Nullable GooglePrivacyDlpV2FixedSizeBucketingConfigArgs fixedSizeBucketingConfig) {
            this.fixedSizeBucketingConfig = Codegen.ofNullable(fixedSizeBucketingConfig);
            return this;
        }
        public Builder redactConfig(@Nullable Output<GooglePrivacyDlpV2RedactConfigArgs> redactConfig) {
            this.redactConfig = redactConfig;
            return this;
        }
        public Builder redactConfig(@Nullable GooglePrivacyDlpV2RedactConfigArgs redactConfig) {
            this.redactConfig = Codegen.ofNullable(redactConfig);
            return this;
        }
        public Builder replaceConfig(@Nullable Output<GooglePrivacyDlpV2ReplaceValueConfigArgs> replaceConfig) {
            this.replaceConfig = replaceConfig;
            return this;
        }
        public Builder replaceConfig(@Nullable GooglePrivacyDlpV2ReplaceValueConfigArgs replaceConfig) {
            this.replaceConfig = Codegen.ofNullable(replaceConfig);
            return this;
        }
        public Builder replaceDictionaryConfig(@Nullable Output<GooglePrivacyDlpV2ReplaceDictionaryConfigArgs> replaceDictionaryConfig) {
            this.replaceDictionaryConfig = replaceDictionaryConfig;
            return this;
        }
        public Builder replaceDictionaryConfig(@Nullable GooglePrivacyDlpV2ReplaceDictionaryConfigArgs replaceDictionaryConfig) {
            this.replaceDictionaryConfig = Codegen.ofNullable(replaceDictionaryConfig);
            return this;
        }
        public Builder replaceWithInfoTypeConfig(@Nullable Output<GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs> replaceWithInfoTypeConfig) {
            this.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
            return this;
        }
        public Builder replaceWithInfoTypeConfig(@Nullable GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs replaceWithInfoTypeConfig) {
            this.replaceWithInfoTypeConfig = Codegen.ofNullable(replaceWithInfoTypeConfig);
            return this;
        }
        public Builder timePartConfig(@Nullable Output<GooglePrivacyDlpV2TimePartConfigArgs> timePartConfig) {
            this.timePartConfig = timePartConfig;
            return this;
        }
        public Builder timePartConfig(@Nullable GooglePrivacyDlpV2TimePartConfigArgs timePartConfig) {
            this.timePartConfig = Codegen.ofNullable(timePartConfig);
            return this;
        }        public GooglePrivacyDlpV2PrimitiveTransformationArgs build() {
            return new GooglePrivacyDlpV2PrimitiveTransformationArgs(bucketingConfig, characterMaskConfig, cryptoDeterministicConfig, cryptoHashConfig, cryptoReplaceFfxFpeConfig, dateShiftConfig, fixedSizeBucketingConfig, redactConfig, replaceConfig, replaceDictionaryConfig, replaceWithInfoTypeConfig, timePartConfig);
        }
    }
}
