// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupFieldToMatch;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupXssMatchStatement {
    private final RuleGroupFieldToMatch fieldToMatch;
    private final List<RuleGroupTextTransformation> textTransformations;

    @CustomType.Constructor
    private RuleGroupXssMatchStatement(
        @CustomType.Parameter("fieldToMatch") RuleGroupFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<RuleGroupTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    public RuleGroupFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    public List<RuleGroupTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupXssMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupFieldToMatch fieldToMatch;
        private List<RuleGroupTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(RuleGroupFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder textTransformations(List<RuleGroupTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupXssMatchStatement build() {
            return new RuleGroupXssMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
