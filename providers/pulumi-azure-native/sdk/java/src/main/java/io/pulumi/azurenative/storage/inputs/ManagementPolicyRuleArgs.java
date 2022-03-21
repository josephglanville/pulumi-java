// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.RuleType;
import io.pulumi.azurenative.storage.inputs.ManagementPolicyDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that wraps the Lifecycle rule. Each rule is uniquely defined by name.
 * 
 */
public final class ManagementPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyRuleArgs Empty = new ManagementPolicyRuleArgs();

    /**
     * An object that defines the Lifecycle rule.
     * 
     */
    @Import(name="definition", required=true)
      private final Output<ManagementPolicyDefinitionArgs> definition;

    public Output<ManagementPolicyDefinitionArgs> getDefinition() {
        return this.definition;
    }

    /**
     * Rule is enabled if set to true.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The valid value is Lifecycle
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,RuleType>> type;

    public Output<Either<String,RuleType>> getType() {
        return this.type;
    }

    public ManagementPolicyRuleArgs(
        Output<ManagementPolicyDefinitionArgs> definition,
        @Nullable Output<Boolean> enabled,
        Output<String> name,
        Output<Either<String,RuleType>> type) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.enabled = enabled;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagementPolicyRuleArgs() {
        this.definition = Output.empty();
        this.enabled = Output.empty();
        this.name = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ManagementPolicyDefinitionArgs> definition;
        private @Nullable Output<Boolean> enabled;
        private Output<String> name;
        private Output<Either<String,RuleType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder definition(Output<ManagementPolicyDefinitionArgs> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        public Builder definition(ManagementPolicyDefinitionArgs definition) {
            this.definition = Output.of(Objects.requireNonNull(definition));
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder type(Output<Either<String,RuleType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(Either<String,RuleType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ManagementPolicyRuleArgs build() {
            return new ManagementPolicyRuleArgs(definition, enabled, name, type);
        }
    }
}
