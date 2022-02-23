// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetEbsBlockDevice;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetBlockDeviceMapping extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetBlockDeviceMapping Empty = new SpotFleetBlockDeviceMapping();

    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="ebs")
      private final @Nullable SpotFleetEbsBlockDevice ebs;

    public Optional<SpotFleetEbsBlockDevice> getEbs() {
        return this.ebs == null ? Optional.empty() : Optional.ofNullable(this.ebs);
    }

    @InputImport(name="noDevice")
      private final @Nullable String noDevice;

    public Optional<String> getNoDevice() {
        return this.noDevice == null ? Optional.empty() : Optional.ofNullable(this.noDevice);
    }

    @InputImport(name="virtualName")
      private final @Nullable String virtualName;

    public Optional<String> getVirtualName() {
        return this.virtualName == null ? Optional.empty() : Optional.ofNullable(this.virtualName);
    }

    public SpotFleetBlockDeviceMapping(
        String deviceName,
        @Nullable SpotFleetEbsBlockDevice ebs,
        @Nullable String noDevice,
        @Nullable String virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private SpotFleetBlockDeviceMapping() {
        this.deviceName = null;
        this.ebs = null;
        this.noDevice = null;
        this.virtualName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private @Nullable SpotFleetEbsBlockDevice ebs;
        private @Nullable String noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setEbs(@Nullable SpotFleetEbsBlockDevice ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder setNoDevice(@Nullable String noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public SpotFleetBlockDeviceMapping build() {
            return new SpotFleetBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
