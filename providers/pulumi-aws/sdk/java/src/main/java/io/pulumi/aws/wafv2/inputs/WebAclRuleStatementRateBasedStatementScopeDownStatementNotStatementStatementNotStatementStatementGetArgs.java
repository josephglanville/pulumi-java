// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Output.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs(
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs() {
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

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs defaults) {
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

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Output.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
