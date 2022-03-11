// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLSizeConstraintStatementComparisonOperator;
import io.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


/**
 * Size Constraint statement.
 * 
 */
public final class WebACLSizeConstraintStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLSizeConstraintStatementArgs Empty = new WebACLSizeConstraintStatementArgs();

    @InputImport(name="comparisonOperator", required=true)
      private final Output<WebACLSizeConstraintStatementComparisonOperator> comparisonOperator;

    public Output<WebACLSizeConstraintStatementComparisonOperator> getComparisonOperator() {
        return this.comparisonOperator;
    }

    @InputImport(name="fieldToMatch", required=true)
      private final Output<WebACLFieldToMatchArgs> fieldToMatch;

    public Output<WebACLFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="size", required=true)
      private final Output<Double> size;

    public Output<Double> getSize() {
        return this.size;
    }

    @InputImport(name="textTransformations", required=true)
      private final Output<List<WebACLTextTransformationArgs>> textTransformations;

    public Output<List<WebACLTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebACLSizeConstraintStatementArgs(
        Output<WebACLSizeConstraintStatementComparisonOperator> comparisonOperator,
        Output<WebACLFieldToMatchArgs> fieldToMatch,
        Output<Double> size,
        Output<List<WebACLTextTransformationArgs>> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebACLSizeConstraintStatementArgs() {
        this.comparisonOperator = Output.empty();
        this.fieldToMatch = Output.empty();
        this.size = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLSizeConstraintStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<WebACLSizeConstraintStatementComparisonOperator> comparisonOperator;
        private Output<WebACLFieldToMatchArgs> fieldToMatch;
        private Output<Double> size;
        private Output<List<WebACLTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLSizeConstraintStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder comparisonOperator(Output<WebACLSizeConstraintStatementComparisonOperator> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder comparisonOperator(WebACLSizeConstraintStatementComparisonOperator comparisonOperator) {
            this.comparisonOperator = Output.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder fieldToMatch(Output<WebACLFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder fieldToMatch(WebACLFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder size(Output<Double> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder size(Double size) {
            this.size = Output.of(Objects.requireNonNull(size));
            return this;
        }

        public Builder textTransformations(Output<List<WebACLTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebACLTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebACLSizeConstraintStatementArgs build() {
            return new WebACLSizeConstraintStatementArgs(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
