// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.GroupMembersItemArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkGroupArgs Empty = new NetworkGroupArgs();

    @InputImport(name="conditionalMembership")
    private final @Nullable Input<String> conditionalMembership;

    public Input<String> getConditionalMembership() {
        return this.conditionalMembership == null ? Input.empty() : this.conditionalMembership;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="groupMembers")
    private final @Nullable Input<List<GroupMembersItemArgs>> groupMembers;

    public Input<List<GroupMembersItemArgs>> getGroupMembers() {
        return this.groupMembers == null ? Input.empty() : this.groupMembers;
    }

    @InputImport(name="memberType")
    private final @Nullable Input<String> memberType;

    public Input<String> getMemberType() {
        return this.memberType == null ? Input.empty() : this.memberType;
    }

    @InputImport(name="networkGroupName")
    private final @Nullable Input<String> networkGroupName;

    public Input<String> getNetworkGroupName() {
        return this.networkGroupName == null ? Input.empty() : this.networkGroupName;
    }

    @InputImport(name="networkManagerName", required=true)
    private final Input<String> networkManagerName;

    public Input<String> getNetworkManagerName() {
        return this.networkManagerName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public NetworkGroupArgs(
        @Nullable Input<String> conditionalMembership,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<List<GroupMembersItemArgs>> groupMembers,
        @Nullable Input<String> memberType,
        @Nullable Input<String> networkGroupName,
        Input<String> networkManagerName,
        Input<String> resourceGroupName) {
        this.conditionalMembership = conditionalMembership;
        this.description = description;
        this.displayName = displayName;
        this.groupMembers = groupMembers;
        this.memberType = memberType;
        this.networkGroupName = networkGroupName;
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private NetworkGroupArgs() {
        this.conditionalMembership = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.groupMembers = Input.empty();
        this.memberType = Input.empty();
        this.networkGroupName = Input.empty();
        this.networkManagerName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> conditionalMembership;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<List<GroupMembersItemArgs>> groupMembers;
        private @Nullable Input<String> memberType;
        private @Nullable Input<String> networkGroupName;
        private Input<String> networkManagerName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalMembership = defaults.conditionalMembership;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.groupMembers = defaults.groupMembers;
    	      this.memberType = defaults.memberType;
    	      this.networkGroupName = defaults.networkGroupName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setConditionalMembership(@Nullable Input<String> conditionalMembership) {
            this.conditionalMembership = conditionalMembership;
            return this;
        }

        public Builder setConditionalMembership(@Nullable String conditionalMembership) {
            this.conditionalMembership = Input.ofNullable(conditionalMembership);
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

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setGroupMembers(@Nullable Input<List<GroupMembersItemArgs>> groupMembers) {
            this.groupMembers = groupMembers;
            return this;
        }

        public Builder setGroupMembers(@Nullable List<GroupMembersItemArgs> groupMembers) {
            this.groupMembers = Input.ofNullable(groupMembers);
            return this;
        }

        public Builder setMemberType(@Nullable Input<String> memberType) {
            this.memberType = memberType;
            return this;
        }

        public Builder setMemberType(@Nullable String memberType) {
            this.memberType = Input.ofNullable(memberType);
            return this;
        }

        public Builder setNetworkGroupName(@Nullable Input<String> networkGroupName) {
            this.networkGroupName = networkGroupName;
            return this;
        }

        public Builder setNetworkGroupName(@Nullable String networkGroupName) {
            this.networkGroupName = Input.ofNullable(networkGroupName);
            return this;
        }

        public Builder setNetworkManagerName(Input<String> networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Input.of(Objects.requireNonNull(networkManagerName));
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

        public NetworkGroupArgs build() {
            return new NetworkGroupArgs(conditionalMembership, description, displayName, groupMembers, memberType, networkGroupName, networkManagerName, resourceGroupName);
        }
    }
}
