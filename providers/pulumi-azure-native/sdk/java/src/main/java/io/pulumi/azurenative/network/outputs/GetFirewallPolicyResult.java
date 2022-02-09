// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.DnsSettingsResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyInsightsResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyIntrusionDetectionResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicySNATResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicySkuResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyThreatIntelWhitelistResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyTransportSecurityResponse;
import io.pulumi.azurenative.network.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFirewallPolicyResult {
    private final @Nullable SubResourceResponse basePolicy;
    private final List<SubResourceResponse> childPolicies;
    private final @Nullable DnsSettingsResponse dnsSettings;
    private final String etag;
    private final List<SubResourceResponse> firewalls;
    private final @Nullable String id;
    private final @Nullable ManagedServiceIdentityResponse identity;
    private final @Nullable FirewallPolicyInsightsResponse insights;
    private final @Nullable FirewallPolicyIntrusionDetectionResponse intrusionDetection;
    private final @Nullable String location;
    private final String name;
    private final String provisioningState;
    private final List<SubResourceResponse> ruleCollectionGroups;
    private final @Nullable FirewallPolicySkuResponse sku;
    private final @Nullable FirewallPolicySNATResponse snat;
    private final @Nullable Map<String,String> tags;
    private final @Nullable String threatIntelMode;
    private final @Nullable FirewallPolicyThreatIntelWhitelistResponse threatIntelWhitelist;
    private final @Nullable FirewallPolicyTransportSecurityResponse transportSecurity;
    private final String type;

    @OutputCustomType.Constructor({"basePolicy","childPolicies","dnsSettings","etag","firewalls","id","identity","insights","intrusionDetection","location","name","provisioningState","ruleCollectionGroups","sku","snat","tags","threatIntelMode","threatIntelWhitelist","transportSecurity","type"})
    private GetFirewallPolicyResult(
        @Nullable SubResourceResponse basePolicy,
        List<SubResourceResponse> childPolicies,
        @Nullable DnsSettingsResponse dnsSettings,
        String etag,
        List<SubResourceResponse> firewalls,
        @Nullable String id,
        @Nullable ManagedServiceIdentityResponse identity,
        @Nullable FirewallPolicyInsightsResponse insights,
        @Nullable FirewallPolicyIntrusionDetectionResponse intrusionDetection,
        @Nullable String location,
        String name,
        String provisioningState,
        List<SubResourceResponse> ruleCollectionGroups,
        @Nullable FirewallPolicySkuResponse sku,
        @Nullable FirewallPolicySNATResponse snat,
        @Nullable Map<String,String> tags,
        @Nullable String threatIntelMode,
        @Nullable FirewallPolicyThreatIntelWhitelistResponse threatIntelWhitelist,
        @Nullable FirewallPolicyTransportSecurityResponse transportSecurity,
        String type) {
        this.basePolicy = basePolicy;
        this.childPolicies = Objects.requireNonNull(childPolicies);
        this.dnsSettings = dnsSettings;
        this.etag = Objects.requireNonNull(etag);
        this.firewalls = Objects.requireNonNull(firewalls);
        this.id = id;
        this.identity = identity;
        this.insights = insights;
        this.intrusionDetection = intrusionDetection;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.ruleCollectionGroups = Objects.requireNonNull(ruleCollectionGroups);
        this.sku = sku;
        this.snat = snat;
        this.tags = tags;
        this.threatIntelMode = threatIntelMode;
        this.threatIntelWhitelist = threatIntelWhitelist;
        this.transportSecurity = transportSecurity;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<SubResourceResponse> getBasePolicy() {
        return Optional.ofNullable(this.basePolicy);
    }
    public List<SubResourceResponse> getChildPolicies() {
        return this.childPolicies;
    }
    public Optional<DnsSettingsResponse> getDnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    public String getEtag() {
        return this.etag;
    }
    public List<SubResourceResponse> getFirewalls() {
        return this.firewalls;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public Optional<FirewallPolicyInsightsResponse> getInsights() {
        return Optional.ofNullable(this.insights);
    }
    public Optional<FirewallPolicyIntrusionDetectionResponse> getIntrusionDetection() {
        return Optional.ofNullable(this.intrusionDetection);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<SubResourceResponse> getRuleCollectionGroups() {
        return this.ruleCollectionGroups;
    }
    public Optional<FirewallPolicySkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Optional<FirewallPolicySNATResponse> getSnat() {
        return Optional.ofNullable(this.snat);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> getThreatIntelMode() {
        return Optional.ofNullable(this.threatIntelMode);
    }
    public Optional<FirewallPolicyThreatIntelWhitelistResponse> getThreatIntelWhitelist() {
        return Optional.ofNullable(this.threatIntelWhitelist);
    }
    public Optional<FirewallPolicyTransportSecurityResponse> getTransportSecurity() {
        return Optional.ofNullable(this.transportSecurity);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse basePolicy;
        private List<SubResourceResponse> childPolicies;
        private @Nullable DnsSettingsResponse dnsSettings;
        private String etag;
        private List<SubResourceResponse> firewalls;
        private @Nullable String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable FirewallPolicyInsightsResponse insights;
        private @Nullable FirewallPolicyIntrusionDetectionResponse intrusionDetection;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private List<SubResourceResponse> ruleCollectionGroups;
        private @Nullable FirewallPolicySkuResponse sku;
        private @Nullable FirewallPolicySNATResponse snat;
        private @Nullable Map<String,String> tags;
        private @Nullable String threatIntelMode;
        private @Nullable FirewallPolicyThreatIntelWhitelistResponse threatIntelWhitelist;
        private @Nullable FirewallPolicyTransportSecurityResponse transportSecurity;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePolicy = defaults.basePolicy;
    	      this.childPolicies = defaults.childPolicies;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.etag = defaults.etag;
    	      this.firewalls = defaults.firewalls;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.insights = defaults.insights;
    	      this.intrusionDetection = defaults.intrusionDetection;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.ruleCollectionGroups = defaults.ruleCollectionGroups;
    	      this.sku = defaults.sku;
    	      this.snat = defaults.snat;
    	      this.tags = defaults.tags;
    	      this.threatIntelMode = defaults.threatIntelMode;
    	      this.threatIntelWhitelist = defaults.threatIntelWhitelist;
    	      this.transportSecurity = defaults.transportSecurity;
    	      this.type = defaults.type;
        }

        public Builder setBasePolicy(@Nullable SubResourceResponse basePolicy) {
            this.basePolicy = basePolicy;
            return this;
        }

        public Builder setChildPolicies(List<SubResourceResponse> childPolicies) {
            this.childPolicies = Objects.requireNonNull(childPolicies);
            return this;
        }

        public Builder setDnsSettings(@Nullable DnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFirewalls(List<SubResourceResponse> firewalls) {
            this.firewalls = Objects.requireNonNull(firewalls);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInsights(@Nullable FirewallPolicyInsightsResponse insights) {
            this.insights = insights;
            return this;
        }

        public Builder setIntrusionDetection(@Nullable FirewallPolicyIntrusionDetectionResponse intrusionDetection) {
            this.intrusionDetection = intrusionDetection;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRuleCollectionGroups(List<SubResourceResponse> ruleCollectionGroups) {
            this.ruleCollectionGroups = Objects.requireNonNull(ruleCollectionGroups);
            return this;
        }

        public Builder setSku(@Nullable FirewallPolicySkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSnat(@Nullable FirewallPolicySNATResponse snat) {
            this.snat = snat;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setThreatIntelMode(@Nullable String threatIntelMode) {
            this.threatIntelMode = threatIntelMode;
            return this;
        }

        public Builder setThreatIntelWhitelist(@Nullable FirewallPolicyThreatIntelWhitelistResponse threatIntelWhitelist) {
            this.threatIntelWhitelist = threatIntelWhitelist;
            return this;
        }

        public Builder setTransportSecurity(@Nullable FirewallPolicyTransportSecurityResponse transportSecurity) {
            this.transportSecurity = transportSecurity;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetFirewallPolicyResult build() {
            return new GetFirewallPolicyResult(basePolicy, childPolicies, dnsSettings, etag, firewalls, id, identity, insights, intrusionDetection, location, name, provisioningState, ruleCollectionGroups, sku, snat, tags, threatIntelMode, threatIntelWhitelist, transportSecurity, type);
        }
    }
}
