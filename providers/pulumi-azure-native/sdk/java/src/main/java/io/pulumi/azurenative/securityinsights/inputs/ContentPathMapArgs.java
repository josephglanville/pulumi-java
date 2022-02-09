// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.enums.ContentType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContentPathMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentPathMapArgs Empty = new ContentPathMapArgs();

    @InputImport(name="contentType")
    private final @Nullable Input<Either<String,ContentType>> contentType;

    public Input<Either<String,ContentType>> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public ContentPathMapArgs(
        @Nullable Input<Either<String,ContentType>> contentType,
        @Nullable Input<String> path) {
        this.contentType = contentType;
        this.path = path;
    }

    private ContentPathMapArgs() {
        this.contentType = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentPathMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ContentType>> contentType;
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentPathMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.path = defaults.path;
        }

        public Builder setContentType(@Nullable Input<Either<String,ContentType>> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable Either<String,ContentType> contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public ContentPathMapArgs build() {
            return new ContentPathMapArgs(contentType, path);
        }
    }
}
