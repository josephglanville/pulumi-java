// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Symmetric key for authentication.
 * 
 */
public final class SymmetricKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final SymmetricKeyResponse Empty = new SymmetricKeyResponse();

    /**
     * Connection string based on the symmetric key.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable AsymmetricEncryptedSecretResponse connectionString;

    public Optional<AsymmetricEncryptedSecretResponse> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    public SymmetricKeyResponse(@Nullable AsymmetricEncryptedSecretResponse connectionString) {
        this.connectionString = connectionString;
    }

    private SymmetricKeyResponse() {
        this.connectionString = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SymmetricKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AsymmetricEncryptedSecretResponse connectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(SymmetricKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
        }

        public Builder connectionString(@Nullable AsymmetricEncryptedSecretResponse connectionString) {
            this.connectionString = connectionString;
            return this;
        }        public SymmetricKeyResponse build() {
            return new SymmetricKeyResponse(connectionString);
        }
    }
}
