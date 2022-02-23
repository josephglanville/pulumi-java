// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SynapseWorkspaceSqlPoolTableDataSetMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SynapseWorkspaceSqlPoolTableDataSetMappingArgs Empty = new SynapseWorkspaceSqlPoolTableDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The id of the source data set.
     * 
     */
    @InputImport(name="dataSetId", required=true)
      private final Input<String> dataSetId;

    public Input<String> getDataSetId() {
        return this.dataSetId;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @InputImport(name="dataSetMappingName")
      private final @Nullable Input<String> dataSetMappingName;

    public Input<String> getDataSetMappingName() {
        return this.dataSetMappingName == null ? Input.empty() : this.dataSetMappingName;
    }

    /**
     * Kind of data set mapping.
     * Expected value is 'SynapseWorkspaceSqlPoolTable'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @InputImport(name="shareSubscriptionName", required=true)
      private final Input<String> shareSubscriptionName;

    public Input<String> getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Resource id of the Synapse Workspace SQL Pool Table
     * 
     */
    @InputImport(name="synapseWorkspaceSqlPoolTableResourceId", required=true)
      private final Input<String> synapseWorkspaceSqlPoolTableResourceId;

    public Input<String> getSynapseWorkspaceSqlPoolTableResourceId() {
        return this.synapseWorkspaceSqlPoolTableResourceId;
    }

    public SynapseWorkspaceSqlPoolTableDataSetMappingArgs(
        Input<String> accountName,
        Input<String> dataSetId,
        @Nullable Input<String> dataSetMappingName,
        Input<String> kind,
        Input<String> resourceGroupName,
        Input<String> shareSubscriptionName,
        Input<String> synapseWorkspaceSqlPoolTableResourceId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetId = Objects.requireNonNull(dataSetId, "expected parameter 'dataSetId' to be non-null");
        this.dataSetMappingName = dataSetMappingName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId, "expected parameter 'synapseWorkspaceSqlPoolTableResourceId' to be non-null");
    }

    private SynapseWorkspaceSqlPoolTableDataSetMappingArgs() {
        this.accountName = Input.empty();
        this.dataSetId = Input.empty();
        this.dataSetMappingName = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareSubscriptionName = Input.empty();
        this.synapseWorkspaceSqlPoolTableResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SynapseWorkspaceSqlPoolTableDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> dataSetId;
        private @Nullable Input<String> dataSetMappingName;
        private Input<String> kind;
        private Input<String> resourceGroupName;
        private Input<String> shareSubscriptionName;
        private Input<String> synapseWorkspaceSqlPoolTableResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SynapseWorkspaceSqlPoolTableDataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.synapseWorkspaceSqlPoolTableResourceId = defaults.synapseWorkspaceSqlPoolTableResourceId;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDataSetId(Input<String> dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Input.of(Objects.requireNonNull(dataSetId));
            return this;
        }

        public Builder setDataSetMappingName(@Nullable Input<String> dataSetMappingName) {
            this.dataSetMappingName = dataSetMappingName;
            return this;
        }

        public Builder setDataSetMappingName(@Nullable String dataSetMappingName) {
            this.dataSetMappingName = Input.ofNullable(dataSetMappingName);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setShareSubscriptionName(Input<String> shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder setShareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Input.of(Objects.requireNonNull(shareSubscriptionName));
            return this;
        }

        public Builder setSynapseWorkspaceSqlPoolTableResourceId(Input<String> synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId);
            return this;
        }

        public Builder setSynapseWorkspaceSqlPoolTableResourceId(String synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Input.of(Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId));
            return this;
        }
        public SynapseWorkspaceSqlPoolTableDataSetMappingArgs build() {
            return new SynapseWorkspaceSqlPoolTableDataSetMappingArgs(accountName, dataSetId, dataSetMappingName, kind, resourceGroupName, shareSubscriptionName, synapseWorkspaceSqlPoolTableResourceId);
        }
    }
}
