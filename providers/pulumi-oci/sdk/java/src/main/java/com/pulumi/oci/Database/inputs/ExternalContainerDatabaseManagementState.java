// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalContainerDatabaseManagementState extends com.pulumi.resources.ResourceArgs {

    public static final ExternalContainerDatabaseManagementState Empty = new ExternalContainerDatabaseManagementState();

    @Import(name="enableManagement")
    private @Nullable Output<Boolean> enableManagement;

    public Optional<Output<Boolean>> enableManagement() {
        return Optional.ofNullable(this.enableManagement);
    }

    /**
     * The ExternalContainerDatabase [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="externalContainerDatabaseId")
    private @Nullable Output<String> externalContainerDatabaseId;

    /**
     * @return The ExternalContainerDatabase [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<Output<String>> externalContainerDatabaseId() {
        return Optional.ofNullable(this.externalContainerDatabaseId);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
     * 
     */
    @Import(name="externalDatabaseConnectorId")
    private @Nullable Output<String> externalDatabaseConnectorId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
     * 
     */
    public Optional<Output<String>> externalDatabaseConnectorId() {
        return Optional.ofNullable(this.externalDatabaseConnectorId);
    }

    /**
     * The Oracle license model that applies to the external database. Required only for enabling database management.
     * 
     */
    @Import(name="licenseModel")
    private @Nullable Output<String> licenseModel;

    /**
     * @return The Oracle license model that applies to the external database. Required only for enabling database management.
     * 
     */
    public Optional<Output<String>> licenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }

    private ExternalContainerDatabaseManagementState() {}

    private ExternalContainerDatabaseManagementState(ExternalContainerDatabaseManagementState $) {
        this.enableManagement = $.enableManagement;
        this.externalContainerDatabaseId = $.externalContainerDatabaseId;
        this.externalDatabaseConnectorId = $.externalDatabaseConnectorId;
        this.licenseModel = $.licenseModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalContainerDatabaseManagementState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalContainerDatabaseManagementState $;

        public Builder() {
            $ = new ExternalContainerDatabaseManagementState();
        }

        public Builder(ExternalContainerDatabaseManagementState defaults) {
            $ = new ExternalContainerDatabaseManagementState(Objects.requireNonNull(defaults));
        }

        public Builder enableManagement(@Nullable Output<Boolean> enableManagement) {
            $.enableManagement = enableManagement;
            return this;
        }

        public Builder enableManagement(Boolean enableManagement) {
            return enableManagement(Output.of(enableManagement));
        }

        /**
         * @param externalContainerDatabaseId The ExternalContainerDatabase [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder externalContainerDatabaseId(@Nullable Output<String> externalContainerDatabaseId) {
            $.externalContainerDatabaseId = externalContainerDatabaseId;
            return this;
        }

        /**
         * @param externalContainerDatabaseId The ExternalContainerDatabase [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder externalContainerDatabaseId(String externalContainerDatabaseId) {
            return externalContainerDatabaseId(Output.of(externalContainerDatabaseId));
        }

        /**
         * @param externalDatabaseConnectorId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
         * 
         * @return builder
         * 
         */
        public Builder externalDatabaseConnectorId(@Nullable Output<String> externalDatabaseConnectorId) {
            $.externalDatabaseConnectorId = externalDatabaseConnectorId;
            return this;
        }

        /**
         * @param externalDatabaseConnectorId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
         * 
         * @return builder
         * 
         */
        public Builder externalDatabaseConnectorId(String externalDatabaseConnectorId) {
            return externalDatabaseConnectorId(Output.of(externalDatabaseConnectorId));
        }

        /**
         * @param licenseModel The Oracle license model that applies to the external database. Required only for enabling database management.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(@Nullable Output<String> licenseModel) {
            $.licenseModel = licenseModel;
            return this;
        }

        /**
         * @param licenseModel The Oracle license model that applies to the external database. Required only for enabling database management.
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(String licenseModel) {
            return licenseModel(Output.of(licenseModel));
        }

        public ExternalContainerDatabaseManagementState build() {
            return $;
        }
    }

}
