// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.iap.inputs.TunnelInstanceIAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TunnelInstanceIAMBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TunnelInstanceIAMBindingArgs Empty = new TunnelInstanceIAMBindingArgs();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
      private final @Nullable Output<TunnelInstanceIAMBindingConditionArgs> condition;

    public Output<TunnelInstanceIAMBindingConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="instance", required=true)
      private final Output<String> instance;

    public Output<String> getInstance() {
        return this.instance;
    }

    @InputImport(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
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
     * `gcp.iap.TunnelInstanceIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    @InputImport(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public TunnelInstanceIAMBindingArgs(
        @Nullable Output<TunnelInstanceIAMBindingConditionArgs> condition,
        Output<String> instance,
        Output<List<String>> members,
        @Nullable Output<String> project,
        Output<String> role,
        @Nullable Output<String> zone) {
        this.condition = condition;
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.zone = zone;
    }

    private TunnelInstanceIAMBindingArgs() {
        this.condition = Output.empty();
        this.instance = Output.empty();
        this.members = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelInstanceIAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TunnelInstanceIAMBindingConditionArgs> condition;
        private Output<String> instance;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private Output<String> role;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(TunnelInstanceIAMBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.instance = defaults.instance;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.zone = defaults.zone;
        }

        public Builder condition(@Nullable Output<TunnelInstanceIAMBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable TunnelInstanceIAMBindingConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder instance(Output<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder instance(String instance) {
            this.instance = Output.of(Objects.requireNonNull(instance));
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
        }

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public TunnelInstanceIAMBindingArgs build() {
            return new TunnelInstanceIAMBindingArgs(condition, instance, members, project, role, zone);
        }
    }
}
