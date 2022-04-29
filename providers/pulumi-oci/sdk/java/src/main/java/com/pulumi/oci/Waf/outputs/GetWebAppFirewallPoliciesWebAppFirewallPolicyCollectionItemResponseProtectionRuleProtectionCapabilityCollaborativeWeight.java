// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemResponseProtectionRuleProtectionCapabilityCollaborativeWeight {
    /**
     * @return Unique key of referenced protection capability.
     * 
     */
    private final String key;
    /**
     * @return The value of weight to set.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemResponseProtectionRuleProtectionCapabilityCollaborativeWeight(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("weight") Integer weight) {
        this.key = key;
        this.weight = weight;
    }

    /**
     * @return Unique key of referenced protection capability.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value of weight to set.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemResponseProtectionRuleProtectionCapabilityCollaborativeWeight defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemResponseProtectionRuleProtectionCapabilityCollaborativeWeight defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.weight = defaults.weight;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemResponseProtectionRuleProtectionCapabilityCollaborativeWeight build() {
            return new GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemResponseProtectionRuleProtectionCapabilityCollaborativeWeight(key, weight);
        }
    }
}
