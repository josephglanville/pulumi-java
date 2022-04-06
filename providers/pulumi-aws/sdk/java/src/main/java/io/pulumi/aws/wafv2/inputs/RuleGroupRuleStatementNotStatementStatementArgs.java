// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementGeoMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementLabelMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementNotStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementSqliMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementArgs Empty = new RuleGroupRuleStatementNotStatementStatementArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementArgs> andStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementAndStatementArgs> getAndStatement() {
        return this.andStatement == null ? Output.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatementArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Output.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementNotStatementArgs> notStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementNotStatementArgs> getNotStatement() {
        return this.notStatement == null ? Output.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementArgs> orStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementOrStatementArgs> getOrStatement() {
        return this.orStatement == null ? Output.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Output<RuleGroupRuleStatementNotStatementStatementXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public RuleGroupRuleStatementNotStatementStatementArgs(
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementArgs> andStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementNotStatementArgs> notStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementArgs> orStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
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

    private RuleGroupRuleStatementNotStatementStatementArgs() {
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

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementArgs> andStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementNotStatementArgs> notStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementArgs> orStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementArgs defaults) {
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

        public Builder andStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder andStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementArgs andStatement) {
            this.andStatement = Output.ofNullable(andStatement);
            return this;
        }
        public Builder byteMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Output.ofNullable(ipSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder notStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementNotStatementArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder notStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementArgs notStatement) {
            this.notStatement = Output.ofNullable(notStatement);
            return this;
        }
        public Builder orStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder orStatement(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementArgs orStatement) {
            this.orStatement = Output.ofNullable(orStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<RuleGroupRuleStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }        public RuleGroupRuleStatementNotStatementStatementArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}