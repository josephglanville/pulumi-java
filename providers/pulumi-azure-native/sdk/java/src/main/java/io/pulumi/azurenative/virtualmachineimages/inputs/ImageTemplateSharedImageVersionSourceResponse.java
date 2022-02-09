// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ImageTemplateSharedImageVersionSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageTemplateSharedImageVersionSourceResponse Empty = new ImageTemplateSharedImageVersionSourceResponse();

    @InputImport(name="imageVersionId", required=true)
    private final String imageVersionId;

    public String getImageVersionId() {
        return this.imageVersionId;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ImageTemplateSharedImageVersionSourceResponse(
        String imageVersionId,
        String type) {
        this.imageVersionId = Objects.requireNonNull(imageVersionId, "expected parameter 'imageVersionId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageTemplateSharedImageVersionSourceResponse() {
        this.imageVersionId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateSharedImageVersionSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageVersionId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateSharedImageVersionSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageVersionId = defaults.imageVersionId;
    	      this.type = defaults.type;
        }

        public Builder setImageVersionId(String imageVersionId) {
            this.imageVersionId = Objects.requireNonNull(imageVersionId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ImageTemplateSharedImageVersionSourceResponse build() {
            return new ImageTemplateSharedImageVersionSourceResponse(imageVersionId, type);
        }
    }
}
