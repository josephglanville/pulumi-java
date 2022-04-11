// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.iam.inputs.RolePolicyArgs;
import io.pulumi.awsnative.iam.inputs.RoleTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    /**
     * The trust policy that is associated with this role.
     * 
     */
    @Import(name="assumeRolePolicyDocument", required=true)
      private final Output<Object> assumeRolePolicyDocument;

    public Output<Object> getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * A description of the role that you provide.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to the role.
     * 
     */
    @Import(name="managedPolicyArns")
      private final @Nullable Output<List<String>> managedPolicyArns;

    public Output<List<String>> getManagedPolicyArns() {
        return this.managedPolicyArns == null ? Codegen.empty() : this.managedPolicyArns;
    }

    /**
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
     * 
     */
    @Import(name="maxSessionDuration")
      private final @Nullable Output<Integer> maxSessionDuration;

    public Output<Integer> getMaxSessionDuration() {
        return this.maxSessionDuration == null ? Codegen.empty() : this.maxSessionDuration;
    }

    /**
     * The path to the role.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * The ARN of the policy used to set the permissions boundary for the role.
     * 
     */
    @Import(name="permissionsBoundary")
      private final @Nullable Output<String> permissionsBoundary;

    public Output<String> getPermissionsBoundary() {
        return this.permissionsBoundary == null ? Codegen.empty() : this.permissionsBoundary;
    }

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM role.
     * 
     */
    @Import(name="policies")
      private final @Nullable Output<List<RolePolicyArgs>> policies;

    public Output<List<RolePolicyArgs>> getPolicies() {
        return this.policies == null ? Codegen.empty() : this.policies;
    }

    /**
     * A name for the IAM role, up to 64 characters in length.
     * 
     */
    @Import(name="roleName")
      private final @Nullable Output<String> roleName;

    public Output<String> getRoleName() {
        return this.roleName == null ? Codegen.empty() : this.roleName;
    }

    /**
     * A list of tags that are attached to the role.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<RoleTagArgs>> tags;

    public Output<List<RoleTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RoleArgs(
        Output<Object> assumeRolePolicyDocument,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> managedPolicyArns,
        @Nullable Output<Integer> maxSessionDuration,
        @Nullable Output<String> path,
        @Nullable Output<String> permissionsBoundary,
        @Nullable Output<List<RolePolicyArgs>> policies,
        @Nullable Output<String> roleName,
        @Nullable Output<List<RoleTagArgs>> tags) {
        this.assumeRolePolicyDocument = Objects.requireNonNull(assumeRolePolicyDocument, "expected parameter 'assumeRolePolicyDocument' to be non-null");
        this.description = description;
        this.managedPolicyArns = managedPolicyArns;
        this.maxSessionDuration = maxSessionDuration;
        this.path = path;
        this.permissionsBoundary = permissionsBoundary;
        this.policies = policies;
        this.roleName = roleName;
        this.tags = tags;
    }

    private RoleArgs() {
        this.assumeRolePolicyDocument = Codegen.empty();
        this.description = Codegen.empty();
        this.managedPolicyArns = Codegen.empty();
        this.maxSessionDuration = Codegen.empty();
        this.path = Codegen.empty();
        this.permissionsBoundary = Codegen.empty();
        this.policies = Codegen.empty();
        this.roleName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> assumeRolePolicyDocument;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> managedPolicyArns;
        private @Nullable Output<Integer> maxSessionDuration;
        private @Nullable Output<String> path;
        private @Nullable Output<String> permissionsBoundary;
        private @Nullable Output<List<RolePolicyArgs>> policies;
        private @Nullable Output<String> roleName;
        private @Nullable Output<List<RoleTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assumeRolePolicyDocument = defaults.assumeRolePolicyDocument;
    	      this.description = defaults.description;
    	      this.managedPolicyArns = defaults.managedPolicyArns;
    	      this.maxSessionDuration = defaults.maxSessionDuration;
    	      this.path = defaults.path;
    	      this.permissionsBoundary = defaults.permissionsBoundary;
    	      this.policies = defaults.policies;
    	      this.roleName = defaults.roleName;
    	      this.tags = defaults.tags;
        }

        public Builder assumeRolePolicyDocument(Output<Object> assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = Objects.requireNonNull(assumeRolePolicyDocument);
            return this;
        }
        public Builder assumeRolePolicyDocument(Object assumeRolePolicyDocument) {
            this.assumeRolePolicyDocument = Output.of(Objects.requireNonNull(assumeRolePolicyDocument));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder managedPolicyArns(@Nullable Output<List<String>> managedPolicyArns) {
            this.managedPolicyArns = managedPolicyArns;
            return this;
        }
        public Builder managedPolicyArns(@Nullable List<String> managedPolicyArns) {
            this.managedPolicyArns = Codegen.ofNullable(managedPolicyArns);
            return this;
        }
        public Builder managedPolicyArns(String... managedPolicyArns) {
            return managedPolicyArns(List.of(managedPolicyArns));
        }
        public Builder maxSessionDuration(@Nullable Output<Integer> maxSessionDuration) {
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        public Builder maxSessionDuration(@Nullable Integer maxSessionDuration) {
            this.maxSessionDuration = Codegen.ofNullable(maxSessionDuration);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder permissionsBoundary(@Nullable Output<String> permissionsBoundary) {
            this.permissionsBoundary = permissionsBoundary;
            return this;
        }
        public Builder permissionsBoundary(@Nullable String permissionsBoundary) {
            this.permissionsBoundary = Codegen.ofNullable(permissionsBoundary);
            return this;
        }
        public Builder policies(@Nullable Output<List<RolePolicyArgs>> policies) {
            this.policies = policies;
            return this;
        }
        public Builder policies(@Nullable List<RolePolicyArgs> policies) {
            this.policies = Codegen.ofNullable(policies);
            return this;
        }
        public Builder policies(RolePolicyArgs... policies) {
            return policies(List.of(policies));
        }
        public Builder roleName(@Nullable Output<String> roleName) {
            this.roleName = roleName;
            return this;
        }
        public Builder roleName(@Nullable String roleName) {
            this.roleName = Codegen.ofNullable(roleName);
            return this;
        }
        public Builder tags(@Nullable Output<List<RoleTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<RoleTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(RoleTagArgs... tags) {
            return tags(List.of(tags));
        }        public RoleArgs build() {
            return new RoleArgs(assumeRolePolicyDocument, description, managedPolicyArns, maxSessionDuration, path, permissionsBoundary, policies, roleName, tags);
        }
    }
}
