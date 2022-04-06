// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementNotStatementStatement {
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement;

    @CustomType.Constructor
    private RuleGroupRuleStatementNotStatementStatementNotStatementStatement(
        @CustomType.Parameter("byteMatchStatement") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement,
        @CustomType.Parameter("geoMatchStatement") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement,
        @CustomType.Parameter("ipSetReferenceStatement") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @CustomType.Parameter("labelMatchStatement") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement,
        @CustomType.Parameter("regexPatternSetReferenceStatement") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @CustomType.Parameter("sizeConstraintStatement") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @CustomType.Parameter("sqliMatchStatement") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement,
        @CustomType.Parameter("xssMatchStatement") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatement defaults) {
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

        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }        public RuleGroupRuleStatementNotStatementStatementNotStatementStatement build() {
            return new RuleGroupRuleStatementNotStatementStatementNotStatementStatement(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}