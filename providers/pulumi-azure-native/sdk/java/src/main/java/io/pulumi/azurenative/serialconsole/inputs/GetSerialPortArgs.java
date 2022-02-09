// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.serialconsole.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSerialPortArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSerialPortArgs Empty = new GetSerialPortArgs();

    @InputImport(name="parentResource", required=true)
    private final String parentResource;

    public String getParentResource() {
        return this.parentResource;
    }

    @InputImport(name="parentResourceType", required=true)
    private final String parentResourceType;

    public String getParentResourceType() {
        return this.parentResourceType;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceProviderNamespace", required=true)
    private final String resourceProviderNamespace;

    public String getResourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    @InputImport(name="serialPort", required=true)
    private final String serialPort;

    public String getSerialPort() {
        return this.serialPort;
    }

    public GetSerialPortArgs(
        String parentResource,
        String parentResourceType,
        String resourceGroupName,
        String resourceProviderNamespace,
        String serialPort) {
        this.parentResource = Objects.requireNonNull(parentResource, "expected parameter 'parentResource' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace, "expected parameter 'resourceProviderNamespace' to be non-null");
        this.serialPort = Objects.requireNonNull(serialPort, "expected parameter 'serialPort' to be non-null");
    }

    private GetSerialPortArgs() {
        this.parentResource = null;
        this.parentResourceType = null;
        this.resourceGroupName = null;
        this.resourceProviderNamespace = null;
        this.serialPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSerialPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parentResource;
        private String parentResourceType;
        private String resourceGroupName;
        private String resourceProviderNamespace;
        private String serialPort;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSerialPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parentResource = defaults.parentResource;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceProviderNamespace = defaults.resourceProviderNamespace;
    	      this.serialPort = defaults.serialPort;
        }

        public Builder setParentResource(String parentResource) {
            this.parentResource = Objects.requireNonNull(parentResource);
            return this;
        }

        public Builder setParentResourceType(String parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceProviderNamespace(String resourceProviderNamespace) {
            this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace);
            return this;
        }

        public Builder setSerialPort(String serialPort) {
            this.serialPort = Objects.requireNonNull(serialPort);
            return this;
        }

        public GetSerialPortArgs build() {
            return new GetSerialPortArgs(parentResource, parentResourceType, resourceGroupName, resourceProviderNamespace, serialPort);
        }
    }
}
