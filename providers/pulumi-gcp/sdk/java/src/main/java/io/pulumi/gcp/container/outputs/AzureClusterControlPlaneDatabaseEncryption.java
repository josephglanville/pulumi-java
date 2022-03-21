// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureClusterControlPlaneDatabaseEncryption {
    /**
     * The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/<subscription-id>/resourceGroups/<resource-group-id>/providers/Microsoft.KeyVault/vaults/<key-vault-id>/keys/<key-name>` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
     */
    private final String keyId;

    @CustomType.Constructor
    private AzureClusterControlPlaneDatabaseEncryption(@CustomType.Parameter("keyId") String keyId) {
        this.keyId = keyId;
    }

    /**
     * The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/<subscription-id>/resourceGroups/<resource-group-id>/providers/Microsoft.KeyVault/vaults/<key-vault-id>/keys/<key-name>` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
    */
    public String getKeyId() {
        return this.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneDatabaseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }        public AzureClusterControlPlaneDatabaseEncryption build() {
            return new AzureClusterControlPlaneDatabaseEncryption(keyId);
        }
    }
}
