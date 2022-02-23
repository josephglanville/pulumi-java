// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.LoggingConfigurationLogDestinationConfigLogDestinationType;
import io.pulumi.awsnative.networkfirewall.enums.LoggingConfigurationLogDestinationConfigLogType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;


public final class LoggingConfigurationLogDestinationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationLogDestinationConfigArgs Empty = new LoggingConfigurationLogDestinationConfigArgs();

    /**
     * A key-value pair to configure the logDestinations.
     * 
     */
    @InputImport(name="logDestination", required=true)
      private final Input<Object> logDestination;

    public Input<Object> getLogDestination() {
        return this.logDestination;
    }

    @InputImport(name="logDestinationType", required=true)
      private final Input<LoggingConfigurationLogDestinationConfigLogDestinationType> logDestinationType;

    public Input<LoggingConfigurationLogDestinationConfigLogDestinationType> getLogDestinationType() {
        return this.logDestinationType;
    }

    @InputImport(name="logType", required=true)
      private final Input<LoggingConfigurationLogDestinationConfigLogType> logType;

    public Input<LoggingConfigurationLogDestinationConfigLogType> getLogType() {
        return this.logType;
    }

    public LoggingConfigurationLogDestinationConfigArgs(
        Input<Object> logDestination,
        Input<LoggingConfigurationLogDestinationConfigLogDestinationType> logDestinationType,
        Input<LoggingConfigurationLogDestinationConfigLogType> logType) {
        this.logDestination = Objects.requireNonNull(logDestination, "expected parameter 'logDestination' to be non-null");
        this.logDestinationType = Objects.requireNonNull(logDestinationType, "expected parameter 'logDestinationType' to be non-null");
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private LoggingConfigurationLogDestinationConfigArgs() {
        this.logDestination = Input.empty();
        this.logDestinationType = Input.empty();
        this.logType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationLogDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> logDestination;
        private Input<LoggingConfigurationLogDestinationConfigLogDestinationType> logDestinationType;
        private Input<LoggingConfigurationLogDestinationConfigLogType> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationLogDestinationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logType = defaults.logType;
        }

        public Builder setLogDestination(Input<Object> logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }

        public Builder setLogDestination(Object logDestination) {
            this.logDestination = Input.of(Objects.requireNonNull(logDestination));
            return this;
        }

        public Builder setLogDestinationType(Input<LoggingConfigurationLogDestinationConfigLogDestinationType> logDestinationType) {
            this.logDestinationType = Objects.requireNonNull(logDestinationType);
            return this;
        }

        public Builder setLogDestinationType(LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType) {
            this.logDestinationType = Input.of(Objects.requireNonNull(logDestinationType));
            return this;
        }

        public Builder setLogType(Input<LoggingConfigurationLogDestinationConfigLogType> logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public Builder setLogType(LoggingConfigurationLogDestinationConfigLogType logType) {
            this.logType = Input.of(Objects.requireNonNull(logType));
            return this;
        }
        public LoggingConfigurationLogDestinationConfigArgs build() {
            return new LoggingConfigurationLogDestinationConfigArgs(logDestination, logDestinationType, logType);
        }
    }
}
