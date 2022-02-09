// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.KeyType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionServiceArgs Empty = new EncryptionServiceArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="keyType")
    private final @Nullable Input<Either<String,KeyType>> keyType;

    public Input<Either<String,KeyType>> getKeyType() {
        return this.keyType == null ? Input.empty() : this.keyType;
    }

    public EncryptionServiceArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Either<String,KeyType>> keyType) {
        this.enabled = enabled;
        this.keyType = keyType;
    }

    private EncryptionServiceArgs() {
        this.enabled = Input.empty();
        this.keyType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Either<String,KeyType>> keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.keyType = defaults.keyType;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setKeyType(@Nullable Input<Either<String,KeyType>> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setKeyType(@Nullable Either<String,KeyType> keyType) {
            this.keyType = Input.ofNullable(keyType);
            return this;
        }

        public EncryptionServiceArgs build() {
            return new EncryptionServiceArgs(enabled, keyType);
        }
    }
}
