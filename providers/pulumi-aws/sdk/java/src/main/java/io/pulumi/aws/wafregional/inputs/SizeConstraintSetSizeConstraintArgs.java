// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintFieldToMatchArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SizeConstraintSetSizeConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final SizeConstraintSetSizeConstraintArgs Empty = new SizeConstraintSetSizeConstraintArgs();

    /**
     * The type of comparison you want to perform.
     * e.g., `EQ`, `NE`, `LT`, `GT`.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_wafRegional_SizeConstraint.html) for all supported values.
     * 
     */
    @InputImport(name="comparisonOperator", required=true)
      private final Output<String> comparisonOperator;

    public Output<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * Specifies where in a web request to look for the size constraint.
     * 
     */
    @InputImport(name="fieldToMatch", required=true)
      private final Output<SizeConstraintSetSizeConstraintFieldToMatchArgs> fieldToMatch;

    public Output<SizeConstraintSetSizeConstraintFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * The size in bytes that you want to compare against the size of the specified `field_to_match`.
     * Valid values are between 0 - 21474836480 bytes (0 - 20 GB).
     * 
     */
    @InputImport(name="size", required=true)
      private final Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `field_to_match` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SizeConstraint.html#WAF-Type-SizeConstraint-TextTransformation)
     * for all supported values.
     * **Note:** if you choose `BODY` as `type`, you must choose `NONE` because CloudFront forwards only the first 8192 bytes for inspection.
     * 
     */
    @InputImport(name="textTransformation", required=true)
      private final Output<String> textTransformation;

    public Output<String> getTextTransformation() {
        return this.textTransformation;
    }

    public SizeConstraintSetSizeConstraintArgs(
        Output<String> comparisonOperator,
        Output<SizeConstraintSetSizeConstraintFieldToMatchArgs> fieldToMatch,
        Output<Integer> size,
        Output<String> textTransformation) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private SizeConstraintSetSizeConstraintArgs() {
        this.comparisonOperator = Output.empty();
        this.fieldToMatch = Output.empty();
        this.size = Output.empty();
        this.textTransformation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeConstraintSetSizeConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> comparisonOperator;
        private Output<SizeConstraintSetSizeConstraintFieldToMatchArgs> fieldToMatch;
        private Output<Integer> size;
        private Output<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeConstraintSetSizeConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder comparisonOperator(Output<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Output.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder fieldToMatch(Output<SizeConstraintSetSizeConstraintFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder fieldToMatch(SizeConstraintSetSizeConstraintFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
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

        public Builder textTransformation(Output<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }

        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Output.of(Objects.requireNonNull(textTransformation));
            return this;
        }
        public SizeConstraintSetSizeConstraintArgs build() {
            return new SizeConstraintSetSizeConstraintArgs(comparisonOperator, fieldToMatch, size, textTransformation);
        }
    }
}
