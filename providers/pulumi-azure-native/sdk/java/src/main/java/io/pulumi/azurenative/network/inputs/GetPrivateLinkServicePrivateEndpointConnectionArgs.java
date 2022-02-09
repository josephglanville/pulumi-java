// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivateLinkServicePrivateEndpointConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkServicePrivateEndpointConnectionArgs Empty = new GetPrivateLinkServicePrivateEndpointConnectionArgs();

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

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

    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetPrivateLinkServicePrivateEndpointConnectionArgs(
        @Nullable String expand,
        String peConnectionName,
        String resourceGroupName,
        String serviceName) {
        this.expand = expand;
        this.peConnectionName = Objects.requireNonNull(peConnectionName, "expected parameter 'peConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetPrivateLinkServicePrivateEndpointConnectionArgs() {
        this.expand = null;
        this.peConnectionName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkServicePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String peConnectionName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateLinkServicePrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.peConnectionName = defaults.peConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setPeConnectionName(String peConnectionName) {
            this.peConnectionName = Objects.requireNonNull(peConnectionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public GetPrivateLinkServicePrivateEndpointConnectionArgs build() {
            return new GetPrivateLinkServicePrivateEndpointConnectionArgs(expand, peConnectionName, resourceGroupName, serviceName);
        }
    }
}
