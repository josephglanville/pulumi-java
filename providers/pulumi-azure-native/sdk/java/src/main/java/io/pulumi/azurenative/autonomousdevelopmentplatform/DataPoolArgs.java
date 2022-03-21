// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.autonomousdevelopmentplatform;

import io.pulumi.azurenative.autonomousdevelopmentplatform.inputs.DataPoolLocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataPoolArgs Empty = new DataPoolArgs();

    /**
     * The name of the ADP account
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Data Pool
     * 
     */
    @Import(name="dataPoolName")
      private final @Nullable Output<String> dataPoolName;

    public Output<String> getDataPoolName() {
        return this.dataPoolName == null ? Output.empty() : this.dataPoolName;
    }

    /**
     * Gets or sets the collection of locations where Data Pool resources should be created
     * 
     */
    @Import(name="locations", required=true)
      private final Output<List<DataPoolLocationArgs>> locations;

    public Output<List<DataPoolLocationArgs>> getLocations() {
        return this.locations;
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

    public DataPoolArgs(
        Output<String> accountName,
        @Nullable Output<String> dataPoolName,
        Output<List<DataPoolLocationArgs>> locations,
        Output<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataPoolName = dataPoolName;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DataPoolArgs() {
        this.accountName = Output.empty();
        this.dataPoolName = Output.empty();
        this.locations = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> dataPoolName;
        private Output<List<DataPoolLocationArgs>> locations;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataPoolName = defaults.dataPoolName;
    	      this.locations = defaults.locations;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder dataPoolName(@Nullable Output<String> dataPoolName) {
            this.dataPoolName = dataPoolName;
            return this;
        }
        public Builder dataPoolName(@Nullable String dataPoolName) {
            this.dataPoolName = Output.ofNullable(dataPoolName);
            return this;
        }
        public Builder locations(Output<List<DataPoolLocationArgs>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(List<DataPoolLocationArgs> locations) {
            this.locations = Output.of(Objects.requireNonNull(locations));
            return this;
        }
        public Builder locations(DataPoolLocationArgs... locations) {
            return locations(List.of(locations));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public DataPoolArgs build() {
            return new DataPoolArgs(accountName, dataPoolName, locations, resourceGroupName);
        }
    }
}
