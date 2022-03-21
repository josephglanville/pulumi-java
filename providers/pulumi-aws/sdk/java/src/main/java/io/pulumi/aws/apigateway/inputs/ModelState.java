// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelState extends io.pulumi.resources.ResourceArgs {

    public static final ModelState Empty = new ModelState();

    /**
     * The content type of the model
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Output.empty() : this.contentType;
    }

    /**
     * The description of the model
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the model
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi")
      private final @Nullable Output<String> restApi;

    public Output<String> getRestApi() {
        return this.restApi == null ? Output.empty() : this.restApi;
    }

    /**
     * The schema of the model in a JSON form
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> getSchema() {
        return this.schema == null ? Output.empty() : this.schema;
    }

    public ModelState(
        @Nullable Output<String> contentType,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> restApi,
        @Nullable Output<String> schema) {
        this.contentType = contentType;
        this.description = description;
        this.name = name;
        this.restApi = restApi;
        this.schema = schema;
    }

    private ModelState() {
        this.contentType = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.restApi = Output.empty();
        this.schema = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> restApi;
        private @Nullable Output<String> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.restApi = defaults.restApi;
    	      this.schema = defaults.schema;
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Output.ofNullable(contentType);
            return this;
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
        public Builder restApi(@Nullable Output<String> restApi) {
            this.restApi = restApi;
            return this;
        }
        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = Output.ofNullable(schema);
            return this;
        }        public ModelState build() {
            return new ModelState(contentType, description, name, restApi, schema);
        }
    }
}
