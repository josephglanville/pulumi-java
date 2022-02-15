// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.KeyVaultAndKeyReferenceArgs;
import io.pulumi.azurenative.compute.inputs.KeyVaultAndSecretReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionSettingsElementArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionSettingsElementArgs Empty = new EncryptionSettingsElementArgs();

    @InputImport(name="diskEncryptionKey")
    private final @Nullable Input<KeyVaultAndSecretReferenceArgs> diskEncryptionKey;

    public Input<KeyVaultAndSecretReferenceArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Input.empty() : this.diskEncryptionKey;
    }

    @InputImport(name="keyEncryptionKey")
    private final @Nullable Input<KeyVaultAndKeyReferenceArgs> keyEncryptionKey;

    public Input<KeyVaultAndKeyReferenceArgs> getKeyEncryptionKey() {
        return this.keyEncryptionKey == null ? Input.empty() : this.keyEncryptionKey;
    }

    public EncryptionSettingsElementArgs(
        @Nullable Input<KeyVaultAndSecretReferenceArgs> diskEncryptionKey,
        @Nullable Input<KeyVaultAndKeyReferenceArgs> keyEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        this.keyEncryptionKey = keyEncryptionKey;
    }

    private EncryptionSettingsElementArgs() {
        this.diskEncryptionKey = Input.empty();
        this.keyEncryptionKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionSettingsElementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KeyVaultAndSecretReferenceArgs> diskEncryptionKey;
        private @Nullable Input<KeyVaultAndKeyReferenceArgs> keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionSettingsElementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder setDiskEncryptionKey(@Nullable Input<KeyVaultAndSecretReferenceArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable KeyVaultAndSecretReferenceArgs diskEncryptionKey) {
            this.diskEncryptionKey = Input.ofNullable(diskEncryptionKey);
            return this;
        }

        public Builder setKeyEncryptionKey(@Nullable Input<KeyVaultAndKeyReferenceArgs> keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        public Builder setKeyEncryptionKey(@Nullable KeyVaultAndKeyReferenceArgs keyEncryptionKey) {
            this.keyEncryptionKey = Input.ofNullable(keyEncryptionKey);
            return this;
        }

        public EncryptionSettingsElementArgs build() {
            return new EncryptionSettingsElementArgs(diskEncryptionKey, keyEncryptionKey);
        }
    }
}