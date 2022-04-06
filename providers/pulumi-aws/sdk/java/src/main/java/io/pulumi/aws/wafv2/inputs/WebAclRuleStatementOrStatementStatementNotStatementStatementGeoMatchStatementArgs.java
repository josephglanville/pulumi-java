// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs();

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
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> getForwardedIpConfig() {
        return this.forwardedIpConfig == null ? Output.empty() : this.forwardedIpConfig;
    }

    public WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs(
        Output<List<String>> countryCodes,
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig) {
        this.countryCodes = Objects.requireNonNull(countryCodes, "expected parameter 'countryCodes' to be non-null");
        this.forwardedIpConfig = forwardedIpConfig;
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs() {
        this.countryCodes = Output.empty();
        this.forwardedIpConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> countryCodes;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs defaults) {
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
        public Builder forwardedIpConfig(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }
        public Builder forwardedIpConfig(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigArgs forwardedIpConfig) {
            this.forwardedIpConfig = Output.ofNullable(forwardedIpConfig);
            return this;
        }        public WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs(countryCodes, forwardedIpConfig);
        }
    }
}