// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshPublicKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final SshPublicKeyResponse Empty = new SshPublicKeyResponse();

    /**
     * Optional. It is used to store the function/usage of the key
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Ssh public key base64 encoded. The format should be: '<keyType> <keyData>', e.g. ssh-rsa AAAABBBB
     * 
     */
    @Import(name="key")
      private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    public SshPublicKeyResponse(
        @Nullable String description,
        @Nullable String key) {
        this.description = description;
        this.key = key;
    }

    private SshPublicKeyResponse() {
        this.description = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }        public SshPublicKeyResponse build() {
            return new SshPublicKeyResponse(description, key);
        }
    }
}
