// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.serviceAccount.inputs.IAMBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMBindingState extends io.pulumi.resources.ResourceArgs {

    public static final IAMBindingState Empty = new IAMBindingState();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<IAMBindingConditionGetArgs> condition;

    public Output<IAMBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the service account IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.serviceAccount.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * The fully-qualified name of the service account to apply policy to.
     * 
     */
    @Import(name="serviceAccountId")
      private final @Nullable Output<String> serviceAccountId;

    public Output<String> getServiceAccountId() {
        return this.serviceAccountId == null ? Codegen.empty() : this.serviceAccountId;
    }

    public IAMBindingState(
        @Nullable Output<IAMBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> role,
        @Nullable Output<String> serviceAccountId) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.role = role;
        this.serviceAccountId = serviceAccountId;
    }

    private IAMBindingState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.members = Codegen.empty();
        this.role = Codegen.empty();
        this.serviceAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IAMBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> role;
        private @Nullable Output<String> serviceAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
    	      this.serviceAccountId = defaults.serviceAccountId;
        }

        public Builder condition(@Nullable Output<IAMBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable IAMBindingConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder serviceAccountId(@Nullable Output<String> serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public Builder serviceAccountId(@Nullable String serviceAccountId) {
            this.serviceAccountId = Codegen.ofNullable(serviceAccountId);
            return this;
        }        public IAMBindingState build() {
            return new IAMBindingState(condition, etag, members, role, serviceAccountId);
        }
    }
}
