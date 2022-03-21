// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the parameters for using a user's KeyVault for URL Signing Key.
 * 
 */
public final class KeyVaultSigningKeyParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultSigningKeyParametersArgs Empty = new KeyVaultSigningKeyParametersArgs();

    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Resource group of the user's Key Vault containing the secret
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of secret in Key Vault.
     * 
     */
    @Import(name="secretName", required=true)
      private final Output<String> secretName;

    public Output<String> getSecretName() {
        return this.secretName;
    }

    /**
     * The version(GUID) of secret in Key Vault.
     * 
     */
    @Import(name="secretVersion", required=true)
      private final Output<String> secretVersion;

    public Output<String> getSecretVersion() {
        return this.secretVersion;
    }

    /**
     * Subscription Id of the user's Key Vault containing the secret
     * 
     */
    @Import(name="subscriptionId", required=true)
      private final Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name of the user's Key Vault containing the secret
     * 
     */
    @Import(name="vaultName", required=true)
      private final Output<String> vaultName;

    public Output<String> getVaultName() {
        return this.vaultName;
    }

    public KeyVaultSigningKeyParametersArgs(
        Output<String> odataType,
        Output<String> resourceGroupName,
        Output<String> secretName,
        Output<String> secretVersion,
        Output<String> subscriptionId,
        Output<String> vaultName) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
        this.secretVersion = Objects.requireNonNull(secretVersion, "expected parameter 'secretVersion' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private KeyVaultSigningKeyParametersArgs() {
        this.odataType = Output.empty();
        this.resourceGroupName = Output.empty();
        this.secretName = Output.empty();
        this.secretVersion = Output.empty();
        this.subscriptionId = Output.empty();
        this.vaultName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultSigningKeyParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;
        private Output<String> resourceGroupName;
        private Output<String> secretName;
        private Output<String> secretVersion;
        private Output<String> subscriptionId;
        private Output<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultSigningKeyParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder secretName(Output<String> secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Output.of(Objects.requireNonNull(secretName));
            return this;
        }
        public Builder secretVersion(Output<String> secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }
        public Builder secretVersion(String secretVersion) {
            this.secretVersion = Output.of(Objects.requireNonNull(secretVersion));
            return this;
        }
        public Builder subscriptionId(Output<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Output.of(Objects.requireNonNull(subscriptionId));
            return this;
        }
        public Builder vaultName(Output<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Output.of(Objects.requireNonNull(vaultName));
            return this;
        }        public KeyVaultSigningKeyParametersArgs build() {
            return new KeyVaultSigningKeyParametersArgs(odataType, resourceGroupName, secretName, secretVersion, subscriptionId, vaultName);
        }
    }
}
