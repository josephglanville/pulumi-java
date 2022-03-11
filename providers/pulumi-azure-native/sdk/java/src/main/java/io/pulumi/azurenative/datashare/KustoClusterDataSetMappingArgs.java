// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KustoClusterDataSetMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final KustoClusterDataSetMappingArgs Empty = new KustoClusterDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The id of the source data set.
     * 
     */
    @InputImport(name="dataSetId", required=true)
      private final Output<String> dataSetId;

    public Output<String> getDataSetId() {
        return this.dataSetId;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @InputImport(name="dataSetMappingName")
      private final @Nullable Output<String> dataSetMappingName;

    public Output<String> getDataSetMappingName() {
        return this.dataSetMappingName == null ? Output.empty() : this.dataSetMappingName;
    }

    /**
     * Kind of data set mapping.
     * Expected value is 'KustoCluster'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Resource id of the sink kusto cluster.
     * 
     */
    @InputImport(name="kustoClusterResourceId", required=true)
      private final Output<String> kustoClusterResourceId;

    public Output<String> getKustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @InputImport(name="shareSubscriptionName", required=true)
      private final Output<String> shareSubscriptionName;

    public Output<String> getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    public KustoClusterDataSetMappingArgs(
        Output<String> accountName,
        Output<String> dataSetId,
        @Nullable Output<String> dataSetMappingName,
        Output<String> kind,
        Output<String> kustoClusterResourceId,
        Output<String> resourceGroupName,
        Output<String> shareSubscriptionName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetId = Objects.requireNonNull(dataSetId, "expected parameter 'dataSetId' to be non-null");
        this.dataSetMappingName = dataSetMappingName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.kustoClusterResourceId = Objects.requireNonNull(kustoClusterResourceId, "expected parameter 'kustoClusterResourceId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
    }

    private KustoClusterDataSetMappingArgs() {
        this.accountName = Output.empty();
        this.dataSetId = Output.empty();
        this.dataSetMappingName = Output.empty();
        this.kind = Output.empty();
        this.kustoClusterResourceId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.shareSubscriptionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KustoClusterDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> dataSetId;
        private @Nullable Output<String> dataSetMappingName;
        private Output<String> kind;
        private Output<String> kustoClusterResourceId;
        private Output<String> resourceGroupName;
        private Output<String> shareSubscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(KustoClusterDataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.kind = defaults.kind;
    	      this.kustoClusterResourceId = defaults.kustoClusterResourceId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder dataSetId(Output<String> dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Output.of(Objects.requireNonNull(dataSetId));
            return this;
        }

        public Builder dataSetMappingName(@Nullable Output<String> dataSetMappingName) {
            this.dataSetMappingName = dataSetMappingName;
            return this;
        }

        public Builder dataSetMappingName(@Nullable String dataSetMappingName) {
            this.dataSetMappingName = Output.ofNullable(dataSetMappingName);
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

        public Builder kustoClusterResourceId(Output<String> kustoClusterResourceId) {
            this.kustoClusterResourceId = Objects.requireNonNull(kustoClusterResourceId);
            return this;
        }

        public Builder kustoClusterResourceId(String kustoClusterResourceId) {
            this.kustoClusterResourceId = Output.of(Objects.requireNonNull(kustoClusterResourceId));
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

        public Builder shareSubscriptionName(Output<String> shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder shareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Output.of(Objects.requireNonNull(shareSubscriptionName));
            return this;
        }
        public KustoClusterDataSetMappingArgs build() {
            return new KustoClusterDataSetMappingArgs(accountName, dataSetId, dataSetMappingName, kind, kustoClusterResourceId, resourceGroupName, shareSubscriptionName);
        }
    }
}
