// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SiteMachineKeyResponse {
    private final @Nullable String decryption;
    private final @Nullable String decryptionKey;
    private final @Nullable String validation;
    private final @Nullable String validationKey;

    @OutputCustomType.Constructor({"decryption","decryptionKey","validation","validationKey"})
    private SiteMachineKeyResponse(
        @Nullable String decryption,
        @Nullable String decryptionKey,
        @Nullable String validation,
        @Nullable String validationKey) {
        this.decryption = decryption;
        this.decryptionKey = decryptionKey;
        this.validation = validation;
        this.validationKey = validationKey;
    }

    public Optional<String> getDecryption() {
        return Optional.ofNullable(this.decryption);
    }
    public Optional<String> getDecryptionKey() {
        return Optional.ofNullable(this.decryptionKey);
    }
    public Optional<String> getValidation() {
        return Optional.ofNullable(this.validation);
    }
    public Optional<String> getValidationKey() {
        return Optional.ofNullable(this.validationKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteMachineKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String decryption;
        private @Nullable String decryptionKey;
        private @Nullable String validation;
        private @Nullable String validationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteMachineKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decryption = defaults.decryption;
    	      this.decryptionKey = defaults.decryptionKey;
    	      this.validation = defaults.validation;
    	      this.validationKey = defaults.validationKey;
        }

        public Builder setDecryption(@Nullable String decryption) {
            this.decryption = decryption;
            return this;
        }

        public Builder setDecryptionKey(@Nullable String decryptionKey) {
            this.decryptionKey = decryptionKey;
            return this;
        }

        public Builder setValidation(@Nullable String validation) {
            this.validation = validation;
            return this;
        }

        public Builder setValidationKey(@Nullable String validationKey) {
            this.validationKey = validationKey;
            return this;
        }

        public SiteMachineKeyResponse build() {
            return new SiteMachineKeyResponse(decryption, decryptionKey, validation, validationKey);
        }
    }
}
