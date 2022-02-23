// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIAMPolicyBinding extends io.pulumi.resources.InvokeArgs {

    public static final GetIAMPolicyBinding Empty = new GetIAMPolicyBinding();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * 
     */
    @InputImport(name="condition")
      private final @Nullable GetIAMPolicyBindingCondition condition;

    public Optional<GetIAMPolicyBindingCondition> getCondition() {
        return this.condition == null ? Optional.empty() : Optional.ofNullable(this.condition);
    }

    /**
     * An array of identities that will be granted the privilege in the `role`. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account. Some resources **don't** support this identity.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account. Some resources **don't** support this identity.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    @InputImport(name="members", required=true)
      private final List<String> members;

    public List<String> getMembers() {
        return this.members;
    }

    /**
     * The role/permission that will be granted to the members.
     * See the [IAM Roles](https://cloud.google.com/compute/docs/access/iam) documentation for a complete list of roles.
     * Note that custom roles must be of the format `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final String role;

    public String getRole() {
        return this.role;
    }

    public GetIAMPolicyBinding(
        @Nullable GetIAMPolicyBindingCondition condition,
        List<String> members,
        String role) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private GetIAMPolicyBinding() {
        this.condition = null;
        this.members = List.of();
        this.role = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyBinding defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetIAMPolicyBindingCondition condition;
        private List<String> members;
        private String role;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable GetIAMPolicyBindingCondition condition) {
            this.condition = condition;
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public GetIAMPolicyBinding build() {
            return new GetIAMPolicyBinding(condition, members, role);
        }
    }
}
