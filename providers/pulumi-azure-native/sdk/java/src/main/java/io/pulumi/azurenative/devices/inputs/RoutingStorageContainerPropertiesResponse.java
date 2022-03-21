// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties related to a storage container endpoint.
 * 
 */
public final class RoutingStorageContainerPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final RoutingStorageContainerPropertiesResponse Empty = new RoutingStorageContainerPropertiesResponse();

    /**
     * Method used to authenticate against the storage endpoint
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable String authenticationType;

    public Optional<String> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     * 
     */
    @Import(name="batchFrequencyInSeconds")
      private final @Nullable Integer batchFrequencyInSeconds;

    public Optional<Integer> getBatchFrequencyInSeconds() {
        return this.batchFrequencyInSeconds == null ? Optional.empty() : Optional.ofNullable(this.batchFrequencyInSeconds);
    }

    /**
     * The connection string of the storage account.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable String connectionString;

    public Optional<String> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * The name of storage container in the storage account.
     * 
     */
    @Import(name="containerName", required=true)
      private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Encoding that is used to serialize messages to blobs. Supported values are 'avro', 'avrodeflate', and 'JSON'. Default value is 'avro'.
     * 
     */
    @Import(name="encoding")
      private final @Nullable String encoding;

    public Optional<String> getEncoding() {
        return this.encoding == null ? Optional.empty() : Optional.ofNullable(this.encoding);
    }

    /**
     * The url of the storage endpoint. It must include the protocol https://
     * 
     */
    @Import(name="endpointUri")
      private final @Nullable String endpointUri;

    public Optional<String> getEndpointUri() {
        return this.endpointUri == null ? Optional.empty() : Optional.ofNullable(this.endpointUri);
    }

    /**
     * File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     * 
     */
    @Import(name="fileNameFormat")
      private final @Nullable String fileNameFormat;

    public Optional<String> getFileNameFormat() {
        return this.fileNameFormat == null ? Optional.empty() : Optional.ofNullable(this.fileNameFormat);
    }

    /**
     * Id of the storage container endpoint
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     * 
     */
    @Import(name="maxChunkSizeInBytes")
      private final @Nullable Integer maxChunkSizeInBytes;

    public Optional<Integer> getMaxChunkSizeInBytes() {
        return this.maxChunkSizeInBytes == null ? Optional.empty() : Optional.ofNullable(this.maxChunkSizeInBytes);
    }

    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the resource group of the storage account.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable String resourceGroup;

    public Optional<String> getResourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The subscription identifier of the storage account.
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    public RoutingStorageContainerPropertiesResponse(
        @Nullable String authenticationType,
        @Nullable Integer batchFrequencyInSeconds,
        @Nullable String connectionString,
        String containerName,
        @Nullable String encoding,
        @Nullable String endpointUri,
        @Nullable String fileNameFormat,
        @Nullable String id,
        @Nullable Integer maxChunkSizeInBytes,
        String name,
        @Nullable String resourceGroup,
        @Nullable String subscriptionId) {
        this.authenticationType = authenticationType;
        this.batchFrequencyInSeconds = batchFrequencyInSeconds;
        this.connectionString = connectionString;
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.encoding = encoding;
        this.endpointUri = endpointUri;
        this.fileNameFormat = fileNameFormat;
        this.id = id;
        this.maxChunkSizeInBytes = maxChunkSizeInBytes;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroup = resourceGroup;
        this.subscriptionId = subscriptionId;
    }

    private RoutingStorageContainerPropertiesResponse() {
        this.authenticationType = null;
        this.batchFrequencyInSeconds = null;
        this.connectionString = null;
        this.containerName = null;
        this.encoding = null;
        this.endpointUri = null;
        this.fileNameFormat = null;
        this.id = null;
        this.maxChunkSizeInBytes = null;
        this.name = null;
        this.resourceGroup = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingStorageContainerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private @Nullable Integer batchFrequencyInSeconds;
        private @Nullable String connectionString;
        private String containerName;
        private @Nullable String encoding;
        private @Nullable String endpointUri;
        private @Nullable String fileNameFormat;
        private @Nullable String id;
        private @Nullable Integer maxChunkSizeInBytes;
        private String name;
        private @Nullable String resourceGroup;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingStorageContainerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.batchFrequencyInSeconds = defaults.batchFrequencyInSeconds;
    	      this.connectionString = defaults.connectionString;
    	      this.containerName = defaults.containerName;
    	      this.encoding = defaults.encoding;
    	      this.endpointUri = defaults.endpointUri;
    	      this.fileNameFormat = defaults.fileNameFormat;
    	      this.id = defaults.id;
    	      this.maxChunkSizeInBytes = defaults.maxChunkSizeInBytes;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder batchFrequencyInSeconds(@Nullable Integer batchFrequencyInSeconds) {
            this.batchFrequencyInSeconds = batchFrequencyInSeconds;
            return this;
        }
        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }
        public Builder fileNameFormat(@Nullable String fileNameFormat) {
            this.fileNameFormat = fileNameFormat;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder maxChunkSizeInBytes(@Nullable Integer maxChunkSizeInBytes) {
            this.maxChunkSizeInBytes = maxChunkSizeInBytes;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }        public RoutingStorageContainerPropertiesResponse build() {
            return new RoutingStorageContainerPropertiesResponse(authenticationType, batchFrequencyInSeconds, connectionString, containerName, encoding, endpointUri, fileNameFormat, id, maxChunkSizeInBytes, name, resourceGroup, subscriptionId);
        }
    }
}
