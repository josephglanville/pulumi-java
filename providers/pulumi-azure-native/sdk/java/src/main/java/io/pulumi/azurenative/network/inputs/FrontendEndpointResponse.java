// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.CustomHttpsConfigurationResponse;
import io.pulumi.azurenative.network.inputs.FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontendEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final FrontendEndpointResponse Empty = new FrontendEndpointResponse();

    @InputImport(name="customHttpsConfiguration", required=true)
    private final CustomHttpsConfigurationResponse customHttpsConfiguration;

    public CustomHttpsConfigurationResponse getCustomHttpsConfiguration() {
        return this.customHttpsConfiguration;
    }

    @InputImport(name="customHttpsProvisioningState", required=true)
    private final String customHttpsProvisioningState;

    public String getCustomHttpsProvisioningState() {
        return this.customHttpsProvisioningState;
    }

    @InputImport(name="customHttpsProvisioningSubstate", required=true)
    private final String customHttpsProvisioningSubstate;

    public String getCustomHttpsProvisioningSubstate() {
        return this.customHttpsProvisioningSubstate;
    }

    @InputImport(name="hostName")
    private final @Nullable String hostName;

    public Optional<String> getHostName() {
        return this.hostName == null ? Optional.empty() : Optional.ofNullable(this.hostName);
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="resourceState", required=true)
    private final String resourceState;

    public String getResourceState() {
        return this.resourceState;
    }

    @InputImport(name="sessionAffinityEnabledState")
    private final @Nullable String sessionAffinityEnabledState;

    public Optional<String> getSessionAffinityEnabledState() {
        return this.sessionAffinityEnabledState == null ? Optional.empty() : Optional.ofNullable(this.sessionAffinityEnabledState);
    }

    @InputImport(name="sessionAffinityTtlSeconds")
    private final @Nullable Integer sessionAffinityTtlSeconds;

    public Optional<Integer> getSessionAffinityTtlSeconds() {
        return this.sessionAffinityTtlSeconds == null ? Optional.empty() : Optional.ofNullable(this.sessionAffinityTtlSeconds);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="webApplicationFirewallPolicyLink")
    private final @Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

    public Optional<FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink> getWebApplicationFirewallPolicyLink() {
        return this.webApplicationFirewallPolicyLink == null ? Optional.empty() : Optional.ofNullable(this.webApplicationFirewallPolicyLink);
    }

    public FrontendEndpointResponse(
        CustomHttpsConfigurationResponse customHttpsConfiguration,
        String customHttpsProvisioningState,
        String customHttpsProvisioningSubstate,
        @Nullable String hostName,
        @Nullable String id,
        @Nullable String name,
        String resourceState,
        @Nullable String sessionAffinityEnabledState,
        @Nullable Integer sessionAffinityTtlSeconds,
        String type,
        @Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        this.customHttpsConfiguration = Objects.requireNonNull(customHttpsConfiguration, "expected parameter 'customHttpsConfiguration' to be non-null");
        this.customHttpsProvisioningState = Objects.requireNonNull(customHttpsProvisioningState, "expected parameter 'customHttpsProvisioningState' to be non-null");
        this.customHttpsProvisioningSubstate = Objects.requireNonNull(customHttpsProvisioningSubstate, "expected parameter 'customHttpsProvisioningSubstate' to be non-null");
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.resourceState = Objects.requireNonNull(resourceState, "expected parameter 'resourceState' to be non-null");
        this.sessionAffinityEnabledState = sessionAffinityEnabledState;
        this.sessionAffinityTtlSeconds = sessionAffinityTtlSeconds;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
    }

    private FrontendEndpointResponse() {
        this.customHttpsConfiguration = null;
        this.customHttpsProvisioningState = null;
        this.customHttpsProvisioningSubstate = null;
        this.hostName = null;
        this.id = null;
        this.name = null;
        this.resourceState = null;
        this.sessionAffinityEnabledState = null;
        this.sessionAffinityTtlSeconds = null;
        this.type = null;
        this.webApplicationFirewallPolicyLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontendEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHttpsConfigurationResponse customHttpsConfiguration;
        private String customHttpsProvisioningState;
        private String customHttpsProvisioningSubstate;
        private @Nullable String hostName;
        private @Nullable String id;
        private @Nullable String name;
        private String resourceState;
        private @Nullable String sessionAffinityEnabledState;
        private @Nullable Integer sessionAffinityTtlSeconds;
        private String type;
        private @Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontendEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHttpsConfiguration = defaults.customHttpsConfiguration;
    	      this.customHttpsProvisioningState = defaults.customHttpsProvisioningState;
    	      this.customHttpsProvisioningSubstate = defaults.customHttpsProvisioningSubstate;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.sessionAffinityEnabledState = defaults.sessionAffinityEnabledState;
    	      this.sessionAffinityTtlSeconds = defaults.sessionAffinityTtlSeconds;
    	      this.type = defaults.type;
    	      this.webApplicationFirewallPolicyLink = defaults.webApplicationFirewallPolicyLink;
        }

        public Builder setCustomHttpsConfiguration(CustomHttpsConfigurationResponse customHttpsConfiguration) {
            this.customHttpsConfiguration = Objects.requireNonNull(customHttpsConfiguration);
            return this;
        }

        public Builder setCustomHttpsProvisioningState(String customHttpsProvisioningState) {
            this.customHttpsProvisioningState = Objects.requireNonNull(customHttpsProvisioningState);
            return this;
        }

        public Builder setCustomHttpsProvisioningSubstate(String customHttpsProvisioningSubstate) {
            this.customHttpsProvisioningSubstate = Objects.requireNonNull(customHttpsProvisioningSubstate);
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setSessionAffinityEnabledState(@Nullable String sessionAffinityEnabledState) {
            this.sessionAffinityEnabledState = sessionAffinityEnabledState;
            return this;
        }

        public Builder setSessionAffinityTtlSeconds(@Nullable Integer sessionAffinityTtlSeconds) {
            this.sessionAffinityTtlSeconds = sessionAffinityTtlSeconds;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWebApplicationFirewallPolicyLink(@Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
            this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
            return this;
        }

        public FrontendEndpointResponse build() {
            return new FrontendEndpointResponse(customHttpsConfiguration, customHttpsProvisioningState, customHttpsProvisioningSubstate, hostName, id, name, resourceState, sessionAffinityEnabledState, sessionAffinityTtlSeconds, type, webApplicationFirewallPolicyLink);
        }
    }
}
