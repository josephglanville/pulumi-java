// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetImageShapesImageShapeCompatibilityMemoryConstraint;
import com.pulumi.oci.Core.outputs.GetImageShapesImageShapeCompatibilityOcpuConstraint;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImageShapesImageShapeCompatibility {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
     * 
     */
    private final String imageId;
    /**
     * @return For a flexible image and shape, the amount of memory supported for instances that use this image.
     * 
     */
    private final List<GetImageShapesImageShapeCompatibilityMemoryConstraint> memoryConstraints;
    /**
     * @return OCPU options for an image and shape.
     * 
     */
    private final List<GetImageShapesImageShapeCompatibilityOcpuConstraint> ocpuConstraints;
    /**
     * @return The shape name.
     * 
     */
    private final String shape;

    @CustomType.Constructor
    private GetImageShapesImageShapeCompatibility(
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("memoryConstraints") List<GetImageShapesImageShapeCompatibilityMemoryConstraint> memoryConstraints,
        @CustomType.Parameter("ocpuConstraints") List<GetImageShapesImageShapeCompatibilityOcpuConstraint> ocpuConstraints,
        @CustomType.Parameter("shape") String shape) {
        this.imageId = imageId;
        this.memoryConstraints = memoryConstraints;
        this.ocpuConstraints = ocpuConstraints;
        this.shape = shape;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return For a flexible image and shape, the amount of memory supported for instances that use this image.
     * 
     */
    public List<GetImageShapesImageShapeCompatibilityMemoryConstraint> memoryConstraints() {
        return this.memoryConstraints;
    }
    /**
     * @return OCPU options for an image and shape.
     * 
     */
    public List<GetImageShapesImageShapeCompatibilityOcpuConstraint> ocpuConstraints() {
        return this.ocpuConstraints;
    }
    /**
     * @return The shape name.
     * 
     */
    public String shape() {
        return this.shape;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageShapesImageShapeCompatibility defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageId;
        private List<GetImageShapesImageShapeCompatibilityMemoryConstraint> memoryConstraints;
        private List<GetImageShapesImageShapeCompatibilityOcpuConstraint> ocpuConstraints;
        private String shape;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageShapesImageShapeCompatibility defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageId = defaults.imageId;
    	      this.memoryConstraints = defaults.memoryConstraints;
    	      this.ocpuConstraints = defaults.ocpuConstraints;
    	      this.shape = defaults.shape;
        }

        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder memoryConstraints(List<GetImageShapesImageShapeCompatibilityMemoryConstraint> memoryConstraints) {
            this.memoryConstraints = Objects.requireNonNull(memoryConstraints);
            return this;
        }
        public Builder memoryConstraints(GetImageShapesImageShapeCompatibilityMemoryConstraint... memoryConstraints) {
            return memoryConstraints(List.of(memoryConstraints));
        }
        public Builder ocpuConstraints(List<GetImageShapesImageShapeCompatibilityOcpuConstraint> ocpuConstraints) {
            this.ocpuConstraints = Objects.requireNonNull(ocpuConstraints);
            return this;
        }
        public Builder ocpuConstraints(GetImageShapesImageShapeCompatibilityOcpuConstraint... ocpuConstraints) {
            return ocpuConstraints(List.of(ocpuConstraints));
        }
        public Builder shape(String shape) {
            this.shape = Objects.requireNonNull(shape);
            return this;
        }        public GetImageShapesImageShapeCompatibility build() {
            return new GetImageShapesImageShapeCompatibility(imageId, memoryConstraints, ocpuConstraints, shape);
        }
    }
}
