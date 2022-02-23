// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServerAzureADOnlyAuthenticationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerAzureADOnlyAuthenticationArgs Empty = new GetServerAzureADOnlyAuthenticationArgs();

    /**
     * The name of server azure active directory only authentication.
     * 
     */
    @InputImport(name="authenticationName", required=true)
      private final String authenticationName;

    public String getAuthenticationName() {
        return this.authenticationName;
    }

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
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    public GetServerAzureADOnlyAuthenticationArgs(
        String authenticationName,
        String resourceGroupName,
        String serverName) {
        this.authenticationName = Objects.requireNonNull(authenticationName, "expected parameter 'authenticationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetServerAzureADOnlyAuthenticationArgs() {
        this.authenticationName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerAzureADOnlyAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authenticationName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerAzureADOnlyAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationName = defaults.authenticationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder setAuthenticationName(String authenticationName) {
            this.authenticationName = Objects.requireNonNull(authenticationName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public GetServerAzureADOnlyAuthenticationArgs build() {
            return new GetServerAzureADOnlyAuthenticationArgs(authenticationName, resourceGroupName, serverName);
        }
    }
}
