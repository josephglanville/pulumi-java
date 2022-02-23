// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatastoreCustomerManagedS3StorageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatastoreIotSiteWiseMultiLayerStorageArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatastoreIotSiteWiseMultiLayerStorageArgs Empty = new DatastoreIotSiteWiseMultiLayerStorageArgs();

    @InputImport(name="customerManagedS3Storage")
      private final @Nullable Input<DatastoreCustomerManagedS3StorageArgs> customerManagedS3Storage;

    public Input<DatastoreCustomerManagedS3StorageArgs> getCustomerManagedS3Storage() {
        return this.customerManagedS3Storage == null ? Input.empty() : this.customerManagedS3Storage;
    }

    public DatastoreIotSiteWiseMultiLayerStorageArgs(@Nullable Input<DatastoreCustomerManagedS3StorageArgs> customerManagedS3Storage) {
        this.customerManagedS3Storage = customerManagedS3Storage;
    }

    private DatastoreIotSiteWiseMultiLayerStorageArgs() {
        this.customerManagedS3Storage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreIotSiteWiseMultiLayerStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatastoreCustomerManagedS3StorageArgs> customerManagedS3Storage;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreIotSiteWiseMultiLayerStorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedS3Storage = defaults.customerManagedS3Storage;
        }

        public Builder setCustomerManagedS3Storage(@Nullable Input<DatastoreCustomerManagedS3StorageArgs> customerManagedS3Storage) {
            this.customerManagedS3Storage = customerManagedS3Storage;
            return this;
        }

        public Builder setCustomerManagedS3Storage(@Nullable DatastoreCustomerManagedS3StorageArgs customerManagedS3Storage) {
            this.customerManagedS3Storage = Input.ofNullable(customerManagedS3Storage);
            return this;
        }
        public DatastoreIotSiteWiseMultiLayerStorageArgs build() {
            return new DatastoreIotSiteWiseMultiLayerStorageArgs(customerManagedS3Storage);
        }
    }
}
