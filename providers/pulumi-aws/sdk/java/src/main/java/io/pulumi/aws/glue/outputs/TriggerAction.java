// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.TriggerActionNotificationProperty;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerAction {
    /**
     * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
     * 
     */
    private final @Nullable Map<String,String> arguments;
    /**
     * The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
     */
    private final @Nullable String crawlerName;
    /**
     * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
     */
    private final @Nullable String jobName;
    /**
     * Specifies configuration properties of a job run notification. See Notification Property details below.
     * 
     */
    private final @Nullable TriggerActionNotificationProperty notificationProperty;
    /**
     * The name of the Security Configuration structure to be used with this action.
     * 
     */
    private final @Nullable String securityConfiguration;
    /**
     * The job run timeout in minutes. It overrides the timeout value of the job.
     * 
     */
    private final @Nullable Integer timeout;

    @OutputCustomType.Constructor
    private TriggerAction(
        @OutputCustomType.Parameter("arguments") @Nullable Map<String,String> arguments,
        @OutputCustomType.Parameter("crawlerName") @Nullable String crawlerName,
        @OutputCustomType.Parameter("jobName") @Nullable String jobName,
        @OutputCustomType.Parameter("notificationProperty") @Nullable TriggerActionNotificationProperty notificationProperty,
        @OutputCustomType.Parameter("securityConfiguration") @Nullable String securityConfiguration,
        @OutputCustomType.Parameter("timeout") @Nullable Integer timeout) {
        this.arguments = arguments;
        this.crawlerName = crawlerName;
        this.jobName = jobName;
        this.notificationProperty = notificationProperty;
        this.securityConfiguration = securityConfiguration;
        this.timeout = timeout;
    }

    /**
     * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
     * 
    */
    public Map<String,String> getArguments() {
        return this.arguments == null ? Map.of() : this.arguments;
    }
    /**
     * The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
    */
    public Optional<String> getCrawlerName() {
        return Optional.ofNullable(this.crawlerName);
    }
    /**
     * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
    */
    public Optional<String> getJobName() {
        return Optional.ofNullable(this.jobName);
    }
    /**
     * Specifies configuration properties of a job run notification. See Notification Property details below.
     * 
    */
    public Optional<TriggerActionNotificationProperty> getNotificationProperty() {
        return Optional.ofNullable(this.notificationProperty);
    }
    /**
     * The name of the Security Configuration structure to be used with this action.
     * 
    */
    public Optional<String> getSecurityConfiguration() {
        return Optional.ofNullable(this.securityConfiguration);
    }
    /**
     * The job run timeout in minutes. It overrides the timeout value of the job.
     * 
    */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> arguments;
        private @Nullable String crawlerName;
        private @Nullable String jobName;
        private @Nullable TriggerActionNotificationProperty notificationProperty;
        private @Nullable String securityConfiguration;
        private @Nullable Integer timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.crawlerName = defaults.crawlerName;
    	      this.jobName = defaults.jobName;
    	      this.notificationProperty = defaults.notificationProperty;
    	      this.securityConfiguration = defaults.securityConfiguration;
    	      this.timeout = defaults.timeout;
        }

        public Builder setArguments(@Nullable Map<String,String> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setCrawlerName(@Nullable String crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }

        public Builder setJobName(@Nullable String jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder setNotificationProperty(@Nullable TriggerActionNotificationProperty notificationProperty) {
            this.notificationProperty = notificationProperty;
            return this;
        }

        public Builder setSecurityConfiguration(@Nullable String securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public TriggerAction build() {
            return new TriggerAction(arguments, crawlerName, jobName, notificationProperty, securityConfiguration, timeout);
        }
    }
}
