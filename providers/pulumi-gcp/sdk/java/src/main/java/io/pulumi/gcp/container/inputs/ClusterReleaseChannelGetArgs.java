// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ClusterReleaseChannelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterReleaseChannelGetArgs Empty = new ClusterReleaseChannelGetArgs();

    /**
     * The selected release channel.
     * Accepted values are:
     * * UNSPECIFIED: Not set.
     * * RAPID: Weekly upgrade cadence; Early testers and developers who requires new features.
     * * REGULAR: Multiple per month upgrade cadence; Production users who need features not yet offered in the Stable channel.
     * * STABLE: Every few months upgrade cadence; Production users who need stability above all else, and for whom frequent upgrades are too risky.
     * 
     */
    @Import(name="channel", required=true)
      private final Output<String> channel;

    public Output<String> getChannel() {
        return this.channel;
    }

    public ClusterReleaseChannelGetArgs(Output<String> channel) {
        this.channel = Objects.requireNonNull(channel, "expected parameter 'channel' to be non-null");
    }

    private ClusterReleaseChannelGetArgs() {
        this.channel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterReleaseChannelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> channel;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterReleaseChannelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
        }

        public Builder channel(Output<String> channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        public Builder channel(String channel) {
            this.channel = Output.of(Objects.requireNonNull(channel));
            return this;
        }        public ClusterReleaseChannelGetArgs build() {
            return new ClusterReleaseChannelGetArgs(channel);
        }
    }
}
