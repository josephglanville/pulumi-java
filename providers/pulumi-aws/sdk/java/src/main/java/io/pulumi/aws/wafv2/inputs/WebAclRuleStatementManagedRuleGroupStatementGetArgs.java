// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementGetArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementGetArgs();

    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    @Import(name="excludedRules")
      private final @Nullable Output<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> excludedRules;

    public Output<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> getExcludedRules() {
        return this.excludedRules == null ? Codegen.empty() : this.excludedRules;
    }

    /**
     * The name of the managed rule group.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Narrows the scope of the statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
     * 
     */
    @Import(name="scopeDownStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> scopeDownStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Codegen.empty() : this.scopeDownStatement;
    }

    /**
     * The name of the managed rule group vendor.
     * 
     */
    @Import(name="vendorName", required=true)
      private final Output<String> vendorName;

    public Output<String> getVendorName() {
        return this.vendorName;
    }

    public WebAclRuleStatementManagedRuleGroupStatementGetArgs(
        @Nullable Output<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> excludedRules,
        Output<String> name,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> scopeDownStatement,
        Output<String> vendorName) {
        this.excludedRules = excludedRules;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
    }

    private WebAclRuleStatementManagedRuleGroupStatementGetArgs() {
        this.excludedRules = Codegen.empty();
        this.name = Codegen.empty();
        this.scopeDownStatement = Codegen.empty();
        this.vendorName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> excludedRules;
        private Output<String> name;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> scopeDownStatement;
        private Output<String> vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedRules = defaults.excludedRules;
    	      this.name = defaults.name;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder excludedRules(@Nullable Output<List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }
        public Builder excludedRules(@Nullable List<WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs> excludedRules) {
            this.excludedRules = Codegen.ofNullable(excludedRules);
            return this;
        }
        public Builder excludedRules(WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs... excludedRules) {
            return excludedRules(List.of(excludedRules));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder scopeDownStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs> scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }
        public Builder scopeDownStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs scopeDownStatement) {
            this.scopeDownStatement = Codegen.ofNullable(scopeDownStatement);
            return this;
        }
        public Builder vendorName(Output<String> vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }
        public Builder vendorName(String vendorName) {
            this.vendorName = Output.of(Objects.requireNonNull(vendorName));
            return this;
        }        public WebAclRuleStatementManagedRuleGroupStatementGetArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementGetArgs(excludedRules, name, scopeDownStatement, vendorName);
        }
    }
}
