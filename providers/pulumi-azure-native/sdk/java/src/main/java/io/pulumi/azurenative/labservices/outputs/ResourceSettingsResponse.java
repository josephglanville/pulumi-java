// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.ReferenceVmResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSettingsResponse {
    private final Integer cores;
    private final @Nullable String galleryImageResourceId;
    private final String id;
    private final String imageName;
    private final ReferenceVmResponse referenceVm;
    private final @Nullable String size;

    @OutputCustomType.Constructor({"cores","galleryImageResourceId","id","imageName","referenceVm","size"})
    private ResourceSettingsResponse(
        Integer cores,
        @Nullable String galleryImageResourceId,
        String id,
        String imageName,
        ReferenceVmResponse referenceVm,
        @Nullable String size) {
        this.cores = Objects.requireNonNull(cores);
        this.galleryImageResourceId = galleryImageResourceId;
        this.id = Objects.requireNonNull(id);
        this.imageName = Objects.requireNonNull(imageName);
        this.referenceVm = Objects.requireNonNull(referenceVm);
        this.size = size;
    }

    public Integer getCores() {
        return this.cores;
    }
    public Optional<String> getGalleryImageResourceId() {
        return Optional.ofNullable(this.galleryImageResourceId);
    }
    public String getId() {
        return this.id;
    }
    public String getImageName() {
        return this.imageName;
    }
    public ReferenceVmResponse getReferenceVm() {
        return this.referenceVm;
    }
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cores;
        private @Nullable String galleryImageResourceId;
        private String id;
        private String imageName;
        private ReferenceVmResponse referenceVm;
        private @Nullable String size;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cores = defaults.cores;
    	      this.galleryImageResourceId = defaults.galleryImageResourceId;
    	      this.id = defaults.id;
    	      this.imageName = defaults.imageName;
    	      this.referenceVm = defaults.referenceVm;
    	      this.size = defaults.size;
        }

        public Builder setCores(Integer cores) {
            this.cores = Objects.requireNonNull(cores);
            return this;
        }

        public Builder setGalleryImageResourceId(@Nullable String galleryImageResourceId) {
            this.galleryImageResourceId = galleryImageResourceId;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder setReferenceVm(ReferenceVmResponse referenceVm) {
            this.referenceVm = Objects.requireNonNull(referenceVm);
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public ResourceSettingsResponse build() {
            return new ResourceSettingsResponse(cores, galleryImageResourceId, id, imageName, referenceVm, size);
        }
    }
}
