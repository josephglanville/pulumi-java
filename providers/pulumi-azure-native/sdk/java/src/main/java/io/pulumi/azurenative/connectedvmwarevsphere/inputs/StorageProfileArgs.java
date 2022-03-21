// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.VirtualDiskArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the resource properties.
 * 
 */
public final class StorageProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * Gets or sets the list of virtual disks associated with the virtual machine.
     * 
     */
    @Import(name="disks")
      private final @Nullable Output<List<VirtualDiskArgs>> disks;

    public Output<List<VirtualDiskArgs>> getDisks() {
        return this.disks == null ? Output.empty() : this.disks;
    }

    public StorageProfileArgs(@Nullable Output<List<VirtualDiskArgs>> disks) {
        this.disks = disks;
    }

    private StorageProfileArgs() {
        this.disks = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<VirtualDiskArgs>> disks;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
        }

        public Builder disks(@Nullable Output<List<VirtualDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }
        public Builder disks(@Nullable List<VirtualDiskArgs> disks) {
            this.disks = Output.ofNullable(disks);
            return this;
        }
        public Builder disks(VirtualDiskArgs... disks) {
            return disks(List.of(disks));
        }        public StorageProfileArgs build() {
            return new StorageProfileArgs(disks);
        }
    }
}
