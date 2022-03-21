// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.ColumnSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The format, if 'type' is not 'object'
     * 
     */
    @Import(name="format")
      private final @Nullable Output<String> format;

    public Output<String> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    /**
     * The set of columns within the data table.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,ColumnSpecificationArgs>> properties;

    public Output<Map<String,ColumnSpecificationArgs>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Swagger schema title.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    /**
     * The type of the entity described in swagger.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TableSpecificationArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> format,
        @Nullable Output<Map<String,ColumnSpecificationArgs>> properties,
        @Nullable Output<String> title,
        Output<String> type) {
        this.description = description;
        this.format = format;
        this.properties = properties;
        this.title = title;
        this.type = type == null ? Output.ofNullable("object") : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TableSpecificationArgs() {
        this.description = Output.empty();
        this.format = Output.empty();
        this.properties = Output.empty();
        this.title = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> format;
        private @Nullable Output<Map<String,ColumnSpecificationArgs>> properties;
        private @Nullable Output<String> title;
        private Output<String> type;

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

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder format(@Nullable Output<String> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = Output.ofNullable(format);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,ColumnSpecificationArgs>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,ColumnSpecificationArgs> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public TableSpecificationArgs build() {
            return new TableSpecificationArgs(description, format, properties, title, type);
        }
    }
}
