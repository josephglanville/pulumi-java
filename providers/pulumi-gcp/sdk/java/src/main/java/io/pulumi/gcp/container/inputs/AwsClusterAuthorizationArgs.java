// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.AwsClusterAuthorizationAdminUserArgs;
import java.util.List;
import java.util.Objects;


public final class AwsClusterAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterAuthorizationArgs Empty = new AwsClusterAuthorizationArgs();

    /**
     * Required. Users to perform operations as a cluster admin. A managed ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole to the users. At most one user can be specified. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * 
     */
    @InputImport(name="adminUsers", required=true)
      private final Output<List<AwsClusterAuthorizationAdminUserArgs>> adminUsers;

    public Output<List<AwsClusterAuthorizationAdminUserArgs>> getAdminUsers() {
        return this.adminUsers;
    }

    public AwsClusterAuthorizationArgs(Output<List<AwsClusterAuthorizationAdminUserArgs>> adminUsers) {
        this.adminUsers = Objects.requireNonNull(adminUsers, "expected parameter 'adminUsers' to be non-null");
    }

    private AwsClusterAuthorizationArgs() {
        this.adminUsers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<AwsClusterAuthorizationAdminUserArgs>> adminUsers;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsers = defaults.adminUsers;
        }

        public Builder adminUsers(Output<List<AwsClusterAuthorizationAdminUserArgs>> adminUsers) {
            this.adminUsers = Objects.requireNonNull(adminUsers);
            return this;
        }

        public Builder adminUsers(List<AwsClusterAuthorizationAdminUserArgs> adminUsers) {
            this.adminUsers = Output.of(Objects.requireNonNull(adminUsers));
            return this;
        }
        public AwsClusterAuthorizationArgs build() {
            return new AwsClusterAuthorizationArgs(adminUsers);
        }
    }
}
