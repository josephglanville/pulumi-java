// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudasset_v1.inputs.PubsubDestinationResponse;
import java.util.Objects;


/**
 * Output configuration for asset feed destination.
 * 
 */
public final class FeedOutputConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final FeedOutputConfigResponse Empty = new FeedOutputConfigResponse();

    /**
     * Destination on Pub/Sub.
     * 
     */
    @Import(name="pubsubDestination", required=true)
      private final PubsubDestinationResponse pubsubDestination;

    public PubsubDestinationResponse getPubsubDestination() {
        return this.pubsubDestination;
    }

    public FeedOutputConfigResponse(PubsubDestinationResponse pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
    }

    private FeedOutputConfigResponse() {
        this.pubsubDestination = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeedOutputConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PubsubDestinationResponse pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(FeedOutputConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder pubsubDestination(PubsubDestinationResponse pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }        public FeedOutputConfigResponse build() {
            return new FeedOutputConfigResponse(pubsubDestination);
        }
    }
}
