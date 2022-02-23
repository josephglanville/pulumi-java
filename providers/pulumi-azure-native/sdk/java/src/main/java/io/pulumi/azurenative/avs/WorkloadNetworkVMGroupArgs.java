// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadNetworkVMGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadNetworkVMGroupArgs Empty = new WorkloadNetworkVMGroupArgs();

    /**
     * Display name of the VM group.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Virtual machine members of this group.
     * 
     */
    @InputImport(name="members")
      private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * Name of the private cloud
     * 
     */
    @InputImport(name="privateCloudName", required=true)
      private final Input<String> privateCloudName;

    public Input<String> getPrivateCloudName() {
        return this.privateCloudName;
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
     * NSX revision number.
     * 
     */
    @InputImport(name="revision")
      private final @Nullable Input<Double> revision;

    public Input<Double> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    /**
     * NSX VM Group identifier. Generally the same as the VM Group's display name
     * 
     */
    @InputImport(name="vmGroupId")
      private final @Nullable Input<String> vmGroupId;

    public Input<String> getVmGroupId() {
        return this.vmGroupId == null ? Input.empty() : this.vmGroupId;
    }

    public WorkloadNetworkVMGroupArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<List<String>> members,
        Input<String> privateCloudName,
        Input<String> resourceGroupName,
        @Nullable Input<Double> revision,
        @Nullable Input<String> vmGroupId) {
        this.displayName = displayName;
        this.members = members;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.revision = revision;
        this.vmGroupId = vmGroupId;
    }

    private WorkloadNetworkVMGroupArgs() {
        this.displayName = Input.empty();
        this.members = Input.empty();
        this.privateCloudName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.revision = Input.empty();
        this.vmGroupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadNetworkVMGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<List<String>> members;
        private Input<String> privateCloudName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Double> revision;
        private @Nullable Input<String> vmGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadNetworkVMGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.members = defaults.members;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.revision = defaults.revision;
    	      this.vmGroupId = defaults.vmGroupId;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setPrivateCloudName(Input<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Input.of(Objects.requireNonNull(privateCloudName));
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

        public Builder setRevision(@Nullable Input<Double> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable Double revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public Builder setVmGroupId(@Nullable Input<String> vmGroupId) {
            this.vmGroupId = vmGroupId;
            return this;
        }

        public Builder setVmGroupId(@Nullable String vmGroupId) {
            this.vmGroupId = Input.ofNullable(vmGroupId);
            return this;
        }
        public WorkloadNetworkVMGroupArgs build() {
            return new WorkloadNetworkVMGroupArgs(displayName, members, privateCloudName, resourceGroupName, revision, vmGroupId);
        }
    }
}
