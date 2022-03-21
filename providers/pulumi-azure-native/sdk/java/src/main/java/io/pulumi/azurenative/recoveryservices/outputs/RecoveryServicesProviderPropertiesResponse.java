// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.outputs.IdentityProviderDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VersionDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecoveryServicesProviderPropertiesResponse {
    /**
     * The scenarios allowed on this provider.
     * 
     */
    private final @Nullable List<String> allowedScenarios;
    /**
     * The authentication identity details.
     * 
     */
    private final @Nullable IdentityProviderDetailsResponse authenticationIdentityDetails;
    /**
     * A value indicating whether DRA is responsive.
     * 
     */
    private final @Nullable String connectionStatus;
    /**
     * The DRA Id.
     * 
     */
    private final @Nullable String draIdentifier;
    /**
     * The fabric friendly name.
     * 
     */
    private final @Nullable String fabricFriendlyName;
    /**
     * Type of the site.
     * 
     */
    private final @Nullable String fabricType;
    /**
     * Friendly name of the DRA.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The recovery services provider health error details.
     * 
     */
    private final @Nullable List<HealthErrorResponse> healthErrorDetails;
    /**
     * Time when last heartbeat was sent by the DRA.
     * 
     */
    private final @Nullable String lastHeartBeat;
    /**
     * Number of protected VMs currently managed by the DRA.
     * 
     */
    private final @Nullable Integer protectedItemCount;
    /**
     * The provider version.
     * 
     */
    private final @Nullable String providerVersion;
    /**
     * The provider version details.
     * 
     */
    private final @Nullable VersionDetailsResponse providerVersionDetails;
    /**
     * Expiry date of the version.
     * 
     */
    private final @Nullable String providerVersionExpiryDate;
    /**
     * DRA version status.
     * 
     */
    private final @Nullable String providerVersionState;
    /**
     * The resource access identity details.
     * 
     */
    private final @Nullable IdentityProviderDetailsResponse resourceAccessIdentityDetails;
    /**
     * The fabric provider.
     * 
     */
    private final @Nullable String serverVersion;

    @CustomType.Constructor
    private RecoveryServicesProviderPropertiesResponse(
        @CustomType.Parameter("allowedScenarios") @Nullable List<String> allowedScenarios,
        @CustomType.Parameter("authenticationIdentityDetails") @Nullable IdentityProviderDetailsResponse authenticationIdentityDetails,
        @CustomType.Parameter("connectionStatus") @Nullable String connectionStatus,
        @CustomType.Parameter("draIdentifier") @Nullable String draIdentifier,
        @CustomType.Parameter("fabricFriendlyName") @Nullable String fabricFriendlyName,
        @CustomType.Parameter("fabricType") @Nullable String fabricType,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("healthErrorDetails") @Nullable List<HealthErrorResponse> healthErrorDetails,
        @CustomType.Parameter("lastHeartBeat") @Nullable String lastHeartBeat,
        @CustomType.Parameter("protectedItemCount") @Nullable Integer protectedItemCount,
        @CustomType.Parameter("providerVersion") @Nullable String providerVersion,
        @CustomType.Parameter("providerVersionDetails") @Nullable VersionDetailsResponse providerVersionDetails,
        @CustomType.Parameter("providerVersionExpiryDate") @Nullable String providerVersionExpiryDate,
        @CustomType.Parameter("providerVersionState") @Nullable String providerVersionState,
        @CustomType.Parameter("resourceAccessIdentityDetails") @Nullable IdentityProviderDetailsResponse resourceAccessIdentityDetails,
        @CustomType.Parameter("serverVersion") @Nullable String serverVersion) {
        this.allowedScenarios = allowedScenarios;
        this.authenticationIdentityDetails = authenticationIdentityDetails;
        this.connectionStatus = connectionStatus;
        this.draIdentifier = draIdentifier;
        this.fabricFriendlyName = fabricFriendlyName;
        this.fabricType = fabricType;
        this.friendlyName = friendlyName;
        this.healthErrorDetails = healthErrorDetails;
        this.lastHeartBeat = lastHeartBeat;
        this.protectedItemCount = protectedItemCount;
        this.providerVersion = providerVersion;
        this.providerVersionDetails = providerVersionDetails;
        this.providerVersionExpiryDate = providerVersionExpiryDate;
        this.providerVersionState = providerVersionState;
        this.resourceAccessIdentityDetails = resourceAccessIdentityDetails;
        this.serverVersion = serverVersion;
    }

    /**
     * The scenarios allowed on this provider.
     * 
    */
    public List<String> getAllowedScenarios() {
        return this.allowedScenarios == null ? List.of() : this.allowedScenarios;
    }
    /**
     * The authentication identity details.
     * 
    */
    public Optional<IdentityProviderDetailsResponse> getAuthenticationIdentityDetails() {
        return Optional.ofNullable(this.authenticationIdentityDetails);
    }
    /**
     * A value indicating whether DRA is responsive.
     * 
    */
    public Optional<String> getConnectionStatus() {
        return Optional.ofNullable(this.connectionStatus);
    }
    /**
     * The DRA Id.
     * 
    */
    public Optional<String> getDraIdentifier() {
        return Optional.ofNullable(this.draIdentifier);
    }
    /**
     * The fabric friendly name.
     * 
    */
    public Optional<String> getFabricFriendlyName() {
        return Optional.ofNullable(this.fabricFriendlyName);
    }
    /**
     * Type of the site.
     * 
    */
    public Optional<String> getFabricType() {
        return Optional.ofNullable(this.fabricType);
    }
    /**
     * Friendly name of the DRA.
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The recovery services provider health error details.
     * 
    */
    public List<HealthErrorResponse> getHealthErrorDetails() {
        return this.healthErrorDetails == null ? List.of() : this.healthErrorDetails;
    }
    /**
     * Time when last heartbeat was sent by the DRA.
     * 
    */
    public Optional<String> getLastHeartBeat() {
        return Optional.ofNullable(this.lastHeartBeat);
    }
    /**
     * Number of protected VMs currently managed by the DRA.
     * 
    */
    public Optional<Integer> getProtectedItemCount() {
        return Optional.ofNullable(this.protectedItemCount);
    }
    /**
     * The provider version.
     * 
    */
    public Optional<String> getProviderVersion() {
        return Optional.ofNullable(this.providerVersion);
    }
    /**
     * The provider version details.
     * 
    */
    public Optional<VersionDetailsResponse> getProviderVersionDetails() {
        return Optional.ofNullable(this.providerVersionDetails);
    }
    /**
     * Expiry date of the version.
     * 
    */
    public Optional<String> getProviderVersionExpiryDate() {
        return Optional.ofNullable(this.providerVersionExpiryDate);
    }
    /**
     * DRA version status.
     * 
    */
    public Optional<String> getProviderVersionState() {
        return Optional.ofNullable(this.providerVersionState);
    }
    /**
     * The resource access identity details.
     * 
    */
    public Optional<IdentityProviderDetailsResponse> getResourceAccessIdentityDetails() {
        return Optional.ofNullable(this.resourceAccessIdentityDetails);
    }
    /**
     * The fabric provider.
     * 
    */
    public Optional<String> getServerVersion() {
        return Optional.ofNullable(this.serverVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryServicesProviderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedScenarios;
        private @Nullable IdentityProviderDetailsResponse authenticationIdentityDetails;
        private @Nullable String connectionStatus;
        private @Nullable String draIdentifier;
        private @Nullable String fabricFriendlyName;
        private @Nullable String fabricType;
        private @Nullable String friendlyName;
        private @Nullable List<HealthErrorResponse> healthErrorDetails;
        private @Nullable String lastHeartBeat;
        private @Nullable Integer protectedItemCount;
        private @Nullable String providerVersion;
        private @Nullable VersionDetailsResponse providerVersionDetails;
        private @Nullable String providerVersionExpiryDate;
        private @Nullable String providerVersionState;
        private @Nullable IdentityProviderDetailsResponse resourceAccessIdentityDetails;
        private @Nullable String serverVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryServicesProviderPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedScenarios = defaults.allowedScenarios;
    	      this.authenticationIdentityDetails = defaults.authenticationIdentityDetails;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.draIdentifier = defaults.draIdentifier;
    	      this.fabricFriendlyName = defaults.fabricFriendlyName;
    	      this.fabricType = defaults.fabricType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthErrorDetails = defaults.healthErrorDetails;
    	      this.lastHeartBeat = defaults.lastHeartBeat;
    	      this.protectedItemCount = defaults.protectedItemCount;
    	      this.providerVersion = defaults.providerVersion;
    	      this.providerVersionDetails = defaults.providerVersionDetails;
    	      this.providerVersionExpiryDate = defaults.providerVersionExpiryDate;
    	      this.providerVersionState = defaults.providerVersionState;
    	      this.resourceAccessIdentityDetails = defaults.resourceAccessIdentityDetails;
    	      this.serverVersion = defaults.serverVersion;
        }

        public Builder allowedScenarios(@Nullable List<String> allowedScenarios) {
            this.allowedScenarios = allowedScenarios;
            return this;
        }
        public Builder allowedScenarios(String... allowedScenarios) {
            return allowedScenarios(List.of(allowedScenarios));
        }
        public Builder authenticationIdentityDetails(@Nullable IdentityProviderDetailsResponse authenticationIdentityDetails) {
            this.authenticationIdentityDetails = authenticationIdentityDetails;
            return this;
        }
        public Builder connectionStatus(@Nullable String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public Builder draIdentifier(@Nullable String draIdentifier) {
            this.draIdentifier = draIdentifier;
            return this;
        }
        public Builder fabricFriendlyName(@Nullable String fabricFriendlyName) {
            this.fabricFriendlyName = fabricFriendlyName;
            return this;
        }
        public Builder fabricType(@Nullable String fabricType) {
            this.fabricType = fabricType;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder healthErrorDetails(@Nullable List<HealthErrorResponse> healthErrorDetails) {
            this.healthErrorDetails = healthErrorDetails;
            return this;
        }
        public Builder healthErrorDetails(HealthErrorResponse... healthErrorDetails) {
            return healthErrorDetails(List.of(healthErrorDetails));
        }
        public Builder lastHeartBeat(@Nullable String lastHeartBeat) {
            this.lastHeartBeat = lastHeartBeat;
            return this;
        }
        public Builder protectedItemCount(@Nullable Integer protectedItemCount) {
            this.protectedItemCount = protectedItemCount;
            return this;
        }
        public Builder providerVersion(@Nullable String providerVersion) {
            this.providerVersion = providerVersion;
            return this;
        }
        public Builder providerVersionDetails(@Nullable VersionDetailsResponse providerVersionDetails) {
            this.providerVersionDetails = providerVersionDetails;
            return this;
        }
        public Builder providerVersionExpiryDate(@Nullable String providerVersionExpiryDate) {
            this.providerVersionExpiryDate = providerVersionExpiryDate;
            return this;
        }
        public Builder providerVersionState(@Nullable String providerVersionState) {
            this.providerVersionState = providerVersionState;
            return this;
        }
        public Builder resourceAccessIdentityDetails(@Nullable IdentityProviderDetailsResponse resourceAccessIdentityDetails) {
            this.resourceAccessIdentityDetails = resourceAccessIdentityDetails;
            return this;
        }
        public Builder serverVersion(@Nullable String serverVersion) {
            this.serverVersion = serverVersion;
            return this;
        }        public RecoveryServicesProviderPropertiesResponse build() {
            return new RecoveryServicesProviderPropertiesResponse(allowedScenarios, authenticationIdentityDetails, connectionStatus, draIdentifier, fabricFriendlyName, fabricType, friendlyName, healthErrorDetails, lastHeartBeat, protectedItemCount, providerVersion, providerVersionDetails, providerVersionExpiryDate, providerVersionState, resourceAccessIdentityDetails, serverVersion);
        }
    }
}
