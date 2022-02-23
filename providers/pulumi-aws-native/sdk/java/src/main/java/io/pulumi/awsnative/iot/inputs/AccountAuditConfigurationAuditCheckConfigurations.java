// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.AccountAuditConfigurationAuditCheckConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies which audit checks are enabled and disabled for this account.
 * 
 */
public final class AccountAuditConfigurationAuditCheckConfigurations extends io.pulumi.resources.InvokeArgs {

    public static final AccountAuditConfigurationAuditCheckConfigurations Empty = new AccountAuditConfigurationAuditCheckConfigurations();

    @InputImport(name="authenticatedCognitoRoleOverlyPermissiveCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration authenticatedCognitoRoleOverlyPermissiveCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getAuthenticatedCognitoRoleOverlyPermissiveCheck() {
        return this.authenticatedCognitoRoleOverlyPermissiveCheck == null ? Optional.empty() : Optional.ofNullable(this.authenticatedCognitoRoleOverlyPermissiveCheck);
    }

    @InputImport(name="caCertificateExpiringCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration caCertificateExpiringCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getCaCertificateExpiringCheck() {
        return this.caCertificateExpiringCheck == null ? Optional.empty() : Optional.ofNullable(this.caCertificateExpiringCheck);
    }

    @InputImport(name="caCertificateKeyQualityCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration caCertificateKeyQualityCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getCaCertificateKeyQualityCheck() {
        return this.caCertificateKeyQualityCheck == null ? Optional.empty() : Optional.ofNullable(this.caCertificateKeyQualityCheck);
    }

    @InputImport(name="conflictingClientIdsCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration conflictingClientIdsCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getConflictingClientIdsCheck() {
        return this.conflictingClientIdsCheck == null ? Optional.empty() : Optional.ofNullable(this.conflictingClientIdsCheck);
    }

    @InputImport(name="deviceCertificateExpiringCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateExpiringCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getDeviceCertificateExpiringCheck() {
        return this.deviceCertificateExpiringCheck == null ? Optional.empty() : Optional.ofNullable(this.deviceCertificateExpiringCheck);
    }

    @InputImport(name="deviceCertificateKeyQualityCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateKeyQualityCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getDeviceCertificateKeyQualityCheck() {
        return this.deviceCertificateKeyQualityCheck == null ? Optional.empty() : Optional.ofNullable(this.deviceCertificateKeyQualityCheck);
    }

    @InputImport(name="deviceCertificateSharedCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateSharedCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getDeviceCertificateSharedCheck() {
        return this.deviceCertificateSharedCheck == null ? Optional.empty() : Optional.ofNullable(this.deviceCertificateSharedCheck);
    }

    @InputImport(name="iotPolicyOverlyPermissiveCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration iotPolicyOverlyPermissiveCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getIotPolicyOverlyPermissiveCheck() {
        return this.iotPolicyOverlyPermissiveCheck == null ? Optional.empty() : Optional.ofNullable(this.iotPolicyOverlyPermissiveCheck);
    }

    @InputImport(name="iotRoleAliasAllowsAccessToUnusedServicesCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration iotRoleAliasAllowsAccessToUnusedServicesCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getIotRoleAliasAllowsAccessToUnusedServicesCheck() {
        return this.iotRoleAliasAllowsAccessToUnusedServicesCheck == null ? Optional.empty() : Optional.ofNullable(this.iotRoleAliasAllowsAccessToUnusedServicesCheck);
    }

    @InputImport(name="iotRoleAliasOverlyPermissiveCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration iotRoleAliasOverlyPermissiveCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getIotRoleAliasOverlyPermissiveCheck() {
        return this.iotRoleAliasOverlyPermissiveCheck == null ? Optional.empty() : Optional.ofNullable(this.iotRoleAliasOverlyPermissiveCheck);
    }

    @InputImport(name="loggingDisabledCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration loggingDisabledCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getLoggingDisabledCheck() {
        return this.loggingDisabledCheck == null ? Optional.empty() : Optional.ofNullable(this.loggingDisabledCheck);
    }

    @InputImport(name="revokedCaCertificateStillActiveCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration revokedCaCertificateStillActiveCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getRevokedCaCertificateStillActiveCheck() {
        return this.revokedCaCertificateStillActiveCheck == null ? Optional.empty() : Optional.ofNullable(this.revokedCaCertificateStillActiveCheck);
    }

    @InputImport(name="revokedDeviceCertificateStillActiveCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration revokedDeviceCertificateStillActiveCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getRevokedDeviceCertificateStillActiveCheck() {
        return this.revokedDeviceCertificateStillActiveCheck == null ? Optional.empty() : Optional.ofNullable(this.revokedDeviceCertificateStillActiveCheck);
    }

    @InputImport(name="unauthenticatedCognitoRoleOverlyPermissiveCheck")
      private final @Nullable AccountAuditConfigurationAuditCheckConfiguration unauthenticatedCognitoRoleOverlyPermissiveCheck;

    public Optional<AccountAuditConfigurationAuditCheckConfiguration> getUnauthenticatedCognitoRoleOverlyPermissiveCheck() {
        return this.unauthenticatedCognitoRoleOverlyPermissiveCheck == null ? Optional.empty() : Optional.ofNullable(this.unauthenticatedCognitoRoleOverlyPermissiveCheck);
    }

    public AccountAuditConfigurationAuditCheckConfigurations(
        @Nullable AccountAuditConfigurationAuditCheckConfiguration authenticatedCognitoRoleOverlyPermissiveCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration caCertificateExpiringCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration caCertificateKeyQualityCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration conflictingClientIdsCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateExpiringCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateKeyQualityCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateSharedCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration iotPolicyOverlyPermissiveCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration iotRoleAliasAllowsAccessToUnusedServicesCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration iotRoleAliasOverlyPermissiveCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration loggingDisabledCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration revokedCaCertificateStillActiveCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration revokedDeviceCertificateStillActiveCheck,
        @Nullable AccountAuditConfigurationAuditCheckConfiguration unauthenticatedCognitoRoleOverlyPermissiveCheck) {
        this.authenticatedCognitoRoleOverlyPermissiveCheck = authenticatedCognitoRoleOverlyPermissiveCheck;
        this.caCertificateExpiringCheck = caCertificateExpiringCheck;
        this.caCertificateKeyQualityCheck = caCertificateKeyQualityCheck;
        this.conflictingClientIdsCheck = conflictingClientIdsCheck;
        this.deviceCertificateExpiringCheck = deviceCertificateExpiringCheck;
        this.deviceCertificateKeyQualityCheck = deviceCertificateKeyQualityCheck;
        this.deviceCertificateSharedCheck = deviceCertificateSharedCheck;
        this.iotPolicyOverlyPermissiveCheck = iotPolicyOverlyPermissiveCheck;
        this.iotRoleAliasAllowsAccessToUnusedServicesCheck = iotRoleAliasAllowsAccessToUnusedServicesCheck;
        this.iotRoleAliasOverlyPermissiveCheck = iotRoleAliasOverlyPermissiveCheck;
        this.loggingDisabledCheck = loggingDisabledCheck;
        this.revokedCaCertificateStillActiveCheck = revokedCaCertificateStillActiveCheck;
        this.revokedDeviceCertificateStillActiveCheck = revokedDeviceCertificateStillActiveCheck;
        this.unauthenticatedCognitoRoleOverlyPermissiveCheck = unauthenticatedCognitoRoleOverlyPermissiveCheck;
    }

    private AccountAuditConfigurationAuditCheckConfigurations() {
        this.authenticatedCognitoRoleOverlyPermissiveCheck = null;
        this.caCertificateExpiringCheck = null;
        this.caCertificateKeyQualityCheck = null;
        this.conflictingClientIdsCheck = null;
        this.deviceCertificateExpiringCheck = null;
        this.deviceCertificateKeyQualityCheck = null;
        this.deviceCertificateSharedCheck = null;
        this.iotPolicyOverlyPermissiveCheck = null;
        this.iotRoleAliasAllowsAccessToUnusedServicesCheck = null;
        this.iotRoleAliasOverlyPermissiveCheck = null;
        this.loggingDisabledCheck = null;
        this.revokedCaCertificateStillActiveCheck = null;
        this.revokedDeviceCertificateStillActiveCheck = null;
        this.unauthenticatedCognitoRoleOverlyPermissiveCheck = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationAuditCheckConfigurations defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration authenticatedCognitoRoleOverlyPermissiveCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration caCertificateExpiringCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration caCertificateKeyQualityCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration conflictingClientIdsCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateExpiringCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateKeyQualityCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateSharedCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration iotPolicyOverlyPermissiveCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration iotRoleAliasAllowsAccessToUnusedServicesCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration iotRoleAliasOverlyPermissiveCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration loggingDisabledCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration revokedCaCertificateStillActiveCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration revokedDeviceCertificateStillActiveCheck;
        private @Nullable AccountAuditConfigurationAuditCheckConfiguration unauthenticatedCognitoRoleOverlyPermissiveCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationAuditCheckConfigurations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticatedCognitoRoleOverlyPermissiveCheck = defaults.authenticatedCognitoRoleOverlyPermissiveCheck;
    	      this.caCertificateExpiringCheck = defaults.caCertificateExpiringCheck;
    	      this.caCertificateKeyQualityCheck = defaults.caCertificateKeyQualityCheck;
    	      this.conflictingClientIdsCheck = defaults.conflictingClientIdsCheck;
    	      this.deviceCertificateExpiringCheck = defaults.deviceCertificateExpiringCheck;
    	      this.deviceCertificateKeyQualityCheck = defaults.deviceCertificateKeyQualityCheck;
    	      this.deviceCertificateSharedCheck = defaults.deviceCertificateSharedCheck;
    	      this.iotPolicyOverlyPermissiveCheck = defaults.iotPolicyOverlyPermissiveCheck;
    	      this.iotRoleAliasAllowsAccessToUnusedServicesCheck = defaults.iotRoleAliasAllowsAccessToUnusedServicesCheck;
    	      this.iotRoleAliasOverlyPermissiveCheck = defaults.iotRoleAliasOverlyPermissiveCheck;
    	      this.loggingDisabledCheck = defaults.loggingDisabledCheck;
    	      this.revokedCaCertificateStillActiveCheck = defaults.revokedCaCertificateStillActiveCheck;
    	      this.revokedDeviceCertificateStillActiveCheck = defaults.revokedDeviceCertificateStillActiveCheck;
    	      this.unauthenticatedCognitoRoleOverlyPermissiveCheck = defaults.unauthenticatedCognitoRoleOverlyPermissiveCheck;
        }

        public Builder setAuthenticatedCognitoRoleOverlyPermissiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration authenticatedCognitoRoleOverlyPermissiveCheck) {
            this.authenticatedCognitoRoleOverlyPermissiveCheck = authenticatedCognitoRoleOverlyPermissiveCheck;
            return this;
        }

        public Builder setCaCertificateExpiringCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration caCertificateExpiringCheck) {
            this.caCertificateExpiringCheck = caCertificateExpiringCheck;
            return this;
        }

        public Builder setCaCertificateKeyQualityCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration caCertificateKeyQualityCheck) {
            this.caCertificateKeyQualityCheck = caCertificateKeyQualityCheck;
            return this;
        }

        public Builder setConflictingClientIdsCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration conflictingClientIdsCheck) {
            this.conflictingClientIdsCheck = conflictingClientIdsCheck;
            return this;
        }

        public Builder setDeviceCertificateExpiringCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateExpiringCheck) {
            this.deviceCertificateExpiringCheck = deviceCertificateExpiringCheck;
            return this;
        }

        public Builder setDeviceCertificateKeyQualityCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateKeyQualityCheck) {
            this.deviceCertificateKeyQualityCheck = deviceCertificateKeyQualityCheck;
            return this;
        }

        public Builder setDeviceCertificateSharedCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration deviceCertificateSharedCheck) {
            this.deviceCertificateSharedCheck = deviceCertificateSharedCheck;
            return this;
        }

        public Builder setIotPolicyOverlyPermissiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration iotPolicyOverlyPermissiveCheck) {
            this.iotPolicyOverlyPermissiveCheck = iotPolicyOverlyPermissiveCheck;
            return this;
        }

        public Builder setIotRoleAliasAllowsAccessToUnusedServicesCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration iotRoleAliasAllowsAccessToUnusedServicesCheck) {
            this.iotRoleAliasAllowsAccessToUnusedServicesCheck = iotRoleAliasAllowsAccessToUnusedServicesCheck;
            return this;
        }

        public Builder setIotRoleAliasOverlyPermissiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration iotRoleAliasOverlyPermissiveCheck) {
            this.iotRoleAliasOverlyPermissiveCheck = iotRoleAliasOverlyPermissiveCheck;
            return this;
        }

        public Builder setLoggingDisabledCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration loggingDisabledCheck) {
            this.loggingDisabledCheck = loggingDisabledCheck;
            return this;
        }

        public Builder setRevokedCaCertificateStillActiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration revokedCaCertificateStillActiveCheck) {
            this.revokedCaCertificateStillActiveCheck = revokedCaCertificateStillActiveCheck;
            return this;
        }

        public Builder setRevokedDeviceCertificateStillActiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration revokedDeviceCertificateStillActiveCheck) {
            this.revokedDeviceCertificateStillActiveCheck = revokedDeviceCertificateStillActiveCheck;
            return this;
        }

        public Builder setUnauthenticatedCognitoRoleOverlyPermissiveCheck(@Nullable AccountAuditConfigurationAuditCheckConfiguration unauthenticatedCognitoRoleOverlyPermissiveCheck) {
            this.unauthenticatedCognitoRoleOverlyPermissiveCheck = unauthenticatedCognitoRoleOverlyPermissiveCheck;
            return this;
        }
        public AccountAuditConfigurationAuditCheckConfigurations build() {
            return new AccountAuditConfigurationAuditCheckConfigurations(authenticatedCognitoRoleOverlyPermissiveCheck, caCertificateExpiringCheck, caCertificateKeyQualityCheck, conflictingClientIdsCheck, deviceCertificateExpiringCheck, deviceCertificateKeyQualityCheck, deviceCertificateSharedCheck, iotPolicyOverlyPermissiveCheck, iotRoleAliasAllowsAccessToUnusedServicesCheck, iotRoleAliasOverlyPermissiveCheck, loggingDisabledCheck, revokedCaCertificateStillActiveCheck, revokedDeviceCertificateStillActiveCheck, unauthenticatedCognitoRoleOverlyPermissiveCheck);
        }
    }
}
