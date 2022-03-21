// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.ImageRecipeEbsInstanceBlockDeviceSpecification;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageRecipeInstanceBlockDeviceMapping {
    /**
     * The device to which these mappings apply.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * 
     */
    private final @Nullable ImageRecipeEbsInstanceBlockDeviceSpecification ebs;
    /**
     * Use to remove a mapping from the parent image.
     * 
     */
    private final @Nullable String noDevice;
    /**
     * Use to manage instance ephemeral devices.
     * 
     */
    private final @Nullable String virtualName;

    @CustomType.Constructor
    private ImageRecipeInstanceBlockDeviceMapping(
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("ebs") @Nullable ImageRecipeEbsInstanceBlockDeviceSpecification ebs,
        @CustomType.Parameter("noDevice") @Nullable String noDevice,
        @CustomType.Parameter("virtualName") @Nullable String virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * The device to which these mappings apply.
     * 
    */
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * 
    */
    public Optional<ImageRecipeEbsInstanceBlockDeviceSpecification> getEbs() {
        return Optional.ofNullable(this.ebs);
    }
    /**
     * Use to remove a mapping from the parent image.
     * 
    */
    public Optional<String> getNoDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * Use to manage instance ephemeral devices.
     * 
    */
    public Optional<String> getVirtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeInstanceBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable ImageRecipeEbsInstanceBlockDeviceSpecification ebs;
        private @Nullable String noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeInstanceBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder ebs(@Nullable ImageRecipeEbsInstanceBlockDeviceSpecification ebs) {
            this.ebs = ebs;
            return this;
        }
        public Builder noDevice(@Nullable String noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }        public ImageRecipeInstanceBlockDeviceMapping build() {
            return new ImageRecipeInstanceBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
