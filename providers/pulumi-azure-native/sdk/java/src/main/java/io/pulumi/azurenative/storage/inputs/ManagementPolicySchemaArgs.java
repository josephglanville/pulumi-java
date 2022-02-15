// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ManagementPolicyRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class ManagementPolicySchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicySchemaArgs Empty = new ManagementPolicySchemaArgs();

    @InputImport(name="rules", required=true)
    private final Input<List<ManagementPolicyRuleArgs>> rules;

    public Input<List<ManagementPolicyRuleArgs>> getRules() {
        return this.rules;
    }

    public ManagementPolicySchemaArgs(Input<List<ManagementPolicyRuleArgs>> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private ManagementPolicySchemaArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicySchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ManagementPolicyRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicySchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(Input<List<ManagementPolicyRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<ManagementPolicyRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }

        public ManagementPolicySchemaArgs build() {
            return new ManagementPolicySchemaArgs(rules);
        }
    }
}