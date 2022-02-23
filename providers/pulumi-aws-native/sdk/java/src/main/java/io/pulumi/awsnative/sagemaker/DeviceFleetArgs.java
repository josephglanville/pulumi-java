// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.DeviceFleetEdgeOutputConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.DeviceFleetTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceFleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceFleetArgs Empty = new DeviceFleetArgs();

    /**
     * Description for the edge device fleet
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the edge device fleet
     * 
     */
    @InputImport(name="deviceFleetName")
      private final @Nullable Input<String> deviceFleetName;

    public Input<String> getDeviceFleetName() {
        return this.deviceFleetName == null ? Input.empty() : this.deviceFleetName;
    }

    /**
     * S3 bucket and an ecryption key id (if available) to store outputs for the fleet
     * 
     */
    @InputImport(name="outputConfig", required=true)
      private final Input<DeviceFleetEdgeOutputConfigArgs> outputConfig;

    public Input<DeviceFleetEdgeOutputConfigArgs> getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * Role associated with the device fleet
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Associate tags with the resource
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<DeviceFleetTagArgs>> tags;

    public Input<List<DeviceFleetTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DeviceFleetArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> deviceFleetName,
        Input<DeviceFleetEdgeOutputConfigArgs> outputConfig,
        Input<String> roleArn,
        @Nullable Input<List<DeviceFleetTagArgs>> tags) {
        this.description = description;
        this.deviceFleetName = deviceFleetName;
        this.outputConfig = Objects.requireNonNull(outputConfig, "expected parameter 'outputConfig' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private DeviceFleetArgs() {
        this.description = Input.empty();
        this.deviceFleetName = Input.empty();
        this.outputConfig = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> deviceFleetName;
        private Input<DeviceFleetEdgeOutputConfigArgs> outputConfig;
        private Input<String> roleArn;
        private @Nullable Input<List<DeviceFleetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceFleetName = defaults.deviceFleetName;
    	      this.outputConfig = defaults.outputConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDeviceFleetName(@Nullable Input<String> deviceFleetName) {
            this.deviceFleetName = deviceFleetName;
            return this;
        }

        public Builder setDeviceFleetName(@Nullable String deviceFleetName) {
            this.deviceFleetName = Input.ofNullable(deviceFleetName);
            return this;
        }

        public Builder setOutputConfig(Input<DeviceFleetEdgeOutputConfigArgs> outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }

        public Builder setOutputConfig(DeviceFleetEdgeOutputConfigArgs outputConfig) {
            this.outputConfig = Input.of(Objects.requireNonNull(outputConfig));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<List<DeviceFleetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DeviceFleetTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DeviceFleetArgs build() {
            return new DeviceFleetArgs(description, deviceFleetName, outputConfig, roleArn, tags);
        }
    }
}
