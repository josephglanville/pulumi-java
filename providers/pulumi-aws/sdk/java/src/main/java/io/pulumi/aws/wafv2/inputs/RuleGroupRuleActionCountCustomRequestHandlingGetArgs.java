// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleActionCountCustomRequestHandlingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionCountCustomRequestHandlingGetArgs Empty = new RuleGroupRuleActionCountCustomRequestHandlingGetArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="insertHeaders", required=true)
      private final Output<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

    public Output<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> getInsertHeaders() {
        return this.insertHeaders;
    }

    public RuleGroupRuleActionCountCustomRequestHandlingGetArgs(Output<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private RuleGroupRuleActionCountCustomRequestHandlingGetArgs() {
        this.insertHeaders = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountCustomRequestHandlingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountCustomRequestHandlingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(Output<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public Builder insertHeaders(List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs> insertHeaders) {
            this.insertHeaders = Output.of(Objects.requireNonNull(insertHeaders));
            return this;
        }
        public Builder insertHeaders(RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }        public RuleGroupRuleActionCountCustomRequestHandlingGetArgs build() {
            return new RuleGroupRuleActionCountCustomRequestHandlingGetArgs(insertHeaders);
        }
    }
}