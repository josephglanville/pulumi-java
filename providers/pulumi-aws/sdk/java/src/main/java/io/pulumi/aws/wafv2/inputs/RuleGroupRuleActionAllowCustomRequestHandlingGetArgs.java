// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleActionAllowCustomRequestHandlingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionAllowCustomRequestHandlingGetArgs Empty = new RuleGroupRuleActionAllowCustomRequestHandlingGetArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @InputImport(name="insertHeaders", required=true)
      private final Output<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

    public Output<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> getInsertHeaders() {
        return this.insertHeaders;
    }

    public RuleGroupRuleActionAllowCustomRequestHandlingGetArgs(Output<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private RuleGroupRuleActionAllowCustomRequestHandlingGetArgs() {
        this.insertHeaders = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionAllowCustomRequestHandlingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionAllowCustomRequestHandlingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(Output<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }

        public Builder insertHeaders(List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderGetArgs> insertHeaders) {
            this.insertHeaders = Output.of(Objects.requireNonNull(insertHeaders));
            return this;
        }
        public RuleGroupRuleActionAllowCustomRequestHandlingGetArgs build() {
            return new RuleGroupRuleActionAllowCustomRequestHandlingGetArgs(insertHeaders);
        }
    }
}
