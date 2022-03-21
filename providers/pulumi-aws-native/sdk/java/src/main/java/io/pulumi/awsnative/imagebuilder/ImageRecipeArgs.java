// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.imagebuilder.inputs.ImageRecipeAdditionalInstanceConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.inputs.ImageRecipeComponentConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.inputs.ImageRecipeInstanceBlockDeviceMappingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageRecipeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeArgs Empty = new ImageRecipeArgs();

    /**
     * Specify additional settings and launch scripts for your build instances.
     * 
     */
    @Import(name="additionalInstanceConfiguration")
      private final @Nullable Output<ImageRecipeAdditionalInstanceConfigurationArgs> additionalInstanceConfiguration;

    public Output<ImageRecipeAdditionalInstanceConfigurationArgs> getAdditionalInstanceConfiguration() {
        return this.additionalInstanceConfiguration == null ? Output.empty() : this.additionalInstanceConfiguration;
    }

    /**
     * The block device mappings to apply when creating images from this recipe.
     * 
     */
    @Import(name="blockDeviceMappings")
      private final @Nullable Output<List<ImageRecipeInstanceBlockDeviceMappingArgs>> blockDeviceMappings;

    public Output<List<ImageRecipeInstanceBlockDeviceMappingArgs>> getBlockDeviceMappings() {
        return this.blockDeviceMappings == null ? Output.empty() : this.blockDeviceMappings;
    }

    /**
     * The components of the image recipe.
     * 
     */
    @Import(name="components", required=true)
      private final Output<List<ImageRecipeComponentConfigurationArgs>> components;

    public Output<List<ImageRecipeComponentConfigurationArgs>> getComponents() {
        return this.components;
    }

    /**
     * The description of the image recipe.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the image recipe.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The parent image of the image recipe.
     * 
     */
    @Import(name="parentImage", required=true)
      private final Output<String> parentImage;

    public Output<String> getParentImage() {
        return this.parentImage;
    }

    /**
     * The tags of the image recipe.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Object> tags;

    public Output<Object> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The version of the image recipe.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    /**
     * The working directory to be used during build and test workflows.
     * 
     */
    @Import(name="workingDirectory")
      private final @Nullable Output<String> workingDirectory;

    public Output<String> getWorkingDirectory() {
        return this.workingDirectory == null ? Output.empty() : this.workingDirectory;
    }

    public ImageRecipeArgs(
        @Nullable Output<ImageRecipeAdditionalInstanceConfigurationArgs> additionalInstanceConfiguration,
        @Nullable Output<List<ImageRecipeInstanceBlockDeviceMappingArgs>> blockDeviceMappings,
        Output<List<ImageRecipeComponentConfigurationArgs>> components,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> parentImage,
        @Nullable Output<Object> tags,
        Output<String> version,
        @Nullable Output<String> workingDirectory) {
        this.additionalInstanceConfiguration = additionalInstanceConfiguration;
        this.blockDeviceMappings = blockDeviceMappings;
        this.components = Objects.requireNonNull(components, "expected parameter 'components' to be non-null");
        this.description = description;
        this.name = name;
        this.parentImage = Objects.requireNonNull(parentImage, "expected parameter 'parentImage' to be non-null");
        this.tags = tags;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
        this.workingDirectory = workingDirectory;
    }

    private ImageRecipeArgs() {
        this.additionalInstanceConfiguration = Output.empty();
        this.blockDeviceMappings = Output.empty();
        this.components = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.parentImage = Output.empty();
        this.tags = Output.empty();
        this.version = Output.empty();
        this.workingDirectory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ImageRecipeAdditionalInstanceConfigurationArgs> additionalInstanceConfiguration;
        private @Nullable Output<List<ImageRecipeInstanceBlockDeviceMappingArgs>> blockDeviceMappings;
        private Output<List<ImageRecipeComponentConfigurationArgs>> components;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> parentImage;
        private @Nullable Output<Object> tags;
        private Output<String> version;
        private @Nullable Output<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInstanceConfiguration = defaults.additionalInstanceConfiguration;
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.components = defaults.components;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parentImage = defaults.parentImage;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder additionalInstanceConfiguration(@Nullable Output<ImageRecipeAdditionalInstanceConfigurationArgs> additionalInstanceConfiguration) {
            this.additionalInstanceConfiguration = additionalInstanceConfiguration;
            return this;
        }
        public Builder additionalInstanceConfiguration(@Nullable ImageRecipeAdditionalInstanceConfigurationArgs additionalInstanceConfiguration) {
            this.additionalInstanceConfiguration = Output.ofNullable(additionalInstanceConfiguration);
            return this;
        }
        public Builder blockDeviceMappings(@Nullable Output<List<ImageRecipeInstanceBlockDeviceMappingArgs>> blockDeviceMappings) {
            this.blockDeviceMappings = blockDeviceMappings;
            return this;
        }
        public Builder blockDeviceMappings(@Nullable List<ImageRecipeInstanceBlockDeviceMappingArgs> blockDeviceMappings) {
            this.blockDeviceMappings = Output.ofNullable(blockDeviceMappings);
            return this;
        }
        public Builder blockDeviceMappings(ImageRecipeInstanceBlockDeviceMappingArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }
        public Builder components(Output<List<ImageRecipeComponentConfigurationArgs>> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }
        public Builder components(List<ImageRecipeComponentConfigurationArgs> components) {
            this.components = Output.of(Objects.requireNonNull(components));
            return this;
        }
        public Builder components(ImageRecipeComponentConfigurationArgs... components) {
            return components(List.of(components));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
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
        public Builder parentImage(Output<String> parentImage) {
            this.parentImage = Objects.requireNonNull(parentImage);
            return this;
        }
        public Builder parentImage(String parentImage) {
            this.parentImage = Output.of(Objects.requireNonNull(parentImage));
            return this;
        }
        public Builder tags(@Nullable Output<Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }
        public Builder workingDirectory(@Nullable Output<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }
        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Output.ofNullable(workingDirectory);
            return this;
        }        public ImageRecipeArgs build() {
            return new ImageRecipeArgs(additionalInstanceConfiguration, blockDeviceMappings, components, description, name, parentImage, tags, version, workingDirectory);
        }
    }
}
