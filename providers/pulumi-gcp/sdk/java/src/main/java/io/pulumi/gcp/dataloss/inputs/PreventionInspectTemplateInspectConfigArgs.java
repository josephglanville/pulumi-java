// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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

    @InputImport(name="contentOptions")
    private final @Nullable Input<List<String>> contentOptions;

    public Input<List<String>> getContentOptions() {
        return this.contentOptions == null ? Input.empty() : this.contentOptions;
    }

    @InputImport(name="customInfoTypes")
    private final @Nullable Input<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> customInfoTypes;

    public Input<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> getCustomInfoTypes() {
        return this.customInfoTypes == null ? Input.empty() : this.customInfoTypes;
    }

    @InputImport(name="excludeInfoTypes")
    private final @Nullable Input<Boolean> excludeInfoTypes;

    public Input<Boolean> getExcludeInfoTypes() {
        return this.excludeInfoTypes == null ? Input.empty() : this.excludeInfoTypes;
    }

    @InputImport(name="includeQuote")
    private final @Nullable Input<Boolean> includeQuote;

    public Input<Boolean> getIncludeQuote() {
        return this.includeQuote == null ? Input.empty() : this.includeQuote;
    }

    @InputImport(name="infoTypes")
    private final @Nullable Input<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> infoTypes;

    public Input<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> getInfoTypes() {
        return this.infoTypes == null ? Input.empty() : this.infoTypes;
    }

    @InputImport(name="limits")
    private final @Nullable Input<PreventionInspectTemplateInspectConfigLimitsArgs> limits;

    public Input<PreventionInspectTemplateInspectConfigLimitsArgs> getLimits() {
        return this.limits == null ? Input.empty() : this.limits;
    }

    @InputImport(name="minLikelihood")
    private final @Nullable Input<String> minLikelihood;

    public Input<String> getMinLikelihood() {
        return this.minLikelihood == null ? Input.empty() : this.minLikelihood;
    }

    @InputImport(name="ruleSets")
    private final @Nullable Input<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> ruleSets;

    public Input<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> getRuleSets() {
        return this.ruleSets == null ? Input.empty() : this.ruleSets;
    }

    public PreventionInspectTemplateInspectConfigArgs(
        @Nullable Input<List<String>> contentOptions,
        @Nullable Input<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> customInfoTypes,
        @Nullable Input<Boolean> excludeInfoTypes,
        @Nullable Input<Boolean> includeQuote,
        @Nullable Input<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> infoTypes,
        @Nullable Input<PreventionInspectTemplateInspectConfigLimitsArgs> limits,
        @Nullable Input<String> minLikelihood,
        @Nullable Input<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> ruleSets) {
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
        this.contentOptions = Input.empty();
        this.customInfoTypes = Input.empty();
        this.excludeInfoTypes = Input.empty();
        this.includeQuote = Input.empty();
        this.infoTypes = Input.empty();
        this.limits = Input.empty();
        this.minLikelihood = Input.empty();
        this.ruleSets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> contentOptions;
        private @Nullable Input<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> customInfoTypes;
        private @Nullable Input<Boolean> excludeInfoTypes;
        private @Nullable Input<Boolean> includeQuote;
        private @Nullable Input<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> infoTypes;
        private @Nullable Input<PreventionInspectTemplateInspectConfigLimitsArgs> limits;
        private @Nullable Input<String> minLikelihood;
        private @Nullable Input<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> ruleSets;

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

        public Builder setContentOptions(@Nullable Input<List<String>> contentOptions) {
            this.contentOptions = contentOptions;
            return this;
        }

        public Builder setContentOptions(@Nullable List<String> contentOptions) {
            this.contentOptions = Input.ofNullable(contentOptions);
            return this;
        }

        public Builder setCustomInfoTypes(@Nullable Input<List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs>> customInfoTypes) {
            this.customInfoTypes = customInfoTypes;
            return this;
        }

        public Builder setCustomInfoTypes(@Nullable List<PreventionInspectTemplateInspectConfigCustomInfoTypeArgs> customInfoTypes) {
            this.customInfoTypes = Input.ofNullable(customInfoTypes);
            return this;
        }

        public Builder setExcludeInfoTypes(@Nullable Input<Boolean> excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder setExcludeInfoTypes(@Nullable Boolean excludeInfoTypes) {
            this.excludeInfoTypes = Input.ofNullable(excludeInfoTypes);
            return this;
        }

        public Builder setIncludeQuote(@Nullable Input<Boolean> includeQuote) {
            this.includeQuote = includeQuote;
            return this;
        }

        public Builder setIncludeQuote(@Nullable Boolean includeQuote) {
            this.includeQuote = Input.ofNullable(includeQuote);
            return this;
        }

        public Builder setInfoTypes(@Nullable Input<List<PreventionInspectTemplateInspectConfigInfoTypeArgs>> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }

        public Builder setInfoTypes(@Nullable List<PreventionInspectTemplateInspectConfigInfoTypeArgs> infoTypes) {
            this.infoTypes = Input.ofNullable(infoTypes);
            return this;
        }

        public Builder setLimits(@Nullable Input<PreventionInspectTemplateInspectConfigLimitsArgs> limits) {
            this.limits = limits;
            return this;
        }

        public Builder setLimits(@Nullable PreventionInspectTemplateInspectConfigLimitsArgs limits) {
            this.limits = Input.ofNullable(limits);
            return this;
        }

        public Builder setMinLikelihood(@Nullable Input<String> minLikelihood) {
            this.minLikelihood = minLikelihood;
            return this;
        }

        public Builder setMinLikelihood(@Nullable String minLikelihood) {
            this.minLikelihood = Input.ofNullable(minLikelihood);
            return this;
        }

        public Builder setRuleSets(@Nullable Input<List<PreventionInspectTemplateInspectConfigRuleSetArgs>> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }

        public Builder setRuleSets(@Nullable List<PreventionInspectTemplateInspectConfigRuleSetArgs> ruleSets) {
            this.ruleSets = Input.ofNullable(ruleSets);
            return this;
        }

        public PreventionInspectTemplateInspectConfigArgs build() {
            return new PreventionInspectTemplateInspectConfigArgs(contentOptions, customInfoTypes, excludeInfoTypes, includeQuote, infoTypes, limits, minLikelihood, ruleSets);
        }
    }
}