// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceIamBindingArgs Empty = new NamespaceIamBindingArgs();

    @InputImport(name="condition")
      private final @Nullable Output<NamespaceIamBindingConditionArgs> condition;

    public Output<NamespaceIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @InputImport(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
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
     * The role that should be applied. Only one
     * `gcp.servicedirectory.NamespaceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public NamespaceIamBindingArgs(
        @Nullable Output<NamespaceIamBindingConditionArgs> condition,
        Output<List<String>> members,
        @Nullable Output<String> name,
        Output<String> role) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.name = name;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private NamespaceIamBindingArgs() {
        this.condition = Output.empty();
        this.members = Output.empty();
        this.name = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NamespaceIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private @Nullable Output<String> name;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<NamespaceIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable NamespaceIamBindingConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
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

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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
        public NamespaceIamBindingArgs build() {
            return new NamespaceIamBindingArgs(condition, members, name, role);
        }
    }
}
