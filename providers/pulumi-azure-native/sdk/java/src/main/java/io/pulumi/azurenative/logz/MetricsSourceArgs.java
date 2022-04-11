// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.logz.inputs.IdentityPropertiesArgs;
import io.pulumi.azurenative.logz.inputs.MonitorPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricsSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricsSourceArgs Empty = new MetricsSourceArgs();

    @Import(name="identity")
      private final @Nullable Output<IdentityPropertiesArgs> identity;

    public Output<IdentityPropertiesArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Metrics Account resource name
     * 
     */
    @Import(name="metricsSourceName")
      private final @Nullable Output<String> metricsSourceName;

    public Output<String> getMetricsSourceName() {
        return this.metricsSourceName == null ? Codegen.empty() : this.metricsSourceName;
    }

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
      private final Output<String> monitorName;

    public Output<String> getMonitorName() {
        return this.monitorName;
    }

    /**
     * Properties specific to the monitor resource.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<MonitorPropertiesArgs> properties;

    public Output<MonitorPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public MetricsSourceArgs(
        @Nullable Output<IdentityPropertiesArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<String> metricsSourceName,
        Output<String> monitorName,
        @Nullable Output<MonitorPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.identity = identity;
        this.location = location;
        this.metricsSourceName = metricsSourceName;
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private MetricsSourceArgs() {
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.metricsSourceName = Codegen.empty();
        this.monitorName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IdentityPropertiesArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<String> metricsSourceName;
        private Output<String> monitorName;
        private @Nullable Output<MonitorPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

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

        public Builder identity(@Nullable Output<IdentityPropertiesArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable IdentityPropertiesArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder metricsSourceName(@Nullable Output<String> metricsSourceName) {
            this.metricsSourceName = metricsSourceName;
            return this;
        }
        public Builder metricsSourceName(@Nullable String metricsSourceName) {
            this.metricsSourceName = Codegen.ofNullable(metricsSourceName);
            return this;
        }
        public Builder monitorName(Output<String> monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }
        public Builder monitorName(String monitorName) {
            this.monitorName = Output.of(Objects.requireNonNull(monitorName));
            return this;
        }
        public Builder properties(@Nullable Output<MonitorPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable MonitorPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public MetricsSourceArgs build() {
            return new MetricsSourceArgs(identity, location, metricsSourceName, monitorName, properties, resourceGroupName, tags);
        }
    }
}
