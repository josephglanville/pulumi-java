// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.GroupMembersItemResponse;
import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNetworkGroupResult {
    private final @Nullable String conditionalMembership;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final String etag;
    private final @Nullable List<GroupMembersItemResponse> groupMembers;
    private final String id;
    private final @Nullable String memberType;
    private final String name;
    private final String provisioningState;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"conditionalMembership","description","displayName","etag","groupMembers","id","memberType","name","provisioningState","systemData","type"})
    private GetNetworkGroupResult(
        @Nullable String conditionalMembership,
        @Nullable String description,
        @Nullable String displayName,
        String etag,
        @Nullable List<GroupMembersItemResponse> groupMembers,
        String id,
        @Nullable String memberType,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.conditionalMembership = conditionalMembership;
        this.description = description;
        this.displayName = displayName;
        this.etag = Objects.requireNonNull(etag);
        this.groupMembers = groupMembers;
        this.id = Objects.requireNonNull(id);
        this.memberType = memberType;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getConditionalMembership() {
        return Optional.ofNullable(this.conditionalMembership);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public String getEtag() {
        return this.etag;
    }
    public List<GroupMembersItemResponse> getGroupMembers() {
        return this.groupMembers == null ? List.of() : this.groupMembers;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getMemberType() {
        return Optional.ofNullable(this.memberType);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String conditionalMembership;
        private @Nullable String description;
        private @Nullable String displayName;
        private String etag;
        private @Nullable List<GroupMembersItemResponse> groupMembers;
        private String id;
        private @Nullable String memberType;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalMembership = defaults.conditionalMembership;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.groupMembers = defaults.groupMembers;
    	      this.id = defaults.id;
    	      this.memberType = defaults.memberType;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setConditionalMembership(@Nullable String conditionalMembership) {
            this.conditionalMembership = conditionalMembership;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setGroupMembers(@Nullable List<GroupMembersItemResponse> groupMembers) {
            this.groupMembers = groupMembers;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMemberType(@Nullable String memberType) {
            this.memberType = memberType;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetNetworkGroupResult build() {
            return new GetNetworkGroupResult(conditionalMembership, description, displayName, etag, groupMembers, id, memberType, name, provisioningState, systemData, type);
        }
    }
}
