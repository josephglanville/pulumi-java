// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.KeyVaultKeyReferenceResponseKeyVault;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultKeyReferenceResponse {
    private final String keyName;
    private final KeyVaultKeyReferenceResponseKeyVault keyVault;
    private final @Nullable String keyVersion;

    @OutputCustomType.Constructor({"keyName","keyVault","keyVersion"})
    private KeyVaultKeyReferenceResponse(
        String keyName,
        KeyVaultKeyReferenceResponseKeyVault keyVault,
        @Nullable String keyVersion) {
        this.keyName = Objects.requireNonNull(keyName);
        this.keyVault = Objects.requireNonNull(keyVault);
        this.keyVersion = keyVersion;
    }

    public String getKeyName() {
        return this.keyName;
    }
    public KeyVaultKeyReferenceResponseKeyVault getKeyVault() {
        return this.keyVault;
    }
    public Optional<String> getKeyVersion() {
        return Optional.ofNullable(this.keyVersion);
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
