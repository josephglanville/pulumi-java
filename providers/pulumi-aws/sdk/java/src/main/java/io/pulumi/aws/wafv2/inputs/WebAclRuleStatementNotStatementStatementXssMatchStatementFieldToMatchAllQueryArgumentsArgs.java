// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs Empty = new WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs();

    public WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs build() {
            return new WebAclRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs();
        }
    }
}