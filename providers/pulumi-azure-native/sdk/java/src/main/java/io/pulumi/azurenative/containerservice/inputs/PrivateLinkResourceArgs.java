// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateLinkResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkResourceArgs Empty = new PrivateLinkResourceArgs();

    @InputImport(name="groupId")
    private final @Nullable Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId == null ? Input.empty() : this.groupId;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="requiredMembers")
    private final @Nullable Input<List<String>> requiredMembers;

    public Input<List<String>> getRequiredMembers() {
        return this.requiredMembers == null ? Input.empty() : this.requiredMembers;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public PrivateLinkResourceArgs(
        @Nullable Input<String> groupId,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> requiredMembers,
        @Nullable Input<String> type) {
        this.groupId = groupId;
        this.id = id;
        this.name = name;
        this.requiredMembers = requiredMembers;
        this.type = type;
    }

    private PrivateLinkResourceArgs() {
        this.groupId = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.requiredMembers = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> groupId;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> requiredMembers;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.requiredMembers = defaults.requiredMembers;
    	      this.type = defaults.type;
        }

        public Builder setGroupId(@Nullable Input<String> groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = Input.ofNullable(groupId);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRequiredMembers(@Nullable Input<List<String>> requiredMembers) {
            this.requiredMembers = requiredMembers;
            return this;
        }

        public Builder setRequiredMembers(@Nullable List<String> requiredMembers) {
            this.requiredMembers = Input.ofNullable(requiredMembers);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public PrivateLinkResourceArgs build() {
            return new PrivateLinkResourceArgs(groupId, id, name, requiredMembers, type);
        }
    }
}
