// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.CustomApiPropertiesDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomApiArgs Empty = new CustomApiArgs();

    /**
     * API name
     * 
     */
    @InputImport(name="apiName")
      private final @Nullable Input<String> apiName;

    public Input<String> getApiName() {
        return this.apiName == null ? Input.empty() : this.apiName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Custom API properties
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<CustomApiPropertiesDefinitionArgs> properties;

    public Input<CustomApiPropertiesDefinitionArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Subscription Id
     * 
     */
    @InputImport(name="subscriptionId")
      private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CustomApiArgs(
        @Nullable Input<String> apiName,
        @Nullable Input<String> location,
        @Nullable Input<CustomApiPropertiesDefinitionArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> subscriptionId,
        @Nullable Input<Map<String,String>> tags) {
        this.apiName = apiName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subscriptionId = subscriptionId;
        this.tags = tags;
    }

    private CustomApiArgs() {
        this.apiName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.subscriptionId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiName;
        private @Nullable Input<String> location;
        private @Nullable Input<CustomApiPropertiesDefinitionArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> subscriptionId;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiName = defaults.apiName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
        }

        public Builder setApiName(@Nullable Input<String> apiName) {
            this.apiName = apiName;
            return this;
        }

        public Builder setApiName(@Nullable String apiName) {
            this.apiName = Input.ofNullable(apiName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<CustomApiPropertiesDefinitionArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable CustomApiPropertiesDefinitionArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSubscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public CustomApiArgs build() {
            return new CustomApiArgs(apiName, location, properties, resourceGroupName, subscriptionId, tags);
        }
    }
}
