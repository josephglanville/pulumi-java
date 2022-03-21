// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SynapseWorkspaceSqlPoolTableDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SynapseWorkspaceSqlPoolTableDataSetArgs Empty = new SynapseWorkspaceSqlPoolTableDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName")
      private final @Nullable Output<String> dataSetName;

    public Output<String> getDataSetName() {
        return this.dataSetName == null ? Output.empty() : this.dataSetName;
    }

    /**
     * Kind of data set.
     * Expected value is 'SynapseWorkspaceSqlPoolTable'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to add the data set to.
     * 
     */
    @Import(name="shareName", required=true)
      private final Output<String> shareName;

    public Output<String> getShareName() {
        return this.shareName;
    }

    /**
     * Resource id of the Synapse Workspace SQL Pool Table
     * 
     */
    @Import(name="synapseWorkspaceSqlPoolTableResourceId", required=true)
      private final Output<String> synapseWorkspaceSqlPoolTableResourceId;

    public Output<String> getSynapseWorkspaceSqlPoolTableResourceId() {
        return this.synapseWorkspaceSqlPoolTableResourceId;
    }

    public SynapseWorkspaceSqlPoolTableDataSetArgs(
        Output<String> accountName,
        @Nullable Output<String> dataSetName,
        Output<String> kind,
        Output<String> resourceGroupName,
        Output<String> shareName,
        Output<String> synapseWorkspaceSqlPoolTableResourceId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId, "expected parameter 'synapseWorkspaceSqlPoolTableResourceId' to be non-null");
    }

    private SynapseWorkspaceSqlPoolTableDataSetArgs() {
        this.accountName = Output.empty();
        this.dataSetName = Output.empty();
        this.kind = Output.empty();
        this.resourceGroupName = Output.empty();
        this.shareName = Output.empty();
        this.synapseWorkspaceSqlPoolTableResourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SynapseWorkspaceSqlPoolTableDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> dataSetName;
        private Output<String> kind;
        private Output<String> resourceGroupName;
        private Output<String> shareName;
        private Output<String> synapseWorkspaceSqlPoolTableResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SynapseWorkspaceSqlPoolTableDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
    	      this.synapseWorkspaceSqlPoolTableResourceId = defaults.synapseWorkspaceSqlPoolTableResourceId;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder dataSetName(@Nullable Output<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public Builder dataSetName(@Nullable String dataSetName) {
            this.dataSetName = Output.ofNullable(dataSetName);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
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
        public Builder shareName(Output<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Output.of(Objects.requireNonNull(shareName));
            return this;
        }
        public Builder synapseWorkspaceSqlPoolTableResourceId(Output<String> synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId);
            return this;
        }
        public Builder synapseWorkspaceSqlPoolTableResourceId(String synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Output.of(Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId));
            return this;
        }        public SynapseWorkspaceSqlPoolTableDataSetArgs build() {
            return new SynapseWorkspaceSqlPoolTableDataSetArgs(accountName, dataSetName, kind, resourceGroupName, shareName, synapseWorkspaceSqlPoolTableResourceId);
        }
    }
}
