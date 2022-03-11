// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis;

import io.pulumi.awsnative.kinesis.inputs.StreamEncryptionArgs;
import io.pulumi.awsnative.kinesis.inputs.StreamModeDetailsArgs;
import io.pulumi.awsnative.kinesis.inputs.StreamTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamArgs Empty = new StreamArgs();

    /**
     * The name of the Kinesis stream.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     * 
     */
    @InputImport(name="retentionPeriodHours")
      private final @Nullable Output<Integer> retentionPeriodHours;

    public Output<Integer> getRetentionPeriodHours() {
        return this.retentionPeriodHours == null ? Output.empty() : this.retentionPeriodHours;
    }

    /**
     * The number of shards that the stream uses. Required when StreamMode = PROVISIONED is passed.
     * 
     */
    @InputImport(name="shardCount")
      private final @Nullable Output<Integer> shardCount;

    public Output<Integer> getShardCount() {
        return this.shardCount == null ? Output.empty() : this.shardCount;
    }

    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a specified stream.
     * 
     */
    @InputImport(name="streamEncryption")
      private final @Nullable Output<StreamEncryptionArgs> streamEncryption;

    public Output<StreamEncryptionArgs> getStreamEncryption() {
        return this.streamEncryption == null ? Output.empty() : this.streamEncryption;
    }

    /**
     * The mode in which the stream is running.
     * 
     */
    @InputImport(name="streamModeDetails")
      private final @Nullable Output<StreamModeDetailsArgs> streamModeDetails;

    public Output<StreamModeDetailsArgs> getStreamModeDetails() {
        return this.streamModeDetails == null ? Output.empty() : this.streamModeDetails;
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<StreamTagArgs>> tags;

    public Output<List<StreamTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public StreamArgs(
        @Nullable Output<String> name,
        @Nullable Output<Integer> retentionPeriodHours,
        @Nullable Output<Integer> shardCount,
        @Nullable Output<StreamEncryptionArgs> streamEncryption,
        @Nullable Output<StreamModeDetailsArgs> streamModeDetails,
        @Nullable Output<List<StreamTagArgs>> tags) {
        this.name = name;
        this.retentionPeriodHours = retentionPeriodHours;
        this.shardCount = shardCount;
        this.streamEncryption = streamEncryption;
        this.streamModeDetails = streamModeDetails;
        this.tags = tags;
    }

    private StreamArgs() {
        this.name = Output.empty();
        this.retentionPeriodHours = Output.empty();
        this.shardCount = Output.empty();
        this.streamEncryption = Output.empty();
        this.streamModeDetails = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> retentionPeriodHours;
        private @Nullable Output<Integer> shardCount;
        private @Nullable Output<StreamEncryptionArgs> streamEncryption;
        private @Nullable Output<StreamModeDetailsArgs> streamModeDetails;
        private @Nullable Output<List<StreamTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.retentionPeriodHours = defaults.retentionPeriodHours;
    	      this.shardCount = defaults.shardCount;
    	      this.streamEncryption = defaults.streamEncryption;
    	      this.streamModeDetails = defaults.streamModeDetails;
    	      this.tags = defaults.tags;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder retentionPeriodHours(@Nullable Output<Integer> retentionPeriodHours) {
            this.retentionPeriodHours = retentionPeriodHours;
            return this;
        }

        public Builder retentionPeriodHours(@Nullable Integer retentionPeriodHours) {
            this.retentionPeriodHours = Output.ofNullable(retentionPeriodHours);
            return this;
        }

        public Builder shardCount(@Nullable Output<Integer> shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        public Builder shardCount(@Nullable Integer shardCount) {
            this.shardCount = Output.ofNullable(shardCount);
            return this;
        }

        public Builder streamEncryption(@Nullable Output<StreamEncryptionArgs> streamEncryption) {
            this.streamEncryption = streamEncryption;
            return this;
        }

        public Builder streamEncryption(@Nullable StreamEncryptionArgs streamEncryption) {
            this.streamEncryption = Output.ofNullable(streamEncryption);
            return this;
        }

        public Builder streamModeDetails(@Nullable Output<StreamModeDetailsArgs> streamModeDetails) {
            this.streamModeDetails = streamModeDetails;
            return this;
        }

        public Builder streamModeDetails(@Nullable StreamModeDetailsArgs streamModeDetails) {
            this.streamModeDetails = Output.ofNullable(streamModeDetails);
            return this;
        }

        public Builder tags(@Nullable Output<List<StreamTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<StreamTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public StreamArgs build() {
            return new StreamArgs(name, retentionPeriodHours, shardCount, streamEncryption, streamModeDetails, tags);
        }
    }
}
