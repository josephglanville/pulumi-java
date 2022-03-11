// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubArgs;
import java.util.Objects;


public final class ClusterNotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNotificationConfigArgs Empty = new ClusterNotificationConfigArgs();

    /**
     * The pubsub config for the cluster's upgrade notifications.
     * 
     */
    @InputImport(name="pubsub", required=true)
      private final Output<ClusterNotificationConfigPubsubArgs> pubsub;

    public Output<ClusterNotificationConfigPubsubArgs> getPubsub() {
        return this.pubsub;
    }

    public ClusterNotificationConfigArgs(Output<ClusterNotificationConfigPubsubArgs> pubsub) {
        this.pubsub = Objects.requireNonNull(pubsub, "expected parameter 'pubsub' to be non-null");
    }

    private ClusterNotificationConfigArgs() {
        this.pubsub = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ClusterNotificationConfigPubsubArgs> pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder pubsub(Output<ClusterNotificationConfigPubsubArgs> pubsub) {
            this.pubsub = Objects.requireNonNull(pubsub);
            return this;
        }

        public Builder pubsub(ClusterNotificationConfigPubsubArgs pubsub) {
            this.pubsub = Output.of(Objects.requireNonNull(pubsub));
            return this;
        }
        public ClusterNotificationConfigArgs build() {
            return new ClusterNotificationConfigArgs(pubsub);
        }
    }
}
