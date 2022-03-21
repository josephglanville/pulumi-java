// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * volumeDevice describes a mapping of a raw block device within a container.
 * 
 */
public final class VolumeDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeDeviceArgs Empty = new VolumeDeviceArgs();

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * 
     */
    @Import(name="devicePath", required=true)
      private final Output<String> devicePath;

    public Output<String> getDevicePath() {
        return this.devicePath;
    }

    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public VolumeDeviceArgs(
        Output<String> devicePath,
        Output<String> name) {
        this.devicePath = Objects.requireNonNull(devicePath, "expected parameter 'devicePath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private VolumeDeviceArgs() {
        this.devicePath = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> devicePath;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePath = defaults.devicePath;
    	      this.name = defaults.name;
        }

        public Builder devicePath(Output<String> devicePath) {
            this.devicePath = Objects.requireNonNull(devicePath);
            return this;
        }
        public Builder devicePath(String devicePath) {
            this.devicePath = Output.of(Objects.requireNonNull(devicePath));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public VolumeDeviceArgs build() {
            return new VolumeDeviceArgs(devicePath, name);
        }
    }
}
