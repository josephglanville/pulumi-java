// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.azurenative.storagesync.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The name of the private endpoint connection associated with the Azure resource
     * 
     */
    @Import(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Output.empty() : this.privateEndpointConnectionName;
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
      private final Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
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

    /**
     * The name of the storage sync service name within the specified resource group.
     * 
     */
    @Import(name="storageSyncServiceName", required=true)
      private final Output<String> storageSyncServiceName;

    public Output<String> getStorageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Output<String> privateEndpointConnectionName,
        Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        Output<String> resourceGroupName,
        Output<String> storageSyncServiceName) {
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.privateEndpointConnectionName = Output.empty();
        this.privateLinkServiceConnectionState = Output.empty();
        this.resourceGroupName = Output.empty();
        this.storageSyncServiceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> privateEndpointConnectionName;
        private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private Output<String> resourceGroupName;
        private Output<String> storageSyncServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageSyncServiceName = defaults.storageSyncServiceName;
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
        public Builder storageSyncServiceName(Output<String> storageSyncServiceName) {
            this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName);
            return this;
        }
        public Builder storageSyncServiceName(String storageSyncServiceName) {
            this.storageSyncServiceName = Output.of(Objects.requireNonNull(storageSyncServiceName));
            return this;
        }        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName, storageSyncServiceName);
        }
    }
}
