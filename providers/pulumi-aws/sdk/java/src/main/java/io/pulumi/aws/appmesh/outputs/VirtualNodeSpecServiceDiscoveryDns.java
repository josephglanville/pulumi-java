// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecServiceDiscoveryDns {
    /**
     * The DNS host name for your virtual node.
     * 
     */
    private final String hostname;

    @CustomType.Constructor
    private VirtualNodeSpecServiceDiscoveryDns(@CustomType.Parameter("hostname") String hostname) {
        this.hostname = hostname;
    }

    /**
     * The DNS host name for your virtual node.
     * 
    */
    public String getHostname() {
        return this.hostname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecServiceDiscoveryDns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostname;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecServiceDiscoveryDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
        }

        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }        public VirtualNodeSpecServiceDiscoveryDns build() {
            return new VirtualNodeSpecServiceDiscoveryDns(hostname);
        }
    }
}
