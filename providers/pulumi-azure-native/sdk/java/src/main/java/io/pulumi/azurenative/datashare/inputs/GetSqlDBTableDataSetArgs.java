// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlDBTableDataSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlDBTableDataSetArgs Empty = new GetSqlDBTableDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName", required=true)
      private final String dataSetName;

    public String getDataSetName() {
        return this.dataSetName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
      private final String shareName;

    public String getShareName() {
        return this.shareName;
    }

    public GetSqlDBTableDataSetArgs(
        String accountName,
        String dataSetName,
        String resourceGroupName,
        String shareName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = Objects.requireNonNull(dataSetName, "expected parameter 'dataSetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
    }

    private GetSqlDBTableDataSetArgs() {
        this.accountName = null;
        this.dataSetName = null;
        this.resourceGroupName = null;
        this.shareName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlDBTableDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String dataSetName;
        private String resourceGroupName;
        private String shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlDBTableDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder dataSetName(String dataSetName) {
            this.dataSetName = Objects.requireNonNull(dataSetName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }        public GetSqlDBTableDataSetArgs build() {
            return new GetSqlDBTableDataSetArgs(accountName, dataSetName, resourceGroupName, shareName);
        }
    }
}
