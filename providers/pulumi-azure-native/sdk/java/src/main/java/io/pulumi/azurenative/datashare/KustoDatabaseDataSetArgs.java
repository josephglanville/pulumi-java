// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KustoDatabaseDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final KustoDatabaseDataSetArgs Empty = new KustoDatabaseDataSetArgs();

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
     * Expected value is 'KustoDatabase'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Resource id of the kusto database.
     * 
     */
    @Import(name="kustoDatabaseResourceId", required=true)
      private final Output<String> kustoDatabaseResourceId;

    public Output<String> getKustoDatabaseResourceId() {
        return this.kustoDatabaseResourceId;
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

    public KustoDatabaseDataSetArgs(
        Output<String> accountName,
        @Nullable Output<String> dataSetName,
        Output<String> kind,
        Output<String> kustoDatabaseResourceId,
        Output<String> resourceGroupName,
        Output<String> shareName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.kustoDatabaseResourceId = Objects.requireNonNull(kustoDatabaseResourceId, "expected parameter 'kustoDatabaseResourceId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
    }

    private KustoDatabaseDataSetArgs() {
        this.accountName = Output.empty();
        this.dataSetName = Output.empty();
        this.kind = Output.empty();
        this.kustoDatabaseResourceId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.shareName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KustoDatabaseDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> dataSetName;
        private Output<String> kind;
        private Output<String> kustoDatabaseResourceId;
        private Output<String> resourceGroupName;
        private Output<String> shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(KustoDatabaseDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.kind = defaults.kind;
    	      this.kustoDatabaseResourceId = defaults.kustoDatabaseResourceId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
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
        public Builder kustoDatabaseResourceId(Output<String> kustoDatabaseResourceId) {
            this.kustoDatabaseResourceId = Objects.requireNonNull(kustoDatabaseResourceId);
            return this;
        }
        public Builder kustoDatabaseResourceId(String kustoDatabaseResourceId) {
            this.kustoDatabaseResourceId = Output.of(Objects.requireNonNull(kustoDatabaseResourceId));
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
        }        public KustoDatabaseDataSetArgs build() {
            return new KustoDatabaseDataSetArgs(accountName, dataSetName, kind, kustoDatabaseResourceId, resourceGroupName, shareName);
        }
    }
}
