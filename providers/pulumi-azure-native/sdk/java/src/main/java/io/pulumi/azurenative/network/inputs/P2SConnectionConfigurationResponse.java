// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.inputs.RoutingConfigurationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class P2SConnectionConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final P2SConnectionConfigurationResponse Empty = new P2SConnectionConfigurationResponse();

    @InputImport(name="enableInternetSecurity")
    private final @Nullable Boolean enableInternetSecurity;

    public Optional<Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity == null ? Optional.empty() : Optional.ofNullable(this.enableInternetSecurity);
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="routingConfiguration")
    private final @Nullable RoutingConfigurationResponse routingConfiguration;

    public Optional<RoutingConfigurationResponse> getRoutingConfiguration() {
        return this.routingConfiguration == null ? Optional.empty() : Optional.ofNullable(this.routingConfiguration);
    }

    @InputImport(name="vpnClientAddressPool")
    private final @Nullable AddressSpaceResponse vpnClientAddressPool;

    public Optional<AddressSpaceResponse> getVpnClientAddressPool() {
        return this.vpnClientAddressPool == null ? Optional.empty() : Optional.ofNullable(this.vpnClientAddressPool);
    }

    public P2SConnectionConfigurationResponse(
        @Nullable Boolean enableInternetSecurity,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable RoutingConfigurationResponse routingConfiguration,
        @Nullable AddressSpaceResponse vpnClientAddressPool) {
        this.enableInternetSecurity = enableInternetSecurity;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.routingConfiguration = routingConfiguration;
        this.vpnClientAddressPool = vpnClientAddressPool;
    }

    private P2SConnectionConfigurationResponse() {
        this.enableInternetSecurity = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.routingConfiguration = null;
        this.vpnClientAddressPool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SConnectionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableInternetSecurity;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable RoutingConfigurationResponse routingConfiguration;
        private @Nullable AddressSpaceResponse vpnClientAddressPool;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SConnectionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.vpnClientAddressPool = defaults.vpnClientAddressPool;
        }

        public Builder setEnableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRoutingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        public Builder setVpnClientAddressPool(@Nullable AddressSpaceResponse vpnClientAddressPool) {
            this.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }

        public P2SConnectionConfigurationResponse build() {
            return new P2SConnectionConfigurationResponse(enableInternetSecurity, etag, id, name, provisioningState, routingConfiguration, vpnClientAddressPool);
        }
    }
}
