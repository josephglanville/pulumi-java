// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerCommunicationLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCommunicationLinkArgs Empty = new ServerCommunicationLinkArgs();

    /**
     * The name of the server communication link.
     * 
     */
    @Import(name="communicationLinkName")
      private final @Nullable Output<String> communicationLinkName;

    public Output<String> getCommunicationLinkName() {
        return this.communicationLinkName == null ? Output.empty() : this.communicationLinkName;
    }

    /**
     * The name of the partner server.
     * 
     */
    @Import(name="partnerServer", required=true)
      private final Output<String> partnerServer;

    public Output<String> getPartnerServer() {
        return this.partnerServer;
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
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    public ServerCommunicationLinkArgs(
        @Nullable Output<String> communicationLinkName,
        Output<String> partnerServer,
        Output<String> resourceGroupName,
        Output<String> serverName) {
        this.communicationLinkName = communicationLinkName;
        this.partnerServer = Objects.requireNonNull(partnerServer, "expected parameter 'partnerServer' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private ServerCommunicationLinkArgs() {
        this.communicationLinkName = Output.empty();
        this.partnerServer = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serverName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCommunicationLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> communicationLinkName;
        private Output<String> partnerServer;
        private Output<String> resourceGroupName;
        private Output<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCommunicationLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.communicationLinkName = defaults.communicationLinkName;
    	      this.partnerServer = defaults.partnerServer;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder communicationLinkName(@Nullable Output<String> communicationLinkName) {
            this.communicationLinkName = communicationLinkName;
            return this;
        }
        public Builder communicationLinkName(@Nullable String communicationLinkName) {
            this.communicationLinkName = Output.ofNullable(communicationLinkName);
            return this;
        }
        public Builder partnerServer(Output<String> partnerServer) {
            this.partnerServer = Objects.requireNonNull(partnerServer);
            return this;
        }
        public Builder partnerServer(String partnerServer) {
            this.partnerServer = Output.of(Objects.requireNonNull(partnerServer));
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
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }        public ServerCommunicationLinkArgs build() {
            return new ServerCommunicationLinkArgs(communicationLinkName, partnerServer, resourceGroupName, serverName);
        }
    }
}
