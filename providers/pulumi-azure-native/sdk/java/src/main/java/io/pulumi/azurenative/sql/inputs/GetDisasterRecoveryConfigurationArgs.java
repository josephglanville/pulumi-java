// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDisasterRecoveryConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDisasterRecoveryConfigurationArgs Empty = new GetDisasterRecoveryConfigurationArgs();

    /**
     * The name of the disaster recovery configuration.
     * 
     */
    @Import(name="disasterRecoveryConfigurationName", required=true)
      private final String disasterRecoveryConfigurationName;

    public String getDisasterRecoveryConfigurationName() {
        return this.disasterRecoveryConfigurationName;
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

    public GetDisasterRecoveryConfigurationArgs(
        String disasterRecoveryConfigurationName,
        String resourceGroupName,
        String serverName) {
        this.disasterRecoveryConfigurationName = Objects.requireNonNull(disasterRecoveryConfigurationName, "expected parameter 'disasterRecoveryConfigurationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetDisasterRecoveryConfigurationArgs() {
        this.disasterRecoveryConfigurationName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDisasterRecoveryConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String disasterRecoveryConfigurationName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDisasterRecoveryConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disasterRecoveryConfigurationName = defaults.disasterRecoveryConfigurationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder disasterRecoveryConfigurationName(String disasterRecoveryConfigurationName) {
            this.disasterRecoveryConfigurationName = Objects.requireNonNull(disasterRecoveryConfigurationName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }        public GetDisasterRecoveryConfigurationArgs build() {
            return new GetDisasterRecoveryConfigurationArgs(disasterRecoveryConfigurationName, resourceGroupName, serverName);
        }
    }
}
