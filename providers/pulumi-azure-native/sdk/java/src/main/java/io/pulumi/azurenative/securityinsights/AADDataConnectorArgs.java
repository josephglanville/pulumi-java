// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.inputs.AlertsDataTypeOfDataConnectorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AADDataConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AADDataConnectorArgs Empty = new AADDataConnectorArgs();

    @InputImport(name="dataConnectorId")
    private final @Nullable Input<String> dataConnectorId;

    public Input<String> getDataConnectorId() {
        return this.dataConnectorId == null ? Input.empty() : this.dataConnectorId;
    }

    @InputImport(name="dataTypes")
    private final @Nullable Input<AlertsDataTypeOfDataConnectorArgs> dataTypes;

    public Input<AlertsDataTypeOfDataConnectorArgs> getDataTypes() {
        return this.dataTypes == null ? Input.empty() : this.dataTypes;
    }

    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tenantId")
    private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public AADDataConnectorArgs(
        @Nullable Input<String> dataConnectorId,
        @Nullable Input<AlertsDataTypeOfDataConnectorArgs> dataTypes,
        Input<String> kind,
        Input<String> resourceGroupName,
        @Nullable Input<String> tenantId,
        Input<String> workspaceName) {
        this.dataConnectorId = dataConnectorId;
        this.dataTypes = dataTypes;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tenantId = tenantId;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private AADDataConnectorArgs() {
        this.dataConnectorId = Input.empty();
        this.dataTypes = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tenantId = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AADDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataConnectorId;
        private @Nullable Input<AlertsDataTypeOfDataConnectorArgs> dataTypes;
        private Input<String> kind;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> tenantId;
        private Input<String> workspaceName;

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

        public Builder setDataConnectorId(@Nullable Input<String> dataConnectorId) {
            this.dataConnectorId = dataConnectorId;
            return this;
        }

        public Builder setDataConnectorId(@Nullable String dataConnectorId) {
            this.dataConnectorId = Input.ofNullable(dataConnectorId);
            return this;
        }

        public Builder setDataTypes(@Nullable Input<AlertsDataTypeOfDataConnectorArgs> dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder setDataTypes(@Nullable AlertsDataTypeOfDataConnectorArgs dataTypes) {
            this.dataTypes = Input.ofNullable(dataTypes);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public AADDataConnectorArgs build() {
            return new AADDataConnectorArgs(dataConnectorId, dataTypes, kind, resourceGroupName, tenantId, workspaceName);
        }
    }
}
