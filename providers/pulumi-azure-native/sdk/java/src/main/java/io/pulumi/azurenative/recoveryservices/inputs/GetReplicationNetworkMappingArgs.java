// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationNetworkMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplicationNetworkMappingArgs Empty = new GetReplicationNetworkMappingArgs();

    @InputImport(name="fabricName", required=true)
    private final String fabricName;

    public String getFabricName() {
        return this.fabricName;
    }

    @InputImport(name="networkMappingName", required=true)
    private final String networkMappingName;

    public String getNetworkMappingName() {
        return this.networkMappingName;
    }

    @InputImport(name="networkName", required=true)
    private final String networkName;

    public String getNetworkName() {
        return this.networkName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceName", required=true)
    private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public GetReplicationNetworkMappingArgs(
        String fabricName,
        String networkMappingName,
        String networkName,
        String resourceGroupName,
        String resourceName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.networkMappingName = Objects.requireNonNull(networkMappingName, "expected parameter 'networkMappingName' to be non-null");
        this.networkName = Objects.requireNonNull(networkName, "expected parameter 'networkName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetReplicationNetworkMappingArgs() {
        this.fabricName = null;
        this.networkMappingName = null;
        this.networkName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationNetworkMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricName;
        private String networkMappingName;
        private String networkName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationNetworkMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.networkMappingName = defaults.networkMappingName;
    	      this.networkName = defaults.networkName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setNetworkMappingName(String networkMappingName) {
            this.networkMappingName = Objects.requireNonNull(networkMappingName);
            return this;
        }

        public Builder setNetworkName(String networkName) {
            this.networkName = Objects.requireNonNull(networkName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public GetReplicationNetworkMappingArgs build() {
            return new GetReplicationNetworkMappingArgs(fabricName, networkMappingName, networkName, resourceGroupName, resourceName);
        }
    }
}
