// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs;

import io.pulumi.awsnative.ivs.inputs.StreamKeyTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamKeyArgs Empty = new StreamKeyArgs();

    /**
     * Channel ARN for the stream.
     * 
     */
    @Import(name="channelArn", required=true)
      private final Output<String> channelArn;

    public Output<String> getChannelArn() {
        return this.channelArn;
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<StreamKeyTagArgs>> tags;

    public Output<List<StreamKeyTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public StreamKeyArgs(
        Output<String> channelArn,
        @Nullable Output<List<StreamKeyTagArgs>> tags) {
        this.channelArn = Objects.requireNonNull(channelArn, "expected parameter 'channelArn' to be non-null");
        this.tags = tags;
    }

    private StreamKeyArgs() {
        this.channelArn = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> channelArn;
        private @Nullable Output<List<StreamKeyTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelArn = defaults.channelArn;
    	      this.tags = defaults.tags;
        }

        public Builder channelArn(Output<String> channelArn) {
            this.channelArn = Objects.requireNonNull(channelArn);
            return this;
        }
        public Builder channelArn(String channelArn) {
            this.channelArn = Output.of(Objects.requireNonNull(channelArn));
            return this;
        }
        public Builder tags(@Nullable Output<List<StreamKeyTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<StreamKeyTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(StreamKeyTagArgs... tags) {
            return tags(List.of(tags));
        }        public StreamKeyArgs build() {
            return new StreamKeyArgs(channelArn, tags);
        }
    }
}
