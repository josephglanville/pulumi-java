// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTagIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTagIamBindingArgs Empty = new PolicyTagIamBindingArgs();

    @InputImport(name="condition")
      private final @Nullable Output<PolicyTagIamBindingConditionArgs> condition;

    public Output<PolicyTagIamBindingConditionArgs> getCondition() {
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
    @InputImport(name="policyTag", required=true)
      private final Output<String> policyTag;

    public Output<String> getPolicyTag() {
        return this.policyTag;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public PolicyTagIamBindingArgs(
        @Nullable Output<PolicyTagIamBindingConditionArgs> condition,
        Output<List<String>> members,
        Output<String> policyTag,
        Output<String> role) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.policyTag = Objects.requireNonNull(policyTag, "expected parameter 'policyTag' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private PolicyTagIamBindingArgs() {
        this.condition = Output.empty();
        this.members = Output.empty();
        this.policyTag = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTagIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PolicyTagIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private Output<String> policyTag;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTagIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.policyTag = defaults.policyTag;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<PolicyTagIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable PolicyTagIamBindingConditionArgs condition) {
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

        public Builder policyTag(Output<String> policyTag) {
            this.policyTag = Objects.requireNonNull(policyTag);
            return this;
        }

        public Builder policyTag(String policyTag) {
            this.policyTag = Output.of(Objects.requireNonNull(policyTag));
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
        public PolicyTagIamBindingArgs build() {
            return new PolicyTagIamBindingArgs(condition, members, policyTag, role);
        }
    }
}
