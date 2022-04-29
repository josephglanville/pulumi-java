// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Waf.outputs.GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityCollaborativeWeight;
import com.pulumi.oci.Waf.outputs.GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityExclusion;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapability {
    /**
     * @return Override action to take if capability was triggered, defined in Protection Rule for this capability. Only actions of type CHECK are allowed.
     * 
     */
    private final String actionName;
    /**
     * @return The minimum sum of weights of associated collaborative protection capabilities that have triggered which must be reached in order for _this_ capability to trigger. This field is ignored for non-collaborative capabilities.
     * 
     */
    private final Integer collaborativeActionThreshold;
    /**
     * @return Explicit weight values to use for associated collaborative protection capabilities.
     * 
     */
    private final List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityCollaborativeWeight> collaborativeWeights;
    /**
     * @return Identifies specific HTTP message parameters to exclude from inspection by a protection capability.
     * 
     */
    private final List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityExclusion> exclusions;
    /**
     * @return Unique key of referenced protection capability.
     * 
     */
    private final String key;
    /**
     * @return Version of referenced protection capability.
     * 
     */
    private final Integer version;

    @CustomType.Constructor
    private GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapability(
        @CustomType.Parameter("actionName") String actionName,
        @CustomType.Parameter("collaborativeActionThreshold") Integer collaborativeActionThreshold,
        @CustomType.Parameter("collaborativeWeights") List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityCollaborativeWeight> collaborativeWeights,
        @CustomType.Parameter("exclusions") List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityExclusion> exclusions,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("version") Integer version) {
        this.actionName = actionName;
        this.collaborativeActionThreshold = collaborativeActionThreshold;
        this.collaborativeWeights = collaborativeWeights;
        this.exclusions = exclusions;
        this.key = key;
        this.version = version;
    }

    /**
     * @return Override action to take if capability was triggered, defined in Protection Rule for this capability. Only actions of type CHECK are allowed.
     * 
     */
    public String actionName() {
        return this.actionName;
    }
    /**
     * @return The minimum sum of weights of associated collaborative protection capabilities that have triggered which must be reached in order for _this_ capability to trigger. This field is ignored for non-collaborative capabilities.
     * 
     */
    public Integer collaborativeActionThreshold() {
        return this.collaborativeActionThreshold;
    }
    /**
     * @return Explicit weight values to use for associated collaborative protection capabilities.
     * 
     */
    public List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityCollaborativeWeight> collaborativeWeights() {
        return this.collaborativeWeights;
    }
    /**
     * @return Identifies specific HTTP message parameters to exclude from inspection by a protection capability.
     * 
     */
    public List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityExclusion> exclusions() {
        return this.exclusions;
    }
    /**
     * @return Unique key of referenced protection capability.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Version of referenced protection capability.
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapability defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionName;
        private Integer collaborativeActionThreshold;
        private List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityCollaborativeWeight> collaborativeWeights;
        private List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityExclusion> exclusions;
        private String key;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.collaborativeActionThreshold = defaults.collaborativeActionThreshold;
    	      this.collaborativeWeights = defaults.collaborativeWeights;
    	      this.exclusions = defaults.exclusions;
    	      this.key = defaults.key;
    	      this.version = defaults.version;
        }

        public Builder actionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public Builder collaborativeActionThreshold(Integer collaborativeActionThreshold) {
            this.collaborativeActionThreshold = Objects.requireNonNull(collaborativeActionThreshold);
            return this;
        }
        public Builder collaborativeWeights(List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityCollaborativeWeight> collaborativeWeights) {
            this.collaborativeWeights = Objects.requireNonNull(collaborativeWeights);
            return this;
        }
        public Builder collaborativeWeights(GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityCollaborativeWeight... collaborativeWeights) {
            return collaborativeWeights(List.of(collaborativeWeights));
        }
        public Builder exclusions(List<GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityExclusion> exclusions) {
            this.exclusions = Objects.requireNonNull(exclusions);
            return this;
        }
        public Builder exclusions(GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapabilityExclusion... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapability build() {
            return new GetWebAppFirewallPolicyResponseProtectionRuleProtectionCapability(actionName, collaborativeActionThreshold, collaborativeWeights, exclusions, key, version);
        }
    }
}
