// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SyncAgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final SyncAgentArgs Empty = new SyncAgentArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server on which the sync agent is hosted.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * The name of the sync agent.
     * 
     */
    @InputImport(name="syncAgentName")
      private final @Nullable Output<String> syncAgentName;

    public Output<String> getSyncAgentName() {
        return this.syncAgentName == null ? Output.empty() : this.syncAgentName;
    }

    /**
     * ARM resource id of the sync database in the sync agent.
     * 
     */
    @InputImport(name="syncDatabaseId")
      private final @Nullable Output<String> syncDatabaseId;

    public Output<String> getSyncDatabaseId() {
        return this.syncDatabaseId == null ? Output.empty() : this.syncDatabaseId;
    }

    public SyncAgentArgs(
        Output<String> resourceGroupName,
        Output<String> serverName,
        @Nullable Output<String> syncAgentName,
        @Nullable Output<String> syncDatabaseId) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.syncAgentName = syncAgentName;
        this.syncDatabaseId = syncDatabaseId;
    }

    private SyncAgentArgs() {
        this.resourceGroupName = Output.empty();
        this.serverName = Output.empty();
        this.syncAgentName = Output.empty();
        this.syncDatabaseId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceGroupName;
        private Output<String> serverName;
        private @Nullable Output<String> syncAgentName;
        private @Nullable Output<String> syncDatabaseId;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.syncAgentName = defaults.syncAgentName;
    	      this.syncDatabaseId = defaults.syncDatabaseId;
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
        }

        public Builder syncAgentName(@Nullable Output<String> syncAgentName) {
            this.syncAgentName = syncAgentName;
            return this;
        }

        public Builder syncAgentName(@Nullable String syncAgentName) {
            this.syncAgentName = Output.ofNullable(syncAgentName);
            return this;
        }

        public Builder syncDatabaseId(@Nullable Output<String> syncDatabaseId) {
            this.syncDatabaseId = syncDatabaseId;
            return this;
        }

        public Builder syncDatabaseId(@Nullable String syncDatabaseId) {
            this.syncDatabaseId = Output.ofNullable(syncDatabaseId);
            return this;
        }
        public SyncAgentArgs build() {
            return new SyncAgentArgs(resourceGroupName, serverName, syncAgentName, syncDatabaseId);
        }
    }
}
