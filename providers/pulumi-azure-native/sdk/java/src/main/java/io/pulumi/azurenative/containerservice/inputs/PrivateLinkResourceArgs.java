// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A private link resource
 * 
 */
public final class PrivateLinkResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkResourceArgs Empty = new PrivateLinkResourceArgs();

    /**
     * The group ID of the resource.
     * 
     */
    @Import(name="groupId")
      private final @Nullable Output<String> groupId;

    public Output<String> getGroupId() {
        return this.groupId == null ? Codegen.empty() : this.groupId;
    }

    /**
     * The ID of the private link resource.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The name of the private link resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * RequiredMembers of the resource
     * 
     */
    @Import(name="requiredMembers")
      private final @Nullable Output<List<String>> requiredMembers;

    public Output<List<String>> getRequiredMembers() {
        return this.requiredMembers == null ? Codegen.empty() : this.requiredMembers;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public PrivateLinkResourceArgs(
        @Nullable Output<String> groupId,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> requiredMembers,
        @Nullable Output<String> type) {
        this.groupId = groupId;
        this.id = id;
        this.name = name;
        this.requiredMembers = requiredMembers;
        this.type = type;
    }

    private PrivateLinkResourceArgs() {
        this.groupId = Codegen.empty();
        this.id = Codegen.empty();
        this.name = Codegen.empty();
        this.requiredMembers = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> groupId;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> requiredMembers;
        private @Nullable Output<String> type;

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

        public Builder groupId(@Nullable Output<String> groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder groupId(@Nullable String groupId) {
            this.groupId = Codegen.ofNullable(groupId);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder requiredMembers(@Nullable Output<List<String>> requiredMembers) {
            this.requiredMembers = requiredMembers;
            return this;
        }
        public Builder requiredMembers(@Nullable List<String> requiredMembers) {
            this.requiredMembers = Codegen.ofNullable(requiredMembers);
            return this;
        }
        public Builder requiredMembers(String... requiredMembers) {
            return requiredMembers(List.of(requiredMembers));
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public PrivateLinkResourceArgs build() {
            return new PrivateLinkResourceArgs(groupId, id, name, requiredMembers, type);
        }
    }
}
