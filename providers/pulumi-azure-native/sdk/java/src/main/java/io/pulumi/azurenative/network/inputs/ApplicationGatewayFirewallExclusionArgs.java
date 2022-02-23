// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="matchVariable", required=true)
      private final Input<String> matchVariable;

    public Input<String> getMatchVariable() {
        return this.matchVariable;
    }

    /**
     * When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
     * 
     */
    @InputImport(name="selector", required=true)
      private final Input<String> selector;

    public Input<String> getSelector() {
        return this.selector;
    }

    /**
     * When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
     * 
     */
    @InputImport(name="selectorMatchOperator", required=true)
      private final Input<String> selectorMatchOperator;

    public Input<String> getSelectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    public ApplicationGatewayFirewallExclusionArgs(
        Input<String> matchVariable,
        Input<String> selector,
        Input<String> selectorMatchOperator) {
        this.matchVariable = Objects.requireNonNull(matchVariable, "expected parameter 'matchVariable' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator, "expected parameter 'selectorMatchOperator' to be non-null");
    }

    private ApplicationGatewayFirewallExclusionArgs() {
        this.matchVariable = Input.empty();
        this.selector = Input.empty();
        this.selectorMatchOperator = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFirewallExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> matchVariable;
        private Input<String> selector;
        private Input<String> selectorMatchOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayFirewallExclusionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchVariable = defaults.matchVariable;
    	      this.selector = defaults.selector;
    	      this.selectorMatchOperator = defaults.selectorMatchOperator;
        }

        public Builder setMatchVariable(Input<String> matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }

        public Builder setMatchVariable(String matchVariable) {
            this.matchVariable = Input.of(Objects.requireNonNull(matchVariable));
            return this;
        }

        public Builder setSelector(Input<String> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Input.of(Objects.requireNonNull(selector));
            return this;
        }

        public Builder setSelectorMatchOperator(Input<String> selectorMatchOperator) {
            this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator);
            return this;
        }

        public Builder setSelectorMatchOperator(String selectorMatchOperator) {
            this.selectorMatchOperator = Input.of(Objects.requireNonNull(selectorMatchOperator));
            return this;
        }
        public ApplicationGatewayFirewallExclusionArgs build() {
            return new ApplicationGatewayFirewallExclusionArgs(matchVariable, selector, selectorMatchOperator);
        }
    }
}
