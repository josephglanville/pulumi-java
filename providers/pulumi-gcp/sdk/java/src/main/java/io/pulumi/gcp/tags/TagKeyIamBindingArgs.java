// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.tags.inputs.TagKeyIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagKeyIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagKeyIamBindingArgs Empty = new TagKeyIamBindingArgs();

    @Import(name="condition")
      private final @Nullable Output<TagKeyIamBindingConditionArgs> condition;

    public Output<TagKeyIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagKeyIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagKey", required=true)
      private final Output<String> tagKey;

    public Output<String> getTagKey() {
        return this.tagKey;
    }

    public TagKeyIamBindingArgs(
        @Nullable Output<TagKeyIamBindingConditionArgs> condition,
        Output<List<String>> members,
        Output<String> role,
        Output<String> tagKey) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.tagKey = Objects.requireNonNull(tagKey, "expected parameter 'tagKey' to be non-null");
    }

    private TagKeyIamBindingArgs() {
        this.condition = Codegen.empty();
        this.members = Codegen.empty();
        this.role = Codegen.empty();
        this.tagKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagKeyIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TagKeyIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private Output<String> role;
        private Output<String> tagKey;

        public Builder() {
    	      // Empty
        }

        public Builder(TagKeyIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
    	      this.tagKey = defaults.tagKey;
        }

        public Builder condition(@Nullable Output<TagKeyIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable TagKeyIamBindingConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder tagKey(Output<String> tagKey) {
            this.tagKey = Objects.requireNonNull(tagKey);
            return this;
        }
        public Builder tagKey(String tagKey) {
            this.tagKey = Output.of(Objects.requireNonNull(tagKey));
            return this;
        }        public TagKeyIamBindingArgs build() {
            return new TagKeyIamBindingArgs(condition, members, role, tagKey);
        }
    }
}
