// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.imagebuilder.enums.ImagePipelineStatus;
import io.pulumi.awsnative.imagebuilder.inputs.ImagePipelineImageTestsConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.inputs.ImagePipelineScheduleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImagePipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImagePipelineArgs Empty = new ImagePipelineArgs();

    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * 
     */
    @InputImport(name="containerRecipeArn")
      private final @Nullable Input<String> containerRecipeArn;

    public Input<String> getContainerRecipeArn() {
        return this.containerRecipeArn == null ? Input.empty() : this.containerRecipeArn;
    }

    /**
     * The description of the image pipeline.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     * 
     */
    @InputImport(name="distributionConfigurationArn")
      private final @Nullable Input<String> distributionConfigurationArn;

    public Input<String> getDistributionConfigurationArn() {
        return this.distributionConfigurationArn == null ? Input.empty() : this.distributionConfigurationArn;
    }

    /**
     * Collects additional information about the image being created, including the operating system (OS) version and package list.
     * 
     */
    @InputImport(name="enhancedImageMetadataEnabled")
      private final @Nullable Input<Boolean> enhancedImageMetadataEnabled;

    public Input<Boolean> getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled == null ? Input.empty() : this.enhancedImageMetadataEnabled;
    }

    /**
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * 
     */
    @InputImport(name="imageRecipeArn")
      private final @Nullable Input<String> imageRecipeArn;

    public Input<String> getImageRecipeArn() {
        return this.imageRecipeArn == null ? Input.empty() : this.imageRecipeArn;
    }

    /**
     * The image tests configuration of the image pipeline.
     * 
     */
    @InputImport(name="imageTestsConfiguration")
      private final @Nullable Input<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration;

    public Input<ImagePipelineImageTestsConfigurationArgs> getImageTestsConfiguration() {
        return this.imageTestsConfiguration == null ? Input.empty() : this.imageTestsConfiguration;
    }

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     * 
     */
    @InputImport(name="infrastructureConfigurationArn")
      private final @Nullable Input<String> infrastructureConfigurationArn;

    public Input<String> getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn == null ? Input.empty() : this.infrastructureConfigurationArn;
    }

    /**
     * The name of the image pipeline.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The schedule of the image pipeline.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<ImagePipelineScheduleArgs> schedule;

    public Input<ImagePipelineScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The status of the image pipeline.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<ImagePipelineStatus> status;

    public Input<ImagePipelineStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The tags of this image pipeline.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Object> tags;

    public Input<Object> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ImagePipelineArgs(
        @Nullable Input<String> containerRecipeArn,
        @Nullable Input<String> description,
        @Nullable Input<String> distributionConfigurationArn,
        @Nullable Input<Boolean> enhancedImageMetadataEnabled,
        @Nullable Input<String> imageRecipeArn,
        @Nullable Input<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration,
        @Nullable Input<String> infrastructureConfigurationArn,
        @Nullable Input<String> name,
        @Nullable Input<ImagePipelineScheduleArgs> schedule,
        @Nullable Input<ImagePipelineStatus> status,
        @Nullable Input<Object> tags) {
        this.containerRecipeArn = containerRecipeArn;
        this.description = description;
        this.distributionConfigurationArn = distributionConfigurationArn;
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        this.imageRecipeArn = imageRecipeArn;
        this.imageTestsConfiguration = imageTestsConfiguration;
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        this.name = name;
        this.schedule = schedule;
        this.status = status;
        this.tags = tags;
    }

    private ImagePipelineArgs() {
        this.containerRecipeArn = Input.empty();
        this.description = Input.empty();
        this.distributionConfigurationArn = Input.empty();
        this.enhancedImageMetadataEnabled = Input.empty();
        this.imageRecipeArn = Input.empty();
        this.imageTestsConfiguration = Input.empty();
        this.infrastructureConfigurationArn = Input.empty();
        this.name = Input.empty();
        this.schedule = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerRecipeArn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> distributionConfigurationArn;
        private @Nullable Input<Boolean> enhancedImageMetadataEnabled;
        private @Nullable Input<String> imageRecipeArn;
        private @Nullable Input<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration;
        private @Nullable Input<String> infrastructureConfigurationArn;
        private @Nullable Input<String> name;
        private @Nullable Input<ImagePipelineScheduleArgs> schedule;
        private @Nullable Input<ImagePipelineStatus> status;
        private @Nullable Input<Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerRecipeArn = defaults.containerRecipeArn;
    	      this.description = defaults.description;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfiguration = defaults.imageTestsConfiguration;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder setContainerRecipeArn(@Nullable Input<String> containerRecipeArn) {
            this.containerRecipeArn = containerRecipeArn;
            return this;
        }

        public Builder setContainerRecipeArn(@Nullable String containerRecipeArn) {
            this.containerRecipeArn = Input.ofNullable(containerRecipeArn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDistributionConfigurationArn(@Nullable Input<String> distributionConfigurationArn) {
            this.distributionConfigurationArn = distributionConfigurationArn;
            return this;
        }

        public Builder setDistributionConfigurationArn(@Nullable String distributionConfigurationArn) {
            this.distributionConfigurationArn = Input.ofNullable(distributionConfigurationArn);
            return this;
        }

        public Builder setEnhancedImageMetadataEnabled(@Nullable Input<Boolean> enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
            return this;
        }

        public Builder setEnhancedImageMetadataEnabled(@Nullable Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = Input.ofNullable(enhancedImageMetadataEnabled);
            return this;
        }

        public Builder setImageRecipeArn(@Nullable Input<String> imageRecipeArn) {
            this.imageRecipeArn = imageRecipeArn;
            return this;
        }

        public Builder setImageRecipeArn(@Nullable String imageRecipeArn) {
            this.imageRecipeArn = Input.ofNullable(imageRecipeArn);
            return this;
        }

        public Builder setImageTestsConfiguration(@Nullable Input<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration) {
            this.imageTestsConfiguration = imageTestsConfiguration;
            return this;
        }

        public Builder setImageTestsConfiguration(@Nullable ImagePipelineImageTestsConfigurationArgs imageTestsConfiguration) {
            this.imageTestsConfiguration = Input.ofNullable(imageTestsConfiguration);
            return this;
        }

        public Builder setInfrastructureConfigurationArn(@Nullable Input<String> infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = infrastructureConfigurationArn;
            return this;
        }

        public Builder setInfrastructureConfigurationArn(@Nullable String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Input.ofNullable(infrastructureConfigurationArn);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSchedule(@Nullable Input<ImagePipelineScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable ImagePipelineScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setStatus(@Nullable Input<ImagePipelineStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable ImagePipelineStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Object> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ImagePipelineArgs build() {
            return new ImagePipelineArgs(containerRecipeArn, description, distributionConfigurationArn, enhancedImageMetadataEnabled, imageRecipeArn, imageTestsConfiguration, infrastructureConfigurationArn, name, schedule, status, tags);
        }
    }
}
