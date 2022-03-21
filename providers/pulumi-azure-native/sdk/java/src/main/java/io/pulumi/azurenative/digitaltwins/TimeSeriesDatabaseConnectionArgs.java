// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins;

import io.pulumi.azurenative.digitaltwins.inputs.AzureDataExplorerConnectionPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TimeSeriesDatabaseConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeSeriesDatabaseConnectionArgs Empty = new TimeSeriesDatabaseConnectionArgs();

    /**
     * Properties of a specific time series database connection.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<AzureDataExplorerConnectionPropertiesArgs> properties;

    public Output<AzureDataExplorerConnectionPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the DigitalTwinsInstance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the DigitalTwinsInstance.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    /**
     * Name of time series database connection.
     * 
     */
    @Import(name="timeSeriesDatabaseConnectionName")
      private final @Nullable Output<String> timeSeriesDatabaseConnectionName;

    public Output<String> getTimeSeriesDatabaseConnectionName() {
        return this.timeSeriesDatabaseConnectionName == null ? Output.empty() : this.timeSeriesDatabaseConnectionName;
    }

    public TimeSeriesDatabaseConnectionArgs(
        @Nullable Output<AzureDataExplorerConnectionPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> resourceName,
        @Nullable Output<String> timeSeriesDatabaseConnectionName) {
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.timeSeriesDatabaseConnectionName = timeSeriesDatabaseConnectionName;
    }

    private TimeSeriesDatabaseConnectionArgs() {
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
        this.timeSeriesDatabaseConnectionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesDatabaseConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AzureDataExplorerConnectionPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;
        private @Nullable Output<String> timeSeriesDatabaseConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesDatabaseConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.timeSeriesDatabaseConnectionName = defaults.timeSeriesDatabaseConnectionName;
        }

        public Builder properties(@Nullable Output<AzureDataExplorerConnectionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable AzureDataExplorerConnectionPropertiesArgs properties) {
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
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public Builder timeSeriesDatabaseConnectionName(@Nullable Output<String> timeSeriesDatabaseConnectionName) {
            this.timeSeriesDatabaseConnectionName = timeSeriesDatabaseConnectionName;
            return this;
        }
        public Builder timeSeriesDatabaseConnectionName(@Nullable String timeSeriesDatabaseConnectionName) {
            this.timeSeriesDatabaseConnectionName = Output.ofNullable(timeSeriesDatabaseConnectionName);
            return this;
        }        public TimeSeriesDatabaseConnectionArgs build() {
            return new TimeSeriesDatabaseConnectionArgs(properties, resourceGroupName, resourceName, timeSeriesDatabaseConnectionName);
        }
    }
}
