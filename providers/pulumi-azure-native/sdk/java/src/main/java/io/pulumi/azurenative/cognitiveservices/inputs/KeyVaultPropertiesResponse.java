// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties to configure keyVault Properties
 * 
 */
public final class KeyVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * Name of the Key from KeyVault
     * 
     */
    @InputImport(name="keyName")
      private final @Nullable String keyName;

    public Optional<String> getKeyName() {
        return this.keyName == null ? Optional.empty() : Optional.ofNullable(this.keyName);
    }

    /**
     * Uri of KeyVault
     * 
     */
    @InputImport(name="keyVaultUri")
      private final @Nullable String keyVaultUri;

    public Optional<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Optional.empty() : Optional.ofNullable(this.keyVaultUri);
    }

    /**
     * Version of the Key from KeyVault
     * 
     */
    @InputImport(name="keyVersion")
      private final @Nullable String keyVersion;

    public Optional<String> getKeyVersion() {
        return this.keyVersion == null ? Optional.empty() : Optional.ofNullable(this.keyVersion);
    }

    public KeyVaultPropertiesResponse(
        @Nullable String keyName,
        @Nullable String keyVaultUri,
        @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    private KeyVaultPropertiesResponse() {
        this.keyName = null;
        this.keyVaultUri = null;
        this.keyVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyVaultUri, keyVersion);
        }
    }
}
