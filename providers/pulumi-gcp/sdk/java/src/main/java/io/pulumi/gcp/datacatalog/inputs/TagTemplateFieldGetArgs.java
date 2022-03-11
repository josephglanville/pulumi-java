// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateFieldGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldGetArgs Empty = new TagTemplateFieldGetArgs();

    /**
     * A description for this field.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The display name for this template.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="fieldId", required=true)
      private final Output<String> fieldId;

    public Output<String> getFieldId() {
        return this.fieldId;
    }

    /**
     * Whether this is a required field. Defaults to false.
     * 
     */
    @InputImport(name="isRequired")
      private final @Nullable Output<Boolean> isRequired;

    public Output<Boolean> getIsRequired() {
        return this.isRequired == null ? Output.empty() : this.isRequired;
    }

    /**
     * - 
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The order of this field with respect to other fields in this tag template.
     * A higher value indicates a more important field. The value can be negative.
     * Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
     * 
     */
    @InputImport(name="order")
      private final @Nullable Output<Integer> order;

    public Output<Integer> getOrder() {
        return this.order == null ? Output.empty() : this.order;
    }

    /**
     * The type of value this tag field can contain.
     * Structure is documented below.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<TagTemplateFieldTypeGetArgs> type;

    public Output<TagTemplateFieldTypeGetArgs> getType() {
        return this.type;
    }

    public TagTemplateFieldGetArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<String> fieldId,
        @Nullable Output<Boolean> isRequired,
        @Nullable Output<String> name,
        @Nullable Output<Integer> order,
        Output<TagTemplateFieldTypeGetArgs> type) {
        this.description = description;
        this.displayName = displayName;
        this.fieldId = Objects.requireNonNull(fieldId, "expected parameter 'fieldId' to be non-null");
        this.isRequired = isRequired;
        this.name = name;
        this.order = order;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TagTemplateFieldGetArgs() {
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.fieldId = Output.empty();
        this.isRequired = Output.empty();
        this.name = Output.empty();
        this.order = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<String> fieldId;
        private @Nullable Output<Boolean> isRequired;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> order;
        private Output<TagTemplateFieldTypeGetArgs> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fieldId = defaults.fieldId;
    	      this.isRequired = defaults.isRequired;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder fieldId(Output<String> fieldId) {
            this.fieldId = Objects.requireNonNull(fieldId);
            return this;
        }

        public Builder fieldId(String fieldId) {
            this.fieldId = Output.of(Objects.requireNonNull(fieldId));
            return this;
        }

        public Builder isRequired(@Nullable Output<Boolean> isRequired) {
            this.isRequired = isRequired;
            return this;
        }

        public Builder isRequired(@Nullable Boolean isRequired) {
            this.isRequired = Output.ofNullable(isRequired);
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

        public Builder order(@Nullable Output<Integer> order) {
            this.order = order;
            return this;
        }

        public Builder order(@Nullable Integer order) {
            this.order = Output.ofNullable(order);
            return this;
        }

        public Builder type(Output<TagTemplateFieldTypeGetArgs> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(TagTemplateFieldTypeGetArgs type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public TagTemplateFieldGetArgs build() {
            return new TagTemplateFieldGetArgs(description, displayName, fieldId, isRequired, name, order, type);
        }
    }
}
