// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogSubscriptionFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogSubscriptionFilterArgs Empty = new LogSubscriptionFilterArgs();

    /**
     * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
     * 
     */
    @Import(name="destinationArn", required=true)
      private final Output<String> destinationArn;

    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
     * 
     */
    @Import(name="distribution")
      private final @Nullable Output<String> distribution;

    public Output<String> getDistribution() {
        return this.distribution == null ? Output.empty() : this.distribution;
    }

    /**
     * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
     * 
     */
    @Import(name="filterPattern", required=true)
      private final Output<String> filterPattern;

    public Output<String> getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * The name of the log group to associate the subscription filter with
     * 
     */
    @Import(name="logGroup", required=true)
      private final Output<String> logGroup;

    public Output<String> getLogGroup() {
        return this.logGroup;
    }

    /**
     * A name for the subscription filter
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    public LogSubscriptionFilterArgs(
        Output<String> destinationArn,
        @Nullable Output<String> distribution,
        Output<String> filterPattern,
        Output<String> logGroup,
        @Nullable Output<String> name,
        @Nullable Output<String> roleArn) {
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.distribution = distribution;
        this.filterPattern = Objects.requireNonNull(filterPattern, "expected parameter 'filterPattern' to be non-null");
        this.logGroup = Objects.requireNonNull(logGroup, "expected parameter 'logGroup' to be non-null");
        this.name = name;
        this.roleArn = roleArn;
    }

    private LogSubscriptionFilterArgs() {
        this.destinationArn = Output.empty();
        this.distribution = Output.empty();
        this.filterPattern = Output.empty();
        this.logGroup = Output.empty();
        this.name = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSubscriptionFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationArn;
        private @Nullable Output<String> distribution;
        private Output<String> filterPattern;
        private Output<String> logGroup;
        private @Nullable Output<String> name;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSubscriptionFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.distribution = defaults.distribution;
    	      this.filterPattern = defaults.filterPattern;
    	      this.logGroup = defaults.logGroup;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder destinationArn(Output<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }
        public Builder destinationArn(String destinationArn) {
            this.destinationArn = Output.of(Objects.requireNonNull(destinationArn));
            return this;
        }
        public Builder distribution(@Nullable Output<String> distribution) {
            this.distribution = distribution;
            return this;
        }
        public Builder distribution(@Nullable String distribution) {
            this.distribution = Output.ofNullable(distribution);
            return this;
        }
        public Builder filterPattern(Output<String> filterPattern) {
            this.filterPattern = Objects.requireNonNull(filterPattern);
            return this;
        }
        public Builder filterPattern(String filterPattern) {
            this.filterPattern = Output.of(Objects.requireNonNull(filterPattern));
            return this;
        }
        public Builder logGroup(Output<String> logGroup) {
            this.logGroup = Objects.requireNonNull(logGroup);
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
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }        public LogSubscriptionFilterArgs build() {
            return new LogSubscriptionFilterArgs(destinationArn, distribution, filterPattern, logGroup, name, roleArn);
        }
    }
}
