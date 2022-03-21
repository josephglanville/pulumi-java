// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceSettingBackupConfiguration;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceSettingDatabaseFlag;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceSettingInsightsConfig;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceSettingIpConfiguration;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceSettingLocationPreference;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceSettingMaintenanceWindow;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetDatabaseInstanceSetting extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceSetting Empty = new GetDatabaseInstanceSetting();

    @Import(name="activationPolicy", required=true)
      private final String activationPolicy;

    public String getActivationPolicy() {
        return this.activationPolicy;
    }

    @Import(name="availabilityType", required=true)
      private final String availabilityType;

    public String getAvailabilityType() {
        return this.availabilityType;
    }

    @Import(name="backupConfigurations", required=true)
      private final List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations;

    public List<GetDatabaseInstanceSettingBackupConfiguration> getBackupConfigurations() {
        return this.backupConfigurations;
    }

    @Import(name="collation", required=true)
      private final String collation;

    public String getCollation() {
        return this.collation;
    }

    @Import(name="databaseFlags", required=true)
      private final List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags;

    public List<GetDatabaseInstanceSettingDatabaseFlag> getDatabaseFlags() {
        return this.databaseFlags;
    }

    @Import(name="diskAutoresize", required=true)
      private final Boolean diskAutoresize;

    public Boolean getDiskAutoresize() {
        return this.diskAutoresize;
    }

    @Import(name="diskAutoresizeLimit", required=true)
      private final Integer diskAutoresizeLimit;

    public Integer getDiskAutoresizeLimit() {
        return this.diskAutoresizeLimit;
    }

    @Import(name="diskSize", required=true)
      private final Integer diskSize;

    public Integer getDiskSize() {
        return this.diskSize;
    }

    @Import(name="diskType", required=true)
      private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    @Import(name="insightsConfigs", required=true)
      private final List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs;

    public List<GetDatabaseInstanceSettingInsightsConfig> getInsightsConfigs() {
        return this.insightsConfigs;
    }

    @Import(name="ipConfigurations", required=true)
      private final List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations;

    public List<GetDatabaseInstanceSettingIpConfiguration> getIpConfigurations() {
        return this.ipConfigurations;
    }

    @Import(name="locationPreferences", required=true)
      private final List<GetDatabaseInstanceSettingLocationPreference> locationPreferences;

    public List<GetDatabaseInstanceSettingLocationPreference> getLocationPreferences() {
        return this.locationPreferences;
    }

    @Import(name="maintenanceWindows", required=true)
      private final List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows;

    public List<GetDatabaseInstanceSettingMaintenanceWindow> getMaintenanceWindows() {
        return this.maintenanceWindows;
    }

    @Import(name="pricingPlan", required=true)
      private final String pricingPlan;

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    @Import(name="tier", required=true)
      private final String tier;

    public String getTier() {
        return this.tier;
    }

    @Import(name="userLabels", required=true)
      private final Map<String,String> userLabels;

    public Map<String,String> getUserLabels() {
        return this.userLabels;
    }

    @Import(name="version", required=true)
      private final Integer version;

    public Integer getVersion() {
        return this.version;
    }

    public GetDatabaseInstanceSetting(
        String activationPolicy,
        String availabilityType,
        List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations,
        String collation,
        List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags,
        Boolean diskAutoresize,
        Integer diskAutoresizeLimit,
        Integer diskSize,
        String diskType,
        List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs,
        List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations,
        List<GetDatabaseInstanceSettingLocationPreference> locationPreferences,
        List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows,
        String pricingPlan,
        String tier,
        Map<String,String> userLabels,
        Integer version) {
        this.activationPolicy = Objects.requireNonNull(activationPolicy, "expected parameter 'activationPolicy' to be non-null");
        this.availabilityType = Objects.requireNonNull(availabilityType, "expected parameter 'availabilityType' to be non-null");
        this.backupConfigurations = Objects.requireNonNull(backupConfigurations, "expected parameter 'backupConfigurations' to be non-null");
        this.collation = Objects.requireNonNull(collation, "expected parameter 'collation' to be non-null");
        this.databaseFlags = Objects.requireNonNull(databaseFlags, "expected parameter 'databaseFlags' to be non-null");
        this.diskAutoresize = Objects.requireNonNull(diskAutoresize, "expected parameter 'diskAutoresize' to be non-null");
        this.diskAutoresizeLimit = Objects.requireNonNull(diskAutoresizeLimit, "expected parameter 'diskAutoresizeLimit' to be non-null");
        this.diskSize = Objects.requireNonNull(diskSize, "expected parameter 'diskSize' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.insightsConfigs = Objects.requireNonNull(insightsConfigs, "expected parameter 'insightsConfigs' to be non-null");
        this.ipConfigurations = Objects.requireNonNull(ipConfigurations, "expected parameter 'ipConfigurations' to be non-null");
        this.locationPreferences = Objects.requireNonNull(locationPreferences, "expected parameter 'locationPreferences' to be non-null");
        this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows, "expected parameter 'maintenanceWindows' to be non-null");
        this.pricingPlan = Objects.requireNonNull(pricingPlan, "expected parameter 'pricingPlan' to be non-null");
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.userLabels = Objects.requireNonNull(userLabels, "expected parameter 'userLabels' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GetDatabaseInstanceSetting() {
        this.activationPolicy = null;
        this.availabilityType = null;
        this.backupConfigurations = List.of();
        this.collation = null;
        this.databaseFlags = List.of();
        this.diskAutoresize = null;
        this.diskAutoresizeLimit = null;
        this.diskSize = null;
        this.diskType = null;
        this.insightsConfigs = List.of();
        this.ipConfigurations = List.of();
        this.locationPreferences = List.of();
        this.maintenanceWindows = List.of();
        this.pricingPlan = null;
        this.tier = null;
        this.userLabels = Map.of();
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activationPolicy;
        private String availabilityType;
        private List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations;
        private String collation;
        private List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags;
        private Boolean diskAutoresize;
        private Integer diskAutoresizeLimit;
        private Integer diskSize;
        private String diskType;
        private List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs;
        private List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations;
        private List<GetDatabaseInstanceSettingLocationPreference> locationPreferences;
        private List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows;
        private String pricingPlan;
        private String tier;
        private Map<String,String> userLabels;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.availabilityType = defaults.availabilityType;
    	      this.backupConfigurations = defaults.backupConfigurations;
    	      this.collation = defaults.collation;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.diskAutoresize = defaults.diskAutoresize;
    	      this.diskAutoresizeLimit = defaults.diskAutoresizeLimit;
    	      this.diskSize = defaults.diskSize;
    	      this.diskType = defaults.diskType;
    	      this.insightsConfigs = defaults.insightsConfigs;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.locationPreferences = defaults.locationPreferences;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
    	      this.version = defaults.version;
        }

        public Builder activationPolicy(String activationPolicy) {
            this.activationPolicy = Objects.requireNonNull(activationPolicy);
            return this;
        }
        public Builder availabilityType(String availabilityType) {
            this.availabilityType = Objects.requireNonNull(availabilityType);
            return this;
        }
        public Builder backupConfigurations(List<GetDatabaseInstanceSettingBackupConfiguration> backupConfigurations) {
            this.backupConfigurations = Objects.requireNonNull(backupConfigurations);
            return this;
        }
        public Builder backupConfigurations(GetDatabaseInstanceSettingBackupConfiguration... backupConfigurations) {
            return backupConfigurations(List.of(backupConfigurations));
        }
        public Builder collation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }
        public Builder databaseFlags(List<GetDatabaseInstanceSettingDatabaseFlag> databaseFlags) {
            this.databaseFlags = Objects.requireNonNull(databaseFlags);
            return this;
        }
        public Builder databaseFlags(GetDatabaseInstanceSettingDatabaseFlag... databaseFlags) {
            return databaseFlags(List.of(databaseFlags));
        }
        public Builder diskAutoresize(Boolean diskAutoresize) {
            this.diskAutoresize = Objects.requireNonNull(diskAutoresize);
            return this;
        }
        public Builder diskAutoresizeLimit(Integer diskAutoresizeLimit) {
            this.diskAutoresizeLimit = Objects.requireNonNull(diskAutoresizeLimit);
            return this;
        }
        public Builder diskSize(Integer diskSize) {
            this.diskSize = Objects.requireNonNull(diskSize);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder insightsConfigs(List<GetDatabaseInstanceSettingInsightsConfig> insightsConfigs) {
            this.insightsConfigs = Objects.requireNonNull(insightsConfigs);
            return this;
        }
        public Builder insightsConfigs(GetDatabaseInstanceSettingInsightsConfig... insightsConfigs) {
            return insightsConfigs(List.of(insightsConfigs));
        }
        public Builder ipConfigurations(List<GetDatabaseInstanceSettingIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(GetDatabaseInstanceSettingIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder locationPreferences(List<GetDatabaseInstanceSettingLocationPreference> locationPreferences) {
            this.locationPreferences = Objects.requireNonNull(locationPreferences);
            return this;
        }
        public Builder locationPreferences(GetDatabaseInstanceSettingLocationPreference... locationPreferences) {
            return locationPreferences(List.of(locationPreferences));
        }
        public Builder maintenanceWindows(List<GetDatabaseInstanceSettingMaintenanceWindow> maintenanceWindows) {
            this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows);
            return this;
        }
        public Builder maintenanceWindows(GetDatabaseInstanceSettingMaintenanceWindow... maintenanceWindows) {
            return maintenanceWindows(List.of(maintenanceWindows));
        }
        public Builder pricingPlan(String pricingPlan) {
            this.pricingPlan = Objects.requireNonNull(pricingPlan);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder userLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetDatabaseInstanceSetting build() {
            return new GetDatabaseInstanceSetting(activationPolicy, availabilityType, backupConfigurations, collation, databaseFlags, diskAutoresize, diskAutoresizeLimit, diskSize, diskType, insightsConfigs, ipConfigurations, locationPreferences, maintenanceWindows, pricingPlan, tier, userLabels, version);
        }
    }
}
