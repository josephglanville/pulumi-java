// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Base class for file properties.
 * 
 */
public final class ProjectFilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFilePropertiesArgs Empty = new ProjectFilePropertiesArgs();

    /**
     * Optional File extension. If submitted it should not have a leading period and must match the extension from filePath.
     * 
     */
    @InputImport(name="extension")
      private final @Nullable Output<String> extension;

    public Output<String> getExtension() {
        return this.extension == null ? Output.empty() : this.extension;
    }

    /**
     * Relative path of this file resource. This property can be set when creating or updating the file resource.
     * 
     */
    @InputImport(name="filePath")
      private final @Nullable Output<String> filePath;

    public Output<String> getFilePath() {
        return this.filePath == null ? Output.empty() : this.filePath;
    }

    /**
     * File content type. This property can be modified to reflect the file content type.
     * 
     */
    @InputImport(name="mediaType")
      private final @Nullable Output<String> mediaType;

    public Output<String> getMediaType() {
        return this.mediaType == null ? Output.empty() : this.mediaType;
    }

    public ProjectFilePropertiesArgs(
        @Nullable Output<String> extension,
        @Nullable Output<String> filePath,
        @Nullable Output<String> mediaType) {
        this.extension = extension;
        this.filePath = filePath;
        this.mediaType = mediaType;
    }

    private ProjectFilePropertiesArgs() {
        this.extension = Output.empty();
        this.filePath = Output.empty();
        this.mediaType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> extension;
        private @Nullable Output<String> filePath;
        private @Nullable Output<String> mediaType;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFilePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extension = defaults.extension;
    	      this.filePath = defaults.filePath;
    	      this.mediaType = defaults.mediaType;
        }

        public Builder extension(@Nullable Output<String> extension) {
            this.extension = extension;
            return this;
        }

        public Builder extension(@Nullable String extension) {
            this.extension = Output.ofNullable(extension);
            return this;
        }

        public Builder filePath(@Nullable Output<String> filePath) {
            this.filePath = filePath;
            return this;
        }

        public Builder filePath(@Nullable String filePath) {
            this.filePath = Output.ofNullable(filePath);
            return this;
        }

        public Builder mediaType(@Nullable Output<String> mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public Builder mediaType(@Nullable String mediaType) {
            this.mediaType = Output.ofNullable(mediaType);
            return this;
        }
        public ProjectFilePropertiesArgs build() {
            return new ProjectFilePropertiesArgs(extension, filePath, mediaType);
        }
    }
}
