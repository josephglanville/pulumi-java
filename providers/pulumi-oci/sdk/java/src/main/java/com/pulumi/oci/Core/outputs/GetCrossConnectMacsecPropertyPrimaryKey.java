// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCrossConnectMacsecPropertyPrimaryKey {
    /**
     * @return Secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key (CAK) of this MACsec key.
     * 
     */
    private final String connectivityAssociationKeySecretId;
    /**
     * @return The secret version of the `connectivityAssociationKey` secret in Vault.
     * 
     */
    private final String connectivityAssociationKeySecretVersion;
    /**
     * @return Secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity association Key Name (CKN) of this MACsec key.
     * 
     */
    private final String connectivityAssociationNameSecretId;
    /**
     * @return The secret version of the connectivity association name secret in Vault.
     * 
     */
    private final String connectivityAssociationNameSecretVersion;

    @CustomType.Constructor
    private GetCrossConnectMacsecPropertyPrimaryKey(
        @CustomType.Parameter("connectivityAssociationKeySecretId") String connectivityAssociationKeySecretId,
        @CustomType.Parameter("connectivityAssociationKeySecretVersion") String connectivityAssociationKeySecretVersion,
        @CustomType.Parameter("connectivityAssociationNameSecretId") String connectivityAssociationNameSecretId,
        @CustomType.Parameter("connectivityAssociationNameSecretVersion") String connectivityAssociationNameSecretVersion) {
        this.connectivityAssociationKeySecretId = connectivityAssociationKeySecretId;
        this.connectivityAssociationKeySecretVersion = connectivityAssociationKeySecretVersion;
        this.connectivityAssociationNameSecretId = connectivityAssociationNameSecretId;
        this.connectivityAssociationNameSecretVersion = connectivityAssociationNameSecretVersion;
    }

    /**
     * @return Secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key (CAK) of this MACsec key.
     * 
     */
    public String connectivityAssociationKeySecretId() {
        return this.connectivityAssociationKeySecretId;
    }
    /**
     * @return The secret version of the `connectivityAssociationKey` secret in Vault.
     * 
     */
    public String connectivityAssociationKeySecretVersion() {
        return this.connectivityAssociationKeySecretVersion;
    }
    /**
     * @return Secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity association Key Name (CKN) of this MACsec key.
     * 
     */
    public String connectivityAssociationNameSecretId() {
        return this.connectivityAssociationNameSecretId;
    }
    /**
     * @return The secret version of the connectivity association name secret in Vault.
     * 
     */
    public String connectivityAssociationNameSecretVersion() {
        return this.connectivityAssociationNameSecretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCrossConnectMacsecPropertyPrimaryKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectivityAssociationKeySecretId;
        private String connectivityAssociationKeySecretVersion;
        private String connectivityAssociationNameSecretId;
        private String connectivityAssociationNameSecretVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCrossConnectMacsecPropertyPrimaryKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityAssociationKeySecretId = defaults.connectivityAssociationKeySecretId;
    	      this.connectivityAssociationKeySecretVersion = defaults.connectivityAssociationKeySecretVersion;
    	      this.connectivityAssociationNameSecretId = defaults.connectivityAssociationNameSecretId;
    	      this.connectivityAssociationNameSecretVersion = defaults.connectivityAssociationNameSecretVersion;
        }

        public Builder connectivityAssociationKeySecretId(String connectivityAssociationKeySecretId) {
            this.connectivityAssociationKeySecretId = Objects.requireNonNull(connectivityAssociationKeySecretId);
            return this;
        }
        public Builder connectivityAssociationKeySecretVersion(String connectivityAssociationKeySecretVersion) {
            this.connectivityAssociationKeySecretVersion = Objects.requireNonNull(connectivityAssociationKeySecretVersion);
            return this;
        }
        public Builder connectivityAssociationNameSecretId(String connectivityAssociationNameSecretId) {
            this.connectivityAssociationNameSecretId = Objects.requireNonNull(connectivityAssociationNameSecretId);
            return this;
        }
        public Builder connectivityAssociationNameSecretVersion(String connectivityAssociationNameSecretVersion) {
            this.connectivityAssociationNameSecretVersion = Objects.requireNonNull(connectivityAssociationNameSecretVersion);
            return this;
        }        public GetCrossConnectMacsecPropertyPrimaryKey build() {
            return new GetCrossConnectMacsecPropertyPrimaryKey(connectivityAssociationKeySecretId, connectivityAssociationKeySecretVersion, connectivityAssociationNameSecretId, connectivityAssociationNameSecretVersion);
        }
    }
}
