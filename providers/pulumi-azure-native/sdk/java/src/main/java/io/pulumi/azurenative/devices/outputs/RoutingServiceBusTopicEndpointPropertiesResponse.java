// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RoutingServiceBusTopicEndpointPropertiesResponse {
    private final @Nullable String authenticationType;
    private final @Nullable String connectionString;
    private final @Nullable String endpointUri;
    private final @Nullable String entityPath;
    private final @Nullable String id;
    private final String name;
    private final @Nullable String resourceGroup;
    private final @Nullable String subscriptionId;

    @OutputCustomType.Constructor({"authenticationType","connectionString","endpointUri","entityPath","id","name","resourceGroup","subscriptionId"})
    private RoutingServiceBusTopicEndpointPropertiesResponse(
        @Nullable String authenticationType,
        @Nullable String connectionString,
        @Nullable String endpointUri,
        @Nullable String entityPath,
        @Nullable String id,
        String name,
        @Nullable String resourceGroup,
        @Nullable String subscriptionId) {
        this.authenticationType = authenticationType;
        this.connectionString = connectionString;
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.resourceGroup = resourceGroup;
        this.subscriptionId = subscriptionId;
    }

    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    public Optional<String> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    public Optional<String> getEndpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }
    public Optional<String> getEntityPath() {
        return Optional.ofNullable(this.entityPath);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingServiceBusTopicEndpointPropertiesResponse defaults) {
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

        public Builder(RoutingServiceBusTopicEndpointPropertiesResponse defaults) {
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

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setEndpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        public Builder setEntityPath(@Nullable String entityPath) {
            this.entityPath = entityPath;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public RoutingServiceBusTopicEndpointPropertiesResponse build() {
            return new RoutingServiceBusTopicEndpointPropertiesResponse(authenticationType, connectionString, endpointUri, entityPath, id, name, resourceGroup, subscriptionId);
        }
    }
}
