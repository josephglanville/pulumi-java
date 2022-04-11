// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudrun.inputs.IamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final IamMemberState Empty = new IamMemberState();

    @Import(name="condition")
      private final @Nullable Output<IamMemberConditionGetArgs> condition;

    public Output<IamMemberConditionGetArgs> getCondition() {
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

    /**
     * The location of the cloud run instance. eg us-central1 Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
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
     * `gcp.cloudrun.IamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    public IamMemberState(
        @Nullable Output<IamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> location,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> role,
        @Nullable Output<String> service) {
        this.condition = condition;
        this.etag = etag;
        this.location = location;
        this.member = member;
        this.project = project;
        this.role = role;
        this.service = service;
    }

    private IamMemberState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.location = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> location;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(IamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.service = defaults.service;
        }

        public Builder condition(@Nullable Output<IamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable IamMemberConditionGetArgs condition) {
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
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }        public IamMemberState build() {
            return new IamMemberState(condition, etag, location, member, project, role, service);
        }
    }
}
