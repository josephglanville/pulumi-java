// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.inputs.MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that determine whether magnetic store writes are enabled.
 * 
 */
public final class MagneticStoreWritePropertiesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MagneticStoreWritePropertiesPropertiesArgs Empty = new MagneticStoreWritePropertiesPropertiesArgs();

    /**
     * Boolean flag indicating whether magnetic store writes are enabled.
     * 
     */
    @InputImport(name="enableMagneticStoreWrites", required=true)
      private final Input<Boolean> enableMagneticStoreWrites;

    public Input<Boolean> getEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites;
    }

    /**
     * Location to store information about records that were asynchronously rejected during magnetic store writes.
     * 
     */
    @InputImport(name="magneticStoreRejectedDataLocation")
      private final @Nullable Input<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs> magneticStoreRejectedDataLocation;

    public Input<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs> getMagneticStoreRejectedDataLocation() {
        return this.magneticStoreRejectedDataLocation == null ? Input.empty() : this.magneticStoreRejectedDataLocation;
    }

    public MagneticStoreWritePropertiesPropertiesArgs(
        Input<Boolean> enableMagneticStoreWrites,
        @Nullable Input<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs> magneticStoreRejectedDataLocation) {
        this.enableMagneticStoreWrites = Objects.requireNonNull(enableMagneticStoreWrites, "expected parameter 'enableMagneticStoreWrites' to be non-null");
        this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
    }

    private MagneticStoreWritePropertiesPropertiesArgs() {
        this.enableMagneticStoreWrites = Input.empty();
        this.magneticStoreRejectedDataLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagneticStoreWritePropertiesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enableMagneticStoreWrites;
        private @Nullable Input<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs> magneticStoreRejectedDataLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(MagneticStoreWritePropertiesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableMagneticStoreWrites = defaults.enableMagneticStoreWrites;
    	      this.magneticStoreRejectedDataLocation = defaults.magneticStoreRejectedDataLocation;
        }

        public Builder setEnableMagneticStoreWrites(Input<Boolean> enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = Objects.requireNonNull(enableMagneticStoreWrites);
            return this;
        }

        public Builder setEnableMagneticStoreWrites(Boolean enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = Input.of(Objects.requireNonNull(enableMagneticStoreWrites));
            return this;
        }

        public Builder setMagneticStoreRejectedDataLocation(@Nullable Input<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs> magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
            return this;
        }

        public Builder setMagneticStoreRejectedDataLocation(@Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = Input.ofNullable(magneticStoreRejectedDataLocation);
            return this;
        }
        public MagneticStoreWritePropertiesPropertiesArgs build() {
            return new MagneticStoreWritePropertiesPropertiesArgs(enableMagneticStoreWrites, magneticStoreRejectedDataLocation);
        }
    }
}
