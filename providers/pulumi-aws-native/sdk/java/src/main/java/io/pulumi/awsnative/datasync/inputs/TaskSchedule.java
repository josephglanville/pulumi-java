// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the schedule you want your task to use for repeated executions.
 * 
 */
public final class TaskSchedule extends io.pulumi.resources.InvokeArgs {

    public static final TaskSchedule Empty = new TaskSchedule();

    /**
     * A cron expression that specifies when AWS DataSync initiates a scheduled transfer from a source to a destination location
     * 
     */
    @InputImport(name="scheduleExpression", required=true)
      private final String scheduleExpression;

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public TaskSchedule(String scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private TaskSchedule() {
        this.scheduleExpression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public TaskSchedule build() {
            return new TaskSchedule(scheduleExpression);
        }
    }
}
