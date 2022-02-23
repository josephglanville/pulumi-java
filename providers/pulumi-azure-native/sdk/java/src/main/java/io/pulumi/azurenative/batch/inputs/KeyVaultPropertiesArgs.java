// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * KeyVault configuration when using an encryption KeySource of Microsoft.KeyVault.
 * 
 */
public final class KeyVaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * Full path to the versioned secret. Example https://mykeyvault.vault.azure.net/keys/testkey/6e34a81fef704045975661e297a4c053. To be usable the following prerequisites must be met:
     * 
     *  The Batch Account has a System Assigned identity
     *  The account identity has been granted Key/Get, Key/Unwrap and Key/Wrap permissions
     *  The KeyVault has soft-delete and purge protection enabled
     * 
     */
    @InputImport(name="keyIdentifier")
      private final @Nullable Input<String> keyIdentifier;

    public Input<String> getKeyIdentifier() {
        return this.keyIdentifier == null ? Input.empty() : this.keyIdentifier;
    }

    public KeyVaultPropertiesArgs(@Nullable Input<String> keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    private KeyVaultPropertiesArgs() {
        this.keyIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyIdentifier = defaults.keyIdentifier;
        }

        public Builder setKeyIdentifier(@Nullable Input<String> keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }

        public Builder setKeyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = Input.ofNullable(keyIdentifier);
            return this;
        }
        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(keyIdentifier);
        }
    }
}
