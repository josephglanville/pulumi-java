// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceIamBindingState Empty = new InstanceIamBindingState();

    @Import(name="condition")
      private final @Nullable Output<InstanceIamBindingConditionGetArgs> condition;

    public Output<InstanceIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the instances's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> getInstance() {
        return this.instance == null ? Output.empty() : this.instance;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Output.empty() : this.members;
    }

    /**
     * The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public InstanceIamBindingState(
        @Nullable Output<InstanceIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> instance,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> project,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.instance = instance;
        this.members = members;
        this.project = project;
        this.role = role;
    }

    private InstanceIamBindingState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.instance = Output.empty();
        this.members = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> instance;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.instance = defaults.instance;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<InstanceIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable InstanceIamBindingConditionGetArgs condition) {
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
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Output.ofNullable(instance);
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
        }        public InstanceIamBindingState build() {
            return new InstanceIamBindingState(condition, etag, instance, members, project, role);
        }
    }
}
