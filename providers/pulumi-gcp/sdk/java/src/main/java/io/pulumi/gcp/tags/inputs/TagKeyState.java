// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagKeyState extends io.pulumi.resources.ResourceArgs {

    public static final TagKeyState Empty = new TagKeyState();

    /**
     * Output only. Creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * User-assigned description of the TagKey. Must not exceed 256 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The generated numeric id for the TagKey.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Output only. Namespaced name of the TagKey.
     * 
     */
    @InputImport(name="namespacedName")
      private final @Nullable Input<String> namespacedName;

    public Input<String> getNamespacedName() {
        return this.namespacedName == null ? Input.empty() : this.namespacedName;
    }

    /**
     * Input only. The resource name of the new TagKey's parent. Must be of the form organizations/{org_id}.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * Input only. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace.
     * The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @InputImport(name="shortName")
      private final @Nullable Input<String> shortName;

    public Input<String> getShortName() {
        return this.shortName == null ? Input.empty() : this.shortName;
    }

    /**
     * Output only. Update time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional
     * digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="updateTime")
      private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public TagKeyState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> namespacedName,
        @Nullable Input<String> parent,
        @Nullable Input<String> shortName,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.name = name;
        this.namespacedName = namespacedName;
        this.parent = parent;
        this.shortName = shortName;
        this.updateTime = updateTime;
    }

    private TagKeyState() {
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.namespacedName = Input.empty();
        this.parent = Input.empty();
        this.shortName = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespacedName;
        private @Nullable Input<String> parent;
        private @Nullable Input<String> shortName;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TagKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.namespacedName = defaults.namespacedName;
    	      this.parent = defaults.parent;
    	      this.shortName = defaults.shortName;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamespacedName(@Nullable Input<String> namespacedName) {
            this.namespacedName = namespacedName;
            return this;
        }

        public Builder setNamespacedName(@Nullable String namespacedName) {
            this.namespacedName = Input.ofNullable(namespacedName);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setShortName(@Nullable Input<String> shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder setShortName(@Nullable String shortName) {
            this.shortName = Input.ofNullable(shortName);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }
        public TagKeyState build() {
            return new TagKeyState(createTime, description, name, namespacedName, parent, shortName, updateTime);
        }
    }
}
