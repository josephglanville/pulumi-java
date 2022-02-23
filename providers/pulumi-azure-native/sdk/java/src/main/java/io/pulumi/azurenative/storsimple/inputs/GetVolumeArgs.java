// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVolumeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVolumeArgs Empty = new GetVolumeArgs();

    /**
     * The device name
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The manager name
     * 
     */
    @InputImport(name="managerName", required=true)
      private final String managerName;

    public String getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The volume container name.
     * 
     */
    @InputImport(name="volumeContainerName", required=true)
      private final String volumeContainerName;

    public String getVolumeContainerName() {
        return this.volumeContainerName;
    }

    /**
     * The volume name.
     * 
     */
    @InputImport(name="volumeName", required=true)
      private final String volumeName;

    public String getVolumeName() {
        return this.volumeName;
    }

    public GetVolumeArgs(
        String deviceName,
        String managerName,
        String resourceGroupName,
        String volumeContainerName,
        String volumeName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.volumeContainerName = Objects.requireNonNull(volumeContainerName, "expected parameter 'volumeContainerName' to be non-null");
        this.volumeName = Objects.requireNonNull(volumeName, "expected parameter 'volumeName' to be non-null");
    }

    private GetVolumeArgs() {
        this.deviceName = null;
        this.managerName = null;
        this.resourceGroupName = null;
        this.volumeContainerName = null;
        this.volumeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String managerName;
        private String resourceGroupName;
        private String volumeContainerName;
        private String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.volumeContainerName = defaults.volumeContainerName;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setManagerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVolumeContainerName(String volumeContainerName) {
            this.volumeContainerName = Objects.requireNonNull(volumeContainerName);
            return this;
        }

        public Builder setVolumeName(String volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }
        public GetVolumeArgs build() {
            return new GetVolumeArgs(deviceName, managerName, resourceGroupName, volumeContainerName, volumeName);
        }
    }
}
