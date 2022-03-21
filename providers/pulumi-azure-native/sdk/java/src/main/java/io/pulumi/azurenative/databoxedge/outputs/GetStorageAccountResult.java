// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStorageAccountResult {
    /**
     * BlobEndpoint of Storage Account
     * 
     */
    private final String blobEndpoint;
    /**
     * The Container Count. Present only for Storage Accounts with DataPolicy set to Cloud.
     * 
     */
    private final Integer containerCount;
    /**
     * Data policy of the storage Account.
     * 
     */
    private final String dataPolicy;
    /**
     * Description for the storage Account.
     * 
     */
    private final @Nullable String description;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * Storage Account Credential Id
     * 
     */
    private final @Nullable String storageAccountCredentialId;
    /**
     * Current status of the storage account
     * 
     */
    private final @Nullable String storageAccountStatus;
    /**
     * StorageAccount object on ASE device
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetStorageAccountResult(
        @CustomType.Parameter("blobEndpoint") String blobEndpoint,
        @CustomType.Parameter("containerCount") Integer containerCount,
        @CustomType.Parameter("dataPolicy") String dataPolicy,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("storageAccountCredentialId") @Nullable String storageAccountCredentialId,
        @CustomType.Parameter("storageAccountStatus") @Nullable String storageAccountStatus,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.blobEndpoint = blobEndpoint;
        this.containerCount = containerCount;
        this.dataPolicy = dataPolicy;
        this.description = description;
        this.id = id;
        this.name = name;
        this.storageAccountCredentialId = storageAccountCredentialId;
        this.storageAccountStatus = storageAccountStatus;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * BlobEndpoint of Storage Account
     * 
    */
    public String getBlobEndpoint() {
        return this.blobEndpoint;
    }
    /**
     * The Container Count. Present only for Storage Accounts with DataPolicy set to Cloud.
     * 
    */
    public Integer getContainerCount() {
        return this.containerCount;
    }
    /**
     * Data policy of the storage Account.
     * 
    */
    public String getDataPolicy() {
        return this.dataPolicy;
    }
    /**
     * Description for the storage Account.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The object name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Storage Account Credential Id
     * 
    */
    public Optional<String> getStorageAccountCredentialId() {
        return Optional.ofNullable(this.storageAccountCredentialId);
    }
    /**
     * Current status of the storage account
     * 
    */
    public Optional<String> getStorageAccountStatus() {
        return Optional.ofNullable(this.storageAccountStatus);
    }
    /**
     * StorageAccount object on ASE device
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blobEndpoint;
        private Integer containerCount;
        private String dataPolicy;
        private @Nullable String description;
        private String id;
        private String name;
        private @Nullable String storageAccountCredentialId;
        private @Nullable String storageAccountStatus;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobEndpoint = defaults.blobEndpoint;
    	      this.containerCount = defaults.containerCount;
    	      this.dataPolicy = defaults.dataPolicy;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.storageAccountCredentialId = defaults.storageAccountCredentialId;
    	      this.storageAccountStatus = defaults.storageAccountStatus;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder blobEndpoint(String blobEndpoint) {
            this.blobEndpoint = Objects.requireNonNull(blobEndpoint);
            return this;
        }
        public Builder containerCount(Integer containerCount) {
            this.containerCount = Objects.requireNonNull(containerCount);
            return this;
        }
        public Builder dataPolicy(String dataPolicy) {
            this.dataPolicy = Objects.requireNonNull(dataPolicy);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
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
        public Builder storageAccountCredentialId(@Nullable String storageAccountCredentialId) {
            this.storageAccountCredentialId = storageAccountCredentialId;
            return this;
        }
        public Builder storageAccountStatus(@Nullable String storageAccountStatus) {
            this.storageAccountStatus = storageAccountStatus;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetStorageAccountResult build() {
            return new GetStorageAccountResult(blobEndpoint, containerCount, dataPolicy, description, id, name, storageAccountCredentialId, storageAccountStatus, systemData, type);
        }
    }
}
