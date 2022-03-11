// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringFilterGetArgs Empty = new PacketMirroringFilterGetArgs();

    /**
     * IP CIDR ranges that apply as a filter on the source (ingress) or
     * destination (egress) IP in the IP header. Only IPv4 is supported.
     * 
     */
    @InputImport(name="cidrRanges")
      private final @Nullable Output<List<String>> cidrRanges;

    public Output<List<String>> getCidrRanges() {
        return this.cidrRanges == null ? Output.empty() : this.cidrRanges;
    }

    /**
     * Direction of traffic to mirror.
     * Default value is `BOTH`.
     * Possible values are `INGRESS`, `EGRESS`, and `BOTH`.
     * 
     */
    @InputImport(name="direction")
      private final @Nullable Output<String> direction;

    public Output<String> getDirection() {
        return this.direction == null ? Output.empty() : this.direction;
    }

    /**
     * Protocols that apply as a filter on mirrored traffic.
     * Each value may be one of `tcp`, `udp`, and `icmp`.
     * 
     */
    @InputImport(name="ipProtocols")
      private final @Nullable Output<List<String>> ipProtocols;

    public Output<List<String>> getIpProtocols() {
        return this.ipProtocols == null ? Output.empty() : this.ipProtocols;
    }

    public PacketMirroringFilterGetArgs(
        @Nullable Output<List<String>> cidrRanges,
        @Nullable Output<String> direction,
        @Nullable Output<List<String>> ipProtocols) {
        this.cidrRanges = cidrRanges;
        this.direction = direction;
        this.ipProtocols = ipProtocols;
    }

    private PacketMirroringFilterGetArgs() {
        this.cidrRanges = Output.empty();
        this.direction = Output.empty();
        this.ipProtocols = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cidrRanges;
        private @Nullable Output<String> direction;
        private @Nullable Output<List<String>> ipProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrRanges = defaults.cidrRanges;
    	      this.direction = defaults.direction;
    	      this.ipProtocols = defaults.ipProtocols;
        }

        public Builder cidrRanges(@Nullable Output<List<String>> cidrRanges) {
            this.cidrRanges = cidrRanges;
            return this;
        }

        public Builder cidrRanges(@Nullable List<String> cidrRanges) {
            this.cidrRanges = Output.ofNullable(cidrRanges);
            return this;
        }

        public Builder direction(@Nullable Output<String> direction) {
            this.direction = direction;
            return this;
        }

        public Builder direction(@Nullable String direction) {
            this.direction = Output.ofNullable(direction);
            return this;
        }

        public Builder ipProtocols(@Nullable Output<List<String>> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }

        public Builder ipProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = Output.ofNullable(ipProtocols);
            return this;
        }
        public PacketMirroringFilterGetArgs build() {
            return new PacketMirroringFilterGetArgs(cidrRanges, direction, ipProtocols);
        }
    }
}
