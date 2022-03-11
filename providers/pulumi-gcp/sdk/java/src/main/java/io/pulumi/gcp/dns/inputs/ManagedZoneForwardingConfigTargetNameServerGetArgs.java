// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneForwardingConfigTargetNameServerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigTargetNameServerGetArgs Empty = new ManagedZoneForwardingConfigTargetNameServerGetArgs();

    /**
     * Forwarding path for this TargetNameServer. If unset or `default` Cloud DNS will make forwarding
     * decision based on address ranges, i.e. RFC1918 addresses go to the VPC, Non-RFC1918 addresses go
     * to the Internet. When set to `private`, Cloud DNS will always send queries through VPC for this target
     * Possible values are `default` and `private`.
     * 
     */
    @InputImport(name="forwardingPath")
      private final @Nullable Output<String> forwardingPath;

    public Output<String> getForwardingPath() {
        return this.forwardingPath == null ? Output.empty() : this.forwardingPath;
    }

    /**
     * IPv4 address of a target name server.
     * 
     */
    @InputImport(name="ipv4Address", required=true)
      private final Output<String> ipv4Address;

    public Output<String> getIpv4Address() {
        return this.ipv4Address;
    }

    public ManagedZoneForwardingConfigTargetNameServerGetArgs(
        @Nullable Output<String> forwardingPath,
        Output<String> ipv4Address) {
        this.forwardingPath = forwardingPath;
        this.ipv4Address = Objects.requireNonNull(ipv4Address, "expected parameter 'ipv4Address' to be non-null");
    }

    private ManagedZoneForwardingConfigTargetNameServerGetArgs() {
        this.forwardingPath = Output.empty();
        this.ipv4Address = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigTargetNameServerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> forwardingPath;
        private Output<String> ipv4Address;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigTargetNameServerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
        }

        public Builder forwardingPath(@Nullable Output<String> forwardingPath) {
            this.forwardingPath = forwardingPath;
            return this;
        }

        public Builder forwardingPath(@Nullable String forwardingPath) {
            this.forwardingPath = Output.ofNullable(forwardingPath);
            return this;
        }

        public Builder ipv4Address(Output<String> ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }

        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Output.of(Objects.requireNonNull(ipv4Address));
            return this;
        }
        public ManagedZoneForwardingConfigTargetNameServerGetArgs build() {
            return new ManagedZoneForwardingConfigTargetNameServerGetArgs(forwardingPath, ipv4Address);
        }
    }
}
