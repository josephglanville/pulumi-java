// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExternalDocumentation allows referencing an external resource for extended documentation.
 * 
 */
public final class ExternalDocumentationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalDocumentationArgs Empty = new ExternalDocumentationArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public ExternalDocumentationArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> url) {
        this.description = description;
        this.url = url;
    }

    private ExternalDocumentationArgs() {
        this.description = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDocumentationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalDocumentationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.url = defaults.url;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }        public ExternalDocumentationArgs build() {
            return new ExternalDocumentationArgs(description, url);
        }
    }
}
