// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final VariableArgs Empty = new VariableArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
      private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the description of the variable.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Gets or sets the encrypted flag of the variable.
     * 
     */
    @InputImport(name="isEncrypted")
      private final @Nullable Input<Boolean> isEncrypted;

    public Input<Boolean> getIsEncrypted() {
        return this.isEncrypted == null ? Input.empty() : this.isEncrypted;
    }

    /**
     * Gets or sets the name of the variable.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the value of the variable.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    /**
     * The variable name.
     * 
     */
    @InputImport(name="variableName")
      private final @Nullable Input<String> variableName;

    public Input<String> getVariableName() {
        return this.variableName == null ? Input.empty() : this.variableName;
    }

    public VariableArgs(
        Input<String> automationAccountName,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> isEncrypted,
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> value,
        @Nullable Input<String> variableName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.description = description;
        this.isEncrypted = isEncrypted;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.value = value;
        this.variableName = variableName;
    }

    private VariableArgs() {
        this.automationAccountName = Input.empty();
        this.description = Input.empty();
        this.isEncrypted = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.value = Input.empty();
        this.variableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> isEncrypted;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> value;
        private @Nullable Input<String> variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(VariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.description = defaults.description;
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.value = defaults.value;
    	      this.variableName = defaults.variableName;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIsEncrypted(@Nullable Input<Boolean> isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }

        public Builder setIsEncrypted(@Nullable Boolean isEncrypted) {
            this.isEncrypted = Input.ofNullable(isEncrypted);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder setVariableName(@Nullable Input<String> variableName) {
            this.variableName = variableName;
            return this;
        }

        public Builder setVariableName(@Nullable String variableName) {
            this.variableName = Input.ofNullable(variableName);
            return this;
        }
        public VariableArgs build() {
            return new VariableArgs(automationAccountName, description, isEncrypted, name, resourceGroupName, value, variableName);
        }
    }
}
