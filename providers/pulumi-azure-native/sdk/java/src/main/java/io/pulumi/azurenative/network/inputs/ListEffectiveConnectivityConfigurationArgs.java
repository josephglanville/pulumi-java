// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListEffectiveConnectivityConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListEffectiveConnectivityConfigurationArgs Empty = new ListEffectiveConnectivityConfigurationArgs();

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    @InputImport(name="skipToken")
      private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    /**
     * The name of the virtual network.
     * 
     */
    @InputImport(name="virtualNetworkName", required=true)
      private final String virtualNetworkName;

    public String getVirtualNetworkName() {
        return this.virtualNetworkName;
    }

    public ListEffectiveConnectivityConfigurationArgs(
        String resourceGroupName,
        @Nullable String skipToken,
        String virtualNetworkName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.skipToken = skipToken;
        this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
    }

    private ListEffectiveConnectivityConfigurationArgs() {
        this.resourceGroupName = null;
        this.skipToken = null;
        this.virtualNetworkName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListEffectiveConnectivityConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private @Nullable String skipToken;
        private String virtualNetworkName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListEffectiveConnectivityConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skipToken = defaults.skipToken;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSkipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }

        public Builder setVirtualNetworkName(String virtualNetworkName) {
            this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName);
            return this;
        }
        public ListEffectiveConnectivityConfigurationArgs build() {
            return new ListEffectiveConnectivityConfigurationArgs(resourceGroupName, skipToken, virtualNetworkName);
        }
    }
}
