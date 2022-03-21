// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance.inputs;

import io.pulumi.azurenative.securityandcompliance.enums.PublicNetworkAccess;
import io.pulumi.azurenative.securityandcompliance.inputs.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.securityandcompliance.inputs.ServiceAccessPolicyEntryArgs;
import io.pulumi.azurenative.securityandcompliance.inputs.ServiceAuthenticationConfigurationInfoArgs;
import io.pulumi.azurenative.securityandcompliance.inputs.ServiceCorsConfigurationInfoArgs;
import io.pulumi.azurenative.securityandcompliance.inputs.ServiceCosmosDbConfigurationInfoArgs;
import io.pulumi.azurenative.securityandcompliance.inputs.ServiceExportConfigurationInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of a service instance.
 * 
 */
public final class ServicesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicesPropertiesArgs Empty = new ServicesPropertiesArgs();

    /**
     * The access policies of the service instance.
     * 
     */
    @Import(name="accessPolicies")
      private final @Nullable Output<List<ServiceAccessPolicyEntryArgs>> accessPolicies;

    public Output<List<ServiceAccessPolicyEntryArgs>> getAccessPolicies() {
        return this.accessPolicies == null ? Output.empty() : this.accessPolicies;
    }

    /**
     * The authentication configuration for the service instance.
     * 
     */
    @Import(name="authenticationConfiguration")
      private final @Nullable Output<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration;

    public Output<ServiceAuthenticationConfigurationInfoArgs> getAuthenticationConfiguration() {
        return this.authenticationConfiguration == null ? Output.empty() : this.authenticationConfiguration;
    }

    /**
     * The settings for the CORS configuration of the service instance.
     * 
     */
    @Import(name="corsConfiguration")
      private final @Nullable Output<ServiceCorsConfigurationInfoArgs> corsConfiguration;

    public Output<ServiceCorsConfigurationInfoArgs> getCorsConfiguration() {
        return this.corsConfiguration == null ? Output.empty() : this.corsConfiguration;
    }

    /**
     * The settings for the Cosmos DB database backing the service.
     * 
     */
    @Import(name="cosmosDbConfiguration")
      private final @Nullable Output<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration;

    public Output<ServiceCosmosDbConfigurationInfoArgs> getCosmosDbConfiguration() {
        return this.cosmosDbConfiguration == null ? Output.empty() : this.cosmosDbConfiguration;
    }

    /**
     * The settings for the export operation of the service instance.
     * 
     */
    @Import(name="exportConfiguration")
      private final @Nullable Output<ServiceExportConfigurationInfoArgs> exportConfiguration;

    public Output<ServiceExportConfigurationInfoArgs> getExportConfiguration() {
        return this.exportConfiguration == null ? Output.empty() : this.exportConfiguration;
    }

    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    @Import(name="privateEndpointConnections")
      private final @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    public Output<List<PrivateEndpointConnectionArgs>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? Output.empty() : this.privateEndpointConnections;
    }

    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Output.empty() : this.publicNetworkAccess;
    }

    public ServicesPropertiesArgs(
        @Nullable Output<List<ServiceAccessPolicyEntryArgs>> accessPolicies,
        @Nullable Output<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration,
        @Nullable Output<ServiceCorsConfigurationInfoArgs> corsConfiguration,
        @Nullable Output<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration,
        @Nullable Output<ServiceExportConfigurationInfoArgs> exportConfiguration,
        @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections,
        @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
        this.accessPolicies = accessPolicies;
        this.authenticationConfiguration = authenticationConfiguration;
        this.corsConfiguration = corsConfiguration;
        this.cosmosDbConfiguration = cosmosDbConfiguration;
        this.exportConfiguration = exportConfiguration;
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
    }

    private ServicesPropertiesArgs() {
        this.accessPolicies = Output.empty();
        this.authenticationConfiguration = Output.empty();
        this.corsConfiguration = Output.empty();
        this.cosmosDbConfiguration = Output.empty();
        this.exportConfiguration = Output.empty();
        this.privateEndpointConnections = Output.empty();
        this.publicNetworkAccess = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceAccessPolicyEntryArgs>> accessPolicies;
        private @Nullable Output<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration;
        private @Nullable Output<ServiceCorsConfigurationInfoArgs> corsConfiguration;
        private @Nullable Output<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration;
        private @Nullable Output<ServiceExportConfigurationInfoArgs> exportConfiguration;
        private @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;
        private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.cosmosDbConfiguration = defaults.cosmosDbConfiguration;
    	      this.exportConfiguration = defaults.exportConfiguration;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder accessPolicies(@Nullable Output<List<ServiceAccessPolicyEntryArgs>> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public Builder accessPolicies(@Nullable List<ServiceAccessPolicyEntryArgs> accessPolicies) {
            this.accessPolicies = Output.ofNullable(accessPolicies);
            return this;
        }
        public Builder accessPolicies(ServiceAccessPolicyEntryArgs... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }
        public Builder authenticationConfiguration(@Nullable Output<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }
        public Builder authenticationConfiguration(@Nullable ServiceAuthenticationConfigurationInfoArgs authenticationConfiguration) {
            this.authenticationConfiguration = Output.ofNullable(authenticationConfiguration);
            return this;
        }
        public Builder corsConfiguration(@Nullable Output<ServiceCorsConfigurationInfoArgs> corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }
        public Builder corsConfiguration(@Nullable ServiceCorsConfigurationInfoArgs corsConfiguration) {
            this.corsConfiguration = Output.ofNullable(corsConfiguration);
            return this;
        }
        public Builder cosmosDbConfiguration(@Nullable Output<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration) {
            this.cosmosDbConfiguration = cosmosDbConfiguration;
            return this;
        }
        public Builder cosmosDbConfiguration(@Nullable ServiceCosmosDbConfigurationInfoArgs cosmosDbConfiguration) {
            this.cosmosDbConfiguration = Output.ofNullable(cosmosDbConfiguration);
            return this;
        }
        public Builder exportConfiguration(@Nullable Output<ServiceExportConfigurationInfoArgs> exportConfiguration) {
            this.exportConfiguration = exportConfiguration;
            return this;
        }
        public Builder exportConfiguration(@Nullable ServiceExportConfigurationInfoArgs exportConfiguration) {
            this.exportConfiguration = Output.ofNullable(exportConfiguration);
            return this;
        }
        public Builder privateEndpointConnections(@Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            this.privateEndpointConnections = Output.ofNullable(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionArgs... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Output.ofNullable(publicNetworkAccess);
            return this;
        }        public ServicesPropertiesArgs build() {
            return new ServicesPropertiesArgs(accessPolicies, authenticationConfiguration, corsConfiguration, cosmosDbConfiguration, exportConfiguration, privateEndpointConnections, publicNetworkAccess);
        }
    }
}
