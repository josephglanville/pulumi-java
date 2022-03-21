// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseSecurityAlertPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseSecurityAlertPolicyArgs Empty = new GetDatabaseSecurityAlertPolicyArgs();

    /**
     * The name of the  database for which the security alert policy is defined.
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the security alert policy.
     * 
     */
    @Import(name="securityAlertPolicyName", required=true)
      private final String securityAlertPolicyName;

    public String getSecurityAlertPolicyName() {
        return this.securityAlertPolicyName;
    }

    /**
     * The name of the  server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    public GetDatabaseSecurityAlertPolicyArgs(
        String databaseName,
        String resourceGroupName,
        String securityAlertPolicyName,
        String serverName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityAlertPolicyName = Objects.requireNonNull(securityAlertPolicyName, "expected parameter 'securityAlertPolicyName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetDatabaseSecurityAlertPolicyArgs() {
        this.databaseName = null;
        this.resourceGroupName = null;
        this.securityAlertPolicyName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseSecurityAlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private String resourceGroupName;
        private String securityAlertPolicyName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseSecurityAlertPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityAlertPolicyName = defaults.securityAlertPolicyName;
    	      this.serverName = defaults.serverName;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder securityAlertPolicyName(String securityAlertPolicyName) {
            this.securityAlertPolicyName = Objects.requireNonNull(securityAlertPolicyName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }        public GetDatabaseSecurityAlertPolicyArgs build() {
            return new GetDatabaseSecurityAlertPolicyArgs(databaseName, resourceGroupName, securityAlertPolicyName, serverName);
        }
    }
}
