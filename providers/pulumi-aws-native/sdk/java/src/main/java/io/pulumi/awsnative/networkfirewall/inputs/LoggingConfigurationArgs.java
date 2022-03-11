// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationLogDestinationConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class LoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationArgs Empty = new LoggingConfigurationArgs();

    @InputImport(name="logDestinationConfigs", required=true)
      private final Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs;

    public Output<List<LoggingConfigurationLogDestinationConfigArgs>> getLogDestinationConfigs() {
        return this.logDestinationConfigs;
    }

    public LoggingConfigurationArgs(Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs) {
        this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs, "expected parameter 'logDestinationConfigs' to be non-null");
    }

    private LoggingConfigurationArgs() {
        this.logDestinationConfigs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestinationConfigs = defaults.logDestinationConfigs;
        }

        public Builder logDestinationConfigs(Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs) {
            this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs);
            return this;
        }

        public Builder logDestinationConfigs(List<LoggingConfigurationLogDestinationConfigArgs> logDestinationConfigs) {
            this.logDestinationConfigs = Output.of(Objects.requireNonNull(logDestinationConfigs));
            return this;
        }
        public LoggingConfigurationArgs build() {
            return new LoggingConfigurationArgs(logDestinationConfigs);
        }
    }
}
