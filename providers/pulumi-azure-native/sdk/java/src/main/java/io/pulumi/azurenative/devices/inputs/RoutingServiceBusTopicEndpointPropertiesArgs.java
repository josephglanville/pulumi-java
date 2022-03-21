// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.AuthenticationType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties related to service bus topic endpoint types.
 * 
 */
public final class RoutingServiceBusTopicEndpointPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingServiceBusTopicEndpointPropertiesArgs Empty = new RoutingServiceBusTopicEndpointPropertiesArgs();

    /**
     * Method used to authenticate against the service bus topic endpoint
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<Either<String,AuthenticationType>> authenticationType;

    public Output<Either<String,AuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Output.empty() : this.authenticationType;
    }

    /**
     * The connection string of the service bus topic endpoint.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable Output<String> connectionString;

    public Output<String> getConnectionString() {
        return this.connectionString == null ? Output.empty() : this.connectionString;
    }

    /**
     * The url of the service bus topic endpoint. It must include the protocol sb://
     * 
     */
    @Import(name="endpointUri")
      private final @Nullable Output<String> endpointUri;

    public Output<String> getEndpointUri() {
        return this.endpointUri == null ? Output.empty() : this.endpointUri;
    }

    /**
     * Queue name on the service bus topic
     * 
     */
    @Import(name="entityPath")
      private final @Nullable Output<String> entityPath;

    public Output<String> getEntityPath() {
        return this.entityPath == null ? Output.empty() : this.entityPath;
    }

    /**
     * Id of the service bus topic endpoint
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.  The name need not be the same as the actual topic name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The name of the resource group of the service bus topic endpoint.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable Output<String> resourceGroup;

    public Output<String> getResourceGroup() {
        return this.resourceGroup == null ? Output.empty() : this.resourceGroup;
    }

    /**
     * The subscription identifier of the service bus topic endpoint.
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId == null ? Output.empty() : this.subscriptionId;
    }

    public RoutingServiceBusTopicEndpointPropertiesArgs(
        @Nullable Output<Either<String,AuthenticationType>> authenticationType,
        @Nullable Output<String> connectionString,
        @Nullable Output<String> endpointUri,
        @Nullable Output<String> entityPath,
        @Nullable Output<String> id,
        Output<String> name,
        @Nullable Output<String> resourceGroup,
        @Nullable Output<String> subscriptionId) {
        this.authenticationType = authenticationType;
        this.connectionString = connectionString;
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.id = id;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroup = resourceGroup;
        this.subscriptionId = subscriptionId;
    }

    private RoutingServiceBusTopicEndpointPropertiesArgs() {
        this.authenticationType = Output.empty();
        this.connectionString = Output.empty();
        this.endpointUri = Output.empty();
        this.entityPath = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.resourceGroup = Output.empty();
        this.subscriptionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingServiceBusTopicEndpointPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,AuthenticationType>> authenticationType;
        private @Nullable Output<String> connectionString;
        private @Nullable Output<String> endpointUri;
        private @Nullable Output<String> entityPath;
        private @Nullable Output<String> id;
        private Output<String> name;
        private @Nullable Output<String> resourceGroup;
        private @Nullable Output<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingServiceBusTopicEndpointPropertiesArgs defaults) {
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

        public Builder authenticationType(@Nullable Output<Either<String,AuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Either<String,AuthenticationType> authenticationType) {
            this.authenticationType = Output.ofNullable(authenticationType);
            return this;
        }
        public Builder connectionString(@Nullable Output<String> connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = Output.ofNullable(connectionString);
            return this;
        }
        public Builder endpointUri(@Nullable Output<String> endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }
        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = Output.ofNullable(endpointUri);
            return this;
        }
        public Builder entityPath(@Nullable Output<String> entityPath) {
            this.entityPath = entityPath;
            return this;
        }
        public Builder entityPath(@Nullable String entityPath) {
            this.entityPath = Output.ofNullable(entityPath);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Output.ofNullable(resourceGroup);
            return this;
        }
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Output.ofNullable(subscriptionId);
            return this;
        }        public RoutingServiceBusTopicEndpointPropertiesArgs build() {
            return new RoutingServiceBusTopicEndpointPropertiesArgs(authenticationType, connectionString, endpointUri, entityPath, id, name, resourceGroup, subscriptionId);
        }
    }
}
