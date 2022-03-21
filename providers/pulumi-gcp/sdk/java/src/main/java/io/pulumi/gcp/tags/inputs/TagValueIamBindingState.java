// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.tags.inputs.TagValueIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagValueIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final TagValueIamBindingState Empty = new TagValueIamBindingState();

    @Import(name="condition")
      private final @Nullable Output<TagValueIamBindingConditionGetArgs> condition;

    public Output<TagValueIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Output.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagValue")
      private final @Nullable Output<String> tagValue;

    public Output<String> getTagValue() {
        return this.tagValue == null ? Output.empty() : this.tagValue;
    }

    public TagValueIamBindingState(
        @Nullable Output<TagValueIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> role,
        @Nullable Output<String> tagValue) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.role = role;
        this.tagValue = tagValue;
    }

    private TagValueIamBindingState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.members = Output.empty();
        this.role = Output.empty();
        this.tagValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagValueIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TagValueIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> role;
        private @Nullable Output<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagValueIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder condition(@Nullable Output<TagValueIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable TagValueIamBindingConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Output.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public Builder tagValue(@Nullable Output<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public Builder tagValue(@Nullable String tagValue) {
            this.tagValue = Output.ofNullable(tagValue);
            return this;
        }        public TagValueIamBindingState build() {
            return new TagValueIamBindingState(condition, etag, members, role, tagValue);
        }
    }
}
