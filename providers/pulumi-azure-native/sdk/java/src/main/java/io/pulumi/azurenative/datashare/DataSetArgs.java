// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.datashare.enums.DataSetKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetArgs Empty = new DataSetArgs();

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
     * The name of the dataSet.
     * 
     */
    @InputImport(name="dataSetName")
      private final @Nullable Input<String> dataSetName;

    public Input<String> getDataSetName() {
        return this.dataSetName == null ? Input.empty() : this.dataSetName;
    }

    /**
     * Kind of data set.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,DataSetKind>> kind;

    public Input<Either<String,DataSetKind>> getKind() {
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
     * The name of the share to add the data set to.
     * 
     */
    @InputImport(name="shareName", required=true)
      private final Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName;
    }

    public DataSetArgs(
        Input<String> accountName,
        @Nullable Input<String> dataSetName,
        Input<Either<String,DataSetKind>> kind,
        Input<String> resourceGroupName,
        Input<String> shareName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
    }

    private DataSetArgs() {
        this.accountName = Input.empty();
        this.dataSetName = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> dataSetName;
        private Input<Either<String,DataSetKind>> kind;
        private Input<String> resourceGroupName;
        private Input<String> shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDataSetName(@Nullable Input<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }

        public Builder setDataSetName(@Nullable String dataSetName) {
            this.dataSetName = Input.ofNullable(dataSetName);
            return this;
        }

        public Builder setKind(Input<Either<String,DataSetKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,DataSetKind> kind) {
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

        public Builder setShareName(Input<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Input.of(Objects.requireNonNull(shareName));
            return this;
        }
        public DataSetArgs build() {
            return new DataSetArgs(accountName, dataSetName, kind, resourceGroupName, shareName);
        }
    }
}
