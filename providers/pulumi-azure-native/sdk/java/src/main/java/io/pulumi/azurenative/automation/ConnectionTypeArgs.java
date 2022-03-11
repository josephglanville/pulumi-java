// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.FieldDefinitionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionTypeArgs Empty = new ConnectionTypeArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The parameters supplied to the create or update connection type operation.
     * 
     */
    @InputImport(name="connectionTypeName")
      private final @Nullable Output<String> connectionTypeName;

    public Output<String> getConnectionTypeName() {
        return this.connectionTypeName == null ? Output.empty() : this.connectionTypeName;
    }

    /**
     * Gets or sets the field definitions of the connection type.
     * 
     */
    @InputImport(name="fieldDefinitions", required=true)
      private final Output<Map<String,FieldDefinitionArgs>> fieldDefinitions;

    public Output<Map<String,FieldDefinitionArgs>> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    /**
     * Gets or sets a Boolean value to indicate if the connection type is global.
     * 
     */
    @InputImport(name="isGlobal")
      private final @Nullable Output<Boolean> isGlobal;

    public Output<Boolean> getIsGlobal() {
        return this.isGlobal == null ? Output.empty() : this.isGlobal;
    }

    /**
     * Gets or sets the name of the connection type.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ConnectionTypeArgs(
        Output<String> automationAccountName,
        @Nullable Output<String> connectionTypeName,
        Output<Map<String,FieldDefinitionArgs>> fieldDefinitions,
        @Nullable Output<Boolean> isGlobal,
        Output<String> name,
        Output<String> resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.connectionTypeName = connectionTypeName;
        this.fieldDefinitions = Objects.requireNonNull(fieldDefinitions, "expected parameter 'fieldDefinitions' to be non-null");
        this.isGlobal = isGlobal;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ConnectionTypeArgs() {
        this.automationAccountName = Output.empty();
        this.connectionTypeName = Output.empty();
        this.fieldDefinitions = Output.empty();
        this.isGlobal = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private @Nullable Output<String> connectionTypeName;
        private Output<Map<String,FieldDefinitionArgs>> fieldDefinitions;
        private @Nullable Output<Boolean> isGlobal;
        private Output<String> name;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.connectionTypeName = defaults.connectionTypeName;
    	      this.fieldDefinitions = defaults.fieldDefinitions;
    	      this.isGlobal = defaults.isGlobal;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder connectionTypeName(@Nullable Output<String> connectionTypeName) {
            this.connectionTypeName = connectionTypeName;
            return this;
        }

        public Builder connectionTypeName(@Nullable String connectionTypeName) {
            this.connectionTypeName = Output.ofNullable(connectionTypeName);
            return this;
        }

        public Builder fieldDefinitions(Output<Map<String,FieldDefinitionArgs>> fieldDefinitions) {
            this.fieldDefinitions = Objects.requireNonNull(fieldDefinitions);
            return this;
        }

        public Builder fieldDefinitions(Map<String,FieldDefinitionArgs> fieldDefinitions) {
            this.fieldDefinitions = Output.of(Objects.requireNonNull(fieldDefinitions));
            return this;
        }

        public Builder isGlobal(@Nullable Output<Boolean> isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder isGlobal(@Nullable Boolean isGlobal) {
            this.isGlobal = Output.ofNullable(isGlobal);
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

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public ConnectionTypeArgs build() {
            return new ConnectionTypeArgs(automationAccountName, connectionTypeName, fieldDefinitions, isGlobal, name, resourceGroupName);
        }
    }
}
