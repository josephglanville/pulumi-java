// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.inputs;

import io.pulumi.azurenative.offazure.inputs.SiteAgentPropertiesResponse;
import io.pulumi.azurenative.offazure.inputs.SiteSpnPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SitePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SitePropertiesResponse Empty = new SitePropertiesResponse();

    @InputImport(name="agentDetails")
    private final @Nullable SiteAgentPropertiesResponse agentDetails;

    public Optional<SiteAgentPropertiesResponse> getAgentDetails() {
        return this.agentDetails == null ? Optional.empty() : Optional.ofNullable(this.agentDetails);
    }

    @InputImport(name="applianceName")
    private final @Nullable String applianceName;

    public Optional<String> getApplianceName() {
        return this.applianceName == null ? Optional.empty() : Optional.ofNullable(this.applianceName);
    }

    @InputImport(name="discoverySolutionId")
    private final @Nullable String discoverySolutionId;

    public Optional<String> getDiscoverySolutionId() {
        return this.discoverySolutionId == null ? Optional.empty() : Optional.ofNullable(this.discoverySolutionId);
    }

    @InputImport(name="serviceEndpoint", required=true)
    private final String serviceEndpoint;

    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    @InputImport(name="servicePrincipalIdentityDetails")
    private final @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails;

    public Optional<SiteSpnPropertiesResponse> getServicePrincipalIdentityDetails() {
        return this.servicePrincipalIdentityDetails == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalIdentityDetails);
    }

    public SitePropertiesResponse(
        @Nullable SiteAgentPropertiesResponse agentDetails,
        @Nullable String applianceName,
        @Nullable String discoverySolutionId,
        String serviceEndpoint,
        @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails) {
        this.agentDetails = agentDetails;
        this.applianceName = applianceName;
        this.discoverySolutionId = discoverySolutionId;
        this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint, "expected parameter 'serviceEndpoint' to be non-null");
        this.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
    }

    private SitePropertiesResponse() {
        this.agentDetails = null;
        this.applianceName = null;
        this.discoverySolutionId = null;
        this.serviceEndpoint = null;
        this.servicePrincipalIdentityDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SitePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SiteAgentPropertiesResponse agentDetails;
        private @Nullable String applianceName;
        private @Nullable String discoverySolutionId;
        private String serviceEndpoint;
        private @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(SitePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentDetails = defaults.agentDetails;
    	      this.applianceName = defaults.applianceName;
    	      this.discoverySolutionId = defaults.discoverySolutionId;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.servicePrincipalIdentityDetails = defaults.servicePrincipalIdentityDetails;
        }

        public Builder setAgentDetails(@Nullable SiteAgentPropertiesResponse agentDetails) {
            this.agentDetails = agentDetails;
            return this;
        }

        public Builder setApplianceName(@Nullable String applianceName) {
            this.applianceName = applianceName;
            return this;
        }

        public Builder setDiscoverySolutionId(@Nullable String discoverySolutionId) {
            this.discoverySolutionId = discoverySolutionId;
            return this;
        }

        public Builder setServiceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }

        public Builder setServicePrincipalIdentityDetails(@Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails) {
            this.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
            return this;
        }

        public SitePropertiesResponse build() {
            return new SitePropertiesResponse(agentDetails, applianceName, discoverySolutionId, serviceEndpoint, servicePrincipalIdentityDetails);
        }
    }
}
