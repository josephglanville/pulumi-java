// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight;

import io.pulumi.azurenative.hdinsight.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The name of the cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the private endpoint connection.
     * 
     */
    @InputImport(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Output.empty() : this.privateEndpointConnectionName;
    }

    /**
     * The private link service connection state.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState", required=true)
      private final Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        Output<String> clusterName,
        @Nullable Output<String> privateEndpointConnectionName,
        Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        Output<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.clusterName = Output.empty();
        this.privateEndpointConnectionName = Output.empty();
        this.privateLinkServiceConnectionState = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> privateEndpointConnectionName;
        private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder privateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Output.ofNullable(privateEndpointConnectionName);
            return this;
        }

        public Builder privateLinkServiceConnectionState(Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }

        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Output.of(Objects.requireNonNull(privateLinkServiceConnectionState));
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
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(clusterName, privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName);
        }
    }
}
