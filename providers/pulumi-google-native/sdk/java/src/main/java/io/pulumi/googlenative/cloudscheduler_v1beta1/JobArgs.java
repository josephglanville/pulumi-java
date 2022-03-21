// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudscheduler_v1beta1.inputs.AppEngineHttpTargetArgs;
import io.pulumi.googlenative.cloudscheduler_v1beta1.inputs.HttpTargetArgs;
import io.pulumi.googlenative.cloudscheduler_v1beta1.inputs.PubsubTargetArgs;
import io.pulumi.googlenative.cloudscheduler_v1beta1.inputs.RetryConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * App Engine HTTP target.
     * 
     */
    @Import(name="appEngineHttpTarget")
      private final @Nullable Output<AppEngineHttpTargetArgs> appEngineHttpTarget;

    public Output<AppEngineHttpTargetArgs> getAppEngineHttpTarget() {
        return this.appEngineHttpTarget == null ? Output.empty() : this.appEngineHttpTarget;
    }

    /**
     * The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. * For PubSub targets, this field is ignored.
     * 
     */
    @Import(name="attemptDeadline")
      private final @Nullable Output<String> attemptDeadline;

    public Output<String> getAttemptDeadline() {
        return this.attemptDeadline == null ? Output.empty() : this.attemptDeadline;
    }

    /**
     * Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * HTTP target.
     * 
     */
    @Import(name="httpTarget")
      private final @Nullable Output<HttpTargetArgs> httpTarget;

    public Output<HttpTargetArgs> getHttpTarget() {
        return this.httpTarget == null ? Output.empty() : this.httpTarget;
    }

    /**
     * Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to App Engine targets.
     * 
     */
    @Import(name="legacyAppEngineCron")
      private final @Nullable Output<Boolean> legacyAppEngineCron;

    public Output<Boolean> getLegacyAppEngineCron() {
        return this.legacyAppEngineCron == null ? Output.empty() : this.legacyAppEngineCron;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Pub/Sub target.
     * 
     */
    @Import(name="pubsubTarget")
      private final @Nullable Output<PubsubTargetArgs> pubsubTarget;

    public Output<PubsubTargetArgs> getPubsubTarget() {
        return this.pubsubTarget == null ? Output.empty() : this.pubsubTarget;
    }

    /**
     * Settings that determine the retry behavior.
     * 
     */
    @Import(name="retryConfig")
      private final @Nullable Output<RetryConfigArgs> retryConfig;

    public Output<RetryConfigArgs> getRetryConfig() {
        return this.retryConfig == null ? Output.empty() : this.retryConfig;
    }

    /**
     * Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count > 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public JobArgs(
        @Nullable Output<AppEngineHttpTargetArgs> appEngineHttpTarget,
        @Nullable Output<String> attemptDeadline,
        @Nullable Output<String> description,
        @Nullable Output<HttpTargetArgs> httpTarget,
        @Nullable Output<Boolean> legacyAppEngineCron,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<PubsubTargetArgs> pubsubTarget,
        @Nullable Output<RetryConfigArgs> retryConfig,
        @Nullable Output<String> schedule,
        @Nullable Output<String> timeZone) {
        this.appEngineHttpTarget = appEngineHttpTarget;
        this.attemptDeadline = attemptDeadline;
        this.description = description;
        this.httpTarget = httpTarget;
        this.legacyAppEngineCron = legacyAppEngineCron;
        this.location = location;
        this.name = name;
        this.project = project;
        this.pubsubTarget = pubsubTarget;
        this.retryConfig = retryConfig;
        this.schedule = schedule;
        this.timeZone = timeZone;
    }

    private JobArgs() {
        this.appEngineHttpTarget = Output.empty();
        this.attemptDeadline = Output.empty();
        this.description = Output.empty();
        this.httpTarget = Output.empty();
        this.legacyAppEngineCron = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.pubsubTarget = Output.empty();
        this.retryConfig = Output.empty();
        this.schedule = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppEngineHttpTargetArgs> appEngineHttpTarget;
        private @Nullable Output<String> attemptDeadline;
        private @Nullable Output<String> description;
        private @Nullable Output<HttpTargetArgs> httpTarget;
        private @Nullable Output<Boolean> legacyAppEngineCron;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<PubsubTargetArgs> pubsubTarget;
        private @Nullable Output<RetryConfigArgs> retryConfig;
        private @Nullable Output<String> schedule;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpTarget = defaults.appEngineHttpTarget;
    	      this.attemptDeadline = defaults.attemptDeadline;
    	      this.description = defaults.description;
    	      this.httpTarget = defaults.httpTarget;
    	      this.legacyAppEngineCron = defaults.legacyAppEngineCron;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubTarget = defaults.pubsubTarget;
    	      this.retryConfig = defaults.retryConfig;
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder appEngineHttpTarget(@Nullable Output<AppEngineHttpTargetArgs> appEngineHttpTarget) {
            this.appEngineHttpTarget = appEngineHttpTarget;
            return this;
        }
        public Builder appEngineHttpTarget(@Nullable AppEngineHttpTargetArgs appEngineHttpTarget) {
            this.appEngineHttpTarget = Output.ofNullable(appEngineHttpTarget);
            return this;
        }
        public Builder attemptDeadline(@Nullable Output<String> attemptDeadline) {
            this.attemptDeadline = attemptDeadline;
            return this;
        }
        public Builder attemptDeadline(@Nullable String attemptDeadline) {
            this.attemptDeadline = Output.ofNullable(attemptDeadline);
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
        public Builder httpTarget(@Nullable Output<HttpTargetArgs> httpTarget) {
            this.httpTarget = httpTarget;
            return this;
        }
        public Builder httpTarget(@Nullable HttpTargetArgs httpTarget) {
            this.httpTarget = Output.ofNullable(httpTarget);
            return this;
        }
        public Builder legacyAppEngineCron(@Nullable Output<Boolean> legacyAppEngineCron) {
            this.legacyAppEngineCron = legacyAppEngineCron;
            return this;
        }
        public Builder legacyAppEngineCron(@Nullable Boolean legacyAppEngineCron) {
            this.legacyAppEngineCron = Output.ofNullable(legacyAppEngineCron);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder pubsubTarget(@Nullable Output<PubsubTargetArgs> pubsubTarget) {
            this.pubsubTarget = pubsubTarget;
            return this;
        }
        public Builder pubsubTarget(@Nullable PubsubTargetArgs pubsubTarget) {
            this.pubsubTarget = Output.ofNullable(pubsubTarget);
            return this;
        }
        public Builder retryConfig(@Nullable Output<RetryConfigArgs> retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }
        public Builder retryConfig(@Nullable RetryConfigArgs retryConfig) {
            this.retryConfig = Output.ofNullable(retryConfig);
            return this;
        }
        public Builder schedule(@Nullable Output<String> schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder schedule(@Nullable String schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }        public JobArgs build() {
            return new JobArgs(appEngineHttpTarget, attemptDeadline, description, httpTarget, legacyAppEngineCron, location, name, project, pubsubTarget, retryConfig, schedule, timeZone);
        }
    }
}
