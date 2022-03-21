// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateFieldTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldTypeArgs Empty = new TagTemplateFieldTypeArgs();

    /**
     * Represents an enum type.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Structure is documented below.
     * 
     */
    @Import(name="enumType")
      private final @Nullable Output<TagTemplateFieldTypeEnumTypeArgs> enumType;

    public Output<TagTemplateFieldTypeEnumTypeArgs> getEnumType() {
        return this.enumType == null ? Output.empty() : this.enumType;
    }

    /**
     * Represents primitive types - string, bool etc.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Possible values are `DOUBLE`, `STRING`, `BOOL`, and `TIMESTAMP`.
     * 
     */
    @Import(name="primitiveType")
      private final @Nullable Output<String> primitiveType;

    public Output<String> getPrimitiveType() {
        return this.primitiveType == null ? Output.empty() : this.primitiveType;
    }

    public TagTemplateFieldTypeArgs(
        @Nullable Output<TagTemplateFieldTypeEnumTypeArgs> enumType,
        @Nullable Output<String> primitiveType) {
        this.enumType = enumType;
        this.primitiveType = primitiveType;
    }

    private TagTemplateFieldTypeArgs() {
        this.enumType = Output.empty();
        this.primitiveType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TagTemplateFieldTypeEnumTypeArgs> enumType;
        private @Nullable Output<String> primitiveType;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumType = defaults.enumType;
    	      this.primitiveType = defaults.primitiveType;
        }

        public Builder enumType(@Nullable Output<TagTemplateFieldTypeEnumTypeArgs> enumType) {
            this.enumType = enumType;
            return this;
        }
        public Builder enumType(@Nullable TagTemplateFieldTypeEnumTypeArgs enumType) {
            this.enumType = Output.ofNullable(enumType);
            return this;
        }
        public Builder primitiveType(@Nullable Output<String> primitiveType) {
            this.primitiveType = primitiveType;
            return this;
        }
        public Builder primitiveType(@Nullable String primitiveType) {
            this.primitiveType = Output.ofNullable(primitiveType);
            return this;
        }        public TagTemplateFieldTypeArgs build() {
            return new TagTemplateFieldTypeArgs(enumType, primitiveType);
        }
    }
}
