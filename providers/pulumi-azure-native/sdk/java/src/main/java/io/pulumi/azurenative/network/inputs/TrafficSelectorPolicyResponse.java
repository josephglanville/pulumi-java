// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An traffic selector policy for a virtual network gateway connection.
 * 
 */
public final class TrafficSelectorPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrafficSelectorPolicyResponse Empty = new TrafficSelectorPolicyResponse();

    /**
     * A collection of local address spaces in CIDR format.
     * 
     */
    @InputImport(name="localAddressRanges", required=true)
      private final List<String> localAddressRanges;

    public List<String> getLocalAddressRanges() {
        return this.localAddressRanges;
    }

    /**
     * A collection of remote address spaces in CIDR format.
     * 
     */
    @InputImport(name="remoteAddressRanges", required=true)
      private final List<String> remoteAddressRanges;

    public List<String> getRemoteAddressRanges() {
        return this.remoteAddressRanges;
    }

    public TrafficSelectorPolicyResponse(
        List<String> localAddressRanges,
        List<String> remoteAddressRanges) {
        this.localAddressRanges = Objects.requireNonNull(localAddressRanges, "expected parameter 'localAddressRanges' to be non-null");
        this.remoteAddressRanges = Objects.requireNonNull(remoteAddressRanges, "expected parameter 'remoteAddressRanges' to be non-null");
    }

    private TrafficSelectorPolicyResponse() {
        this.localAddressRanges = List.of();
        this.remoteAddressRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficSelectorPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> localAddressRanges;
        private List<String> remoteAddressRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficSelectorPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localAddressRanges = defaults.localAddressRanges;
    	      this.remoteAddressRanges = defaults.remoteAddressRanges;
        }

        public Builder setLocalAddressRanges(List<String> localAddressRanges) {
            this.localAddressRanges = Objects.requireNonNull(localAddressRanges);
            return this;
        }

        public Builder setRemoteAddressRanges(List<String> remoteAddressRanges) {
            this.remoteAddressRanges = Objects.requireNonNull(remoteAddressRanges);
            return this;
        }
        public TrafficSelectorPolicyResponse build() {
            return new TrafficSelectorPolicyResponse(localAddressRanges, remoteAddressRanges);
        }
    }
}
