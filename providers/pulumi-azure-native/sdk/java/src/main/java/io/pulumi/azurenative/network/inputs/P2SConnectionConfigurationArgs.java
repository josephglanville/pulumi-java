// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.RoutingConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class P2SConnectionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final P2SConnectionConfigurationArgs Empty = new P2SConnectionConfigurationArgs();

    @InputImport(name="enableInternetSecurity")
    private final @Nullable Input<Boolean> enableInternetSecurity;

    public Input<Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity == null ? Input.empty() : this.enableInternetSecurity;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="routingConfiguration")
    private final @Nullable Input<RoutingConfigurationArgs> routingConfiguration;

    public Input<RoutingConfigurationArgs> getRoutingConfiguration() {
        return this.routingConfiguration == null ? Input.empty() : this.routingConfiguration;
    }

    @InputImport(name="vpnClientAddressPool")
    private final @Nullable Input<AddressSpaceArgs> vpnClientAddressPool;

    public Input<AddressSpaceArgs> getVpnClientAddressPool() {
        return this.vpnClientAddressPool == null ? Input.empty() : this.vpnClientAddressPool;
    }

    public P2SConnectionConfigurationArgs(
        @Nullable Input<Boolean> enableInternetSecurity,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<RoutingConfigurationArgs> routingConfiguration,
        @Nullable Input<AddressSpaceArgs> vpnClientAddressPool) {
        this.enableInternetSecurity = enableInternetSecurity;
        this.id = id;
        this.name = name;
        this.routingConfiguration = routingConfiguration;
        this.vpnClientAddressPool = vpnClientAddressPool;
    }

    private P2SConnectionConfigurationArgs() {
        this.enableInternetSecurity = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.routingConfiguration = Input.empty();
        this.vpnClientAddressPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SConnectionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableInternetSecurity;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<RoutingConfigurationArgs> routingConfiguration;
        private @Nullable Input<AddressSpaceArgs> vpnClientAddressPool;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SConnectionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.vpnClientAddressPool = defaults.vpnClientAddressPool;
        }

        public Builder setEnableInternetSecurity(@Nullable Input<Boolean> enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder setEnableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = Input.ofNullable(enableInternetSecurity);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRoutingConfiguration(@Nullable Input<RoutingConfigurationArgs> routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        public Builder setRoutingConfiguration(@Nullable RoutingConfigurationArgs routingConfiguration) {
            this.routingConfiguration = Input.ofNullable(routingConfiguration);
            return this;
        }

        public Builder setVpnClientAddressPool(@Nullable Input<AddressSpaceArgs> vpnClientAddressPool) {
            this.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }

        public Builder setVpnClientAddressPool(@Nullable AddressSpaceArgs vpnClientAddressPool) {
            this.vpnClientAddressPool = Input.ofNullable(vpnClientAddressPool);
            return this;
        }

        public P2SConnectionConfigurationArgs build() {
            return new P2SConnectionConfigurationArgs(enableInternetSecurity, id, name, routingConfiguration, vpnClientAddressPool);
        }
    }
}
