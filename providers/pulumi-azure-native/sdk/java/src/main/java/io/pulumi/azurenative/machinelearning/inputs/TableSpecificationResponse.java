// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.ColumnSpecificationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableSpecificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final TableSpecificationResponse Empty = new TableSpecificationResponse();

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="format")
    private final @Nullable String format;

    public Optional<String> getFormat() {
        return this.format == null ? Optional.empty() : Optional.ofNullable(this.format);
    }

    @InputImport(name="properties")
    private final @Nullable Map<String,ColumnSpecificationResponse> properties;

    public Map<String,ColumnSpecificationResponse> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    @InputImport(name="title")
    private final @Nullable String title;

    public Optional<String> getTitle() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public TableSpecificationResponse(
        @Nullable String description,
        @Nullable String format,
        @Nullable Map<String,ColumnSpecificationResponse> properties,
        @Nullable String title,
        String type) {
        this.description = description;
        this.format = format;
        this.properties = properties;
        this.title = title;
        this.type = type == null ? "object" : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TableSpecificationResponse() {
        this.description = null;
        this.format = null;
        this.properties = Map.of();
        this.title = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String format;
        private @Nullable Map<String,ColumnSpecificationResponse> properties;
        private @Nullable String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.properties = defaults.properties;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,ColumnSpecificationResponse> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public TableSpecificationResponse build() {
            return new TableSpecificationResponse(description, format, properties, title, type);
        }
    }
}
