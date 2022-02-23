// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * On-prem disk details data.
 * 
 */
public final class DiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskDetailsResponse Empty = new DiskDetailsResponse();

    /**
     * The hard disk max size in MB.
     * 
     */
    @InputImport(name="maxSizeMB")
      private final @Nullable Double maxSizeMB;

    public Optional<Double> getMaxSizeMB() {
        return this.maxSizeMB == null ? Optional.empty() : Optional.ofNullable(this.maxSizeMB);
    }

    /**
     * The VHD Id.
     * 
     */
    @InputImport(name="vhdId")
      private final @Nullable String vhdId;

    public Optional<String> getVhdId() {
        return this.vhdId == null ? Optional.empty() : Optional.ofNullable(this.vhdId);
    }

    /**
     * The VHD name.
     * 
     */
    @InputImport(name="vhdName")
      private final @Nullable String vhdName;

    public Optional<String> getVhdName() {
        return this.vhdName == null ? Optional.empty() : Optional.ofNullable(this.vhdName);
    }

    /**
     * The type of the volume.
     * 
     */
    @InputImport(name="vhdType")
      private final @Nullable String vhdType;

    public Optional<String> getVhdType() {
        return this.vhdType == null ? Optional.empty() : Optional.ofNullable(this.vhdType);
    }

    public DiskDetailsResponse(
        @Nullable Double maxSizeMB,
        @Nullable String vhdId,
        @Nullable String vhdName,
        @Nullable String vhdType) {
        this.maxSizeMB = maxSizeMB;
        this.vhdId = vhdId;
        this.vhdName = vhdName;
        this.vhdType = vhdType;
    }

    private DiskDetailsResponse() {
        this.maxSizeMB = null;
        this.vhdId = null;
        this.vhdName = null;
        this.vhdType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double maxSizeMB;
        private @Nullable String vhdId;
        private @Nullable String vhdName;
        private @Nullable String vhdType;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSizeMB = defaults.maxSizeMB;
    	      this.vhdId = defaults.vhdId;
    	      this.vhdName = defaults.vhdName;
    	      this.vhdType = defaults.vhdType;
        }

        public Builder setMaxSizeMB(@Nullable Double maxSizeMB) {
            this.maxSizeMB = maxSizeMB;
            return this;
        }

        public Builder setVhdId(@Nullable String vhdId) {
            this.vhdId = vhdId;
            return this;
        }

        public Builder setVhdName(@Nullable String vhdName) {
            this.vhdName = vhdName;
            return this;
        }

        public Builder setVhdType(@Nullable String vhdType) {
            this.vhdType = vhdType;
            return this;
        }
        public DiskDetailsResponse build() {
            return new DiskDetailsResponse(maxSizeMB, vhdId, vhdName, vhdType);
        }
    }
}
