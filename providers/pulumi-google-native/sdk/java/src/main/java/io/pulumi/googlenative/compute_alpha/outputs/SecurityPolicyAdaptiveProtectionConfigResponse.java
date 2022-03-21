// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_alpha.outputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse;
import java.util.Objects;

@CustomType
public final class SecurityPolicyAdaptiveProtectionConfigResponse {
    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
     */
    private final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse layer7DdosDefenseConfig;

    @CustomType.Constructor
    private SecurityPolicyAdaptiveProtectionConfigResponse(@CustomType.Parameter("layer7DdosDefenseConfig") SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse layer7DdosDefenseConfig) {
        this.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
    }

    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
    */
    public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse getLayer7DdosDefenseConfig() {
        return this.layer7DdosDefenseConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse layer7DdosDefenseConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.layer7DdosDefenseConfig = defaults.layer7DdosDefenseConfig;
        }

        public Builder layer7DdosDefenseConfig(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse layer7DdosDefenseConfig) {
            this.layer7DdosDefenseConfig = Objects.requireNonNull(layer7DdosDefenseConfig);
            return this;
        }        public SecurityPolicyAdaptiveProtectionConfigResponse build() {
            return new SecurityPolicyAdaptiveProtectionConfigResponse(layer7DdosDefenseConfig);
        }
    }
}
