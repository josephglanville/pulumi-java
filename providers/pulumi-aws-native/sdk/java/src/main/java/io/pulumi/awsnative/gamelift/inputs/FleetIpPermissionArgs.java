// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.enums.FleetIpPermissionProtocol;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A range of IP addresses and port settings that allow inbound traffic to connect to server processes on an Amazon GameLift hosting resource. New game sessions that are started on the fleet are assigned an IP address/port number combination, which must fall into the fleet's allowed ranges. For fleets created with a custom game server, the ranges reflect the server's game session assignments. For Realtime Servers fleets, Amazon GameLift automatically opens two port ranges, one for TCP messaging and one for UDP, for use by the Realtime servers.
 * 
 */
public final class FleetIpPermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetIpPermissionArgs Empty = new FleetIpPermissionArgs();

    /**
     * A starting value for a range of allowed port numbers.
     * 
     */
    @Import(name="fromPort", required=true)
      private final Output<Integer> fromPort;

    public Output<Integer> getFromPort() {
        return this.fromPort;
    }

    /**
     * A range of allowed IP addresses. This value must be expressed in CIDR notation. Example: "000.000.000.000/[subnet mask]" or optionally the shortened version "0.0.0.0/[subnet mask]".
     * 
     */
    @Import(name="ipRange", required=true)
      private final Output<String> ipRange;

    public Output<String> getIpRange() {
        return this.ipRange;
    }

    /**
     * The network communication protocol used by the fleet.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<FleetIpPermissionProtocol> protocol;

    public Output<FleetIpPermissionProtocol> getProtocol() {
        return this.protocol;
    }

    /**
     * An ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
     * 
     */
    @Import(name="toPort", required=true)
      private final Output<Integer> toPort;

    public Output<Integer> getToPort() {
        return this.toPort;
    }

    public FleetIpPermissionArgs(
        Output<Integer> fromPort,
        Output<String> ipRange,
        Output<FleetIpPermissionProtocol> protocol,
        Output<Integer> toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.ipRange = Objects.requireNonNull(ipRange, "expected parameter 'ipRange' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private FleetIpPermissionArgs() {
        this.fromPort = Output.empty();
        this.ipRange = Output.empty();
        this.protocol = Output.empty();
        this.toPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIpPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> fromPort;
        private Output<String> ipRange;
        private Output<FleetIpPermissionProtocol> protocol;
        private Output<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIpPermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.ipRange = defaults.ipRange;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Output<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder fromPort(Integer fromPort) {
            this.fromPort = Output.of(Objects.requireNonNull(fromPort));
            return this;
        }
        public Builder ipRange(Output<String> ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }
        public Builder ipRange(String ipRange) {
            this.ipRange = Output.of(Objects.requireNonNull(ipRange));
            return this;
        }
        public Builder protocol(Output<FleetIpPermissionProtocol> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(FleetIpPermissionProtocol protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }
        public Builder toPort(Output<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public Builder toPort(Integer toPort) {
            this.toPort = Output.of(Objects.requireNonNull(toPort));
            return this;
        }        public FleetIpPermissionArgs build() {
            return new FleetIpPermissionArgs(fromPort, ipRange, protocol, toPort);
        }
    }
}
