// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatement {
    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    private final String comparisonOperator;
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    private final Integer size;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatement(
        @CustomType.Parameter("comparisonOperator") String comparisonOperator,
        @CustomType.Parameter("fieldToMatch") @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("textTransformations") List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
        this.comparisonOperator = comparisonOperator;
        this.fieldToMatch = fieldToMatch;
        this.size = size;
        this.textTransformations = textTransformations;
    }

    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
    */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
    */
    public Integer getSize() {
        return this.size;
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparisonOperator;
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
        private Integer size;
        private List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatement build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatement(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
