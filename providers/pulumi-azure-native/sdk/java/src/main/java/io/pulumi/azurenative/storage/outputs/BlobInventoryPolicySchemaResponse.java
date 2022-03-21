// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.BlobInventoryPolicyRuleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BlobInventoryPolicySchemaResponse {
    /**
     * Container name where blob inventory files are stored. Must be pre-created.
     * 
     */
    private final String destination;
    /**
     * Policy is enabled if set to true.
     * 
     */
    private final Boolean enabled;
    /**
     * The storage account blob inventory policy rules. The rule is applied when it is enabled.
     * 
     */
    private final List<BlobInventoryPolicyRuleResponse> rules;
    /**
     * The valid value is Inventory
     * 
     */
    private final String type;

    @CustomType.Constructor
    private BlobInventoryPolicySchemaResponse(
        @CustomType.Parameter("destination") String destination,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("rules") List<BlobInventoryPolicyRuleResponse> rules,
        @CustomType.Parameter("type") String type) {
        this.destination = destination;
        this.enabled = enabled;
        this.rules = rules;
        this.type = type;
    }

    /**
     * Container name where blob inventory files are stored. Must be pre-created.
     * 
    */
    public String getDestination() {
        return this.destination;
    }
    /**
     * Policy is enabled if set to true.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The storage account blob inventory policy rules. The rule is applied when it is enabled.
     * 
    */
    public List<BlobInventoryPolicyRuleResponse> getRules() {
        return this.rules;
    }
    /**
     * The valid value is Inventory
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicySchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private Boolean enabled;
        private List<BlobInventoryPolicyRuleResponse> rules;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicySchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder rules(List<BlobInventoryPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(BlobInventoryPolicyRuleResponse... rules) {
            return rules(List.of(rules));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public BlobInventoryPolicySchemaResponse build() {
            return new BlobInventoryPolicySchemaResponse(destination, enabled, rules, type);
        }
    }
}
