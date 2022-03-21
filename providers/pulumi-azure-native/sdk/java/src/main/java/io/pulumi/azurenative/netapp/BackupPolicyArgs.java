// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.netapp.inputs.VolumeBackupsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPolicyArgs Empty = new BackupPolicyArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Backup policy Name which uniquely identify backup policy.
     * 
     */
    @Import(name="backupPolicyName")
      private final @Nullable Output<String> backupPolicyName;

    public Output<String> getBackupPolicyName() {
        return this.backupPolicyName == null ? Output.empty() : this.backupPolicyName;
    }

    /**
     * Daily backups count to keep
     * 
     */
    @Import(name="dailyBackupsToKeep")
      private final @Nullable Output<Integer> dailyBackupsToKeep;

    public Output<Integer> getDailyBackupsToKeep() {
        return this.dailyBackupsToKeep == null ? Output.empty() : this.dailyBackupsToKeep;
    }

    /**
     * The property to decide policy is enabled or not
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Monthly backups count to keep
     * 
     */
    @Import(name="monthlyBackupsToKeep")
      private final @Nullable Output<Integer> monthlyBackupsToKeep;

    public Output<Integer> getMonthlyBackupsToKeep() {
        return this.monthlyBackupsToKeep == null ? Output.empty() : this.monthlyBackupsToKeep;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A list of volumes assigned to this policy
     * 
     */
    @Import(name="volumeBackups")
      private final @Nullable Output<List<VolumeBackupsArgs>> volumeBackups;

    public Output<List<VolumeBackupsArgs>> getVolumeBackups() {
        return this.volumeBackups == null ? Output.empty() : this.volumeBackups;
    }

    /**
     * Volumes using current backup policy
     * 
     */
    @Import(name="volumesAssigned")
      private final @Nullable Output<Integer> volumesAssigned;

    public Output<Integer> getVolumesAssigned() {
        return this.volumesAssigned == null ? Output.empty() : this.volumesAssigned;
    }

    /**
     * Weekly backups count to keep
     * 
     */
    @Import(name="weeklyBackupsToKeep")
      private final @Nullable Output<Integer> weeklyBackupsToKeep;

    public Output<Integer> getWeeklyBackupsToKeep() {
        return this.weeklyBackupsToKeep == null ? Output.empty() : this.weeklyBackupsToKeep;
    }

    /**
     * Yearly backups count to keep
     * 
     */
    @Import(name="yearlyBackupsToKeep")
      private final @Nullable Output<Integer> yearlyBackupsToKeep;

    public Output<Integer> getYearlyBackupsToKeep() {
        return this.yearlyBackupsToKeep == null ? Output.empty() : this.yearlyBackupsToKeep;
    }

    public BackupPolicyArgs(
        Output<String> accountName,
        @Nullable Output<String> backupPolicyName,
        @Nullable Output<Integer> dailyBackupsToKeep,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> location,
        @Nullable Output<Integer> monthlyBackupsToKeep,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<VolumeBackupsArgs>> volumeBackups,
        @Nullable Output<Integer> volumesAssigned,
        @Nullable Output<Integer> weeklyBackupsToKeep,
        @Nullable Output<Integer> yearlyBackupsToKeep) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.backupPolicyName = backupPolicyName;
        this.dailyBackupsToKeep = dailyBackupsToKeep;
        this.enabled = enabled;
        this.location = location;
        this.monthlyBackupsToKeep = monthlyBackupsToKeep;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.volumeBackups = volumeBackups;
        this.volumesAssigned = volumesAssigned;
        this.weeklyBackupsToKeep = weeklyBackupsToKeep;
        this.yearlyBackupsToKeep = yearlyBackupsToKeep;
    }

    private BackupPolicyArgs() {
        this.accountName = Output.empty();
        this.backupPolicyName = Output.empty();
        this.dailyBackupsToKeep = Output.empty();
        this.enabled = Output.empty();
        this.location = Output.empty();
        this.monthlyBackupsToKeep = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.volumeBackups = Output.empty();
        this.volumesAssigned = Output.empty();
        this.weeklyBackupsToKeep = Output.empty();
        this.yearlyBackupsToKeep = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> backupPolicyName;
        private @Nullable Output<Integer> dailyBackupsToKeep;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> location;
        private @Nullable Output<Integer> monthlyBackupsToKeep;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<VolumeBackupsArgs>> volumeBackups;
        private @Nullable Output<Integer> volumesAssigned;
        private @Nullable Output<Integer> weeklyBackupsToKeep;
        private @Nullable Output<Integer> yearlyBackupsToKeep;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.backupPolicyName = defaults.backupPolicyName;
    	      this.dailyBackupsToKeep = defaults.dailyBackupsToKeep;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.monthlyBackupsToKeep = defaults.monthlyBackupsToKeep;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.volumeBackups = defaults.volumeBackups;
    	      this.volumesAssigned = defaults.volumesAssigned;
    	      this.weeklyBackupsToKeep = defaults.weeklyBackupsToKeep;
    	      this.yearlyBackupsToKeep = defaults.yearlyBackupsToKeep;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder backupPolicyName(@Nullable Output<String> backupPolicyName) {
            this.backupPolicyName = backupPolicyName;
            return this;
        }
        public Builder backupPolicyName(@Nullable String backupPolicyName) {
            this.backupPolicyName = Output.ofNullable(backupPolicyName);
            return this;
        }
        public Builder dailyBackupsToKeep(@Nullable Output<Integer> dailyBackupsToKeep) {
            this.dailyBackupsToKeep = dailyBackupsToKeep;
            return this;
        }
        public Builder dailyBackupsToKeep(@Nullable Integer dailyBackupsToKeep) {
            this.dailyBackupsToKeep = Output.ofNullable(dailyBackupsToKeep);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder monthlyBackupsToKeep(@Nullable Output<Integer> monthlyBackupsToKeep) {
            this.monthlyBackupsToKeep = monthlyBackupsToKeep;
            return this;
        }
        public Builder monthlyBackupsToKeep(@Nullable Integer monthlyBackupsToKeep) {
            this.monthlyBackupsToKeep = Output.ofNullable(monthlyBackupsToKeep);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder volumeBackups(@Nullable Output<List<VolumeBackupsArgs>> volumeBackups) {
            this.volumeBackups = volumeBackups;
            return this;
        }
        public Builder volumeBackups(@Nullable List<VolumeBackupsArgs> volumeBackups) {
            this.volumeBackups = Output.ofNullable(volumeBackups);
            return this;
        }
        public Builder volumeBackups(VolumeBackupsArgs... volumeBackups) {
            return volumeBackups(List.of(volumeBackups));
        }
        public Builder volumesAssigned(@Nullable Output<Integer> volumesAssigned) {
            this.volumesAssigned = volumesAssigned;
            return this;
        }
        public Builder volumesAssigned(@Nullable Integer volumesAssigned) {
            this.volumesAssigned = Output.ofNullable(volumesAssigned);
            return this;
        }
        public Builder weeklyBackupsToKeep(@Nullable Output<Integer> weeklyBackupsToKeep) {
            this.weeklyBackupsToKeep = weeklyBackupsToKeep;
            return this;
        }
        public Builder weeklyBackupsToKeep(@Nullable Integer weeklyBackupsToKeep) {
            this.weeklyBackupsToKeep = Output.ofNullable(weeklyBackupsToKeep);
            return this;
        }
        public Builder yearlyBackupsToKeep(@Nullable Output<Integer> yearlyBackupsToKeep) {
            this.yearlyBackupsToKeep = yearlyBackupsToKeep;
            return this;
        }
        public Builder yearlyBackupsToKeep(@Nullable Integer yearlyBackupsToKeep) {
            this.yearlyBackupsToKeep = Output.ofNullable(yearlyBackupsToKeep);
            return this;
        }        public BackupPolicyArgs build() {
            return new BackupPolicyArgs(accountName, backupPolicyName, dailyBackupsToKeep, enabled, location, monthlyBackupsToKeep, resourceGroupName, tags, volumeBackups, volumesAssigned, weeklyBackupsToKeep, yearlyBackupsToKeep);
        }
    }
}
