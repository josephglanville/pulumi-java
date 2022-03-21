// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.athena.enums.DataCatalogType;
import io.pulumi.awsnative.athena.inputs.DataCatalogTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataCatalogArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCatalogArgs Empty = new DataCatalogArgs();

    /**
     * A description of the data catalog to be created.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the data catalog to create. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values depend on the catalog type.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Object> parameters;

    public Output<Object> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * A list of comma separated tags to add to the data catalog that is created.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DataCatalogTagArgs>> tags;

    public Output<List<DataCatalogTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The type of data catalog to create: LAMBDA for a federated catalog, GLUE for AWS Glue Catalog, or HIVE for an external hive metastore.
     * 
     */
    @Import(name="type", required=true)
      private final Output<DataCatalogType> type;

    public Output<DataCatalogType> getType() {
        return this.type;
    }

    public DataCatalogArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<Object> parameters,
        @Nullable Output<List<DataCatalogTagArgs>> tags,
        Output<DataCatalogType> type) {
        this.description = description;
        this.name = name;
        this.parameters = parameters;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DataCatalogArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.parameters = Output.empty();
        this.tags = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<Object> parameters;
        private @Nullable Output<List<DataCatalogTagArgs>> tags;
        private Output<DataCatalogType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.tags = defaults.tags;
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder parameters(@Nullable Output<Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Object parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder tags(@Nullable Output<List<DataCatalogTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DataCatalogTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(DataCatalogTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder type(Output<DataCatalogType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(DataCatalogType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public DataCatalogArgs build() {
            return new DataCatalogArgs(description, name, parameters, tags, type);
        }
    }
}
