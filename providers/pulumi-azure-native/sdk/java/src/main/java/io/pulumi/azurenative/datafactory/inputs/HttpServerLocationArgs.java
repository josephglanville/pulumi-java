// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of http server.
 * 
 */
public final class HttpServerLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpServerLocationArgs Empty = new HttpServerLocationArgs();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
      private final @Nullable Output<Object> fileName;

    public Output<Object> getFileName() {
        return this.fileName == null ? Output.empty() : this.fileName;
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
      private final @Nullable Output<Object> folderPath;

    public Output<Object> getFolderPath() {
        return this.folderPath == null ? Output.empty() : this.folderPath;
    }

    /**
     * Specify the relativeUrl of http server. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="relativeUrl")
      private final @Nullable Output<Object> relativeUrl;

    public Output<Object> getRelativeUrl() {
        return this.relativeUrl == null ? Output.empty() : this.relativeUrl;
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'HttpServerLocation'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public HttpServerLocationArgs(
        @Nullable Output<Object> fileName,
        @Nullable Output<Object> folderPath,
        @Nullable Output<Object> relativeUrl,
        Output<String> type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.relativeUrl = relativeUrl;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HttpServerLocationArgs() {
        this.fileName = Output.empty();
        this.folderPath = Output.empty();
        this.relativeUrl = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpServerLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> fileName;
        private @Nullable Output<Object> folderPath;
        private @Nullable Output<Object> relativeUrl;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpServerLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.relativeUrl = defaults.relativeUrl;
    	      this.type = defaults.type;
        }

        public Builder fileName(@Nullable Output<Object> fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder fileName(@Nullable Object fileName) {
            this.fileName = Output.ofNullable(fileName);
            return this;
        }
        public Builder folderPath(@Nullable Output<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = Output.ofNullable(folderPath);
            return this;
        }
        public Builder relativeUrl(@Nullable Output<Object> relativeUrl) {
            this.relativeUrl = relativeUrl;
            return this;
        }
        public Builder relativeUrl(@Nullable Object relativeUrl) {
            this.relativeUrl = Output.ofNullable(relativeUrl);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public HttpServerLocationArgs build() {
            return new HttpServerLocationArgs(fileName, folderPath, relativeUrl, type);
        }
    }
}
