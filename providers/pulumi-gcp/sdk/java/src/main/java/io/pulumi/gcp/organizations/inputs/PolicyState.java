// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyGetArgs;
import io.pulumi.gcp.organizations.inputs.PolicyListPolicyGetArgs;
import io.pulumi.gcp.organizations.inputs.PolicyRestorePolicyGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * 
     */
    @Import(name="booleanPolicy")
      private final @Nullable Output<PolicyBooleanPolicyGetArgs> booleanPolicy;

    public Output<PolicyBooleanPolicyGetArgs> getBooleanPolicy() {
        return this.booleanPolicy == null ? Codegen.empty() : this.booleanPolicy;
    }

    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @Import(name="constraint")
      private final @Nullable Output<String> constraint;

    public Output<String> getConstraint() {
        return this.constraint == null ? Codegen.empty() : this.constraint;
    }

    /**
     * (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    @Import(name="listPolicy")
      private final @Nullable Output<PolicyListPolicyGetArgs> listPolicy;

    public Output<PolicyListPolicyGetArgs> getListPolicy() {
        return this.listPolicy == null ? Codegen.empty() : this.listPolicy;
    }

    /**
     * The numeric ID of the organization to set the policy for.
     * 
     */
    @Import(name="orgId")
      private final @Nullable Output<String> orgId;

    public Output<String> getOrgId() {
        return this.orgId == null ? Codegen.empty() : this.orgId;
    }

    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    @Import(name="restorePolicy")
      private final @Nullable Output<PolicyRestorePolicyGetArgs> restorePolicy;

    public Output<PolicyRestorePolicyGetArgs> getRestorePolicy() {
        return this.restorePolicy == null ? Codegen.empty() : this.restorePolicy;
    }

    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    /**
     * Version of the Policy. Default version is 0.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public PolicyState(
        @Nullable Output<PolicyBooleanPolicyGetArgs> booleanPolicy,
        @Nullable Output<String> constraint,
        @Nullable Output<String> etag,
        @Nullable Output<PolicyListPolicyGetArgs> listPolicy,
        @Nullable Output<String> orgId,
        @Nullable Output<PolicyRestorePolicyGetArgs> restorePolicy,
        @Nullable Output<String> updateTime,
        @Nullable Output<Integer> version) {
        this.booleanPolicy = booleanPolicy;
        this.constraint = constraint;
        this.etag = etag;
        this.listPolicy = listPolicy;
        this.orgId = orgId;
        this.restorePolicy = restorePolicy;
        this.updateTime = updateTime;
        this.version = version;
    }

    private PolicyState() {
        this.booleanPolicy = Codegen.empty();
        this.constraint = Codegen.empty();
        this.etag = Codegen.empty();
        this.listPolicy = Codegen.empty();
        this.orgId = Codegen.empty();
        this.restorePolicy = Codegen.empty();
        this.updateTime = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PolicyBooleanPolicyGetArgs> booleanPolicy;
        private @Nullable Output<String> constraint;
        private @Nullable Output<String> etag;
        private @Nullable Output<PolicyListPolicyGetArgs> listPolicy;
        private @Nullable Output<String> orgId;
        private @Nullable Output<PolicyRestorePolicyGetArgs> restorePolicy;
        private @Nullable Output<String> updateTime;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanPolicy = defaults.booleanPolicy;
    	      this.constraint = defaults.constraint;
    	      this.etag = defaults.etag;
    	      this.listPolicy = defaults.listPolicy;
    	      this.orgId = defaults.orgId;
    	      this.restorePolicy = defaults.restorePolicy;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        public Builder booleanPolicy(@Nullable Output<PolicyBooleanPolicyGetArgs> booleanPolicy) {
            this.booleanPolicy = booleanPolicy;
            return this;
        }
        public Builder booleanPolicy(@Nullable PolicyBooleanPolicyGetArgs booleanPolicy) {
            this.booleanPolicy = Codegen.ofNullable(booleanPolicy);
            return this;
        }
        public Builder constraint(@Nullable Output<String> constraint) {
            this.constraint = constraint;
            return this;
        }
        public Builder constraint(@Nullable String constraint) {
            this.constraint = Codegen.ofNullable(constraint);
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
        public Builder listPolicy(@Nullable Output<PolicyListPolicyGetArgs> listPolicy) {
            this.listPolicy = listPolicy;
            return this;
        }
        public Builder listPolicy(@Nullable PolicyListPolicyGetArgs listPolicy) {
            this.listPolicy = Codegen.ofNullable(listPolicy);
            return this;
        }
        public Builder orgId(@Nullable Output<String> orgId) {
            this.orgId = orgId;
            return this;
        }
        public Builder orgId(@Nullable String orgId) {
            this.orgId = Codegen.ofNullable(orgId);
            return this;
        }
        public Builder restorePolicy(@Nullable Output<PolicyRestorePolicyGetArgs> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }
        public Builder restorePolicy(@Nullable PolicyRestorePolicyGetArgs restorePolicy) {
            this.restorePolicy = Codegen.ofNullable(restorePolicy);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public PolicyState build() {
            return new PolicyState(booleanPolicy, constraint, etag, listPolicy, orgId, restorePolicy, updateTime, version);
        }
    }
}
