// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata information used by account encryption.
 * 
 */
public final class KeyVaultMetaInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultMetaInfoArgs Empty = new KeyVaultMetaInfoArgs();

    /**
     * The name of the user managed encryption key.
     * 
     */
    @InputImport(name="encryptionKeyName", required=true)
      private final Input<String> encryptionKeyName;

    public Input<String> getEncryptionKeyName() {
        return this.encryptionKeyName;
    }

    /**
     * The version of the user managed encryption key.
     * 
     */
    @InputImport(name="encryptionKeyVersion", required=true)
      private final Input<String> encryptionKeyVersion;

    public Input<String> getEncryptionKeyVersion() {
        return this.encryptionKeyVersion;
    }

    /**
     * The resource identifier for the user managed Key Vault being used to encrypt.
     * 
     */
    @InputImport(name="keyVaultResourceId", required=true)
      private final Input<String> keyVaultResourceId;

    public Input<String> getKeyVaultResourceId() {
        return this.keyVaultResourceId;
    }

    public KeyVaultMetaInfoArgs(
        Input<String> encryptionKeyName,
        Input<String> encryptionKeyVersion,
        Input<String> keyVaultResourceId) {
        this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName, "expected parameter 'encryptionKeyName' to be non-null");
        this.encryptionKeyVersion = Objects.requireNonNull(encryptionKeyVersion, "expected parameter 'encryptionKeyVersion' to be non-null");
        this.keyVaultResourceId = Objects.requireNonNull(keyVaultResourceId, "expected parameter 'keyVaultResourceId' to be non-null");
    }

    private KeyVaultMetaInfoArgs() {
        this.encryptionKeyName = Input.empty();
        this.encryptionKeyVersion = Input.empty();
        this.keyVaultResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultMetaInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> encryptionKeyName;
        private Input<String> encryptionKeyVersion;
        private Input<String> keyVaultResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultMetaInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKeyName = defaults.encryptionKeyName;
    	      this.encryptionKeyVersion = defaults.encryptionKeyVersion;
    	      this.keyVaultResourceId = defaults.keyVaultResourceId;
        }

        public Builder setEncryptionKeyName(Input<String> encryptionKeyName) {
            this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName);
            return this;
        }

        public Builder setEncryptionKeyName(String encryptionKeyName) {
            this.encryptionKeyName = Input.of(Objects.requireNonNull(encryptionKeyName));
            return this;
        }

        public Builder setEncryptionKeyVersion(Input<String> encryptionKeyVersion) {
            this.encryptionKeyVersion = Objects.requireNonNull(encryptionKeyVersion);
            return this;
        }

        public Builder setEncryptionKeyVersion(String encryptionKeyVersion) {
            this.encryptionKeyVersion = Input.of(Objects.requireNonNull(encryptionKeyVersion));
            return this;
        }

        public Builder setKeyVaultResourceId(Input<String> keyVaultResourceId) {
            this.keyVaultResourceId = Objects.requireNonNull(keyVaultResourceId);
            return this;
        }

        public Builder setKeyVaultResourceId(String keyVaultResourceId) {
            this.keyVaultResourceId = Input.of(Objects.requireNonNull(keyVaultResourceId));
            return this;
        }
        public KeyVaultMetaInfoArgs build() {
            return new KeyVaultMetaInfoArgs(encryptionKeyName, encryptionKeyVersion, keyVaultResourceId);
        }
    }
}
