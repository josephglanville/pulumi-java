// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.ImageGuestOsFeatureArgs;
import io.pulumi.gcp.compute.inputs.ImageRawDiskArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Size of the image when restored onto a persistent disk (in GB).
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<Integer> diskSizeGb;

    public Output<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Output.empty() : this.diskSizeGb;
    }

    /**
     * The name of the image family to which this image belongs. You can
     * create disks by specifying an image family instead of a specific
     * image name. The image family always returns its latest image that is
     * not deprecated. The name of the image family must comply with
     * RFC1035.
     * 
     */
    @Import(name="family")
      private final @Nullable Output<String> family;

    public Output<String> getFamily() {
        return this.family == null ? Output.empty() : this.family;
    }

    /**
     * A list of features to enable on the guest operating system.
     * Applicable only for bootable images.
     * Structure is documented below.
     * 
     */
    @Import(name="guestOsFeatures")
      private final @Nullable Output<List<ImageGuestOsFeatureArgs>> guestOsFeatures;

    public Output<List<ImageGuestOsFeatureArgs>> getGuestOsFeatures() {
        return this.guestOsFeatures == null ? Output.empty() : this.guestOsFeatures;
    }

    /**
     * Labels to apply to this Image.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Any applicable license URI.
     * 
     */
    @Import(name="licenses")
      private final @Nullable Output<List<String>> licenses;

    public Output<List<String>> getLicenses() {
        return this.licenses == null ? Output.empty() : this.licenses;
    }

    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The parameters of the raw disk image.
     * Structure is documented below.
     * 
     */
    @Import(name="rawDisk")
      private final @Nullable Output<ImageRawDiskArgs> rawDisk;

    public Output<ImageRawDiskArgs> getRawDisk() {
        return this.rawDisk == null ? Output.empty() : this.rawDisk;
    }

    /**
     * The source disk to create this image based on.
     * You must provide either this property or the
     * rawDisk.source property but not both to create an image.
     * 
     */
    @Import(name="sourceDisk")
      private final @Nullable Output<String> sourceDisk;

    public Output<String> getSourceDisk() {
        return this.sourceDisk == null ? Output.empty() : this.sourceDisk;
    }

    /**
     * URL of the source image used to create this image. In order to create an image, you must provide the full or partial
     * URL of one of the following:
     * * The selfLink URL
     * * This property
     * * The rawDisk.source URL
     * * The sourceDisk URL
     * 
     */
    @Import(name="sourceImage")
      private final @Nullable Output<String> sourceImage;

    public Output<String> getSourceImage() {
        return this.sourceImage == null ? Output.empty() : this.sourceImage;
    }

    /**
     * URL of the source snapshot used to create this image.
     * In order to create an image, you must provide the full or partial URL of one of the following:
     * * The selfLink URL
     * * This property
     * * The sourceImage URL
     * * The rawDisk.source URL
     * * The sourceDisk URL
     * 
     */
    @Import(name="sourceSnapshot")
      private final @Nullable Output<String> sourceSnapshot;

    public Output<String> getSourceSnapshot() {
        return this.sourceSnapshot == null ? Output.empty() : this.sourceSnapshot;
    }

    public ImageArgs(
        @Nullable Output<String> description,
        @Nullable Output<Integer> diskSizeGb,
        @Nullable Output<String> family,
        @Nullable Output<List<ImageGuestOsFeatureArgs>> guestOsFeatures,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<String>> licenses,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<ImageRawDiskArgs> rawDisk,
        @Nullable Output<String> sourceDisk,
        @Nullable Output<String> sourceImage,
        @Nullable Output<String> sourceSnapshot) {
        this.description = description;
        this.diskSizeGb = diskSizeGb;
        this.family = family;
        this.guestOsFeatures = guestOsFeatures;
        this.labels = labels;
        this.licenses = licenses;
        this.name = name;
        this.project = project;
        this.rawDisk = rawDisk;
        this.sourceDisk = sourceDisk;
        this.sourceImage = sourceImage;
        this.sourceSnapshot = sourceSnapshot;
    }

    private ImageArgs() {
        this.description = Output.empty();
        this.diskSizeGb = Output.empty();
        this.family = Output.empty();
        this.guestOsFeatures = Output.empty();
        this.labels = Output.empty();
        this.licenses = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.rawDisk = Output.empty();
        this.sourceDisk = Output.empty();
        this.sourceImage = Output.empty();
        this.sourceSnapshot = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> diskSizeGb;
        private @Nullable Output<String> family;
        private @Nullable Output<List<ImageGuestOsFeatureArgs>> guestOsFeatures;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<String>> licenses;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<ImageRawDiskArgs> rawDisk;
        private @Nullable Output<String> sourceDisk;
        private @Nullable Output<String> sourceImage;
        private @Nullable Output<String> sourceSnapshot;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.family = defaults.family;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.labels = defaults.labels;
    	      this.licenses = defaults.licenses;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rawDisk = defaults.rawDisk;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Output.ofNullable(diskSizeGb);
            return this;
        }
        public Builder family(@Nullable Output<String> family) {
            this.family = family;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = Output.ofNullable(family);
            return this;
        }
        public Builder guestOsFeatures(@Nullable Output<List<ImageGuestOsFeatureArgs>> guestOsFeatures) {
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }
        public Builder guestOsFeatures(@Nullable List<ImageGuestOsFeatureArgs> guestOsFeatures) {
            this.guestOsFeatures = Output.ofNullable(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(ImageGuestOsFeatureArgs... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder licenses(@Nullable Output<List<String>> licenses) {
            this.licenses = licenses;
            return this;
        }
        public Builder licenses(@Nullable List<String> licenses) {
            this.licenses = Output.ofNullable(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder rawDisk(@Nullable Output<ImageRawDiskArgs> rawDisk) {
            this.rawDisk = rawDisk;
            return this;
        }
        public Builder rawDisk(@Nullable ImageRawDiskArgs rawDisk) {
            this.rawDisk = Output.ofNullable(rawDisk);
            return this;
        }
        public Builder sourceDisk(@Nullable Output<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }
        public Builder sourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Output.ofNullable(sourceDisk);
            return this;
        }
        public Builder sourceImage(@Nullable Output<String> sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }
        public Builder sourceImage(@Nullable String sourceImage) {
            this.sourceImage = Output.ofNullable(sourceImage);
            return this;
        }
        public Builder sourceSnapshot(@Nullable Output<String> sourceSnapshot) {
            this.sourceSnapshot = sourceSnapshot;
            return this;
        }
        public Builder sourceSnapshot(@Nullable String sourceSnapshot) {
            this.sourceSnapshot = Output.ofNullable(sourceSnapshot);
            return this;
        }        public ImageArgs build() {
            return new ImageArgs(description, diskSizeGb, family, guestOsFeatures, labels, licenses, name, project, rawDisk, sourceDisk, sourceImage, sourceSnapshot);
        }
    }
}
