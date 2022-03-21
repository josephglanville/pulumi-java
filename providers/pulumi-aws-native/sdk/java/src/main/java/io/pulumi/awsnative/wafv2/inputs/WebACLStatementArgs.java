// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLAndStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLByteMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLGeoMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLIPSetReferenceStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLLabelMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLManagedRuleGroupStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLNotStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLOrStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRateBasedStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRegexMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRegexPatternSetReferenceStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRuleGroupReferenceStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLSizeConstraintStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLSqliMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLXssMatchStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * First level statement that contains conditions, such as ByteMatch, SizeConstraint, etc
 * 
 */
public final class WebACLStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLStatementArgs Empty = new WebACLStatementArgs();

    @Import(name="andStatement")
      private final @Nullable Output<WebACLAndStatementArgs> andStatement;

    public Output<WebACLAndStatementArgs> getAndStatement() {
        return this.andStatement == null ? Output.empty() : this.andStatement;
    }

    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebACLByteMatchStatementArgs> byteMatchStatement;

    public Output<WebACLByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebACLGeoMatchStatementArgs> geoMatchStatement;

    public Output<WebACLGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    @Import(name="iPSetReferenceStatement")
      private final @Nullable Output<WebACLIPSetReferenceStatementArgs> iPSetReferenceStatement;

    public Output<WebACLIPSetReferenceStatementArgs> getIPSetReferenceStatement() {
        return this.iPSetReferenceStatement == null ? Output.empty() : this.iPSetReferenceStatement;
    }

    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebACLLabelMatchStatementArgs> labelMatchStatement;

    public Output<WebACLLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    @Import(name="managedRuleGroupStatement")
      private final @Nullable Output<WebACLManagedRuleGroupStatementArgs> managedRuleGroupStatement;

    public Output<WebACLManagedRuleGroupStatementArgs> getManagedRuleGroupStatement() {
        return this.managedRuleGroupStatement == null ? Output.empty() : this.managedRuleGroupStatement;
    }

    @Import(name="notStatement")
      private final @Nullable Output<WebACLNotStatementArgs> notStatement;

    public Output<WebACLNotStatementArgs> getNotStatement() {
        return this.notStatement == null ? Output.empty() : this.notStatement;
    }

    @Import(name="orStatement")
      private final @Nullable Output<WebACLOrStatementArgs> orStatement;

    public Output<WebACLOrStatementArgs> getOrStatement() {
        return this.orStatement == null ? Output.empty() : this.orStatement;
    }

    @Import(name="rateBasedStatement")
      private final @Nullable Output<WebACLRateBasedStatementArgs> rateBasedStatement;

    public Output<WebACLRateBasedStatementArgs> getRateBasedStatement() {
        return this.rateBasedStatement == null ? Output.empty() : this.rateBasedStatement;
    }

    @Import(name="regexMatchStatement")
      private final @Nullable Output<WebACLRegexMatchStatementArgs> regexMatchStatement;

    public Output<WebACLRegexMatchStatementArgs> getRegexMatchStatement() {
        return this.regexMatchStatement == null ? Output.empty() : this.regexMatchStatement;
    }

    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebACLRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Output<WebACLRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    @Import(name="ruleGroupReferenceStatement")
      private final @Nullable Output<WebACLRuleGroupReferenceStatementArgs> ruleGroupReferenceStatement;

    public Output<WebACLRuleGroupReferenceStatementArgs> getRuleGroupReferenceStatement() {
        return this.ruleGroupReferenceStatement == null ? Output.empty() : this.ruleGroupReferenceStatement;
    }

    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebACLSizeConstraintStatementArgs> sizeConstraintStatement;

    public Output<WebACLSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebACLSqliMatchStatementArgs> sqliMatchStatement;

    public Output<WebACLSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebACLXssMatchStatementArgs> xssMatchStatement;

    public Output<WebACLXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public WebACLStatementArgs(
        @Nullable Output<WebACLAndStatementArgs> andStatement,
        @Nullable Output<WebACLByteMatchStatementArgs> byteMatchStatement,
        @Nullable Output<WebACLGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Output<WebACLIPSetReferenceStatementArgs> iPSetReferenceStatement,
        @Nullable Output<WebACLLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Output<WebACLManagedRuleGroupStatementArgs> managedRuleGroupStatement,
        @Nullable Output<WebACLNotStatementArgs> notStatement,
        @Nullable Output<WebACLOrStatementArgs> orStatement,
        @Nullable Output<WebACLRateBasedStatementArgs> rateBasedStatement,
        @Nullable Output<WebACLRegexMatchStatementArgs> regexMatchStatement,
        @Nullable Output<WebACLRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebACLRuleGroupReferenceStatementArgs> ruleGroupReferenceStatement,
        @Nullable Output<WebACLSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Output<WebACLSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Output<WebACLXssMatchStatementArgs> xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.iPSetReferenceStatement = iPSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.managedRuleGroupStatement = managedRuleGroupStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.rateBasedStatement = rateBasedStatement;
        this.regexMatchStatement = regexMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebACLStatementArgs() {
        this.andStatement = Output.empty();
        this.byteMatchStatement = Output.empty();
        this.geoMatchStatement = Output.empty();
        this.iPSetReferenceStatement = Output.empty();
        this.labelMatchStatement = Output.empty();
        this.managedRuleGroupStatement = Output.empty();
        this.notStatement = Output.empty();
        this.orStatement = Output.empty();
        this.rateBasedStatement = Output.empty();
        this.regexMatchStatement = Output.empty();
        this.regexPatternSetReferenceStatement = Output.empty();
        this.ruleGroupReferenceStatement = Output.empty();
        this.sizeConstraintStatement = Output.empty();
        this.sqliMatchStatement = Output.empty();
        this.xssMatchStatement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebACLAndStatementArgs> andStatement;
        private @Nullable Output<WebACLByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Output<WebACLGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Output<WebACLIPSetReferenceStatementArgs> iPSetReferenceStatement;
        private @Nullable Output<WebACLLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Output<WebACLManagedRuleGroupStatementArgs> managedRuleGroupStatement;
        private @Nullable Output<WebACLNotStatementArgs> notStatement;
        private @Nullable Output<WebACLOrStatementArgs> orStatement;
        private @Nullable Output<WebACLRateBasedStatementArgs> rateBasedStatement;
        private @Nullable Output<WebACLRegexMatchStatementArgs> regexMatchStatement;
        private @Nullable Output<WebACLRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebACLRuleGroupReferenceStatementArgs> ruleGroupReferenceStatement;
        private @Nullable Output<WebACLSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Output<WebACLSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Output<WebACLXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.iPSetReferenceStatement = defaults.iPSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.managedRuleGroupStatement = defaults.managedRuleGroupStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.rateBasedStatement = defaults.rateBasedStatement;
    	      this.regexMatchStatement = defaults.regexMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.ruleGroupReferenceStatement = defaults.ruleGroupReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder andStatement(@Nullable Output<WebACLAndStatementArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder andStatement(@Nullable WebACLAndStatementArgs andStatement) {
            this.andStatement = Output.ofNullable(andStatement);
            return this;
        }
        public Builder byteMatchStatement(@Nullable Output<WebACLByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable WebACLByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<WebACLGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebACLGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder iPSetReferenceStatement(@Nullable Output<WebACLIPSetReferenceStatementArgs> iPSetReferenceStatement) {
            this.iPSetReferenceStatement = iPSetReferenceStatement;
            return this;
        }
        public Builder iPSetReferenceStatement(@Nullable WebACLIPSetReferenceStatementArgs iPSetReferenceStatement) {
            this.iPSetReferenceStatement = Output.ofNullable(iPSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<WebACLLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebACLLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder managedRuleGroupStatement(@Nullable Output<WebACLManagedRuleGroupStatementArgs> managedRuleGroupStatement) {
            this.managedRuleGroupStatement = managedRuleGroupStatement;
            return this;
        }
        public Builder managedRuleGroupStatement(@Nullable WebACLManagedRuleGroupStatementArgs managedRuleGroupStatement) {
            this.managedRuleGroupStatement = Output.ofNullable(managedRuleGroupStatement);
            return this;
        }
        public Builder notStatement(@Nullable Output<WebACLNotStatementArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder notStatement(@Nullable WebACLNotStatementArgs notStatement) {
            this.notStatement = Output.ofNullable(notStatement);
            return this;
        }
        public Builder orStatement(@Nullable Output<WebACLOrStatementArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder orStatement(@Nullable WebACLOrStatementArgs orStatement) {
            this.orStatement = Output.ofNullable(orStatement);
            return this;
        }
        public Builder rateBasedStatement(@Nullable Output<WebACLRateBasedStatementArgs> rateBasedStatement) {
            this.rateBasedStatement = rateBasedStatement;
            return this;
        }
        public Builder rateBasedStatement(@Nullable WebACLRateBasedStatementArgs rateBasedStatement) {
            this.rateBasedStatement = Output.ofNullable(rateBasedStatement);
            return this;
        }
        public Builder regexMatchStatement(@Nullable Output<WebACLRegexMatchStatementArgs> regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }
        public Builder regexMatchStatement(@Nullable WebACLRegexMatchStatementArgs regexMatchStatement) {
            this.regexMatchStatement = Output.ofNullable(regexMatchStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebACLRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebACLRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder ruleGroupReferenceStatement(@Nullable Output<WebACLRuleGroupReferenceStatementArgs> ruleGroupReferenceStatement) {
            this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
            return this;
        }
        public Builder ruleGroupReferenceStatement(@Nullable WebACLRuleGroupReferenceStatementArgs ruleGroupReferenceStatement) {
            this.ruleGroupReferenceStatement = Output.ofNullable(ruleGroupReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<WebACLSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebACLSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<WebACLSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebACLSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<WebACLXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebACLXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }        public WebACLStatementArgs build() {
            return new WebACLStatementArgs(andStatement, byteMatchStatement, geoMatchStatement, iPSetReferenceStatement, labelMatchStatement, managedRuleGroupStatement, notStatement, orStatement, rateBasedStatement, regexMatchStatement, regexPatternSetReferenceStatement, ruleGroupReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
