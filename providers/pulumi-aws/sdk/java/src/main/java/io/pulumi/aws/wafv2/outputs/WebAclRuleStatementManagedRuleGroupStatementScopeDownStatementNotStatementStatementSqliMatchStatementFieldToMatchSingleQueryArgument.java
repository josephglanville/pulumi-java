// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument {
    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument(name);
        }
    }
}