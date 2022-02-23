// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigPubsubDestinationArgs;
import java.util.Objects;


public final class FolderFeedFeedOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderFeedFeedOutputConfigArgs Empty = new FolderFeedFeedOutputConfigArgs();

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pubsubDestination", required=true)
      private final Input<FolderFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination;

    public Input<FolderFeedFeedOutputConfigPubsubDestinationArgs> getPubsubDestination() {
        return this.pubsubDestination;
    }

    public FolderFeedFeedOutputConfigArgs(Input<FolderFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
    }

    private FolderFeedFeedOutputConfigArgs() {
        this.pubsubDestination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderFeedFeedOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FolderFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderFeedFeedOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder setPubsubDestination(Input<FolderFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public Builder setPubsubDestination(FolderFeedFeedOutputConfigPubsubDestinationArgs pubsubDestination) {
            this.pubsubDestination = Input.of(Objects.requireNonNull(pubsubDestination));
            return this;
        }
        public FolderFeedFeedOutputConfigArgs build() {
            return new FolderFeedFeedOutputConfigArgs(pubsubDestination);
        }
    }
}
