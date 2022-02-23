// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute;

import io.pulumi.azurenative.hybridcompute.inputs.HybridComputePrivateLinkScopePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateLinkScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkScopeArgs Empty = new PrivateLinkScopeArgs();

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
     * Properties that define a Azure Arc PrivateLinkScope resource.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<HybridComputePrivateLinkScopePropertiesArgs> properties;

    public Input<HybridComputePrivateLinkScopePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Arc PrivateLinkScope resource.
     * 
     */
    @InputImport(name="scopeName")
      private final @Nullable Input<String> scopeName;

    public Input<String> getScopeName() {
        return this.scopeName == null ? Input.empty() : this.scopeName;
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

    public PrivateLinkScopeArgs(
        @Nullable Input<String> location,
        @Nullable Input<HybridComputePrivateLinkScopePropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> scopeName,
        @Nullable Input<Map<String,String>> tags) {
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scopeName = scopeName;
        this.tags = tags;
    }

    private PrivateLinkScopeArgs() {
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scopeName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<HybridComputePrivateLinkScopePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> scopeName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeName = defaults.scopeName;
    	      this.tags = defaults.tags;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<HybridComputePrivateLinkScopePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable HybridComputePrivateLinkScopePropertiesArgs properties) {
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

        public Builder setScopeName(@Nullable Input<String> scopeName) {
            this.scopeName = scopeName;
            return this;
        }

        public Builder setScopeName(@Nullable String scopeName) {
            this.scopeName = Input.ofNullable(scopeName);
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
        public PrivateLinkScopeArgs build() {
            return new PrivateLinkScopeArgs(location, properties, resourceGroupName, scopeName, tags);
        }
    }
}
