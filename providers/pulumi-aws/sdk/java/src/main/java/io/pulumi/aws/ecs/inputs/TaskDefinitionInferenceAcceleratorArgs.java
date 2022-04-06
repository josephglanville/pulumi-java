// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TaskDefinitionInferenceAcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionInferenceAcceleratorArgs Empty = new TaskDefinitionInferenceAcceleratorArgs();

    /**
     * Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Elastic Inference accelerator type to use.
     * 
     */
    @Import(name="deviceType", required=true)
      private final Output<String> deviceType;

    public Output<String> getDeviceType() {
        return this.deviceType;
    }

    public TaskDefinitionInferenceAcceleratorArgs(
        Output<String> deviceName,
        Output<String> deviceType) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.deviceType = Objects.requireNonNull(deviceType, "expected parameter 'deviceType' to be non-null");
    }

    private TaskDefinitionInferenceAcceleratorArgs() {
        this.deviceName = Output.empty();
        this.deviceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionInferenceAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deviceName;
        private Output<String> deviceType;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionInferenceAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.deviceType = defaults.deviceType;
        }

        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder deviceType(Output<String> deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }
        public Builder deviceType(String deviceType) {
            this.deviceType = Output.of(Objects.requireNonNull(deviceType));
            return this;
        }        public TaskDefinitionInferenceAcceleratorArgs build() {
            return new TaskDefinitionInferenceAcceleratorArgs(deviceName, deviceType);
        }
    }
}