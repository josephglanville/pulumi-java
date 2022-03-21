// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationProfilePreferenceVmBackupResponse {
    /**
     * Instant RP retention policy range in days
     * 
     */
    private final @Nullable Integer instantRpRetentionRangeInDays;
    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    private final @Nullable String retentionPolicy;
    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    private final @Nullable String schedulePolicy;
    /**
     * TimeZone optional input as string. For example: Pacific Standard Time
     * 
     */
    private final @Nullable String timeZone;

    @CustomType.Constructor
    private ConfigurationProfilePreferenceVmBackupResponse(
        @CustomType.Parameter("instantRpRetentionRangeInDays") @Nullable Integer instantRpRetentionRangeInDays,
        @CustomType.Parameter("retentionPolicy") @Nullable String retentionPolicy,
        @CustomType.Parameter("schedulePolicy") @Nullable String schedulePolicy,
        @CustomType.Parameter("timeZone") @Nullable String timeZone) {
        this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
        this.timeZone = timeZone;
    }

    /**
     * Instant RP retention policy range in days
     * 
    */
    public Optional<Integer> getInstantRpRetentionRangeInDays() {
        return Optional.ofNullable(this.instantRpRetentionRangeInDays);
    }
    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
    */
    public Optional<String> getRetentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * Backup schedule specified as part of backup policy.
     * 
    */
    public Optional<String> getSchedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
    }
    /**
     * TimeZone optional input as string. For example: Pacific Standard Time
     * 
    */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfilePreferenceVmBackupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instantRpRetentionRangeInDays;
        private @Nullable String retentionPolicy;
        private @Nullable String schedulePolicy;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfilePreferenceVmBackupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instantRpRetentionRangeInDays = defaults.instantRpRetentionRangeInDays;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder instantRpRetentionRangeInDays(@Nullable Integer instantRpRetentionRangeInDays) {
            this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
            return this;
        }
        public Builder retentionPolicy(@Nullable String retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder schedulePolicy(@Nullable String schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }        public ConfigurationProfilePreferenceVmBackupResponse build() {
            return new ConfigurationProfilePreferenceVmBackupResponse(instantRpRetentionRangeInDays, retentionPolicy, schedulePolicy, timeZone);
        }
    }
}
