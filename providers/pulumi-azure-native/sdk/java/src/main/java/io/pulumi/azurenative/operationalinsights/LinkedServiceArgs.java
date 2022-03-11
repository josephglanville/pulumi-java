// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.operationalinsights.enums.LinkedServiceEntityStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedServiceArgs Empty = new LinkedServiceArgs();

    /**
     * Name of the linkedServices resource
     * 
     */
    @InputImport(name="linkedServiceName")
      private final @Nullable Output<String> linkedServiceName;

    public Output<String> getLinkedServiceName() {
        return this.linkedServiceName == null ? Output.empty() : this.linkedServiceName;
    }

    /**
     * The provisioning state of the linked service.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Output<Either<String,LinkedServiceEntityStatus>> provisioningState;

    public Output<Either<String,LinkedServiceEntityStatus>> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
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

    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
     * 
     */
    @InputImport(name="writeAccessResourceId")
      private final @Nullable Output<String> writeAccessResourceId;

    public Output<String> getWriteAccessResourceId() {
        return this.writeAccessResourceId == null ? Output.empty() : this.writeAccessResourceId;
    }

    public LinkedServiceArgs(
        @Nullable Output<String> linkedServiceName,
        @Nullable Output<Either<String,LinkedServiceEntityStatus>> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceId,
        @Nullable Output<Map<String,String>> tags,
        Output<String> workspaceName,
        @Nullable Output<String> writeAccessResourceId) {
        this.linkedServiceName = linkedServiceName;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = resourceId;
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
        this.writeAccessResourceId = writeAccessResourceId;
    }

    private LinkedServiceArgs() {
        this.linkedServiceName = Output.empty();
        this.provisioningState = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceId = Output.empty();
        this.tags = Output.empty();
        this.workspaceName = Output.empty();
        this.writeAccessResourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> linkedServiceName;
        private @Nullable Output<Either<String,LinkedServiceEntityStatus>> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceId;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> workspaceName;
        private @Nullable Output<String> writeAccessResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
    	      this.writeAccessResourceId = defaults.writeAccessResourceId;
        }

        public Builder linkedServiceName(@Nullable Output<String> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(@Nullable String linkedServiceName) {
            this.linkedServiceName = Output.ofNullable(linkedServiceName);
            return this;
        }

        public Builder provisioningState(@Nullable Output<Either<String,LinkedServiceEntityStatus>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable Either<String,LinkedServiceEntityStatus> provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
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

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
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

        public Builder writeAccessResourceId(@Nullable Output<String> writeAccessResourceId) {
            this.writeAccessResourceId = writeAccessResourceId;
            return this;
        }

        public Builder writeAccessResourceId(@Nullable String writeAccessResourceId) {
            this.writeAccessResourceId = Output.ofNullable(writeAccessResourceId);
            return this;
        }
        public LinkedServiceArgs build() {
            return new LinkedServiceArgs(linkedServiceName, provisioningState, resourceGroupName, resourceId, tags, workspaceName, writeAccessResourceId);
        }
    }
}
