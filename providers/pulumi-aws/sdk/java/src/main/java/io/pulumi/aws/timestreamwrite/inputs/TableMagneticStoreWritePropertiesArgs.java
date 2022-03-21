// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.inputs;

import io.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableMagneticStoreWritePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableMagneticStoreWritePropertiesArgs Empty = new TableMagneticStoreWritePropertiesArgs();

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
      private final @Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs> magneticStoreRejectedDataLocation;

    public Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs> getMagneticStoreRejectedDataLocation() {
        return this.magneticStoreRejectedDataLocation == null ? Output.empty() : this.magneticStoreRejectedDataLocation;
    }

    public TableMagneticStoreWritePropertiesArgs(
        @Nullable Output<Boolean> enableMagneticStoreWrites,
        @Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs> magneticStoreRejectedDataLocation) {
        this.enableMagneticStoreWrites = enableMagneticStoreWrites;
        this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
    }

    private TableMagneticStoreWritePropertiesArgs() {
        this.enableMagneticStoreWrites = Output.empty();
        this.magneticStoreRejectedDataLocation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMagneticStoreWritePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableMagneticStoreWrites;
        private @Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs> magneticStoreRejectedDataLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMagneticStoreWritePropertiesArgs defaults) {
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
        public Builder magneticStoreRejectedDataLocation(@Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs> magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
            return this;
        }
        public Builder magneticStoreRejectedDataLocation(@Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = Output.ofNullable(magneticStoreRejectedDataLocation);
            return this;
        }        public TableMagneticStoreWritePropertiesArgs build() {
            return new TableMagneticStoreWritePropertiesArgs(enableMagneticStoreWrites, magneticStoreRejectedDataLocation);
        }
    }
}
