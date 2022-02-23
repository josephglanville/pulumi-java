// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.ColumnSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The swagger 2.0 schema describing a single service input or output. See Swagger specification: http://swagger.io/specification/
 * 
 */
public final class TableSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableSpecificationArgs Empty = new TableSpecificationArgs();

    /**
     * Swagger schema description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The format, if 'type' is not 'object'
     * 
     */
    @InputImport(name="format")
      private final @Nullable Input<String> format;

    public Input<String> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    /**
     * The set of columns within the data table.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,ColumnSpecificationArgs>> properties;

    public Input<Map<String,ColumnSpecificationArgs>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Swagger schema title.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    /**
     * The type of the entity described in swagger.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TableSpecificationArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> format,
        @Nullable Input<Map<String,ColumnSpecificationArgs>> properties,
        @Nullable Input<String> title,
        Input<String> type) {
        this.description = description;
        this.format = format;
        this.properties = properties;
        this.title = title;
        this.type = type == null ? Input.ofNullable("object") : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TableSpecificationArgs() {
        this.description = Input.empty();
        this.format = Input.empty();
        this.properties = Input.empty();
        this.title = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> format;
        private @Nullable Input<Map<String,ColumnSpecificationArgs>> properties;
        private @Nullable Input<String> title;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.properties = defaults.properties;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFormat(@Nullable Input<String> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,ColumnSpecificationArgs>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,ColumnSpecificationArgs> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public TableSpecificationArgs build() {
            return new TableSpecificationArgs(description, format, properties, title, type);
        }
    }
}
