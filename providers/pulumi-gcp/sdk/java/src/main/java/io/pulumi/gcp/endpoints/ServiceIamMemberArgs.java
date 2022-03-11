// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceIamMemberArgs Empty = new ServiceIamMemberArgs();

    @InputImport(name="condition")
      private final @Nullable Output<ServiceIamMemberConditionArgs> condition;

    public Output<ServiceIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.endpoints.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    @InputImport(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public ServiceIamMemberArgs(
        @Nullable Output<ServiceIamMemberConditionArgs> condition,
        Output<String> member,
        Output<String> role,
        Output<String> serviceName) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ServiceIamMemberArgs() {
        this.condition = Output.empty();
        this.member = Output.empty();
        this.role = Output.empty();
        this.serviceName = Output.empty();
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
        private Output<String> role;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
    	      this.serviceName = defaults.serviceName;
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

        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public ServiceIamMemberArgs build() {
            return new ServiceIamMemberArgs(condition, member, role, serviceName);
        }
    }
}
