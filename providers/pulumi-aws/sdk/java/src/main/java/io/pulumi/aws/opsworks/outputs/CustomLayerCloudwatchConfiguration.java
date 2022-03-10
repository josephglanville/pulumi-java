// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.outputs;

import io.pulumi.aws.opsworks.outputs.CustomLayerCloudwatchConfigurationLogStream;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomLayerCloudwatchConfiguration {
    private final @Nullable Boolean enabled;
    /**
     * A block the specifies how an opsworks logs look like. See Log Streams.
     * 
     */
    private final @Nullable List<CustomLayerCloudwatchConfigurationLogStream> logStreams;

    @OutputCustomType.Constructor
    private CustomLayerCloudwatchConfiguration(
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("logStreams") @Nullable List<CustomLayerCloudwatchConfigurationLogStream> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * A block the specifies how an opsworks logs look like. See Log Streams.
     * 
    */
    public List<CustomLayerCloudwatchConfigurationLogStream> getLogStreams() {
        return this.logStreams == null ? List.of() : this.logStreams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLayerCloudwatchConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<CustomLayerCloudwatchConfigurationLogStream> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLayerCloudwatchConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogStreams(@Nullable List<CustomLayerCloudwatchConfigurationLogStream> logStreams) {
            this.logStreams = logStreams;
            return this;
        }
        public CustomLayerCloudwatchConfiguration build() {
            return new CustomLayerCloudwatchConfiguration(enabled, logStreams);
        }
    }
}
