// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Waf.outputs.GetWebAppFirewallPolicyRequestAccessControlRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWebAppFirewallPolicyRequestAccessControl {
    /**
     * @return References an default Action to take if no AccessControlRule was matched. Allowed action types:
     * * **ALLOW** continues execution of other modules and their rules.
     * * **RETURN_HTTP_RESPONSE** terminates further execution of modules and rules and returns defined HTTP response.
     * 
     */
    private final String defaultActionName;
    /**
     * @return Ordered list of ProtectionRules. Rules are executed in order of appearance in this array. ProtectionRules in this array can only use protection capabilities of RESPONSE_PROTECTION_CAPABILITY type.
     * 
     */
    private final List<GetWebAppFirewallPolicyRequestAccessControlRule> rules;

    @CustomType.Constructor
    private GetWebAppFirewallPolicyRequestAccessControl(
        @CustomType.Parameter("defaultActionName") String defaultActionName,
        @CustomType.Parameter("rules") List<GetWebAppFirewallPolicyRequestAccessControlRule> rules) {
        this.defaultActionName = defaultActionName;
        this.rules = rules;
    }

    /**
     * @return References an default Action to take if no AccessControlRule was matched. Allowed action types:
     * * **ALLOW** continues execution of other modules and their rules.
     * * **RETURN_HTTP_RESPONSE** terminates further execution of modules and rules and returns defined HTTP response.
     * 
     */
    public String defaultActionName() {
        return this.defaultActionName;
    }
    /**
     * @return Ordered list of ProtectionRules. Rules are executed in order of appearance in this array. ProtectionRules in this array can only use protection capabilities of RESPONSE_PROTECTION_CAPABILITY type.
     * 
     */
    public List<GetWebAppFirewallPolicyRequestAccessControlRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppFirewallPolicyRequestAccessControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultActionName;
        private List<GetWebAppFirewallPolicyRequestAccessControlRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppFirewallPolicyRequestAccessControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultActionName = defaults.defaultActionName;
    	      this.rules = defaults.rules;
        }

        public Builder defaultActionName(String defaultActionName) {
            this.defaultActionName = Objects.requireNonNull(defaultActionName);
            return this;
        }
        public Builder rules(List<GetWebAppFirewallPolicyRequestAccessControlRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetWebAppFirewallPolicyRequestAccessControlRule... rules) {
            return rules(List.of(rules));
        }        public GetWebAppFirewallPolicyRequestAccessControl build() {
            return new GetWebAppFirewallPolicyRequestAccessControl(defaultActionName, rules);
        }
    }
}
