// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ManagedClusterPodIdentityExceptionResponse;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterPodIdentityResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedClusterPodIdentityProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterPodIdentityProfileResponse Empty = new ManagedClusterPodIdentityProfileResponse();

    @InputImport(name="allowNetworkPluginKubenet")
    private final @Nullable Boolean allowNetworkPluginKubenet;

    public Optional<Boolean> getAllowNetworkPluginKubenet() {
        return this.allowNetworkPluginKubenet == null ? Optional.empty() : Optional.ofNullable(this.allowNetworkPluginKubenet);
    }

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="userAssignedIdentities")
    private final @Nullable List<ManagedClusterPodIdentityResponse> userAssignedIdentities;

    public List<ManagedClusterPodIdentityResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? List.of() : this.userAssignedIdentities;
    }

    @InputImport(name="userAssignedIdentityExceptions")
    private final @Nullable List<ManagedClusterPodIdentityExceptionResponse> userAssignedIdentityExceptions;

    public List<ManagedClusterPodIdentityExceptionResponse> getUserAssignedIdentityExceptions() {
        return this.userAssignedIdentityExceptions == null ? List.of() : this.userAssignedIdentityExceptions;
    }

    public ManagedClusterPodIdentityProfileResponse(
        @Nullable Boolean allowNetworkPluginKubenet,
        @Nullable Boolean enabled,
        @Nullable List<ManagedClusterPodIdentityResponse> userAssignedIdentities,
        @Nullable List<ManagedClusterPodIdentityExceptionResponse> userAssignedIdentityExceptions) {
        this.allowNetworkPluginKubenet = allowNetworkPluginKubenet;
        this.enabled = enabled;
        this.userAssignedIdentities = userAssignedIdentities;
        this.userAssignedIdentityExceptions = userAssignedIdentityExceptions;
    }

    private ManagedClusterPodIdentityProfileResponse() {
        this.allowNetworkPluginKubenet = null;
        this.enabled = null;
        this.userAssignedIdentities = List.of();
        this.userAssignedIdentityExceptions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPodIdentityProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowNetworkPluginKubenet;
        private @Nullable Boolean enabled;
        private @Nullable List<ManagedClusterPodIdentityResponse> userAssignedIdentities;
        private @Nullable List<ManagedClusterPodIdentityExceptionResponse> userAssignedIdentityExceptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPodIdentityProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNetworkPluginKubenet = defaults.allowNetworkPluginKubenet;
    	      this.enabled = defaults.enabled;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
    	      this.userAssignedIdentityExceptions = defaults.userAssignedIdentityExceptions;
        }

        public Builder setAllowNetworkPluginKubenet(@Nullable Boolean allowNetworkPluginKubenet) {
            this.allowNetworkPluginKubenet = allowNetworkPluginKubenet;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable List<ManagedClusterPodIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentityExceptions(@Nullable List<ManagedClusterPodIdentityExceptionResponse> userAssignedIdentityExceptions) {
            this.userAssignedIdentityExceptions = userAssignedIdentityExceptions;
            return this;
        }

        public ManagedClusterPodIdentityProfileResponse build() {
            return new ManagedClusterPodIdentityProfileResponse(allowNetworkPluginKubenet, enabled, userAssignedIdentities, userAssignedIdentityExceptions);
        }
    }
}
