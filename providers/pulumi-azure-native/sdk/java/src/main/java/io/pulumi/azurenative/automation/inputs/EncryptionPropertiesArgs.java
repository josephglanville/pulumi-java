// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.enums.EncryptionKeySourceType;
import io.pulumi.azurenative.automation.inputs.EncryptionPropertiesIdentityArgs;
import io.pulumi.azurenative.automation.inputs.KeyVaultPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionPropertiesArgs Empty = new EncryptionPropertiesArgs();

    @InputImport(name="identity")
    private final @Nullable Input<EncryptionPropertiesIdentityArgs> identity;

    public Input<EncryptionPropertiesIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="keySource")
    private final @Nullable Input<EncryptionKeySourceType> keySource;

    public Input<EncryptionKeySourceType> getKeySource() {
        return this.keySource == null ? Input.empty() : this.keySource;
    }

    @InputImport(name="keyVaultProperties")
    private final @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;

    public Input<KeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Input.empty() : this.keyVaultProperties;
    }

    public EncryptionPropertiesArgs(
        @Nullable Input<EncryptionPropertiesIdentityArgs> identity,
        @Nullable Input<EncryptionKeySourceType> keySource,
        @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties) {
        this.identity = identity;
        this.keySource = keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    private EncryptionPropertiesArgs() {
        this.identity = Input.empty();
        this.keySource = Input.empty();
        this.keyVaultProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EncryptionPropertiesIdentityArgs> identity;
        private @Nullable Input<EncryptionKeySourceType> keySource;
        private @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder setIdentity(@Nullable Input<EncryptionPropertiesIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable EncryptionPropertiesIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKeySource(@Nullable Input<EncryptionKeySourceType> keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder setKeySource(@Nullable EncryptionKeySourceType keySource) {
            this.keySource = Input.ofNullable(keySource);
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Input.ofNullable(keyVaultProperties);
            return this;
        }

        public EncryptionPropertiesArgs build() {
            return new EncryptionPropertiesArgs(identity, keySource, keyVaultProperties);
        }
    }
}
