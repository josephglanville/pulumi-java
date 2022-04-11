// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupShortTermRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupShortTermRetentionPolicyArgs Empty = new BackupShortTermRetentionPolicyArgs();

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The policy name. Should always be "default".
     * 
     */
    @Import(name="policyName")
      private final @Nullable Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName == null ? Codegen.empty() : this.policyName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
     * 
     */
    @Import(name="retentionDays")
      private final @Nullable Output<Integer> retentionDays;

    public Output<Integer> getRetentionDays() {
        return this.retentionDays == null ? Codegen.empty() : this.retentionDays;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    public BackupShortTermRetentionPolicyArgs(
        Output<String> databaseName,
        @Nullable Output<String> policyName,
        Output<String> resourceGroupName,
        @Nullable Output<Integer> retentionDays,
        Output<String> serverName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.policyName = policyName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retentionDays = retentionDays;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private BackupShortTermRetentionPolicyArgs() {
        this.databaseName = Codegen.empty();
        this.policyName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.retentionDays = Codegen.empty();
        this.serverName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupShortTermRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> databaseName;
        private @Nullable Output<String> policyName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Integer> retentionDays;
        private Output<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupShortTermRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.policyName = defaults.policyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionDays = defaults.retentionDays;
    	      this.serverName = defaults.serverName;
        }

        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder policyName(@Nullable Output<String> policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = Codegen.ofNullable(policyName);
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
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Codegen.ofNullable(retentionDays);
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }        public BackupShortTermRetentionPolicyArgs build() {
            return new BackupShortTermRetentionPolicyArgs(databaseName, policyName, resourceGroupName, retentionDays, serverName);
        }
    }
}
