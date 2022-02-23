// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.logz.inputs.IdentityPropertiesArgs;
import io.pulumi.azurenative.logz.inputs.MonitorPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricsSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricsSourceArgs Empty = new MetricsSourceArgs();

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
     * Metrics Account resource name
     * 
     */
    @InputImport(name="metricsSourceName")
      private final @Nullable Input<String> metricsSourceName;

    public Input<String> getMetricsSourceName() {
        return this.metricsSourceName == null ? Input.empty() : this.metricsSourceName;
    }

    /**
     * Monitor resource name
     * 
     */
    @InputImport(name="monitorName", required=true)
      private final Input<String> monitorName;

    public Input<String> getMonitorName() {
        return this.monitorName;
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

    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public MetricsSourceArgs(
        @Nullable Input<IdentityPropertiesArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<String> metricsSourceName,
        Input<String> monitorName,
        @Nullable Input<MonitorPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.identity = identity;
        this.location = location;
        this.metricsSourceName = metricsSourceName;
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private MetricsSourceArgs() {
        this.identity = Input.empty();
        this.location = Input.empty();
        this.metricsSourceName = Input.empty();
        this.monitorName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IdentityPropertiesArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<String> metricsSourceName;
        private Input<String> monitorName;
        private @Nullable Input<MonitorPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricsSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.metricsSourceName = defaults.metricsSourceName;
    	      this.monitorName = defaults.monitorName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
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

        public Builder setMetricsSourceName(@Nullable Input<String> metricsSourceName) {
            this.metricsSourceName = metricsSourceName;
            return this;
        }

        public Builder setMetricsSourceName(@Nullable String metricsSourceName) {
            this.metricsSourceName = Input.ofNullable(metricsSourceName);
            return this;
        }

        public Builder setMonitorName(Input<String> monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }

        public Builder setMonitorName(String monitorName) {
            this.monitorName = Input.of(Objects.requireNonNull(monitorName));
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public MetricsSourceArgs build() {
            return new MetricsSourceArgs(identity, location, metricsSourceName, monitorName, properties, resourceGroupName, tags);
        }
    }
}
