// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.qldb;

import io.pulumi.awsnative.qldb.inputs.StreamKinesisConfigurationArgs;
import io.pulumi.awsnative.qldb.inputs.StreamTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamArgs Empty = new StreamArgs();

    @Import(name="exclusiveEndTime")
      private final @Nullable Output<String> exclusiveEndTime;

    public Output<String> getExclusiveEndTime() {
        return this.exclusiveEndTime == null ? Output.empty() : this.exclusiveEndTime;
    }

    @Import(name="inclusiveStartTime", required=true)
      private final Output<String> inclusiveStartTime;

    public Output<String> getInclusiveStartTime() {
        return this.inclusiveStartTime;
    }

    @Import(name="kinesisConfiguration", required=true)
      private final Output<StreamKinesisConfigurationArgs> kinesisConfiguration;

    public Output<StreamKinesisConfigurationArgs> getKinesisConfiguration() {
        return this.kinesisConfiguration;
    }

    @Import(name="ledgerName", required=true)
      private final Output<String> ledgerName;

    public Output<String> getLedgerName() {
        return this.ledgerName;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    @Import(name="streamName")
      private final @Nullable Output<String> streamName;

    public Output<String> getStreamName() {
        return this.streamName == null ? Output.empty() : this.streamName;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<StreamTagArgs>> tags;

    public Output<List<StreamTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public StreamArgs(
        @Nullable Output<String> exclusiveEndTime,
        Output<String> inclusiveStartTime,
        Output<StreamKinesisConfigurationArgs> kinesisConfiguration,
        Output<String> ledgerName,
        Output<String> roleArn,
        @Nullable Output<String> streamName,
        @Nullable Output<List<StreamTagArgs>> tags) {
        this.exclusiveEndTime = exclusiveEndTime;
        this.inclusiveStartTime = Objects.requireNonNull(inclusiveStartTime, "expected parameter 'inclusiveStartTime' to be non-null");
        this.kinesisConfiguration = Objects.requireNonNull(kinesisConfiguration, "expected parameter 'kinesisConfiguration' to be non-null");
        this.ledgerName = Objects.requireNonNull(ledgerName, "expected parameter 'ledgerName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.streamName = streamName;
        this.tags = tags;
    }

    private StreamArgs() {
        this.exclusiveEndTime = Output.empty();
        this.inclusiveStartTime = Output.empty();
        this.kinesisConfiguration = Output.empty();
        this.ledgerName = Output.empty();
        this.roleArn = Output.empty();
        this.streamName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exclusiveEndTime;
        private Output<String> inclusiveStartTime;
        private Output<StreamKinesisConfigurationArgs> kinesisConfiguration;
        private Output<String> ledgerName;
        private Output<String> roleArn;
        private @Nullable Output<String> streamName;
        private @Nullable Output<List<StreamTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusiveEndTime = defaults.exclusiveEndTime;
    	      this.inclusiveStartTime = defaults.inclusiveStartTime;
    	      this.kinesisConfiguration = defaults.kinesisConfiguration;
    	      this.ledgerName = defaults.ledgerName;
    	      this.roleArn = defaults.roleArn;
    	      this.streamName = defaults.streamName;
    	      this.tags = defaults.tags;
        }

        public Builder exclusiveEndTime(@Nullable Output<String> exclusiveEndTime) {
            this.exclusiveEndTime = exclusiveEndTime;
            return this;
        }
        public Builder exclusiveEndTime(@Nullable String exclusiveEndTime) {
            this.exclusiveEndTime = Output.ofNullable(exclusiveEndTime);
            return this;
        }
        public Builder inclusiveStartTime(Output<String> inclusiveStartTime) {
            this.inclusiveStartTime = Objects.requireNonNull(inclusiveStartTime);
            return this;
        }
        public Builder inclusiveStartTime(String inclusiveStartTime) {
            this.inclusiveStartTime = Output.of(Objects.requireNonNull(inclusiveStartTime));
            return this;
        }
        public Builder kinesisConfiguration(Output<StreamKinesisConfigurationArgs> kinesisConfiguration) {
            this.kinesisConfiguration = Objects.requireNonNull(kinesisConfiguration);
            return this;
        }
        public Builder kinesisConfiguration(StreamKinesisConfigurationArgs kinesisConfiguration) {
            this.kinesisConfiguration = Output.of(Objects.requireNonNull(kinesisConfiguration));
            return this;
        }
        public Builder ledgerName(Output<String> ledgerName) {
            this.ledgerName = Objects.requireNonNull(ledgerName);
            return this;
        }
        public Builder ledgerName(String ledgerName) {
            this.ledgerName = Output.of(Objects.requireNonNull(ledgerName));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder streamName(@Nullable Output<String> streamName) {
            this.streamName = streamName;
            return this;
        }
        public Builder streamName(@Nullable String streamName) {
            this.streamName = Output.ofNullable(streamName);
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
        public Builder tags(StreamTagArgs... tags) {
            return tags(List.of(tags));
        }        public StreamArgs build() {
            return new StreamArgs(exclusiveEndTime, inclusiveStartTime, kinesisConfiguration, ledgerName, roleArn, streamName, tags);
        }
    }
}
