// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServiceRegistryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceRegistryArgs Empty = new GetServiceRegistryArgs();

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

    @InputImport(name="serviceRegistryName", required=true)
    private final String serviceRegistryName;

    public String getServiceRegistryName() {
        return this.serviceRegistryName;
    }

    public GetServiceRegistryArgs(
        String resourceGroupName,
        String serviceName,
        String serviceRegistryName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceRegistryName = Objects.requireNonNull(serviceRegistryName, "expected parameter 'serviceRegistryName' to be non-null");
    }

    private GetServiceRegistryArgs() {
        this.resourceGroupName = null;
        this.serviceName = null;
        this.serviceRegistryName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serviceName;
        private String serviceRegistryName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceRegistryName = defaults.serviceRegistryName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceRegistryName(String serviceRegistryName) {
            this.serviceRegistryName = Objects.requireNonNull(serviceRegistryName);
            return this;
        }

        public GetServiceRegistryArgs build() {
            return new GetServiceRegistryArgs(resourceGroupName, serviceName, serviceRegistryName);
        }
    }
}
