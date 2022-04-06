// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogMetricFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogMetricFilterArgs Empty = new LogMetricFilterArgs();

    /**
     * The name of the log group to associate the metric filter with.
     * 
     */
    @Import(name="logGroupName", required=true)
      private final Output<String> logGroupName;

    public Output<String> getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * A block defining collection of information needed to define how metric data gets emitted. See below.
     * 
     */
    @Import(name="metricTransformation", required=true)
      private final Output<LogMetricFilterMetricTransformationArgs> metricTransformation;

    public Output<LogMetricFilterMetricTransformationArgs> getMetricTransformation() {
        return this.metricTransformation;
    }

    /**
     * A name for the metric filter.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
     * for extracting metric data out of ingested log events.
     * 
     */
    @Import(name="pattern", required=true)
      private final Output<String> pattern;

    public Output<String> getPattern() {
        return this.pattern;
    }

    public LogMetricFilterArgs(
        Output<String> logGroupName,
        Output<LogMetricFilterMetricTransformationArgs> metricTransformation,
        @Nullable Output<String> name,
        Output<String> pattern) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.metricTransformation = Objects.requireNonNull(metricTransformation, "expected parameter 'metricTransformation' to be non-null");
        this.name = name;
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
    }

    private LogMetricFilterArgs() {
        this.logGroupName = Output.empty();
        this.metricTransformation = Output.empty();
        this.name = Output.empty();
        this.pattern = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> logGroupName;
        private Output<LogMetricFilterMetricTransformationArgs> metricTransformation;
        private @Nullable Output<String> name;
        private Output<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.metricTransformation = defaults.metricTransformation;
    	      this.name = defaults.name;
    	      this.pattern = defaults.pattern;
        }

        public Builder logGroupName(Output<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Output.of(Objects.requireNonNull(logGroupName));
            return this;
        }
        public Builder metricTransformation(Output<LogMetricFilterMetricTransformationArgs> metricTransformation) {
            this.metricTransformation = Objects.requireNonNull(metricTransformation);
            return this;
        }
        public Builder metricTransformation(LogMetricFilterMetricTransformationArgs metricTransformation) {
            this.metricTransformation = Output.of(Objects.requireNonNull(metricTransformation));
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
        public Builder pattern(Output<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }
        public Builder pattern(String pattern) {
            this.pattern = Output.of(Objects.requireNonNull(pattern));
            return this;
        }        public LogMetricFilterArgs build() {
            return new LogMetricFilterArgs(logGroupName, metricTransformation, name, pattern);
        }
    }
}