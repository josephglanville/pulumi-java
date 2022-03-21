// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.KeyPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning key vault encryption for a configuration store.
 * 
 */
public final class KeyVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * Uri of KeyVault
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Identity of the secret that includes name and version.
     * 
     */
    @Import(name="key")
      private final @Nullable KeyPropertiesResponse key;

    public Optional<KeyPropertiesResponse> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    public KeyVaultPropertiesResponse(
        @Nullable String id,
        @Nullable KeyPropertiesResponse key) {
        this.id = id;
        this.key = key;
    }

    private KeyVaultPropertiesResponse() {
        this.id = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable KeyPropertiesResponse key;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder key(@Nullable KeyPropertiesResponse key) {
            this.key = key;
            return this;
        }        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(id, key);
        }
    }
}
