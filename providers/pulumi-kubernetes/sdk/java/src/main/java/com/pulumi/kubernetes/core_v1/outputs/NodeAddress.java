// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodeAddress {
    /**
     * @return The node address.
     * 
     */
    private final String address;
    /**
     * @return Node address type, one of Hostname, ExternalIP or InternalIP.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private NodeAddress(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("type") String type) {
        this.address = address;
        this.type = type;
    }

    /**
     * @return The node address.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Node address type, one of Hostname, ExternalIP or InternalIP.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.type = defaults.type;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public NodeAddress build() {
            return new NodeAddress(address, type);
        }
    }
}
