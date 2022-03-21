// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingEventHubPropertiesResponse {
    /**
     * Method used to authenticate against the event hub endpoint
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * The connection string of the event hub endpoint.
     * 
     */
    private final @Nullable String connectionString;
    /**
     * The url of the event hub endpoint. It must include the protocol sb://
     * 
     */
    private final @Nullable String endpointUri;
    /**
     * Event hub name on the event hub namespace
     * 
     */
    private final @Nullable String entityPath;
    /**
     * Id of the event hub endpoint
     * 
     */
    private final @Nullable String id;
    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    private final String name;
    /**
     * The name of the resource group of the event hub endpoint.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * The subscription identifier of the event hub endpoint.
     * 
     */
    private final @Nullable String subscriptionId;

    @CustomType.Constructor
    private RoutingEventHubPropertiesResponse(
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("connectionString") @Nullable String connectionString,
        @CustomType.Parameter("endpointUri") @Nullable String endpointUri,
        @CustomType.Parameter("entityPath") @Nullable String entityPath,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId) {
        this.authenticationType = authenticationType;
        this.connectionString = connectionString;
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.id = id;
        this.name = name;
        this.resourceGroup = resourceGroup;
        this.subscriptionId = subscriptionId;
    }

    /**
     * Method used to authenticate against the event hub endpoint
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * The connection string of the event hub endpoint.
     * 
    */
    public Optional<String> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * The url of the event hub endpoint. It must include the protocol sb://
     * 
    */
    public Optional<String> getEndpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }
    /**
     * Event hub name on the event hub namespace
     * 
    */
    public Optional<String> getEntityPath() {
        return Optional.ofNullable(this.entityPath);
    }
    /**
     * Id of the event hub endpoint
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the resource group of the event hub endpoint.
     * 
    */
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * The subscription identifier of the event hub endpoint.
     * 
    */
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingEventHubPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private @Nullable String connectionString;
        private @Nullable String endpointUri;
        private @Nullable String entityPath;
        private @Nullable String id;
        private String name;
        private @Nullable String resourceGroup;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingEventHubPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }
        public Builder entityPath(@Nullable String entityPath) {
            this.entityPath = entityPath;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
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
        }        public RoutingEventHubPropertiesResponse build() {
            return new RoutingEventHubPropertiesResponse(authenticationType, connectionString, endpointUri, entityPath, id, name, resourceGroup, subscriptionId);
        }
    }
}
