// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings concerning key vault encryption for a configuration store.
 * 
 */
public final class KeyVaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * The name of key used to encrypt data.
     * 
     */
    @InputImport(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName == null ? Output.empty() : this.keyName;
    }

    /**
     * The key version of the key used to encrypt data.
     * 
     */
    @InputImport(name="keyVersion")
      private final @Nullable Output<String> keyVersion;

    public Output<String> getKeyVersion() {
        return this.keyVersion == null ? Output.empty() : this.keyVersion;
    }

    /**
     * The URI of the key vault key used to encrypt data.
     * 
     */
    @InputImport(name="keyvaultUri")
      private final @Nullable Output<String> keyvaultUri;

    public Output<String> getKeyvaultUri() {
        return this.keyvaultUri == null ? Output.empty() : this.keyvaultUri;
    }

    public KeyVaultPropertiesArgs(
        @Nullable Output<String> keyName,
        @Nullable Output<String> keyVersion,
        @Nullable Output<String> keyvaultUri) {
        this.keyName = keyName;
        this.keyVersion = keyVersion;
        this.keyvaultUri = keyvaultUri;
    }

    private KeyVaultPropertiesArgs() {
        this.keyName = Output.empty();
        this.keyVersion = Output.empty();
        this.keyvaultUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyName;
        private @Nullable Output<String> keyVersion;
        private @Nullable Output<String> keyvaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.keyvaultUri = defaults.keyvaultUri;
        }

        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = Output.ofNullable(keyName);
            return this;
        }

        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = Output.ofNullable(keyVersion);
            return this;
        }

        public Builder keyvaultUri(@Nullable Output<String> keyvaultUri) {
            this.keyvaultUri = keyvaultUri;
            return this;
        }

        public Builder keyvaultUri(@Nullable String keyvaultUri) {
            this.keyvaultUri = Output.ofNullable(keyvaultUri);
            return this;
        }
        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(keyName, keyVersion, keyvaultUri);
        }
    }
}
