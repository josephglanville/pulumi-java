// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathGetArgs Empty = new WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathGetArgs();

    public WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathGetArgs build() {
            return new WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathGetArgs();
        }
    }
}