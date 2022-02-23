// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi;

import io.pulumi.azurenative.powerbi.inputs.AzureSkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceCollectionArgs Empty = new WorkspaceCollectionArgs();

    /**
     * Azure location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Azure resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku")
      private final @Nullable Input<AzureSkuArgs> sku;

    public Input<AzureSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Power BI Embedded Workspace Collection name
     * 
     */
    @InputImport(name="workspaceCollectionName")
      private final @Nullable Input<String> workspaceCollectionName;

    public Input<String> getWorkspaceCollectionName() {
        return this.workspaceCollectionName == null ? Input.empty() : this.workspaceCollectionName;
    }

    public WorkspaceCollectionArgs(
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<AzureSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> workspaceCollectionName) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.workspaceCollectionName = workspaceCollectionName;
    }

    private WorkspaceCollectionArgs() {
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.workspaceCollectionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<AzureSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> workspaceCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.workspaceCollectionName = defaults.workspaceCollectionName;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setSku(@Nullable Input<AzureSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable AzureSkuArgs sku) {
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

        public Builder setWorkspaceCollectionName(@Nullable Input<String> workspaceCollectionName) {
            this.workspaceCollectionName = workspaceCollectionName;
            return this;
        }

        public Builder setWorkspaceCollectionName(@Nullable String workspaceCollectionName) {
            this.workspaceCollectionName = Input.ofNullable(workspaceCollectionName);
            return this;
        }
        public WorkspaceCollectionArgs build() {
            return new WorkspaceCollectionArgs(location, resourceGroupName, sku, tags, workspaceCollectionName);
        }
    }
}
