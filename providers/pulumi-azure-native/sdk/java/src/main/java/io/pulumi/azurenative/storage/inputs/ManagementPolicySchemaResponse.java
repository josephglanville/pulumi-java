// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ManagementPolicyRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
 * 
 */
public final class ManagementPolicySchemaResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementPolicySchemaResponse Empty = new ManagementPolicySchemaResponse();

    /**
     * The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    @InputImport(name="rules", required=true)
      private final List<ManagementPolicyRuleResponse> rules;

    public List<ManagementPolicyRuleResponse> getRules() {
        return this.rules;
    }

    public ManagementPolicySchemaResponse(List<ManagementPolicyRuleResponse> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private ManagementPolicySchemaResponse() {
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicySchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ManagementPolicyRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicySchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(List<ManagementPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public ManagementPolicySchemaResponse build() {
            return new ManagementPolicySchemaResponse(rules);
        }
    }
}
