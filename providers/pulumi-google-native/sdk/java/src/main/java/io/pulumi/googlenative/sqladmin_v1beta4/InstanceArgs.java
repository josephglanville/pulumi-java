// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceBackendType;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceDatabaseVersion;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceInstanceType;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceState;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceSuspensionReasonItem;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.DiskEncryptionConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.DiskEncryptionStatusArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.InstanceFailoverReplicaArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.IpMappingArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.OnPremisesConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.ReplicaConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SettingsArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlOutOfDiskReportArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlScheduledMaintenanceArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SslCertArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    @InputImport(name="backendType")
    private final @Nullable Input<InstanceBackendType> backendType;

    public Input<InstanceBackendType> getBackendType() {
        return this.backendType == null ? Input.empty() : this.backendType;
    }

    @InputImport(name="connectionName")
    private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
    }

    @InputImport(name="currentDiskSize")
    private final @Nullable Input<String> currentDiskSize;

    public Input<String> getCurrentDiskSize() {
        return this.currentDiskSize == null ? Input.empty() : this.currentDiskSize;
    }

    @InputImport(name="databaseVersion")
    private final @Nullable Input<InstanceDatabaseVersion> databaseVersion;

    public Input<InstanceDatabaseVersion> getDatabaseVersion() {
        return this.databaseVersion == null ? Input.empty() : this.databaseVersion;
    }

    @InputImport(name="diskEncryptionConfiguration")
    private final @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;

    public Input<DiskEncryptionConfigurationArgs> getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration == null ? Input.empty() : this.diskEncryptionConfiguration;
    }

    @InputImport(name="diskEncryptionStatus")
    private final @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus;

    public Input<DiskEncryptionStatusArgs> getDiskEncryptionStatus() {
        return this.diskEncryptionStatus == null ? Input.empty() : this.diskEncryptionStatus;
    }

    @InputImport(name="failoverReplica")
    private final @Nullable Input<InstanceFailoverReplicaArgs> failoverReplica;

    public Input<InstanceFailoverReplicaArgs> getFailoverReplica() {
        return this.failoverReplica == null ? Input.empty() : this.failoverReplica;
    }

    @InputImport(name="gceZone")
    private final @Nullable Input<String> gceZone;

    public Input<String> getGceZone() {
        return this.gceZone == null ? Input.empty() : this.gceZone;
    }

    @InputImport(name="instanceType")
    private final @Nullable Input<InstanceInstanceType> instanceType;

    public Input<InstanceInstanceType> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    @InputImport(name="ipAddresses")
    private final @Nullable Input<List<IpMappingArgs>> ipAddresses;

    public Input<List<IpMappingArgs>> getIpAddresses() {
        return this.ipAddresses == null ? Input.empty() : this.ipAddresses;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="masterInstanceName")
    private final @Nullable Input<String> masterInstanceName;

    public Input<String> getMasterInstanceName() {
        return this.masterInstanceName == null ? Input.empty() : this.masterInstanceName;
    }

    @InputImport(name="maxDiskSize")
    private final @Nullable Input<String> maxDiskSize;

    public Input<String> getMaxDiskSize() {
        return this.maxDiskSize == null ? Input.empty() : this.maxDiskSize;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="onPremisesConfiguration")
    private final @Nullable Input<OnPremisesConfigurationArgs> onPremisesConfiguration;

    public Input<OnPremisesConfigurationArgs> getOnPremisesConfiguration() {
        return this.onPremisesConfiguration == null ? Input.empty() : this.onPremisesConfiguration;
    }

    @InputImport(name="outOfDiskReport")
    private final @Nullable Input<SqlOutOfDiskReportArgs> outOfDiskReport;

    public Input<SqlOutOfDiskReportArgs> getOutOfDiskReport() {
        return this.outOfDiskReport == null ? Input.empty() : this.outOfDiskReport;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    @InputImport(name="replicaConfiguration")
    private final @Nullable Input<ReplicaConfigurationArgs> replicaConfiguration;

    public Input<ReplicaConfigurationArgs> getReplicaConfiguration() {
        return this.replicaConfiguration == null ? Input.empty() : this.replicaConfiguration;
    }

    @InputImport(name="replicaNames")
    private final @Nullable Input<List<String>> replicaNames;

    public Input<List<String>> getReplicaNames() {
        return this.replicaNames == null ? Input.empty() : this.replicaNames;
    }

    @InputImport(name="rootPassword")
    private final @Nullable Input<String> rootPassword;

    public Input<String> getRootPassword() {
        return this.rootPassword == null ? Input.empty() : this.rootPassword;
    }

    @InputImport(name="satisfiesPzs")
    private final @Nullable Input<Boolean> satisfiesPzs;

    public Input<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs == null ? Input.empty() : this.satisfiesPzs;
    }

    @InputImport(name="scheduledMaintenance")
    private final @Nullable Input<SqlScheduledMaintenanceArgs> scheduledMaintenance;

    public Input<SqlScheduledMaintenanceArgs> getScheduledMaintenance() {
        return this.scheduledMaintenance == null ? Input.empty() : this.scheduledMaintenance;
    }

    @InputImport(name="secondaryGceZone")
    private final @Nullable Input<String> secondaryGceZone;

    public Input<String> getSecondaryGceZone() {
        return this.secondaryGceZone == null ? Input.empty() : this.secondaryGceZone;
    }

    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    @InputImport(name="serverCaCert")
    private final @Nullable Input<SslCertArgs> serverCaCert;

    public Input<SslCertArgs> getServerCaCert() {
        return this.serverCaCert == null ? Input.empty() : this.serverCaCert;
    }

    @InputImport(name="serviceAccountEmailAddress")
    private final @Nullable Input<String> serviceAccountEmailAddress;

    public Input<String> getServiceAccountEmailAddress() {
        return this.serviceAccountEmailAddress == null ? Input.empty() : this.serviceAccountEmailAddress;
    }

    @InputImport(name="settings")
    private final @Nullable Input<SettingsArgs> settings;

    public Input<SettingsArgs> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    @InputImport(name="state")
    private final @Nullable Input<InstanceState> state;

    public Input<InstanceState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="suspensionReason")
    private final @Nullable Input<List<InstanceSuspensionReasonItem>> suspensionReason;

    public Input<List<InstanceSuspensionReasonItem>> getSuspensionReason() {
        return this.suspensionReason == null ? Input.empty() : this.suspensionReason;
    }

    public InstanceArgs(
        @Nullable Input<InstanceBackendType> backendType,
        @Nullable Input<String> connectionName,
        @Nullable Input<String> currentDiskSize,
        @Nullable Input<InstanceDatabaseVersion> databaseVersion,
        @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration,
        @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus,
        @Nullable Input<InstanceFailoverReplicaArgs> failoverReplica,
        @Nullable Input<String> gceZone,
        @Nullable Input<InstanceInstanceType> instanceType,
        @Nullable Input<List<IpMappingArgs>> ipAddresses,
        @Nullable Input<String> kind,
        @Nullable Input<String> masterInstanceName,
        @Nullable Input<String> maxDiskSize,
        @Nullable Input<String> name,
        @Nullable Input<OnPremisesConfigurationArgs> onPremisesConfiguration,
        @Nullable Input<SqlOutOfDiskReportArgs> outOfDiskReport,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<ReplicaConfigurationArgs> replicaConfiguration,
        @Nullable Input<List<String>> replicaNames,
        @Nullable Input<String> rootPassword,
        @Nullable Input<Boolean> satisfiesPzs,
        @Nullable Input<SqlScheduledMaintenanceArgs> scheduledMaintenance,
        @Nullable Input<String> secondaryGceZone,
        @Nullable Input<String> selfLink,
        @Nullable Input<SslCertArgs> serverCaCert,
        @Nullable Input<String> serviceAccountEmailAddress,
        @Nullable Input<SettingsArgs> settings,
        @Nullable Input<InstanceState> state,
        @Nullable Input<List<InstanceSuspensionReasonItem>> suspensionReason) {
        this.backendType = backendType;
        this.connectionName = connectionName;
        this.currentDiskSize = currentDiskSize;
        this.databaseVersion = databaseVersion;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.diskEncryptionStatus = diskEncryptionStatus;
        this.failoverReplica = failoverReplica;
        this.gceZone = gceZone;
        this.instanceType = instanceType;
        this.ipAddresses = ipAddresses;
        this.kind = kind;
        this.masterInstanceName = masterInstanceName;
        this.maxDiskSize = maxDiskSize;
        this.name = name;
        this.onPremisesConfiguration = onPremisesConfiguration;
        this.outOfDiskReport = outOfDiskReport;
        this.project = project;
        this.region = region;
        this.replicaConfiguration = replicaConfiguration;
        this.replicaNames = replicaNames;
        this.rootPassword = rootPassword;
        this.satisfiesPzs = satisfiesPzs;
        this.scheduledMaintenance = scheduledMaintenance;
        this.secondaryGceZone = secondaryGceZone;
        this.selfLink = selfLink;
        this.serverCaCert = serverCaCert;
        this.serviceAccountEmailAddress = serviceAccountEmailAddress;
        this.settings = settings;
        this.state = state;
        this.suspensionReason = suspensionReason;
    }

    private InstanceArgs() {
        this.backendType = Input.empty();
        this.connectionName = Input.empty();
        this.currentDiskSize = Input.empty();
        this.databaseVersion = Input.empty();
        this.diskEncryptionConfiguration = Input.empty();
        this.diskEncryptionStatus = Input.empty();
        this.failoverReplica = Input.empty();
        this.gceZone = Input.empty();
        this.instanceType = Input.empty();
        this.ipAddresses = Input.empty();
        this.kind = Input.empty();
        this.masterInstanceName = Input.empty();
        this.maxDiskSize = Input.empty();
        this.name = Input.empty();
        this.onPremisesConfiguration = Input.empty();
        this.outOfDiskReport = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.replicaConfiguration = Input.empty();
        this.replicaNames = Input.empty();
        this.rootPassword = Input.empty();
        this.satisfiesPzs = Input.empty();
        this.scheduledMaintenance = Input.empty();
        this.secondaryGceZone = Input.empty();
        this.selfLink = Input.empty();
        this.serverCaCert = Input.empty();
        this.serviceAccountEmailAddress = Input.empty();
        this.settings = Input.empty();
        this.state = Input.empty();
        this.suspensionReason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceBackendType> backendType;
        private @Nullable Input<String> connectionName;
        private @Nullable Input<String> currentDiskSize;
        private @Nullable Input<InstanceDatabaseVersion> databaseVersion;
        private @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;
        private @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus;
        private @Nullable Input<InstanceFailoverReplicaArgs> failoverReplica;
        private @Nullable Input<String> gceZone;
        private @Nullable Input<InstanceInstanceType> instanceType;
        private @Nullable Input<List<IpMappingArgs>> ipAddresses;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> masterInstanceName;
        private @Nullable Input<String> maxDiskSize;
        private @Nullable Input<String> name;
        private @Nullable Input<OnPremisesConfigurationArgs> onPremisesConfiguration;
        private @Nullable Input<SqlOutOfDiskReportArgs> outOfDiskReport;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<ReplicaConfigurationArgs> replicaConfiguration;
        private @Nullable Input<List<String>> replicaNames;
        private @Nullable Input<String> rootPassword;
        private @Nullable Input<Boolean> satisfiesPzs;
        private @Nullable Input<SqlScheduledMaintenanceArgs> scheduledMaintenance;
        private @Nullable Input<String> secondaryGceZone;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<SslCertArgs> serverCaCert;
        private @Nullable Input<String> serviceAccountEmailAddress;
        private @Nullable Input<SettingsArgs> settings;
        private @Nullable Input<InstanceState> state;
        private @Nullable Input<List<InstanceSuspensionReasonItem>> suspensionReason;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendType = defaults.backendType;
    	      this.connectionName = defaults.connectionName;
    	      this.currentDiskSize = defaults.currentDiskSize;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.diskEncryptionStatus = defaults.diskEncryptionStatus;
    	      this.failoverReplica = defaults.failoverReplica;
    	      this.gceZone = defaults.gceZone;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.kind = defaults.kind;
    	      this.masterInstanceName = defaults.masterInstanceName;
    	      this.maxDiskSize = defaults.maxDiskSize;
    	      this.name = defaults.name;
    	      this.onPremisesConfiguration = defaults.onPremisesConfiguration;
    	      this.outOfDiskReport = defaults.outOfDiskReport;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.replicaConfiguration = defaults.replicaConfiguration;
    	      this.replicaNames = defaults.replicaNames;
    	      this.rootPassword = defaults.rootPassword;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.scheduledMaintenance = defaults.scheduledMaintenance;
    	      this.secondaryGceZone = defaults.secondaryGceZone;
    	      this.selfLink = defaults.selfLink;
    	      this.serverCaCert = defaults.serverCaCert;
    	      this.serviceAccountEmailAddress = defaults.serviceAccountEmailAddress;
    	      this.settings = defaults.settings;
    	      this.state = defaults.state;
    	      this.suspensionReason = defaults.suspensionReason;
        }

        public Builder setBackendType(@Nullable Input<InstanceBackendType> backendType) {
            this.backendType = backendType;
            return this;
        }

        public Builder setBackendType(@Nullable InstanceBackendType backendType) {
            this.backendType = Input.ofNullable(backendType);
            return this;
        }

        public Builder setConnectionName(@Nullable Input<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = Input.ofNullable(connectionName);
            return this;
        }

        public Builder setCurrentDiskSize(@Nullable Input<String> currentDiskSize) {
            this.currentDiskSize = currentDiskSize;
            return this;
        }

        public Builder setCurrentDiskSize(@Nullable String currentDiskSize) {
            this.currentDiskSize = Input.ofNullable(currentDiskSize);
            return this;
        }

        public Builder setDatabaseVersion(@Nullable Input<InstanceDatabaseVersion> databaseVersion) {
            this.databaseVersion = databaseVersion;
            return this;
        }

        public Builder setDatabaseVersion(@Nullable InstanceDatabaseVersion databaseVersion) {
            this.databaseVersion = Input.ofNullable(databaseVersion);
            return this;
        }

        public Builder setDiskEncryptionConfiguration(@Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }

        public Builder setDiskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationArgs diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Input.ofNullable(diskEncryptionConfiguration);
            return this;
        }

        public Builder setDiskEncryptionStatus(@Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus) {
            this.diskEncryptionStatus = diskEncryptionStatus;
            return this;
        }

        public Builder setDiskEncryptionStatus(@Nullable DiskEncryptionStatusArgs diskEncryptionStatus) {
            this.diskEncryptionStatus = Input.ofNullable(diskEncryptionStatus);
            return this;
        }

        public Builder setFailoverReplica(@Nullable Input<InstanceFailoverReplicaArgs> failoverReplica) {
            this.failoverReplica = failoverReplica;
            return this;
        }

        public Builder setFailoverReplica(@Nullable InstanceFailoverReplicaArgs failoverReplica) {
            this.failoverReplica = Input.ofNullable(failoverReplica);
            return this;
        }

        public Builder setGceZone(@Nullable Input<String> gceZone) {
            this.gceZone = gceZone;
            return this;
        }

        public Builder setGceZone(@Nullable String gceZone) {
            this.gceZone = Input.ofNullable(gceZone);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<InstanceInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable InstanceInstanceType instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setIpAddresses(@Nullable Input<List<IpMappingArgs>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<IpMappingArgs> ipAddresses) {
            this.ipAddresses = Input.ofNullable(ipAddresses);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMasterInstanceName(@Nullable Input<String> masterInstanceName) {
            this.masterInstanceName = masterInstanceName;
            return this;
        }

        public Builder setMasterInstanceName(@Nullable String masterInstanceName) {
            this.masterInstanceName = Input.ofNullable(masterInstanceName);
            return this;
        }

        public Builder setMaxDiskSize(@Nullable Input<String> maxDiskSize) {
            this.maxDiskSize = maxDiskSize;
            return this;
        }

        public Builder setMaxDiskSize(@Nullable String maxDiskSize) {
            this.maxDiskSize = Input.ofNullable(maxDiskSize);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOnPremisesConfiguration(@Nullable Input<OnPremisesConfigurationArgs> onPremisesConfiguration) {
            this.onPremisesConfiguration = onPremisesConfiguration;
            return this;
        }

        public Builder setOnPremisesConfiguration(@Nullable OnPremisesConfigurationArgs onPremisesConfiguration) {
            this.onPremisesConfiguration = Input.ofNullable(onPremisesConfiguration);
            return this;
        }

        public Builder setOutOfDiskReport(@Nullable Input<SqlOutOfDiskReportArgs> outOfDiskReport) {
            this.outOfDiskReport = outOfDiskReport;
            return this;
        }

        public Builder setOutOfDiskReport(@Nullable SqlOutOfDiskReportArgs outOfDiskReport) {
            this.outOfDiskReport = Input.ofNullable(outOfDiskReport);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setReplicaConfiguration(@Nullable Input<ReplicaConfigurationArgs> replicaConfiguration) {
            this.replicaConfiguration = replicaConfiguration;
            return this;
        }

        public Builder setReplicaConfiguration(@Nullable ReplicaConfigurationArgs replicaConfiguration) {
            this.replicaConfiguration = Input.ofNullable(replicaConfiguration);
            return this;
        }

        public Builder setReplicaNames(@Nullable Input<List<String>> replicaNames) {
            this.replicaNames = replicaNames;
            return this;
        }

        public Builder setReplicaNames(@Nullable List<String> replicaNames) {
            this.replicaNames = Input.ofNullable(replicaNames);
            return this;
        }

        public Builder setRootPassword(@Nullable Input<String> rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }

        public Builder setRootPassword(@Nullable String rootPassword) {
            this.rootPassword = Input.ofNullable(rootPassword);
            return this;
        }

        public Builder setSatisfiesPzs(@Nullable Input<Boolean> satisfiesPzs) {
            this.satisfiesPzs = satisfiesPzs;
            return this;
        }

        public Builder setSatisfiesPzs(@Nullable Boolean satisfiesPzs) {
            this.satisfiesPzs = Input.ofNullable(satisfiesPzs);
            return this;
        }

        public Builder setScheduledMaintenance(@Nullable Input<SqlScheduledMaintenanceArgs> scheduledMaintenance) {
            this.scheduledMaintenance = scheduledMaintenance;
            return this;
        }

        public Builder setScheduledMaintenance(@Nullable SqlScheduledMaintenanceArgs scheduledMaintenance) {
            this.scheduledMaintenance = Input.ofNullable(scheduledMaintenance);
            return this;
        }

        public Builder setSecondaryGceZone(@Nullable Input<String> secondaryGceZone) {
            this.secondaryGceZone = secondaryGceZone;
            return this;
        }

        public Builder setSecondaryGceZone(@Nullable String secondaryGceZone) {
            this.secondaryGceZone = Input.ofNullable(secondaryGceZone);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setServerCaCert(@Nullable Input<SslCertArgs> serverCaCert) {
            this.serverCaCert = serverCaCert;
            return this;
        }

        public Builder setServerCaCert(@Nullable SslCertArgs serverCaCert) {
            this.serverCaCert = Input.ofNullable(serverCaCert);
            return this;
        }

        public Builder setServiceAccountEmailAddress(@Nullable Input<String> serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = serviceAccountEmailAddress;
            return this;
        }

        public Builder setServiceAccountEmailAddress(@Nullable String serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = Input.ofNullable(serviceAccountEmailAddress);
            return this;
        }

        public Builder setSettings(@Nullable Input<SettingsArgs> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable SettingsArgs settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder setState(@Nullable Input<InstanceState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable InstanceState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setSuspensionReason(@Nullable Input<List<InstanceSuspensionReasonItem>> suspensionReason) {
            this.suspensionReason = suspensionReason;
            return this;
        }

        public Builder setSuspensionReason(@Nullable List<InstanceSuspensionReasonItem> suspensionReason) {
            this.suspensionReason = Input.ofNullable(suspensionReason);
            return this;
        }

        public InstanceArgs build() {
            return new InstanceArgs(backendType, connectionName, currentDiskSize, databaseVersion, diskEncryptionConfiguration, diskEncryptionStatus, failoverReplica, gceZone, instanceType, ipAddresses, kind, masterInstanceName, maxDiskSize, name, onPremisesConfiguration, outOfDiskReport, project, region, replicaConfiguration, replicaNames, rootPassword, satisfiesPzs, scheduledMaintenance, secondaryGceZone, selfLink, serverCaCert, serviceAccountEmailAddress, settings, state, suspensionReason);
        }
    }
}