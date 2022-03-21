// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomRequestHandlingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Count traffic towards application.
 * 
 */
public final class RuleGroupRuleActionCountPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionCountPropertiesArgs Empty = new RuleGroupRuleActionCountPropertiesArgs();

    @Import(name="customRequestHandling")
      private final @Nullable Output<RuleGroupCustomRequestHandlingArgs> customRequestHandling;

    public Output<RuleGroupCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Output.empty() : this.customRequestHandling;
    }

    public RuleGroupRuleActionCountPropertiesArgs(@Nullable Output<RuleGroupCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private RuleGroupRuleActionCountPropertiesArgs() {
        this.customRequestHandling = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable Output<RuleGroupCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public Builder customRequestHandling(@Nullable RuleGroupCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Output.ofNullable(customRequestHandling);
            return this;
        }        public RuleGroupRuleActionCountPropertiesArgs build() {
            return new RuleGroupRuleActionCountPropertiesArgs(customRequestHandling);
        }
    }
}
