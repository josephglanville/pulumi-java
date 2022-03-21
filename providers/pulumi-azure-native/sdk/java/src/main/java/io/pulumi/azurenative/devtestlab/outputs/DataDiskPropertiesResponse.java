// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.AttachNewDataDiskOptionsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataDiskPropertiesResponse {
    /**
     * Specifies options to attach a new disk to the virtual machine.
     * 
     */
    private final @Nullable AttachNewDataDiskOptionsResponse attachNewDataDiskOptions;
    /**
     * Specifies the existing lab disk id to attach to virtual machine.
     * 
     */
    private final @Nullable String existingLabDiskId;
    /**
     * Caching option for a data disk (i.e. None, ReadOnly, ReadWrite).
     * 
     */
    private final @Nullable String hostCaching;

    @CustomType.Constructor
    private DataDiskPropertiesResponse(
        @CustomType.Parameter("attachNewDataDiskOptions") @Nullable AttachNewDataDiskOptionsResponse attachNewDataDiskOptions,
        @CustomType.Parameter("existingLabDiskId") @Nullable String existingLabDiskId,
        @CustomType.Parameter("hostCaching") @Nullable String hostCaching) {
        this.attachNewDataDiskOptions = attachNewDataDiskOptions;
        this.existingLabDiskId = existingLabDiskId;
        this.hostCaching = hostCaching;
    }

    /**
     * Specifies options to attach a new disk to the virtual machine.
     * 
    */
    public Optional<AttachNewDataDiskOptionsResponse> getAttachNewDataDiskOptions() {
        return Optional.ofNullable(this.attachNewDataDiskOptions);
    }
    /**
     * Specifies the existing lab disk id to attach to virtual machine.
     * 
    */
    public Optional<String> getExistingLabDiskId() {
        return Optional.ofNullable(this.existingLabDiskId);
    }
    /**
     * Caching option for a data disk (i.e. None, ReadOnly, ReadWrite).
     * 
    */
    public Optional<String> getHostCaching() {
        return Optional.ofNullable(this.hostCaching);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AttachNewDataDiskOptionsResponse attachNewDataDiskOptions;
        private @Nullable String existingLabDiskId;
        private @Nullable String hostCaching;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachNewDataDiskOptions = defaults.attachNewDataDiskOptions;
    	      this.existingLabDiskId = defaults.existingLabDiskId;
    	      this.hostCaching = defaults.hostCaching;
        }

        public Builder attachNewDataDiskOptions(@Nullable AttachNewDataDiskOptionsResponse attachNewDataDiskOptions) {
            this.attachNewDataDiskOptions = attachNewDataDiskOptions;
            return this;
        }
        public Builder existingLabDiskId(@Nullable String existingLabDiskId) {
            this.existingLabDiskId = existingLabDiskId;
            return this;
        }
        public Builder hostCaching(@Nullable String hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }        public DataDiskPropertiesResponse build() {
            return new DataDiskPropertiesResponse(attachNewDataDiskOptions, existingLabDiskId, hostCaching);
        }
    }
}
