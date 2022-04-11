// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementGeoMatchStatementForwardedIpConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs();

    /**
     * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    @Import(name="countryCodes", required=true)
      private final Output<List<String>> countryCodes;

    public Output<List<String>> getCountryCodes() {
        return this.countryCodes;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    @Import(name="forwardedIpConfig")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig;

    public Output<RuleGroupRuleStatementAndStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> getForwardedIpConfig() {
        return this.forwardedIpConfig == null ? Codegen.empty() : this.forwardedIpConfig;
    }

    public RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs(
        Output<List<String>> countryCodes,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig) {
        this.countryCodes = Objects.requireNonNull(countryCodes, "expected parameter 'countryCodes' to be non-null");
        this.forwardedIpConfig = forwardedIpConfig;
    }

    private RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs() {
        this.countryCodes = Codegen.empty();
        this.forwardedIpConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> countryCodes;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIpConfig = defaults.forwardedIpConfig;
        }

        public Builder countryCodes(Output<List<String>> countryCodes) {
            this.countryCodes = Objects.requireNonNull(countryCodes);
            return this;
        }
        public Builder countryCodes(List<String> countryCodes) {
            this.countryCodes = Output.of(Objects.requireNonNull(countryCodes));
            return this;
        }
        public Builder countryCodes(String... countryCodes) {
            return countryCodes(List.of(countryCodes));
        }
        public Builder forwardedIpConfig(@Nullable Output<RuleGroupRuleStatementAndStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }
        public Builder forwardedIpConfig(@Nullable RuleGroupRuleStatementAndStatementStatementGeoMatchStatementForwardedIpConfigGetArgs forwardedIpConfig) {
            this.forwardedIpConfig = Codegen.ofNullable(forwardedIpConfig);
            return this;
        }        public RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementGeoMatchStatementGetArgs(countryCodes, forwardedIpConfig);
        }
    }
}
