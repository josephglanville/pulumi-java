// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupUserArgs Empty = new GroupUserArgs();

    /**
     * Group identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="groupId", required=true)
      private final Output<String> groupId;

    public Output<String> getGroupId() {
        return this.groupId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="userId")
      private final @Nullable Output<String> userId;

    public Output<String> getUserId() {
        return this.userId == null ? Output.empty() : this.userId;
    }

    public GroupUserArgs(
        Output<String> groupId,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        @Nullable Output<String> userId) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.userId = userId;
    }

    private GroupUserArgs() {
        this.groupId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceName = Output.empty();
        this.userId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> groupId;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private @Nullable Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.userId = defaults.userId;
        }

        public Builder groupId(Output<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Output.of(Objects.requireNonNull(groupId));
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
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder userId(@Nullable Output<String> userId) {
            this.userId = userId;
            return this;
        }
        public Builder userId(@Nullable String userId) {
            this.userId = Output.ofNullable(userId);
            return this;
        }        public GroupUserArgs build() {
            return new GroupUserArgs(groupId, resourceGroupName, serviceName, userId);
        }
    }
}
