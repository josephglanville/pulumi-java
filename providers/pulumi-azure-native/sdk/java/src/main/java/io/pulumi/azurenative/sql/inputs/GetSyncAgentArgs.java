// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSyncAgentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSyncAgentArgs Empty = new GetSyncAgentArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server on which the sync agent is hosted.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    /**
     * The name of the sync agent.
     * 
     */
    @InputImport(name="syncAgentName", required=true)
      private final String syncAgentName;

    public String getSyncAgentName() {
        return this.syncAgentName;
    }

    public GetSyncAgentArgs(
        String resourceGroupName,
        String serverName,
        String syncAgentName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.syncAgentName = Objects.requireNonNull(syncAgentName, "expected parameter 'syncAgentName' to be non-null");
    }

    private GetSyncAgentArgs() {
        this.resourceGroupName = null;
        this.serverName = null;
        this.syncAgentName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSyncAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serverName;
        private String syncAgentName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSyncAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.syncAgentName = defaults.syncAgentName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setSyncAgentName(String syncAgentName) {
            this.syncAgentName = Objects.requireNonNull(syncAgentName);
            return this;
        }
        public GetSyncAgentArgs build() {
            return new GetSyncAgentArgs(resourceGroupName, serverName, syncAgentName);
        }
    }
}
