// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CronJobStatus represents the current state of a cron job.
 * 
 */
public final class CronJobStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final CronJobStatusArgs Empty = new CronJobStatusArgs();

    /**
     * A list of pointers to currently running jobs.
     * 
     */
    @Import(name="active")
      private final @Nullable Output<List<ObjectReferenceArgs>> active;

    public Output<List<ObjectReferenceArgs>> getActive() {
        return this.active == null ? Output.empty() : this.active;
    }

    /**
     * Information when was the last time the job was successfully scheduled.
     * 
     */
    @Import(name="lastScheduleTime")
      private final @Nullable Output<String> lastScheduleTime;

    public Output<String> getLastScheduleTime() {
        return this.lastScheduleTime == null ? Output.empty() : this.lastScheduleTime;
    }

    /**
     * Information when was the last time the job successfully completed.
     * 
     */
    @Import(name="lastSuccessfulTime")
      private final @Nullable Output<String> lastSuccessfulTime;

    public Output<String> getLastSuccessfulTime() {
        return this.lastSuccessfulTime == null ? Output.empty() : this.lastSuccessfulTime;
    }

    public CronJobStatusArgs(
        @Nullable Output<List<ObjectReferenceArgs>> active,
        @Nullable Output<String> lastScheduleTime,
        @Nullable Output<String> lastSuccessfulTime) {
        this.active = active;
        this.lastScheduleTime = lastScheduleTime;
        this.lastSuccessfulTime = lastSuccessfulTime;
    }

    private CronJobStatusArgs() {
        this.active = Output.empty();
        this.lastScheduleTime = Output.empty();
        this.lastSuccessfulTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ObjectReferenceArgs>> active;
        private @Nullable Output<String> lastScheduleTime;
        private @Nullable Output<String> lastSuccessfulTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CronJobStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.lastScheduleTime = defaults.lastScheduleTime;
    	      this.lastSuccessfulTime = defaults.lastSuccessfulTime;
        }

        public Builder active(@Nullable Output<List<ObjectReferenceArgs>> active) {
            this.active = active;
            return this;
        }
        public Builder active(@Nullable List<ObjectReferenceArgs> active) {
            this.active = Output.ofNullable(active);
            return this;
        }
        public Builder active(ObjectReferenceArgs... active) {
            return active(List.of(active));
        }
        public Builder lastScheduleTime(@Nullable Output<String> lastScheduleTime) {
            this.lastScheduleTime = lastScheduleTime;
            return this;
        }
        public Builder lastScheduleTime(@Nullable String lastScheduleTime) {
            this.lastScheduleTime = Output.ofNullable(lastScheduleTime);
            return this;
        }
        public Builder lastSuccessfulTime(@Nullable Output<String> lastSuccessfulTime) {
            this.lastSuccessfulTime = lastSuccessfulTime;
            return this;
        }
        public Builder lastSuccessfulTime(@Nullable String lastSuccessfulTime) {
            this.lastSuccessfulTime = Output.ofNullable(lastSuccessfulTime);
            return this;
        }        public CronJobStatusArgs build() {
            return new CronJobStatusArgs(active, lastScheduleTime, lastSuccessfulTime);
        }
    }
}
