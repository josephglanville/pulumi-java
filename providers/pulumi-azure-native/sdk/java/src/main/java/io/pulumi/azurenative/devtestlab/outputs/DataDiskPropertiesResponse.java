// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.AttachNewDataDiskOptionsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataDiskPropertiesResponse {
    private final @Nullable AttachNewDataDiskOptionsResponse attachNewDataDiskOptions;
    private final @Nullable String existingLabDiskId;
    private final @Nullable String hostCaching;

    @OutputCustomType.Constructor({"attachNewDataDiskOptions","existingLabDiskId","hostCaching"})
    private DataDiskPropertiesResponse(
        @Nullable AttachNewDataDiskOptionsResponse attachNewDataDiskOptions,
        @Nullable String existingLabDiskId,
        @Nullable String hostCaching) {
        this.attachNewDataDiskOptions = attachNewDataDiskOptions;
        this.existingLabDiskId = existingLabDiskId;
        this.hostCaching = hostCaching;
    }

    public Optional<AttachNewDataDiskOptionsResponse> getAttachNewDataDiskOptions() {
        return Optional.ofNullable(this.attachNewDataDiskOptions);
    }
    public Optional<String> getExistingLabDiskId() {
        return Optional.ofNullable(this.existingLabDiskId);
    }
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

        public Builder setAttachNewDataDiskOptions(@Nullable AttachNewDataDiskOptionsResponse attachNewDataDiskOptions) {
            this.attachNewDataDiskOptions = attachNewDataDiskOptions;
            return this;
        }

        public Builder setExistingLabDiskId(@Nullable String existingLabDiskId) {
            this.existingLabDiskId = existingLabDiskId;
            return this;
        }

        public Builder setHostCaching(@Nullable String hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }

        public DataDiskPropertiesResponse build() {
            return new DataDiskPropertiesResponse(attachNewDataDiskOptions, existingLabDiskId, hostCaching);
        }
    }
}
