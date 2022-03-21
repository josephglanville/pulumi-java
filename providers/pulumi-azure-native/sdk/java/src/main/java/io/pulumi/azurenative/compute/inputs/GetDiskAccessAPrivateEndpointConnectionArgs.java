// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiskAccessAPrivateEndpointConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiskAccessAPrivateEndpointConnectionArgs Empty = new GetDiskAccessAPrivateEndpointConnectionArgs();

    /**
     * The name of the disk access resource that is being created. The name can't be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    @Import(name="diskAccessName", required=true)
      private final String diskAccessName;

    public String getDiskAccessName() {
        return this.diskAccessName;
    }

    /**
     * The name of the private endpoint connection
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
      private final String privateEndpointConnectionName;

    public String getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDiskAccessAPrivateEndpointConnectionArgs(
        String diskAccessName,
        String privateEndpointConnectionName,
        String resourceGroupName) {
        this.diskAccessName = Objects.requireNonNull(diskAccessName, "expected parameter 'diskAccessName' to be non-null");
        this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDiskAccessAPrivateEndpointConnectionArgs() {
        this.diskAccessName = null;
        this.privateEndpointConnectionName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskAccessAPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskAccessName;
        private String privateEndpointConnectionName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskAccessAPrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskAccessName = defaults.diskAccessName;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder diskAccessName(String diskAccessName) {
            this.diskAccessName = Objects.requireNonNull(diskAccessName);
            return this;
        }
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetDiskAccessAPrivateEndpointConnectionArgs build() {
            return new GetDiskAccessAPrivateEndpointConnectionArgs(diskAccessName, privateEndpointConnectionName, resourceGroupName);
        }
    }
}
