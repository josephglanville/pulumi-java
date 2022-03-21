// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DiskStorageAccountTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, or StandardSSD_ZRS.
 * 
 */
public final class DiskSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskSkuArgs Empty = new DiskSkuArgs();

    /**
     * The sku name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<Either<String,DiskStorageAccountTypes>> name;

    public Output<Either<String,DiskStorageAccountTypes>> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public DiskSkuArgs(@Nullable Output<Either<String,DiskStorageAccountTypes>> name) {
        this.name = name;
    }

    private DiskSkuArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DiskStorageAccountTypes>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<Either<String,DiskStorageAccountTypes>> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable Either<String,DiskStorageAccountTypes> name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public DiskSkuArgs build() {
            return new DiskSkuArgs(name);
        }
    }
}
