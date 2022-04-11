// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs;
import java.util.List;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetGetArgs();

    /**
     * If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    @Import(name="infoTypes", required=true)
      private final Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> infoTypes;

    public Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> getInfoTypes() {
        return this.infoTypes;
    }

    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * Structure is documented below.
     * 
     */
    @Import(name="rules", required=true)
      private final Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> rules;

    public Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> getRules() {
        return this.rules;
    }

    public PreventionInspectTemplateInspectConfigRuleSetGetArgs(
        Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> infoTypes,
        Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> rules) {
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigRuleSetGetArgs() {
        this.infoTypes = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> infoTypes;
        private Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder infoTypes(Output<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public Builder infoTypes(List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs> infoTypes) {
            this.infoTypes = Output.of(Objects.requireNonNull(infoTypes));
            return this;
        }
        public Builder infoTypes(PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder rules(Output<List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(List<PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs> rules) {
            this.rules = Output.of(Objects.requireNonNull(rules));
            return this;
        }
        public Builder rules(PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs... rules) {
            return rules(List.of(rules));
        }        public PreventionInspectTemplateInspectConfigRuleSetGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetGetArgs(infoTypes, rules);
        }
    }
}
