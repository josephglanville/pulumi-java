// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatch;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformation;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRegexPatternSetReferenceStatement extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupRegexPatternSetReferenceStatement Empty = new RuleGroupRegexPatternSetReferenceStatement();

    @InputImport(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    @InputImport(name="fieldToMatch", required=true)
      private final RuleGroupFieldToMatch fieldToMatch;

    public RuleGroupFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="textTransformations", required=true)
      private final List<RuleGroupTextTransformation> textTransformations;

    public List<RuleGroupTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupRegexPatternSetReferenceStatement(
        String arn,
        RuleGroupFieldToMatch fieldToMatch,
        List<RuleGroupTextTransformation> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupRegexPatternSetReferenceStatement() {
        this.arn = null;
        this.fieldToMatch = null;
        this.textTransformations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private RuleGroupFieldToMatch fieldToMatch;
        private List<RuleGroupTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setFieldToMatch(RuleGroupFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public RuleGroupRegexPatternSetReferenceStatement build() {
            return new RuleGroupRegexPatternSetReferenceStatement(arn, fieldToMatch, textTransformations);
        }
    }
}
