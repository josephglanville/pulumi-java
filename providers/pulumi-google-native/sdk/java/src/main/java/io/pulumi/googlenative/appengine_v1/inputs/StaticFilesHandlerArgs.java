// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
 * 
 */
public final class StaticFilesHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticFilesHandlerArgs Empty = new StaticFilesHandlerArgs();

    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
     * 
     */
    @Import(name="applicationReadable")
      private final @Nullable Output<Boolean> applicationReadable;

    public Output<Boolean> getApplicationReadable() {
        return this.applicationReadable == null ? Output.empty() : this.applicationReadable;
    }

    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * 
     */
    @Import(name="expiration")
      private final @Nullable Output<String> expiration;

    public Output<String> getExpiration() {
        return this.expiration == null ? Output.empty() : this.expiration;
    }

    /**
     * HTTP headers to use for all responses from these URLs.
     * 
     */
    @Import(name="httpHeaders")
      private final @Nullable Output<Map<String,String>> httpHeaders;

    public Output<Map<String,String>> getHttpHeaders() {
        return this.httpHeaders == null ? Output.empty() : this.httpHeaders;
    }

    /**
     * MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension.
     * 
     */
    @Import(name="mimeType")
      private final @Nullable Output<String> mimeType;

    public Output<String> getMimeType() {
        return this.mimeType == null ? Output.empty() : this.mimeType;
    }

    /**
     * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
     */
    @Import(name="requireMatchingFile")
      private final @Nullable Output<Boolean> requireMatchingFile;

    public Output<Boolean> getRequireMatchingFile() {
        return this.requireMatchingFile == null ? Output.empty() : this.requireMatchingFile;
    }

    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
     */
    @Import(name="uploadPathRegex")
      private final @Nullable Output<String> uploadPathRegex;

    public Output<String> getUploadPathRegex() {
        return this.uploadPathRegex == null ? Output.empty() : this.uploadPathRegex;
    }

    public StaticFilesHandlerArgs(
        @Nullable Output<Boolean> applicationReadable,
        @Nullable Output<String> expiration,
        @Nullable Output<Map<String,String>> httpHeaders,
        @Nullable Output<String> mimeType,
        @Nullable Output<String> path,
        @Nullable Output<Boolean> requireMatchingFile,
        @Nullable Output<String> uploadPathRegex) {
        this.applicationReadable = applicationReadable;
        this.expiration = expiration;
        this.httpHeaders = httpHeaders;
        this.mimeType = mimeType;
        this.path = path;
        this.requireMatchingFile = requireMatchingFile;
        this.uploadPathRegex = uploadPathRegex;
    }

    private StaticFilesHandlerArgs() {
        this.applicationReadable = Output.empty();
        this.expiration = Output.empty();
        this.httpHeaders = Output.empty();
        this.mimeType = Output.empty();
        this.path = Output.empty();
        this.requireMatchingFile = Output.empty();
        this.uploadPathRegex = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticFilesHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> applicationReadable;
        private @Nullable Output<String> expiration;
        private @Nullable Output<Map<String,String>> httpHeaders;
        private @Nullable Output<String> mimeType;
        private @Nullable Output<String> path;
        private @Nullable Output<Boolean> requireMatchingFile;
        private @Nullable Output<String> uploadPathRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticFilesHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationReadable = defaults.applicationReadable;
    	      this.expiration = defaults.expiration;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.mimeType = defaults.mimeType;
    	      this.path = defaults.path;
    	      this.requireMatchingFile = defaults.requireMatchingFile;
    	      this.uploadPathRegex = defaults.uploadPathRegex;
        }

        public Builder applicationReadable(@Nullable Output<Boolean> applicationReadable) {
            this.applicationReadable = applicationReadable;
            return this;
        }
        public Builder applicationReadable(@Nullable Boolean applicationReadable) {
            this.applicationReadable = Output.ofNullable(applicationReadable);
            return this;
        }
        public Builder expiration(@Nullable Output<String> expiration) {
            this.expiration = expiration;
            return this;
        }
        public Builder expiration(@Nullable String expiration) {
            this.expiration = Output.ofNullable(expiration);
            return this;
        }
        public Builder httpHeaders(@Nullable Output<Map<String,String>> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public Builder httpHeaders(@Nullable Map<String,String> httpHeaders) {
            this.httpHeaders = Output.ofNullable(httpHeaders);
            return this;
        }
        public Builder mimeType(@Nullable Output<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = Output.ofNullable(mimeType);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public Builder requireMatchingFile(@Nullable Output<Boolean> requireMatchingFile) {
            this.requireMatchingFile = requireMatchingFile;
            return this;
        }
        public Builder requireMatchingFile(@Nullable Boolean requireMatchingFile) {
            this.requireMatchingFile = Output.ofNullable(requireMatchingFile);
            return this;
        }
        public Builder uploadPathRegex(@Nullable Output<String> uploadPathRegex) {
            this.uploadPathRegex = uploadPathRegex;
            return this;
        }
        public Builder uploadPathRegex(@Nullable String uploadPathRegex) {
            this.uploadPathRegex = Output.ofNullable(uploadPathRegex);
            return this;
        }        public StaticFilesHandlerArgs build() {
            return new StaticFilesHandlerArgs(applicationReadable, expiration, httpHeaders, mimeType, path, requireMatchingFile, uploadPathRegex);
        }
    }
}
