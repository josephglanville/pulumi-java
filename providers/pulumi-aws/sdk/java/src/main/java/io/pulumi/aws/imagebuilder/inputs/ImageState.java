// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.ImageImageTestsConfigurationGetArgs;
import io.pulumi.aws.imagebuilder.inputs.ImageOutputResourceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageState extends io.pulumi.resources.ResourceArgs {

    public static final ImageState Empty = new ImageState();

    /**
     * Amazon Resource Name (ARN) of the image.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Date the image was created.
     * 
     */
    @Import(name="dateCreated")
      private final @Nullable Output<String> dateCreated;

    public Output<String> getDateCreated() {
        return this.dateCreated == null ? Output.empty() : this.dateCreated;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    @Import(name="distributionConfigurationArn")
      private final @Nullable Output<String> distributionConfigurationArn;

    public Output<String> getDistributionConfigurationArn() {
        return this.distributionConfigurationArn == null ? Output.empty() : this.distributionConfigurationArn;
    }

    /**
     * Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    @Import(name="enhancedImageMetadataEnabled")
      private final @Nullable Output<Boolean> enhancedImageMetadataEnabled;

    public Output<Boolean> getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled == null ? Output.empty() : this.enhancedImageMetadataEnabled;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    @Import(name="imageRecipeArn")
      private final @Nullable Output<String> imageRecipeArn;

    public Output<String> getImageRecipeArn() {
        return this.imageRecipeArn == null ? Output.empty() : this.imageRecipeArn;
    }

    /**
     * Configuration block with image tests configuration. Detailed below.
     * 
     */
    @Import(name="imageTestsConfiguration")
      private final @Nullable Output<ImageImageTestsConfigurationGetArgs> imageTestsConfiguration;

    public Output<ImageImageTestsConfigurationGetArgs> getImageTestsConfiguration() {
        return this.imageTestsConfiguration == null ? Output.empty() : this.imageTestsConfiguration;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    @Import(name="infrastructureConfigurationArn")
      private final @Nullable Output<String> infrastructureConfigurationArn;

    public Output<String> getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn == null ? Output.empty() : this.infrastructureConfigurationArn;
    }

    /**
     * Name of the AMI.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Operating System version of the image.
     * 
     */
    @Import(name="osVersion")
      private final @Nullable Output<String> osVersion;

    public Output<String> getOsVersion() {
        return this.osVersion == null ? Output.empty() : this.osVersion;
    }

    /**
     * List of objects with resources created by the image.
     * 
     */
    @Import(name="outputResources")
      private final @Nullable Output<List<ImageOutputResourceGetArgs>> outputResources;

    public Output<List<ImageOutputResourceGetArgs>> getOutputResources() {
        return this.outputResources == null ? Output.empty() : this.outputResources;
    }

    /**
     * Platform of the image.
     * 
     */
    @Import(name="platform")
      private final @Nullable Output<String> platform;

    public Output<String> getPlatform() {
        return this.platform == null ? Output.empty() : this.platform;
    }

    /**
     * Key-value map of resource tags for the Image Builder Image. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Version of the image.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ImageState(
        @Nullable Output<String> arn,
        @Nullable Output<String> dateCreated,
        @Nullable Output<String> distributionConfigurationArn,
        @Nullable Output<Boolean> enhancedImageMetadataEnabled,
        @Nullable Output<String> imageRecipeArn,
        @Nullable Output<ImageImageTestsConfigurationGetArgs> imageTestsConfiguration,
        @Nullable Output<String> infrastructureConfigurationArn,
        @Nullable Output<String> name,
        @Nullable Output<String> osVersion,
        @Nullable Output<List<ImageOutputResourceGetArgs>> outputResources,
        @Nullable Output<String> platform,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> version) {
        this.arn = arn;
        this.dateCreated = dateCreated;
        this.distributionConfigurationArn = distributionConfigurationArn;
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        this.imageRecipeArn = imageRecipeArn;
        this.imageTestsConfiguration = imageTestsConfiguration;
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        this.name = name;
        this.osVersion = osVersion;
        this.outputResources = outputResources;
        this.platform = platform;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.version = version;
    }

    private ImageState() {
        this.arn = Output.empty();
        this.dateCreated = Output.empty();
        this.distributionConfigurationArn = Output.empty();
        this.enhancedImageMetadataEnabled = Output.empty();
        this.imageRecipeArn = Output.empty();
        this.imageTestsConfiguration = Output.empty();
        this.infrastructureConfigurationArn = Output.empty();
        this.name = Output.empty();
        this.osVersion = Output.empty();
        this.outputResources = Output.empty();
        this.platform = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> dateCreated;
        private @Nullable Output<String> distributionConfigurationArn;
        private @Nullable Output<Boolean> enhancedImageMetadataEnabled;
        private @Nullable Output<String> imageRecipeArn;
        private @Nullable Output<ImageImageTestsConfigurationGetArgs> imageTestsConfiguration;
        private @Nullable Output<String> infrastructureConfigurationArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> osVersion;
        private @Nullable Output<List<ImageOutputResourceGetArgs>> outputResources;
        private @Nullable Output<String> platform;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dateCreated = defaults.dateCreated;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfiguration = defaults.imageTestsConfiguration;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.name = defaults.name;
    	      this.osVersion = defaults.osVersion;
    	      this.outputResources = defaults.outputResources;
    	      this.platform = defaults.platform;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
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
        public Builder dateCreated(@Nullable Output<String> dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Builder dateCreated(@Nullable String dateCreated) {
            this.dateCreated = Output.ofNullable(dateCreated);
            return this;
        }
        public Builder distributionConfigurationArn(@Nullable Output<String> distributionConfigurationArn) {
            this.distributionConfigurationArn = distributionConfigurationArn;
            return this;
        }
        public Builder distributionConfigurationArn(@Nullable String distributionConfigurationArn) {
            this.distributionConfigurationArn = Output.ofNullable(distributionConfigurationArn);
            return this;
        }
        public Builder enhancedImageMetadataEnabled(@Nullable Output<Boolean> enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
            return this;
        }
        public Builder enhancedImageMetadataEnabled(@Nullable Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = Output.ofNullable(enhancedImageMetadataEnabled);
            return this;
        }
        public Builder imageRecipeArn(@Nullable Output<String> imageRecipeArn) {
            this.imageRecipeArn = imageRecipeArn;
            return this;
        }
        public Builder imageRecipeArn(@Nullable String imageRecipeArn) {
            this.imageRecipeArn = Output.ofNullable(imageRecipeArn);
            return this;
        }
        public Builder imageTestsConfiguration(@Nullable Output<ImageImageTestsConfigurationGetArgs> imageTestsConfiguration) {
            this.imageTestsConfiguration = imageTestsConfiguration;
            return this;
        }
        public Builder imageTestsConfiguration(@Nullable ImageImageTestsConfigurationGetArgs imageTestsConfiguration) {
            this.imageTestsConfiguration = Output.ofNullable(imageTestsConfiguration);
            return this;
        }
        public Builder infrastructureConfigurationArn(@Nullable Output<String> infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = infrastructureConfigurationArn;
            return this;
        }
        public Builder infrastructureConfigurationArn(@Nullable String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Output.ofNullable(infrastructureConfigurationArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder osVersion(@Nullable Output<String> osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = Output.ofNullable(osVersion);
            return this;
        }
        public Builder outputResources(@Nullable Output<List<ImageOutputResourceGetArgs>> outputResources) {
            this.outputResources = outputResources;
            return this;
        }
        public Builder outputResources(@Nullable List<ImageOutputResourceGetArgs> outputResources) {
            this.outputResources = Output.ofNullable(outputResources);
            return this;
        }
        public Builder outputResources(ImageOutputResourceGetArgs... outputResources) {
            return outputResources(List.of(outputResources));
        }
        public Builder platform(@Nullable Output<String> platform) {
            this.platform = platform;
            return this;
        }
        public Builder platform(@Nullable String platform) {
            this.platform = Output.ofNullable(platform);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public ImageState build() {
            return new ImageState(arn, dateCreated, distributionConfigurationArn, enhancedImageMetadataEnabled, imageRecipeArn, imageTestsConfiguration, infrastructureConfigurationArn, name, osVersion, outputResources, platform, tags, tagsAll, version);
        }
    }
}