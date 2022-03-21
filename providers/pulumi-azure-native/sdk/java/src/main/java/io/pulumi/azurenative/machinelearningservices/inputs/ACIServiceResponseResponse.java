// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ACIServiceResponseResponseDataCollection;
import io.pulumi.azurenative.machinelearningservices.inputs.ACIServiceResponseResponseEncryptionProperties;
import io.pulumi.azurenative.machinelearningservices.inputs.ACIServiceResponseResponseEnvironmentImageRequest;
import io.pulumi.azurenative.machinelearningservices.inputs.ACIServiceResponseResponseVnetConfiguration;
import io.pulumi.azurenative.machinelearningservices.inputs.ContainerResourceRequirementsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ModelResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ServiceResponseBaseResponseError;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The response for an ACI service.
 * 
 */
public final class ACIServiceResponseResponse extends io.pulumi.resources.InvokeArgs {

    public static final ACIServiceResponseResponse Empty = new ACIServiceResponseResponse();

    /**
     * Whether or not Application Insights is enabled.
     * 
     */
    @Import(name="appInsightsEnabled")
      private final @Nullable Boolean appInsightsEnabled;

    public Optional<Boolean> getAppInsightsEnabled() {
        return this.appInsightsEnabled == null ? Optional.empty() : Optional.ofNullable(this.appInsightsEnabled);
    }

    /**
     * Whether or not authentication is enabled on the service.
     * 
     */
    @Import(name="authEnabled")
      private final @Nullable Boolean authEnabled;

    public Optional<Boolean> getAuthEnabled() {
        return this.authEnabled == null ? Optional.empty() : Optional.ofNullable(this.authEnabled);
    }

    /**
     * The CName for the service.
     * 
     */
    @Import(name="cname")
      private final @Nullable String cname;

    public Optional<String> getCname() {
        return this.cname == null ? Optional.empty() : Optional.ofNullable(this.cname);
    }

    /**
     * The compute environment type for the service.
     * Expected value is 'ACI'.
     * 
     */
    @Import(name="computeType", required=true)
      private final String computeType;

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * The container resource requirements.
     * 
     */
    @Import(name="containerResourceRequirements")
      private final @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;

    public Optional<ContainerResourceRequirementsResponse> getContainerResourceRequirements() {
        return this.containerResourceRequirements == null ? Optional.empty() : Optional.ofNullable(this.containerResourceRequirements);
    }

    /**
     * Details of the data collection options specified.
     * 
     */
    @Import(name="dataCollection")
      private final @Nullable ACIServiceResponseResponseDataCollection dataCollection;

    public Optional<ACIServiceResponseResponseDataCollection> getDataCollection() {
        return this.dataCollection == null ? Optional.empty() : Optional.ofNullable(this.dataCollection);
    }

    /**
     * The deployment type for the service.
     * 
     */
    @Import(name="deploymentType")
      private final @Nullable String deploymentType;

    public Optional<String> getDeploymentType() {
        return this.deploymentType == null ? Optional.empty() : Optional.ofNullable(this.deploymentType);
    }

    /**
     * The service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encryption properties.
     * 
     */
    @Import(name="encryptionProperties")
      private final @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties;

    public Optional<ACIServiceResponseResponseEncryptionProperties> getEncryptionProperties() {
        return this.encryptionProperties == null ? Optional.empty() : Optional.ofNullable(this.encryptionProperties);
    }

    /**
     * The Environment, models and assets used for inferencing.
     * 
     */
    @Import(name="environmentImageRequest")
      private final @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest;

    public Optional<ACIServiceResponseResponseEnvironmentImageRequest> getEnvironmentImageRequest() {
        return this.environmentImageRequest == null ? Optional.empty() : Optional.ofNullable(this.environmentImageRequest);
    }

    /**
     * The error details.
     * 
     */
    @Import(name="error", required=true)
      private final ServiceResponseBaseResponseError error;

    public ServiceResponseBaseResponseError getError() {
        return this.error;
    }

    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    @Import(name="kvTags")
      private final @Nullable Map<String,String> kvTags;

    public Map<String,String> getKvTags() {
        return this.kvTags == null ? Map.of() : this.kvTags;
    }

    /**
     * The name of the Azure location/region.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Details on the models and configurations.
     * 
     */
    @Import(name="modelConfigMap", required=true)
      private final Map<String,Object> modelConfigMap;

    public Map<String,Object> getModelConfigMap() {
        return this.modelConfigMap;
    }

    /**
     * The list of models.
     * 
     */
    @Import(name="models")
      private final @Nullable List<ModelResponse> models;

    public List<ModelResponse> getModels() {
        return this.models == null ? List.of() : this.models;
    }

    /**
     * The service property dictionary. Properties are immutable.
     * 
     */
    @Import(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * The public Fqdn for the service.
     * 
     */
    @Import(name="publicFqdn")
      private final @Nullable String publicFqdn;

    public Optional<String> getPublicFqdn() {
        return this.publicFqdn == null ? Optional.empty() : Optional.ofNullable(this.publicFqdn);
    }

    /**
     * The public IP address for the service.
     * 
     */
    @Import(name="publicIp")
      private final @Nullable String publicIp;

    public Optional<String> getPublicIp() {
        return this.publicIp == null ? Optional.empty() : Optional.ofNullable(this.publicIp);
    }

    /**
     * The Uri for sending scoring requests.
     * 
     */
    @Import(name="scoringUri", required=true)
      private final String scoringUri;

    public String getScoringUri() {
        return this.scoringUri;
    }

    /**
     * The public SSL certificate in PEM format to use if SSL is enabled.
     * 
     */
    @Import(name="sslCertificate")
      private final @Nullable String sslCertificate;

    public Optional<String> getSslCertificate() {
        return this.sslCertificate == null ? Optional.empty() : Optional.ofNullable(this.sslCertificate);
    }

    /**
     * Whether or not SSL is enabled.
     * 
     */
    @Import(name="sslEnabled")
      private final @Nullable Boolean sslEnabled;

    public Optional<Boolean> getSslEnabled() {
        return this.sslEnabled == null ? Optional.empty() : Optional.ofNullable(this.sslEnabled);
    }

    /**
     * The public SSL key in PEM format for the certificate.
     * 
     */
    @Import(name="sslKey")
      private final @Nullable String sslKey;

    public Optional<String> getSslKey() {
        return this.sslKey == null ? Optional.empty() : Optional.ofNullable(this.sslKey);
    }

    /**
     * The current state of the service.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * The Uri for sending swagger requests.
     * 
     */
    @Import(name="swaggerUri", required=true)
      private final String swaggerUri;

    public String getSwaggerUri() {
        return this.swaggerUri;
    }

    /**
     * The virtual network configuration.
     * 
     */
    @Import(name="vnetConfiguration")
      private final @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration;

    public Optional<ACIServiceResponseResponseVnetConfiguration> getVnetConfiguration() {
        return this.vnetConfiguration == null ? Optional.empty() : Optional.ofNullable(this.vnetConfiguration);
    }

    public ACIServiceResponseResponse(
        @Nullable Boolean appInsightsEnabled,
        @Nullable Boolean authEnabled,
        @Nullable String cname,
        String computeType,
        @Nullable ContainerResourceRequirementsResponse containerResourceRequirements,
        @Nullable ACIServiceResponseResponseDataCollection dataCollection,
        @Nullable String deploymentType,
        @Nullable String description,
        @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties,
        @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest,
        ServiceResponseBaseResponseError error,
        @Nullable Map<String,String> kvTags,
        @Nullable String location,
        Map<String,Object> modelConfigMap,
        @Nullable List<ModelResponse> models,
        @Nullable Map<String,String> properties,
        @Nullable String publicFqdn,
        @Nullable String publicIp,
        String scoringUri,
        @Nullable String sslCertificate,
        @Nullable Boolean sslEnabled,
        @Nullable String sslKey,
        String state,
        String swaggerUri,
        @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration) {
        this.appInsightsEnabled = appInsightsEnabled;
        this.authEnabled = authEnabled;
        this.cname = cname;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.containerResourceRequirements = containerResourceRequirements;
        this.dataCollection = dataCollection;
        this.deploymentType = deploymentType;
        this.description = description;
        this.encryptionProperties = encryptionProperties;
        this.environmentImageRequest = environmentImageRequest;
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.kvTags = kvTags;
        this.location = location;
        this.modelConfigMap = Objects.requireNonNull(modelConfigMap, "expected parameter 'modelConfigMap' to be non-null");
        this.models = models;
        this.properties = properties;
        this.publicFqdn = publicFqdn;
        this.publicIp = publicIp;
        this.scoringUri = Objects.requireNonNull(scoringUri, "expected parameter 'scoringUri' to be non-null");
        this.sslCertificate = sslCertificate;
        this.sslEnabled = sslEnabled;
        this.sslKey = sslKey;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.swaggerUri = Objects.requireNonNull(swaggerUri, "expected parameter 'swaggerUri' to be non-null");
        this.vnetConfiguration = vnetConfiguration;
    }

    private ACIServiceResponseResponse() {
        this.appInsightsEnabled = null;
        this.authEnabled = null;
        this.cname = null;
        this.computeType = null;
        this.containerResourceRequirements = null;
        this.dataCollection = null;
        this.deploymentType = null;
        this.description = null;
        this.encryptionProperties = null;
        this.environmentImageRequest = null;
        this.error = null;
        this.kvTags = Map.of();
        this.location = null;
        this.modelConfigMap = Map.of();
        this.models = List.of();
        this.properties = Map.of();
        this.publicFqdn = null;
        this.publicIp = null;
        this.scoringUri = null;
        this.sslCertificate = null;
        this.sslEnabled = null;
        this.sslKey = null;
        this.state = null;
        this.swaggerUri = null;
        this.vnetConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean appInsightsEnabled;
        private @Nullable Boolean authEnabled;
        private @Nullable String cname;
        private String computeType;
        private @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;
        private @Nullable ACIServiceResponseResponseDataCollection dataCollection;
        private @Nullable String deploymentType;
        private @Nullable String description;
        private @Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties;
        private @Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest;
        private ServiceResponseBaseResponseError error;
        private @Nullable Map<String,String> kvTags;
        private @Nullable String location;
        private Map<String,Object> modelConfigMap;
        private @Nullable List<ModelResponse> models;
        private @Nullable Map<String,String> properties;
        private @Nullable String publicFqdn;
        private @Nullable String publicIp;
        private String scoringUri;
        private @Nullable String sslCertificate;
        private @Nullable Boolean sslEnabled;
        private @Nullable String sslKey;
        private String state;
        private String swaggerUri;
        private @Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsightsEnabled = defaults.appInsightsEnabled;
    	      this.authEnabled = defaults.authEnabled;
    	      this.cname = defaults.cname;
    	      this.computeType = defaults.computeType;
    	      this.containerResourceRequirements = defaults.containerResourceRequirements;
    	      this.dataCollection = defaults.dataCollection;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.encryptionProperties = defaults.encryptionProperties;
    	      this.environmentImageRequest = defaults.environmentImageRequest;
    	      this.error = defaults.error;
    	      this.kvTags = defaults.kvTags;
    	      this.location = defaults.location;
    	      this.modelConfigMap = defaults.modelConfigMap;
    	      this.models = defaults.models;
    	      this.properties = defaults.properties;
    	      this.publicFqdn = defaults.publicFqdn;
    	      this.publicIp = defaults.publicIp;
    	      this.scoringUri = defaults.scoringUri;
    	      this.sslCertificate = defaults.sslCertificate;
    	      this.sslEnabled = defaults.sslEnabled;
    	      this.sslKey = defaults.sslKey;
    	      this.state = defaults.state;
    	      this.swaggerUri = defaults.swaggerUri;
    	      this.vnetConfiguration = defaults.vnetConfiguration;
        }

        public Builder appInsightsEnabled(@Nullable Boolean appInsightsEnabled) {
            this.appInsightsEnabled = appInsightsEnabled;
            return this;
        }
        public Builder authEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }
        public Builder cname(@Nullable String cname) {
            this.cname = cname;
            return this;
        }
        public Builder computeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        public Builder containerResourceRequirements(@Nullable ContainerResourceRequirementsResponse containerResourceRequirements) {
            this.containerResourceRequirements = containerResourceRequirements;
            return this;
        }
        public Builder dataCollection(@Nullable ACIServiceResponseResponseDataCollection dataCollection) {
            this.dataCollection = dataCollection;
            return this;
        }
        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptionProperties(@Nullable ACIServiceResponseResponseEncryptionProperties encryptionProperties) {
            this.encryptionProperties = encryptionProperties;
            return this;
        }
        public Builder environmentImageRequest(@Nullable ACIServiceResponseResponseEnvironmentImageRequest environmentImageRequest) {
            this.environmentImageRequest = environmentImageRequest;
            return this;
        }
        public Builder error(ServiceResponseBaseResponseError error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder kvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = kvTags;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder modelConfigMap(Map<String,Object> modelConfigMap) {
            this.modelConfigMap = Objects.requireNonNull(modelConfigMap);
            return this;
        }
        public Builder models(@Nullable List<ModelResponse> models) {
            this.models = models;
            return this;
        }
        public Builder models(ModelResponse... models) {
            return models(List.of(models));
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder publicFqdn(@Nullable String publicFqdn) {
            this.publicFqdn = publicFqdn;
            return this;
        }
        public Builder publicIp(@Nullable String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public Builder scoringUri(String scoringUri) {
            this.scoringUri = Objects.requireNonNull(scoringUri);
            return this;
        }
        public Builder sslCertificate(@Nullable String sslCertificate) {
            this.sslCertificate = sslCertificate;
            return this;
        }
        public Builder sslEnabled(@Nullable Boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }
        public Builder sslKey(@Nullable String sslKey) {
            this.sslKey = sslKey;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder swaggerUri(String swaggerUri) {
            this.swaggerUri = Objects.requireNonNull(swaggerUri);
            return this;
        }
        public Builder vnetConfiguration(@Nullable ACIServiceResponseResponseVnetConfiguration vnetConfiguration) {
            this.vnetConfiguration = vnetConfiguration;
            return this;
        }        public ACIServiceResponseResponse build() {
            return new ACIServiceResponseResponse(appInsightsEnabled, authEnabled, cname, computeType, containerResourceRequirements, dataCollection, deploymentType, description, encryptionProperties, environmentImageRequest, error, kvTags, location, modelConfigMap, models, properties, publicFqdn, publicIp, scoringUri, sslCertificate, sslEnabled, sslKey, state, swaggerUri, vnetConfiguration);
        }
    }
}
