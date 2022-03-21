// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAcceleratorIpSet extends io.pulumi.resources.InvokeArgs {

    public static final GetAcceleratorIpSet Empty = new GetAcceleratorIpSet();

    @Import(name="ipAddresses", required=true)
      private final List<String> ipAddresses;

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    @Import(name="ipFamily", required=true)
      private final String ipFamily;

    public String getIpFamily() {
        return this.ipFamily;
    }

    public GetAcceleratorIpSet(
        List<String> ipAddresses,
        String ipFamily) {
        this.ipAddresses = Objects.requireNonNull(ipAddresses, "expected parameter 'ipAddresses' to be non-null");
        this.ipFamily = Objects.requireNonNull(ipFamily, "expected parameter 'ipFamily' to be non-null");
    }

    private GetAcceleratorIpSet() {
        this.ipAddresses = List.of();
        this.ipFamily = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAcceleratorIpSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ipAddresses;
        private String ipFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAcceleratorIpSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipFamily = defaults.ipFamily;
        }

        public Builder ipAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder ipFamily(String ipFamily) {
            this.ipFamily = Objects.requireNonNull(ipFamily);
            return this;
        }        public GetAcceleratorIpSet build() {
            return new GetAcceleratorIpSet(ipAddresses, ipFamily);
        }
    }
}
