// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs();

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
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs(
        Output<String> arn,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs() {
        this.arn = Output.empty();
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
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
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs(arn, fieldToMatch, textTransformations);
        }
    }
}
