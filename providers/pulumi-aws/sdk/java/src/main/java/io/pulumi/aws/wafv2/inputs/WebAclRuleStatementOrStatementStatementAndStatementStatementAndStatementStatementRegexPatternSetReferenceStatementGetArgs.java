// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs(
        Output<String> arn,
        @Nullable Output<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs() {
        this.arn = Output.empty();
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs(arn, fieldToMatch, textTransformations);
        }
    }
}
