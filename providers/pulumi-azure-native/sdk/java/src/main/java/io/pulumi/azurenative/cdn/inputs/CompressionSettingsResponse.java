// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * settings for compression.
 * 
 */
public final class CompressionSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CompressionSettingsResponse Empty = new CompressionSettingsResponse();

    /**
     * List of content types on which compression applies. The value should be a valid MIME type.
     * 
     */
    @Import(name="contentTypesToCompress")
      private final @Nullable List<String> contentTypesToCompress;

    public List<String> getContentTypesToCompress() {
        return this.contentTypesToCompress == null ? List.of() : this.contentTypesToCompress;
    }

    /**
     * Indicates whether content compression is enabled on AzureFrontDoor. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won't be compressed on AzureFrontDoor when requested content is smaller than 1 byte or larger than 1 MB.
     * 
     */
    @Import(name="isCompressionEnabled")
      private final @Nullable Boolean isCompressionEnabled;

    public Optional<Boolean> getIsCompressionEnabled() {
        return this.isCompressionEnabled == null ? Optional.empty() : Optional.ofNullable(this.isCompressionEnabled);
    }

    public CompressionSettingsResponse(
        @Nullable List<String> contentTypesToCompress,
        @Nullable Boolean isCompressionEnabled) {
        this.contentTypesToCompress = contentTypesToCompress;
        this.isCompressionEnabled = isCompressionEnabled;
    }

    private CompressionSettingsResponse() {
        this.contentTypesToCompress = List.of();
        this.isCompressionEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompressionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> contentTypesToCompress;
        private @Nullable Boolean isCompressionEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(CompressionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentTypesToCompress = defaults.contentTypesToCompress;
    	      this.isCompressionEnabled = defaults.isCompressionEnabled;
        }

        public Builder contentTypesToCompress(@Nullable List<String> contentTypesToCompress) {
            this.contentTypesToCompress = contentTypesToCompress;
            return this;
        }
        public Builder contentTypesToCompress(String... contentTypesToCompress) {
            return contentTypesToCompress(List.of(contentTypesToCompress));
        }
        public Builder isCompressionEnabled(@Nullable Boolean isCompressionEnabled) {
            this.isCompressionEnabled = isCompressionEnabled;
            return this;
        }        public CompressionSettingsResponse build() {
            return new CompressionSettingsResponse(contentTypesToCompress, isCompressionEnabled);
        }
    }
}
