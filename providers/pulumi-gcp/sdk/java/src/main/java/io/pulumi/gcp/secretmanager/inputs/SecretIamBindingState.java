// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final SecretIamBindingState Empty = new SecretIamBindingState();

    @Import(name="condition")
      private final @Nullable Output<SecretIamBindingConditionGetArgs> condition;

    public Output<SecretIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.secretmanager.SecretIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    @Import(name="secretId")
      private final @Nullable Output<String> secretId;

    public Output<String> getSecretId() {
        return this.secretId == null ? Codegen.empty() : this.secretId;
    }

    public SecretIamBindingState(
        @Nullable Output<SecretIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> project,
        @Nullable Output<String> role,
        @Nullable Output<String> secretId) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.project = project;
        this.role = role;
        this.secretId = secretId;
    }

    private SecretIamBindingState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.members = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
        this.secretId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecretIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;
        private @Nullable Output<String> secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.secretId = defaults.secretId;
        }

        public Builder condition(@Nullable Output<SecretIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable SecretIamBindingConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder secretId(@Nullable Output<String> secretId) {
            this.secretId = secretId;
            return this;
        }
        public Builder secretId(@Nullable String secretId) {
            this.secretId = Codegen.ofNullable(secretId);
            return this;
        }        public SecretIamBindingState build() {
            return new SecretIamBindingState(condition, etag, members, project, role, secretId);
        }
    }
}
