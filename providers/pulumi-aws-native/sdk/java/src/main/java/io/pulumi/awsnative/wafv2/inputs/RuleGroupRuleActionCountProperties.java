// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomRequestHandling;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Count traffic towards application.
 * 
 */
public final class RuleGroupRuleActionCountProperties extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupRuleActionCountProperties Empty = new RuleGroupRuleActionCountProperties();

    @InputImport(name="customRequestHandling")
      private final @Nullable RuleGroupCustomRequestHandling customRequestHandling;

    public Optional<RuleGroupCustomRequestHandling> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Optional.empty() : Optional.ofNullable(this.customRequestHandling);
    }

    public RuleGroupRuleActionCountProperties(@Nullable RuleGroupCustomRequestHandling customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private RuleGroupRuleActionCountProperties() {
        this.customRequestHandling = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupCustomRequestHandling customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable RuleGroupCustomRequestHandling customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public RuleGroupRuleActionCountProperties build() {
            return new RuleGroupRuleActionCountProperties(customRequestHandling);
        }
    }
}
