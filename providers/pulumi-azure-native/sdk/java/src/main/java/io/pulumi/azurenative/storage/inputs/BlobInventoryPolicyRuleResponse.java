// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.BlobInventoryPolicyDefinitionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * An object that wraps the blob inventory rule. Each rule is uniquely defined by name.
 * 
 */
public final class BlobInventoryPolicyRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlobInventoryPolicyRuleResponse Empty = new BlobInventoryPolicyRuleResponse();

    /**
     * An object that defines the blob inventory policy rule.
     * 
     */
    @Import(name="definition", required=true)
      private final BlobInventoryPolicyDefinitionResponse definition;

    public BlobInventoryPolicyDefinitionResponse getDefinition() {
        return this.definition;
    }

    /**
     * Rule is enabled when set to true.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public BlobInventoryPolicyRuleResponse(
        BlobInventoryPolicyDefinitionResponse definition,
        Boolean enabled,
        String name) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private BlobInventoryPolicyRuleResponse() {
        this.definition = null;
        this.enabled = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyDefinitionResponse definition;
        private Boolean enabled;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
        }

        public Builder definition(BlobInventoryPolicyDefinitionResponse definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public BlobInventoryPolicyRuleResponse build() {
            return new BlobInventoryPolicyRuleResponse(definition, enabled, name);
        }
    }
}
