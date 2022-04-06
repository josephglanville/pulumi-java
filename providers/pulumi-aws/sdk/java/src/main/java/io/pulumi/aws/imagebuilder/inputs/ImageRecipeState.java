// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingGetArgs;
import io.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageRecipeState extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeState Empty = new ImageRecipeState();

    /**
     * (Required) Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Configuration block(s) with block device mappings for the the image recipe. Detailed below.
     * 
     */
    @Import(name="blockDeviceMappings")
      private final @Nullable Output<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings;

    public Output<List<ImageRecipeBlockDeviceMappingGetArgs>> getBlockDeviceMappings() {
        return this.blockDeviceMappings == null ? Output.empty() : this.blockDeviceMappings;
    }

    /**
     * Ordered configuration block(s) with components for the image recipe. Detailed below.
     * 
     */
    @Import(name="components")
      private final @Nullable Output<List<ImageRecipeComponentGetArgs>> components;

    public Output<List<ImageRecipeComponentGetArgs>> getComponents() {
        return this.components == null ? Output.empty() : this.components;
    }

    /**
     * Date the image recipe was created.
     * 
     */
    @Import(name="dateCreated")
      private final @Nullable Output<String> dateCreated;

    public Output<String> getDateCreated() {
        return this.dateCreated == null ? Output.empty() : this.dateCreated;
    }

    /**
     * Description of the image recipe.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Name of the image recipe.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Owner of the image recipe.
     * 
     */
    @Import(name="owner")
      private final @Nullable Output<String> owner;

    public Output<String> getOwner() {
        return this.owner == null ? Output.empty() : this.owner;
    }

    /**
     * Platform of the image recipe.
     * 
     */
    @Import(name="parentImage")
      private final @Nullable Output<String> parentImage;

    public Output<String> getParentImage() {
        return this.parentImage == null ? Output.empty() : this.parentImage;
    }

    /**
     * Platform of the image recipe.
     * 
     */
    @Import(name="platform")
      private final @Nullable Output<String> platform;

    public Output<String> getPlatform() {
        return this.platform == null ? Output.empty() : this.platform;
    }

    /**
     * Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     * 
     */
    @Import(name="userDataBase64")
      private final @Nullable Output<String> userDataBase64;

    public Output<String> getUserDataBase64() {
        return this.userDataBase64 == null ? Output.empty() : this.userDataBase64;
    }

    /**
     * Version of the image recipe.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
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

    public ImageRecipeState(
        @Nullable Output<String> arn,
        @Nullable Output<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings,
        @Nullable Output<List<ImageRecipeComponentGetArgs>> components,
        @Nullable Output<String> dateCreated,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> owner,
        @Nullable Output<String> parentImage,
        @Nullable Output<String> platform,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> userDataBase64,
        @Nullable Output<String> version,
        @Nullable Output<String> workingDirectory) {
        this.arn = arn;
        this.blockDeviceMappings = blockDeviceMappings;
        this.components = components;
        this.dateCreated = dateCreated;
        this.description = description;
        this.name = name;
        this.owner = owner;
        this.parentImage = parentImage;
        this.platform = platform;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userDataBase64 = userDataBase64;
        this.version = version;
        this.workingDirectory = workingDirectory;
    }

    private ImageRecipeState() {
        this.arn = Output.empty();
        this.blockDeviceMappings = Output.empty();
        this.components = Output.empty();
        this.dateCreated = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.owner = Output.empty();
        this.parentImage = Output.empty();
        this.platform = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.userDataBase64 = Output.empty();
        this.version = Output.empty();
        this.workingDirectory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings;
        private @Nullable Output<List<ImageRecipeComponentGetArgs>> components;
        private @Nullable Output<String> dateCreated;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> owner;
        private @Nullable Output<String> parentImage;
        private @Nullable Output<String> platform;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> userDataBase64;
        private @Nullable Output<String> version;
        private @Nullable Output<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.components = defaults.components;
    	      this.dateCreated = defaults.dateCreated;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.parentImage = defaults.parentImage;
    	      this.platform = defaults.platform;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userDataBase64 = defaults.userDataBase64;
    	      this.version = defaults.version;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder blockDeviceMappings(@Nullable Output<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings) {
            this.blockDeviceMappings = blockDeviceMappings;
            return this;
        }
        public Builder blockDeviceMappings(@Nullable List<ImageRecipeBlockDeviceMappingGetArgs> blockDeviceMappings) {
            this.blockDeviceMappings = Output.ofNullable(blockDeviceMappings);
            return this;
        }
        public Builder blockDeviceMappings(ImageRecipeBlockDeviceMappingGetArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }
        public Builder components(@Nullable Output<List<ImageRecipeComponentGetArgs>> components) {
            this.components = components;
            return this;
        }
        public Builder components(@Nullable List<ImageRecipeComponentGetArgs> components) {
            this.components = Output.ofNullable(components);
            return this;
        }
        public Builder components(ImageRecipeComponentGetArgs... components) {
            return components(List.of(components));
        }
        public Builder dateCreated(@Nullable Output<String> dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Builder dateCreated(@Nullable String dateCreated) {
            this.dateCreated = Output.ofNullable(dateCreated);
            return this;
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
        public Builder owner(@Nullable Output<String> owner) {
            this.owner = owner;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = Output.ofNullable(owner);
            return this;
        }
        public Builder parentImage(@Nullable Output<String> parentImage) {
            this.parentImage = parentImage;
            return this;
        }
        public Builder parentImage(@Nullable String parentImage) {
            this.parentImage = Output.ofNullable(parentImage);
            return this;
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
        public Builder userDataBase64(@Nullable Output<String> userDataBase64) {
            this.userDataBase64 = userDataBase64;
            return this;
        }
        public Builder userDataBase64(@Nullable String userDataBase64) {
            this.userDataBase64 = Output.ofNullable(userDataBase64);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public Builder workingDirectory(@Nullable Output<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }
        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Output.ofNullable(workingDirectory);
            return this;
        }        public ImageRecipeState build() {
            return new ImageRecipeState(arn, blockDeviceMappings, components, dateCreated, description, name, owner, parentImage, platform, tags, tagsAll, userDataBase64, version, workingDirectory);
        }
    }
}