// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.enums.FavoriteType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FavoriteArgs extends io.pulumi.resources.ResourceArgs {

    public static final FavoriteArgs Empty = new FavoriteArgs();

    @InputImport(name="category")
    private final @Nullable Input<String> category;

    public Input<String> getCategory() {
        return this.category == null ? Input.empty() : this.category;
    }

    @InputImport(name="config")
    private final @Nullable Input<String> config;

    public Input<String> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    @InputImport(name="favoriteId")
    private final @Nullable Input<String> favoriteId;

    public Input<String> getFavoriteId() {
        return this.favoriteId == null ? Input.empty() : this.favoriteId;
    }

    @InputImport(name="favoriteType")
    private final @Nullable Input<FavoriteType> favoriteType;

    public Input<FavoriteType> getFavoriteType() {
        return this.favoriteType == null ? Input.empty() : this.favoriteType;
    }

    @InputImport(name="isGeneratedFromTemplate")
    private final @Nullable Input<Boolean> isGeneratedFromTemplate;

    public Input<Boolean> getIsGeneratedFromTemplate() {
        return this.isGeneratedFromTemplate == null ? Input.empty() : this.isGeneratedFromTemplate;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceName", required=true)
    private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    @InputImport(name="sourceType")
    private final @Nullable Input<String> sourceType;

    public Input<String> getSourceType() {
        return this.sourceType == null ? Input.empty() : this.sourceType;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public FavoriteArgs(
        @Nullable Input<String> category,
        @Nullable Input<String> config,
        @Nullable Input<String> favoriteId,
        @Nullable Input<FavoriteType> favoriteType,
        @Nullable Input<Boolean> isGeneratedFromTemplate,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        Input<String> resourceName,
        @Nullable Input<String> sourceType,
        @Nullable Input<List<String>> tags,
        @Nullable Input<String> version) {
        this.category = category;
        this.config = config;
        this.favoriteId = favoriteId;
        this.favoriteType = favoriteType;
        this.isGeneratedFromTemplate = isGeneratedFromTemplate;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.sourceType = sourceType;
        this.tags = tags;
        this.version = version;
    }

    private FavoriteArgs() {
        this.category = Input.empty();
        this.config = Input.empty();
        this.favoriteId = Input.empty();
        this.favoriteType = Input.empty();
        this.isGeneratedFromTemplate = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.sourceType = Input.empty();
        this.tags = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FavoriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> category;
        private @Nullable Input<String> config;
        private @Nullable Input<String> favoriteId;
        private @Nullable Input<FavoriteType> favoriteType;
        private @Nullable Input<Boolean> isGeneratedFromTemplate;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;
        private @Nullable Input<String> sourceType;
        private @Nullable Input<List<String>> tags;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FavoriteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.config = defaults.config;
    	      this.favoriteId = defaults.favoriteId;
    	      this.favoriteType = defaults.favoriteType;
    	      this.isGeneratedFromTemplate = defaults.isGeneratedFromTemplate;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.sourceType = defaults.sourceType;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder setCategory(@Nullable Input<String> category) {
            this.category = category;
            return this;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = Input.ofNullable(category);
            return this;
        }

        public Builder setConfig(@Nullable Input<String> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable String config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setFavoriteId(@Nullable Input<String> favoriteId) {
            this.favoriteId = favoriteId;
            return this;
        }

        public Builder setFavoriteId(@Nullable String favoriteId) {
            this.favoriteId = Input.ofNullable(favoriteId);
            return this;
        }

        public Builder setFavoriteType(@Nullable Input<FavoriteType> favoriteType) {
            this.favoriteType = favoriteType;
            return this;
        }

        public Builder setFavoriteType(@Nullable FavoriteType favoriteType) {
            this.favoriteType = Input.ofNullable(favoriteType);
            return this;
        }

        public Builder setIsGeneratedFromTemplate(@Nullable Input<Boolean> isGeneratedFromTemplate) {
            this.isGeneratedFromTemplate = isGeneratedFromTemplate;
            return this;
        }

        public Builder setIsGeneratedFromTemplate(@Nullable Boolean isGeneratedFromTemplate) {
            this.isGeneratedFromTemplate = Input.ofNullable(isGeneratedFromTemplate);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }

        public Builder setSourceType(@Nullable Input<String> sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = Input.ofNullable(sourceType);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public FavoriteArgs build() {
            return new FavoriteArgs(category, config, favoriteId, favoriteType, isGeneratedFromTemplate, name, resourceGroupName, resourceName, sourceType, tags, version);
        }
    }
}
