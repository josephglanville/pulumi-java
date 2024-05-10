// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImage;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImage;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImage {
    private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage> boxImages;
    private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage> circleImages;
    private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImage> textImages;
    private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImage> urlImages;

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImage() {}
    public List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage> boxImages() {
        return this.boxImages == null ? List.of() : this.boxImages;
    }
    public List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage> circleImages() {
        return this.circleImages == null ? List.of() : this.circleImages;
    }
    public List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImage> textImages() {
        return this.textImages == null ? List.of() : this.textImages;
    }
    public List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImage> urlImages() {
        return this.urlImages == null ? List.of() : this.urlImages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage> boxImages;
        private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage> circleImages;
        private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImage> textImages;
        private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImage> urlImages;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boxImages = defaults.boxImages;
    	      this.circleImages = defaults.circleImages;
    	      this.textImages = defaults.textImages;
    	      this.urlImages = defaults.urlImages;
        }

        @CustomType.Setter
        public Builder boxImages(@Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage> boxImages) {

            this.boxImages = boxImages;
            return this;
        }
        public Builder boxImages(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage... boxImages) {
            return boxImages(List.of(boxImages));
        }
        @CustomType.Setter
        public Builder circleImages(@Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage> circleImages) {

            this.circleImages = circleImages;
            return this;
        }
        public Builder circleImages(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImage... circleImages) {
            return circleImages(List.of(circleImages));
        }
        @CustomType.Setter
        public Builder textImages(@Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImage> textImages) {

            this.textImages = textImages;
            return this;
        }
        public Builder textImages(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImage... textImages) {
            return textImages(List.of(textImages));
        }
        @CustomType.Setter
        public Builder urlImages(@Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImage> urlImages) {

            this.urlImages = urlImages;
            return this;
        }
        public Builder urlImages(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImage... urlImages) {
            return urlImages(List.of(urlImages));
        }
        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImage build() {
            final var _resultValue = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImage();
            _resultValue.boxImages = boxImages;
            _resultValue.circleImages = circleImages;
            _resultValue.textImages = textImages;
            _resultValue.urlImages = urlImages;
            return _resultValue;
        }
    }
}
