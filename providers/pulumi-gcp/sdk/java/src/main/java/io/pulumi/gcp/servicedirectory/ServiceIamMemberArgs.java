// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceIamMemberArgs Empty = new ServiceIamMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<ServiceIamMemberConditionArgs> condition;

    public Output<ServiceIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.servicedirectory.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public ServiceIamMemberArgs(
        @Nullable Output<ServiceIamMemberConditionArgs> condition,
        Output<String> member,
        @Nullable Output<String> name,
        Output<String> role) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.name = name;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ServiceIamMemberArgs() {
        this.condition = Output.empty();
        this.member = Output.empty();
        this.name = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceIamMemberConditionArgs> condition;
        private Output<String> member;
        private @Nullable Output<String> name;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<ServiceIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable ServiceIamMemberConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }
        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
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
        }        public ServiceIamMemberArgs build() {
            return new ServiceIamMemberArgs(condition, member, name, role);
        }
    }
}
