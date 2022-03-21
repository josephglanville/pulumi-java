// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement {
    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    private final String comparisonOperator;
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    private final Integer size;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement(
        @CustomType.Parameter("comparisonOperator") String comparisonOperator,
        @CustomType.Parameter("fieldToMatch") @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("textTransformations") List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
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
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> getFieldToMatch() {
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
    public List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparisonOperator;
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
        private Integer size;
        private List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement defaults) {
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
        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
