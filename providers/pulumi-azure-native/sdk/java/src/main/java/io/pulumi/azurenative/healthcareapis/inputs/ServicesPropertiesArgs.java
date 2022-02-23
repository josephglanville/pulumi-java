// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.azurenative.healthcareapis.enums.PublicNetworkAccess;
import io.pulumi.azurenative.healthcareapis.inputs.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceAccessPolicyEntryArgs;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceAcrConfigurationInfoArgs;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceAuthenticationConfigurationInfoArgs;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceCorsConfigurationInfoArgs;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceCosmosDbConfigurationInfoArgs;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceExportConfigurationInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="accessPolicies")
      private final @Nullable Input<List<ServiceAccessPolicyEntryArgs>> accessPolicies;

    public Input<List<ServiceAccessPolicyEntryArgs>> getAccessPolicies() {
        return this.accessPolicies == null ? Input.empty() : this.accessPolicies;
    }

    /**
     * The azure container registry settings used for convert data operation of the service instance.
     * 
     */
    @InputImport(name="acrConfiguration")
      private final @Nullable Input<ServiceAcrConfigurationInfoArgs> acrConfiguration;

    public Input<ServiceAcrConfigurationInfoArgs> getAcrConfiguration() {
        return this.acrConfiguration == null ? Input.empty() : this.acrConfiguration;
    }

    /**
     * The authentication configuration for the service instance.
     * 
     */
    @InputImport(name="authenticationConfiguration")
      private final @Nullable Input<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration;

    public Input<ServiceAuthenticationConfigurationInfoArgs> getAuthenticationConfiguration() {
        return this.authenticationConfiguration == null ? Input.empty() : this.authenticationConfiguration;
    }

    /**
     * The settings for the CORS configuration of the service instance.
     * 
     */
    @InputImport(name="corsConfiguration")
      private final @Nullable Input<ServiceCorsConfigurationInfoArgs> corsConfiguration;

    public Input<ServiceCorsConfigurationInfoArgs> getCorsConfiguration() {
        return this.corsConfiguration == null ? Input.empty() : this.corsConfiguration;
    }

    /**
     * The settings for the Cosmos DB database backing the service.
     * 
     */
    @InputImport(name="cosmosDbConfiguration")
      private final @Nullable Input<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration;

    public Input<ServiceCosmosDbConfigurationInfoArgs> getCosmosDbConfiguration() {
        return this.cosmosDbConfiguration == null ? Input.empty() : this.cosmosDbConfiguration;
    }

    /**
     * The settings for the export operation of the service instance.
     * 
     */
    @InputImport(name="exportConfiguration")
      private final @Nullable Input<ServiceExportConfigurationInfoArgs> exportConfiguration;

    public Input<ServiceExportConfigurationInfoArgs> getExportConfiguration() {
        return this.exportConfiguration == null ? Input.empty() : this.exportConfiguration;
    }

    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    @InputImport(name="privateEndpointConnections")
      private final @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    public Input<List<PrivateEndpointConnectionArgs>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? Input.empty() : this.privateEndpointConnections;
    }

    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    @InputImport(name="publicNetworkAccess")
      private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    public ServicesPropertiesArgs(
        @Nullable Input<List<ServiceAccessPolicyEntryArgs>> accessPolicies,
        @Nullable Input<ServiceAcrConfigurationInfoArgs> acrConfiguration,
        @Nullable Input<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration,
        @Nullable Input<ServiceCorsConfigurationInfoArgs> corsConfiguration,
        @Nullable Input<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration,
        @Nullable Input<ServiceExportConfigurationInfoArgs> exportConfiguration,
        @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
        this.accessPolicies = accessPolicies;
        this.acrConfiguration = acrConfiguration;
        this.authenticationConfiguration = authenticationConfiguration;
        this.corsConfiguration = corsConfiguration;
        this.cosmosDbConfiguration = cosmosDbConfiguration;
        this.exportConfiguration = exportConfiguration;
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
    }

    private ServicesPropertiesArgs() {
        this.accessPolicies = Input.empty();
        this.acrConfiguration = Input.empty();
        this.authenticationConfiguration = Input.empty();
        this.corsConfiguration = Input.empty();
        this.cosmosDbConfiguration = Input.empty();
        this.exportConfiguration = Input.empty();
        this.privateEndpointConnections = Input.empty();
        this.publicNetworkAccess = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServiceAccessPolicyEntryArgs>> accessPolicies;
        private @Nullable Input<ServiceAcrConfigurationInfoArgs> acrConfiguration;
        private @Nullable Input<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration;
        private @Nullable Input<ServiceCorsConfigurationInfoArgs> corsConfiguration;
        private @Nullable Input<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration;
        private @Nullable Input<ServiceExportConfigurationInfoArgs> exportConfiguration;
        private @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.acrConfiguration = defaults.acrConfiguration;
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.cosmosDbConfiguration = defaults.cosmosDbConfiguration;
    	      this.exportConfiguration = defaults.exportConfiguration;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder setAccessPolicies(@Nullable Input<List<ServiceAccessPolicyEntryArgs>> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder setAccessPolicies(@Nullable List<ServiceAccessPolicyEntryArgs> accessPolicies) {
            this.accessPolicies = Input.ofNullable(accessPolicies);
            return this;
        }

        public Builder setAcrConfiguration(@Nullable Input<ServiceAcrConfigurationInfoArgs> acrConfiguration) {
            this.acrConfiguration = acrConfiguration;
            return this;
        }

        public Builder setAcrConfiguration(@Nullable ServiceAcrConfigurationInfoArgs acrConfiguration) {
            this.acrConfiguration = Input.ofNullable(acrConfiguration);
            return this;
        }

        public Builder setAuthenticationConfiguration(@Nullable Input<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder setAuthenticationConfiguration(@Nullable ServiceAuthenticationConfigurationInfoArgs authenticationConfiguration) {
            this.authenticationConfiguration = Input.ofNullable(authenticationConfiguration);
            return this;
        }

        public Builder setCorsConfiguration(@Nullable Input<ServiceCorsConfigurationInfoArgs> corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder setCorsConfiguration(@Nullable ServiceCorsConfigurationInfoArgs corsConfiguration) {
            this.corsConfiguration = Input.ofNullable(corsConfiguration);
            return this;
        }

        public Builder setCosmosDbConfiguration(@Nullable Input<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration) {
            this.cosmosDbConfiguration = cosmosDbConfiguration;
            return this;
        }

        public Builder setCosmosDbConfiguration(@Nullable ServiceCosmosDbConfigurationInfoArgs cosmosDbConfiguration) {
            this.cosmosDbConfiguration = Input.ofNullable(cosmosDbConfiguration);
            return this;
        }

        public Builder setExportConfiguration(@Nullable Input<ServiceExportConfigurationInfoArgs> exportConfiguration) {
            this.exportConfiguration = exportConfiguration;
            return this;
        }

        public Builder setExportConfiguration(@Nullable ServiceExportConfigurationInfoArgs exportConfiguration) {
            this.exportConfiguration = Input.ofNullable(exportConfiguration);
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            this.privateEndpointConnections = Input.ofNullable(privateEndpointConnections);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }
        public ServicesPropertiesArgs build() {
            return new ServicesPropertiesArgs(accessPolicies, acrConfiguration, authenticationConfiguration, corsConfiguration, cosmosDbConfiguration, exportConfiguration, privateEndpointConnections, publicNetworkAccess);
        }
    }
}
