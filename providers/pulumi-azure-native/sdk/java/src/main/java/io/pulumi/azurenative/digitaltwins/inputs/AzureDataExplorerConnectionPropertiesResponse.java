// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureDataExplorerConnectionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureDataExplorerConnectionPropertiesResponse Empty = new AzureDataExplorerConnectionPropertiesResponse();

    @InputImport(name="adxDatabaseName", required=true)
    private final String adxDatabaseName;

    public String getAdxDatabaseName() {
        return this.adxDatabaseName;
    }

    @InputImport(name="adxEndpointUri", required=true)
    private final String adxEndpointUri;

    public String getAdxEndpointUri() {
        return this.adxEndpointUri;
    }

    @InputImport(name="adxResourceId", required=true)
    private final String adxResourceId;

    public String getAdxResourceId() {
        return this.adxResourceId;
    }

    @InputImport(name="adxTableName")
    private final @Nullable String adxTableName;

    public Optional<String> getAdxTableName() {
        return this.adxTableName == null ? Optional.empty() : Optional.ofNullable(this.adxTableName);
    }

    @InputImport(name="connectionType", required=true)
    private final String connectionType;

    public String getConnectionType() {
        return this.connectionType;
    }

    @InputImport(name="eventHubConsumerGroup")
    private final @Nullable String eventHubConsumerGroup;

    public Optional<String> getEventHubConsumerGroup() {
        return this.eventHubConsumerGroup == null ? Optional.empty() : Optional.ofNullable(this.eventHubConsumerGroup);
    }

    @InputImport(name="eventHubEndpointUri", required=true)
    private final String eventHubEndpointUri;

    public String getEventHubEndpointUri() {
        return this.eventHubEndpointUri;
    }

    @InputImport(name="eventHubEntityPath", required=true)
    private final String eventHubEntityPath;

    public String getEventHubEntityPath() {
        return this.eventHubEntityPath;
    }

    @InputImport(name="eventHubNamespaceResourceId", required=true)
    private final String eventHubNamespaceResourceId;

    public String getEventHubNamespaceResourceId() {
        return this.eventHubNamespaceResourceId;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public AzureDataExplorerConnectionPropertiesResponse(
        String adxDatabaseName,
        String adxEndpointUri,
        String adxResourceId,
        @Nullable String adxTableName,
        String connectionType,
        @Nullable String eventHubConsumerGroup,
        String eventHubEndpointUri,
        String eventHubEntityPath,
        String eventHubNamespaceResourceId,
        String provisioningState) {
        this.adxDatabaseName = Objects.requireNonNull(adxDatabaseName, "expected parameter 'adxDatabaseName' to be non-null");
        this.adxEndpointUri = Objects.requireNonNull(adxEndpointUri, "expected parameter 'adxEndpointUri' to be non-null");
        this.adxResourceId = Objects.requireNonNull(adxResourceId, "expected parameter 'adxResourceId' to be non-null");
        this.adxTableName = adxTableName;
        this.connectionType = Objects.requireNonNull(connectionType, "expected parameter 'connectionType' to be non-null");
        this.eventHubConsumerGroup = eventHubConsumerGroup;
        this.eventHubEndpointUri = Objects.requireNonNull(eventHubEndpointUri, "expected parameter 'eventHubEndpointUri' to be non-null");
        this.eventHubEntityPath = Objects.requireNonNull(eventHubEntityPath, "expected parameter 'eventHubEntityPath' to be non-null");
        this.eventHubNamespaceResourceId = Objects.requireNonNull(eventHubNamespaceResourceId, "expected parameter 'eventHubNamespaceResourceId' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private AzureDataExplorerConnectionPropertiesResponse() {
        this.adxDatabaseName = null;
        this.adxEndpointUri = null;
        this.adxResourceId = null;
        this.adxTableName = null;
        this.connectionType = null;
        this.eventHubConsumerGroup = null;
        this.eventHubEndpointUri = null;
        this.eventHubEntityPath = null;
        this.eventHubNamespaceResourceId = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adxDatabaseName;
        private String adxEndpointUri;
        private String adxResourceId;
        private @Nullable String adxTableName;
        private String connectionType;
        private @Nullable String eventHubConsumerGroup;
        private String eventHubEndpointUri;
        private String eventHubEntityPath;
        private String eventHubNamespaceResourceId;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adxDatabaseName = defaults.adxDatabaseName;
    	      this.adxEndpointUri = defaults.adxEndpointUri;
    	      this.adxResourceId = defaults.adxResourceId;
    	      this.adxTableName = defaults.adxTableName;
    	      this.connectionType = defaults.connectionType;
    	      this.eventHubConsumerGroup = defaults.eventHubConsumerGroup;
    	      this.eventHubEndpointUri = defaults.eventHubEndpointUri;
    	      this.eventHubEntityPath = defaults.eventHubEntityPath;
    	      this.eventHubNamespaceResourceId = defaults.eventHubNamespaceResourceId;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setAdxDatabaseName(String adxDatabaseName) {
            this.adxDatabaseName = Objects.requireNonNull(adxDatabaseName);
            return this;
        }

        public Builder setAdxEndpointUri(String adxEndpointUri) {
            this.adxEndpointUri = Objects.requireNonNull(adxEndpointUri);
            return this;
        }

        public Builder setAdxResourceId(String adxResourceId) {
            this.adxResourceId = Objects.requireNonNull(adxResourceId);
            return this;
        }

        public Builder setAdxTableName(@Nullable String adxTableName) {
            this.adxTableName = adxTableName;
            return this;
        }

        public Builder setConnectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }

        public Builder setEventHubConsumerGroup(@Nullable String eventHubConsumerGroup) {
            this.eventHubConsumerGroup = eventHubConsumerGroup;
            return this;
        }

        public Builder setEventHubEndpointUri(String eventHubEndpointUri) {
            this.eventHubEndpointUri = Objects.requireNonNull(eventHubEndpointUri);
            return this;
        }

        public Builder setEventHubEntityPath(String eventHubEntityPath) {
            this.eventHubEntityPath = Objects.requireNonNull(eventHubEntityPath);
            return this;
        }

        public Builder setEventHubNamespaceResourceId(String eventHubNamespaceResourceId) {
            this.eventHubNamespaceResourceId = Objects.requireNonNull(eventHubNamespaceResourceId);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public AzureDataExplorerConnectionPropertiesResponse build() {
            return new AzureDataExplorerConnectionPropertiesResponse(adxDatabaseName, adxEndpointUri, adxResourceId, adxTableName, connectionType, eventHubConsumerGroup, eventHubEndpointUri, eventHubEntityPath, eventHubNamespaceResourceId, provisioningState);
        }
    }
}
