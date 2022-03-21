// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.ClusterPrincipalRole;
import io.pulumi.azurenative.kusto.enums.PrincipalType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterPrincipalAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterPrincipalAssignmentArgs Empty = new ClusterPrincipalAssignmentArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the Kusto principalAssignment.
     * 
     */
    @Import(name="principalAssignmentName")
      private final @Nullable Output<String> principalAssignmentName;

    public Output<String> getPrincipalAssignmentName() {
        return this.principalAssignmentName == null ? Output.empty() : this.principalAssignmentName;
    }

    /**
     * The principal ID assigned to the cluster principal. It can be a user email, application ID, or security group name.
     * 
     */
    @Import(name="principalId", required=true)
      private final Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId;
    }

    /**
     * Principal type.
     * 
     */
    @Import(name="principalType", required=true)
      private final Output<Either<String,PrincipalType>> principalType;

    public Output<Either<String,PrincipalType>> getPrincipalType() {
        return this.principalType;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Cluster principal role.
     * 
     */
    @Import(name="role", required=true)
      private final Output<Either<String,ClusterPrincipalRole>> role;

    public Output<Either<String,ClusterPrincipalRole>> getRole() {
        return this.role;
    }

    /**
     * The tenant id of the principal
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    public ClusterPrincipalAssignmentArgs(
        Output<String> clusterName,
        @Nullable Output<String> principalAssignmentName,
        Output<String> principalId,
        Output<Either<String,PrincipalType>> principalType,
        Output<String> resourceGroupName,
        Output<Either<String,ClusterPrincipalRole>> role,
        @Nullable Output<String> tenantId) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.principalAssignmentName = principalAssignmentName;
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.tenantId = tenantId;
    }

    private ClusterPrincipalAssignmentArgs() {
        this.clusterName = Output.empty();
        this.principalAssignmentName = Output.empty();
        this.principalId = Output.empty();
        this.principalType = Output.empty();
        this.resourceGroupName = Output.empty();
        this.role = Output.empty();
        this.tenantId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterPrincipalAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> principalAssignmentName;
        private Output<String> principalId;
        private Output<Either<String,PrincipalType>> principalType;
        private Output<String> resourceGroupName;
        private Output<Either<String,ClusterPrincipalRole>> role;
        private @Nullable Output<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterPrincipalAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.principalAssignmentName = defaults.principalAssignmentName;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.role = defaults.role;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder principalAssignmentName(@Nullable Output<String> principalAssignmentName) {
            this.principalAssignmentName = principalAssignmentName;
            return this;
        }
        public Builder principalAssignmentName(@Nullable String principalAssignmentName) {
            this.principalAssignmentName = Output.ofNullable(principalAssignmentName);
            return this;
        }
        public Builder principalId(Output<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Output.of(Objects.requireNonNull(principalId));
            return this;
        }
        public Builder principalType(Output<Either<String,PrincipalType>> principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }
        public Builder principalType(Either<String,PrincipalType> principalType) {
            this.principalType = Output.of(Objects.requireNonNull(principalType));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder role(Output<Either<String,ClusterPrincipalRole>> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(Either<String,ClusterPrincipalRole> role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Output.ofNullable(tenantId);
            return this;
        }        public ClusterPrincipalAssignmentArgs build() {
            return new ClusterPrincipalAssignmentArgs(clusterName, principalAssignmentName, principalId, principalType, resourceGroupName, role, tenantId);
        }
    }
}
