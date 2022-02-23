// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.autonomousdevelopmentplatform;

import io.pulumi.azurenative.autonomousdevelopmentplatform.inputs.DataPoolLocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Data Pool
     * 
     */
    @InputImport(name="dataPoolName")
      private final @Nullable Input<String> dataPoolName;

    public Input<String> getDataPoolName() {
        return this.dataPoolName == null ? Input.empty() : this.dataPoolName;
    }

    /**
     * Gets or sets the collection of locations where Data Pool resources should be created
     * 
     */
    @InputImport(name="locations", required=true)
      private final Input<List<DataPoolLocationArgs>> locations;

    public Input<List<DataPoolLocationArgs>> getLocations() {
        return this.locations;
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

    public DataPoolArgs(
        Input<String> accountName,
        @Nullable Input<String> dataPoolName,
        Input<List<DataPoolLocationArgs>> locations,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataPoolName = dataPoolName;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DataPoolArgs() {
        this.accountName = Input.empty();
        this.dataPoolName = Input.empty();
        this.locations = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> dataPoolName;
        private Input<List<DataPoolLocationArgs>> locations;
        private Input<String> resourceGroupName;

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

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDataPoolName(@Nullable Input<String> dataPoolName) {
            this.dataPoolName = dataPoolName;
            return this;
        }

        public Builder setDataPoolName(@Nullable String dataPoolName) {
            this.dataPoolName = Input.ofNullable(dataPoolName);
            return this;
        }

        public Builder setLocations(Input<List<DataPoolLocationArgs>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setLocations(List<DataPoolLocationArgs> locations) {
            this.locations = Input.of(Objects.requireNonNull(locations));
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
        public DataPoolArgs build() {
            return new DataPoolArgs(accountName, dataPoolName, locations, resourceGroupName);
        }
    }
}
