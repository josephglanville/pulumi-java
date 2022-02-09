// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class NetworkProfileResponseOutboundIPs extends io.pulumi.resources.InvokeArgs {

    public static final NetworkProfileResponseOutboundIPs Empty = new NetworkProfileResponseOutboundIPs();

    @InputImport(name="publicIPs", required=true)
    private final List<String> publicIPs;

    public List<String> getPublicIPs() {
        return this.publicIPs;
    }

    public NetworkProfileResponseOutboundIPs(List<String> publicIPs) {
        this.publicIPs = Objects.requireNonNull(publicIPs, "expected parameter 'publicIPs' to be non-null");
    }

    private NetworkProfileResponseOutboundIPs() {
        this.publicIPs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponseOutboundIPs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> publicIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponseOutboundIPs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPs = defaults.publicIPs;
        }

        public Builder setPublicIPs(List<String> publicIPs) {
            this.publicIPs = Objects.requireNonNull(publicIPs);
            return this;
        }

        public NetworkProfileResponseOutboundIPs build() {
            return new NetworkProfileResponseOutboundIPs(publicIPs);
        }
    }
}
