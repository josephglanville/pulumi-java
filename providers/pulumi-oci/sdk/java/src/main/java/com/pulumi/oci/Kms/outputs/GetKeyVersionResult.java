// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Kms.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Kms.outputs.GetKeyVersionReplicaDetail;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKeyVersionResult {
    /**
     * @return The OCID of the compartment that contains this key version.
     * 
     */
    private final String compartmentId;
    /**
     * @return The OCID of the key version.
     * 
     */
    private final String id;
    /**
     * @return A boolean that will be true when key version is primary, and will be false when key version is a replica from a primary key version.
     * 
     */
    private final Boolean isPrimary;
    /**
     * @return The OCID of the master encryption key associated with this key version.
     * 
     */
    private final String keyId;
    /**
     * @return The OCID of the key version.
     * 
     */
    private final String keyVersionId;
    private final String managementEndpoint;
    /**
     * @return The public key in PEM format. (This value pertains only to RSA and ECDSA keys.)
     * 
     */
    private final String publicKey;
    /**
     * @return KeyVersion replica details
     * 
     */
    private final List<GetKeyVersionReplicaDetail> replicaDetails;
    private final String restoredFromKeyId;
    /**
     * @return The OCID of the key version from which this key version was restored.
     * 
     */
    private final String restoredFromKeyVersionId;
    /**
     * @return The key version&#39;s current lifecycle state.  Example: `ENABLED`
     * 
     */
    private final String state;
    /**
     * @return The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: &#34;2018-04-03T21:10:29.600Z&#34;
     * 
     */
    private final String timeCreated;
    /**
     * @return An optional property to indicate when to delete the key version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    private final String timeOfDeletion;
    /**
     * @return The OCID of the vault that contains this key version.
     * 
     */
    private final String vaultId;

    @CustomType.Constructor
    private GetKeyVersionResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isPrimary") Boolean isPrimary,
        @CustomType.Parameter("keyId") String keyId,
        @CustomType.Parameter("keyVersionId") String keyVersionId,
        @CustomType.Parameter("managementEndpoint") String managementEndpoint,
        @CustomType.Parameter("publicKey") String publicKey,
        @CustomType.Parameter("replicaDetails") List<GetKeyVersionReplicaDetail> replicaDetails,
        @CustomType.Parameter("restoredFromKeyId") String restoredFromKeyId,
        @CustomType.Parameter("restoredFromKeyVersionId") String restoredFromKeyVersionId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeOfDeletion") String timeOfDeletion,
        @CustomType.Parameter("vaultId") String vaultId) {
        this.compartmentId = compartmentId;
        this.id = id;
        this.isPrimary = isPrimary;
        this.keyId = keyId;
        this.keyVersionId = keyVersionId;
        this.managementEndpoint = managementEndpoint;
        this.publicKey = publicKey;
        this.replicaDetails = replicaDetails;
        this.restoredFromKeyId = restoredFromKeyId;
        this.restoredFromKeyVersionId = restoredFromKeyVersionId;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeOfDeletion = timeOfDeletion;
        this.vaultId = vaultId;
    }

    /**
     * @return The OCID of the compartment that contains this key version.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The OCID of the key version.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A boolean that will be true when key version is primary, and will be false when key version is a replica from a primary key version.
     * 
     */
    public Boolean isPrimary() {
        return this.isPrimary;
    }
    /**
     * @return The OCID of the master encryption key associated with this key version.
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    /**
     * @return The OCID of the key version.
     * 
     */
    public String keyVersionId() {
        return this.keyVersionId;
    }
    public String managementEndpoint() {
        return this.managementEndpoint;
    }
    /**
     * @return The public key in PEM format. (This value pertains only to RSA and ECDSA keys.)
     * 
     */
    public String publicKey() {
        return this.publicKey;
    }
    /**
     * @return KeyVersion replica details
     * 
     */
    public List<GetKeyVersionReplicaDetail> replicaDetails() {
        return this.replicaDetails;
    }
    public String restoredFromKeyId() {
        return this.restoredFromKeyId;
    }
    /**
     * @return The OCID of the key version from which this key version was restored.
     * 
     */
    public String restoredFromKeyVersionId() {
        return this.restoredFromKeyVersionId;
    }
    /**
     * @return The key version&#39;s current lifecycle state.  Example: `ENABLED`
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: &#34;2018-04-03T21:10:29.600Z&#34;
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return An optional property to indicate when to delete the key version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public String timeOfDeletion() {
        return this.timeOfDeletion;
    }
    /**
     * @return The OCID of the vault that contains this key version.
     * 
     */
    public String vaultId() {
        return this.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String id;
        private Boolean isPrimary;
        private String keyId;
        private String keyVersionId;
        private String managementEndpoint;
        private String publicKey;
        private List<GetKeyVersionReplicaDetail> replicaDetails;
        private String restoredFromKeyId;
        private String restoredFromKeyVersionId;
        private String state;
        private String timeCreated;
        private String timeOfDeletion;
        private String vaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.id = defaults.id;
    	      this.isPrimary = defaults.isPrimary;
    	      this.keyId = defaults.keyId;
    	      this.keyVersionId = defaults.keyVersionId;
    	      this.managementEndpoint = defaults.managementEndpoint;
    	      this.publicKey = defaults.publicKey;
    	      this.replicaDetails = defaults.replicaDetails;
    	      this.restoredFromKeyId = defaults.restoredFromKeyId;
    	      this.restoredFromKeyVersionId = defaults.restoredFromKeyVersionId;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeOfDeletion = defaults.timeOfDeletion;
    	      this.vaultId = defaults.vaultId;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = Objects.requireNonNull(isPrimary);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = Objects.requireNonNull(keyVersionId);
            return this;
        }
        public Builder managementEndpoint(String managementEndpoint) {
            this.managementEndpoint = Objects.requireNonNull(managementEndpoint);
            return this;
        }
        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        public Builder replicaDetails(List<GetKeyVersionReplicaDetail> replicaDetails) {
            this.replicaDetails = Objects.requireNonNull(replicaDetails);
            return this;
        }
        public Builder replicaDetails(GetKeyVersionReplicaDetail... replicaDetails) {
            return replicaDetails(List.of(replicaDetails));
        }
        public Builder restoredFromKeyId(String restoredFromKeyId) {
            this.restoredFromKeyId = Objects.requireNonNull(restoredFromKeyId);
            return this;
        }
        public Builder restoredFromKeyVersionId(String restoredFromKeyVersionId) {
            this.restoredFromKeyVersionId = Objects.requireNonNull(restoredFromKeyVersionId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeOfDeletion(String timeOfDeletion) {
            this.timeOfDeletion = Objects.requireNonNull(timeOfDeletion);
            return this;
        }
        public Builder vaultId(String vaultId) {
            this.vaultId = Objects.requireNonNull(vaultId);
            return this;
        }        public GetKeyVersionResult build() {
            return new GetKeyVersionResult(compartmentId, id, isPrimary, keyId, keyVersionId, managementEndpoint, publicKey, replicaDetails, restoredFromKeyId, restoredFromKeyVersionId, state, timeCreated, timeOfDeletion, vaultId);
        }
    }
}
