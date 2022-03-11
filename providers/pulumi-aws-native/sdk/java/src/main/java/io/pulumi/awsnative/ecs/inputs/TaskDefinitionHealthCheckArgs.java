// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The health check command and associated configuration parameters for the container.
 * 
 */
public final class TaskDefinitionHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionHealthCheckArgs Empty = new TaskDefinitionHealthCheckArgs();

    /**
     * A string array representing the command that the container runs to determine if it is healthy.
     * 
     */
    @InputImport(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> getCommand() {
        return this.command == null ? Output.empty() : this.command;
    }

    /**
     * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The default value is 30 seconds.
     * 
     */
    @InputImport(name="interval")
      private final @Nullable Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval == null ? Output.empty() : this.interval;
    }

    /**
     * The number of times to retry a failed health check before the container is considered unhealthy. You may specify between 1 and 10 retries. The default value is three retries.
     * 
     */
    @InputImport(name="retries")
      private final @Nullable Output<Integer> retries;

    public Output<Integer> getRetries() {
        return this.retries == null ? Output.empty() : this.retries;
    }

    /**
     * The optional grace period within which to provide containers time to bootstrap before failed health checks count towards the maximum number of retries. You may specify between 0 and 300 seconds. The startPeriod is disabled by default.
     * 
     */
    @InputImport(name="startPeriod")
      private final @Nullable Output<Integer> startPeriod;

    public Output<Integer> getStartPeriod() {
        return this.startPeriod == null ? Output.empty() : this.startPeriod;
    }

    /**
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may specify between 2 and 60 seconds. The default value is 5 seconds.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public TaskDefinitionHealthCheckArgs(
        @Nullable Output<List<String>> command,
        @Nullable Output<Integer> interval,
        @Nullable Output<Integer> retries,
        @Nullable Output<Integer> startPeriod,
        @Nullable Output<Integer> timeout) {
        this.command = command;
        this.interval = interval;
        this.retries = retries;
        this.startPeriod = startPeriod;
        this.timeout = timeout;
    }

    private TaskDefinitionHealthCheckArgs() {
        this.command = Output.empty();
        this.interval = Output.empty();
        this.retries = Output.empty();
        this.startPeriod = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> command;
        private @Nullable Output<Integer> interval;
        private @Nullable Output<Integer> retries;
        private @Nullable Output<Integer> startPeriod;
        private @Nullable Output<Integer> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.interval = defaults.interval;
    	      this.retries = defaults.retries;
    	      this.startPeriod = defaults.startPeriod;
    	      this.timeout = defaults.timeout;
        }

        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = Output.ofNullable(command);
            return this;
        }

        public Builder interval(@Nullable Output<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            this.interval = Output.ofNullable(interval);
            return this;
        }

        public Builder retries(@Nullable Output<Integer> retries) {
            this.retries = retries;
            return this;
        }

        public Builder retries(@Nullable Integer retries) {
            this.retries = Output.ofNullable(retries);
            return this;
        }

        public Builder startPeriod(@Nullable Output<Integer> startPeriod) {
            this.startPeriod = startPeriod;
            return this;
        }

        public Builder startPeriod(@Nullable Integer startPeriod) {
            this.startPeriod = Output.ofNullable(startPeriod);
            return this;
        }

        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public TaskDefinitionHealthCheckArgs build() {
            return new TaskDefinitionHealthCheckArgs(command, interval, retries, startPeriod, timeout);
        }
    }
}
