// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetDbVersionsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbVersionsArgs Empty = new GetDbVersionsArgs();

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
     * 
     */
    @Import(name="dbSystemId")
    private @Nullable String dbSystemId;

    /**
     * @return The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
     * 
     */
    public Optional<String> dbSystemId() {
        return Optional.ofNullable(this.dbSystemId);
    }

    /**
     * If provided, filters the results to the set of database versions which are supported for the given shape.
     * 
     */
    @Import(name="dbSystemShape")
    private @Nullable String dbSystemShape;

    /**
     * @return If provided, filters the results to the set of database versions which are supported for the given shape.
     * 
     */
    public Optional<String> dbSystemShape() {
        return Optional.ofNullable(this.dbSystemShape);
    }

    @Import(name="filters")
    private @Nullable List<GetDbVersionsFilter> filters;

    public Optional<List<GetDbVersionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * If true, filters the results to the set of Oracle Database versions that are supported for Oracle Cloud Infrastructure database software images.
     * 
     */
    @Import(name="isDatabaseSoftwareImageSupported")
    private @Nullable Boolean isDatabaseSoftwareImageSupported;

    /**
     * @return If true, filters the results to the set of Oracle Database versions that are supported for Oracle Cloud Infrastructure database software images.
     * 
     */
    public Optional<Boolean> isDatabaseSoftwareImageSupported() {
        return Optional.ofNullable(this.isDatabaseSoftwareImageSupported);
    }

    /**
     * If provided, filters the results to the set of database versions which are supported for Upgrade.
     * 
     */
    @Import(name="isUpgradeSupported")
    private @Nullable Boolean isUpgradeSupported;

    /**
     * @return If provided, filters the results to the set of database versions which are supported for Upgrade.
     * 
     */
    public Optional<Boolean> isUpgradeSupported() {
        return Optional.ofNullable(this.isUpgradeSupported);
    }

    /**
     * The DB system storage management option. Used to list database versions available for that storage manager. Valid values are:
     * * ASM - Automatic storage management
     * * LVM - Logical volume management
     * 
     */
    @Import(name="storageManagement")
    private @Nullable String storageManagement;

    /**
     * @return The DB system storage management option. Used to list database versions available for that storage manager. Valid values are:
     * * ASM - Automatic storage management
     * * LVM - Logical volume management
     * 
     */
    public Optional<String> storageManagement() {
        return Optional.ofNullable(this.storageManagement);
    }

    private GetDbVersionsArgs() {}

    private GetDbVersionsArgs(GetDbVersionsArgs $) {
        this.compartmentId = $.compartmentId;
        this.dbSystemId = $.dbSystemId;
        this.dbSystemShape = $.dbSystemShape;
        this.filters = $.filters;
        this.isDatabaseSoftwareImageSupported = $.isDatabaseSoftwareImageSupported;
        this.isUpgradeSupported = $.isUpgradeSupported;
        this.storageManagement = $.storageManagement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbVersionsArgs $;

        public Builder() {
            $ = new GetDbVersionsArgs();
        }

        public Builder(GetDbVersionsArgs defaults) {
            $ = new GetDbVersionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param dbSystemId The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(@Nullable String dbSystemId) {
            $.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * @param dbSystemShape If provided, filters the results to the set of database versions which are supported for the given shape.
         * 
         * @return builder
         * 
         */
        public Builder dbSystemShape(@Nullable String dbSystemShape) {
            $.dbSystemShape = dbSystemShape;
            return this;
        }

        public Builder filters(@Nullable List<GetDbVersionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDbVersionsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isDatabaseSoftwareImageSupported If true, filters the results to the set of Oracle Database versions that are supported for Oracle Cloud Infrastructure database software images.
         * 
         * @return builder
         * 
         */
        public Builder isDatabaseSoftwareImageSupported(@Nullable Boolean isDatabaseSoftwareImageSupported) {
            $.isDatabaseSoftwareImageSupported = isDatabaseSoftwareImageSupported;
            return this;
        }

        /**
         * @param isUpgradeSupported If provided, filters the results to the set of database versions which are supported for Upgrade.
         * 
         * @return builder
         * 
         */
        public Builder isUpgradeSupported(@Nullable Boolean isUpgradeSupported) {
            $.isUpgradeSupported = isUpgradeSupported;
            return this;
        }

        /**
         * @param storageManagement The DB system storage management option. Used to list database versions available for that storage manager. Valid values are:
         * * ASM - Automatic storage management
         * * LVM - Logical volume management
         * 
         * @return builder
         * 
         */
        public Builder storageManagement(@Nullable String storageManagement) {
            $.storageManagement = storageManagement;
            return this;
        }

        public GetDbVersionsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
