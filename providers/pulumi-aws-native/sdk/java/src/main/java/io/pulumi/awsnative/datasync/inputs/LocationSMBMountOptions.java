// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.awsnative.datasync.enums.LocationSMBMountOptionsVersion;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The mount options used by DataSync to access the SMB server.
 * 
 */
public final class LocationSMBMountOptions extends io.pulumi.resources.InvokeArgs {

    public static final LocationSMBMountOptions Empty = new LocationSMBMountOptions();

    /**
     * The specific SMB version that you want DataSync to use to mount your SMB share.
     * 
     */
    @InputImport(name="version")
      private final @Nullable LocationSMBMountOptionsVersion version;

    public Optional<LocationSMBMountOptionsVersion> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public LocationSMBMountOptions(@Nullable LocationSMBMountOptionsVersion version) {
        this.version = version;
    }

    private LocationSMBMountOptions() {
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationSMBMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LocationSMBMountOptionsVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationSMBMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder setVersion(@Nullable LocationSMBMountOptionsVersion version) {
            this.version = version;
            return this;
        }
        public LocationSMBMountOptions build() {
            return new LocationSMBMountOptions(version);
        }
    }
}
