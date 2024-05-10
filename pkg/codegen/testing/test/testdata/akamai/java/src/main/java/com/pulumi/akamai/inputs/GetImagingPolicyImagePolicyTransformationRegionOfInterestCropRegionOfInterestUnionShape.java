// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShape;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape Empty = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape();

    @Import(name="shapes", required=true)
    private List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShape> shapes;

    public List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShape> shapes() {
        return this.shapes;
    }

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape() {}

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape $) {
        this.shapes = $.shapes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape(Objects.requireNonNull(defaults));
        }

        public Builder shapes(List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShape> shapes) {
            $.shapes = shapes;
            return this;
        }

        public Builder shapes(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShape... shapes) {
            return shapes(List.of(shapes));
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape build() {
            if ($.shapes == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShape", "shapes");
            }
            return $;
        }
    }

}
