// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs();

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="dictionary")
      private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> dictionary;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> getDictionary() {
        return this.dictionary == null ? Input.empty() : this.dictionary;
    }

    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="excludeInfoTypes")
      private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> excludeInfoTypes;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> getExcludeInfoTypes() {
        return this.excludeInfoTypes == null ? Input.empty() : this.excludeInfoTypes;
    }

    /**
     * How the rule is applied. See the documentation for more information: https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#MatchingType
     * Possible values are `MATCHING_TYPE_FULL_MATCH`, `MATCHING_TYPE_PARTIAL_MATCH`, and `MATCHING_TYPE_INVERSE_MATCH`.
     * 
     */
    @InputImport(name="matchingType", required=true)
      private final Input<String> matchingType;

    public Input<String> getMatchingType() {
        return this.matchingType;
    }

    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="regex")
      private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> regex;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs(
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> dictionary,
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> excludeInfoTypes,
        Input<String> matchingType,
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> regex) {
        this.dictionary = dictionary;
        this.excludeInfoTypes = excludeInfoTypes;
        this.matchingType = Objects.requireNonNull(matchingType, "expected parameter 'matchingType' to be non-null");
        this.regex = regex;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs() {
        this.dictionary = Input.empty();
        this.excludeInfoTypes = Input.empty();
        this.matchingType = Input.empty();
        this.regex = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> dictionary;
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> excludeInfoTypes;
        private Input<String> matchingType;
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> regex;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.matchingType = defaults.matchingType;
    	      this.regex = defaults.regex;
        }

        public Builder setDictionary(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> dictionary) {
            this.dictionary = dictionary;
            return this;
        }

        public Builder setDictionary(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs dictionary) {
            this.dictionary = Input.ofNullable(dictionary);
            return this;
        }

        public Builder setExcludeInfoTypes(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder setExcludeInfoTypes(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs excludeInfoTypes) {
            this.excludeInfoTypes = Input.ofNullable(excludeInfoTypes);
            return this;
        }

        public Builder setMatchingType(Input<String> matchingType) {
            this.matchingType = Objects.requireNonNull(matchingType);
            return this;
        }

        public Builder setMatchingType(String matchingType) {
            this.matchingType = Input.of(Objects.requireNonNull(matchingType));
            return this;
        }

        public Builder setRegex(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs(dictionary, excludeInfoTypes, matchingType, regex);
        }
    }
}
