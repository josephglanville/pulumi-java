// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.serialconsole;

import io.pulumi.azurenative.serialconsole.enums.SerialPortState;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SerialPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final SerialPortArgs Empty = new SerialPortArgs();

    /**
     * The resource name, or subordinate path, for the parent of the serial port. For example: the name of the virtual machine.
     * 
     */
    @InputImport(name="parentResource", required=true)
      private final Input<String> parentResource;

    public Input<String> getParentResource() {
        return this.parentResource;
    }

    /**
     * The resource type of the parent resource.  For example: 'virtualMachines' or 'virtualMachineScaleSets'
     * 
     */
    @InputImport(name="parentResourceType", required=true)
      private final Input<String> parentResourceType;

    public Input<String> getParentResourceType() {
        return this.parentResourceType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The namespace of the resource provider.
     * 
     */
    @InputImport(name="resourceProviderNamespace", required=true)
      private final Input<String> resourceProviderNamespace;

    public Input<String> getResourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    /**
     * The name of the serial port to create.
     * 
     */
    @InputImport(name="serialPort")
      private final @Nullable Input<String> serialPort;

    public Input<String> getSerialPort() {
        return this.serialPort == null ? Input.empty() : this.serialPort;
    }

    /**
     * Specifies whether the port is enabled for a serial console connection.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<SerialPortState> state;

    public Input<SerialPortState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public SerialPortArgs(
        Input<String> parentResource,
        Input<String> parentResourceType,
        Input<String> resourceGroupName,
        Input<String> resourceProviderNamespace,
        @Nullable Input<String> serialPort,
        @Nullable Input<SerialPortState> state) {
        this.parentResource = Objects.requireNonNull(parentResource, "expected parameter 'parentResource' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace, "expected parameter 'resourceProviderNamespace' to be non-null");
        this.serialPort = serialPort;
        this.state = state;
    }

    private SerialPortArgs() {
        this.parentResource = Input.empty();
        this.parentResourceType = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceProviderNamespace = Input.empty();
        this.serialPort = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SerialPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> parentResource;
        private Input<String> parentResourceType;
        private Input<String> resourceGroupName;
        private Input<String> resourceProviderNamespace;
        private @Nullable Input<String> serialPort;
        private @Nullable Input<SerialPortState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SerialPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parentResource = defaults.parentResource;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceProviderNamespace = defaults.resourceProviderNamespace;
    	      this.serialPort = defaults.serialPort;
    	      this.state = defaults.state;
        }

        public Builder setParentResource(Input<String> parentResource) {
            this.parentResource = Objects.requireNonNull(parentResource);
            return this;
        }

        public Builder setParentResource(String parentResource) {
            this.parentResource = Input.of(Objects.requireNonNull(parentResource));
            return this;
        }

        public Builder setParentResourceType(Input<String> parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }

        public Builder setParentResourceType(String parentResourceType) {
            this.parentResourceType = Input.of(Objects.requireNonNull(parentResourceType));
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

        public Builder setResourceProviderNamespace(Input<String> resourceProviderNamespace) {
            this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace);
            return this;
        }

        public Builder setResourceProviderNamespace(String resourceProviderNamespace) {
            this.resourceProviderNamespace = Input.of(Objects.requireNonNull(resourceProviderNamespace));
            return this;
        }

        public Builder setSerialPort(@Nullable Input<String> serialPort) {
            this.serialPort = serialPort;
            return this;
        }

        public Builder setSerialPort(@Nullable String serialPort) {
            this.serialPort = Input.ofNullable(serialPort);
            return this;
        }

        public Builder setState(@Nullable Input<SerialPortState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable SerialPortState state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public SerialPortArgs build() {
            return new SerialPortArgs(parentResource, parentResourceType, resourceGroupName, resourceProviderNamespace, serialPort, state);
        }
    }
}
