// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Output.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs(
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs() {
        this.byteMatchStatement = Output.empty();
        this.geoMatchStatement = Output.empty();
        this.ipSetReferenceStatement = Output.empty();
        this.labelMatchStatement = Output.empty();
        this.regexPatternSetReferenceStatement = Output.empty();
        this.sizeConstraintStatement = Output.empty();
        this.sqliMatchStatement = Output.empty();
        this.xssMatchStatement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Output.ofNullable(ipSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
