// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRuleGroupReferenceStatementExcludedRule;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRuleGroupReferenceStatement {
    /**
     * The Amazon Resource Name (ARN) of the `aws.wafv2.RuleGroup` resource.
     * 
     */
    private final String arn;
    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    private final @Nullable List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRules;

    @CustomType.Constructor
    private WebAclRuleStatementRuleGroupReferenceStatement(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("excludedRules") @Nullable List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRules) {
        this.arn = arn;
        this.excludedRules = excludedRules;
    }

    /**
     * The Amazon Resource Name (ARN) of the `aws.wafv2.RuleGroup` resource.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
    */
    public List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> getExcludedRules() {
        return this.excludedRules == null ? List.of() : this.excludedRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRuleGroupReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRules;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRuleGroupReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.excludedRules = defaults.excludedRules;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder excludedRules(@Nullable List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRule> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }
        public Builder excludedRules(WebAclRuleStatementRuleGroupReferenceStatementExcludedRule... excludedRules) {
            return excludedRules(List.of(excludedRules));
        }        public WebAclRuleStatementRuleGroupReferenceStatement build() {
            return new WebAclRuleStatementRuleGroupReferenceStatement(arn, excludedRules);
        }
    }
}
