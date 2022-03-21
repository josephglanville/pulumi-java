// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouterApplianceInstanceResponse {
    /**
     * The IP address on the VM to use for peering.
     * 
     */
    private final String ipAddress;
    /**
     * The URI of the VM.
     * 
     */
    private final String virtualMachine;

    @CustomType.Constructor
    private RouterApplianceInstanceResponse(
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("virtualMachine") String virtualMachine) {
        this.ipAddress = ipAddress;
        this.virtualMachine = virtualMachine;
    }

    /**
     * The IP address on the VM to use for peering.
     * 
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * The URI of the VM.
     * 
    */
    public String getVirtualMachine() {
        return this.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterApplianceInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterApplianceInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder virtualMachine(String virtualMachine) {
            this.virtualMachine = Objects.requireNonNull(virtualMachine);
            return this;
        }        public RouterApplianceInstanceResponse build() {
            return new RouterApplianceInstanceResponse(ipAddress, virtualMachine);
        }
    }
}
