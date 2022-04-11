// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs;
import io.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs;
import io.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyArgs Empty = new OrganizationPolicyArgs();

    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * 
     */
    @Import(name="booleanPolicy")
      private final @Nullable Output<OrganizationPolicyBooleanPolicyArgs> booleanPolicy;

    public Output<OrganizationPolicyBooleanPolicyArgs> getBooleanPolicy() {
        return this.booleanPolicy == null ? Codegen.empty() : this.booleanPolicy;
    }

    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @Import(name="constraint", required=true)
      private final Output<String> constraint;

    public Output<String> getConstraint() {
        return this.constraint;
    }

    /**
     * The resource name of the folder to set the policy for. Its format is folders/{folder_id}.
     * 
     */
    @Import(name="folder", required=true)
      private final Output<String> folder;

    public Output<String> getFolder() {
        return this.folder;
    }

    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It
     * can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    @Import(name="listPolicy")
      private final @Nullable Output<OrganizationPolicyListPolicyArgs> listPolicy;

    public Output<OrganizationPolicyListPolicyArgs> getListPolicy() {
        return this.listPolicy == null ? Codegen.empty() : this.listPolicy;
    }

    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    @Import(name="restorePolicy")
      private final @Nullable Output<OrganizationPolicyRestorePolicyArgs> restorePolicy;

    public Output<OrganizationPolicyRestorePolicyArgs> getRestorePolicy() {
        return this.restorePolicy == null ? Codegen.empty() : this.restorePolicy;
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

    public OrganizationPolicyArgs(
        @Nullable Output<OrganizationPolicyBooleanPolicyArgs> booleanPolicy,
        Output<String> constraint,
        Output<String> folder,
        @Nullable Output<OrganizationPolicyListPolicyArgs> listPolicy,
        @Nullable Output<OrganizationPolicyRestorePolicyArgs> restorePolicy,
        @Nullable Output<Integer> version) {
        this.booleanPolicy = booleanPolicy;
        this.constraint = Objects.requireNonNull(constraint, "expected parameter 'constraint' to be non-null");
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.listPolicy = listPolicy;
        this.restorePolicy = restorePolicy;
        this.version = version;
    }

    private OrganizationPolicyArgs() {
        this.booleanPolicy = Codegen.empty();
        this.constraint = Codegen.empty();
        this.folder = Codegen.empty();
        this.listPolicy = Codegen.empty();
        this.restorePolicy = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OrganizationPolicyBooleanPolicyArgs> booleanPolicy;
        private Output<String> constraint;
        private Output<String> folder;
        private @Nullable Output<OrganizationPolicyListPolicyArgs> listPolicy;
        private @Nullable Output<OrganizationPolicyRestorePolicyArgs> restorePolicy;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanPolicy = defaults.booleanPolicy;
    	      this.constraint = defaults.constraint;
    	      this.folder = defaults.folder;
    	      this.listPolicy = defaults.listPolicy;
    	      this.restorePolicy = defaults.restorePolicy;
    	      this.version = defaults.version;
        }

        public Builder booleanPolicy(@Nullable Output<OrganizationPolicyBooleanPolicyArgs> booleanPolicy) {
            this.booleanPolicy = booleanPolicy;
            return this;
        }
        public Builder booleanPolicy(@Nullable OrganizationPolicyBooleanPolicyArgs booleanPolicy) {
            this.booleanPolicy = Codegen.ofNullable(booleanPolicy);
            return this;
        }
        public Builder constraint(Output<String> constraint) {
            this.constraint = Objects.requireNonNull(constraint);
            return this;
        }
        public Builder constraint(String constraint) {
            this.constraint = Output.of(Objects.requireNonNull(constraint));
            return this;
        }
        public Builder folder(Output<String> folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }
        public Builder folder(String folder) {
            this.folder = Output.of(Objects.requireNonNull(folder));
            return this;
        }
        public Builder listPolicy(@Nullable Output<OrganizationPolicyListPolicyArgs> listPolicy) {
            this.listPolicy = listPolicy;
            return this;
        }
        public Builder listPolicy(@Nullable OrganizationPolicyListPolicyArgs listPolicy) {
            this.listPolicy = Codegen.ofNullable(listPolicy);
            return this;
        }
        public Builder restorePolicy(@Nullable Output<OrganizationPolicyRestorePolicyArgs> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }
        public Builder restorePolicy(@Nullable OrganizationPolicyRestorePolicyArgs restorePolicy) {
            this.restorePolicy = Codegen.ofNullable(restorePolicy);
            return this;
        }
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public OrganizationPolicyArgs build() {
            return new OrganizationPolicyArgs(booleanPolicy, constraint, folder, listPolicy, restorePolicy, version);
        }
    }
}
