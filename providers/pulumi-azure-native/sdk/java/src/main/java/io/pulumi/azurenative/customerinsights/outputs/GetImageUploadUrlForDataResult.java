// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageUploadUrlForDataResult {
    /**
     * Content URL for the image blob.
     * 
     */
    private final @Nullable String contentUrl;
    /**
     * Whether image exists already.
     * 
     */
    private final @Nullable Boolean imageExists;
    /**
     * Relative path of the image.
     * 
     */
    private final @Nullable String relativePath;

    @CustomType.Constructor
    private GetImageUploadUrlForDataResult(
        @CustomType.Parameter("contentUrl") @Nullable String contentUrl,
        @CustomType.Parameter("imageExists") @Nullable Boolean imageExists,
        @CustomType.Parameter("relativePath") @Nullable String relativePath) {
        this.contentUrl = contentUrl;
        this.imageExists = imageExists;
        this.relativePath = relativePath;
    }

    /**
     * Content URL for the image blob.
     * 
    */
    public Optional<String> getContentUrl() {
        return Optional.ofNullable(this.contentUrl);
    }
    /**
     * Whether image exists already.
     * 
    */
    public Optional<Boolean> getImageExists() {
        return Optional.ofNullable(this.imageExists);
    }
    /**
     * Relative path of the image.
     * 
    */
    public Optional<String> getRelativePath() {
        return Optional.ofNullable(this.relativePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageUploadUrlForDataResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentUrl;
        private @Nullable Boolean imageExists;
        private @Nullable String relativePath;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageUploadUrlForDataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUrl = defaults.contentUrl;
    	      this.imageExists = defaults.imageExists;
    	      this.relativePath = defaults.relativePath;
        }

        public Builder contentUrl(@Nullable String contentUrl) {
            this.contentUrl = contentUrl;
            return this;
        }
        public Builder imageExists(@Nullable Boolean imageExists) {
            this.imageExists = imageExists;
            return this;
        }
        public Builder relativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }        public GetImageUploadUrlForDataResult build() {
            return new GetImageUploadUrlForDataResult(contentUrl, imageExists, relativePath);
        }
    }
}
