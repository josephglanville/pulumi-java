// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentationPartLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentationPartLocationArgs Empty = new DocumentationPartLocationArgs();

    /**
     * The HTTP verb of a method. The default value is `*` for any method.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<String> method;

    public Output<String> getMethod() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * The name of the targeted API entity.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL path of the target. The default value is `/` for the root resource.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * The HTTP status code of a response. The default value is `*` for any status code.
     * 
     */
    @Import(name="statusCode")
      private final @Nullable Output<String> statusCode;

    public Output<String> getStatusCode() {
        return this.statusCode == null ? Codegen.empty() : this.statusCode;
    }

    /**
     * The type of API entity to which the documentation content appliesE.g., `API`, `METHOD` or `REQUEST_BODY`
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DocumentationPartLocationArgs(
        @Nullable Output<String> method,
        @Nullable Output<String> name,
        @Nullable Output<String> path,
        @Nullable Output<String> statusCode,
        Output<String> type) {
        this.method = method;
        this.name = name;
        this.path = path;
        this.statusCode = statusCode;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DocumentationPartLocationArgs() {
        this.method = Codegen.empty();
        this.name = Codegen.empty();
        this.path = Codegen.empty();
        this.statusCode = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationPartLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> method;
        private @Nullable Output<String> name;
        private @Nullable Output<String> path;
        private @Nullable Output<String> statusCode;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationPartLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.statusCode = defaults.statusCode;
    	      this.type = defaults.type;
        }

        public Builder method(@Nullable Output<String> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable String method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder statusCode(@Nullable Output<String> statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Builder statusCode(@Nullable String statusCode) {
            this.statusCode = Codegen.ofNullable(statusCode);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public DocumentationPartLocationArgs build() {
            return new DocumentationPartLocationArgs(method, name, path, statusCode, type);
        }
    }
}
