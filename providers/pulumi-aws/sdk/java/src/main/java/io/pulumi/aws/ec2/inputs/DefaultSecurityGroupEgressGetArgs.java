// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultSecurityGroupEgressGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSecurityGroupEgressGetArgs Empty = new DefaultSecurityGroupEgressGetArgs();

    /**
     * List of CIDR blocks.
     * 
     */
    @Import(name="cidrBlocks")
      private final @Nullable Output<List<String>> cidrBlocks;

    public Output<List<String>> getCidrBlocks() {
        return this.cidrBlocks == null ? Output.empty() : this.cidrBlocks;
    }

    /**
     * Description of this rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    @Import(name="fromPort", required=true)
      private final Output<Integer> fromPort;

    public Output<Integer> getFromPort() {
        return this.fromPort;
    }

    /**
     * List of IPv6 CIDR blocks.
     * 
     */
    @Import(name="ipv6CidrBlocks")
      private final @Nullable Output<List<String>> ipv6CidrBlocks;

    public Output<List<String>> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? Output.empty() : this.ipv6CidrBlocks;
    }

    /**
     * List of prefix list IDs (for allowing access to VPC endpoints)
     * 
     */
    @Import(name="prefixListIds")
      private final @Nullable Output<List<String>> prefixListIds;

    public Output<List<String>> getPrefixListIds() {
        return this.prefixListIds == null ? Output.empty() : this.prefixListIds;
    }

    /**
     * Protocol. If you select a protocol of "-1" (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to `0`. If not `icmp`, `tcp`, `udp`, or `-1` use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol;
    }

    /**
     * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Output.empty() : this.securityGroups;
    }

    /**
     * Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    @Import(name="self")
      private final @Nullable Output<Boolean> self;

    public Output<Boolean> getSelf() {
        return this.self == null ? Output.empty() : this.self;
    }

    /**
     * End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    @Import(name="toPort", required=true)
      private final Output<Integer> toPort;

    public Output<Integer> getToPort() {
        return this.toPort;
    }

    public DefaultSecurityGroupEgressGetArgs(
        @Nullable Output<List<String>> cidrBlocks,
        @Nullable Output<String> description,
        Output<Integer> fromPort,
        @Nullable Output<List<String>> ipv6CidrBlocks,
        @Nullable Output<List<String>> prefixListIds,
        Output<String> protocol,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<Boolean> self,
        Output<Integer> toPort) {
        this.cidrBlocks = cidrBlocks;
        this.description = description;
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.prefixListIds = prefixListIds;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.securityGroups = securityGroups;
        this.self = self;
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private DefaultSecurityGroupEgressGetArgs() {
        this.cidrBlocks = Output.empty();
        this.description = Output.empty();
        this.fromPort = Output.empty();
        this.ipv6CidrBlocks = Output.empty();
        this.prefixListIds = Output.empty();
        this.protocol = Output.empty();
        this.securityGroups = Output.empty();
        this.self = Output.empty();
        this.toPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSecurityGroupEgressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cidrBlocks;
        private @Nullable Output<String> description;
        private Output<Integer> fromPort;
        private @Nullable Output<List<String>> ipv6CidrBlocks;
        private @Nullable Output<List<String>> prefixListIds;
        private Output<String> protocol;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<Boolean> self;
        private Output<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSecurityGroupEgressGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.description = defaults.description;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.prefixListIds = defaults.prefixListIds;
    	      this.protocol = defaults.protocol;
    	      this.securityGroups = defaults.securityGroups;
    	      this.self = defaults.self;
    	      this.toPort = defaults.toPort;
        }

        public Builder cidrBlocks(@Nullable Output<List<String>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public Builder cidrBlocks(@Nullable List<String> cidrBlocks) {
            this.cidrBlocks = Output.ofNullable(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder fromPort(Output<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder fromPort(Integer fromPort) {
            this.fromPort = Output.of(Objects.requireNonNull(fromPort));
            return this;
        }
        public Builder ipv6CidrBlocks(@Nullable Output<List<String>> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }
        public Builder ipv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = Output.ofNullable(ipv6CidrBlocks);
            return this;
        }
        public Builder ipv6CidrBlocks(String... ipv6CidrBlocks) {
            return ipv6CidrBlocks(List.of(ipv6CidrBlocks));
        }
        public Builder prefixListIds(@Nullable Output<List<String>> prefixListIds) {
            this.prefixListIds = prefixListIds;
            return this;
        }
        public Builder prefixListIds(@Nullable List<String> prefixListIds) {
            this.prefixListIds = Output.ofNullable(prefixListIds);
            return this;
        }
        public Builder prefixListIds(String... prefixListIds) {
            return prefixListIds(List.of(prefixListIds));
        }
        public Builder protocol(Output<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Output.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder self(@Nullable Output<Boolean> self) {
            this.self = self;
            return this;
        }
        public Builder self(@Nullable Boolean self) {
            this.self = Output.ofNullable(self);
            return this;
        }
        public Builder toPort(Output<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public Builder toPort(Integer toPort) {
            this.toPort = Output.of(Objects.requireNonNull(toPort));
            return this;
        }        public DefaultSecurityGroupEgressGetArgs build() {
            return new DefaultSecurityGroupEgressGetArgs(cidrBlocks, description, fromPort, ipv6CidrBlocks, prefixListIds, protocol, securityGroups, self, toPort);
        }
    }
}