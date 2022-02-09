// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionArgs Empty = new GetPrivateEndpointConnectionArgs();

    @InputImport(name="peConnectionName", required=true)
    private final String peConnectionName;

    public String getPeConnectionName() {
        return this.peConnectionName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="siteName", required=true)
    private final String siteName;

    public String getSiteName() {
        return this.siteName;
    }

    public GetPrivateEndpointConnectionArgs(
        String peConnectionName,
        String resourceGroupName,
        String siteName) {
        this.peConnectionName = Objects.requireNonNull(peConnectionName, "expected parameter 'peConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteName = Objects.requireNonNull(siteName, "expected parameter 'siteName' to be non-null");
    }

    private GetPrivateEndpointConnectionArgs() {
        this.peConnectionName = null;
        this.resourceGroupName = null;
        this.siteName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peConnectionName;
        private String resourceGroupName;
        private String siteName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peConnectionName = defaults.peConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteName = defaults.siteName;
        }

        public Builder setPeConnectionName(String peConnectionName) {
            this.peConnectionName = Objects.requireNonNull(peConnectionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSiteName(String siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }

        public GetPrivateEndpointConnectionArgs build() {
            return new GetPrivateEndpointConnectionArgs(peConnectionName, resourceGroupName, siteName);
        }
    }
}
