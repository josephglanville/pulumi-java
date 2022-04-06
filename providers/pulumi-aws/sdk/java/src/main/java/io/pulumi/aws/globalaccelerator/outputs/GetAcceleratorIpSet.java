// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAcceleratorIpSet {
    private final List<String> ipAddresses;
    private final String ipFamily;

    @CustomType.Constructor
    private GetAcceleratorIpSet(
        @CustomType.Parameter("ipAddresses") List<String> ipAddresses,
        @CustomType.Parameter("ipFamily") String ipFamily) {
        this.ipAddresses = ipAddresses;
        this.ipFamily = ipFamily;
    }

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }
    public String getIpFamily() {
        return this.ipFamily;
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