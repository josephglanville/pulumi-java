// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.KeyVaultPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountEncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccountEncryptionResponse Empty = new AccountEncryptionResponse();

    @InputImport(name="keyVaultProperties")
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AccountEncryptionResponse(
        @Nullable KeyVaultPropertiesResponse keyVaultProperties,
        String type) {
        this.keyVaultProperties = keyVaultProperties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AccountEncryptionResponse() {
        this.keyVaultProperties = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.type = defaults.type;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AccountEncryptionResponse build() {
            return new AccountEncryptionResponse(keyVaultProperties, type);
        }
    }
}
