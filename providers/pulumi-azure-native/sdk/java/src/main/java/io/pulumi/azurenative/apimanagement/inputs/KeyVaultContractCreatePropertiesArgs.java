// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Create keyVault contract details.
 * 
 */
public final class KeyVaultContractCreatePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultContractCreatePropertiesArgs Empty = new KeyVaultContractCreatePropertiesArgs();

    /**
     * SystemAssignedIdentity or UserAssignedIdentity Client Id which will be used to access key vault secret.
     * 
     */
    @Import(name="identityClientId")
      private final @Nullable Output<String> identityClientId;

    public Output<String> getIdentityClientId() {
        return this.identityClientId == null ? Output.empty() : this.identityClientId;
    }

    /**
     * Key vault secret identifier for fetching secret. Providing a versioned secret will prevent auto-refresh. This requires Api Management service to be configured with aka.ms/apimmsi
     * 
     */
    @Import(name="secretIdentifier")
      private final @Nullable Output<String> secretIdentifier;

    public Output<String> getSecretIdentifier() {
        return this.secretIdentifier == null ? Output.empty() : this.secretIdentifier;
    }

    public KeyVaultContractCreatePropertiesArgs(
        @Nullable Output<String> identityClientId,
        @Nullable Output<String> secretIdentifier) {
        this.identityClientId = identityClientId;
        this.secretIdentifier = secretIdentifier;
    }

    private KeyVaultContractCreatePropertiesArgs() {
        this.identityClientId = Output.empty();
        this.secretIdentifier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultContractCreatePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> identityClientId;
        private @Nullable Output<String> secretIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultContractCreatePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.secretIdentifier = defaults.secretIdentifier;
        }

        public Builder identityClientId(@Nullable Output<String> identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }
        public Builder identityClientId(@Nullable String identityClientId) {
            this.identityClientId = Output.ofNullable(identityClientId);
            return this;
        }
        public Builder secretIdentifier(@Nullable Output<String> secretIdentifier) {
            this.secretIdentifier = secretIdentifier;
            return this;
        }
        public Builder secretIdentifier(@Nullable String secretIdentifier) {
            this.secretIdentifier = Output.ofNullable(secretIdentifier);
            return this;
        }        public KeyVaultContractCreatePropertiesArgs build() {
            return new KeyVaultContractCreatePropertiesArgs(identityClientId, secretIdentifier);
        }
    }
}
