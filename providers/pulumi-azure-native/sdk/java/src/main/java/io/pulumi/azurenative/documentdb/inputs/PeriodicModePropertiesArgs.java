// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration values for periodic mode backup
 * 
 */
public final class PeriodicModePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeriodicModePropertiesArgs Empty = new PeriodicModePropertiesArgs();

    /**
     * An integer representing the interval in minutes between two backups
     * 
     */
    @Import(name="backupIntervalInMinutes")
      private final @Nullable Output<Integer> backupIntervalInMinutes;

    public Output<Integer> getBackupIntervalInMinutes() {
        return this.backupIntervalInMinutes == null ? Output.empty() : this.backupIntervalInMinutes;
    }

    /**
     * An integer representing the time (in hours) that each backup is retained
     * 
     */
    @Import(name="backupRetentionIntervalInHours")
      private final @Nullable Output<Integer> backupRetentionIntervalInHours;

    public Output<Integer> getBackupRetentionIntervalInHours() {
        return this.backupRetentionIntervalInHours == null ? Output.empty() : this.backupRetentionIntervalInHours;
    }

    public PeriodicModePropertiesArgs(
        @Nullable Output<Integer> backupIntervalInMinutes,
        @Nullable Output<Integer> backupRetentionIntervalInHours) {
        this.backupIntervalInMinutes = backupIntervalInMinutes;
        this.backupRetentionIntervalInHours = backupRetentionIntervalInHours;
    }

    private PeriodicModePropertiesArgs() {
        this.backupIntervalInMinutes = Output.empty();
        this.backupRetentionIntervalInHours = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicModePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> backupIntervalInMinutes;
        private @Nullable Output<Integer> backupRetentionIntervalInHours;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicModePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupIntervalInMinutes = defaults.backupIntervalInMinutes;
    	      this.backupRetentionIntervalInHours = defaults.backupRetentionIntervalInHours;
        }

        public Builder backupIntervalInMinutes(@Nullable Output<Integer> backupIntervalInMinutes) {
            this.backupIntervalInMinutes = backupIntervalInMinutes;
            return this;
        }
        public Builder backupIntervalInMinutes(@Nullable Integer backupIntervalInMinutes) {
            this.backupIntervalInMinutes = Output.ofNullable(backupIntervalInMinutes);
            return this;
        }
        public Builder backupRetentionIntervalInHours(@Nullable Output<Integer> backupRetentionIntervalInHours) {
            this.backupRetentionIntervalInHours = backupRetentionIntervalInHours;
            return this;
        }
        public Builder backupRetentionIntervalInHours(@Nullable Integer backupRetentionIntervalInHours) {
            this.backupRetentionIntervalInHours = Output.ofNullable(backupRetentionIntervalInHours);
            return this;
        }        public PeriodicModePropertiesArgs build() {
            return new PeriodicModePropertiesArgs(backupIntervalInMinutes, backupRetentionIntervalInHours);
        }
    }
}
