// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.RailsAppLayerCloudwatchConfigurationLogStreamGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RailsAppLayerCloudwatchConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RailsAppLayerCloudwatchConfigurationGetArgs Empty = new RailsAppLayerCloudwatchConfigurationGetArgs();

    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    @Import(name="logStreams")
      private final @Nullable Output<List<RailsAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

    public Output<List<RailsAppLayerCloudwatchConfigurationLogStreamGetArgs>> getLogStreams() {
        return this.logStreams == null ? Output.empty() : this.logStreams;
    }

    public RailsAppLayerCloudwatchConfigurationGetArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<RailsAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private RailsAppLayerCloudwatchConfigurationGetArgs() {
        this.enabled = Output.empty();
        this.logStreams = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RailsAppLayerCloudwatchConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<RailsAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(RailsAppLayerCloudwatchConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder logStreams(@Nullable Output<List<RailsAppLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }
        public Builder logStreams(@Nullable List<RailsAppLayerCloudwatchConfigurationLogStreamGetArgs> logStreams) {
            this.logStreams = Output.ofNullable(logStreams);
            return this;
        }
        public Builder logStreams(RailsAppLayerCloudwatchConfigurationLogStreamGetArgs... logStreams) {
            return logStreams(List.of(logStreams));
        }        public RailsAppLayerCloudwatchConfigurationGetArgs build() {
            return new RailsAppLayerCloudwatchConfigurationGetArgs(enabled, logStreams);
        }
    }
}
