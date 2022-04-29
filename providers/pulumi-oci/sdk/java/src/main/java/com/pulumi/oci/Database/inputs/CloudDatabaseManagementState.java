// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.CloudDatabaseManagementCredentialdetailsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudDatabaseManagementState extends com.pulumi.resources.ResourceArgs {

    public static final CloudDatabaseManagementState Empty = new CloudDatabaseManagementState();

    @Import(name="credentialdetails")
    private @Nullable Output<CloudDatabaseManagementCredentialdetailsArgs> credentialdetails;

    public Optional<Output<CloudDatabaseManagementCredentialdetailsArgs>> credentialdetails() {
        return Optional.ofNullable(this.credentialdetails);
    }

    /**
     * The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="databaseId")
    private @Nullable Output<String> databaseId;

    /**
     * @return The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<Output<String>> databaseId() {
        return Optional.ofNullable(this.databaseId);
    }

    /**
     * (Updatable) Use this flag to enable/disable database management
     * 
     */
    @Import(name="enableManagement")
    private @Nullable Output<Boolean> enableManagement;

    /**
     * @return (Updatable) Use this flag to enable/disable database management
     * 
     */
    public Optional<Output<Boolean>> enableManagement() {
        return Optional.ofNullable(this.enableManagement);
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     * 
     */
    @Import(name="kmsKeyVersionId")
    private @Nullable Output<String> kmsKeyVersionId;

    /**
     * @return The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     * 
     */
    public Optional<Output<String>> kmsKeyVersionId() {
        return Optional.ofNullable(this.kmsKeyVersionId);
    }

    /**
     * The date and time when the latest database backup was created.
     * 
     */
    @Import(name="lastBackupTimestamp")
    private @Nullable Output<String> lastBackupTimestamp;

    /**
     * @return The date and time when the latest database backup was created.
     * 
     */
    public Optional<Output<String>> lastBackupTimestamp() {
        return Optional.ofNullable(this.lastBackupTimestamp);
    }

    /**
     * Additional information about the current lifecycle state.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * (Updatable) Specifies database management type
     * enum:
     * - `BASIC`
     * - `ADVANCED`
     * 
     */
    @Import(name="managementType")
    private @Nullable Output<String> managementType;

    /**
     * @return (Updatable) Specifies database management type
     * enum:
     * - `BASIC`
     * - `ADVANCED`
     * 
     */
    public Optional<Output<String>> managementType() {
        return Optional.ofNullable(this.managementType);
    }

    /**
     * The national character set for the database.
     * 
     */
    @Import(name="ncharacterSet")
    private @Nullable Output<String> ncharacterSet;

    /**
     * @return The national character set for the database.
     * 
     */
    public Optional<Output<String>> ncharacterSet() {
        return Optional.ofNullable(this.ncharacterSet);
    }

    /**
     * The name of the pluggable database. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. Pluggable database should not be same as database name.
     * 
     */
    @Import(name="pdbName")
    private @Nullable Output<String> pdbName;

    /**
     * @return The name of the pluggable database. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. Pluggable database should not be same as database name.
     * 
     */
    public Optional<Output<String>> pdbName() {
        return Optional.ofNullable(this.pdbName);
    }

    /**
     * (Updatable) The private end point [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="privateEndPointId")
    private @Nullable Output<String> privateEndPointId;

    /**
     * @return (Updatable) The private end point [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<Output<String>> privateEndPointId() {
        return Optional.ofNullable(this.privateEndPointId);
    }

    /**
     * (Updatable) Database service name
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return (Updatable) Database service name
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Specifies a prefix for the `Oracle SID` of the database to be created.
     * 
     */
    @Import(name="sidPrefix")
    private @Nullable Output<String> sidPrefix;

    /**
     * @return Specifies a prefix for the `Oracle SID` of the database to be created.
     * 
     */
    public Optional<Output<String>> sidPrefix() {
        return Optional.ofNullable(this.sidPrefix);
    }

    /**
     * Point in time recovery timeStamp of the source database at which cloned database system is cloned from the source database system, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * 
     */
    @Import(name="sourceDatabasePointInTimeRecoveryTimestamp")
    private @Nullable Output<String> sourceDatabasePointInTimeRecoveryTimestamp;

    /**
     * @return Point in time recovery timeStamp of the source database at which cloned database system is cloned from the source database system, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * 
     */
    public Optional<Output<String>> sourceDatabasePointInTimeRecoveryTimestamp() {
        return Optional.ofNullable(this.sourceDatabasePointInTimeRecoveryTimestamp);
    }

    /**
     * The current state of the database.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the database.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The date and time the database was created.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the database was created.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * 
     */
    @Import(name="vaultId")
    private @Nullable Output<String> vaultId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * 
     */
    public Optional<Output<String>> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * 
     */
    @Import(name="vmClusterId")
    private @Nullable Output<String> vmClusterId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * 
     */
    public Optional<Output<String>> vmClusterId() {
        return Optional.ofNullable(this.vmClusterId);
    }

    private CloudDatabaseManagementState() {}

    private CloudDatabaseManagementState(CloudDatabaseManagementState $) {
        this.credentialdetails = $.credentialdetails;
        this.databaseId = $.databaseId;
        this.enableManagement = $.enableManagement;
        this.kmsKeyId = $.kmsKeyId;
        this.kmsKeyVersionId = $.kmsKeyVersionId;
        this.lastBackupTimestamp = $.lastBackupTimestamp;
        this.lifecycleDetails = $.lifecycleDetails;
        this.managementType = $.managementType;
        this.ncharacterSet = $.ncharacterSet;
        this.pdbName = $.pdbName;
        this.privateEndPointId = $.privateEndPointId;
        this.serviceName = $.serviceName;
        this.sidPrefix = $.sidPrefix;
        this.sourceDatabasePointInTimeRecoveryTimestamp = $.sourceDatabasePointInTimeRecoveryTimestamp;
        this.state = $.state;
        this.timeCreated = $.timeCreated;
        this.vaultId = $.vaultId;
        this.vmClusterId = $.vmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudDatabaseManagementState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudDatabaseManagementState $;

        public Builder() {
            $ = new CloudDatabaseManagementState();
        }

        public Builder(CloudDatabaseManagementState defaults) {
            $ = new CloudDatabaseManagementState(Objects.requireNonNull(defaults));
        }

        public Builder credentialdetails(@Nullable Output<CloudDatabaseManagementCredentialdetailsArgs> credentialdetails) {
            $.credentialdetails = credentialdetails;
            return this;
        }

        public Builder credentialdetails(CloudDatabaseManagementCredentialdetailsArgs credentialdetails) {
            return credentialdetails(Output.of(credentialdetails));
        }

        /**
         * @param databaseId The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder databaseId(@Nullable Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId The database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param enableManagement (Updatable) Use this flag to enable/disable database management
         * 
         * @return builder
         * 
         */
        public Builder enableManagement(@Nullable Output<Boolean> enableManagement) {
            $.enableManagement = enableManagement;
            return this;
        }

        /**
         * @param enableManagement (Updatable) Use this flag to enable/disable database management
         * 
         * @return builder
         * 
         */
        public Builder enableManagement(Boolean enableManagement) {
            return enableManagement(Output.of(enableManagement));
        }

        /**
         * @param kmsKeyId The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param kmsKeyVersionId The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyVersionId(@Nullable Output<String> kmsKeyVersionId) {
            $.kmsKeyVersionId = kmsKeyVersionId;
            return this;
        }

        /**
         * @param kmsKeyVersionId The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            return kmsKeyVersionId(Output.of(kmsKeyVersionId));
        }

        /**
         * @param lastBackupTimestamp The date and time when the latest database backup was created.
         * 
         * @return builder
         * 
         */
        public Builder lastBackupTimestamp(@Nullable Output<String> lastBackupTimestamp) {
            $.lastBackupTimestamp = lastBackupTimestamp;
            return this;
        }

        /**
         * @param lastBackupTimestamp The date and time when the latest database backup was created.
         * 
         * @return builder
         * 
         */
        public Builder lastBackupTimestamp(String lastBackupTimestamp) {
            return lastBackupTimestamp(Output.of(lastBackupTimestamp));
        }

        /**
         * @param lifecycleDetails Additional information about the current lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails Additional information about the current lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param managementType (Updatable) Specifies database management type
         * enum:
         * - `BASIC`
         * - `ADVANCED`
         * 
         * @return builder
         * 
         */
        public Builder managementType(@Nullable Output<String> managementType) {
            $.managementType = managementType;
            return this;
        }

        /**
         * @param managementType (Updatable) Specifies database management type
         * enum:
         * - `BASIC`
         * - `ADVANCED`
         * 
         * @return builder
         * 
         */
        public Builder managementType(String managementType) {
            return managementType(Output.of(managementType));
        }

        /**
         * @param ncharacterSet The national character set for the database.
         * 
         * @return builder
         * 
         */
        public Builder ncharacterSet(@Nullable Output<String> ncharacterSet) {
            $.ncharacterSet = ncharacterSet;
            return this;
        }

        /**
         * @param ncharacterSet The national character set for the database.
         * 
         * @return builder
         * 
         */
        public Builder ncharacterSet(String ncharacterSet) {
            return ncharacterSet(Output.of(ncharacterSet));
        }

        /**
         * @param pdbName The name of the pluggable database. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. Pluggable database should not be same as database name.
         * 
         * @return builder
         * 
         */
        public Builder pdbName(@Nullable Output<String> pdbName) {
            $.pdbName = pdbName;
            return this;
        }

        /**
         * @param pdbName The name of the pluggable database. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. Pluggable database should not be same as database name.
         * 
         * @return builder
         * 
         */
        public Builder pdbName(String pdbName) {
            return pdbName(Output.of(pdbName));
        }

        /**
         * @param privateEndPointId (Updatable) The private end point [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder privateEndPointId(@Nullable Output<String> privateEndPointId) {
            $.privateEndPointId = privateEndPointId;
            return this;
        }

        /**
         * @param privateEndPointId (Updatable) The private end point [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder privateEndPointId(String privateEndPointId) {
            return privateEndPointId(Output.of(privateEndPointId));
        }

        /**
         * @param serviceName (Updatable) Database service name
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName (Updatable) Database service name
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param sidPrefix Specifies a prefix for the `Oracle SID` of the database to be created.
         * 
         * @return builder
         * 
         */
        public Builder sidPrefix(@Nullable Output<String> sidPrefix) {
            $.sidPrefix = sidPrefix;
            return this;
        }

        /**
         * @param sidPrefix Specifies a prefix for the `Oracle SID` of the database to be created.
         * 
         * @return builder
         * 
         */
        public Builder sidPrefix(String sidPrefix) {
            return sidPrefix(Output.of(sidPrefix));
        }

        /**
         * @param sourceDatabasePointInTimeRecoveryTimestamp Point in time recovery timeStamp of the source database at which cloned database system is cloned from the source database system, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
         * 
         * @return builder
         * 
         */
        public Builder sourceDatabasePointInTimeRecoveryTimestamp(@Nullable Output<String> sourceDatabasePointInTimeRecoveryTimestamp) {
            $.sourceDatabasePointInTimeRecoveryTimestamp = sourceDatabasePointInTimeRecoveryTimestamp;
            return this;
        }

        /**
         * @param sourceDatabasePointInTimeRecoveryTimestamp Point in time recovery timeStamp of the source database at which cloned database system is cloned from the source database system, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
         * 
         * @return builder
         * 
         */
        public Builder sourceDatabasePointInTimeRecoveryTimestamp(String sourceDatabasePointInTimeRecoveryTimestamp) {
            return sourceDatabasePointInTimeRecoveryTimestamp(Output.of(sourceDatabasePointInTimeRecoveryTimestamp));
        }

        /**
         * @param state The current state of the database.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the database.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeCreated The date and time the database was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the database was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param vaultId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * 
         * @return builder
         * 
         */
        public Builder vaultId(@Nullable Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        /**
         * @param vmClusterId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(@Nullable Output<String> vmClusterId) {
            $.vmClusterId = vmClusterId;
            return this;
        }

        /**
         * @param vmClusterId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(String vmClusterId) {
            return vmClusterId(Output.of(vmClusterId));
        }

        public CloudDatabaseManagementState build() {
            return $;
        }
    }

}
