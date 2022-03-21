// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataMaskingPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataMaskingPolicyArgs Empty = new GetDataMaskingPolicyArgs();

    /**
     * The name of the database for which the data masking rule applies.
     * 
     */
    @Import(name="dataMaskingPolicyName", required=true)
      private final String dataMaskingPolicyName;

    public String getDataMaskingPolicyName() {
        return this.dataMaskingPolicyName;
    }

    /**
     * The name of the database.
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
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    public GetDataMaskingPolicyArgs(
        String dataMaskingPolicyName,
        String databaseName,
        String resourceGroupName,
        String serverName) {
        this.dataMaskingPolicyName = Objects.requireNonNull(dataMaskingPolicyName, "expected parameter 'dataMaskingPolicyName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetDataMaskingPolicyArgs() {
        this.dataMaskingPolicyName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataMaskingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataMaskingPolicyName;
        private String databaseName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataMaskingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataMaskingPolicyName = defaults.dataMaskingPolicyName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder dataMaskingPolicyName(String dataMaskingPolicyName) {
            this.dataMaskingPolicyName = Objects.requireNonNull(dataMaskingPolicyName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }        public GetDataMaskingPolicyArgs build() {
            return new GetDataMaskingPolicyArgs(dataMaskingPolicyName, databaseName, resourceGroupName, serverName);
        }
    }
}
