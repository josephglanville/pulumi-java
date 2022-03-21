// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudtasks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideGetArgs;
import io.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsGetArgs;
import io.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigGetArgs;
import io.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueState extends io.pulumi.resources.ResourceArgs {

    public static final QueueState Empty = new QueueState();

    /**
     * Overrides for task-level appEngineRouting. These settings apply only
     * to App Engine tasks in this queue
     * Structure is documented below.
     * 
     */
    @Import(name="appEngineRoutingOverride")
      private final @Nullable Output<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride;

    public Output<QueueAppEngineRoutingOverrideGetArgs> getAppEngineRoutingOverride() {
        return this.appEngineRoutingOverride == null ? Output.empty() : this.appEngineRoutingOverride;
    }

    /**
     * The location of the queue
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The queue name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Rate limits for task dispatches.
     * The queue's actual dispatch rate is the result of:
     * * Number of tasks in the queue
     * * User-specified throttling: rateLimits, retryConfig, and the queue's state.
     * * System throttling due to 429 (Too Many Requests) or 503 (Service
     *   Unavailable) responses from the worker, high error rates, or to
     *   smooth sudden large traffic spikes.
     *   Structure is documented below.
     * 
     */
    @Import(name="rateLimits")
      private final @Nullable Output<QueueRateLimitsGetArgs> rateLimits;

    public Output<QueueRateLimitsGetArgs> getRateLimits() {
        return this.rateLimits == null ? Output.empty() : this.rateLimits;
    }

    /**
     * Settings that determine the retry behavior.
     * Structure is documented below.
     * 
     */
    @Import(name="retryConfig")
      private final @Nullable Output<QueueRetryConfigGetArgs> retryConfig;

    public Output<QueueRetryConfigGetArgs> getRetryConfig() {
        return this.retryConfig == null ? Output.empty() : this.retryConfig;
    }

    /**
     * Configuration options for writing logs to Stackdriver Logging.
     * Structure is documented below.
     * 
     */
    @Import(name="stackdriverLoggingConfig")
      private final @Nullable Output<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig;

    public Output<QueueStackdriverLoggingConfigGetArgs> getStackdriverLoggingConfig() {
        return this.stackdriverLoggingConfig == null ? Output.empty() : this.stackdriverLoggingConfig;
    }

    public QueueState(
        @Nullable Output<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<QueueRateLimitsGetArgs> rateLimits,
        @Nullable Output<QueueRetryConfigGetArgs> retryConfig,
        @Nullable Output<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig) {
        this.appEngineRoutingOverride = appEngineRoutingOverride;
        this.location = location;
        this.name = name;
        this.project = project;
        this.rateLimits = rateLimits;
        this.retryConfig = retryConfig;
        this.stackdriverLoggingConfig = stackdriverLoggingConfig;
    }

    private QueueState() {
        this.appEngineRoutingOverride = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.rateLimits = Output.empty();
        this.retryConfig = Output.empty();
        this.stackdriverLoggingConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<QueueRateLimitsGetArgs> rateLimits;
        private @Nullable Output<QueueRetryConfigGetArgs> retryConfig;
        private @Nullable Output<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRoutingOverride = defaults.appEngineRoutingOverride;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rateLimits = defaults.rateLimits;
    	      this.retryConfig = defaults.retryConfig;
    	      this.stackdriverLoggingConfig = defaults.stackdriverLoggingConfig;
        }

        public Builder appEngineRoutingOverride(@Nullable Output<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride) {
            this.appEngineRoutingOverride = appEngineRoutingOverride;
            return this;
        }
        public Builder appEngineRoutingOverride(@Nullable QueueAppEngineRoutingOverrideGetArgs appEngineRoutingOverride) {
            this.appEngineRoutingOverride = Output.ofNullable(appEngineRoutingOverride);
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
        public Builder rateLimits(@Nullable Output<QueueRateLimitsGetArgs> rateLimits) {
            this.rateLimits = rateLimits;
            return this;
        }
        public Builder rateLimits(@Nullable QueueRateLimitsGetArgs rateLimits) {
            this.rateLimits = Output.ofNullable(rateLimits);
            return this;
        }
        public Builder retryConfig(@Nullable Output<QueueRetryConfigGetArgs> retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }
        public Builder retryConfig(@Nullable QueueRetryConfigGetArgs retryConfig) {
            this.retryConfig = Output.ofNullable(retryConfig);
            return this;
        }
        public Builder stackdriverLoggingConfig(@Nullable Output<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig) {
            this.stackdriverLoggingConfig = stackdriverLoggingConfig;
            return this;
        }
        public Builder stackdriverLoggingConfig(@Nullable QueueStackdriverLoggingConfigGetArgs stackdriverLoggingConfig) {
            this.stackdriverLoggingConfig = Output.ofNullable(stackdriverLoggingConfig);
            return this;
        }        public QueueState build() {
            return new QueueState(appEngineRoutingOverride, location, name, project, rateLimits, retryConfig, stackdriverLoggingConfig);
        }
    }
}
