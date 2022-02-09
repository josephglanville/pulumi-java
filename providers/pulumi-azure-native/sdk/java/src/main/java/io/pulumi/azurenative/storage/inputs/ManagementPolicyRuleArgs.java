// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.RuleType;
import io.pulumi.azurenative.storage.inputs.ManagementPolicyDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyRuleArgs Empty = new ManagementPolicyRuleArgs();

    @InputImport(name="definition", required=true)
    private final Input<ManagementPolicyDefinitionArgs> definition;

    public Input<ManagementPolicyDefinitionArgs> getDefinition() {
        return this.definition;
    }

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="type", required=true)
    private final Input<Either<String,RuleType>> type;

    public Input<Either<String,RuleType>> getType() {
        return this.type;
    }

    public ManagementPolicyRuleArgs(
        Input<ManagementPolicyDefinitionArgs> definition,
        @Nullable Input<Boolean> enabled,
        Input<String> name,
        Input<Either<String,RuleType>> type) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.enabled = enabled;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagementPolicyRuleArgs() {
        this.definition = Input.empty();
        this.enabled = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ManagementPolicyDefinitionArgs> definition;
        private @Nullable Input<Boolean> enabled;
        private Input<String> name;
        private Input<Either<String,RuleType>> type;

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

        public Builder setDefinition(Input<ManagementPolicyDefinitionArgs> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder setDefinition(ManagementPolicyDefinitionArgs definition) {
            this.definition = Input.of(Objects.requireNonNull(definition));
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(Input<Either<String,RuleType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,RuleType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ManagementPolicyRuleArgs build() {
            return new ManagementPolicyRuleArgs(definition, enabled, name, type);
        }
    }
}
