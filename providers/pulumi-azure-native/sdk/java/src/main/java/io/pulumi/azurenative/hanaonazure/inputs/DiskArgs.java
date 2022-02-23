// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the disk information for the HANA instance
 * 
 */
public final class DiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskArgs Empty = new DiskArgs();

    /**
     * Specifies the size of an empty data disk in gigabytes.
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Input.empty() : this.diskSizeGB;
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public DiskArgs(
        @Nullable Input<Integer> diskSizeGB,
        @Nullable Input<String> name) {
        this.diskSizeGB = diskSizeGB;
        this.name = name;
    }

    private DiskArgs() {
        this.diskSizeGB = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> diskSizeGB;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.name = defaults.name;
        }

        public Builder setDiskSizeGB(@Nullable Input<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Input.ofNullable(diskSizeGB);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public DiskArgs build() {
            return new DiskArgs(diskSizeGB, name);
        }
    }
}
