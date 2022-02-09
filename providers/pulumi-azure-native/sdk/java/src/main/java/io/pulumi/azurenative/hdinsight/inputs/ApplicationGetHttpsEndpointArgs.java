// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationGetHttpsEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGetHttpsEndpointArgs Empty = new ApplicationGetHttpsEndpointArgs();

    @InputImport(name="accessModes")
    private final @Nullable Input<List<String>> accessModes;

    public Input<List<String>> getAccessModes() {
        return this.accessModes == null ? Input.empty() : this.accessModes;
    }

    @InputImport(name="destinationPort")
    private final @Nullable Input<Integer> destinationPort;

    public Input<Integer> getDestinationPort() {
        return this.destinationPort == null ? Input.empty() : this.destinationPort;
    }

    @InputImport(name="disableGatewayAuth")
    private final @Nullable Input<Boolean> disableGatewayAuth;

    public Input<Boolean> getDisableGatewayAuth() {
        return this.disableGatewayAuth == null ? Input.empty() : this.disableGatewayAuth;
    }

    @InputImport(name="privateIPAddress")
    private final @Nullable Input<String> privateIPAddress;

    public Input<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Input.empty() : this.privateIPAddress;
    }

    @InputImport(name="subDomainSuffix")
    private final @Nullable Input<String> subDomainSuffix;

    public Input<String> getSubDomainSuffix() {
        return this.subDomainSuffix == null ? Input.empty() : this.subDomainSuffix;
    }

    public ApplicationGetHttpsEndpointArgs(
        @Nullable Input<List<String>> accessModes,
        @Nullable Input<Integer> destinationPort,
        @Nullable Input<Boolean> disableGatewayAuth,
        @Nullable Input<String> privateIPAddress,
        @Nullable Input<String> subDomainSuffix) {
        this.accessModes = accessModes;
        this.destinationPort = destinationPort;
        this.disableGatewayAuth = disableGatewayAuth;
        this.privateIPAddress = privateIPAddress;
        this.subDomainSuffix = subDomainSuffix;
    }

    private ApplicationGetHttpsEndpointArgs() {
        this.accessModes = Input.empty();
        this.destinationPort = Input.empty();
        this.disableGatewayAuth = Input.empty();
        this.privateIPAddress = Input.empty();
        this.subDomainSuffix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGetHttpsEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accessModes;
        private @Nullable Input<Integer> destinationPort;
        private @Nullable Input<Boolean> disableGatewayAuth;
        private @Nullable Input<String> privateIPAddress;
        private @Nullable Input<String> subDomainSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGetHttpsEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessModes = defaults.accessModes;
    	      this.destinationPort = defaults.destinationPort;
    	      this.disableGatewayAuth = defaults.disableGatewayAuth;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.subDomainSuffix = defaults.subDomainSuffix;
        }

        public Builder setAccessModes(@Nullable Input<List<String>> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        public Builder setAccessModes(@Nullable List<String> accessModes) {
            this.accessModes = Input.ofNullable(accessModes);
            return this;
        }

        public Builder setDestinationPort(@Nullable Input<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder setDestinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Input.ofNullable(destinationPort);
            return this;
        }

        public Builder setDisableGatewayAuth(@Nullable Input<Boolean> disableGatewayAuth) {
            this.disableGatewayAuth = disableGatewayAuth;
            return this;
        }

        public Builder setDisableGatewayAuth(@Nullable Boolean disableGatewayAuth) {
            this.disableGatewayAuth = Input.ofNullable(disableGatewayAuth);
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable Input<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Input.ofNullable(privateIPAddress);
            return this;
        }

        public Builder setSubDomainSuffix(@Nullable Input<String> subDomainSuffix) {
            this.subDomainSuffix = subDomainSuffix;
            return this;
        }

        public Builder setSubDomainSuffix(@Nullable String subDomainSuffix) {
            this.subDomainSuffix = Input.ofNullable(subDomainSuffix);
            return this;
        }

        public ApplicationGetHttpsEndpointArgs build() {
            return new ApplicationGetHttpsEndpointArgs(accessModes, destinationPort, disableGatewayAuth, privateIPAddress, subDomainSuffix);
        }
    }
}
