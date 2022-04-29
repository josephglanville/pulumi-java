// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNodePoolsNodePoolNodeSource {
    /**
     * @return The OCID of the image used to boot the node.
     * 
     */
    private final String imageId;
    /**
     * @return The user-friendly name of the entity corresponding to the OCID.
     * 
     */
    private final String sourceName;
    /**
     * @return The source type for the node. Use `IMAGE` when specifying an OCID of an image.
     * 
     */
    private final String sourceType;

    @CustomType.Constructor
    private GetNodePoolsNodePoolNodeSource(
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("sourceName") String sourceName,
        @CustomType.Parameter("sourceType") String sourceType) {
        this.imageId = imageId;
        this.sourceName = sourceName;
        this.sourceType = sourceType;
    }

    /**
     * @return The OCID of the image used to boot the node.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The user-friendly name of the entity corresponding to the OCID.
     * 
     */
    public String sourceName() {
        return this.sourceName;
    }
    /**
     * @return The source type for the node. Use `IMAGE` when specifying an OCID of an image.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodePoolsNodePoolNodeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageId;
        private String sourceName;
        private String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodePoolsNodePoolNodeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageId = defaults.imageId;
    	      this.sourceName = defaults.sourceName;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder sourceName(String sourceName) {
            this.sourceName = Objects.requireNonNull(sourceName);
            return this;
        }
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }        public GetNodePoolsNodePoolNodeSource build() {
            return new GetNodePoolsNodePoolNodeSource(imageId, sourceName, sourceType);
        }
    }
}
