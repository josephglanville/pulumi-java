// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Mysql.inputs.MysqlBackupDbSystemSnapshotBackupPolicyArgs;
import com.pulumi.oci.Mysql.inputs.MysqlBackupDbSystemSnapshotDeletionPolicyArgs;
import com.pulumi.oci.Mysql.inputs.MysqlBackupDbSystemSnapshotEndpointArgs;
import com.pulumi.oci.Mysql.inputs.MysqlBackupDbSystemSnapshotMaintenanceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MysqlBackupDbSystemSnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlBackupDbSystemSnapshotArgs Empty = new MysqlBackupDbSystemSnapshotArgs();

    /**
     * The username for the administrative user.
     * 
     */
    @Import(name="adminUsername")
    private @Nullable Output<String> adminUsername;

    /**
     * @return The username for the administrative user.
     * 
     */
    public Optional<Output<String>> adminUsername() {
        return Optional.ofNullable(this.adminUsername);
    }

    /**
     * The Availability Domain where the primary DB System should be located.
     * 
     */
    @Import(name="availabilityDomain")
    private @Nullable Output<String> availabilityDomain;

    /**
     * @return The Availability Domain where the primary DB System should be located.
     * 
     */
    public Optional<Output<String>> availabilityDomain() {
        return Optional.ofNullable(this.availabilityDomain);
    }

    /**
     * The Backup policy for the DB System.
     * 
     */
    @Import(name="backupPolicies")
    private @Nullable Output<List<MysqlBackupDbSystemSnapshotBackupPolicyArgs>> backupPolicies;

    /**
     * @return The Backup policy for the DB System.
     * 
     */
    public Optional<Output<List<MysqlBackupDbSystemSnapshotBackupPolicyArgs>>> backupPolicies() {
        return Optional.ofNullable(this.backupPolicies);
    }

    /**
     * (Updatable) The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The OCID of the Configuration to be used for Instances in this DB System.
     * 
     */
    @Import(name="configurationId")
    private @Nullable Output<String> configurationId;

    /**
     * @return The OCID of the Configuration to be used for Instances in this DB System.
     * 
     */
    public Optional<Output<String>> configurationId() {
        return Optional.ofNullable(this.configurationId);
    }

    /**
     * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or disabled, and whether to enable or disable syncing of the Binary Logs.
     * 
     */
    @Import(name="crashRecovery")
    private @Nullable Output<String> crashRecovery;

    /**
     * @return Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or disabled, and whether to enable or disable syncing of the Binary Logs.
     * 
     */
    public Optional<Output<String>> crashRecovery() {
        return Optional.ofNullable(this.crashRecovery);
    }

    /**
     * Initial size of the data volume in GiBs that will be created and attached.
     * 
     */
    @Import(name="dataStorageSizeInGb")
    private @Nullable Output<Integer> dataStorageSizeInGb;

    /**
     * @return Initial size of the data volume in GiBs that will be created and attached.
     * 
     */
    public Optional<Output<Integer>> dataStorageSizeInGb() {
        return Optional.ofNullable(this.dataStorageSizeInGb);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * The Deletion policy for the DB System.
     * 
     */
    @Import(name="deletionPolicies")
    private @Nullable Output<List<MysqlBackupDbSystemSnapshotDeletionPolicyArgs>> deletionPolicies;

    /**
     * @return The Deletion policy for the DB System.
     * 
     */
    public Optional<Output<List<MysqlBackupDbSystemSnapshotDeletionPolicyArgs>>> deletionPolicies() {
        return Optional.ofNullable(this.deletionPolicies);
    }

    /**
     * (Updatable) A user-supplied description for the backup.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) A user-supplied description for the backup.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) A user-supplied display name for the backup.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-supplied display name for the backup.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The network endpoints available for this DB System.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<MysqlBackupDbSystemSnapshotEndpointArgs>> endpoints;

    /**
     * @return The network endpoints available for this DB System.
     * 
     */
    public Optional<Output<List<MysqlBackupDbSystemSnapshotEndpointArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * The name of the Fault Domain the DB System is located in.
     * 
     */
    @Import(name="faultDomain")
    private @Nullable Output<String> faultDomain;

    /**
     * @return The name of the Fault Domain the DB System is located in.
     * 
     */
    public Optional<Output<String>> faultDomain() {
        return Optional.ofNullable(this.faultDomain);
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The hostname for the primary endpoint of the DB System. Used for DNS. The value is the hostname portion of the primary private IP&#39;s fully qualified domain name (FQDN) (for example, &#34;dbsystem-1&#34; in FQDN &#34;dbsystem-1.subnet123.vcn1.oraclevcn.com&#34;). Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
     * 
     */
    @Import(name="hostnameLabel")
    private @Nullable Output<String> hostnameLabel;

    /**
     * @return The hostname for the primary endpoint of the DB System. Used for DNS. The value is the hostname portion of the primary private IP&#39;s fully qualified domain name (FQDN) (for example, &#34;dbsystem-1&#34; in FQDN &#34;dbsystem-1.subnet123.vcn1.oraclevcn.com&#34;). Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
     * 
     */
    public Optional<Output<String>> hostnameLabel() {
        return Optional.ofNullable(this.hostnameLabel);
    }

    /**
     * OCID of the backup itself
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return OCID of the backup itself
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The IP address the DB System is configured to listen on. A private IP address of the primary endpoint of the DB System. Must be an available IP address within the subnet&#39;s CIDR. This will be a &#34;dotted-quad&#34; style IPv4 address.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP address the DB System is configured to listen on. A private IP address of the primary endpoint of the DB System. Must be an available IP address within the subnet&#39;s CIDR. This will be a &#34;dotted-quad&#34; style IPv4 address.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * If the policy is to enable high availability of the instance, by maintaining secondary/failover capacity as necessary.
     * 
     */
    @Import(name="isHighlyAvailable")
    private @Nullable Output<Boolean> isHighlyAvailable;

    /**
     * @return If the policy is to enable high availability of the instance, by maintaining secondary/failover capacity as necessary.
     * 
     */
    public Optional<Output<Boolean>> isHighlyAvailable() {
        return Optional.ofNullable(this.isHighlyAvailable);
    }

    /**
     * The Maintenance Policy for the DB System.
     * 
     */
    @Import(name="maintenances")
    private @Nullable Output<List<MysqlBackupDbSystemSnapshotMaintenanceArgs>> maintenances;

    /**
     * @return The Maintenance Policy for the DB System.
     * 
     */
    public Optional<Output<List<MysqlBackupDbSystemSnapshotMaintenanceArgs>>> maintenances() {
        return Optional.ofNullable(this.maintenances);
    }

    /**
     * The MySQL server version of the DB System used for backup.
     * 
     */
    @Import(name="mysqlVersion")
    private @Nullable Output<String> mysqlVersion;

    /**
     * @return The MySQL server version of the DB System used for backup.
     * 
     */
    public Optional<Output<String>> mysqlVersion() {
        return Optional.ofNullable(this.mysqlVersion);
    }

    /**
     * The port for primary endpoint of the DB System to listen on.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port for primary endpoint of the DB System to listen on.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin equivalent of port.
     * 
     */
    @Import(name="portX")
    private @Nullable Output<Integer> portX;

    /**
     * @return The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin equivalent of port.
     * 
     */
    public Optional<Output<Integer>> portX() {
        return Optional.ofNullable(this.portX);
    }

    /**
     * The shape of the DB System instance used for backup.
     * 
     */
    @Import(name="shapeName")
    private @Nullable Output<String> shapeName;

    /**
     * @return The shape of the DB System instance used for backup.
     * 
     */
    public Optional<Output<String>> shapeName() {
        return Optional.ofNullable(this.shapeName);
    }

    /**
     * The OCID of the subnet the DB System is associated with.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The OCID of the subnet the DB System is associated with.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private MysqlBackupDbSystemSnapshotArgs() {}

    private MysqlBackupDbSystemSnapshotArgs(MysqlBackupDbSystemSnapshotArgs $) {
        this.adminUsername = $.adminUsername;
        this.availabilityDomain = $.availabilityDomain;
        this.backupPolicies = $.backupPolicies;
        this.compartmentId = $.compartmentId;
        this.configurationId = $.configurationId;
        this.crashRecovery = $.crashRecovery;
        this.dataStorageSizeInGb = $.dataStorageSizeInGb;
        this.definedTags = $.definedTags;
        this.deletionPolicies = $.deletionPolicies;
        this.description = $.description;
        this.displayName = $.displayName;
        this.endpoints = $.endpoints;
        this.faultDomain = $.faultDomain;
        this.freeformTags = $.freeformTags;
        this.hostnameLabel = $.hostnameLabel;
        this.id = $.id;
        this.ipAddress = $.ipAddress;
        this.isHighlyAvailable = $.isHighlyAvailable;
        this.maintenances = $.maintenances;
        this.mysqlVersion = $.mysqlVersion;
        this.port = $.port;
        this.portX = $.portX;
        this.shapeName = $.shapeName;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlBackupDbSystemSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlBackupDbSystemSnapshotArgs $;

        public Builder() {
            $ = new MysqlBackupDbSystemSnapshotArgs();
        }

        public Builder(MysqlBackupDbSystemSnapshotArgs defaults) {
            $ = new MysqlBackupDbSystemSnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminUsername The username for the administrative user.
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(@Nullable Output<String> adminUsername) {
            $.adminUsername = adminUsername;
            return this;
        }

        /**
         * @param adminUsername The username for the administrative user.
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(String adminUsername) {
            return adminUsername(Output.of(adminUsername));
        }

        /**
         * @param availabilityDomain The Availability Domain where the primary DB System should be located.
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(@Nullable Output<String> availabilityDomain) {
            $.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * @param availabilityDomain The Availability Domain where the primary DB System should be located.
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomain(String availabilityDomain) {
            return availabilityDomain(Output.of(availabilityDomain));
        }

        /**
         * @param backupPolicies The Backup policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicies(@Nullable Output<List<MysqlBackupDbSystemSnapshotBackupPolicyArgs>> backupPolicies) {
            $.backupPolicies = backupPolicies;
            return this;
        }

        /**
         * @param backupPolicies The Backup policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicies(List<MysqlBackupDbSystemSnapshotBackupPolicyArgs> backupPolicies) {
            return backupPolicies(Output.of(backupPolicies));
        }

        /**
         * @param backupPolicies The Backup policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicies(MysqlBackupDbSystemSnapshotBackupPolicyArgs... backupPolicies) {
            return backupPolicies(List.of(backupPolicies));
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param configurationId The OCID of the Configuration to be used for Instances in this DB System.
         * 
         * @return builder
         * 
         */
        public Builder configurationId(@Nullable Output<String> configurationId) {
            $.configurationId = configurationId;
            return this;
        }

        /**
         * @param configurationId The OCID of the Configuration to be used for Instances in this DB System.
         * 
         * @return builder
         * 
         */
        public Builder configurationId(String configurationId) {
            return configurationId(Output.of(configurationId));
        }

        /**
         * @param crashRecovery Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or disabled, and whether to enable or disable syncing of the Binary Logs.
         * 
         * @return builder
         * 
         */
        public Builder crashRecovery(@Nullable Output<String> crashRecovery) {
            $.crashRecovery = crashRecovery;
            return this;
        }

        /**
         * @param crashRecovery Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or disabled, and whether to enable or disable syncing of the Binary Logs.
         * 
         * @return builder
         * 
         */
        public Builder crashRecovery(String crashRecovery) {
            return crashRecovery(Output.of(crashRecovery));
        }

        /**
         * @param dataStorageSizeInGb Initial size of the data volume in GiBs that will be created and attached.
         * 
         * @return builder
         * 
         */
        public Builder dataStorageSizeInGb(@Nullable Output<Integer> dataStorageSizeInGb) {
            $.dataStorageSizeInGb = dataStorageSizeInGb;
            return this;
        }

        /**
         * @param dataStorageSizeInGb Initial size of the data volume in GiBs that will be created and attached.
         * 
         * @return builder
         * 
         */
        public Builder dataStorageSizeInGb(Integer dataStorageSizeInGb) {
            return dataStorageSizeInGb(Output.of(dataStorageSizeInGb));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param deletionPolicies The Deletion policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicies(@Nullable Output<List<MysqlBackupDbSystemSnapshotDeletionPolicyArgs>> deletionPolicies) {
            $.deletionPolicies = deletionPolicies;
            return this;
        }

        /**
         * @param deletionPolicies The Deletion policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicies(List<MysqlBackupDbSystemSnapshotDeletionPolicyArgs> deletionPolicies) {
            return deletionPolicies(Output.of(deletionPolicies));
        }

        /**
         * @param deletionPolicies The Deletion policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicies(MysqlBackupDbSystemSnapshotDeletionPolicyArgs... deletionPolicies) {
            return deletionPolicies(List.of(deletionPolicies));
        }

        /**
         * @param description (Updatable) A user-supplied description for the backup.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) A user-supplied description for the backup.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) A user-supplied display name for the backup.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-supplied display name for the backup.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param endpoints The network endpoints available for this DB System.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<List<MysqlBackupDbSystemSnapshotEndpointArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints The network endpoints available for this DB System.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<MysqlBackupDbSystemSnapshotEndpointArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints The network endpoints available for this DB System.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(MysqlBackupDbSystemSnapshotEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param faultDomain The name of the Fault Domain the DB System is located in.
         * 
         * @return builder
         * 
         */
        public Builder faultDomain(@Nullable Output<String> faultDomain) {
            $.faultDomain = faultDomain;
            return this;
        }

        /**
         * @param faultDomain The name of the Fault Domain the DB System is located in.
         * 
         * @return builder
         * 
         */
        public Builder faultDomain(String faultDomain) {
            return faultDomain(Output.of(faultDomain));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param hostnameLabel The hostname for the primary endpoint of the DB System. Used for DNS. The value is the hostname portion of the primary private IP&#39;s fully qualified domain name (FQDN) (for example, &#34;dbsystem-1&#34; in FQDN &#34;dbsystem-1.subnet123.vcn1.oraclevcn.com&#34;). Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
         * 
         * @return builder
         * 
         */
        public Builder hostnameLabel(@Nullable Output<String> hostnameLabel) {
            $.hostnameLabel = hostnameLabel;
            return this;
        }

        /**
         * @param hostnameLabel The hostname for the primary endpoint of the DB System. Used for DNS. The value is the hostname portion of the primary private IP&#39;s fully qualified domain name (FQDN) (for example, &#34;dbsystem-1&#34; in FQDN &#34;dbsystem-1.subnet123.vcn1.oraclevcn.com&#34;). Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
         * 
         * @return builder
         * 
         */
        public Builder hostnameLabel(String hostnameLabel) {
            return hostnameLabel(Output.of(hostnameLabel));
        }

        /**
         * @param id OCID of the backup itself
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id OCID of the backup itself
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ipAddress The IP address the DB System is configured to listen on. A private IP address of the primary endpoint of the DB System. Must be an available IP address within the subnet&#39;s CIDR. This will be a &#34;dotted-quad&#34; style IPv4 address.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address the DB System is configured to listen on. A private IP address of the primary endpoint of the DB System. Must be an available IP address within the subnet&#39;s CIDR. This will be a &#34;dotted-quad&#34; style IPv4 address.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param isHighlyAvailable If the policy is to enable high availability of the instance, by maintaining secondary/failover capacity as necessary.
         * 
         * @return builder
         * 
         */
        public Builder isHighlyAvailable(@Nullable Output<Boolean> isHighlyAvailable) {
            $.isHighlyAvailable = isHighlyAvailable;
            return this;
        }

        /**
         * @param isHighlyAvailable If the policy is to enable high availability of the instance, by maintaining secondary/failover capacity as necessary.
         * 
         * @return builder
         * 
         */
        public Builder isHighlyAvailable(Boolean isHighlyAvailable) {
            return isHighlyAvailable(Output.of(isHighlyAvailable));
        }

        /**
         * @param maintenances The Maintenance Policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder maintenances(@Nullable Output<List<MysqlBackupDbSystemSnapshotMaintenanceArgs>> maintenances) {
            $.maintenances = maintenances;
            return this;
        }

        /**
         * @param maintenances The Maintenance Policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder maintenances(List<MysqlBackupDbSystemSnapshotMaintenanceArgs> maintenances) {
            return maintenances(Output.of(maintenances));
        }

        /**
         * @param maintenances The Maintenance Policy for the DB System.
         * 
         * @return builder
         * 
         */
        public Builder maintenances(MysqlBackupDbSystemSnapshotMaintenanceArgs... maintenances) {
            return maintenances(List.of(maintenances));
        }

        /**
         * @param mysqlVersion The MySQL server version of the DB System used for backup.
         * 
         * @return builder
         * 
         */
        public Builder mysqlVersion(@Nullable Output<String> mysqlVersion) {
            $.mysqlVersion = mysqlVersion;
            return this;
        }

        /**
         * @param mysqlVersion The MySQL server version of the DB System used for backup.
         * 
         * @return builder
         * 
         */
        public Builder mysqlVersion(String mysqlVersion) {
            return mysqlVersion(Output.of(mysqlVersion));
        }

        /**
         * @param port The port for primary endpoint of the DB System to listen on.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port for primary endpoint of the DB System to listen on.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param portX The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin equivalent of port.
         * 
         * @return builder
         * 
         */
        public Builder portX(@Nullable Output<Integer> portX) {
            $.portX = portX;
            return this;
        }

        /**
         * @param portX The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin equivalent of port.
         * 
         * @return builder
         * 
         */
        public Builder portX(Integer portX) {
            return portX(Output.of(portX));
        }

        /**
         * @param shapeName The shape of the DB System instance used for backup.
         * 
         * @return builder
         * 
         */
        public Builder shapeName(@Nullable Output<String> shapeName) {
            $.shapeName = shapeName;
            return this;
        }

        /**
         * @param shapeName The shape of the DB System instance used for backup.
         * 
         * @return builder
         * 
         */
        public Builder shapeName(String shapeName) {
            return shapeName(Output.of(shapeName));
        }

        /**
         * @param subnetId The OCID of the subnet the DB System is associated with.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The OCID of the subnet the DB System is associated with.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public MysqlBackupDbSystemSnapshotArgs build() {
            return $;
        }
    }

}
