// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.VpnLinkBgpSettingsArgs;
import io.pulumi.azurenative.network.inputs.VpnLinkProviderPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VpnSiteLink Resource.
 * 
 */
public final class VpnSiteLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnSiteLinkArgs Empty = new VpnSiteLinkArgs();

    /**
     * The set of bgp properties.
     * 
     */
    @Import(name="bgpProperties")
      private final @Nullable Output<VpnLinkBgpSettingsArgs> bgpProperties;

    public Output<VpnLinkBgpSettingsArgs> getBgpProperties() {
        return this.bgpProperties == null ? Output.empty() : this.bgpProperties;
    }

    /**
     * FQDN of vpn-site-link.
     * 
     */
    @Import(name="fqdn")
      private final @Nullable Output<String> fqdn;

    public Output<String> getFqdn() {
        return this.fqdn == null ? Output.empty() : this.fqdn;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The ip-address for the vpn-site-link.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * The link provider properties.
     * 
     */
    @Import(name="linkProperties")
      private final @Nullable Output<VpnLinkProviderPropertiesArgs> linkProperties;

    public Output<VpnLinkProviderPropertiesArgs> getLinkProperties() {
        return this.linkProperties == null ? Output.empty() : this.linkProperties;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public VpnSiteLinkArgs(
        @Nullable Output<VpnLinkBgpSettingsArgs> bgpProperties,
        @Nullable Output<String> fqdn,
        @Nullable Output<String> id,
        @Nullable Output<String> ipAddress,
        @Nullable Output<VpnLinkProviderPropertiesArgs> linkProperties,
        @Nullable Output<String> name) {
        this.bgpProperties = bgpProperties;
        this.fqdn = fqdn;
        this.id = id;
        this.ipAddress = ipAddress;
        this.linkProperties = linkProperties;
        this.name = name;
    }

    private VpnSiteLinkArgs() {
        this.bgpProperties = Output.empty();
        this.fqdn = Output.empty();
        this.id = Output.empty();
        this.ipAddress = Output.empty();
        this.linkProperties = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VpnLinkBgpSettingsArgs> bgpProperties;
        private @Nullable Output<String> fqdn;
        private @Nullable Output<String> id;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<VpnLinkProviderPropertiesArgs> linkProperties;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnSiteLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpProperties = defaults.bgpProperties;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.linkProperties = defaults.linkProperties;
    	      this.name = defaults.name;
        }

        public Builder bgpProperties(@Nullable Output<VpnLinkBgpSettingsArgs> bgpProperties) {
            this.bgpProperties = bgpProperties;
            return this;
        }
        public Builder bgpProperties(@Nullable VpnLinkBgpSettingsArgs bgpProperties) {
            this.bgpProperties = Output.ofNullable(bgpProperties);
            return this;
        }
        public Builder fqdn(@Nullable Output<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Output.ofNullable(fqdn);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }
        public Builder linkProperties(@Nullable Output<VpnLinkProviderPropertiesArgs> linkProperties) {
            this.linkProperties = linkProperties;
            return this;
        }
        public Builder linkProperties(@Nullable VpnLinkProviderPropertiesArgs linkProperties) {
            this.linkProperties = Output.ofNullable(linkProperties);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public VpnSiteLinkArgs build() {
            return new VpnSiteLinkArgs(bgpProperties, fqdn, id, ipAddress, linkProperties, name);
        }
    }
}
