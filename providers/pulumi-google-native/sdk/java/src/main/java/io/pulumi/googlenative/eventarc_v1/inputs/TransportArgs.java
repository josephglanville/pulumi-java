// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.eventarc_v1.inputs.PubsubArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the transport intermediaries created for the trigger to deliver events.
 * 
 */
public final class TransportArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransportArgs Empty = new TransportArgs();

    /**
     * The Pub/Sub topic and subscription used by Eventarc as a transport intermediary.
     * 
     */
    @Import(name="pubsub")
      private final @Nullable Output<PubsubArgs> pubsub;

    public Output<PubsubArgs> getPubsub() {
        return this.pubsub == null ? Codegen.empty() : this.pubsub;
    }

    public TransportArgs(@Nullable Output<PubsubArgs> pubsub) {
        this.pubsub = pubsub;
    }

    private TransportArgs() {
        this.pubsub = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PubsubArgs> pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(TransportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder pubsub(@Nullable Output<PubsubArgs> pubsub) {
            this.pubsub = pubsub;
            return this;
        }
        public Builder pubsub(@Nullable PubsubArgs pubsub) {
            this.pubsub = Codegen.ofNullable(pubsub);
            return this;
        }        public TransportArgs build() {
            return new TransportArgs(pubsub);
        }
    }
}
