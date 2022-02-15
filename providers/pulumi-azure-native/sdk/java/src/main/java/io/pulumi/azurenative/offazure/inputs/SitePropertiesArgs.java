// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.inputs;

import io.pulumi.azurenative.offazure.inputs.SiteAgentPropertiesArgs;
import io.pulumi.azurenative.offazure.inputs.SiteSpnPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SitePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SitePropertiesArgs Empty = new SitePropertiesArgs();

    @InputImport(name="agentDetails")
    private final @Nullable Input<SiteAgentPropertiesArgs> agentDetails;

    public Input<SiteAgentPropertiesArgs> getAgentDetails() {
        return this.agentDetails == null ? Input.empty() : this.agentDetails;
    }

    @InputImport(name="applianceName")
    private final @Nullable Input<String> applianceName;

    public Input<String> getApplianceName() {
        return this.applianceName == null ? Input.empty() : this.applianceName;
    }

    @InputImport(name="discoverySolutionId")
    private final @Nullable Input<String> discoverySolutionId;

    public Input<String> getDiscoverySolutionId() {
        return this.discoverySolutionId == null ? Input.empty() : this.discoverySolutionId;
    }

    @InputImport(name="servicePrincipalIdentityDetails")
    private final @Nullable Input<SiteSpnPropertiesArgs> servicePrincipalIdentityDetails;

    public Input<SiteSpnPropertiesArgs> getServicePrincipalIdentityDetails() {
        return this.servicePrincipalIdentityDetails == null ? Input.empty() : this.servicePrincipalIdentityDetails;
    }

    public SitePropertiesArgs(
        @Nullable Input<SiteAgentPropertiesArgs> agentDetails,
        @Nullable Input<String> applianceName,
        @Nullable Input<String> discoverySolutionId,
        @Nullable Input<SiteSpnPropertiesArgs> servicePrincipalIdentityDetails) {
        this.agentDetails = agentDetails;
        this.applianceName = applianceName;
        this.discoverySolutionId = discoverySolutionId;
        this.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
    }

    private SitePropertiesArgs() {
        this.agentDetails = Input.empty();
        this.applianceName = Input.empty();
        this.discoverySolutionId = Input.empty();
        this.servicePrincipalIdentityDetails = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SitePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SiteAgentPropertiesArgs> agentDetails;
        private @Nullable Input<String> applianceName;
        private @Nullable Input<String> discoverySolutionId;
        private @Nullable Input<SiteSpnPropertiesArgs> servicePrincipalIdentityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(SitePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentDetails = defaults.agentDetails;
    	      this.applianceName = defaults.applianceName;
    	      this.discoverySolutionId = defaults.discoverySolutionId;
    	      this.servicePrincipalIdentityDetails = defaults.servicePrincipalIdentityDetails;
        }

        public Builder setAgentDetails(@Nullable Input<SiteAgentPropertiesArgs> agentDetails) {
            this.agentDetails = agentDetails;
            return this;
        }

        public Builder setAgentDetails(@Nullable SiteAgentPropertiesArgs agentDetails) {
            this.agentDetails = Input.ofNullable(agentDetails);
            return this;
        }

        public Builder setApplianceName(@Nullable Input<String> applianceName) {
            this.applianceName = applianceName;
            return this;
        }

        public Builder setApplianceName(@Nullable String applianceName) {
            this.applianceName = Input.ofNullable(applianceName);
            return this;
        }

        public Builder setDiscoverySolutionId(@Nullable Input<String> discoverySolutionId) {
            this.discoverySolutionId = discoverySolutionId;
            return this;
        }

        public Builder setDiscoverySolutionId(@Nullable String discoverySolutionId) {
            this.discoverySolutionId = Input.ofNullable(discoverySolutionId);
            return this;
        }

        public Builder setServicePrincipalIdentityDetails(@Nullable Input<SiteSpnPropertiesArgs> servicePrincipalIdentityDetails) {
            this.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
            return this;
        }

        public Builder setServicePrincipalIdentityDetails(@Nullable SiteSpnPropertiesArgs servicePrincipalIdentityDetails) {
            this.servicePrincipalIdentityDetails = Input.ofNullable(servicePrincipalIdentityDetails);
            return this;
        }

        public SitePropertiesArgs build() {
            return new SitePropertiesArgs(agentDetails, applianceName, discoverySolutionId, servicePrincipalIdentityDetails);
        }
    }
}