// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class LoggingConfigurationLoggingConfigurationLogDestinationConfig {
    /**
     * A map describing the logging destination for the chosen `log_destination_type`.
     * * For an Amazon S3 bucket, specify the key `bucketName` with the name of the bucket and optionally specify the key `prefix` with a path.
     * * For a CloudWatch log group, specify the key `logGroup` with the name of the CloudWatch log group.
     * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the name of the delivery stream.
     * 
     */
    private final Map<String,String> logDestination;
    /**
     * The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
     * 
     */
    private final String logDestinationType;
    /**
     * The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
     * 
     */
    private final String logType;

    @OutputCustomType.Constructor
    private LoggingConfigurationLoggingConfigurationLogDestinationConfig(
        @OutputCustomType.Parameter("logDestination") Map<String,String> logDestination,
        @OutputCustomType.Parameter("logDestinationType") String logDestinationType,
        @OutputCustomType.Parameter("logType") String logType) {
        this.logDestination = logDestination;
        this.logDestinationType = logDestinationType;
        this.logType = logType;
    }

    /**
     * A map describing the logging destination for the chosen `log_destination_type`.
     * * For an Amazon S3 bucket, specify the key `bucketName` with the name of the bucket and optionally specify the key `prefix` with a path.
     * * For a CloudWatch log group, specify the key `logGroup` with the name of the CloudWatch log group.
     * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the name of the delivery stream.
     * 
    */
    public Map<String,String> getLogDestination() {
        return this.logDestination;
    }
    /**
     * The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
     * 
    */
    public String getLogDestinationType() {
        return this.logDestinationType;
    }
    /**
     * The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
     * 
    */
    public String getLogType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationLoggingConfigurationLogDestinationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> logDestination;
        private String logDestinationType;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationLoggingConfigurationLogDestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logType = defaults.logType;
        }

        public Builder setLogDestination(Map<String,String> logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }

        public Builder setLogDestinationType(String logDestinationType) {
            this.logDestinationType = Objects.requireNonNull(logDestinationType);
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public LoggingConfigurationLoggingConfigurationLogDestinationConfig build() {
            return new LoggingConfigurationLoggingConfigurationLogDestinationConfig(logDestination, logDestinationType, logType);
        }
    }
}
