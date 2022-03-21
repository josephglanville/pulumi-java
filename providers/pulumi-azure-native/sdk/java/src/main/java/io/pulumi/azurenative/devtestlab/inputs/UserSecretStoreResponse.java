// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a user's secret store.
 * 
 */
public final class UserSecretStoreResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserSecretStoreResponse Empty = new UserSecretStoreResponse();

    /**
     * The ID of the user's Key vault.
     * 
     */
    @Import(name="keyVaultId")
      private final @Nullable String keyVaultId;

    public Optional<String> getKeyVaultId() {
        return this.keyVaultId == null ? Optional.empty() : Optional.ofNullable(this.keyVaultId);
    }

    /**
     * The URI of the user's Key vault.
     * 
     */
    @Import(name="keyVaultUri")
      private final @Nullable String keyVaultUri;

    public Optional<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Optional.empty() : Optional.ofNullable(this.keyVaultUri);
    }

    public UserSecretStoreResponse(
        @Nullable String keyVaultId,
        @Nullable String keyVaultUri) {
        this.keyVaultId = keyVaultId;
        this.keyVaultUri = keyVaultUri;
    }

    private UserSecretStoreResponse() {
        this.keyVaultId = null;
        this.keyVaultUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSecretStoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultId;
        private @Nullable String keyVaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(UserSecretStoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
        }

        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }        public UserSecretStoreResponse build() {
            return new UserSecretStoreResponse(keyVaultId, keyVaultUri);
        }
    }
}
