// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.KeyVaultKeyReferenceResponseKeyVault;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyVaultKeyReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultKeyReferenceResponse Empty = new KeyVaultKeyReferenceResponse();

    @InputImport(name="keyName", required=true)
    private final String keyName;

    public String getKeyName() {
        return this.keyName;
    }

    @InputImport(name="keyVault", required=true)
    private final KeyVaultKeyReferenceResponseKeyVault keyVault;

    public KeyVaultKeyReferenceResponseKeyVault getKeyVault() {
        return this.keyVault;
    }

    @InputImport(name="keyVersion")
    private final @Nullable String keyVersion;

    public Optional<String> getKeyVersion() {
        return this.keyVersion == null ? Optional.empty() : Optional.ofNullable(this.keyVersion);
    }

    public KeyVaultKeyReferenceResponse(
        String keyName,
        KeyVaultKeyReferenceResponseKeyVault keyVault,
        @Nullable String keyVersion) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.keyVault = Objects.requireNonNull(keyVault, "expected parameter 'keyVault' to be non-null");
        this.keyVersion = keyVersion;
    }

    private KeyVaultKeyReferenceResponse() {
        this.keyName = null;
        this.keyVault = null;
        this.keyVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private KeyVaultKeyReferenceResponseKeyVault keyVault;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVault = defaults.keyVault;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyVault(KeyVaultKeyReferenceResponseKeyVault keyVault) {
            this.keyVault = Objects.requireNonNull(keyVault);
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public KeyVaultKeyReferenceResponse build() {
            return new KeyVaultKeyReferenceResponse(keyName, keyVault, keyVersion);
        }
    }
}