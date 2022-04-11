// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointKinesisStreamConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RealtimeLogConfigEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigEndpointArgs Empty = new RealtimeLogConfigEndpointArgs();

    /**
     * The Amazon Kinesis data stream configuration.
     * 
     */
    @Import(name="kinesisStreamConfig", required=true)
      private final Output<RealtimeLogConfigEndpointKinesisStreamConfigArgs> kinesisStreamConfig;

    public Output<RealtimeLogConfigEndpointKinesisStreamConfigArgs> getKinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }

    /**
     * The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    @Import(name="streamType", required=true)
      private final Output<String> streamType;

    public Output<String> getStreamType() {
        return this.streamType;
    }

    public RealtimeLogConfigEndpointArgs(
        Output<RealtimeLogConfigEndpointKinesisStreamConfigArgs> kinesisStreamConfig,
        Output<String> streamType) {
        this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig, "expected parameter 'kinesisStreamConfig' to be non-null");
        this.streamType = Objects.requireNonNull(streamType, "expected parameter 'streamType' to be non-null");
    }

    private RealtimeLogConfigEndpointArgs() {
        this.kinesisStreamConfig = Codegen.empty();
        this.streamType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RealtimeLogConfigEndpointKinesisStreamConfigArgs> kinesisStreamConfig;
        private Output<String> streamType;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamConfig = defaults.kinesisStreamConfig;
    	      this.streamType = defaults.streamType;
        }

        public Builder kinesisStreamConfig(Output<RealtimeLogConfigEndpointKinesisStreamConfigArgs> kinesisStreamConfig) {
            this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig);
            return this;
        }
        public Builder kinesisStreamConfig(RealtimeLogConfigEndpointKinesisStreamConfigArgs kinesisStreamConfig) {
            this.kinesisStreamConfig = Output.of(Objects.requireNonNull(kinesisStreamConfig));
            return this;
        }
        public Builder streamType(Output<String> streamType) {
            this.streamType = Objects.requireNonNull(streamType);
            return this;
        }
        public Builder streamType(String streamType) {
            this.streamType = Output.of(Objects.requireNonNull(streamType));
            return this;
        }        public RealtimeLogConfigEndpointArgs build() {
            return new RealtimeLogConfigEndpointArgs(kinesisStreamConfig, streamType);
        }
    }
}
