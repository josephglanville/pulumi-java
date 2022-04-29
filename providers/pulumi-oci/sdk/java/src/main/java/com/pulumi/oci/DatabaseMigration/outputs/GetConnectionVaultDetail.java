// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionVaultDetail {
    /**
     * @return OCID of the compartment where the secret containing the credentials will be created.
     * 
     */
    private final String compartmentId;
    /**
     * @return OCID of the vault encryption key
     * 
     */
    private final String keyId;
    /**
     * @return OCID of the vault
     * 
     */
    private final String vaultId;

    @CustomType.Constructor
    private GetConnectionVaultDetail(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("keyId") String keyId,
        @CustomType.Parameter("vaultId") String vaultId) {
        this.compartmentId = compartmentId;
        this.keyId = keyId;
        this.vaultId = vaultId;
    }

    /**
     * @return OCID of the compartment where the secret containing the credentials will be created.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return OCID of the vault encryption key
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    /**
     * @return OCID of the vault
     * 
     */
    public String vaultId() {
        return this.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionVaultDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String keyId;
        private String vaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionVaultDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.keyId = defaults.keyId;
    	      this.vaultId = defaults.vaultId;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder vaultId(String vaultId) {
            this.vaultId = Objects.requireNonNull(vaultId);
            return this;
        }        public GetConnectionVaultDetail build() {
            return new GetConnectionVaultDetail(compartmentId, keyId, vaultId);
        }
    }
}
