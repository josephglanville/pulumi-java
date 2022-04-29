// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryMirrorRepositoryConfigTriggerSchedule {
    /**
     * @return (Updatable) Valid if type is CUSTOM. Following RFC 5545 recurrence rules, we can specify starting time, occurrence frequency, and interval size. Example for frequency could be DAILY/WEEKLY/HOURLY or any RFC 5545 supported frequency, which is followed by start time of this window.  You can control the start time with BYHOUR, BYMINUTE and BYSECONDS. It is followed by the interval size.
     * 
     */
    private final @Nullable String customSchedule;
    /**
     * @return (Updatable) Different types of trigger schedule: NONE - No automated synchronization schedule. DEFAULT - Trigger schedule is every 30 minutes. CUSTOM - Custom triggering schedule.
     * 
     */
    private final String scheduleType;

    @CustomType.Constructor
    private RepositoryMirrorRepositoryConfigTriggerSchedule(
        @CustomType.Parameter("customSchedule") @Nullable String customSchedule,
        @CustomType.Parameter("scheduleType") String scheduleType) {
        this.customSchedule = customSchedule;
        this.scheduleType = scheduleType;
    }

    /**
     * @return (Updatable) Valid if type is CUSTOM. Following RFC 5545 recurrence rules, we can specify starting time, occurrence frequency, and interval size. Example for frequency could be DAILY/WEEKLY/HOURLY or any RFC 5545 supported frequency, which is followed by start time of this window.  You can control the start time with BYHOUR, BYMINUTE and BYSECONDS. It is followed by the interval size.
     * 
     */
    public Optional<String> customSchedule() {
        return Optional.ofNullable(this.customSchedule);
    }
    /**
     * @return (Updatable) Different types of trigger schedule: NONE - No automated synchronization schedule. DEFAULT - Trigger schedule is every 30 minutes. CUSTOM - Custom triggering schedule.
     * 
     */
    public String scheduleType() {
        return this.scheduleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryMirrorRepositoryConfigTriggerSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customSchedule;
        private String scheduleType;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryMirrorRepositoryConfigTriggerSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSchedule = defaults.customSchedule;
    	      this.scheduleType = defaults.scheduleType;
        }

        public Builder customSchedule(@Nullable String customSchedule) {
            this.customSchedule = customSchedule;
            return this;
        }
        public Builder scheduleType(String scheduleType) {
            this.scheduleType = Objects.requireNonNull(scheduleType);
            return this;
        }        public RepositoryMirrorRepositoryConfigTriggerSchedule build() {
            return new RepositoryMirrorRepositoryConfigTriggerSchedule(customSchedule, scheduleType);
        }
    }
}
