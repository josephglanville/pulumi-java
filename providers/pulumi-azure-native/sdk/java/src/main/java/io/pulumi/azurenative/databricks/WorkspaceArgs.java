// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks;

import io.pulumi.azurenative.databricks.inputs.SkuArgs;
import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomParametersArgs;
import io.pulumi.azurenative.databricks.inputs.WorkspaceProviderAuthorizationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The workspace provider authorizations.
     * 
     */
    @InputImport(name="authorizations")
      private final @Nullable Input<List<WorkspaceProviderAuthorizationArgs>> authorizations;

    public Input<List<WorkspaceProviderAuthorizationArgs>> getAuthorizations() {
        return this.authorizations == null ? Input.empty() : this.authorizations;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The managed resource group Id.
     * 
     */
    @InputImport(name="managedResourceGroupId", required=true)
      private final Input<String> managedResourceGroupId;

    public Input<String> getManagedResourceGroupId() {
        return this.managedResourceGroupId;
    }

    /**
     * The workspace's custom parameters.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<WorkspaceCustomParametersArgs> parameters;

    public Input<WorkspaceCustomParametersArgs> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the resource.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The blob URI where the UI definition file is located.
     * 
     */
    @InputImport(name="uiDefinitionUri")
      private final @Nullable Input<String> uiDefinitionUri;

    public Input<String> getUiDefinitionUri() {
        return this.uiDefinitionUri == null ? Input.empty() : this.uiDefinitionUri;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName")
      private final @Nullable Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName == null ? Input.empty() : this.workspaceName;
    }

    public WorkspaceArgs(
        @Nullable Input<List<WorkspaceProviderAuthorizationArgs>> authorizations,
        @Nullable Input<String> location,
        Input<String> managedResourceGroupId,
        @Nullable Input<WorkspaceCustomParametersArgs> parameters,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> uiDefinitionUri,
        @Nullable Input<String> workspaceName) {
        this.authorizations = authorizations;
        this.location = location;
        this.managedResourceGroupId = Objects.requireNonNull(managedResourceGroupId, "expected parameter 'managedResourceGroupId' to be non-null");
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.uiDefinitionUri = uiDefinitionUri;
        this.workspaceName = workspaceName;
    }

    private WorkspaceArgs() {
        this.authorizations = Input.empty();
        this.location = Input.empty();
        this.managedResourceGroupId = Input.empty();
        this.parameters = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.uiDefinitionUri = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WorkspaceProviderAuthorizationArgs>> authorizations;
        private @Nullable Input<String> location;
        private Input<String> managedResourceGroupId;
        private @Nullable Input<WorkspaceCustomParametersArgs> parameters;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> uiDefinitionUri;
        private @Nullable Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizations = defaults.authorizations;
    	      this.location = defaults.location;
    	      this.managedResourceGroupId = defaults.managedResourceGroupId;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.uiDefinitionUri = defaults.uiDefinitionUri;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setAuthorizations(@Nullable Input<List<WorkspaceProviderAuthorizationArgs>> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        public Builder setAuthorizations(@Nullable List<WorkspaceProviderAuthorizationArgs> authorizations) {
            this.authorizations = Input.ofNullable(authorizations);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedResourceGroupId(Input<String> managedResourceGroupId) {
            this.managedResourceGroupId = Objects.requireNonNull(managedResourceGroupId);
            return this;
        }

        public Builder setManagedResourceGroupId(String managedResourceGroupId) {
            this.managedResourceGroupId = Input.of(Objects.requireNonNull(managedResourceGroupId));
            return this;
        }

        public Builder setParameters(@Nullable Input<WorkspaceCustomParametersArgs> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable WorkspaceCustomParametersArgs parameters) {
            this.parameters = Input.ofNullable(parameters);
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

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUiDefinitionUri(@Nullable Input<String> uiDefinitionUri) {
            this.uiDefinitionUri = uiDefinitionUri;
            return this;
        }

        public Builder setUiDefinitionUri(@Nullable String uiDefinitionUri) {
            this.uiDefinitionUri = Input.ofNullable(uiDefinitionUri);
            return this;
        }

        public Builder setWorkspaceName(@Nullable Input<String> workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public Builder setWorkspaceName(@Nullable String workspaceName) {
            this.workspaceName = Input.ofNullable(workspaceName);
            return this;
        }
        public WorkspaceArgs build() {
            return new WorkspaceArgs(authorizations, location, managedResourceGroupId, parameters, resourceGroupName, sku, tags, uiDefinitionUri, workspaceName);
        }
    }
}
