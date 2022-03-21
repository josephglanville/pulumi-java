// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata.outputs;

import io.pulumi.azurenative.hybriddata.outputs.CustomerSecretResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataStoreResult {
    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    private final @Nullable List<CustomerSecretResponse> customerSecrets;
    /**
     * The arm id of the data store type.
     * 
     */
    private final String dataStoreTypeId;
    /**
     * A generic json used differently by each data source type.
     * 
     */
    private final @Nullable Object extendedProperties;
    /**
     * Id of the object.
     * 
     */
    private final String id;
    /**
     * Name of the object.
     * 
     */
    private final String name;
    /**
     * Arm Id for the manager resource to which the data source is associated. This is optional.
     * 
     */
    private final @Nullable String repositoryId;
    /**
     * State of the data source.
     * 
     */
    private final String state;
    /**
     * Type of the object.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDataStoreResult(
        @CustomType.Parameter("customerSecrets") @Nullable List<CustomerSecretResponse> customerSecrets,
        @CustomType.Parameter("dataStoreTypeId") String dataStoreTypeId,
        @CustomType.Parameter("extendedProperties") @Nullable Object extendedProperties,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("repositoryId") @Nullable String repositoryId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("type") String type) {
        this.customerSecrets = customerSecrets;
        this.dataStoreTypeId = dataStoreTypeId;
        this.extendedProperties = extendedProperties;
        this.id = id;
        this.name = name;
        this.repositoryId = repositoryId;
        this.state = state;
        this.type = type;
    }

    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
    */
    public List<CustomerSecretResponse> getCustomerSecrets() {
        return this.customerSecrets == null ? List.of() : this.customerSecrets;
    }
    /**
     * The arm id of the data store type.
     * 
    */
    public String getDataStoreTypeId() {
        return this.dataStoreTypeId;
    }
    /**
     * A generic json used differently by each data source type.
     * 
    */
    public Optional<Object> getExtendedProperties() {
        return Optional.ofNullable(this.extendedProperties);
    }
    /**
     * Id of the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the object.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Arm Id for the manager resource to which the data source is associated. This is optional.
     * 
    */
    public Optional<String> getRepositoryId() {
        return Optional.ofNullable(this.repositoryId);
    }
    /**
     * State of the data source.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataStoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomerSecretResponse> customerSecrets;
        private String dataStoreTypeId;
        private @Nullable Object extendedProperties;
        private String id;
        private String name;
        private @Nullable String repositoryId;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataStoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerSecrets = defaults.customerSecrets;
    	      this.dataStoreTypeId = defaults.dataStoreTypeId;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.repositoryId = defaults.repositoryId;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder customerSecrets(@Nullable List<CustomerSecretResponse> customerSecrets) {
            this.customerSecrets = customerSecrets;
            return this;
        }
        public Builder customerSecrets(CustomerSecretResponse... customerSecrets) {
            return customerSecrets(List.of(customerSecrets));
        }
        public Builder dataStoreTypeId(String dataStoreTypeId) {
            this.dataStoreTypeId = Objects.requireNonNull(dataStoreTypeId);
            return this;
        }
        public Builder extendedProperties(@Nullable Object extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder repositoryId(@Nullable String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDataStoreResult build() {
            return new GetDataStoreResult(customerSecrets, dataStoreTypeId, extendedProperties, id, name, repositoryId, state, type);
        }
    }
}
