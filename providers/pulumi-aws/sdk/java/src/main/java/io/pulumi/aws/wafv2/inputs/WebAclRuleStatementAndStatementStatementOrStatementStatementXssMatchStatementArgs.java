// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs(
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch,
        Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}
