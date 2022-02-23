// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SourceVaultArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to unwrap the encryptionKey
 * 
 */
public final class KeyVaultAndKeyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultAndKeyReferenceArgs Empty = new KeyVaultAndKeyReferenceArgs();

    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    @InputImport(name="keyUrl", required=true)
      private final Input<String> keyUrl;

    public Input<String> getKeyUrl() {
        return this.keyUrl;
    }

    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    @InputImport(name="sourceVault", required=true)
      private final Input<SourceVaultArgs> sourceVault;

    public Input<SourceVaultArgs> getSourceVault() {
        return this.sourceVault;
    }

    public KeyVaultAndKeyReferenceArgs(
        Input<String> keyUrl,
        Input<SourceVaultArgs> sourceVault) {
        this.keyUrl = Objects.requireNonNull(keyUrl, "expected parameter 'keyUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultAndKeyReferenceArgs() {
        this.keyUrl = Input.empty();
        this.sourceVault = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultAndKeyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyUrl;
        private Input<SourceVaultArgs> sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultAndKeyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setKeyUrl(Input<String> keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }

        public Builder setKeyUrl(String keyUrl) {
            this.keyUrl = Input.of(Objects.requireNonNull(keyUrl));
            return this;
        }

        public Builder setSourceVault(Input<SourceVaultArgs> sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }

        public Builder setSourceVault(SourceVaultArgs sourceVault) {
            this.sourceVault = Input.of(Objects.requireNonNull(sourceVault));
            return this;
        }
        public KeyVaultAndKeyReferenceArgs build() {
            return new KeyVaultAndKeyReferenceArgs(keyUrl, sourceVault);
        }
    }
}
