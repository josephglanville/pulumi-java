// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementArgs> andStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementArgs> getAndStatement() {
        return this.andStatement == null ? Output.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Output.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementArgs> notStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementArgs> getNotStatement() {
        return this.notStatement == null ? Output.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementArgs> orStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementArgs> getOrStatement() {
        return this.orStatement == null ? Output.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementArgs(
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementArgs> andStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementArgs> notStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementArgs> orStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementArgs() {
        this.andStatement = Output.empty();
        this.byteMatchStatement = Output.empty();
        this.geoMatchStatement = Output.empty();
        this.ipSetReferenceStatement = Output.empty();
        this.labelMatchStatement = Output.empty();
        this.notStatement = Output.empty();
        this.orStatement = Output.empty();
        this.regexPatternSetReferenceStatement = Output.empty();
        this.sizeConstraintStatement = Output.empty();
        this.sqliMatchStatement = Output.empty();
        this.xssMatchStatement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementArgs> andStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementArgs> notStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementArgs> orStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder andStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder andStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementArgs andStatement) {
            this.andStatement = Output.ofNullable(andStatement);
            return this;
        }
        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Output.ofNullable(ipSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder notStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder notStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementArgs notStatement) {
            this.notStatement = Output.ofNullable(notStatement);
            return this;
        }
        public Builder orStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder orStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementArgs orStatement) {
            this.orStatement = Output.ofNullable(orStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }        public WebAclRuleStatementOrStatementStatementOrStatementStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}