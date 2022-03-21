// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleFieldToMatchArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ByteMatchSetByteMatchTupleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ByteMatchSetByteMatchTupleArgs Empty = new ByteMatchSetByteMatchTupleArgs();

    /**
     * The part of a web request that you want to search, such as a specified header or a query string.
     * 
     */
    @Import(name="fieldToMatch", required=true)
      private final Output<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch;

    public Output<ByteMatchSetByteMatchTupleFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * Within the portion of a web request that you want to search
     * (for example, in the query string, if any), specify where you want to search.
     * e.g., `CONTAINS`, `CONTAINS_WORD` or `EXACTLY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-PositionalConstraint)
     * for all supported values.
     * 
     */
    @Import(name="positionalConstraint", required=true)
      private final Output<String> positionalConstraint;

    public Output<String> getPositionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * The value that you want to search forE.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TargetString)
     * for all supported values.
     * 
     */
    @Import(name="targetString")
      private final @Nullable Output<String> targetString;

    public Output<String> getTargetString() {
        return this.targetString == null ? Output.empty() : this.targetString;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    @Import(name="textTransformation", required=true)
      private final Output<String> textTransformation;

    public Output<String> getTextTransformation() {
        return this.textTransformation;
    }

    public ByteMatchSetByteMatchTupleArgs(
        Output<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch,
        Output<String> positionalConstraint,
        @Nullable Output<String> targetString,
        Output<String> textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.targetString = targetString;
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private ByteMatchSetByteMatchTupleArgs() {
        this.fieldToMatch = Output.empty();
        this.positionalConstraint = Output.empty();
        this.targetString = Output.empty();
        this.textTransformation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetByteMatchTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch;
        private Output<String> positionalConstraint;
        private @Nullable Output<String> targetString;
        private Output<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetByteMatchTupleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.targetString = defaults.targetString;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder fieldToMatch(Output<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder fieldToMatch(ByteMatchSetByteMatchTupleFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }
        public Builder positionalConstraint(Output<String> positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }
        public Builder positionalConstraint(String positionalConstraint) {
            this.positionalConstraint = Output.of(Objects.requireNonNull(positionalConstraint));
            return this;
        }
        public Builder targetString(@Nullable Output<String> targetString) {
            this.targetString = targetString;
            return this;
        }
        public Builder targetString(@Nullable String targetString) {
            this.targetString = Output.ofNullable(targetString);
            return this;
        }
        public Builder textTransformation(Output<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }
        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Output.of(Objects.requireNonNull(textTransformation));
            return this;
        }        public ByteMatchSetByteMatchTupleArgs build() {
            return new ByteMatchSetByteMatchTupleArgs(fieldToMatch, positionalConstraint, targetString, textTransformation);
        }
    }
}
