// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrafficMirrorFilterRuleDestinationPortRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorFilterRuleDestinationPortRangeArgs Empty = new TrafficMirrorFilterRuleDestinationPortRangeArgs();

    /**
     * Starting port of the range
     * 
     */
    @Import(name="fromPort")
      private final @Nullable Output<Integer> fromPort;

    public Output<Integer> getFromPort() {
        return this.fromPort == null ? Output.empty() : this.fromPort;
    }

    /**
     * Ending port of the range
     * 
     */
    @Import(name="toPort")
      private final @Nullable Output<Integer> toPort;

    public Output<Integer> getToPort() {
        return this.toPort == null ? Output.empty() : this.toPort;
    }

    public TrafficMirrorFilterRuleDestinationPortRangeArgs(
        @Nullable Output<Integer> fromPort,
        @Nullable Output<Integer> toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    private TrafficMirrorFilterRuleDestinationPortRangeArgs() {
        this.fromPort = Output.empty();
        this.toPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorFilterRuleDestinationPortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> fromPort;
        private @Nullable Output<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficMirrorFilterRuleDestinationPortRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(@Nullable Output<Integer> fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Builder fromPort(@Nullable Integer fromPort) {
            this.fromPort = Output.ofNullable(fromPort);
            return this;
        }
        public Builder toPort(@Nullable Output<Integer> toPort) {
            this.toPort = toPort;
            return this;
        }
        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = Output.ofNullable(toPort);
            return this;
        }        public TrafficMirrorFilterRuleDestinationPortRangeArgs build() {
            return new TrafficMirrorFilterRuleDestinationPortRangeArgs(fromPort, toPort);
        }
    }
}