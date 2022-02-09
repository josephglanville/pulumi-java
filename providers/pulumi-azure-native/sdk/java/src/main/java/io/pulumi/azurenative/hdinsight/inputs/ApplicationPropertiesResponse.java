// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.ApplicationGetEndpointResponse;
import io.pulumi.azurenative.hdinsight.inputs.ApplicationGetHttpsEndpointResponse;
import io.pulumi.azurenative.hdinsight.inputs.ComputeProfileResponse;
import io.pulumi.azurenative.hdinsight.inputs.ErrorsResponse;
import io.pulumi.azurenative.hdinsight.inputs.RuntimeScriptActionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationPropertiesResponse Empty = new ApplicationPropertiesResponse();

    @InputImport(name="applicationState", required=true)
    private final String applicationState;

    public String getApplicationState() {
        return this.applicationState;
    }

    @InputImport(name="applicationType")
    private final @Nullable String applicationType;

    public Optional<String> getApplicationType() {
        return this.applicationType == null ? Optional.empty() : Optional.ofNullable(this.applicationType);
    }

    @InputImport(name="computeProfile")
    private final @Nullable ComputeProfileResponse computeProfile;

    public Optional<ComputeProfileResponse> getComputeProfile() {
        return this.computeProfile == null ? Optional.empty() : Optional.ofNullable(this.computeProfile);
    }

    @InputImport(name="createdDate", required=true)
    private final String createdDate;

    public String getCreatedDate() {
        return this.createdDate;
    }

    @InputImport(name="errors")
    private final @Nullable List<ErrorsResponse> errors;

    public List<ErrorsResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }

    @InputImport(name="httpsEndpoints")
    private final @Nullable List<ApplicationGetHttpsEndpointResponse> httpsEndpoints;

    public List<ApplicationGetHttpsEndpointResponse> getHttpsEndpoints() {
        return this.httpsEndpoints == null ? List.of() : this.httpsEndpoints;
    }

    @InputImport(name="installScriptActions")
    private final @Nullable List<RuntimeScriptActionResponse> installScriptActions;

    public List<RuntimeScriptActionResponse> getInstallScriptActions() {
        return this.installScriptActions == null ? List.of() : this.installScriptActions;
    }

    @InputImport(name="marketplaceIdentifier", required=true)
    private final String marketplaceIdentifier;

    public String getMarketplaceIdentifier() {
        return this.marketplaceIdentifier;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="sshEndpoints")
    private final @Nullable List<ApplicationGetEndpointResponse> sshEndpoints;

    public List<ApplicationGetEndpointResponse> getSshEndpoints() {
        return this.sshEndpoints == null ? List.of() : this.sshEndpoints;
    }

    @InputImport(name="uninstallScriptActions")
    private final @Nullable List<RuntimeScriptActionResponse> uninstallScriptActions;

    public List<RuntimeScriptActionResponse> getUninstallScriptActions() {
        return this.uninstallScriptActions == null ? List.of() : this.uninstallScriptActions;
    }

    public ApplicationPropertiesResponse(
        String applicationState,
        @Nullable String applicationType,
        @Nullable ComputeProfileResponse computeProfile,
        String createdDate,
        @Nullable List<ErrorsResponse> errors,
        @Nullable List<ApplicationGetHttpsEndpointResponse> httpsEndpoints,
        @Nullable List<RuntimeScriptActionResponse> installScriptActions,
        String marketplaceIdentifier,
        String provisioningState,
        @Nullable List<ApplicationGetEndpointResponse> sshEndpoints,
        @Nullable List<RuntimeScriptActionResponse> uninstallScriptActions) {
        this.applicationState = Objects.requireNonNull(applicationState, "expected parameter 'applicationState' to be non-null");
        this.applicationType = applicationType;
        this.computeProfile = computeProfile;
        this.createdDate = Objects.requireNonNull(createdDate, "expected parameter 'createdDate' to be non-null");
        this.errors = errors;
        this.httpsEndpoints = httpsEndpoints;
        this.installScriptActions = installScriptActions;
        this.marketplaceIdentifier = Objects.requireNonNull(marketplaceIdentifier, "expected parameter 'marketplaceIdentifier' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.sshEndpoints = sshEndpoints;
        this.uninstallScriptActions = uninstallScriptActions;
    }

    private ApplicationPropertiesResponse() {
        this.applicationState = null;
        this.applicationType = null;
        this.computeProfile = null;
        this.createdDate = null;
        this.errors = List.of();
        this.httpsEndpoints = List.of();
        this.installScriptActions = List.of();
        this.marketplaceIdentifier = null;
        this.provisioningState = null;
        this.sshEndpoints = List.of();
        this.uninstallScriptActions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationState;
        private @Nullable String applicationType;
        private @Nullable ComputeProfileResponse computeProfile;
        private String createdDate;
        private @Nullable List<ErrorsResponse> errors;
        private @Nullable List<ApplicationGetHttpsEndpointResponse> httpsEndpoints;
        private @Nullable List<RuntimeScriptActionResponse> installScriptActions;
        private String marketplaceIdentifier;
        private String provisioningState;
        private @Nullable List<ApplicationGetEndpointResponse> sshEndpoints;
        private @Nullable List<RuntimeScriptActionResponse> uninstallScriptActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationState = defaults.applicationState;
    	      this.applicationType = defaults.applicationType;
    	      this.computeProfile = defaults.computeProfile;
    	      this.createdDate = defaults.createdDate;
    	      this.errors = defaults.errors;
    	      this.httpsEndpoints = defaults.httpsEndpoints;
    	      this.installScriptActions = defaults.installScriptActions;
    	      this.marketplaceIdentifier = defaults.marketplaceIdentifier;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sshEndpoints = defaults.sshEndpoints;
    	      this.uninstallScriptActions = defaults.uninstallScriptActions;
        }

        public Builder setApplicationState(String applicationState) {
            this.applicationState = Objects.requireNonNull(applicationState);
            return this;
        }

        public Builder setApplicationType(@Nullable String applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        public Builder setComputeProfile(@Nullable ComputeProfileResponse computeProfile) {
            this.computeProfile = computeProfile;
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setErrors(@Nullable List<ErrorsResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setHttpsEndpoints(@Nullable List<ApplicationGetHttpsEndpointResponse> httpsEndpoints) {
            this.httpsEndpoints = httpsEndpoints;
            return this;
        }

        public Builder setInstallScriptActions(@Nullable List<RuntimeScriptActionResponse> installScriptActions) {
            this.installScriptActions = installScriptActions;
            return this;
        }

        public Builder setMarketplaceIdentifier(String marketplaceIdentifier) {
            this.marketplaceIdentifier = Objects.requireNonNull(marketplaceIdentifier);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSshEndpoints(@Nullable List<ApplicationGetEndpointResponse> sshEndpoints) {
            this.sshEndpoints = sshEndpoints;
            return this;
        }

        public Builder setUninstallScriptActions(@Nullable List<RuntimeScriptActionResponse> uninstallScriptActions) {
            this.uninstallScriptActions = uninstallScriptActions;
            return this;
        }

        public ApplicationPropertiesResponse build() {
            return new ApplicationPropertiesResponse(applicationState, applicationType, computeProfile, createdDate, errors, httpsEndpoints, installScriptActions, marketplaceIdentifier, provisioningState, sshEndpoints, uninstallScriptActions);
        }
    }
}
