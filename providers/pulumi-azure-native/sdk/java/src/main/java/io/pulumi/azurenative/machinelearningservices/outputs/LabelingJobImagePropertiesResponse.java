// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LabelingJobImagePropertiesResponse {
    /**
     * Annotation type of image labeling tasks.
     * 
     */
    private final @Nullable String annotationType;
    /**
     * Media type of data asset.
     * 
     */
    private final String mediaType;

    @CustomType.Constructor
    private LabelingJobImagePropertiesResponse(
        @CustomType.Parameter("annotationType") @Nullable String annotationType,
        @CustomType.Parameter("mediaType") String mediaType) {
        this.annotationType = annotationType;
        this.mediaType = mediaType;
    }

    /**
     * Annotation type of image labeling tasks.
     * 
    */
    public Optional<String> getAnnotationType() {
        return Optional.ofNullable(this.annotationType);
    }
    /**
     * Media type of data asset.
     * 
    */
    public String getMediaType() {
        return this.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobImagePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String annotationType;
        private String mediaType;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobImagePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationType = defaults.annotationType;
    	      this.mediaType = defaults.mediaType;
        }

        public Builder annotationType(@Nullable String annotationType) {
            this.annotationType = annotationType;
            return this;
        }
        public Builder mediaType(String mediaType) {
            this.mediaType = Objects.requireNonNull(mediaType);
            return this;
        }        public LabelingJobImagePropertiesResponse build() {
            return new LabelingJobImagePropertiesResponse(annotationType, mediaType);
        }
    }
}
