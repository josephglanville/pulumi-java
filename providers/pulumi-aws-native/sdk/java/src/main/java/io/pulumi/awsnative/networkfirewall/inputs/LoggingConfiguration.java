// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationLogDestinationConfig;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class LoggingConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfiguration Empty = new LoggingConfiguration();

    @Import(name="logDestinationConfigs", required=true)
      private final List<LoggingConfigurationLogDestinationConfig> logDestinationConfigs;

    public List<LoggingConfigurationLogDestinationConfig> getLogDestinationConfigs() {
        return this.logDestinationConfigs;
    }

    public LoggingConfiguration(List<LoggingConfigurationLogDestinationConfig> logDestinationConfigs) {
        this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs, "expected parameter 'logDestinationConfigs' to be non-null");
    }

    private LoggingConfiguration() {
        this.logDestinationConfigs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LoggingConfigurationLogDestinationConfig> logDestinationConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestinationConfigs = defaults.logDestinationConfigs;
        }

        public Builder logDestinationConfigs(List<LoggingConfigurationLogDestinationConfig> logDestinationConfigs) {
            this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs);
            return this;
        }
        public Builder logDestinationConfigs(LoggingConfigurationLogDestinationConfig... logDestinationConfigs) {
            return logDestinationConfigs(List.of(logDestinationConfigs));
        }        public LoggingConfiguration build() {
            return new LoggingConfiguration(logDestinationConfigs);
        }
    }
}
