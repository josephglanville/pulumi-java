// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.inputs;

import io.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableMagneticStoreWritePropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableMagneticStoreWritePropertiesGetArgs Empty = new TableMagneticStoreWritePropertiesGetArgs();

    /**
     * A flag to enable magnetic store writes.
     * 
     */
    @Import(name="enableMagneticStoreWrites")
      private final @Nullable Output<Boolean> enableMagneticStoreWrites;

    public Output<Boolean> getEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites == null ? Output.empty() : this.enableMagneticStoreWrites;
    }

    /**
     * The location to write error reports for records rejected asynchronously during magnetic store writes. See Magnetic Store Rejected Data Location below for more details.
     * 
     */
    @Import(name="magneticStoreRejectedDataLocation")
      private final @Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> magneticStoreRejectedDataLocation;

    public Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> getMagneticStoreRejectedDataLocation() {
        return this.magneticStoreRejectedDataLocation == null ? Output.empty() : this.magneticStoreRejectedDataLocation;
    }

    public TableMagneticStoreWritePropertiesGetArgs(
        @Nullable Output<Boolean> enableMagneticStoreWrites,
        @Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> magneticStoreRejectedDataLocation) {
        this.enableMagneticStoreWrites = enableMagneticStoreWrites;
        this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
    }

    private TableMagneticStoreWritePropertiesGetArgs() {
        this.enableMagneticStoreWrites = Output.empty();
        this.magneticStoreRejectedDataLocation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMagneticStoreWritePropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableMagneticStoreWrites;
        private @Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> magneticStoreRejectedDataLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMagneticStoreWritePropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableMagneticStoreWrites = defaults.enableMagneticStoreWrites;
    	      this.magneticStoreRejectedDataLocation = defaults.magneticStoreRejectedDataLocation;
        }

        public Builder enableMagneticStoreWrites(@Nullable Output<Boolean> enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = enableMagneticStoreWrites;
            return this;
        }
        public Builder enableMagneticStoreWrites(@Nullable Boolean enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = Output.ofNullable(enableMagneticStoreWrites);
            return this;
        }
        public Builder magneticStoreRejectedDataLocation(@Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
            return this;
        }
        public Builder magneticStoreRejectedDataLocation(@Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = Output.ofNullable(magneticStoreRejectedDataLocation);
            return this;
        }        public TableMagneticStoreWritePropertiesGetArgs build() {
            return new TableMagneticStoreWritePropertiesGetArgs(enableMagneticStoreWrites, magneticStoreRejectedDataLocation);
        }
    }
}