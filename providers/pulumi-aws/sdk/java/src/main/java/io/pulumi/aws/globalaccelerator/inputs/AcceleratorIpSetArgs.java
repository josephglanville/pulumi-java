// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AcceleratorIpSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AcceleratorIpSetArgs Empty = new AcceleratorIpSetArgs();

    /**
     * A list of IP addresses in the IP address set.
     * 
     */
    @Import(name="ipAddresses")
      private final @Nullable Output<List<String>> ipAddresses;

    public Output<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Output.empty() : this.ipAddresses;
    }

    /**
     * The type of IP addresses included in this IP set.
     * 
     */
    @Import(name="ipFamily")
      private final @Nullable Output<String> ipFamily;

    public Output<String> getIpFamily() {
        return this.ipFamily == null ? Output.empty() : this.ipFamily;
    }

    public AcceleratorIpSetArgs(
        @Nullable Output<List<String>> ipAddresses,
        @Nullable Output<String> ipFamily) {
        this.ipAddresses = ipAddresses;
        this.ipFamily = ipFamily;
    }

    private AcceleratorIpSetArgs() {
        this.ipAddresses = Output.empty();
        this.ipFamily = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorIpSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> ipAddresses;
        private @Nullable Output<String> ipFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorIpSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipFamily = defaults.ipFamily;
        }

        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Output.ofNullable(ipAddresses);
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder ipFamily(@Nullable Output<String> ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }
        public Builder ipFamily(@Nullable String ipFamily) {
            this.ipFamily = Output.ofNullable(ipFamily);
            return this;
        }        public AcceleratorIpSetArgs build() {
            return new AcceleratorIpSetArgs(ipAddresses, ipFamily);
        }
    }
}