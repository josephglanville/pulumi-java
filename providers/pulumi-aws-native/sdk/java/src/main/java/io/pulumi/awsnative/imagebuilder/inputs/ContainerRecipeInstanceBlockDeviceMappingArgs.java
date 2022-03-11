// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines block device mappings for the instance used to configure your image.
 * 
 */
public final class ContainerRecipeInstanceBlockDeviceMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeInstanceBlockDeviceMappingArgs Empty = new ContainerRecipeInstanceBlockDeviceMappingArgs();

    /**
     * The device to which these mappings apply.
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    /**
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * 
     */
    @InputImport(name="ebs")
      private final @Nullable Output<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> ebs;

    public Output<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> getEbs() {
        return this.ebs == null ? Output.empty() : this.ebs;
    }

    /**
     * Use to remove a mapping from the parent image.
     * 
     */
    @InputImport(name="noDevice")
      private final @Nullable Output<String> noDevice;

    public Output<String> getNoDevice() {
        return this.noDevice == null ? Output.empty() : this.noDevice;
    }

    /**
     * Use to manage instance ephemeral devices.
     * 
     */
    @InputImport(name="virtualName")
      private final @Nullable Output<String> virtualName;

    public Output<String> getVirtualName() {
        return this.virtualName == null ? Output.empty() : this.virtualName;
    }

    public ContainerRecipeInstanceBlockDeviceMappingArgs(
        @Nullable Output<String> deviceName,
        @Nullable Output<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> ebs,
        @Nullable Output<String> noDevice,
        @Nullable Output<String> virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private ContainerRecipeInstanceBlockDeviceMappingArgs() {
        this.deviceName = Output.empty();
        this.ebs = Output.empty();
        this.noDevice = Output.empty();
        this.virtualName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeInstanceBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private @Nullable Output<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> ebs;
        private @Nullable Output<String> noDevice;
        private @Nullable Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeInstanceBlockDeviceMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
            return this;
        }

        public Builder ebs(@Nullable Output<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder ebs(@Nullable ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs ebs) {
            this.ebs = Output.ofNullable(ebs);
            return this;
        }

        public Builder noDevice(@Nullable Output<String> noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder noDevice(@Nullable String noDevice) {
            this.noDevice = Output.ofNullable(noDevice);
            return this;
        }

        public Builder virtualName(@Nullable Output<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = Output.ofNullable(virtualName);
            return this;
        }
        public ContainerRecipeInstanceBlockDeviceMappingArgs build() {
            return new ContainerRecipeInstanceBlockDeviceMappingArgs(deviceName, ebs, noDevice, virtualName);
        }
    }
}
