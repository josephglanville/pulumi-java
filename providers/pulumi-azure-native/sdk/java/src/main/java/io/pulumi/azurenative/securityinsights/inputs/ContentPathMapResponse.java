// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The mapping of content type to a repo path.
 * 
 */
public final class ContentPathMapResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentPathMapResponse Empty = new ContentPathMapResponse();

    /**
     * Content type.
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable String contentType;

    public Optional<String> getContentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    /**
     * The path to the content.
     * 
     */
    @InputImport(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    public ContentPathMapResponse(
        @Nullable String contentType,
        @Nullable String path) {
        this.contentType = contentType;
        this.path = path;
    }

    private ContentPathMapResponse() {
        this.contentType = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentPathMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentPathMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.path = defaults.path;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }
        public ContentPathMapResponse build() {
            return new ContentPathMapResponse(contentType, path);
        }
    }
}
