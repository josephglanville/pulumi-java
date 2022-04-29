// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupState extends com.pulumi.resources.ResourceArgs {

    public static final BackupState Empty = new BackupState();

    /**
     * The name of the availability domain where the database backup is stored.
     * 
     */
    @Import(name="availabilityDomain")
    private @Nullable Output<String> availabilityDomain;

    /**
     * @return The name of the availability domain where the database backup is stored.
     * 
     */
    public Optional<Output<String>> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The Oracle Database edition of the DB system from which the database backup was taken.
     * 
     */
    @Import(name="databaseEdition")
    private @Nullable Output<String> databaseEdition;

    /**
     * @return The Oracle Database edition of the DB system from which the database backup was taken.
     * 
     */
    public Optional<Output<String>> databaseEdition() {
        return Optional.ofNullable(this.databaseEdition);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     * 
     */
    @Import(name="databaseId")
    private @Nullable Output<String> databaseId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     * 
     */
    public Optional<Output<String>> databaseId() {
        return Optional.ofNullable(this.databaseId);
    }

    /**
     * The size of the database in gigabytes at the time the backup was taken.
     * 
     */
    @Import(name="databaseSizeInGbs")
    private @Nullable Output<Double> databaseSizeInGbs;

    /**
     * @return The size of the database in gigabytes at the time the backup was taken.
     * 
     */
    public Optional<Output<Double>> databaseSizeInGbs() {
        return Optional.ofNullable(this.databaseSizeInGbs);
    }

    /**
     * The user-friendly name for the backup. The name does not have to be unique.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The user-friendly name for the backup. The name does not have to be unique.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
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
     * Shape of the backup&#39;s source database.
     * 
     */
    @Import(name="shape")
    private @Nullable Output<String> shape;

    /**
     * @return Shape of the backup&#39;s source database.
     * 
     */
    public Optional<Output<String>> shape() {
        return Optional.ofNullable(this.shape);
    }

    /**
     * The current state of the backup.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the backup.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The date and time the backup was completed.
     * 
     */
    @Import(name="timeEnded")
    private @Nullable Output<String> timeEnded;

    /**
     * @return The date and time the backup was completed.
     * 
     */
    public Optional<Output<String>> timeEnded() {
        return Optional.ofNullable(this.timeEnded);
    }

    /**
     * The date and time the backup started.
     * 
     */
    @Import(name="timeStarted")
    private @Nullable Output<String> timeStarted;

    /**
     * @return The date and time the backup started.
     * 
     */
    public Optional<Output<String>> timeStarted() {
        return Optional.ofNullable(this.timeStarted);
    }

    /**
     * The type of backup.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of backup.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
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
     * Version of the backup&#39;s source database
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of the backup&#39;s source database
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private BackupState() {}

    private BackupState(BackupState $) {
        this.availabilityDomain = $.availabilityDomain;
        this.compartmentId = $.compartmentId;
        this.databaseEdition = $.databaseEdition;
        this.databaseId = $.databaseId;
        this.databaseSizeInGbs = $.databaseSizeInGbs;
        this.displayName = $.displayName;
        this.kmsKeyId = $.kmsKeyId;
        this.kmsKeyVersionId = $.kmsKeyVersionId;
        this.lifecycleDetails = $.lifecycleDetails;
        this.shape = $.shape;
        this.state = $.state;
        this.timeEnded = $.timeEnded;
        this.timeStarted = $.timeStarted;
        this.type = $.type;
        this.vaultId = $.vaultId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupState $;

        public Builder() {
            $ = new BackupState();
        }

        public Builder(BackupState defaults) {
            $ = new BackupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomain The name of the availability domain where the database backup is stored.
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(@Nullable Output<String> availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param availabilityDomain The name of the availability domain where the database backup is stored.
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(String availabilityDomain) {
            return availabilityDomain(Output.of(availabilityDomain));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param databaseEdition The Oracle Database edition of the DB system from which the database backup was taken.
         * 
         * @return builder
         * 
         */
        public Builder databaseEdition(@Nullable Output<String> databaseEdition) {
            $.databaseEdition = databaseEdition;
            return this;
        }

        /**
         * @param databaseEdition The Oracle Database edition of the DB system from which the database backup was taken.
         * 
         * @return builder
         * 
         */
        public Builder databaseEdition(String databaseEdition) {
            return databaseEdition(Output.of(databaseEdition));
        }

        /**
         * @param databaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(@Nullable Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param databaseSizeInGbs The size of the database in gigabytes at the time the backup was taken.
         * 
         * @return builder
         * 
         */
        public Builder databaseSizeInGbs(@Nullable Output<Double> databaseSizeInGbs) {
            $.databaseSizeInGbs = databaseSizeInGbs;
            return this;
        }

        /**
         * @param databaseSizeInGbs The size of the database in gigabytes at the time the backup was taken.
         * 
         * @return builder
         * 
         */
        public Builder databaseSizeInGbs(Double databaseSizeInGbs) {
            return databaseSizeInGbs(Output.of(databaseSizeInGbs));
        }

        /**
         * @param displayName The user-friendly name for the backup. The name does not have to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The user-friendly name for the backup. The name does not have to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
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
         * @param shape Shape of the backup&#39;s source database.
         * 
         * @return builder
         * 
         */
        public Builder shape(@Nullable Output<String> shape) {
            $.shape = shape;
            return this;
        }

        /**
         * @param shape Shape of the backup&#39;s source database.
         * 
         * @return builder
         * 
         */
        public Builder shape(String shape) {
            return shape(Output.of(shape));
        }

        /**
         * @param state The current state of the backup.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the backup.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeEnded The date and time the backup was completed.
         * 
         * @return builder
         * 
         */
        public Builder timeEnded(@Nullable Output<String> timeEnded) {
            $.timeEnded = timeEnded;
            return this;
        }

        /**
         * @param timeEnded The date and time the backup was completed.
         * 
         * @return builder
         * 
         */
        public Builder timeEnded(String timeEnded) {
            return timeEnded(Output.of(timeEnded));
        }

        /**
         * @param timeStarted The date and time the backup started.
         * 
         * @return builder
         * 
         */
        public Builder timeStarted(@Nullable Output<String> timeStarted) {
            $.timeStarted = timeStarted;
            return this;
        }

        /**
         * @param timeStarted The date and time the backup started.
         * 
         * @return builder
         * 
         */
        public Builder timeStarted(String timeStarted) {
            return timeStarted(Output.of(timeStarted));
        }

        /**
         * @param type The type of backup.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of backup.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
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
         * @param version Version of the backup&#39;s source database
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the backup&#39;s source database
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public BackupState build() {
            return $;
        }
    }

}
