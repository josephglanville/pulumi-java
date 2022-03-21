// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Gets the application SSH endpoint
 * 
 */
public final class ApplicationGetEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGetEndpointArgs Empty = new ApplicationGetEndpointArgs();

    /**
     * The destination port to connect to.
     * 
     */
    @Import(name="destinationPort")
      private final @Nullable Output<Integer> destinationPort;

    public Output<Integer> getDestinationPort() {
        return this.destinationPort == null ? Output.empty() : this.destinationPort;
    }

    /**
     * The location of the endpoint.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The private ip address of the endpoint.
     * 
     */
    @Import(name="privateIPAddress")
      private final @Nullable Output<String> privateIPAddress;

    public Output<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Output.empty() : this.privateIPAddress;
    }

    /**
     * The public port to connect to.
     * 
     */
    @Import(name="publicPort")
      private final @Nullable Output<Integer> publicPort;

    public Output<Integer> getPublicPort() {
        return this.publicPort == null ? Output.empty() : this.publicPort;
    }

    public ApplicationGetEndpointArgs(
        @Nullable Output<Integer> destinationPort,
        @Nullable Output<String> location,
        @Nullable Output<String> privateIPAddress,
        @Nullable Output<Integer> publicPort) {
        this.destinationPort = destinationPort;
        this.location = location;
        this.privateIPAddress = privateIPAddress;
        this.publicPort = publicPort;
    }

    private ApplicationGetEndpointArgs() {
        this.destinationPort = Output.empty();
        this.location = Output.empty();
        this.privateIPAddress = Output.empty();
        this.publicPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGetEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> destinationPort;
        private @Nullable Output<String> location;
        private @Nullable Output<String> privateIPAddress;
        private @Nullable Output<Integer> publicPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGetEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPort = defaults.destinationPort;
    	      this.location = defaults.location;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicPort = defaults.publicPort;
        }

        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public Builder destinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Output.ofNullable(destinationPort);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder privateIPAddress(@Nullable Output<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }
        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Output.ofNullable(privateIPAddress);
            return this;
        }
        public Builder publicPort(@Nullable Output<Integer> publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public Builder publicPort(@Nullable Integer publicPort) {
            this.publicPort = Output.ofNullable(publicPort);
            return this;
        }        public ApplicationGetEndpointArgs build() {
            return new ApplicationGetEndpointArgs(destinationPort, location, privateIPAddress, publicPort);
        }
    }
}
