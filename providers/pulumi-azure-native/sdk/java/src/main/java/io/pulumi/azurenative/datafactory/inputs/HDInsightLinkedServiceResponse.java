// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
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
 * HDInsight linked service.
 * 
 */
public final class HDInsightLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final HDInsightLinkedServiceResponse Empty = new HDInsightLinkedServiceResponse();

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
     * HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterUri", required=true)
      private final Object clusterUri;

    public Object getClusterUri() {
        return this.clusterUri;
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
     * Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileSystem")
      private final @Nullable Object fileSystem;

    public Optional<Object> getFileSystem() {
        return this.fileSystem == null ? Optional.empty() : Optional.ofNullable(this.fileSystem);
    }

    /**
     * A reference to the Azure SQL linked service that points to the HCatalog database.
     * 
     */
    @Import(name="hcatalogLinkedServiceName")
      private final @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getHcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.hcatalogLinkedServiceName);
    }

    /**
     * Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     * 
     */
    @Import(name="isEspEnabled")
      private final @Nullable Object isEspEnabled;

    public Optional<Object> getIsEspEnabled() {
        return this.isEspEnabled == null ? Optional.empty() : Optional.ofNullable(this.isEspEnabled);
    }

    /**
     * The Azure Storage linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
      private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
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
     * HDInsight cluster password.
     * 
     */
    @Import(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'HDInsight'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Object userName;

    public Optional<Object> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public HDInsightLinkedServiceResponse(
        @Nullable List<Object> annotations,
        Object clusterUri,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object fileSystem,
        @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName,
        @Nullable Object isEspEnabled,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        String type,
        @Nullable Object userName) {
        this.annotations = annotations;
        this.clusterUri = Objects.requireNonNull(clusterUri, "expected parameter 'clusterUri' to be non-null");
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.fileSystem = fileSystem;
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        this.isEspEnabled = isEspEnabled;
        this.linkedServiceName = linkedServiceName;
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private HDInsightLinkedServiceResponse() {
        this.annotations = List.of();
        this.clusterUri = null;
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.fileSystem = null;
        this.hcatalogLinkedServiceName = null;
        this.isEspEnabled = null;
        this.linkedServiceName = null;
        this.parameters = Map.of();
        this.password = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Object clusterUri;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object fileSystem;
        private @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName;
        private @Nullable Object isEspEnabled;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterUri = defaults.clusterUri;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.fileSystem = defaults.fileSystem;
    	      this.hcatalogLinkedServiceName = defaults.hcatalogLinkedServiceName;
    	      this.isEspEnabled = defaults.isEspEnabled;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder clusterUri(Object clusterUri) {
            this.clusterUri = Objects.requireNonNull(clusterUri);
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
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
        public Builder fileSystem(@Nullable Object fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public Builder hcatalogLinkedServiceName(@Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName) {
            this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
            return this;
        }
        public Builder isEspEnabled(@Nullable Object isEspEnabled) {
            this.isEspEnabled = isEspEnabled;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }        public HDInsightLinkedServiceResponse build() {
            return new HDInsightLinkedServiceResponse(annotations, clusterUri, connectVia, description, encryptedCredential, fileSystem, hcatalogLinkedServiceName, isEspEnabled, linkedServiceName, parameters, password, type, userName);
        }
    }
}
