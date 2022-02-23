// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog;

import io.pulumi.azurenative.datadog.inputs.IdentityPropertiesArgs;
import io.pulumi.azurenative.datadog.inputs.MonitorPropertiesArgs;
import io.pulumi.azurenative.datadog.inputs.ResourceSkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MonitorArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitorArgs Empty = new MonitorArgs();

    @InputImport(name="identity")
      private final @Nullable Input<IdentityPropertiesArgs> identity;

    public Input<IdentityPropertiesArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Monitor resource name
     * 
     */
    @InputImport(name="monitorName")
      private final @Nullable Input<String> monitorName;

    public Input<String> getMonitorName() {
        return this.monitorName == null ? Input.empty() : this.monitorName;
    }

    /**
     * Properties specific to the monitor resource.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<MonitorPropertiesArgs> properties;

    public Input<MonitorPropertiesArgs> getProperties() {
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

    @InputImport(name="sku")
      private final @Nullable Input<ResourceSkuArgs> sku;

    public Input<ResourceSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public MonitorArgs(
        @Nullable Input<IdentityPropertiesArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<String> monitorName,
        @Nullable Input<MonitorPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<ResourceSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.identity = identity;
        this.location = location;
        this.monitorName = monitorName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private MonitorArgs() {
        this.identity = Input.empty();
        this.location = Input.empty();
        this.monitorName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IdentityPropertiesArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<String> monitorName;
        private @Nullable Input<MonitorPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<ResourceSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.monitorName = defaults.monitorName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setIdentity(@Nullable Input<IdentityPropertiesArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityPropertiesArgs identity) {
            this.identity = Input.ofNullable(identity);
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

        public Builder setMonitorName(@Nullable Input<String> monitorName) {
            this.monitorName = monitorName;
            return this;
        }

        public Builder setMonitorName(@Nullable String monitorName) {
            this.monitorName = Input.ofNullable(monitorName);
            return this;
        }

        public Builder setProperties(@Nullable Input<MonitorPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable MonitorPropertiesArgs properties) {
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

        public Builder setSku(@Nullable Input<ResourceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable ResourceSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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
        public MonitorArgs build() {
            return new MonitorArgs(identity, location, monitorName, properties, resourceGroupName, sku, tags);
        }
    }
}
