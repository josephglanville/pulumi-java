// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.ConnectionGatewayDefinitionPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionGatewayArgs Empty = new ConnectionGatewayArgs();

    /**
     * The connection gateway name
     * 
     */
    @Import(name="connectionGatewayName")
      private final @Nullable Output<String> connectionGatewayName;

    public Output<String> getConnectionGatewayName() {
        return this.connectionGatewayName == null ? Output.empty() : this.connectionGatewayName;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="properties")
      private final @Nullable Output<ConnectionGatewayDefinitionPropertiesArgs> properties;

    public Output<ConnectionGatewayDefinitionPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Subscription Id
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId == null ? Output.empty() : this.subscriptionId;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ConnectionGatewayArgs(
        @Nullable Output<String> connectionGatewayName,
        @Nullable Output<String> location,
        @Nullable Output<ConnectionGatewayDefinitionPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> subscriptionId,
        @Nullable Output<Map<String,String>> tags) {
        this.connectionGatewayName = connectionGatewayName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subscriptionId = subscriptionId;
        this.tags = tags;
    }

    private ConnectionGatewayArgs() {
        this.connectionGatewayName = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.subscriptionId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> connectionGatewayName;
        private @Nullable Output<String> location;
        private @Nullable Output<ConnectionGatewayDefinitionPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> subscriptionId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionGatewayName = defaults.connectionGatewayName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
        }

        public Builder connectionGatewayName(@Nullable Output<String> connectionGatewayName) {
            this.connectionGatewayName = connectionGatewayName;
            return this;
        }
        public Builder connectionGatewayName(@Nullable String connectionGatewayName) {
            this.connectionGatewayName = Output.ofNullable(connectionGatewayName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<ConnectionGatewayDefinitionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ConnectionGatewayDefinitionPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Output.ofNullable(subscriptionId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ConnectionGatewayArgs build() {
            return new ConnectionGatewayArgs(connectionGatewayName, location, properties, resourceGroupName, subscriptionId, tags);
        }
    }
}
