// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.BoundingPolyResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ImageAnnotationResponse {
    /**
     * The list of polygons outlining the sensitive regions in the image.
     * 
     */
    private final List<BoundingPolyResponse> boundingPolys;
    /**
     * 0-based index of the image frame. For example, an image frame in a DICOM instance.
     * 
     */
    private final Integer frameIndex;

    @CustomType.Constructor
    private ImageAnnotationResponse(
        @CustomType.Parameter("boundingPolys") List<BoundingPolyResponse> boundingPolys,
        @CustomType.Parameter("frameIndex") Integer frameIndex) {
        this.boundingPolys = boundingPolys;
        this.frameIndex = frameIndex;
    }

    /**
     * The list of polygons outlining the sensitive regions in the image.
     * 
    */
    public List<BoundingPolyResponse> getBoundingPolys() {
        return this.boundingPolys;
    }
    /**
     * 0-based index of the image frame. For example, an image frame in a DICOM instance.
     * 
    */
    public Integer getFrameIndex() {
        return this.frameIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageAnnotationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BoundingPolyResponse> boundingPolys;
        private Integer frameIndex;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageAnnotationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boundingPolys = defaults.boundingPolys;
    	      this.frameIndex = defaults.frameIndex;
        }

        public Builder boundingPolys(List<BoundingPolyResponse> boundingPolys) {
            this.boundingPolys = Objects.requireNonNull(boundingPolys);
            return this;
        }
        public Builder boundingPolys(BoundingPolyResponse... boundingPolys) {
            return boundingPolys(List.of(boundingPolys));
        }
        public Builder frameIndex(Integer frameIndex) {
            this.frameIndex = Objects.requireNonNull(frameIndex);
            return this;
        }        public ImageAnnotationResponse build() {
            return new ImageAnnotationResponse(boundingPolys, frameIndex);
        }
    }
}
