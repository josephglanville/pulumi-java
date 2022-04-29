// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DatabaseMigration.outputs.GetMigrationsMigrationCollectionItemDataTransferMediumDetailDatabaseLinkDetail;
import com.pulumi.oci.DatabaseMigration.outputs.GetMigrationsMigrationCollectionItemDataTransferMediumDetailObjectStorageDetail;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMigrationsMigrationCollectionItemDataTransferMediumDetail {
    /**
     * @return Optional details for creating a network database link from Oracle Cloud Infrastructure database to on-premise database.
     * 
     */
    private final List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailDatabaseLinkDetail> databaseLinkDetails;
    /**
     * @return In lieu of a network database link, Oracle Cloud Infrastructure Object Storage bucket will be used to store Data Pump dump files for the migration. Additionally, it can be specified alongside a database link data transfer medium.
     * 
     */
    private final List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailObjectStorageDetail> objectStorageDetails;

    @CustomType.Constructor
    private GetMigrationsMigrationCollectionItemDataTransferMediumDetail(
        @CustomType.Parameter("databaseLinkDetails") List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailDatabaseLinkDetail> databaseLinkDetails,
        @CustomType.Parameter("objectStorageDetails") List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailObjectStorageDetail> objectStorageDetails) {
        this.databaseLinkDetails = databaseLinkDetails;
        this.objectStorageDetails = objectStorageDetails;
    }

    /**
     * @return Optional details for creating a network database link from Oracle Cloud Infrastructure database to on-premise database.
     * 
     */
    public List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailDatabaseLinkDetail> databaseLinkDetails() {
        return this.databaseLinkDetails;
    }
    /**
     * @return In lieu of a network database link, Oracle Cloud Infrastructure Object Storage bucket will be used to store Data Pump dump files for the migration. Additionally, it can be specified alongside a database link data transfer medium.
     * 
     */
    public List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailObjectStorageDetail> objectStorageDetails() {
        return this.objectStorageDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationsMigrationCollectionItemDataTransferMediumDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailDatabaseLinkDetail> databaseLinkDetails;
        private List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailObjectStorageDetail> objectStorageDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationsMigrationCollectionItemDataTransferMediumDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseLinkDetails = defaults.databaseLinkDetails;
    	      this.objectStorageDetails = defaults.objectStorageDetails;
        }

        public Builder databaseLinkDetails(List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailDatabaseLinkDetail> databaseLinkDetails) {
            this.databaseLinkDetails = Objects.requireNonNull(databaseLinkDetails);
            return this;
        }
        public Builder databaseLinkDetails(GetMigrationsMigrationCollectionItemDataTransferMediumDetailDatabaseLinkDetail... databaseLinkDetails) {
            return databaseLinkDetails(List.of(databaseLinkDetails));
        }
        public Builder objectStorageDetails(List<GetMigrationsMigrationCollectionItemDataTransferMediumDetailObjectStorageDetail> objectStorageDetails) {
            this.objectStorageDetails = Objects.requireNonNull(objectStorageDetails);
            return this;
        }
        public Builder objectStorageDetails(GetMigrationsMigrationCollectionItemDataTransferMediumDetailObjectStorageDetail... objectStorageDetails) {
            return objectStorageDetails(List.of(objectStorageDetails));
        }        public GetMigrationsMigrationCollectionItemDataTransferMediumDetail build() {
            return new GetMigrationsMigrationCollectionItemDataTransferMediumDetail(databaseLinkDetails, objectStorageDetails);
        }
    }
}
