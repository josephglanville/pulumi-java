// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.MachineImageIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageIamBindingArgs Empty = new MachineImageIamBindingArgs();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<MachineImageIamBindingConditionArgs> condition;

    public Output<MachineImageIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="machineImage", required=true)
      private final Output<String> machineImage;

    public Output<String> getMachineImage() {
        return this.machineImage;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
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
     * `gcp.compute.MachineImageIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public MachineImageIamBindingArgs(
        @Nullable Output<MachineImageIamBindingConditionArgs> condition,
        Output<String> machineImage,
        Output<List<String>> members,
        @Nullable Output<String> project,
        Output<String> role) {
        this.condition = condition;
        this.machineImage = Objects.requireNonNull(machineImage, "expected parameter 'machineImage' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private MachineImageIamBindingArgs() {
        this.condition = Output.empty();
        this.machineImage = Output.empty();
        this.members = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MachineImageIamBindingConditionArgs> condition;
        private Output<String> machineImage;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.machineImage = defaults.machineImage;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<MachineImageIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable MachineImageIamBindingConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder machineImage(Output<String> machineImage) {
            this.machineImage = Objects.requireNonNull(machineImage);
            return this;
        }
        public Builder machineImage(String machineImage) {
            this.machineImage = Output.of(Objects.requireNonNull(machineImage));
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public MachineImageIamBindingArgs build() {
            return new MachineImageIamBindingArgs(condition, machineImage, members, project, role);
        }
    }
}
