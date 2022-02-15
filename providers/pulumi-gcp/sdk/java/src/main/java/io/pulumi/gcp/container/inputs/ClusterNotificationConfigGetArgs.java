// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubGetArgs;
import java.util.Objects;


public final class ClusterNotificationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNotificationConfigGetArgs Empty = new ClusterNotificationConfigGetArgs();

    @InputImport(name="pubsub", required=true)
    private final Input<ClusterNotificationConfigPubsubGetArgs> pubsub;

    public Input<ClusterNotificationConfigPubsubGetArgs> getPubsub() {
        return this.pubsub;
    }

    public ClusterNotificationConfigGetArgs(Input<ClusterNotificationConfigPubsubGetArgs> pubsub) {
        this.pubsub = Objects.requireNonNull(pubsub, "expected parameter 'pubsub' to be non-null");
    }

    private ClusterNotificationConfigGetArgs() {
        this.pubsub = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNotificationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ClusterNotificationConfigPubsubGetArgs> pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNotificationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder setPubsub(Input<ClusterNotificationConfigPubsubGetArgs> pubsub) {
            this.pubsub = Objects.requireNonNull(pubsub);
            return this;
        }

        public Builder setPubsub(ClusterNotificationConfigPubsubGetArgs pubsub) {
            this.pubsub = Input.of(Objects.requireNonNull(pubsub));
            return this;
        }

        public ClusterNotificationConfigGetArgs build() {
            return new ClusterNotificationConfigGetArgs(pubsub);
        }
    }
}