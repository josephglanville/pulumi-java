// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @Import(name="coreCount")
      private final @Nullable Output<Integer> coreCount;

    public Output<Integer> getCoreCount() {
        return this.coreCount == null ? Output.empty() : this.coreCount;
    }

    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs(
        @Nullable Output<Integer> coreCount,
        @Nullable Output<String> type) {
        this.coreCount = coreCount;
        this.type = type;
    }

    private RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs() {
        this.coreCount = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> coreCount;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder coreCount(@Nullable Output<Integer> coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Builder coreCount(@Nullable Integer coreCount) {
            this.coreCount = Output.ofNullable(coreCount);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs build() {
            return new RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs(coreCount, type);
        }
    }
}
