// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Waf.outputs.GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimitingRule;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimiting {
    /**
     * @return Ordered list of ProtectionRules. Rules are executed in order of appearance in this array. ProtectionRules in this array can only use protection capabilities of RESPONSE_PROTECTION_CAPABILITY type.
     * 
     */
    private final List<GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimitingRule> rules;

    @CustomType.Constructor
    private GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimiting(@CustomType.Parameter("rules") List<GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimitingRule> rules) {
        this.rules = rules;
    }

    /**
     * @return Ordered list of ProtectionRules. Rules are executed in order of appearance in this array. ProtectionRules in this array can only use protection capabilities of RESPONSE_PROTECTION_CAPABILITY type.
     * 
     */
    public List<GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimitingRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimiting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimitingRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimiting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(List<GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimitingRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimitingRule... rules) {
            return rules(List.of(rules));
        }        public GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimiting build() {
            return new GetWebAppFirewallPoliciesWebAppFirewallPolicyCollectionItemRequestRateLimiting(rules);
        }
    }
}
