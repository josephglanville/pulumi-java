// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPacketCaptureArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPacketCaptureArgs Empty = new GetPacketCaptureArgs();

    /**
     * The name of the network watcher.
     * 
     */
    @InputImport(name="networkWatcherName", required=true)
      private final String networkWatcherName;

    public String getNetworkWatcherName() {
        return this.networkWatcherName;
    }

    /**
     * The name of the packet capture session.
     * 
     */
    @InputImport(name="packetCaptureName", required=true)
      private final String packetCaptureName;

    public String getPacketCaptureName() {
        return this.packetCaptureName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPacketCaptureArgs(
        String networkWatcherName,
        String packetCaptureName,
        String resourceGroupName) {
        this.networkWatcherName = Objects.requireNonNull(networkWatcherName, "expected parameter 'networkWatcherName' to be non-null");
        this.packetCaptureName = Objects.requireNonNull(packetCaptureName, "expected parameter 'packetCaptureName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPacketCaptureArgs() {
        this.networkWatcherName = null;
        this.packetCaptureName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPacketCaptureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkWatcherName;
        private String packetCaptureName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPacketCaptureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkWatcherName = defaults.networkWatcherName;
    	      this.packetCaptureName = defaults.packetCaptureName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setNetworkWatcherName(String networkWatcherName) {
            this.networkWatcherName = Objects.requireNonNull(networkWatcherName);
            return this;
        }

        public Builder setPacketCaptureName(String packetCaptureName) {
            this.packetCaptureName = Objects.requireNonNull(packetCaptureName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetPacketCaptureArgs build() {
            return new GetPacketCaptureArgs(networkWatcherName, packetCaptureName, resourceGroupName);
        }
    }
}
