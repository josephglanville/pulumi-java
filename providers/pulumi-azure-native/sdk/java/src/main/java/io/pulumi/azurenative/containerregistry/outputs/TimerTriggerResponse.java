// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TimerTriggerResponse {
    /**
     * The name of the trigger.
     * 
     */
    private final String name;
    /**
     * The CRON expression for the task schedule
     * 
     */
    private final String schedule;
    /**
     * The current status of trigger.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private TimerTriggerResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedule") String schedule,
        @CustomType.Parameter("status") @Nullable String status) {
        this.name = name;
        this.schedule = schedule;
        this.status = status;
    }

    /**
     * The name of the trigger.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The CRON expression for the task schedule
     * 
    */
    public String getSchedule() {
        return this.schedule;
    }
    /**
     * The current status of trigger.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimerTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String schedule;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(TimerTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public TimerTriggerResponse build() {
            return new TimerTriggerResponse(name, schedule, status);
        }
    }
}
