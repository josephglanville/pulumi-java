// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateArgs Empty = new TagTemplateArgs();

    /**
     * The display name for this template. Defaults to an empty string.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. This map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. Field IDs can contain letters (both uppercase and lowercase), numbers (0-9) and underscores (_). Field IDs must be at least 1 character long and at most 64 characters long. Field IDs must start with a letter or underscore.
     * 
     */
    @Import(name="fields", required=true)
      private final Output<Map<String,String>> fields;

    public Output<Map<String,String>> getFields() {
        return this.fields;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the tag template in URL format. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id} Note that this TagTemplate and its child resources may not actually be stored in the location in this name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="tagTemplateId", required=true)
      private final Output<String> tagTemplateId;

    public Output<String> getTagTemplateId() {
        return this.tagTemplateId;
    }

    public TagTemplateArgs(
        @Nullable Output<String> displayName,
        Output<Map<String,String>> fields,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> tagTemplateId) {
        this.displayName = displayName;
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.location = location;
        this.name = name;
        this.project = project;
        this.tagTemplateId = Objects.requireNonNull(tagTemplateId, "expected parameter 'tagTemplateId' to be non-null");
    }

    private TagTemplateArgs() {
        this.displayName = Output.empty();
        this.fields = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.tagTemplateId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private Output<Map<String,String>> fields;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> tagTemplateId;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fields = defaults.fields;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.tagTemplateId = defaults.tagTemplateId;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder fields(Output<Map<String,String>> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(Map<String,String> fields) {
            this.fields = Output.of(Objects.requireNonNull(fields));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder tagTemplateId(Output<String> tagTemplateId) {
            this.tagTemplateId = Objects.requireNonNull(tagTemplateId);
            return this;
        }
        public Builder tagTemplateId(String tagTemplateId) {
            this.tagTemplateId = Output.of(Objects.requireNonNull(tagTemplateId));
            return this;
        }        public TagTemplateArgs build() {
            return new TagTemplateArgs(displayName, fields, location, name, project, tagTemplateId);
        }
    }
}
