// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatefulDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatefulDiskGetArgs Empty = new RegionInstanceGroupManagerStatefulDiskGetArgs();

    /**
     * , A value that prescribes what should happen to the stateful disk when the VM instance is deleted. The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`. `NEVER` - detach the disk when the VM is deleted, but do not delete the disk. `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently deleted from the instance group. The default is `NEVER`.
     * 
     */
    @Import(name="deleteRule")
      private final @Nullable Output<String> deleteRule;

    public Output<String> getDeleteRule() {
        return this.deleteRule == null ? Codegen.empty() : this.deleteRule;
    }

    /**
     * , The device name of the disk to be attached.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    public RegionInstanceGroupManagerStatefulDiskGetArgs(
        @Nullable Output<String> deleteRule,
        Output<String> deviceName) {
        this.deleteRule = deleteRule;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
    }

    private RegionInstanceGroupManagerStatefulDiskGetArgs() {
        this.deleteRule = Codegen.empty();
        this.deviceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatefulDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deleteRule;
        private Output<String> deviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatefulDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.deviceName = defaults.deviceName;
        }

        public Builder deleteRule(@Nullable Output<String> deleteRule) {
            this.deleteRule = deleteRule;
            return this;
        }
        public Builder deleteRule(@Nullable String deleteRule) {
            this.deleteRule = Codegen.ofNullable(deleteRule);
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }        public RegionInstanceGroupManagerStatefulDiskGetArgs build() {
            return new RegionInstanceGroupManagerStatefulDiskGetArgs(deleteRule, deviceName);
        }
    }
}
