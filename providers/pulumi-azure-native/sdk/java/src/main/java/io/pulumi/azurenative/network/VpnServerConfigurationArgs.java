// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.VpnAuthenticationType;
import io.pulumi.azurenative.network.enums.VpnGatewayTunnelingProtocol;
import io.pulumi.azurenative.network.inputs.AadAuthenticationParametersArgs;
import io.pulumi.azurenative.network.inputs.IpsecPolicyArgs;
import io.pulumi.azurenative.network.inputs.RadiusServerArgs;
import io.pulumi.azurenative.network.inputs.VpnServerConfigRadiusClientRootCertificateArgs;
import io.pulumi.azurenative.network.inputs.VpnServerConfigRadiusServerRootCertificateArgs;
import io.pulumi.azurenative.network.inputs.VpnServerConfigVpnClientRevokedCertificateArgs;
import io.pulumi.azurenative.network.inputs.VpnServerConfigVpnClientRootCertificateArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnServerConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigurationArgs Empty = new VpnServerConfigurationArgs();

    /**
     * The set of aad vpn authentication parameters.
     * 
     */
    @InputImport(name="aadAuthenticationParameters")
      private final @Nullable Output<AadAuthenticationParametersArgs> aadAuthenticationParameters;

    public Output<AadAuthenticationParametersArgs> getAadAuthenticationParameters() {
        return this.aadAuthenticationParameters == null ? Output.empty() : this.aadAuthenticationParameters;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the VpnServerConfiguration that is unique within a resource group.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Radius client root certificate of VpnServerConfiguration.
     * 
     */
    @InputImport(name="radiusClientRootCertificates")
      private final @Nullable Output<List<VpnServerConfigRadiusClientRootCertificateArgs>> radiusClientRootCertificates;

    public Output<List<VpnServerConfigRadiusClientRootCertificateArgs>> getRadiusClientRootCertificates() {
        return this.radiusClientRootCertificates == null ? Output.empty() : this.radiusClientRootCertificates;
    }

    /**
     * The radius server address property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    @InputImport(name="radiusServerAddress")
      private final @Nullable Output<String> radiusServerAddress;

    public Output<String> getRadiusServerAddress() {
        return this.radiusServerAddress == null ? Output.empty() : this.radiusServerAddress;
    }

    /**
     * Radius Server root certificate of VpnServerConfiguration.
     * 
     */
    @InputImport(name="radiusServerRootCertificates")
      private final @Nullable Output<List<VpnServerConfigRadiusServerRootCertificateArgs>> radiusServerRootCertificates;

    public Output<List<VpnServerConfigRadiusServerRootCertificateArgs>> getRadiusServerRootCertificates() {
        return this.radiusServerRootCertificates == null ? Output.empty() : this.radiusServerRootCertificates;
    }

    /**
     * The radius secret property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    @InputImport(name="radiusServerSecret")
      private final @Nullable Output<String> radiusServerSecret;

    public Output<String> getRadiusServerSecret() {
        return this.radiusServerSecret == null ? Output.empty() : this.radiusServerSecret;
    }

    /**
     * Multiple Radius Server configuration for VpnServerConfiguration.
     * 
     */
    @InputImport(name="radiusServers")
      private final @Nullable Output<List<RadiusServerArgs>> radiusServers;

    public Output<List<RadiusServerArgs>> getRadiusServers() {
        return this.radiusServers == null ? Output.empty() : this.radiusServers;
    }

    /**
     * The resource group name of the VpnServerConfiguration.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * VPN authentication types for the VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnAuthenticationTypes")
      private final @Nullable Output<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes;

    public Output<List<Either<String,VpnAuthenticationType>>> getVpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes == null ? Output.empty() : this.vpnAuthenticationTypes;
    }

    /**
     * VpnClientIpsecPolicies for VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnClientIpsecPolicies")
      private final @Nullable Output<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;

    public Output<List<IpsecPolicyArgs>> getVpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies == null ? Output.empty() : this.vpnClientIpsecPolicies;
    }

    /**
     * VPN client revoked certificate of VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnClientRevokedCertificates")
      private final @Nullable Output<List<VpnServerConfigVpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates;

    public Output<List<VpnServerConfigVpnClientRevokedCertificateArgs>> getVpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates == null ? Output.empty() : this.vpnClientRevokedCertificates;
    }

    /**
     * VPN client root certificate of VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnClientRootCertificates")
      private final @Nullable Output<List<VpnServerConfigVpnClientRootCertificateArgs>> vpnClientRootCertificates;

    public Output<List<VpnServerConfigVpnClientRootCertificateArgs>> getVpnClientRootCertificates() {
        return this.vpnClientRootCertificates == null ? Output.empty() : this.vpnClientRootCertificates;
    }

    /**
     * VPN protocols for the VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnProtocols")
      private final @Nullable Output<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols;

    public Output<List<Either<String,VpnGatewayTunnelingProtocol>>> getVpnProtocols() {
        return this.vpnProtocols == null ? Output.empty() : this.vpnProtocols;
    }

    /**
     * The name of the VpnServerConfiguration being created or updated.
     * 
     */
    @InputImport(name="vpnServerConfigurationName")
      private final @Nullable Output<String> vpnServerConfigurationName;

    public Output<String> getVpnServerConfigurationName() {
        return this.vpnServerConfigurationName == null ? Output.empty() : this.vpnServerConfigurationName;
    }

    public VpnServerConfigurationArgs(
        @Nullable Output<AadAuthenticationParametersArgs> aadAuthenticationParameters,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<List<VpnServerConfigRadiusClientRootCertificateArgs>> radiusClientRootCertificates,
        @Nullable Output<String> radiusServerAddress,
        @Nullable Output<List<VpnServerConfigRadiusServerRootCertificateArgs>> radiusServerRootCertificates,
        @Nullable Output<String> radiusServerSecret,
        @Nullable Output<List<RadiusServerArgs>> radiusServers,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes,
        @Nullable Output<List<IpsecPolicyArgs>> vpnClientIpsecPolicies,
        @Nullable Output<List<VpnServerConfigVpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates,
        @Nullable Output<List<VpnServerConfigVpnClientRootCertificateArgs>> vpnClientRootCertificates,
        @Nullable Output<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols,
        @Nullable Output<String> vpnServerConfigurationName) {
        this.aadAuthenticationParameters = aadAuthenticationParameters;
        this.id = id;
        this.location = location;
        this.name = name;
        this.radiusClientRootCertificates = radiusClientRootCertificates;
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerRootCertificates = radiusServerRootCertificates;
        this.radiusServerSecret = radiusServerSecret;
        this.radiusServers = radiusServers;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vpnAuthenticationTypes = vpnAuthenticationTypes;
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        this.vpnProtocols = vpnProtocols;
        this.vpnServerConfigurationName = vpnServerConfigurationName;
    }

    private VpnServerConfigurationArgs() {
        this.aadAuthenticationParameters = Output.empty();
        this.id = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.radiusClientRootCertificates = Output.empty();
        this.radiusServerAddress = Output.empty();
        this.radiusServerRootCertificates = Output.empty();
        this.radiusServerSecret = Output.empty();
        this.radiusServers = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.vpnAuthenticationTypes = Output.empty();
        this.vpnClientIpsecPolicies = Output.empty();
        this.vpnClientRevokedCertificates = Output.empty();
        this.vpnClientRootCertificates = Output.empty();
        this.vpnProtocols = Output.empty();
        this.vpnServerConfigurationName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AadAuthenticationParametersArgs> aadAuthenticationParameters;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<List<VpnServerConfigRadiusClientRootCertificateArgs>> radiusClientRootCertificates;
        private @Nullable Output<String> radiusServerAddress;
        private @Nullable Output<List<VpnServerConfigRadiusServerRootCertificateArgs>> radiusServerRootCertificates;
        private @Nullable Output<String> radiusServerSecret;
        private @Nullable Output<List<RadiusServerArgs>> radiusServers;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes;
        private @Nullable Output<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;
        private @Nullable Output<List<VpnServerConfigVpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates;
        private @Nullable Output<List<VpnServerConfigVpnClientRootCertificateArgs>> vpnClientRootCertificates;
        private @Nullable Output<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols;
        private @Nullable Output<String> vpnServerConfigurationName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthenticationParameters = defaults.aadAuthenticationParameters;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.radiusClientRootCertificates = defaults.radiusClientRootCertificates;
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerRootCertificates = defaults.radiusServerRootCertificates;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.radiusServers = defaults.radiusServers;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vpnAuthenticationTypes = defaults.vpnAuthenticationTypes;
    	      this.vpnClientIpsecPolicies = defaults.vpnClientIpsecPolicies;
    	      this.vpnClientRevokedCertificates = defaults.vpnClientRevokedCertificates;
    	      this.vpnClientRootCertificates = defaults.vpnClientRootCertificates;
    	      this.vpnProtocols = defaults.vpnProtocols;
    	      this.vpnServerConfigurationName = defaults.vpnServerConfigurationName;
        }

        public Builder aadAuthenticationParameters(@Nullable Output<AadAuthenticationParametersArgs> aadAuthenticationParameters) {
            this.aadAuthenticationParameters = aadAuthenticationParameters;
            return this;
        }

        public Builder aadAuthenticationParameters(@Nullable AadAuthenticationParametersArgs aadAuthenticationParameters) {
            this.aadAuthenticationParameters = Output.ofNullable(aadAuthenticationParameters);
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

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder radiusClientRootCertificates(@Nullable Output<List<VpnServerConfigRadiusClientRootCertificateArgs>> radiusClientRootCertificates) {
            this.radiusClientRootCertificates = radiusClientRootCertificates;
            return this;
        }

        public Builder radiusClientRootCertificates(@Nullable List<VpnServerConfigRadiusClientRootCertificateArgs> radiusClientRootCertificates) {
            this.radiusClientRootCertificates = Output.ofNullable(radiusClientRootCertificates);
            return this;
        }

        public Builder radiusServerAddress(@Nullable Output<String> radiusServerAddress) {
            this.radiusServerAddress = radiusServerAddress;
            return this;
        }

        public Builder radiusServerAddress(@Nullable String radiusServerAddress) {
            this.radiusServerAddress = Output.ofNullable(radiusServerAddress);
            return this;
        }

        public Builder radiusServerRootCertificates(@Nullable Output<List<VpnServerConfigRadiusServerRootCertificateArgs>> radiusServerRootCertificates) {
            this.radiusServerRootCertificates = radiusServerRootCertificates;
            return this;
        }

        public Builder radiusServerRootCertificates(@Nullable List<VpnServerConfigRadiusServerRootCertificateArgs> radiusServerRootCertificates) {
            this.radiusServerRootCertificates = Output.ofNullable(radiusServerRootCertificates);
            return this;
        }

        public Builder radiusServerSecret(@Nullable Output<String> radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }

        public Builder radiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = Output.ofNullable(radiusServerSecret);
            return this;
        }

        public Builder radiusServers(@Nullable Output<List<RadiusServerArgs>> radiusServers) {
            this.radiusServers = radiusServers;
            return this;
        }

        public Builder radiusServers(@Nullable List<RadiusServerArgs> radiusServers) {
            this.radiusServers = Output.ofNullable(radiusServers);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder vpnAuthenticationTypes(@Nullable Output<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = vpnAuthenticationTypes;
            return this;
        }

        public Builder vpnAuthenticationTypes(@Nullable List<Either<String,VpnAuthenticationType>> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = Output.ofNullable(vpnAuthenticationTypes);
            return this;
        }

        public Builder vpnClientIpsecPolicies(@Nullable Output<List<IpsecPolicyArgs>> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
            return this;
        }

        public Builder vpnClientIpsecPolicies(@Nullable List<IpsecPolicyArgs> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = Output.ofNullable(vpnClientIpsecPolicies);
            return this;
        }

        public Builder vpnClientRevokedCertificates(@Nullable Output<List<VpnServerConfigVpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
            return this;
        }

        public Builder vpnClientRevokedCertificates(@Nullable List<VpnServerConfigVpnClientRevokedCertificateArgs> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = Output.ofNullable(vpnClientRevokedCertificates);
            return this;
        }

        public Builder vpnClientRootCertificates(@Nullable Output<List<VpnServerConfigVpnClientRootCertificateArgs>> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = vpnClientRootCertificates;
            return this;
        }

        public Builder vpnClientRootCertificates(@Nullable List<VpnServerConfigVpnClientRootCertificateArgs> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = Output.ofNullable(vpnClientRootCertificates);
            return this;
        }

        public Builder vpnProtocols(@Nullable Output<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols) {
            this.vpnProtocols = vpnProtocols;
            return this;
        }

        public Builder vpnProtocols(@Nullable List<Either<String,VpnGatewayTunnelingProtocol>> vpnProtocols) {
            this.vpnProtocols = Output.ofNullable(vpnProtocols);
            return this;
        }

        public Builder vpnServerConfigurationName(@Nullable Output<String> vpnServerConfigurationName) {
            this.vpnServerConfigurationName = vpnServerConfigurationName;
            return this;
        }

        public Builder vpnServerConfigurationName(@Nullable String vpnServerConfigurationName) {
            this.vpnServerConfigurationName = Output.ofNullable(vpnServerConfigurationName);
            return this;
        }
        public VpnServerConfigurationArgs build() {
            return new VpnServerConfigurationArgs(aadAuthenticationParameters, id, location, name, radiusClientRootCertificates, radiusServerAddress, radiusServerRootCertificates, radiusServerSecret, radiusServers, resourceGroupName, tags, vpnAuthenticationTypes, vpnClientIpsecPolicies, vpnClientRevokedCertificates, vpnClientRootCertificates, vpnProtocols, vpnServerConfigurationName);
        }
    }
}
