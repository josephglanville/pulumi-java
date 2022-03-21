// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineChannelArgs Empty = new PipelineChannelArgs();

    @Import(name="channelName", required=true)
      private final Output<String> channelName;

    public Output<String> getChannelName() {
        return this.channelName;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="next")
      private final @Nullable Output<String> next;

    public Output<String> getNext() {
        return this.next == null ? Output.empty() : this.next;
    }

    public PipelineChannelArgs(
        Output<String> channelName,
        Output<String> name,
        @Nullable Output<String> next) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineChannelArgs() {
        this.channelName = Output.empty();
        this.name = Output.empty();
        this.next = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> channelName;
        private Output<String> name;
        private @Nullable Output<String> next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder channelName(Output<String> channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder channelName(String channelName) {
            this.channelName = Output.of(Objects.requireNonNull(channelName));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder next(@Nullable Output<String> next) {
            this.next = next;
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = Output.ofNullable(next);
            return this;
        }        public PipelineChannelArgs build() {
            return new PipelineChannelArgs(channelName, name, next);
        }
    }
}
