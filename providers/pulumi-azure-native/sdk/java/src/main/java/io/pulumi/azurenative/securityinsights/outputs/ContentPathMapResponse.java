// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentPathMapResponse {
    private final @Nullable String contentType;
    private final @Nullable String path;

    @OutputCustomType.Constructor({"contentType","path"})
    private ContentPathMapResponse(
        @Nullable String contentType,
        @Nullable String path) {
        this.contentType = contentType;
        this.path = path;
    }

    public Optional<String> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
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
