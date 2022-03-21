// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PerInstanceConfigPreservedStateDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PerInstanceConfigPreservedStateDiskGetArgs Empty = new PerInstanceConfigPreservedStateDiskGetArgs();

    /**
     * A value that prescribes what should happen to the stateful disk when the VM instance is deleted.
     * The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * `NEVER` - detach the disk when the VM is deleted, but do not delete the disk.
     * `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently
     * deleted from the instance group.
     * Default value is `NEVER`.
     * Possible values are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * 
     */
    @Import(name="deleteRule")
      private final @Nullable Output<String> deleteRule;

    public Output<String> getDeleteRule() {
        return this.deleteRule == null ? Output.empty() : this.deleteRule;
    }

    /**
     * A unique device name that is reflected into the /dev/ tree of a Linux operating system running within the instance.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The mode of the disk.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * The URI of an existing persistent disk to attach under the specified device-name in the format
     * `projects/project-id/zones/zone/disks/disk-name`.
     * 
     */
    @Import(name="source", required=true)
      private final Output<String> source;

    public Output<String> getSource() {
        return this.source;
    }

    public PerInstanceConfigPreservedStateDiskGetArgs(
        @Nullable Output<String> deleteRule,
        Output<String> deviceName,
        @Nullable Output<String> mode,
        Output<String> source) {
        this.deleteRule = deleteRule;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.mode = mode;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private PerInstanceConfigPreservedStateDiskGetArgs() {
        this.deleteRule = Output.empty();
        this.deviceName = Output.empty();
        this.mode = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerInstanceConfigPreservedStateDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deleteRule;
        private Output<String> deviceName;
        private @Nullable Output<String> mode;
        private Output<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(PerInstanceConfigPreservedStateDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.deviceName = defaults.deviceName;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder deleteRule(@Nullable Output<String> deleteRule) {
            this.deleteRule = deleteRule;
            return this;
        }
        public Builder deleteRule(@Nullable String deleteRule) {
            this.deleteRule = Output.ofNullable(deleteRule);
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }        public PerInstanceConfigPreservedStateDiskGetArgs build() {
            return new PerInstanceConfigPreservedStateDiskGetArgs(deleteRule, deviceName, mode, source);
        }
    }
}
