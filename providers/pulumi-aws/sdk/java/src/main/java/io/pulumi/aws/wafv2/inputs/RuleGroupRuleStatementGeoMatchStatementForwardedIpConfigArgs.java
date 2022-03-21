// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs Empty = new RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs();

    /**
     * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    @Import(name="fallbackBehavior", required=true)
      private final Output<String> fallbackBehavior;

    public Output<String> getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    /**
     * - The name of the HTTP header to use for the IP address.
     * 
     */
    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName;
    }

    public RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs(
        Output<String> fallbackBehavior,
        Output<String> headerName) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs() {
        this.fallbackBehavior = Output.empty();
        this.headerName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fallbackBehavior;
        private Output<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder fallbackBehavior(Output<String> fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder fallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Output.of(Objects.requireNonNull(fallbackBehavior));
            return this;
        }
        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }        public RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs build() {
            return new RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs(fallbackBehavior, headerName);
        }
    }
}
