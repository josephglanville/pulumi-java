// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Common Data Service for Apps linked service.
 * 
 */
public final class CommonDataServiceForAppsLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final CommonDataServiceForAppsLinkedServiceResponse Empty = new CommonDataServiceForAppsLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The authentication type to connect to Common Data Service for Apps server. 'Office365' for online scenario, 'Ifd' for on-premises with Ifd scenario. 'AADServicePrincipal' for Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType", required=true)
      private final Object authenticationType;

    public Object getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * The deployment type of the Common Data Service for Apps instance. 'Online' for Common Data Service for Apps Online and 'OnPremisesWithIfd' for Common Data Service for Apps on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deploymentType", required=true)
      private final Object deploymentType;

    public Object getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The host name of the on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="hostName")
      private final @Nullable Object hostName;

    public Optional<Object> getHostName() {
        return this.hostName == null ? Optional.empty() : Optional.ofNullable(this.hostName);
    }

    /**
     * The organization name of the Common Data Service for Apps instance. The property is required for on-prem and required for online when there are more than one Common Data Service for Apps instances associated with the user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="organizationName")
      private final @Nullable Object organizationName;

    public Optional<Object> getOrganizationName() {
        return this.organizationName == null ? Optional.empty() : Optional.ofNullable(this.organizationName);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Password to access the Common Data Service for Apps instance.
     * 
     */
    @Import(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * The port of on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="port")
      private final @Nullable Object port;

    public Optional<Object> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="servicePrincipalCredential")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalCredential() {
        return this.servicePrincipalCredential == null ? null : this.servicePrincipalCredential;
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalCredentialType")
      private final @Nullable Object servicePrincipalCredentialType;

    public Optional<Object> getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalCredentialType);
    }

    /**
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Object servicePrincipalId;

    public Optional<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The URL to the Microsoft Common Data Service for Apps server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUri")
      private final @Nullable Object serviceUri;

    public Optional<Object> getServiceUri() {
        return this.serviceUri == null ? Optional.empty() : Optional.ofNullable(this.serviceUri);
    }

    /**
     * Type of linked service.
     * Expected value is 'CommonDataServiceForApps'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * User name to access the Common Data Service for Apps instance. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
      private final @Nullable Object username;

    public Optional<Object> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public CommonDataServiceForAppsLinkedServiceResponse(
        @Nullable List<Object> annotations,
        Object authenticationType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        Object deploymentType,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object hostName,
        @Nullable Object organizationName,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object port,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential,
        @Nullable Object servicePrincipalCredentialType,
        @Nullable Object servicePrincipalId,
        @Nullable Object serviceUri,
        String type,
        @Nullable Object username) {
        this.annotations = annotations;
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.connectVia = connectVia;
        this.deploymentType = Objects.requireNonNull(deploymentType, "expected parameter 'deploymentType' to be non-null");
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.hostName = hostName;
        this.organizationName = organizationName;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.servicePrincipalCredential = servicePrincipalCredential;
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        this.servicePrincipalId = servicePrincipalId;
        this.serviceUri = serviceUri;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private CommonDataServiceForAppsLinkedServiceResponse() {
        this.annotations = List.of();
        this.authenticationType = null;
        this.connectVia = null;
        this.deploymentType = null;
        this.description = null;
        this.encryptedCredential = null;
        this.hostName = null;
        this.organizationName = null;
        this.parameters = Map.of();
        this.password = null;
        this.port = null;
        this.servicePrincipalCredential = null;
        this.servicePrincipalCredentialType = null;
        this.servicePrincipalId = null;
        this.serviceUri = null;
        this.type = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonDataServiceForAppsLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Object authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object deploymentType;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object hostName;
        private @Nullable Object organizationName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;
        private @Nullable Object servicePrincipalCredentialType;
        private @Nullable Object servicePrincipalId;
        private @Nullable Object serviceUri;
        private String type;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonDataServiceForAppsLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.hostName = defaults.hostName;
    	      this.organizationName = defaults.organizationName;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.servicePrincipalCredential = defaults.servicePrincipalCredential;
    	      this.servicePrincipalCredentialType = defaults.servicePrincipalCredentialType;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.serviceUri = defaults.serviceUri;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authenticationType(Object authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder deploymentType(Object deploymentType) {
            this.deploymentType = Objects.requireNonNull(deploymentType);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder hostName(@Nullable Object hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder organizationName(@Nullable Object organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }
        public Builder port(@Nullable Object port) {
            this.port = port;
            return this;
        }
        public Builder servicePrincipalCredential(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential) {
            this.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }
        public Builder servicePrincipalCredentialType(@Nullable Object servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder serviceUri(@Nullable Object serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder username(@Nullable Object username) {
            this.username = username;
            return this;
        }        public CommonDataServiceForAppsLinkedServiceResponse build() {
            return new CommonDataServiceForAppsLinkedServiceResponse(annotations, authenticationType, connectVia, deploymentType, description, encryptedCredential, hostName, organizationName, parameters, password, port, servicePrincipalCredential, servicePrincipalCredentialType, servicePrincipalId, serviceUri, type, username);
        }
    }
}
