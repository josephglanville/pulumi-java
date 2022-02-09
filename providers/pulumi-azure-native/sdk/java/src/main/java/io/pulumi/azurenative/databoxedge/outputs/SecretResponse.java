// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretResponse {
    private final @Nullable AsymmetricEncryptedSecretResponse encryptedSecret;
    private final @Nullable String keyVaultId;

    @OutputCustomType.Constructor({"encryptedSecret","keyVaultId"})
    private SecretResponse(
        @Nullable AsymmetricEncryptedSecretResponse encryptedSecret,
        @Nullable String keyVaultId) {
        this.encryptedSecret = encryptedSecret;
        this.keyVaultId = keyVaultId;
    }

    public Optional<AsymmetricEncryptedSecretResponse> getEncryptedSecret() {
        return Optional.ofNullable(this.encryptedSecret);
    }
    public Optional<String> getKeyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AsymmetricEncryptedSecretResponse encryptedSecret;
        private @Nullable String keyVaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedSecret = defaults.encryptedSecret;
    	      this.keyVaultId = defaults.keyVaultId;
        }

        public Builder setEncryptedSecret(@Nullable AsymmetricEncryptedSecretResponse encryptedSecret) {
            this.encryptedSecret = encryptedSecret;
            return this;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public SecretResponse build() {
            return new SecretResponse(encryptedSecret, keyVaultId);
        }
    }
}
