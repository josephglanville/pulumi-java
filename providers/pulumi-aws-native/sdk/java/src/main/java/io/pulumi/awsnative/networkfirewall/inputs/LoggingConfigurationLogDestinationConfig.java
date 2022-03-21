// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.LoggingConfigurationLogDestinationConfigLogDestinationType;
import io.pulumi.awsnative.networkfirewall.enums.LoggingConfigurationLogDestinationConfigLogType;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


public final class LoggingConfigurationLogDestinationConfig extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfigurationLogDestinationConfig Empty = new LoggingConfigurationLogDestinationConfig();

    /**
     * A key-value pair to configure the logDestinations.
     * 
     */
    @Import(name="logDestination", required=true)
      private final Object logDestination;

    public Object getLogDestination() {
        return this.logDestination;
    }

    @Import(name="logDestinationType", required=true)
      private final LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType;

    public LoggingConfigurationLogDestinationConfigLogDestinationType getLogDestinationType() {
        return this.logDestinationType;
    }

    @Import(name="logType", required=true)
      private final LoggingConfigurationLogDestinationConfigLogType logType;

    public LoggingConfigurationLogDestinationConfigLogType getLogType() {
        return this.logType;
    }

    public LoggingConfigurationLogDestinationConfig(
        Object logDestination,
        LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType,
        LoggingConfigurationLogDestinationConfigLogType logType) {
        this.logDestination = Objects.requireNonNull(logDestination, "expected parameter 'logDestination' to be non-null");
        this.logDestinationType = Objects.requireNonNull(logDestinationType, "expected parameter 'logDestinationType' to be non-null");
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private LoggingConfigurationLogDestinationConfig() {
        this.logDestination = null;
        this.logDestinationType = null;
        this.logType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationLogDestinationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object logDestination;
        private LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType;
        private LoggingConfigurationLogDestinationConfigLogType logType;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationLogDestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logType = defaults.logType;
        }

        public Builder logDestination(Object logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }
        public Builder logDestinationType(LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType) {
            this.logDestinationType = Objects.requireNonNull(logDestinationType);
            return this;
        }
        public Builder logType(LoggingConfigurationLogDestinationConfigLogType logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }        public LoggingConfigurationLogDestinationConfig build() {
            return new LoggingConfigurationLogDestinationConfig(logDestination, logDestinationType, logType);
        }
    }
}
