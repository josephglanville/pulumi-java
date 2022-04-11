// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigInfoTypeArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigArgs Empty = new PreventionInspectTemplateInspectConfigArgs();

    /**
     * List of options defining data content to scan. If empty, text, images, and other content will be included.
     * Each value may be one of `CONTENT_TEXT` and `CONTENT_IMAGE`.
     * 
     */
    @Import(name="contentOptions")
      private final @Nullable Output<List<String>> contentOptions;

    public Output<List<String>> getContentOptions() {
        return this.contentOptions == null ? Codegen.empty() : this.contentOptions;
    }

    /**
     * Custom info types to be used. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * Structure is documented below.
     * 
     */
    @Import(name="customInfoTypes")
      private final @Nullable Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> customInfoTypes;

    public Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> getCustomInfoTypes() {
        return this.customInfoTypes == null ? Codegen.empty() : this.customInfoTypes;
    }

    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
     */
    @Import(name="excludeInfoTypes")
      private final @Nullable Output<Boolean> excludeInfoTypes;

    public Output<Boolean> getExcludeInfoTypes() {
        return this.excludeInfoTypes == null ? Codegen.empty() : this.excludeInfoTypes;
    }

    /**
     * When true, a contextual quote from the data that triggered a finding is included in the response.
     * 
     */
    @Import(name="includeQuote")
      private final @Nullable Output<Boolean> includeQuote;

    public Output<Boolean> getIncludeQuote() {
        return this.includeQuote == null ? Codegen.empty() : this.includeQuote;
    }

    /**
     * If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    @Import(name="infoTypes")
      private final @Nullable Output<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> infoTypes;

    public Output<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> getInfoTypes() {
        return this.infoTypes == null ? Codegen.empty() : this.infoTypes;
    }

    /**
     * Configuration to control the number of findings returned.
     * Structure is documented below.
     * 
     */
    @Import(name="limits")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigLimitsArgs> limits;

    public Output<PreventionInspectTemplateInspectConfigLimitsArgs> getLimits() {
        return this.limits == null ? Codegen.empty() : this.limits;
    }

    /**
     * Only returns findings equal or above this threshold. See https://cloud.google.com/dlp/docs/likelihood for more info
     * Default value is `POSSIBLE`.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    @Import(name="minLikelihood")
      private final @Nullable Output<String> minLikelihood;

    public Output<String> getMinLikelihood() {
        return this.minLikelihood == null ? Codegen.empty() : this.minLikelihood;
    }

    /**
     * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end,
     * other rules are executed in the order they are specified for each info type.
     * Structure is documented below.
     * 
     */
    @Import(name="ruleSets")
      private final @Nullable Output<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> ruleSets;

    public Output<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> getRuleSets() {
        return this.ruleSets == null ? Codegen.empty() : this.ruleSets;
    }

    public PreventionInspectTemplateInspectConfigArgs(
        @Nullable Output<List<String>> contentOptions,
        @Nullable Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> customInfoTypes,
        @Nullable Output<Boolean> excludeInfoTypes,
        @Nullable Output<Boolean> includeQuote,
        @Nullable Output<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> infoTypes,
        @Nullable Output<PreventionInspectTemplateInspectConfigLimitsArgs> limits,
        @Nullable Output<String> minLikelihood,
        @Nullable Output<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> ruleSets) {
        this.contentOptions = contentOptions;
        this.customInfoTypes = customInfoTypes;
        this.excludeInfoTypes = excludeInfoTypes;
        this.includeQuote = includeQuote;
        this.infoTypes = infoTypes;
        this.limits = limits;
        this.minLikelihood = minLikelihood;
        this.ruleSets = ruleSets;
    }

    private PreventionInspectTemplateInspectConfigArgs() {
        this.contentOptions = Codegen.empty();
        this.customInfoTypes = Codegen.empty();
        this.excludeInfoTypes = Codegen.empty();
        this.includeQuote = Codegen.empty();
        this.infoTypes = Codegen.empty();
        this.limits = Codegen.empty();
        this.minLikelihood = Codegen.empty();
        this.ruleSets = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> contentOptions;
        private @Nullable Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> customInfoTypes;
        private @Nullable Output<Boolean> excludeInfoTypes;
        private @Nullable Output<Boolean> includeQuote;
        private @Nullable Output<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> infoTypes;
        private @Nullable Output<PreventionInspectTemplateInspectConfigLimitsArgs> limits;
        private @Nullable Output<String> minLikelihood;
        private @Nullable Output<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> ruleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigArgs defaults) {
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
            this.contentOptions = Codegen.ofNullable(contentOptions);
            return this;
        }
        public Builder contentOptions(String... contentOptions) {
            return contentOptions(List.of(contentOptions));
        }
        public Builder customInfoTypes(@Nullable Output<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> customInfoTypes) {
            this.customInfoTypes = customInfoTypes;
            return this;
        }
        public Builder customInfoTypes(@Nullable List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs> customInfoTypes) {
            this.customInfoTypes = Codegen.ofNullable(customInfoTypes);
            return this;
        }
        public Builder customInfoTypes(PreventionInspectTemplateInspectConfigCustomInfoTypeArgs... customInfoTypes) {
            return customInfoTypes(List.of(customInfoTypes));
        }
        public Builder excludeInfoTypes(@Nullable Output<Boolean> excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }
        public Builder excludeInfoTypes(@Nullable Boolean excludeInfoTypes) {
            this.excludeInfoTypes = Codegen.ofNullable(excludeInfoTypes);
            return this;
        }
        public Builder includeQuote(@Nullable Output<Boolean> includeQuote) {
            this.includeQuote = includeQuote;
            return this;
        }
        public Builder includeQuote(@Nullable Boolean includeQuote) {
            this.includeQuote = Codegen.ofNullable(includeQuote);
            return this;
        }
        public Builder infoTypes(@Nullable Output<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }
        public Builder infoTypes(@Nullable List<PreventionInspectTemplateInspectConfigInfoTypeArgs> infoTypes) {
            this.infoTypes = Codegen.ofNullable(infoTypes);
            return this;
        }
        public Builder infoTypes(PreventionInspectTemplateInspectConfigInfoTypeArgs... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder limits(@Nullable Output<PreventionInspectTemplateInspectConfigLimitsArgs> limits) {
            this.limits = limits;
            return this;
        }
        public Builder limits(@Nullable PreventionInspectTemplateInspectConfigLimitsArgs limits) {
            this.limits = Codegen.ofNullable(limits);
            return this;
        }
        public Builder minLikelihood(@Nullable Output<String> minLikelihood) {
            this.minLikelihood = minLikelihood;
            return this;
        }
        public Builder minLikelihood(@Nullable String minLikelihood) {
            this.minLikelihood = Codegen.ofNullable(minLikelihood);
            return this;
        }
        public Builder ruleSets(@Nullable Output<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }
        public Builder ruleSets(@Nullable List<PreventionInspectTemplateInspectConfigRuleSetArgs> ruleSets) {
            this.ruleSets = Codegen.ofNullable(ruleSets);
            return this;
        }
        public Builder ruleSets(PreventionInspectTemplateInspectConfigRuleSetArgs... ruleSets) {
            return ruleSets(List.of(ruleSets));
        }        public PreventionInspectTemplateInspectConfigArgs build() {
            return new PreventionInspectTemplateInspectConfigArgs(contentOptions, customInfoTypes, excludeInfoTypes, includeQuote, infoTypes, limits, minLikelihood, ruleSets);
        }
    }
}
