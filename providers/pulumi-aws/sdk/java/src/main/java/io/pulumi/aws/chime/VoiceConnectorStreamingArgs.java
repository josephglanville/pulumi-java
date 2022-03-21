// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VoiceConnectorStreamingArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorStreamingArgs Empty = new VoiceConnectorStreamingArgs();

    /**
     * The retention period, in hours, for the Amazon Kinesis data.
     * 
     */
    @Import(name="dataRetention", required=true)
      private final Output<Integer> dataRetention;

    public Output<Integer> getDataRetention() {
        return this.dataRetention;
    }

    /**
     * When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     * 
     */
    @Import(name="streamingNotificationTargets")
      private final @Nullable Output<List<String>> streamingNotificationTargets;

    public Output<List<String>> getStreamingNotificationTargets() {
        return this.streamingNotificationTargets == null ? Output.empty() : this.streamingNotificationTargets;
    }

    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    @Import(name="voiceConnectorId", required=true)
      private final Output<String> voiceConnectorId;

    public Output<String> getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public VoiceConnectorStreamingArgs(
        Output<Integer> dataRetention,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<List<String>> streamingNotificationTargets,
        Output<String> voiceConnectorId) {
        this.dataRetention = Objects.requireNonNull(dataRetention, "expected parameter 'dataRetention' to be non-null");
        this.disabled = disabled;
        this.streamingNotificationTargets = streamingNotificationTargets;
        this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId, "expected parameter 'voiceConnectorId' to be non-null");
    }

    private VoiceConnectorStreamingArgs() {
        this.dataRetention = Output.empty();
        this.disabled = Output.empty();
        this.streamingNotificationTargets = Output.empty();
        this.voiceConnectorId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorStreamingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> dataRetention;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<List<String>> streamingNotificationTargets;
        private Output<String> voiceConnectorId;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorStreamingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetention = defaults.dataRetention;
    	      this.disabled = defaults.disabled;
    	      this.streamingNotificationTargets = defaults.streamingNotificationTargets;
    	      this.voiceConnectorId = defaults.voiceConnectorId;
        }

        public Builder dataRetention(Output<Integer> dataRetention) {
            this.dataRetention = Objects.requireNonNull(dataRetention);
            return this;
        }
        public Builder dataRetention(Integer dataRetention) {
            this.dataRetention = Output.of(Objects.requireNonNull(dataRetention));
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }
        public Builder streamingNotificationTargets(@Nullable Output<List<String>> streamingNotificationTargets) {
            this.streamingNotificationTargets = streamingNotificationTargets;
            return this;
        }
        public Builder streamingNotificationTargets(@Nullable List<String> streamingNotificationTargets) {
            this.streamingNotificationTargets = Output.ofNullable(streamingNotificationTargets);
            return this;
        }
        public Builder streamingNotificationTargets(String... streamingNotificationTargets) {
            return streamingNotificationTargets(List.of(streamingNotificationTargets));
        }
        public Builder voiceConnectorId(Output<String> voiceConnectorId) {
            this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId);
            return this;
        }
        public Builder voiceConnectorId(String voiceConnectorId) {
            this.voiceConnectorId = Output.of(Objects.requireNonNull(voiceConnectorId));
            return this;
        }        public VoiceConnectorStreamingArgs build() {
            return new VoiceConnectorStreamingArgs(dataRetention, disabled, streamingNotificationTargets, voiceConnectorId);
        }
    }
}
