// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.ConnectionTypeAssociationPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

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
     * The parameters supplied to the create or update connection operation.
     * 
     */
    @InputImport(name="connectionName")
      private final @Nullable Output<String> connectionName;

    public Output<String> getConnectionName() {
        return this.connectionName == null ? Output.empty() : this.connectionName;
    }

    /**
     * Gets or sets the connectionType of the connection.
     * 
     */
    @InputImport(name="connectionType", required=true)
      private final Output<ConnectionTypeAssociationPropertyArgs> connectionType;

    public Output<ConnectionTypeAssociationPropertyArgs> getConnectionType() {
        return this.connectionType;
    }

    /**
     * Gets or sets the description of the connection.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Gets or sets the field definition properties of the connection.
     * 
     */
    @InputImport(name="fieldDefinitionValues")
      private final @Nullable Output<Map<String,String>> fieldDefinitionValues;

    public Output<Map<String,String>> getFieldDefinitionValues() {
        return this.fieldDefinitionValues == null ? Output.empty() : this.fieldDefinitionValues;
    }

    /**
     * Gets or sets the name of the connection.
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

    public ConnectionArgs(
        Output<String> automationAccountName,
        @Nullable Output<String> connectionName,
        Output<ConnectionTypeAssociationPropertyArgs> connectionType,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> fieldDefinitionValues,
        Output<String> name,
        Output<String> resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.connectionName = connectionName;
        this.connectionType = Objects.requireNonNull(connectionType, "expected parameter 'connectionType' to be non-null");
        this.description = description;
        this.fieldDefinitionValues = fieldDefinitionValues;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ConnectionArgs() {
        this.automationAccountName = Output.empty();
        this.connectionName = Output.empty();
        this.connectionType = Output.empty();
        this.description = Output.empty();
        this.fieldDefinitionValues = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private @Nullable Output<String> connectionName;
        private Output<ConnectionTypeAssociationPropertyArgs> connectionType;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> fieldDefinitionValues;
        private Output<String> name;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.connectionName = defaults.connectionName;
    	      this.connectionType = defaults.connectionType;
    	      this.description = defaults.description;
    	      this.fieldDefinitionValues = defaults.fieldDefinitionValues;
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

        public Builder connectionName(@Nullable Output<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Output.ofNullable(connectionName);
            return this;
        }

        public Builder connectionType(Output<ConnectionTypeAssociationPropertyArgs> connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }

        public Builder connectionType(ConnectionTypeAssociationPropertyArgs connectionType) {
            this.connectionType = Output.of(Objects.requireNonNull(connectionType));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder fieldDefinitionValues(@Nullable Output<Map<String,String>> fieldDefinitionValues) {
            this.fieldDefinitionValues = fieldDefinitionValues;
            return this;
        }

        public Builder fieldDefinitionValues(@Nullable Map<String,String> fieldDefinitionValues) {
            this.fieldDefinitionValues = Output.ofNullable(fieldDefinitionValues);
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
        public ConnectionArgs build() {
            return new ConnectionArgs(automationAccountName, connectionName, connectionType, description, fieldDefinitionValues, name, resourceGroupName);
        }
    }
}
