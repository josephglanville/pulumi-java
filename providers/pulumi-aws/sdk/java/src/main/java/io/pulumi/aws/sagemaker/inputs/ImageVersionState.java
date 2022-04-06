// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageVersionState extends io.pulumi.resources.ResourceArgs {

    public static final ImageVersionState Empty = new ImageVersionState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
     * * `image_arn`- The Amazon Resource Name (ARN) of the image the version is based on.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The registry path of the container image on which this image version is based.
     * 
     */
    @Import(name="baseImage")
      private final @Nullable Output<String> baseImage;

    public Output<String> getBaseImage() {
        return this.baseImage == null ? Output.empty() : this.baseImage;
    }

    /**
     * The registry path of the container image that contains this image version.
     * 
     */
    @Import(name="containerImage")
      private final @Nullable Output<String> containerImage;

    public Output<String> getContainerImage() {
        return this.containerImage == null ? Output.empty() : this.containerImage;
    }

    @Import(name="imageArn")
      private final @Nullable Output<String> imageArn;

    public Output<String> getImageArn() {
        return this.imageArn == null ? Output.empty() : this.imageArn;
    }

    /**
     * The name of the image. Must be unique to your account.
     * 
     */
    @Import(name="imageName")
      private final @Nullable Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName == null ? Output.empty() : this.imageName;
    }

    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ImageVersionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> baseImage,
        @Nullable Output<String> containerImage,
        @Nullable Output<String> imageArn,
        @Nullable Output<String> imageName,
        @Nullable Output<Integer> version) {
        this.arn = arn;
        this.baseImage = baseImage;
        this.containerImage = containerImage;
        this.imageArn = imageArn;
        this.imageName = imageName;
        this.version = version;
    }

    private ImageVersionState() {
        this.arn = Output.empty();
        this.baseImage = Output.empty();
        this.containerImage = Output.empty();
        this.imageArn = Output.empty();
        this.imageName = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> baseImage;
        private @Nullable Output<String> containerImage;
        private @Nullable Output<String> imageArn;
        private @Nullable Output<String> imageName;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.baseImage = defaults.baseImage;
    	      this.containerImage = defaults.containerImage;
    	      this.imageArn = defaults.imageArn;
    	      this.imageName = defaults.imageName;
    	      this.version = defaults.version;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder baseImage(@Nullable Output<String> baseImage) {
            this.baseImage = baseImage;
            return this;
        }
        public Builder baseImage(@Nullable String baseImage) {
            this.baseImage = Output.ofNullable(baseImage);
            return this;
        }
        public Builder containerImage(@Nullable Output<String> containerImage) {
            this.containerImage = containerImage;
            return this;
        }
        public Builder containerImage(@Nullable String containerImage) {
            this.containerImage = Output.ofNullable(containerImage);
            return this;
        }
        public Builder imageArn(@Nullable Output<String> imageArn) {
            this.imageArn = imageArn;
            return this;
        }
        public Builder imageArn(@Nullable String imageArn) {
            this.imageArn = Output.ofNullable(imageArn);
            return this;
        }
        public Builder imageName(@Nullable Output<String> imageName) {
            this.imageName = imageName;
            return this;
        }
        public Builder imageName(@Nullable String imageName) {
            this.imageName = Output.ofNullable(imageName);
            return this;
        }
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public ImageVersionState build() {
            return new ImageVersionState(arn, baseImage, containerImage, imageArn, imageName, version);
        }
    }
}