// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIamMemberState Empty = new CaPoolIamMemberState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="caPool")
      private final @Nullable Output<String> caPool;

    public Output<String> getCaPool() {
        return this.caPool == null ? Output.empty() : this.caPool;
    }

    @Import(name="condition")
      private final @Nullable Output<CaPoolIamMemberConditionGetArgs> condition;

    public Output<CaPoolIamMemberConditionGetArgs> getCondition() {
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

    /**
     * Location of the CaPool. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Output.empty() : this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.certificateauthority.CaPoolIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public CaPoolIamMemberState(
        @Nullable Output<String> caPool,
        @Nullable Output<CaPoolIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> location,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> role) {
        this.caPool = caPool;
        this.condition = condition;
        this.etag = etag;
        this.location = location;
        this.member = member;
        this.project = project;
        this.role = role;
    }

    private CaPoolIamMemberState() {
        this.caPool = Output.empty();
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.location = Output.empty();
        this.member = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> caPool;
        private @Nullable Output<CaPoolIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> location;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPool = defaults.caPool;
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder caPool(@Nullable Output<String> caPool) {
            this.caPool = caPool;
            return this;
        }
        public Builder caPool(@Nullable String caPool) {
            this.caPool = Output.ofNullable(caPool);
            return this;
        }
        public Builder condition(@Nullable Output<CaPoolIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable CaPoolIamMemberConditionGetArgs condition) {
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
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Output.ofNullable(member);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }        public CaPoolIamMemberState build() {
            return new CaPoolIamMemberState(caPool, condition, etag, location, member, project, role);
        }
    }
}
