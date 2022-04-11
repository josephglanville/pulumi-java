// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.KeyVaultKeyReferenceSourceVaultArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a reference to Key Vault Key.
 * 
 */
public final class KeyVaultKeyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultKeyReferenceArgs Empty = new KeyVaultKeyReferenceArgs();

    /**
     * The URL referencing a key encryption key in Key Vault.
     * 
     */
    @Import(name="keyUrl", required=true)
      private final Output<String> keyUrl;

    public Output<String> getKeyUrl() {
        return this.keyUrl;
    }

    /**
     * Describes a resource Id to source Key Vault.
     * 
     */
    @Import(name="sourceVault", required=true)
      private final Output<KeyVaultKeyReferenceSourceVaultArgs> sourceVault;

    public Output<KeyVaultKeyReferenceSourceVaultArgs> getSourceVault() {
        return this.sourceVault;
    }

    public KeyVaultKeyReferenceArgs(
        Output<String> keyUrl,
        Output<KeyVaultKeyReferenceSourceVaultArgs> sourceVault) {
        this.keyUrl = Objects.requireNonNull(keyUrl, "expected parameter 'keyUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultKeyReferenceArgs() {
        this.keyUrl = Codegen.empty();
        this.sourceVault = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyUrl;
        private Output<KeyVaultKeyReferenceSourceVaultArgs> sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder keyUrl(Output<String> keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }
        public Builder keyUrl(String keyUrl) {
            this.keyUrl = Output.of(Objects.requireNonNull(keyUrl));
            return this;
        }
        public Builder sourceVault(Output<KeyVaultKeyReferenceSourceVaultArgs> sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }
        public Builder sourceVault(KeyVaultKeyReferenceSourceVaultArgs sourceVault) {
            this.sourceVault = Output.of(Objects.requireNonNull(sourceVault));
            return this;
        }        public KeyVaultKeyReferenceArgs build() {
            return new KeyVaultKeyReferenceArgs(keyUrl, sourceVault);
        }
    }
}
