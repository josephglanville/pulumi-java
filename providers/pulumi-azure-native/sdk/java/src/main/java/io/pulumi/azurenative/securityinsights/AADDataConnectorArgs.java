// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.inputs.AlertsDataTypeOfDataConnectorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AADDataConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AADDataConnectorArgs Empty = new AADDataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @InputImport(name="dataConnectorId")
      private final @Nullable Output<String> dataConnectorId;

    public Output<String> getDataConnectorId() {
        return this.dataConnectorId == null ? Output.empty() : this.dataConnectorId;
    }

    /**
     * The available data types for the connector.
     * 
     */
    @InputImport(name="dataTypes")
      private final @Nullable Output<AlertsDataTypeOfDataConnectorArgs> dataTypes;

    public Output<AlertsDataTypeOfDataConnectorArgs> getDataTypes() {
        return this.dataTypes == null ? Output.empty() : this.dataTypes;
    }

    /**
     * The kind of the data connector
     * Expected value is 'AzureActiveDirectory'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tenant id to connect to, and get the data from.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public AADDataConnectorArgs(
        @Nullable Output<String> dataConnectorId,
        @Nullable Output<AlertsDataTypeOfDataConnectorArgs> dataTypes,
        Output<String> kind,
        Output<String> resourceGroupName,
        @Nullable Output<String> tenantId,
        Output<String> workspaceName) {
        this.dataConnectorId = dataConnectorId;
        this.dataTypes = dataTypes;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tenantId = tenantId;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private AADDataConnectorArgs() {
        this.dataConnectorId = Output.empty();
        this.dataTypes = Output.empty();
        this.kind = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tenantId = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AADDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataConnectorId;
        private @Nullable Output<AlertsDataTypeOfDataConnectorArgs> dataTypes;
        private Output<String> kind;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> tenantId;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AADDataConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectorId = defaults.dataConnectorId;
    	      this.dataTypes = defaults.dataTypes;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tenantId = defaults.tenantId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dataConnectorId(@Nullable Output<String> dataConnectorId) {
            this.dataConnectorId = dataConnectorId;
            return this;
        }

        public Builder dataConnectorId(@Nullable String dataConnectorId) {
            this.dataConnectorId = Output.ofNullable(dataConnectorId);
            return this;
        }

        public Builder dataTypes(@Nullable Output<AlertsDataTypeOfDataConnectorArgs> dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder dataTypes(@Nullable AlertsDataTypeOfDataConnectorArgs dataTypes) {
            this.dataTypes = Output.ofNullable(dataTypes);
            return this;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
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

        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Output.ofNullable(tenantId);
            return this;
        }

        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public AADDataConnectorArgs build() {
            return new AADDataConnectorArgs(dataConnectorId, dataTypes, kind, resourceGroupName, tenantId, workspaceName);
        }
    }
}
