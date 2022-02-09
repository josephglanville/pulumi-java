// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.CustomRuleListResponse;
import io.pulumi.azurenative.network.outputs.FrontDoorPolicySettingsResponse;
import io.pulumi.azurenative.network.outputs.FrontendEndpointLinkResponse;
import io.pulumi.azurenative.network.outputs.ManagedRuleSetListResponse;
import io.pulumi.azurenative.network.outputs.RoutingRuleLinkResponse;
import io.pulumi.azurenative.network.outputs.SecurityPolicyLinkResponse;
import io.pulumi.azurenative.network.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPolicyResult {
    private final @Nullable CustomRuleListResponse customRules;
    private final @Nullable String etag;
    private final List<FrontendEndpointLinkResponse> frontendEndpointLinks;
    private final String id;
    private final @Nullable String location;
    private final @Nullable ManagedRuleSetListResponse managedRules;
    private final String name;
    private final @Nullable FrontDoorPolicySettingsResponse policySettings;
    private final String provisioningState;
    private final String resourceState;
    private final List<RoutingRuleLinkResponse> routingRuleLinks;
    private final List<SecurityPolicyLinkResponse> securityPolicyLinks;
    private final @Nullable SkuResponse sku;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"customRules","etag","frontendEndpointLinks","id","location","managedRules","name","policySettings","provisioningState","resourceState","routingRuleLinks","securityPolicyLinks","sku","tags","type"})
    private GetPolicyResult(
        @Nullable CustomRuleListResponse customRules,
        @Nullable String etag,
        List<FrontendEndpointLinkResponse> frontendEndpointLinks,
        String id,
        @Nullable String location,
        @Nullable ManagedRuleSetListResponse managedRules,
        String name,
        @Nullable FrontDoorPolicySettingsResponse policySettings,
        String provisioningState,
        String resourceState,
        List<RoutingRuleLinkResponse> routingRuleLinks,
        List<SecurityPolicyLinkResponse> securityPolicyLinks,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type) {
        this.customRules = customRules;
        this.etag = etag;
        this.frontendEndpointLinks = Objects.requireNonNull(frontendEndpointLinks);
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.managedRules = managedRules;
        this.name = Objects.requireNonNull(name);
        this.policySettings = policySettings;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceState = Objects.requireNonNull(resourceState);
        this.routingRuleLinks = Objects.requireNonNull(routingRuleLinks);
        this.securityPolicyLinks = Objects.requireNonNull(securityPolicyLinks);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<CustomRuleListResponse> getCustomRules() {
        return Optional.ofNullable(this.customRules);
    }
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public List<FrontendEndpointLinkResponse> getFrontendEndpointLinks() {
        return this.frontendEndpointLinks;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<ManagedRuleSetListResponse> getManagedRules() {
        return Optional.ofNullable(this.managedRules);
    }
    public String getName() {
        return this.name;
    }
    public Optional<FrontDoorPolicySettingsResponse> getPolicySettings() {
        return Optional.ofNullable(this.policySettings);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getResourceState() {
        return this.resourceState;
    }
    public List<RoutingRuleLinkResponse> getRoutingRuleLinks() {
        return this.routingRuleLinks;
    }
    public List<SecurityPolicyLinkResponse> getSecurityPolicyLinks() {
        return this.securityPolicyLinks;
    }
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomRuleListResponse customRules;
        private @Nullable String etag;
        private List<FrontendEndpointLinkResponse> frontendEndpointLinks;
        private String id;
        private @Nullable String location;
        private @Nullable ManagedRuleSetListResponse managedRules;
        private String name;
        private @Nullable FrontDoorPolicySettingsResponse policySettings;
        private String provisioningState;
        private String resourceState;
        private List<RoutingRuleLinkResponse> routingRuleLinks;
        private List<SecurityPolicyLinkResponse> securityPolicyLinks;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRules = defaults.customRules;
    	      this.etag = defaults.etag;
    	      this.frontendEndpointLinks = defaults.frontendEndpointLinks;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managedRules = defaults.managedRules;
    	      this.name = defaults.name;
    	      this.policySettings = defaults.policySettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.routingRuleLinks = defaults.routingRuleLinks;
    	      this.securityPolicyLinks = defaults.securityPolicyLinks;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setCustomRules(@Nullable CustomRuleListResponse customRules) {
            this.customRules = customRules;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setFrontendEndpointLinks(List<FrontendEndpointLinkResponse> frontendEndpointLinks) {
            this.frontendEndpointLinks = Objects.requireNonNull(frontendEndpointLinks);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setManagedRules(@Nullable ManagedRuleSetListResponse managedRules) {
            this.managedRules = managedRules;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicySettings(@Nullable FrontDoorPolicySettingsResponse policySettings) {
            this.policySettings = policySettings;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setRoutingRuleLinks(List<RoutingRuleLinkResponse> routingRuleLinks) {
            this.routingRuleLinks = Objects.requireNonNull(routingRuleLinks);
            return this;
        }

        public Builder setSecurityPolicyLinks(List<SecurityPolicyLinkResponse> securityPolicyLinks) {
            this.securityPolicyLinks = Objects.requireNonNull(securityPolicyLinks);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetPolicyResult build() {
            return new GetPolicyResult(customRules, etag, frontendEndpointLinks, id, location, managedRules, name, policySettings, provisioningState, resourceState, routingRuleLinks, securityPolicyLinks, sku, tags, type);
        }
    }
}
