// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.iap.inputs.WebTypeComputeIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebTypeComputeIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final WebTypeComputeIamMemberState Empty = new WebTypeComputeIamMemberState();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<WebTypeComputeIamMemberConditionGetArgs> condition;

    public Output<WebTypeComputeIamMemberConditionGetArgs> getCondition() {
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

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Codegen.empty() : this.member;
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
     * `gcp.iap.WebTypeComputeIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public WebTypeComputeIamMemberState(
        @Nullable Output<WebTypeComputeIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.project = project;
        this.role = role;
    }

    private WebTypeComputeIamMemberState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTypeComputeIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebTypeComputeIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTypeComputeIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<WebTypeComputeIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable WebTypeComputeIamMemberConditionGetArgs condition) {
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
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
            return this;
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
        }        public WebTypeComputeIamMemberState build() {
            return new WebTypeComputeIamMemberState(condition, etag, member, project, role);
        }
    }
}
