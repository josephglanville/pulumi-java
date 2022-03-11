// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigInfoTypeGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigGetArgs Empty = new PreventionInspectTemplateInspectConfigGetArgs();

    /**
     * List of options defining data content to scan. If empty, text, images, and other content will be included.
     * Each value may be one of `CONTENT_TEXT` and `CONTENT_IMAGE`.
     * 
     */
    @InputImport(name="contentOptions")
      private final @Nullable Output<List<String>> contentOptions;

    public Output<List<String>> getContentOptions() {
        return this.contentOptions == null ? Output.empty() : this.contentOptions;
    }

    /**
     * Custom info types to be used. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * Structure is documented below.
     * 
     */
    @InputImport(name="customInfoTypes")
      private final @Nullable Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs>> customInfoTypes;

    public Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs>> getCustomInfoTypes() {
        return this.customInfoTypes == null ? Output.empty() : this.customInfoTypes;
    }

    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="excludeInfoTypes")
      private final @Nullable Output<Boolean> excludeInfoTypes;

    public Output<Boolean> getExcludeInfoTypes() {
        return this.excludeInfoTypes == null ? Output.empty() : this.excludeInfoTypes;
    }

    /**
     * When true, a contextual quote from the data that triggered a finding is included in the response.
     * 
     */
    @InputImport(name="includeQuote")
      private final @Nullable Output<Boolean> includeQuote;

    public Output<Boolean> getIncludeQuote() {
        return this.includeQuote == null ? Output.empty() : this.includeQuote;
    }

    /**
     * If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    @InputImport(name="infoTypes")
      private final @Nullable Output<List<PreventionInspectTemplateInspectConfigInfoTypeGetArgs>> infoTypes;

    public Output<List<PreventionInspectTemplateInspectConfigInfoTypeGetArgs>> getInfoTypes() {
        return this.infoTypes == null ? Output.empty() : this.infoTypes;
    }

    /**
     * Configuration to control the number of findings returned.
     * Structure is documented below.
     * 
     */
    @InputImport(name="limits")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigLimitsGetArgs> limits;

    public Output<PreventionInspectTemplateInspectConfigLimitsGetArgs> getLimits() {
        return this.limits == null ? Output.empty() : this.limits;
    }

    /**
     * Only returns findings equal or above this threshold. See https://cloud.google.com/dlp/docs/likelihood for more info
     * Default value is `POSSIBLE`.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    @InputImport(name="minLikelihood")
      private final @Nullable Output<String> minLikelihood;

    public Output<String> getMinLikelihood() {
        return this.minLikelihood == null ? Output.empty() : this.minLikelihood;
    }

    /**
     * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end,
     * other rules are executed in the order they are specified for each info type.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ruleSets")
      private final @Nullable Output<List<PreventionInspectTemplateInspectConfigRuleSetGetArgs>> ruleSets;

    public Output<List<PreventionInspectTemplateInspectConfigRuleSetGetArgs>> getRuleSets() {
        return this.ruleSets == null ? Output.empty() : this.ruleSets;
    }

    public PreventionInspectTemplateInspectConfigGetArgs(
        @Nullable Output<List<String>> contentOptions,
        @Nullable Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs>> customInfoTypes,
        @Nullable Output<Boolean> excludeInfoTypes,
        @Nullable Output<Boolean> includeQuote,
        @Nullable Output<List<PreventionInspectTemplateInspectConfigInfoTypeGetArgs>> infoTypes,
        @Nullable Output<PreventionInspectTemplateInspectConfigLimitsGetArgs> limits,
        @Nullable Output<String> minLikelihood,
        @Nullable Output<List<PreventionInspectTemplateInspectConfigRuleSetGetArgs>> ruleSets) {
        this.contentOptions = contentOptions;
        this.customInfoTypes = customInfoTypes;
        this.excludeInfoTypes = excludeInfoTypes;
        this.includeQuote = includeQuote;
        this.infoTypes = infoTypes;
        this.limits = limits;
        this.minLikelihood = minLikelihood;
        this.ruleSets = ruleSets;
    }

    private PreventionInspectTemplateInspectConfigGetArgs() {
        this.contentOptions = Output.empty();
        this.customInfoTypes = Output.empty();
        this.excludeInfoTypes = Output.empty();
        this.includeQuote = Output.empty();
        this.infoTypes = Output.empty();
        this.limits = Output.empty();
        this.minLikelihood = Output.empty();
        this.ruleSets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> contentOptions;
        private @Nullable Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs>> customInfoTypes;
        private @Nullable Output<Boolean> excludeInfoTypes;
        private @Nullable Output<Boolean> includeQuote;
        private @Nullable Output<List<PreventionInspectTemplateInspectConfigInfoTypeGetArgs>> infoTypes;
        private @Nullable Output<PreventionInspectTemplateInspectConfigLimitsGetArgs> limits;
        private @Nullable Output<String> minLikelihood;
        private @Nullable Output<List<PreventionInspectTemplateInspectConfigRuleSetGetArgs>> ruleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentOptions = defaults.contentOptions;
    	      this.customInfoTypes = defaults.customInfoTypes;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.includeQuote = defaults.includeQuote;
    	      this.infoTypes = defaults.infoTypes;
    	      this.limits = defaults.limits;
    	      this.minLikelihood = defaults.minLikelihood;
    	      this.ruleSets = defaults.ruleSets;
        }

        public Builder contentOptions(@Nullable Output<List<String>> contentOptions) {
            this.contentOptions = contentOptions;
            return this;
        }

        public Builder contentOptions(@Nullable List<String> contentOptions) {
            this.contentOptions = Output.ofNullable(contentOptions);
            return this;
        }

        public Builder customInfoTypes(@Nullable Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs>> customInfoTypes) {
            this.customInfoTypes = customInfoTypes;
            return this;
        }

        public Builder customInfoTypes(@Nullable List<PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs> customInfoTypes) {
            this.customInfoTypes = Output.ofNullable(customInfoTypes);
            return this;
        }

        public Builder excludeInfoTypes(@Nullable Output<Boolean> excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder excludeInfoTypes(@Nullable Boolean excludeInfoTypes) {
            this.excludeInfoTypes = Output.ofNullable(excludeInfoTypes);
            return this;
        }

        public Builder includeQuote(@Nullable Output<Boolean> includeQuote) {
            this.includeQuote = includeQuote;
            return this;
        }

        public Builder includeQuote(@Nullable Boolean includeQuote) {
            this.includeQuote = Output.ofNullable(includeQuote);
            return this;
        }

        public Builder infoTypes(@Nullable Output<List<PreventionInspectTemplateInspectConfigInfoTypeGetArgs>> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }

        public Builder infoTypes(@Nullable List<PreventionInspectTemplateInspectConfigInfoTypeGetArgs> infoTypes) {
            this.infoTypes = Output.ofNullable(infoTypes);
            return this;
        }

        public Builder limits(@Nullable Output<PreventionInspectTemplateInspectConfigLimitsGetArgs> limits) {
            this.limits = limits;
            return this;
        }

        public Builder limits(@Nullable PreventionInspectTemplateInspectConfigLimitsGetArgs limits) {
            this.limits = Output.ofNullable(limits);
            return this;
        }

        public Builder minLikelihood(@Nullable Output<String> minLikelihood) {
            this.minLikelihood = minLikelihood;
            return this;
        }

        public Builder minLikelihood(@Nullable String minLikelihood) {
            this.minLikelihood = Output.ofNullable(minLikelihood);
            return this;
        }

        public Builder ruleSets(@Nullable Output<List<PreventionInspectTemplateInspectConfigRuleSetGetArgs>> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }

        public Builder ruleSets(@Nullable List<PreventionInspectTemplateInspectConfigRuleSetGetArgs> ruleSets) {
            this.ruleSets = Output.ofNullable(ruleSets);
            return this;
        }
        public PreventionInspectTemplateInspectConfigGetArgs build() {
            return new PreventionInspectTemplateInspectConfigGetArgs(contentOptions, customInfoTypes, excludeInfoTypes, includeQuote, infoTypes, limits, minLikelihood, ruleSets);
        }
    }
}
