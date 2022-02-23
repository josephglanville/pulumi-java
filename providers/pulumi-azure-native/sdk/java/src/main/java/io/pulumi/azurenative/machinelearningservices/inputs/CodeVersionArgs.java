// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Code asset version details.
 * 
 */
public final class CodeVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CodeVersionArgs Empty = new CodeVersionArgs();

    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
     */
    @InputImport(name="datastoreId")
      private final @Nullable Input<String> datastoreId;

    public Input<String> getDatastoreId() {
        return this.datastoreId == null ? Input.empty() : this.datastoreId;
    }

    /**
     * The asset description text.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    @InputImport(name="isAnonymous")
      private final @Nullable Input<Boolean> isAnonymous;

    public Input<Boolean> getIsAnonymous() {
        return this.isAnonymous == null ? Input.empty() : this.isAnonymous;
    }

    /**
     * The path of the file/directory in the datastore.
     * 
     */
    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CodeVersionArgs(
        @Nullable Input<String> datastoreId,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> isAnonymous,
        Input<String> path,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<Map<String,String>> tags) {
        this.datastoreId = datastoreId;
        this.description = description;
        this.isAnonymous = isAnonymous;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.properties = properties;
        this.tags = tags;
    }

    private CodeVersionArgs() {
        this.datastoreId = Input.empty();
        this.description = Input.empty();
        this.isAnonymous = Input.empty();
        this.path = Input.empty();
        this.properties = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datastoreId;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> isAnonymous;
        private Input<String> path;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.description = defaults.description;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.path = defaults.path;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder setDatastoreId(@Nullable Input<String> datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder setDatastoreId(@Nullable String datastoreId) {
            this.datastoreId = Input.ofNullable(datastoreId);
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

        public Builder setIsAnonymous(@Nullable Input<Boolean> isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }

        public Builder setIsAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = Input.ofNullable(isAnonymous);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public CodeVersionArgs build() {
            return new CodeVersionArgs(datastoreId, description, isAnonymous, path, properties, tags);
        }
    }
}
