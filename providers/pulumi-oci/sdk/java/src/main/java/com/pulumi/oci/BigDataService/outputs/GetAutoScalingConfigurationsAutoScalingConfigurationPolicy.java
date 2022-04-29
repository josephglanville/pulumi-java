// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.BigDataService.outputs.GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAutoScalingConfigurationsAutoScalingConfigurationPolicy {
    private final String policyType;
    private final List<GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRule> rules;

    @CustomType.Constructor
    private GetAutoScalingConfigurationsAutoScalingConfigurationPolicy(
        @CustomType.Parameter("policyType") String policyType,
        @CustomType.Parameter("rules") List<GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRule> rules) {
        this.policyType = policyType;
        this.rules = rules;
    }

    public String policyType() {
        return this.policyType;
    }
    public List<GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoScalingConfigurationsAutoScalingConfigurationPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyType;
        private List<GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoScalingConfigurationsAutoScalingConfigurationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyType = defaults.policyType;
    	      this.rules = defaults.rules;
        }

        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }
        public Builder rules(List<GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetAutoScalingConfigurationsAutoScalingConfigurationPolicyRule... rules) {
            return rules(List.of(rules));
        }        public GetAutoScalingConfigurationsAutoScalingConfigurationPolicy build() {
            return new GetAutoScalingConfigurationsAutoScalingConfigurationPolicy(policyType, rules);
        }
    }
}
