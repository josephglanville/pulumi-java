// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.azurearcdata.inputs.DataControllerPropertiesArgs;
import io.pulumi.azurenative.azurearcdata.inputs.ExtendedLocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataControllerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataControllerArgs Empty = new DataControllerArgs();

    @InputImport(name="dataControllerName")
      private final @Nullable Output<String> dataControllerName;

    public Output<String> getDataControllerName() {
        return this.dataControllerName == null ? Output.empty() : this.dataControllerName;
    }

    /**
     * The extendedLocation of the resource.
     * 
     */
    @InputImport(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Output.empty() : this.extendedLocation;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The data controller's properties
     * 
     */
    @InputImport(name="properties", required=true)
      private final Output<DataControllerPropertiesArgs> properties;

    public Output<DataControllerPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DataControllerArgs(
        @Nullable Output<String> dataControllerName,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<String> location,
        Output<DataControllerPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.dataControllerName = dataControllerName;
        this.extendedLocation = extendedLocation;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private DataControllerArgs() {
        this.dataControllerName = Output.empty();
        this.extendedLocation = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataControllerName;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<String> location;
        private Output<DataControllerPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DataControllerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataControllerName = defaults.dataControllerName;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder dataControllerName(@Nullable Output<String> dataControllerName) {
            this.dataControllerName = dataControllerName;
            return this;
        }

        public Builder dataControllerName(@Nullable String dataControllerName) {
            this.dataControllerName = Output.ofNullable(dataControllerName);
            return this;
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Output.ofNullable(extendedLocation);
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

        public Builder properties(Output<DataControllerPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(DataControllerPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
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
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public DataControllerArgs build() {
            return new DataControllerArgs(dataControllerName, extendedLocation, location, properties, resourceGroupName, tags);
        }
    }
}
