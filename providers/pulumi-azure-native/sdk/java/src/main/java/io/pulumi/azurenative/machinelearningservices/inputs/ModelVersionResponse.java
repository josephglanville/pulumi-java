// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.FlavorDataResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelVersionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ModelVersionResponse Empty = new ModelVersionResponse();

    @InputImport(name="datastoreId")
    private final @Nullable String datastoreId;

    public Optional<String> getDatastoreId() {
        return this.datastoreId == null ? Optional.empty() : Optional.ofNullable(this.datastoreId);
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="flavors")
    private final @Nullable Map<String,FlavorDataResponse> flavors;

    public Map<String,FlavorDataResponse> getFlavors() {
        return this.flavors == null ? Map.of() : this.flavors;
    }

    @InputImport(name="isAnonymous")
    private final @Nullable Boolean isAnonymous;

    public Optional<Boolean> getIsAnonymous() {
        return this.isAnonymous == null ? Optional.empty() : Optional.ofNullable(this.isAnonymous);
    }

    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public ModelVersionResponse(
        @Nullable String datastoreId,
        @Nullable String description,
        @Nullable Map<String,FlavorDataResponse> flavors,
        @Nullable Boolean isAnonymous,
        String path,
        @Nullable Map<String,String> properties,
        @Nullable Map<String,String> tags) {
        this.datastoreId = datastoreId;
        this.description = description;
        this.flavors = flavors;
        this.isAnonymous = isAnonymous;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.properties = properties;
        this.tags = tags;
    }

    private ModelVersionResponse() {
        this.datastoreId = null;
        this.description = null;
        this.flavors = Map.of();
        this.isAnonymous = null;
        this.path = null;
        this.properties = Map.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String description;
        private @Nullable Map<String,FlavorDataResponse> flavors;
        private @Nullable Boolean isAnonymous;
        private String path;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.description = defaults.description;
    	      this.flavors = defaults.flavors;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.path = defaults.path;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder setDatastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFlavors(@Nullable Map<String,FlavorDataResponse> flavors) {
            this.flavors = flavors;
            return this;
        }

        public Builder setIsAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public ModelVersionResponse build() {
            return new ModelVersionResponse(datastoreId, description, flavors, isAnonymous, path, properties, tags);
        }
    }
}
