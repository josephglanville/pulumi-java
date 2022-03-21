// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleMatcherConfigLayer4ConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SecurityPolicyRuleMatcherConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleMatcherConfigResponse Empty = new SecurityPolicyRuleMatcherConfigResponse();

    /**
     * CIDR IP address range. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="destIpRanges", required=true)
      private final List<String> destIpRanges;

    public List<String> getDestIpRanges() {
        return this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="layer4Configs", required=true)
      private final List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs;

    public List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> getLayer4Configs() {
        return this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    @Import(name="srcIpRanges", required=true)
      private final List<String> srcIpRanges;

    public List<String> getSrcIpRanges() {
        return this.srcIpRanges;
    }

    public SecurityPolicyRuleMatcherConfigResponse(
        List<String> destIpRanges,
        List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs,
        List<String> srcIpRanges) {
        this.destIpRanges = Objects.requireNonNull(destIpRanges, "expected parameter 'destIpRanges' to be non-null");
        this.layer4Configs = Objects.requireNonNull(layer4Configs, "expected parameter 'layer4Configs' to be non-null");
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges, "expected parameter 'srcIpRanges' to be non-null");
    }

    private SecurityPolicyRuleMatcherConfigResponse() {
        this.destIpRanges = List.of();
        this.layer4Configs = List.of();
        this.srcIpRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destIpRanges;
        private List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs;
        private List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder destIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        public Builder layer4Configs(List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }
        public Builder layer4Configs(SecurityPolicyRuleMatcherConfigLayer4ConfigResponse... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        public Builder srcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }        public SecurityPolicyRuleMatcherConfigResponse build() {
            return new SecurityPolicyRuleMatcherConfigResponse(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
