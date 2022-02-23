// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.DataConnectorKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataConnectorArgs Empty = new DataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @InputImport(name="dataConnectorId")
      private final @Nullable Input<String> dataConnectorId;

    public Input<String> getDataConnectorId() {
        return this.dataConnectorId == null ? Input.empty() : this.dataConnectorId;
    }

    /**
     * The data connector kind
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,DataConnectorKind>> kind;

    public Input<Either<String,DataConnectorKind>> getKind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public DataConnectorArgs(
        @Nullable Input<String> dataConnectorId,
        Input<Either<String,DataConnectorKind>> kind,
        Input<String> resourceGroupName,
        Input<String> workspaceName) {
        this.dataConnectorId = dataConnectorId;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private DataConnectorArgs() {
        this.dataConnectorId = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataConnectorId;
        private Input<Either<String,DataConnectorKind>> kind;
        private Input<String> resourceGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectorId = defaults.dataConnectorId;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
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

        public Builder setKind(Input<Either<String,DataConnectorKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,DataConnectorKind> kind) {
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

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public DataConnectorArgs build() {
            return new DataConnectorArgs(dataConnectorId, kind, resourceGroupName, workspaceName);
        }
    }
}
