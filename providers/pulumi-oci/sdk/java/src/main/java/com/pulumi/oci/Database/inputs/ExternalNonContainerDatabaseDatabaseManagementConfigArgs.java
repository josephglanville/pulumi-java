// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalNonContainerDatabaseDatabaseManagementConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalNonContainerDatabaseDatabaseManagementConfigArgs Empty = new ExternalNonContainerDatabaseDatabaseManagementConfigArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
     * 
     */
    @Import(name="databaseManagementConnectionId")
    private @Nullable Output<String> databaseManagementConnectionId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
     * 
     */
    public Optional<Output<String>> databaseManagementConnectionId() {
        return Optional.ofNullable(this.databaseManagementConnectionId);
    }

    /**
     * The status of the Database Management service.
     * 
     */
    @Import(name="databaseManagementStatus")
    private @Nullable Output<String> databaseManagementStatus;

    /**
     * @return The status of the Database Management service.
     * 
     */
    public Optional<Output<String>> databaseManagementStatus() {
        return Optional.ofNullable(this.databaseManagementStatus);
    }

    /**
     * The Oracle license model that applies to the external database.
     * 
     */
    @Import(name="licenseModel")
    private @Nullable Output<String> licenseModel;

    /**
     * @return The Oracle license model that applies to the external database.
     * 
     */
    public Optional<Output<String>> licenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }

    private ExternalNonContainerDatabaseDatabaseManagementConfigArgs() {}

    private ExternalNonContainerDatabaseDatabaseManagementConfigArgs(ExternalNonContainerDatabaseDatabaseManagementConfigArgs $) {
        this.databaseManagementConnectionId = $.databaseManagementConnectionId;
        this.databaseManagementStatus = $.databaseManagementStatus;
        this.licenseModel = $.licenseModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalNonContainerDatabaseDatabaseManagementConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalNonContainerDatabaseDatabaseManagementConfigArgs $;

        public Builder() {
            $ = new ExternalNonContainerDatabaseDatabaseManagementConfigArgs();
        }

        public Builder(ExternalNonContainerDatabaseDatabaseManagementConfigArgs defaults) {
            $ = new ExternalNonContainerDatabaseDatabaseManagementConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseManagementConnectionId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
         * 
         * @return builder
         * 
         */
        public Builder databaseManagementConnectionId(@Nullable Output<String> databaseManagementConnectionId) {
            $.databaseManagementConnectionId = databaseManagementConnectionId;
            return this;
        }

        /**
         * @param databaseManagementConnectionId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
         * 
         * @return builder
         * 
         */
        public Builder databaseManagementConnectionId(String databaseManagementConnectionId) {
            return databaseManagementConnectionId(Output.of(databaseManagementConnectionId));
        }

        /**
         * @param databaseManagementStatus The status of the Database Management service.
         * 
         * @return builder
         * 
         */
        public Builder databaseManagementStatus(@Nullable Output<String> databaseManagementStatus) {
            $.databaseManagementStatus = databaseManagementStatus;
            return this;
        }

        /**
         * @param databaseManagementStatus The status of the Database Management service.
         * 
         * @return builder
         * 
         */
        public Builder databaseManagementStatus(String databaseManagementStatus) {
            return databaseManagementStatus(Output.of(databaseManagementStatus));
        }

        /**
         * @param licenseModel The Oracle license model that applies to the external database.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(@Nullable Output<String> licenseModel) {
            $.licenseModel = licenseModel;
            return this;
        }

        /**
         * @param licenseModel The Oracle license model that applies to the external database.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(String licenseModel) {
            return licenseModel(Output.of(licenseModel));
        }

        public ExternalNonContainerDatabaseDatabaseManagementConfigArgs build() {
            return $;
        }
    }

}
