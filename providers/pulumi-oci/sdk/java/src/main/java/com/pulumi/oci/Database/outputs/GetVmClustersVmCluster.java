// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVmClustersVmCluster {
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    private final Integer cpuCoreCount;
    /**
     * @return The number of enabled CPU cores.
     * 
     */
    private final Integer cpusEnabled;
    private final Double dataStorageSizeInGb;
    /**
     * @return Size, in terabytes, of the DATA disk group.
     * 
     */
    private final Double dataStorageSizeInTbs;
    /**
     * @return The local node storage allocated in GBs.
     * 
     */
    private final Integer dbNodeStorageSizeInGbs;
    /**
     * @return The list of Db server.
     * 
     */
    private final List<String> dbServers;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    private final String displayName;
    /**
     * @return If provided, filters the results for the given Exadata Infrastructure.
     * 
     */
    private final String exadataInfrastructureId;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The Oracle Grid Infrastructure software version for the VM cluster.
     * 
     */
    private final String giVersion;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * 
     */
    private final String id;
    /**
     * @return If true, database backup on local Exadata storage is configured for the VM cluster. If false, database backup on local Exadata storage is not available in the VM cluster.
     * 
     */
    private final Boolean isLocalBackupEnabled;
    /**
     * @return If true, sparse disk group is configured for the VM cluster. If false, sparse disk group is not created.
     * 
     */
    private final Boolean isSparseDiskgroupEnabled;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last patch history. This value is updated as soon as a patch operation starts.
     * 
     */
    private final String lastPatchHistoryEntryId;
    /**
     * @return The Oracle license model that applies to the VM cluster. The default is LICENSE_INCLUDED.
     * 
     */
    private final String licenseModel;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The memory allocated in GBs.
     * 
     */
    private final Integer memorySizeInGbs;
    private final Double ocpuCount;
    private final Double ocpusEnabled;
    /**
     * @return The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and memory resources allocated to the instance.
     * 
     */
    private final String shape;
    /**
     * @return The public key portion of one or more key pairs used for SSH access to the VM cluster.
     * 
     */
    private final List<String> sshPublicKeys;
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    private final String state;
    /**
     * @return Operating system version of the image.
     * 
     */
    private final String systemVersion;
    /**
     * @return The date and time that the VM cluster was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/iaas/Content/Database/References/timezones.htm).
     * 
     */
    private final String timeZone;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     * 
     */
    private final String vmClusterNetworkId;

    @CustomType.Constructor
    private GetVmClustersVmCluster(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("cpuCoreCount") Integer cpuCoreCount,
        @CustomType.Parameter("cpusEnabled") Integer cpusEnabled,
        @CustomType.Parameter("dataStorageSizeInGb") Double dataStorageSizeInGb,
        @CustomType.Parameter("dataStorageSizeInTbs") Double dataStorageSizeInTbs,
        @CustomType.Parameter("dbNodeStorageSizeInGbs") Integer dbNodeStorageSizeInGbs,
        @CustomType.Parameter("dbServers") List<String> dbServers,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("exadataInfrastructureId") String exadataInfrastructureId,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("giVersion") String giVersion,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isLocalBackupEnabled") Boolean isLocalBackupEnabled,
        @CustomType.Parameter("isSparseDiskgroupEnabled") Boolean isSparseDiskgroupEnabled,
        @CustomType.Parameter("lastPatchHistoryEntryId") String lastPatchHistoryEntryId,
        @CustomType.Parameter("licenseModel") String licenseModel,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("memorySizeInGbs") Integer memorySizeInGbs,
        @CustomType.Parameter("ocpuCount") Double ocpuCount,
        @CustomType.Parameter("ocpusEnabled") Double ocpusEnabled,
        @CustomType.Parameter("shape") String shape,
        @CustomType.Parameter("sshPublicKeys") List<String> sshPublicKeys,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemVersion") String systemVersion,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeZone") String timeZone,
        @CustomType.Parameter("vmClusterNetworkId") String vmClusterNetworkId) {
        this.compartmentId = compartmentId;
        this.cpuCoreCount = cpuCoreCount;
        this.cpusEnabled = cpusEnabled;
        this.dataStorageSizeInGb = dataStorageSizeInGb;
        this.dataStorageSizeInTbs = dataStorageSizeInTbs;
        this.dbNodeStorageSizeInGbs = dbNodeStorageSizeInGbs;
        this.dbServers = dbServers;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.freeformTags = freeformTags;
        this.giVersion = giVersion;
        this.id = id;
        this.isLocalBackupEnabled = isLocalBackupEnabled;
        this.isSparseDiskgroupEnabled = isSparseDiskgroupEnabled;
        this.lastPatchHistoryEntryId = lastPatchHistoryEntryId;
        this.licenseModel = licenseModel;
        this.lifecycleDetails = lifecycleDetails;
        this.memorySizeInGbs = memorySizeInGbs;
        this.ocpuCount = ocpuCount;
        this.ocpusEnabled = ocpusEnabled;
        this.shape = shape;
        this.sshPublicKeys = sshPublicKeys;
        this.state = state;
        this.systemVersion = systemVersion;
        this.timeCreated = timeCreated;
        this.timeZone = timeZone;
        this.vmClusterNetworkId = vmClusterNetworkId;
    }

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public Integer cpuCoreCount() {
        return this.cpuCoreCount;
    }
    /**
     * @return The number of enabled CPU cores.
     * 
     */
    public Integer cpusEnabled() {
        return this.cpusEnabled;
    }
    public Double dataStorageSizeInGb() {
        return this.dataStorageSizeInGb;
    }
    /**
     * @return Size, in terabytes, of the DATA disk group.
     * 
     */
    public Double dataStorageSizeInTbs() {
        return this.dataStorageSizeInTbs;
    }
    /**
     * @return The local node storage allocated in GBs.
     * 
     */
    public Integer dbNodeStorageSizeInGbs() {
        return this.dbNodeStorageSizeInGbs;
    }
    /**
     * @return The list of Db server.
     * 
     */
    public List<String> dbServers() {
        return this.dbServers;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return If provided, filters the results for the given Exadata Infrastructure.
     * 
     */
    public String exadataInfrastructureId() {
        return this.exadataInfrastructureId;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The Oracle Grid Infrastructure software version for the VM cluster.
     * 
     */
    public String giVersion() {
        return this.giVersion;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If true, database backup on local Exadata storage is configured for the VM cluster. If false, database backup on local Exadata storage is not available in the VM cluster.
     * 
     */
    public Boolean isLocalBackupEnabled() {
        return this.isLocalBackupEnabled;
    }
    /**
     * @return If true, sparse disk group is configured for the VM cluster. If false, sparse disk group is not created.
     * 
     */
    public Boolean isSparseDiskgroupEnabled() {
        return this.isSparseDiskgroupEnabled;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last patch history. This value is updated as soon as a patch operation starts.
     * 
     */
    public String lastPatchHistoryEntryId() {
        return this.lastPatchHistoryEntryId;
    }
    /**
     * @return The Oracle license model that applies to the VM cluster. The default is LICENSE_INCLUDED.
     * 
     */
    public String licenseModel() {
        return this.licenseModel;
    }
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return The memory allocated in GBs.
     * 
     */
    public Integer memorySizeInGbs() {
        return this.memorySizeInGbs;
    }
    public Double ocpuCount() {
        return this.ocpuCount;
    }
    public Double ocpusEnabled() {
        return this.ocpusEnabled;
    }
    /**
     * @return The shape of the Exadata infrastructure. The shape determines the amount of CPU, storage, and memory resources allocated to the instance.
     * 
     */
    public String shape() {
        return this.shape;
    }
    /**
     * @return The public key portion of one or more key pairs used for SSH access to the VM cluster.
     * 
     */
    public List<String> sshPublicKeys() {
        return this.sshPublicKeys;
    }
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Operating system version of the image.
     * 
     */
    public String systemVersion() {
        return this.systemVersion;
    }
    /**
     * @return The date and time that the VM cluster was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time zone of the Exadata infrastructure. For details, see [Exadata Infrastructure Time Zones](https://docs.cloud.oracle.com/iaas/Content/Database/References/timezones.htm).
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     * 
     */
    public String vmClusterNetworkId() {
        return this.vmClusterNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmClustersVmCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Integer cpuCoreCount;
        private Integer cpusEnabled;
        private Double dataStorageSizeInGb;
        private Double dataStorageSizeInTbs;
        private Integer dbNodeStorageSizeInGbs;
        private List<String> dbServers;
        private Map<String,Object> definedTags;
        private String displayName;
        private String exadataInfrastructureId;
        private Map<String,Object> freeformTags;
        private String giVersion;
        private String id;
        private Boolean isLocalBackupEnabled;
        private Boolean isSparseDiskgroupEnabled;
        private String lastPatchHistoryEntryId;
        private String licenseModel;
        private String lifecycleDetails;
        private Integer memorySizeInGbs;
        private Double ocpuCount;
        private Double ocpusEnabled;
        private String shape;
        private List<String> sshPublicKeys;
        private String state;
        private String systemVersion;
        private String timeCreated;
        private String timeZone;
        private String vmClusterNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVmClustersVmCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.cpuCoreCount = defaults.cpuCoreCount;
    	      this.cpusEnabled = defaults.cpusEnabled;
    	      this.dataStorageSizeInGb = defaults.dataStorageSizeInGb;
    	      this.dataStorageSizeInTbs = defaults.dataStorageSizeInTbs;
    	      this.dbNodeStorageSizeInGbs = defaults.dbNodeStorageSizeInGbs;
    	      this.dbServers = defaults.dbServers;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.exadataInfrastructureId = defaults.exadataInfrastructureId;
    	      this.freeformTags = defaults.freeformTags;
    	      this.giVersion = defaults.giVersion;
    	      this.id = defaults.id;
    	      this.isLocalBackupEnabled = defaults.isLocalBackupEnabled;
    	      this.isSparseDiskgroupEnabled = defaults.isSparseDiskgroupEnabled;
    	      this.lastPatchHistoryEntryId = defaults.lastPatchHistoryEntryId;
    	      this.licenseModel = defaults.licenseModel;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.memorySizeInGbs = defaults.memorySizeInGbs;
    	      this.ocpuCount = defaults.ocpuCount;
    	      this.ocpusEnabled = defaults.ocpusEnabled;
    	      this.shape = defaults.shape;
    	      this.sshPublicKeys = defaults.sshPublicKeys;
    	      this.state = defaults.state;
    	      this.systemVersion = defaults.systemVersion;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeZone = defaults.timeZone;
    	      this.vmClusterNetworkId = defaults.vmClusterNetworkId;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = Objects.requireNonNull(cpuCoreCount);
            return this;
        }
        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = Objects.requireNonNull(cpusEnabled);
            return this;
        }
        public Builder dataStorageSizeInGb(Double dataStorageSizeInGb) {
            this.dataStorageSizeInGb = Objects.requireNonNull(dataStorageSizeInGb);
            return this;
        }
        public Builder dataStorageSizeInTbs(Double dataStorageSizeInTbs) {
            this.dataStorageSizeInTbs = Objects.requireNonNull(dataStorageSizeInTbs);
            return this;
        }
        public Builder dbNodeStorageSizeInGbs(Integer dbNodeStorageSizeInGbs) {
            this.dbNodeStorageSizeInGbs = Objects.requireNonNull(dbNodeStorageSizeInGbs);
            return this;
        }
        public Builder dbServers(List<String> dbServers) {
            this.dbServers = Objects.requireNonNull(dbServers);
            return this;
        }
        public Builder dbServers(String... dbServers) {
            return dbServers(List.of(dbServers));
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = Objects.requireNonNull(exadataInfrastructureId);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder giVersion(String giVersion) {
            this.giVersion = Objects.requireNonNull(giVersion);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isLocalBackupEnabled(Boolean isLocalBackupEnabled) {
            this.isLocalBackupEnabled = Objects.requireNonNull(isLocalBackupEnabled);
            return this;
        }
        public Builder isSparseDiskgroupEnabled(Boolean isSparseDiskgroupEnabled) {
            this.isSparseDiskgroupEnabled = Objects.requireNonNull(isSparseDiskgroupEnabled);
            return this;
        }
        public Builder lastPatchHistoryEntryId(String lastPatchHistoryEntryId) {
            this.lastPatchHistoryEntryId = Objects.requireNonNull(lastPatchHistoryEntryId);
            return this;
        }
        public Builder licenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder memorySizeInGbs(Integer memorySizeInGbs) {
            this.memorySizeInGbs = Objects.requireNonNull(memorySizeInGbs);
            return this;
        }
        public Builder ocpuCount(Double ocpuCount) {
            this.ocpuCount = Objects.requireNonNull(ocpuCount);
            return this;
        }
        public Builder ocpusEnabled(Double ocpusEnabled) {
            this.ocpusEnabled = Objects.requireNonNull(ocpusEnabled);
            return this;
        }
        public Builder shape(String shape) {
            this.shape = Objects.requireNonNull(shape);
            return this;
        }
        public Builder sshPublicKeys(List<String> sshPublicKeys) {
            this.sshPublicKeys = Objects.requireNonNull(sshPublicKeys);
            return this;
        }
        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemVersion(String systemVersion) {
            this.systemVersion = Objects.requireNonNull(systemVersion);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder vmClusterNetworkId(String vmClusterNetworkId) {
            this.vmClusterNetworkId = Objects.requireNonNull(vmClusterNetworkId);
            return this;
        }        public GetVmClustersVmCluster build() {
            return new GetVmClustersVmCluster(compartmentId, cpuCoreCount, cpusEnabled, dataStorageSizeInGb, dataStorageSizeInTbs, dbNodeStorageSizeInGbs, dbServers, definedTags, displayName, exadataInfrastructureId, freeformTags, giVersion, id, isLocalBackupEnabled, isSparseDiskgroupEnabled, lastPatchHistoryEntryId, licenseModel, lifecycleDetails, memorySizeInGbs, ocpuCount, ocpusEnabled, shape, sshPublicKeys, state, systemVersion, timeCreated, timeZone, vmClusterNetworkId);
        }
    }
}
