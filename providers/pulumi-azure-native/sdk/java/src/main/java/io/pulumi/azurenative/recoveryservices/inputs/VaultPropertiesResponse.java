// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.PrivateEndpointConnectionVaultPropertiesResponse;
import io.pulumi.azurenative.recoveryservices.inputs.UpgradeDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VaultPropertiesResponseEncryption;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the vault.
 * 
 */
public final class VaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VaultPropertiesResponse Empty = new VaultPropertiesResponse();

    /**
     * Customer Managed Key details of the resource.
     * 
     */
    @InputImport(name="encryption")
      private final @Nullable VaultPropertiesResponseEncryption encryption;

    public Optional<VaultPropertiesResponseEncryption> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    /**
     * List of private endpoint connection.
     * 
     */
    @InputImport(name="privateEndpointConnections", required=true)
      private final List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections;

    public List<PrivateEndpointConnectionVaultPropertiesResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Private endpoint state for backup.
     * 
     */
    @InputImport(name="privateEndpointStateForBackup", required=true)
      private final String privateEndpointStateForBackup;

    public String getPrivateEndpointStateForBackup() {
        return this.privateEndpointStateForBackup;
    }

    /**
     * Private endpoint state for site recovery.
     * 
     */
    @InputImport(name="privateEndpointStateForSiteRecovery", required=true)
      private final String privateEndpointStateForSiteRecovery;

    public String getPrivateEndpointStateForSiteRecovery() {
        return this.privateEndpointStateForSiteRecovery;
    }

    /**
     * Provisioning State.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Details for upgrading vault.
     * 
     */
    @InputImport(name="upgradeDetails")
      private final @Nullable UpgradeDetailsResponse upgradeDetails;

    public Optional<UpgradeDetailsResponse> getUpgradeDetails() {
        return this.upgradeDetails == null ? Optional.empty() : Optional.ofNullable(this.upgradeDetails);
    }

    public VaultPropertiesResponse(
        @Nullable VaultPropertiesResponseEncryption encryption,
        List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections,
        String privateEndpointStateForBackup,
        String privateEndpointStateForSiteRecovery,
        String provisioningState,
        @Nullable UpgradeDetailsResponse upgradeDetails) {
        this.encryption = encryption;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections, "expected parameter 'privateEndpointConnections' to be non-null");
        this.privateEndpointStateForBackup = Objects.requireNonNull(privateEndpointStateForBackup, "expected parameter 'privateEndpointStateForBackup' to be non-null");
        this.privateEndpointStateForSiteRecovery = Objects.requireNonNull(privateEndpointStateForSiteRecovery, "expected parameter 'privateEndpointStateForSiteRecovery' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.upgradeDetails = upgradeDetails;
    }

    private VaultPropertiesResponse() {
        this.encryption = null;
        this.privateEndpointConnections = List.of();
        this.privateEndpointStateForBackup = null;
        this.privateEndpointStateForSiteRecovery = null;
        this.provisioningState = null;
        this.upgradeDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VaultPropertiesResponseEncryption encryption;
        private List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections;
        private String privateEndpointStateForBackup;
        private String privateEndpointStateForSiteRecovery;
        private String provisioningState;
        private @Nullable UpgradeDetailsResponse upgradeDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.privateEndpointStateForBackup = defaults.privateEndpointStateForBackup;
    	      this.privateEndpointStateForSiteRecovery = defaults.privateEndpointStateForSiteRecovery;
    	      this.provisioningState = defaults.provisioningState;
    	      this.upgradeDetails = defaults.upgradeDetails;
        }

        public Builder setEncryption(@Nullable VaultPropertiesResponseEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setPrivateEndpointStateForBackup(String privateEndpointStateForBackup) {
            this.privateEndpointStateForBackup = Objects.requireNonNull(privateEndpointStateForBackup);
            return this;
        }

        public Builder setPrivateEndpointStateForSiteRecovery(String privateEndpointStateForSiteRecovery) {
            this.privateEndpointStateForSiteRecovery = Objects.requireNonNull(privateEndpointStateForSiteRecovery);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setUpgradeDetails(@Nullable UpgradeDetailsResponse upgradeDetails) {
            this.upgradeDetails = upgradeDetails;
            return this;
        }
        public VaultPropertiesResponse build() {
            return new VaultPropertiesResponse(encryption, privateEndpointConnections, privateEndpointStateForBackup, privateEndpointStateForSiteRecovery, provisioningState, upgradeDetails);
        }
    }
}
