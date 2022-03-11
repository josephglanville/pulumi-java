// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.enums.ScheduleFrequency;
import io.pulumi.azurenative.automation.inputs.AdvancedScheduleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * Gets or sets the AdvancedSchedule.
     * 
     */
    @InputImport(name="advancedSchedule")
      private final @Nullable Output<AdvancedScheduleArgs> advancedSchedule;

    public Output<AdvancedScheduleArgs> getAdvancedSchedule() {
        return this.advancedSchedule == null ? Output.empty() : this.advancedSchedule;
    }

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the description of the schedule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Gets or sets the end time of the schedule.
     * 
     */
    @InputImport(name="expiryTime")
      private final @Nullable Output<String> expiryTime;

    public Output<String> getExpiryTime() {
        return this.expiryTime == null ? Output.empty() : this.expiryTime;
    }

    /**
     * Gets or sets the frequency of the schedule.
     * 
     */
    @InputImport(name="frequency", required=true)
      private final Output<Either<String,ScheduleFrequency>> frequency;

    public Output<Either<String,ScheduleFrequency>> getFrequency() {
        return this.frequency;
    }

    /**
     * Gets or sets the interval of the schedule.
     * 
     */
    @InputImport(name="interval")
      private final @Nullable Output<Object> interval;

    public Output<Object> getInterval() {
        return this.interval == null ? Output.empty() : this.interval;
    }

    /**
     * Gets or sets the name of the Schedule.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The schedule name.
     * 
     */
    @InputImport(name="scheduleName")
      private final @Nullable Output<String> scheduleName;

    public Output<String> getScheduleName() {
        return this.scheduleName == null ? Output.empty() : this.scheduleName;
    }

    /**
     * Gets or sets the start time of the schedule.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    /**
     * Gets or sets the time zone of the schedule.
     * 
     */
    @InputImport(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public ScheduleArgs(
        @Nullable Output<AdvancedScheduleArgs> advancedSchedule,
        Output<String> automationAccountName,
        @Nullable Output<String> description,
        @Nullable Output<String> expiryTime,
        Output<Either<String,ScheduleFrequency>> frequency,
        @Nullable Output<Object> interval,
        Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> scheduleName,
        Output<String> startTime,
        @Nullable Output<String> timeZone) {
        this.advancedSchedule = advancedSchedule;
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.description = description;
        this.expiryTime = expiryTime;
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.interval = interval;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scheduleName = scheduleName;
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.timeZone = timeZone;
    }

    private ScheduleArgs() {
        this.advancedSchedule = Output.empty();
        this.automationAccountName = Output.empty();
        this.description = Output.empty();
        this.expiryTime = Output.empty();
        this.frequency = Output.empty();
        this.interval = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.scheduleName = Output.empty();
        this.startTime = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AdvancedScheduleArgs> advancedSchedule;
        private Output<String> automationAccountName;
        private @Nullable Output<String> description;
        private @Nullable Output<String> expiryTime;
        private Output<Either<String,ScheduleFrequency>> frequency;
        private @Nullable Output<Object> interval;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> scheduleName;
        private Output<String> startTime;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSchedule = defaults.advancedSchedule;
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.description = defaults.description;
    	      this.expiryTime = defaults.expiryTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scheduleName = defaults.scheduleName;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder advancedSchedule(@Nullable Output<AdvancedScheduleArgs> advancedSchedule) {
            this.advancedSchedule = advancedSchedule;
            return this;
        }

        public Builder advancedSchedule(@Nullable AdvancedScheduleArgs advancedSchedule) {
            this.advancedSchedule = Output.ofNullable(advancedSchedule);
            return this;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder expiryTime(@Nullable Output<String> expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder expiryTime(@Nullable String expiryTime) {
            this.expiryTime = Output.ofNullable(expiryTime);
            return this;
        }

        public Builder frequency(Output<Either<String,ScheduleFrequency>> frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder frequency(Either<String,ScheduleFrequency> frequency) {
            this.frequency = Output.of(Objects.requireNonNull(frequency));
            return this;
        }

        public Builder interval(@Nullable Output<Object> interval) {
            this.interval = interval;
            return this;
        }

        public Builder interval(@Nullable Object interval) {
            this.interval = Output.ofNullable(interval);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
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

        public Builder scheduleName(@Nullable Output<String> scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }

        public Builder scheduleName(@Nullable String scheduleName) {
            this.scheduleName = Output.ofNullable(scheduleName);
            return this;
        }

        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }
        public ScheduleArgs build() {
            return new ScheduleArgs(advancedSchedule, automationAccountName, description, expiryTime, frequency, interval, name, resourceGroupName, scheduleName, startTime, timeZone);
        }
    }
}
