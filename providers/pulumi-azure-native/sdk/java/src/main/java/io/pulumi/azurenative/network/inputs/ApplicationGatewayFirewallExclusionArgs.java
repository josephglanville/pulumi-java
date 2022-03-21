// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Allow to exclude some variable satisfy the condition for the WAF check.
 * 
 */
public final class ApplicationGatewayFirewallExclusionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayFirewallExclusionArgs Empty = new ApplicationGatewayFirewallExclusionArgs();

    /**
     * The variable to be excluded.
     * 
     */
    @Import(name="matchVariable", required=true)
      private final Output<String> matchVariable;

    public Output<String> getMatchVariable() {
        return this.matchVariable;
    }

    /**
     * When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
     * 
     */
    @Import(name="selector", required=true)
      private final Output<String> selector;

    public Output<String> getSelector() {
        return this.selector;
    }

    /**
     * When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
     * 
     */
    @Import(name="selectorMatchOperator", required=true)
      private final Output<String> selectorMatchOperator;

    public Output<String> getSelectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    public ApplicationGatewayFirewallExclusionArgs(
        Output<String> matchVariable,
        Output<String> selector,
        Output<String> selectorMatchOperator) {
        this.matchVariable = Objects.requireNonNull(matchVariable, "expected parameter 'matchVariable' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator, "expected parameter 'selectorMatchOperator' to be non-null");
    }

    private ApplicationGatewayFirewallExclusionArgs() {
        this.matchVariable = Output.empty();
        this.selector = Output.empty();
        this.selectorMatchOperator = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFirewallExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> matchVariable;
        private Output<String> selector;
        private Output<String> selectorMatchOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayFirewallExclusionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchVariable = defaults.matchVariable;
    	      this.selector = defaults.selector;
    	      this.selectorMatchOperator = defaults.selectorMatchOperator;
        }

        public Builder matchVariable(Output<String> matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }
        public Builder matchVariable(String matchVariable) {
            this.matchVariable = Output.of(Objects.requireNonNull(matchVariable));
            return this;
        }
        public Builder selector(Output<String> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public Builder selector(String selector) {
            this.selector = Output.of(Objects.requireNonNull(selector));
            return this;
        }
        public Builder selectorMatchOperator(Output<String> selectorMatchOperator) {
            this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator);
            return this;
        }
        public Builder selectorMatchOperator(String selectorMatchOperator) {
            this.selectorMatchOperator = Output.of(Objects.requireNonNull(selectorMatchOperator));
            return this;
        }        public ApplicationGatewayFirewallExclusionArgs build() {
            return new ApplicationGatewayFirewallExclusionArgs(matchVariable, selector, selectorMatchOperator);
        }
    }
}
