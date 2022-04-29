// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs Empty = new AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup destination.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup destination.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Proxy URL to connect to object store.
     * 
     */
    @Import(name="internetProxy")
    private @Nullable Output<String> internetProxy;

    /**
     * @return Proxy URL to connect to object store.
     * 
     */
    public Optional<Output<String>> internetProxy() {
        return Optional.ofNullable(this.internetProxy);
    }

    /**
     * Type of the database backup destination.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the database backup destination.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * For a RECOVERY_APPLIANCE backup destination, the password for the VPC user that is used to access the Recovery Appliance.
     * 
     */
    @Import(name="vpcPassword")
    private @Nullable Output<String> vpcPassword;

    /**
     * @return For a RECOVERY_APPLIANCE backup destination, the password for the VPC user that is used to access the Recovery Appliance.
     * 
     */
    public Optional<Output<String>> vpcPassword() {
        return Optional.ofNullable(this.vpcPassword);
    }

    /**
     * For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) user that is used to access the Recovery Appliance.
     * 
     */
    @Import(name="vpcUser")
    private @Nullable Output<String> vpcUser;

    /**
     * @return For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) user that is used to access the Recovery Appliance.
     * 
     */
    public Optional<Output<String>> vpcUser() {
        return Optional.ofNullable(this.vpcUser);
    }

    private AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs() {}

    private AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs(AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs $) {
        this.id = $.id;
        this.internetProxy = $.internetProxy;
        this.type = $.type;
        this.vpcPassword = $.vpcPassword;
        this.vpcUser = $.vpcUser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs $;

        public Builder() {
            $ = new AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs();
        }

        public Builder(AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs defaults) {
            $ = new AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup destination.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup destination.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param internetProxy Proxy URL to connect to object store.
         * 
         * @return builder
         * 
         */
        public Builder internetProxy(@Nullable Output<String> internetProxy) {
            $.internetProxy = internetProxy;
            return this;
        }

        /**
         * @param internetProxy Proxy URL to connect to object store.
         * 
         * @return builder
         * 
         */
        public Builder internetProxy(String internetProxy) {
            return internetProxy(Output.of(internetProxy));
        }

        /**
         * @param type Type of the database backup destination.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the database backup destination.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vpcPassword For a RECOVERY_APPLIANCE backup destination, the password for the VPC user that is used to access the Recovery Appliance.
         * 
         * @return builder
         * 
         */
        public Builder vpcPassword(@Nullable Output<String> vpcPassword) {
            $.vpcPassword = vpcPassword;
            return this;
        }

        /**
         * @param vpcPassword For a RECOVERY_APPLIANCE backup destination, the password for the VPC user that is used to access the Recovery Appliance.
         * 
         * @return builder
         * 
         */
        public Builder vpcPassword(String vpcPassword) {
            return vpcPassword(Output.of(vpcPassword));
        }

        /**
         * @param vpcUser For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) user that is used to access the Recovery Appliance.
         * 
         * @return builder
         * 
         */
        public Builder vpcUser(@Nullable Output<String> vpcUser) {
            $.vpcUser = vpcUser;
            return this;
        }

        /**
         * @param vpcUser For a RECOVERY_APPLIANCE backup destination, the Virtual Private Catalog (VPC) user that is used to access the Recovery Appliance.
         * 
         * @return builder
         * 
         */
        public Builder vpcUser(String vpcUser) {
            return vpcUser(Output.of(vpcUser));
        }

        public AutonomousContainerDatabasePeerAutonomousContainerDatabaseBackupConfigBackupDestinationDetailArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
