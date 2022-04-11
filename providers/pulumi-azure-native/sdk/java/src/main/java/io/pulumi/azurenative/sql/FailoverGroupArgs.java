// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.FailoverGroupReadOnlyEndpointArgs;
import io.pulumi.azurenative.sql.inputs.FailoverGroupReadWriteEndpointArgs;
import io.pulumi.azurenative.sql.inputs.PartnerInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="databases")
      private final @Nullable Output<List<String>> databases;

    public Output<List<String>> getDatabases() {
        return this.databases == null ? Codegen.empty() : this.databases;
    }

    /**
     * The name of the failover group.
     * 
     */
    @Import(name="failoverGroupName")
      private final @Nullable Output<String> failoverGroupName;

    public Output<String> getFailoverGroupName() {
        return this.failoverGroupName == null ? Codegen.empty() : this.failoverGroupName;
    }

    /**
     * List of partner server information for the failover group.
     * 
     */
    @Import(name="partnerServers", required=true)
      private final Output<List<PartnerInfoArgs>> partnerServers;

    public Output<List<PartnerInfoArgs>> getPartnerServers() {
        return this.partnerServers;
    }

    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    @Import(name="readOnlyEndpoint")
      private final @Nullable Output<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint;

    public Output<FailoverGroupReadOnlyEndpointArgs> getReadOnlyEndpoint() {
        return this.readOnlyEndpoint == null ? Codegen.empty() : this.readOnlyEndpoint;
    }

    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    @Import(name="readWriteEndpoint", required=true)
      private final Output<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint;

    public Output<FailoverGroupReadWriteEndpointArgs> getReadWriteEndpoint() {
        return this.readWriteEndpoint;
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
     * The name of the server containing the failover group.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public FailoverGroupArgs(
        @Nullable Output<List<String>> databases,
        @Nullable Output<String> failoverGroupName,
        Output<List<PartnerInfoArgs>> partnerServers,
        @Nullable Output<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint,
        Output<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint,
        Output<String> resourceGroupName,
        Output<String> serverName,
        @Nullable Output<Map<String,String>> tags) {
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
        this.databases = Codegen.empty();
        this.failoverGroupName = Codegen.empty();
        this.partnerServers = Codegen.empty();
        this.readOnlyEndpoint = Codegen.empty();
        this.readWriteEndpoint = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> databases;
        private @Nullable Output<String> failoverGroupName;
        private Output<List<PartnerInfoArgs>> partnerServers;
        private @Nullable Output<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint;
        private Output<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint;
        private Output<String> resourceGroupName;
        private Output<String> serverName;
        private @Nullable Output<Map<String,String>> tags;

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

        public Builder databases(@Nullable Output<List<String>> databases) {
            this.databases = databases;
            return this;
        }
        public Builder databases(@Nullable List<String> databases) {
            this.databases = Codegen.ofNullable(databases);
            return this;
        }
        public Builder databases(String... databases) {
            return databases(List.of(databases));
        }
        public Builder failoverGroupName(@Nullable Output<String> failoverGroupName) {
            this.failoverGroupName = failoverGroupName;
            return this;
        }
        public Builder failoverGroupName(@Nullable String failoverGroupName) {
            this.failoverGroupName = Codegen.ofNullable(failoverGroupName);
            return this;
        }
        public Builder partnerServers(Output<List<PartnerInfoArgs>> partnerServers) {
            this.partnerServers = Objects.requireNonNull(partnerServers);
            return this;
        }
        public Builder partnerServers(List<PartnerInfoArgs> partnerServers) {
            this.partnerServers = Output.of(Objects.requireNonNull(partnerServers));
            return this;
        }
        public Builder partnerServers(PartnerInfoArgs... partnerServers) {
            return partnerServers(List.of(partnerServers));
        }
        public Builder readOnlyEndpoint(@Nullable Output<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint) {
            this.readOnlyEndpoint = readOnlyEndpoint;
            return this;
        }
        public Builder readOnlyEndpoint(@Nullable FailoverGroupReadOnlyEndpointArgs readOnlyEndpoint) {
            this.readOnlyEndpoint = Codegen.ofNullable(readOnlyEndpoint);
            return this;
        }
        public Builder readWriteEndpoint(Output<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint) {
            this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint);
            return this;
        }
        public Builder readWriteEndpoint(FailoverGroupReadWriteEndpointArgs readWriteEndpoint) {
            this.readWriteEndpoint = Output.of(Objects.requireNonNull(readWriteEndpoint));
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
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public FailoverGroupArgs build() {
            return new FailoverGroupArgs(databases, failoverGroupName, partnerServers, readOnlyEndpoint, readWriteEndpoint, resourceGroupName, serverName, tags);
        }
    }
}
