// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineChannel extends io.pulumi.resources.InvokeArgs {

    public static final PipelineChannel Empty = new PipelineChannel();

    @Import(name="channelName", required=true)
      private final String channelName;

    public String getChannelName() {
        return this.channelName;
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="next")
      private final @Nullable String next;

    public Optional<String> getNext() {
        return this.next == null ? Optional.empty() : Optional.ofNullable(this.next);
    }

    public PipelineChannel(
        String channelName,
        String name,
        @Nullable String next) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineChannel() {
        this.channelName = null;
        this.name = null;
        this.next = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineChannel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelName;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder channelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }        public PipelineChannel build() {
            return new PipelineChannel(channelName, name, next);
        }
    }
}
