// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.ImageTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

    @InputImport(name="imageDescription")
      private final @Nullable Input<String> imageDescription;

    public Input<String> getImageDescription() {
        return this.imageDescription == null ? Input.empty() : this.imageDescription;
    }

    @InputImport(name="imageDisplayName")
      private final @Nullable Input<String> imageDisplayName;

    public Input<String> getImageDisplayName() {
        return this.imageDisplayName == null ? Input.empty() : this.imageDisplayName;
    }

    @InputImport(name="imageName")
      private final @Nullable Input<String> imageName;

    public Input<String> getImageName() {
        return this.imageName == null ? Input.empty() : this.imageName;
    }

    @InputImport(name="imageRoleArn", required=true)
      private final Input<String> imageRoleArn;

    public Input<String> getImageRoleArn() {
        return this.imageRoleArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ImageTagArgs>> tags;

    public Input<List<ImageTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ImageArgs(
        @Nullable Input<String> imageDescription,
        @Nullable Input<String> imageDisplayName,
        @Nullable Input<String> imageName,
        Input<String> imageRoleArn,
        @Nullable Input<List<ImageTagArgs>> tags) {
        this.imageDescription = imageDescription;
        this.imageDisplayName = imageDisplayName;
        this.imageName = imageName;
        this.imageRoleArn = Objects.requireNonNull(imageRoleArn, "expected parameter 'imageRoleArn' to be non-null");
        this.tags = tags;
    }

    private ImageArgs() {
        this.imageDescription = Input.empty();
        this.imageDisplayName = Input.empty();
        this.imageName = Input.empty();
        this.imageRoleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> imageDescription;
        private @Nullable Input<String> imageDisplayName;
        private @Nullable Input<String> imageName;
        private Input<String> imageRoleArn;
        private @Nullable Input<List<ImageTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageDescription = defaults.imageDescription;
    	      this.imageDisplayName = defaults.imageDisplayName;
    	      this.imageName = defaults.imageName;
    	      this.imageRoleArn = defaults.imageRoleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setImageDescription(@Nullable Input<String> imageDescription) {
            this.imageDescription = imageDescription;
            return this;
        }

        public Builder setImageDescription(@Nullable String imageDescription) {
            this.imageDescription = Input.ofNullable(imageDescription);
            return this;
        }

        public Builder setImageDisplayName(@Nullable Input<String> imageDisplayName) {
            this.imageDisplayName = imageDisplayName;
            return this;
        }

        public Builder setImageDisplayName(@Nullable String imageDisplayName) {
            this.imageDisplayName = Input.ofNullable(imageDisplayName);
            return this;
        }

        public Builder setImageName(@Nullable Input<String> imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = Input.ofNullable(imageName);
            return this;
        }

        public Builder setImageRoleArn(Input<String> imageRoleArn) {
            this.imageRoleArn = Objects.requireNonNull(imageRoleArn);
            return this;
        }

        public Builder setImageRoleArn(String imageRoleArn) {
            this.imageRoleArn = Input.of(Objects.requireNonNull(imageRoleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<List<ImageTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ImageTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ImageArgs build() {
            return new ImageArgs(imageDescription, imageDisplayName, imageName, imageRoleArn, tags);
        }
    }
}
