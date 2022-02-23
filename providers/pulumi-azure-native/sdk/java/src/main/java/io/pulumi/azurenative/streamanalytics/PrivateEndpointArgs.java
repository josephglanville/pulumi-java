// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.streamanalytics.inputs.PrivateEndpointPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointArgs Empty = new PrivateEndpointArgs();

    /**
     * The name of the cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @InputImport(name="privateEndpointName")
      private final @Nullable Input<String> privateEndpointName;

    public Input<String> getPrivateEndpointName() {
        return this.privateEndpointName == null ? Input.empty() : this.privateEndpointName;
    }

    /**
     * The properties associated with a private endpoint.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<PrivateEndpointPropertiesArgs> properties;

    public Input<PrivateEndpointPropertiesArgs> getProperties() {
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

    public PrivateEndpointArgs(
        Input<String> clusterName,
        @Nullable Input<String> privateEndpointName,
        @Nullable Input<PrivateEndpointPropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.privateEndpointName = privateEndpointName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointArgs() {
        this.clusterName = Input.empty();
        this.privateEndpointName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private @Nullable Input<String> privateEndpointName;
        private @Nullable Input<PrivateEndpointPropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setPrivateEndpointName(@Nullable Input<String> privateEndpointName) {
            this.privateEndpointName = privateEndpointName;
            return this;
        }

        public Builder setPrivateEndpointName(@Nullable String privateEndpointName) {
            this.privateEndpointName = Input.ofNullable(privateEndpointName);
            return this;
        }

        public Builder setProperties(@Nullable Input<PrivateEndpointPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable PrivateEndpointPropertiesArgs properties) {
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
        public PrivateEndpointArgs build() {
            return new PrivateEndpointArgs(clusterName, privateEndpointName, properties, resourceGroupName);
        }
    }
}
