// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatement {
    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
    */
    public List<WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatementStatement... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatement build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementAndStatement(statements);
        }
    }
}
