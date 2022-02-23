// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.ConnectionTypeAssociationPropertyArgs;
import io.pulumi.core.Input;
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
      private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The parameters supplied to the create or update connection operation.
     * 
     */
    @InputImport(name="connectionName")
      private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
    }

    /**
     * Gets or sets the connectionType of the connection.
     * 
     */
    @InputImport(name="connectionType", required=true)
      private final Input<ConnectionTypeAssociationPropertyArgs> connectionType;

    public Input<ConnectionTypeAssociationPropertyArgs> getConnectionType() {
        return this.connectionType;
    }

    /**
     * Gets or sets the description of the connection.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Gets or sets the field definition properties of the connection.
     * 
     */
    @InputImport(name="fieldDefinitionValues")
      private final @Nullable Input<Map<String,String>> fieldDefinitionValues;

    public Input<Map<String,String>> getFieldDefinitionValues() {
        return this.fieldDefinitionValues == null ? Input.empty() : this.fieldDefinitionValues;
    }

    /**
     * Gets or sets the name of the connection.
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

    public ConnectionArgs(
        Input<String> automationAccountName,
        @Nullable Input<String> connectionName,
        Input<ConnectionTypeAssociationPropertyArgs> connectionType,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> fieldDefinitionValues,
        Input<String> name,
        Input<String> resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.connectionName = connectionName;
        this.connectionType = Objects.requireNonNull(connectionType, "expected parameter 'connectionType' to be non-null");
        this.description = description;
        this.fieldDefinitionValues = fieldDefinitionValues;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ConnectionArgs() {
        this.automationAccountName = Input.empty();
        this.connectionName = Input.empty();
        this.connectionType = Input.empty();
        this.description = Input.empty();
        this.fieldDefinitionValues = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<String> connectionName;
        private Input<ConnectionTypeAssociationPropertyArgs> connectionType;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> fieldDefinitionValues;
        private Input<String> name;
        private Input<String> resourceGroupName;

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

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setConnectionName(@Nullable Input<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = Input.ofNullable(connectionName);
            return this;
        }

        public Builder setConnectionType(Input<ConnectionTypeAssociationPropertyArgs> connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }

        public Builder setConnectionType(ConnectionTypeAssociationPropertyArgs connectionType) {
            this.connectionType = Input.of(Objects.requireNonNull(connectionType));
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

        public Builder setFieldDefinitionValues(@Nullable Input<Map<String,String>> fieldDefinitionValues) {
            this.fieldDefinitionValues = fieldDefinitionValues;
            return this;
        }

        public Builder setFieldDefinitionValues(@Nullable Map<String,String> fieldDefinitionValues) {
            this.fieldDefinitionValues = Input.ofNullable(fieldDefinitionValues);
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
        public ConnectionArgs build() {
            return new ConnectionArgs(automationAccountName, connectionName, connectionType, description, fieldDefinitionValues, name, resourceGroupName);
        }
    }
}
