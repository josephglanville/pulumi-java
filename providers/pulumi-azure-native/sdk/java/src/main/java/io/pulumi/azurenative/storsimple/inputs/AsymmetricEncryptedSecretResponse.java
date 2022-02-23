// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represent the secrets intended for encryption with asymmetric key pair.
 * 
 */
public final class AsymmetricEncryptedSecretResponse extends io.pulumi.resources.InvokeArgs {

    public static final AsymmetricEncryptedSecretResponse Empty = new AsymmetricEncryptedSecretResponse();

    /**
     * The algorithm used to encrypt "Value".
     * 
     */
    @InputImport(name="encryptionAlgorithm", required=true)
      private final String encryptionAlgorithm;

    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * Thumbprint certificate that was used to encrypt "Value". If the value in unencrypted, it will be null.
     * 
     */
    @InputImport(name="encryptionCertThumbprint")
      private final @Nullable String encryptionCertThumbprint;

    public Optional<String> getEncryptionCertThumbprint() {
        return this.encryptionCertThumbprint == null ? Optional.empty() : Optional.ofNullable(this.encryptionCertThumbprint);
    }

    /**
     * The value of the secret.
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public AsymmetricEncryptedSecretResponse(
        String encryptionAlgorithm,
        @Nullable String encryptionCertThumbprint,
        String value) {
        this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm, "expected parameter 'encryptionAlgorithm' to be non-null");
        this.encryptionCertThumbprint = encryptionCertThumbprint;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AsymmetricEncryptedSecretResponse() {
        this.encryptionAlgorithm = null;
        this.encryptionCertThumbprint = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AsymmetricEncryptedSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionAlgorithm;
        private @Nullable String encryptionCertThumbprint;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AsymmetricEncryptedSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionCertThumbprint = defaults.encryptionCertThumbprint;
    	      this.value = defaults.value;
        }

        public Builder setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }

        public Builder setEncryptionCertThumbprint(@Nullable String encryptionCertThumbprint) {
            this.encryptionCertThumbprint = encryptionCertThumbprint;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public AsymmetricEncryptedSecretResponse build() {
            return new AsymmetricEncryptedSecretResponse(encryptionAlgorithm, encryptionCertThumbprint, value);
        }
    }
}
