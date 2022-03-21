// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.inputs.IdentityProviderDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VersionDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Recovery services provider properties.
 * 
 */
public final class RecoveryServicesProviderPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecoveryServicesProviderPropertiesResponse Empty = new RecoveryServicesProviderPropertiesResponse();

    /**
     * The scenarios allowed on this provider.
     * 
     */
    @Import(name="allowedScenarios")
      private final @Nullable List<String> allowedScenarios;

    public List<String> getAllowedScenarios() {
        return this.allowedScenarios == null ? List.of() : this.allowedScenarios;
    }

    /**
     * The authentication identity details.
     * 
     */
    @Import(name="authenticationIdentityDetails")
      private final @Nullable IdentityProviderDetailsResponse authenticationIdentityDetails;

    public Optional<IdentityProviderDetailsResponse> getAuthenticationIdentityDetails() {
        return this.authenticationIdentityDetails == null ? Optional.empty() : Optional.ofNullable(this.authenticationIdentityDetails);
    }

    /**
     * A value indicating whether DRA is responsive.
     * 
     */
    @Import(name="connectionStatus")
      private final @Nullable String connectionStatus;

    public Optional<String> getConnectionStatus() {
        return this.connectionStatus == null ? Optional.empty() : Optional.ofNullable(this.connectionStatus);
    }

    /**
     * The DRA Id.
     * 
     */
    @Import(name="draIdentifier")
      private final @Nullable String draIdentifier;

    public Optional<String> getDraIdentifier() {
        return this.draIdentifier == null ? Optional.empty() : Optional.ofNullable(this.draIdentifier);
    }

    /**
     * The fabric friendly name.
     * 
     */
    @Import(name="fabricFriendlyName")
      private final @Nullable String fabricFriendlyName;

    public Optional<String> getFabricFriendlyName() {
        return this.fabricFriendlyName == null ? Optional.empty() : Optional.ofNullable(this.fabricFriendlyName);
    }

    /**
     * Type of the site.
     * 
     */
    @Import(name="fabricType")
      private final @Nullable String fabricType;

    public Optional<String> getFabricType() {
        return this.fabricType == null ? Optional.empty() : Optional.ofNullable(this.fabricType);
    }

    /**
     * Friendly name of the DRA.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * The recovery services provider health error details.
     * 
     */
    @Import(name="healthErrorDetails")
      private final @Nullable List<HealthErrorResponse> healthErrorDetails;

    public List<HealthErrorResponse> getHealthErrorDetails() {
        return this.healthErrorDetails == null ? List.of() : this.healthErrorDetails;
    }

    /**
     * Time when last heartbeat was sent by the DRA.
     * 
     */
    @Import(name="lastHeartBeat")
      private final @Nullable String lastHeartBeat;

    public Optional<String> getLastHeartBeat() {
        return this.lastHeartBeat == null ? Optional.empty() : Optional.ofNullable(this.lastHeartBeat);
    }

    /**
     * Number of protected VMs currently managed by the DRA.
     * 
     */
    @Import(name="protectedItemCount")
      private final @Nullable Integer protectedItemCount;

    public Optional<Integer> getProtectedItemCount() {
        return this.protectedItemCount == null ? Optional.empty() : Optional.ofNullable(this.protectedItemCount);
    }

    /**
     * The provider version.
     * 
     */
    @Import(name="providerVersion")
      private final @Nullable String providerVersion;

    public Optional<String> getProviderVersion() {
        return this.providerVersion == null ? Optional.empty() : Optional.ofNullable(this.providerVersion);
    }

    /**
     * The provider version details.
     * 
     */
    @Import(name="providerVersionDetails")
      private final @Nullable VersionDetailsResponse providerVersionDetails;

    public Optional<VersionDetailsResponse> getProviderVersionDetails() {
        return this.providerVersionDetails == null ? Optional.empty() : Optional.ofNullable(this.providerVersionDetails);
    }

    /**
     * Expiry date of the version.
     * 
     */
    @Import(name="providerVersionExpiryDate")
      private final @Nullable String providerVersionExpiryDate;

    public Optional<String> getProviderVersionExpiryDate() {
        return this.providerVersionExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.providerVersionExpiryDate);
    }

    /**
     * DRA version status.
     * 
     */
    @Import(name="providerVersionState")
      private final @Nullable String providerVersionState;

    public Optional<String> getProviderVersionState() {
        return this.providerVersionState == null ? Optional.empty() : Optional.ofNullable(this.providerVersionState);
    }

    /**
     * The resource access identity details.
     * 
     */
    @Import(name="resourceAccessIdentityDetails")
      private final @Nullable IdentityProviderDetailsResponse resourceAccessIdentityDetails;

    public Optional<IdentityProviderDetailsResponse> getResourceAccessIdentityDetails() {
        return this.resourceAccessIdentityDetails == null ? Optional.empty() : Optional.ofNullable(this.resourceAccessIdentityDetails);
    }

    /**
     * The fabric provider.
     * 
     */
    @Import(name="serverVersion")
      private final @Nullable String serverVersion;

    public Optional<String> getServerVersion() {
        return this.serverVersion == null ? Optional.empty() : Optional.ofNullable(this.serverVersion);
    }

    public RecoveryServicesProviderPropertiesResponse(
        @Nullable List<String> allowedScenarios,
        @Nullable IdentityProviderDetailsResponse authenticationIdentityDetails,
        @Nullable String connectionStatus,
        @Nullable String draIdentifier,
        @Nullable String fabricFriendlyName,
        @Nullable String fabricType,
        @Nullable String friendlyName,
        @Nullable List<HealthErrorResponse> healthErrorDetails,
        @Nullable String lastHeartBeat,
        @Nullable Integer protectedItemCount,
        @Nullable String providerVersion,
        @Nullable VersionDetailsResponse providerVersionDetails,
        @Nullable String providerVersionExpiryDate,
        @Nullable String providerVersionState,
        @Nullable IdentityProviderDetailsResponse resourceAccessIdentityDetails,
        @Nullable String serverVersion) {
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

    private RecoveryServicesProviderPropertiesResponse() {
        this.allowedScenarios = List.of();
        this.authenticationIdentityDetails = null;
        this.connectionStatus = null;
        this.draIdentifier = null;
        this.fabricFriendlyName = null;
        this.fabricType = null;
        this.friendlyName = null;
        this.healthErrorDetails = List.of();
        this.lastHeartBeat = null;
        this.protectedItemCount = null;
        this.providerVersion = null;
        this.providerVersionDetails = null;
        this.providerVersionExpiryDate = null;
        this.providerVersionState = null;
        this.resourceAccessIdentityDetails = null;
        this.serverVersion = null;
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
