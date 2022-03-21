// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApiConfigOpenapiDocumentDocumentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigOpenapiDocumentDocumentGetArgs Empty = new ApiConfigOpenapiDocumentDocumentGetArgs();

    /**
     * Base64 encoded content of the file.
     * 
     */
    @Import(name="contents", required=true)
      private final Output<String> contents;

    public Output<String> getContents() {
        return this.contents;
    }

    /**
     * The file path (full or relative path). This is typically the path of the file when it is uploaded.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    public ApiConfigOpenapiDocumentDocumentGetArgs(
        Output<String> contents,
        Output<String> path) {
        this.contents = Objects.requireNonNull(contents, "expected parameter 'contents' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private ApiConfigOpenapiDocumentDocumentGetArgs() {
        this.contents = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigOpenapiDocumentDocumentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contents;
        private Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigOpenapiDocumentDocumentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.path = defaults.path;
        }

        public Builder contents(Output<String> contents) {
            this.contents = Objects.requireNonNull(contents);
            return this;
        }
        public Builder contents(String contents) {
            this.contents = Output.of(Objects.requireNonNull(contents));
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }        public ApiConfigOpenapiDocumentDocumentGetArgs build() {
            return new ApiConfigOpenapiDocumentDocumentGetArgs(contents, path);
        }
    }
}
