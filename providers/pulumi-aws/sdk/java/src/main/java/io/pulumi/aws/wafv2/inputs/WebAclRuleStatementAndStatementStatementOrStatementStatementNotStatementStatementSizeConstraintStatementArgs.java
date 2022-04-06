// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs();

    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    @Import(name="comparisonOperator", required=true)
      private final Output<String> comparisonOperator;

    public Output<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs> fieldToMatch;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    @Import(name="size", required=true)
      private final Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs(
        Output<String> comparisonOperator,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs> fieldToMatch,
        Output<Integer> size,
        Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs>> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs() {
        this.comparisonOperator = Output.empty();
        this.fieldToMatch = Output.empty();
        this.size = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> comparisonOperator;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs> fieldToMatch;
        private Output<Integer> size;
        private Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder comparisonOperator(Output<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }
        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Output.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }
        public Builder size(Output<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Output.of(Objects.requireNonNull(size));
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementArgs(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}