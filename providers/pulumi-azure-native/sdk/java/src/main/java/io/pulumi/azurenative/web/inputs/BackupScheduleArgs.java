// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.FrequencyUnit;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of a backup schedule. Describes how often should be the backup performed and what should be the retention policy.
 * 
 */
public final class BackupScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupScheduleArgs Empty = new BackupScheduleArgs();

    /**
     * How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
     * 
     */
    @InputImport(name="frequencyInterval", required=true)
      private final Output<Integer> frequencyInterval;

    public Output<Integer> getFrequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
     * 
     */
    @InputImport(name="frequencyUnit", required=true)
      private final Output<FrequencyUnit> frequencyUnit;

    public Output<FrequencyUnit> getFrequencyUnit() {
        return this.frequencyUnit;
    }

    /**
     * True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
     * 
     */
    @InputImport(name="keepAtLeastOneBackup", required=true)
      private final Output<Boolean> keepAtLeastOneBackup;

    public Output<Boolean> getKeepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }

    /**
     * After how many days backups should be deleted.
     * 
     */
    @InputImport(name="retentionPeriodInDays", required=true)
      private final Output<Integer> retentionPeriodInDays;

    public Output<Integer> getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * When the schedule should start working.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    public BackupScheduleArgs(
        Output<Integer> frequencyInterval,
        Output<FrequencyUnit> frequencyUnit,
        Output<Boolean> keepAtLeastOneBackup,
        Output<Integer> retentionPeriodInDays,
        @Nullable Output<String> startTime) {
        this.frequencyInterval = frequencyInterval == null ? Output.ofNullable(7) : Objects.requireNonNull(frequencyInterval, "expected parameter 'frequencyInterval' to be non-null");
        this.frequencyUnit = frequencyUnit == null ? Output.ofNullable(io.pulumi.azurenative.web.enums.FrequencyUnit.Day) : Objects.requireNonNull(frequencyUnit, "expected parameter 'frequencyUnit' to be non-null");
        this.keepAtLeastOneBackup = keepAtLeastOneBackup == null ? Output.ofNullable(true) : Objects.requireNonNull(keepAtLeastOneBackup, "expected parameter 'keepAtLeastOneBackup' to be non-null");
        this.retentionPeriodInDays = retentionPeriodInDays == null ? Output.ofNullable(30) : Objects.requireNonNull(retentionPeriodInDays, "expected parameter 'retentionPeriodInDays' to be non-null");
        this.startTime = startTime;
    }

    private BackupScheduleArgs() {
        this.frequencyInterval = Output.empty();
        this.frequencyUnit = Output.empty();
        this.keepAtLeastOneBackup = Output.empty();
        this.retentionPeriodInDays = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> frequencyInterval;
        private Output<FrequencyUnit> frequencyUnit;
        private Output<Boolean> keepAtLeastOneBackup;
        private Output<Integer> retentionPeriodInDays;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInterval = defaults.frequencyInterval;
    	      this.frequencyUnit = defaults.frequencyUnit;
    	      this.keepAtLeastOneBackup = defaults.keepAtLeastOneBackup;
    	      this.retentionPeriodInDays = defaults.retentionPeriodInDays;
    	      this.startTime = defaults.startTime;
        }

        public Builder frequencyInterval(Output<Integer> frequencyInterval) {
            this.frequencyInterval = Objects.requireNonNull(frequencyInterval);
            return this;
        }

        public Builder frequencyInterval(Integer frequencyInterval) {
            this.frequencyInterval = Output.of(Objects.requireNonNull(frequencyInterval));
            return this;
        }

        public Builder frequencyUnit(Output<FrequencyUnit> frequencyUnit) {
            this.frequencyUnit = Objects.requireNonNull(frequencyUnit);
            return this;
        }

        public Builder frequencyUnit(FrequencyUnit frequencyUnit) {
            this.frequencyUnit = Output.of(Objects.requireNonNull(frequencyUnit));
            return this;
        }

        public Builder keepAtLeastOneBackup(Output<Boolean> keepAtLeastOneBackup) {
            this.keepAtLeastOneBackup = Objects.requireNonNull(keepAtLeastOneBackup);
            return this;
        }

        public Builder keepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
            this.keepAtLeastOneBackup = Output.of(Objects.requireNonNull(keepAtLeastOneBackup));
            return this;
        }

        public Builder retentionPeriodInDays(Output<Integer> retentionPeriodInDays) {
            this.retentionPeriodInDays = Objects.requireNonNull(retentionPeriodInDays);
            return this;
        }

        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = Output.of(Objects.requireNonNull(retentionPeriodInDays));
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }
        public BackupScheduleArgs build() {
            return new BackupScheduleArgs(frequencyInterval, frequencyUnit, keepAtLeastOneBackup, retentionPeriodInDays, startTime);
        }
    }
}
