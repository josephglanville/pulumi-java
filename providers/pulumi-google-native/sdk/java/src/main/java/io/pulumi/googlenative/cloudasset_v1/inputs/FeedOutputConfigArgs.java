// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudasset_v1.inputs.PubsubDestinationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Output configuration for asset feed destination.
 * 
 */
public final class FeedOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeedOutputConfigArgs Empty = new FeedOutputConfigArgs();

    /**
     * Destination on Pub/Sub.
     * 
     */
    @Import(name="pubsubDestination")
      private final @Nullable Output<PubsubDestinationArgs> pubsubDestination;

    public Output<PubsubDestinationArgs> getPubsubDestination() {
        return this.pubsubDestination == null ? Output.empty() : this.pubsubDestination;
    }

    public FeedOutputConfigArgs(@Nullable Output<PubsubDestinationArgs> pubsubDestination) {
        this.pubsubDestination = pubsubDestination;
    }

    private FeedOutputConfigArgs() {
        this.pubsubDestination = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeedOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PubsubDestinationArgs> pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(FeedOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder pubsubDestination(@Nullable Output<PubsubDestinationArgs> pubsubDestination) {
            this.pubsubDestination = pubsubDestination;
            return this;
        }
        public Builder pubsubDestination(@Nullable PubsubDestinationArgs pubsubDestination) {
            this.pubsubDestination = Output.ofNullable(pubsubDestination);
            return this;
        }        public FeedOutputConfigArgs build() {
            return new FeedOutputConfigArgs(pubsubDestination);
        }
    }
}
