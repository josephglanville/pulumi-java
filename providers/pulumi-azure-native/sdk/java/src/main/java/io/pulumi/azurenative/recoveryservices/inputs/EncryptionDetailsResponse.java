// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption details for the fabric.
 * 
 */
public final class EncryptionDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionDetailsResponse Empty = new EncryptionDetailsResponse();

    /**
     * The key encryption key certificate expiry date.
     * 
     */
    @InputImport(name="kekCertExpiryDate")
      private final @Nullable String kekCertExpiryDate;

    public Optional<String> getKekCertExpiryDate() {
        return this.kekCertExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.kekCertExpiryDate);
    }

    /**
     * The key encryption key certificate thumbprint.
     * 
     */
    @InputImport(name="kekCertThumbprint")
      private final @Nullable String kekCertThumbprint;

    public Optional<String> getKekCertThumbprint() {
        return this.kekCertThumbprint == null ? Optional.empty() : Optional.ofNullable(this.kekCertThumbprint);
    }

    /**
     * The key encryption key state for the Vmm.
     * 
     */
    @InputImport(name="kekState")
      private final @Nullable String kekState;

    public Optional<String> getKekState() {
        return this.kekState == null ? Optional.empty() : Optional.ofNullable(this.kekState);
    }

    public EncryptionDetailsResponse(
        @Nullable String kekCertExpiryDate,
        @Nullable String kekCertThumbprint,
        @Nullable String kekState) {
        this.kekCertExpiryDate = kekCertExpiryDate;
        this.kekCertThumbprint = kekCertThumbprint;
        this.kekState = kekState;
    }

    private EncryptionDetailsResponse() {
        this.kekCertExpiryDate = null;
        this.kekCertThumbprint = null;
        this.kekState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kekCertExpiryDate;
        private @Nullable String kekCertThumbprint;
        private @Nullable String kekState;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kekCertExpiryDate = defaults.kekCertExpiryDate;
    	      this.kekCertThumbprint = defaults.kekCertThumbprint;
    	      this.kekState = defaults.kekState;
        }

        public Builder setKekCertExpiryDate(@Nullable String kekCertExpiryDate) {
            this.kekCertExpiryDate = kekCertExpiryDate;
            return this;
        }

        public Builder setKekCertThumbprint(@Nullable String kekCertThumbprint) {
            this.kekCertThumbprint = kekCertThumbprint;
            return this;
        }

        public Builder setKekState(@Nullable String kekState) {
            this.kekState = kekState;
            return this;
        }
        public EncryptionDetailsResponse build() {
            return new EncryptionDetailsResponse(kekCertExpiryDate, kekCertThumbprint, kekState);
        }
    }
}
