// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.BgpSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocalNetworkGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalNetworkGatewayArgs Empty = new LocalNetworkGatewayArgs();

    @InputImport(name="bgpSettings")
    private final @Nullable Input<BgpSettingsArgs> bgpSettings;

    public Input<BgpSettingsArgs> getBgpSettings() {
        return this.bgpSettings == null ? Input.empty() : this.bgpSettings;
    }

    @InputImport(name="fqdn")
    private final @Nullable Input<String> fqdn;

    public Input<String> getFqdn() {
        return this.fqdn == null ? Input.empty() : this.fqdn;
    }

    @InputImport(name="gatewayIpAddress")
    private final @Nullable Input<String> gatewayIpAddress;

    public Input<String> getGatewayIpAddress() {
        return this.gatewayIpAddress == null ? Input.empty() : this.gatewayIpAddress;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="localNetworkAddressSpace")
    private final @Nullable Input<AddressSpaceArgs> localNetworkAddressSpace;

    public Input<AddressSpaceArgs> getLocalNetworkAddressSpace() {
        return this.localNetworkAddressSpace == null ? Input.empty() : this.localNetworkAddressSpace;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LocalNetworkGatewayArgs(
        @Nullable Input<BgpSettingsArgs> bgpSettings,
        @Nullable Input<String> fqdn,
        @Nullable Input<String> gatewayIpAddress,
        @Nullable Input<String> id,
        @Nullable Input<AddressSpaceArgs> localNetworkAddressSpace,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> tags) {
        this.bgpSettings = bgpSettings;
        this.fqdn = fqdn;
        this.gatewayIpAddress = gatewayIpAddress;
        this.id = id;
        this.localNetworkAddressSpace = localNetworkAddressSpace;
        this.location = location;
        this.tags = tags;
    }

    private LocalNetworkGatewayArgs() {
        this.bgpSettings = Input.empty();
        this.fqdn = Input.empty();
        this.gatewayIpAddress = Input.empty();
        this.id = Input.empty();
        this.localNetworkAddressSpace = Input.empty();
        this.location = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalNetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BgpSettingsArgs> bgpSettings;
        private @Nullable Input<String> fqdn;
        private @Nullable Input<String> gatewayIpAddress;
        private @Nullable Input<String> id;
        private @Nullable Input<AddressSpaceArgs> localNetworkAddressSpace;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalNetworkGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.fqdn = defaults.fqdn;
    	      this.gatewayIpAddress = defaults.gatewayIpAddress;
    	      this.id = defaults.id;
    	      this.localNetworkAddressSpace = defaults.localNetworkAddressSpace;
    	      this.location = defaults.location;
    	      this.tags = defaults.tags;
        }

        public Builder setBgpSettings(@Nullable Input<BgpSettingsArgs> bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }

        public Builder setBgpSettings(@Nullable BgpSettingsArgs bgpSettings) {
            this.bgpSettings = Input.ofNullable(bgpSettings);
            return this;
        }

        public Builder setFqdn(@Nullable Input<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = Input.ofNullable(fqdn);
            return this;
        }

        public Builder setGatewayIpAddress(@Nullable Input<String> gatewayIpAddress) {
            this.gatewayIpAddress = gatewayIpAddress;
            return this;
        }

        public Builder setGatewayIpAddress(@Nullable String gatewayIpAddress) {
            this.gatewayIpAddress = Input.ofNullable(gatewayIpAddress);
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

        public Builder setLocalNetworkAddressSpace(@Nullable Input<AddressSpaceArgs> localNetworkAddressSpace) {
            this.localNetworkAddressSpace = localNetworkAddressSpace;
            return this;
        }

        public Builder setLocalNetworkAddressSpace(@Nullable AddressSpaceArgs localNetworkAddressSpace) {
            this.localNetworkAddressSpace = Input.ofNullable(localNetworkAddressSpace);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public LocalNetworkGatewayArgs build() {
            return new LocalNetworkGatewayArgs(bgpSettings, fqdn, gatewayIpAddress, id, localNetworkAddressSpace, location, tags);
        }
    }
}
