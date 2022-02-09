// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStaticSitePrivateEndpointConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStaticSitePrivateEndpointConnectionArgs Empty = new GetStaticSitePrivateEndpointConnectionArgs();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="privateEndpointConnectionName", required=true)
    private final String privateEndpointConnectionName;

    public String getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetStaticSitePrivateEndpointConnectionArgs(
        String name,
        String privateEndpointConnectionName,
        String resourceGroupName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetStaticSitePrivateEndpointConnectionArgs() {
        this.name = null;
        this.privateEndpointConnectionName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticSitePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String privateEndpointConnectionName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticSitePrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnectionName(String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetStaticSitePrivateEndpointConnectionArgs build() {
            return new GetStaticSitePrivateEndpointConnectionArgs(name, privateEndpointConnectionName, resourceGroupName);
        }
    }
}
