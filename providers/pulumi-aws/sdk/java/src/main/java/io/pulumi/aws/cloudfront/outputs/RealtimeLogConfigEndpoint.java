// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.RealtimeLogConfigEndpointKinesisStreamConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RealtimeLogConfigEndpoint {
    /**
     * The Amazon Kinesis data stream configuration.
     * 
     */
    private final RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig;
    /**
     * The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    private final String streamType;

    @OutputCustomType.Constructor
    private RealtimeLogConfigEndpoint(
        @OutputCustomType.Parameter("kinesisStreamConfig") RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig,
        @OutputCustomType.Parameter("streamType") String streamType) {
        this.kinesisStreamConfig = kinesisStreamConfig;
        this.streamType = streamType;
    }

    /**
     * The Amazon Kinesis data stream configuration.
     * 
    */
    public RealtimeLogConfigEndpointKinesisStreamConfig getKinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }
    /**
     * The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
    */
    public String getStreamType() {
        return this.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig;
        private String streamType;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamConfig = defaults.kinesisStreamConfig;
    	      this.streamType = defaults.streamType;
        }

        public Builder setKinesisStreamConfig(RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig) {
            this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig);
            return this;
        }

        public Builder setStreamType(String streamType) {
            this.streamType = Objects.requireNonNull(streamType);
            return this;
        }
        public RealtimeLogConfigEndpoint build() {
            return new RealtimeLogConfigEndpoint(kinesisStreamConfig, streamType);
        }
    }
}
