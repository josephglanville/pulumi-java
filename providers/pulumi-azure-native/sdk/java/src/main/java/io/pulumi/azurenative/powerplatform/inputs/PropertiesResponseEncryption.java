// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.KeyVaultPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption settings for a configuration store.
 * 
 */
public final class PropertiesResponseEncryption extends io.pulumi.resources.InvokeArgs {

    public static final PropertiesResponseEncryption Empty = new PropertiesResponseEncryption();

    /**
     * Key vault properties.
     * 
     */
    @Import(name="keyVault")
      private final @Nullable KeyVaultPropertiesResponse keyVault;

    public Optional<KeyVaultPropertiesResponse> getKeyVault() {
        return this.keyVault == null ? Optional.empty() : Optional.ofNullable(this.keyVault);
    }

    /**
     * The state of onboarding, which only appears in the response.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public PropertiesResponseEncryption(
        @Nullable KeyVaultPropertiesResponse keyVault,
        @Nullable String state) {
        this.keyVault = keyVault;
        this.state = state;
    }

    private PropertiesResponseEncryption() {
        this.keyVault = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertiesResponseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultPropertiesResponse keyVault;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertiesResponseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVault = defaults.keyVault;
    	      this.state = defaults.state;
        }

        public Builder keyVault(@Nullable KeyVaultPropertiesResponse keyVault) {
            this.keyVault = keyVault;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public PropertiesResponseEncryption build() {
            return new PropertiesResponseEncryption(keyVault, state);
        }
    }
}
