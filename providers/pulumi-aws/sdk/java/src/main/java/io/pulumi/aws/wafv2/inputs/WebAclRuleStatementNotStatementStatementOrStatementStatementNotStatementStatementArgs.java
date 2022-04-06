// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementLabelMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs Empty = new WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Output.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs() {
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

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs defaults) {
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

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Output.ofNullable(ipSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }        public WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}