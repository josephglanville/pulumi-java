// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.FailoverGroupReadOnlyEndpointArgs;
import io.pulumi.azurenative.sql.inputs.FailoverGroupReadWriteEndpointArgs;
import io.pulumi.azurenative.sql.inputs.PartnerInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FailoverGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final FailoverGroupArgs Empty = new FailoverGroupArgs();

    /**
     * List of databases in the failover group.
     * 
     */
    @InputImport(name="databases")
      private final @Nullable Input<List<String>> databases;

    public Input<List<String>> getDatabases() {
        return this.databases == null ? Input.empty() : this.databases;
    }

    /**
     * The name of the failover group.
     * 
     */
    @InputImport(name="failoverGroupName")
      private final @Nullable Input<String> failoverGroupName;

    public Input<String> getFailoverGroupName() {
        return this.failoverGroupName == null ? Input.empty() : this.failoverGroupName;
    }

    /**
     * List of partner server information for the failover group.
     * 
     */
    @InputImport(name="partnerServers", required=true)
      private final Input<List<PartnerInfoArgs>> partnerServers;

    public Input<List<PartnerInfoArgs>> getPartnerServers() {
        return this.partnerServers;
    }

    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    @InputImport(name="readOnlyEndpoint")
      private final @Nullable Input<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint;

    public Input<FailoverGroupReadOnlyEndpointArgs> getReadOnlyEndpoint() {
        return this.readOnlyEndpoint == null ? Input.empty() : this.readOnlyEndpoint;
    }

    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    @InputImport(name="readWriteEndpoint", required=true)
      private final Input<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint;

    public Input<FailoverGroupReadWriteEndpointArgs> getReadWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server containing the failover group.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FailoverGroupArgs(
        @Nullable Input<List<String>> databases,
        @Nullable Input<String> failoverGroupName,
        Input<List<PartnerInfoArgs>> partnerServers,
        @Nullable Input<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint,
        Input<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint,
        Input<String> resourceGroupName,
        Input<String> serverName,
        @Nullable Input<Map<String,String>> tags) {
        this.databases = databases;
        this.failoverGroupName = failoverGroupName;
        this.partnerServers = Objects.requireNonNull(partnerServers, "expected parameter 'partnerServers' to be non-null");
        this.readOnlyEndpoint = readOnlyEndpoint;
        this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint, "expected parameter 'readWriteEndpoint' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.tags = tags;
    }

    private FailoverGroupArgs() {
        this.databases = Input.empty();
        this.failoverGroupName = Input.empty();
        this.partnerServers = Input.empty();
        this.readOnlyEndpoint = Input.empty();
        this.readWriteEndpoint = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> databases;
        private @Nullable Input<String> failoverGroupName;
        private Input<List<PartnerInfoArgs>> partnerServers;
        private @Nullable Input<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint;
        private Input<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.failoverGroupName = defaults.failoverGroupName;
    	      this.partnerServers = defaults.partnerServers;
    	      this.readOnlyEndpoint = defaults.readOnlyEndpoint;
    	      this.readWriteEndpoint = defaults.readWriteEndpoint;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.tags = defaults.tags;
        }

        public Builder setDatabases(@Nullable Input<List<String>> databases) {
            this.databases = databases;
            return this;
        }

        public Builder setDatabases(@Nullable List<String> databases) {
            this.databases = Input.ofNullable(databases);
            return this;
        }

        public Builder setFailoverGroupName(@Nullable Input<String> failoverGroupName) {
            this.failoverGroupName = failoverGroupName;
            return this;
        }

        public Builder setFailoverGroupName(@Nullable String failoverGroupName) {
            this.failoverGroupName = Input.ofNullable(failoverGroupName);
            return this;
        }

        public Builder setPartnerServers(Input<List<PartnerInfoArgs>> partnerServers) {
            this.partnerServers = Objects.requireNonNull(partnerServers);
            return this;
        }

        public Builder setPartnerServers(List<PartnerInfoArgs> partnerServers) {
            this.partnerServers = Input.of(Objects.requireNonNull(partnerServers));
            return this;
        }

        public Builder setReadOnlyEndpoint(@Nullable Input<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint) {
            this.readOnlyEndpoint = readOnlyEndpoint;
            return this;
        }

        public Builder setReadOnlyEndpoint(@Nullable FailoverGroupReadOnlyEndpointArgs readOnlyEndpoint) {
            this.readOnlyEndpoint = Input.ofNullable(readOnlyEndpoint);
            return this;
        }

        public Builder setReadWriteEndpoint(Input<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint) {
            this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint);
            return this;
        }

        public Builder setReadWriteEndpoint(FailoverGroupReadWriteEndpointArgs readWriteEndpoint) {
            this.readWriteEndpoint = Input.of(Objects.requireNonNull(readWriteEndpoint));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public FailoverGroupArgs build() {
            return new FailoverGroupArgs(databases, failoverGroupName, partnerServers, readOnlyEndpoint, readWriteEndpoint, resourceGroupName, serverName, tags);
        }
    }
}
