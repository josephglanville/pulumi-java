// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.azurenative.hybridnetwork.outputs.DataDiskResponse;
import io.pulumi.azurenative.hybridnetwork.outputs.ImageReferenceResponse;
import io.pulumi.azurenative.hybridnetwork.outputs.OsDiskResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageProfileResponse {
    private final @Nullable List<DataDiskResponse> dataDisks;
    private final @Nullable ImageReferenceResponse imageReference;
    private final @Nullable OsDiskResponse osDisk;

    @OutputCustomType.Constructor({"dataDisks","imageReference","osDisk"})
    private StorageProfileResponse(
        @Nullable List<DataDiskResponse> dataDisks,
        @Nullable ImageReferenceResponse imageReference,
        @Nullable OsDiskResponse osDisk) {
        this.dataDisks = dataDisks;
        this.imageReference = imageReference;
        this.osDisk = osDisk;
    }

    public List<DataDiskResponse> getDataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }
    public Optional<ImageReferenceResponse> getImageReference() {
        return Optional.ofNullable(this.imageReference);
    }
    public Optional<OsDiskResponse> getOsDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataDiskResponse> dataDisks;
        private @Nullable ImageReferenceResponse imageReference;
        private @Nullable OsDiskResponse osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.imageReference = defaults.imageReference;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder setDataDisks(@Nullable List<DataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setImageReference(@Nullable ImageReferenceResponse imageReference) {
            this.imageReference = imageReference;
            return this;
        }

        public Builder setOsDisk(@Nullable OsDiskResponse osDisk) {
            this.osDisk = osDisk;
            return this;
        }

        public StorageProfileResponse build() {
            return new StorageProfileResponse(dataDisks, imageReference, osDisk);
        }
    }
}
