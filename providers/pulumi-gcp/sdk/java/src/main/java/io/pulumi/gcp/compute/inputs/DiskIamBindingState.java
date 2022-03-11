// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.DiskIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final DiskIamBindingState Empty = new DiskIamBindingState();

    @InputImport(name="condition")
      private final @Nullable Output<DiskIamBindingConditionGetArgs> condition;

    public Output<DiskIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @InputImport(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Output.empty() : this.members;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.compute.DiskIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    /**
     * A reference to the zone where the disk resides. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no zone is provided in the parent identifier and no
     * zone is specified, it is taken from the provider configuration.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public DiskIamBindingState(
        @Nullable Output<DiskIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> role,
        @Nullable Output<String> zone) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.name = name;
        this.project = project;
        this.role = role;
        this.zone = zone;
    }

    private DiskIamBindingState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.members = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DiskIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.zone = defaults.zone;
        }

        public Builder condition(@Nullable Output<DiskIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable DiskIamBindingConditionGetArgs condition) {
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

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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
        }

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public DiskIamBindingState build() {
            return new DiskIamBindingState(condition, etag, members, name, project, role, zone);
        }
    }
}
