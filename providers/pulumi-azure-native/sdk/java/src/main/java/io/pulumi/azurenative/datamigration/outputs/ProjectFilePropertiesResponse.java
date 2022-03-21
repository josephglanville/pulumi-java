// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectFilePropertiesResponse {
    /**
     * Optional File extension. If submitted it should not have a leading period and must match the extension from filePath.
     * 
     */
    private final @Nullable String extension;
    /**
     * Relative path of this file resource. This property can be set when creating or updating the file resource.
     * 
     */
    private final @Nullable String filePath;
    /**
     * Modification DateTime.
     * 
     */
    private final String lastModified;
    /**
     * File content type. This property can be modified to reflect the file content type.
     * 
     */
    private final @Nullable String mediaType;
    /**
     * File size.
     * 
     */
    private final Double size;

    @CustomType.Constructor
    private ProjectFilePropertiesResponse(
        @CustomType.Parameter("extension") @Nullable String extension,
        @CustomType.Parameter("filePath") @Nullable String filePath,
        @CustomType.Parameter("lastModified") String lastModified,
        @CustomType.Parameter("mediaType") @Nullable String mediaType,
        @CustomType.Parameter("size") Double size) {
        this.extension = extension;
        this.filePath = filePath;
        this.lastModified = lastModified;
        this.mediaType = mediaType;
        this.size = size;
    }

    /**
     * Optional File extension. If submitted it should not have a leading period and must match the extension from filePath.
     * 
    */
    public Optional<String> getExtension() {
        return Optional.ofNullable(this.extension);
    }
    /**
     * Relative path of this file resource. This property can be set when creating or updating the file resource.
     * 
    */
    public Optional<String> getFilePath() {
        return Optional.ofNullable(this.filePath);
    }
    /**
     * Modification DateTime.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * File content type. This property can be modified to reflect the file content type.
     * 
    */
    public Optional<String> getMediaType() {
        return Optional.ofNullable(this.mediaType);
    }
    /**
     * File size.
     * 
    */
    public Double getSize() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFilePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String extension;
        private @Nullable String filePath;
        private String lastModified;
        private @Nullable String mediaType;
        private Double size;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFilePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extension = defaults.extension;
    	      this.filePath = defaults.filePath;
    	      this.lastModified = defaults.lastModified;
    	      this.mediaType = defaults.mediaType;
    	      this.size = defaults.size;
        }

        public Builder extension(@Nullable String extension) {
            this.extension = extension;
            return this;
        }
        public Builder filePath(@Nullable String filePath) {
            this.filePath = filePath;
            return this;
        }
        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        public Builder mediaType(@Nullable String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public Builder size(Double size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }        public ProjectFilePropertiesResponse build() {
            return new ProjectFilePropertiesResponse(extension, filePath, lastModified, mediaType, size);
        }
    }
}
