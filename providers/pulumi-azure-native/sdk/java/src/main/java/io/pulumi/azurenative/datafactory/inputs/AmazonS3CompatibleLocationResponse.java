// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmazonS3CompatibleLocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AmazonS3CompatibleLocationResponse Empty = new AmazonS3CompatibleLocationResponse();

    @InputImport(name="bucketName")
    private final @Nullable Object bucketName;

    public Optional<Object> getBucketName() {
        return this.bucketName == null ? Optional.empty() : Optional.ofNullable(this.bucketName);
    }

    @InputImport(name="fileName")
    private final @Nullable Object fileName;

    public Optional<Object> getFileName() {
        return this.fileName == null ? Optional.empty() : Optional.ofNullable(this.fileName);
    }

    @InputImport(name="folderPath")
    private final @Nullable Object folderPath;

    public Optional<Object> getFolderPath() {
        return this.folderPath == null ? Optional.empty() : Optional.ofNullable(this.folderPath);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="version")
    private final @Nullable Object version;

    public Optional<Object> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public AmazonS3CompatibleLocationResponse(
        @Nullable Object bucketName,
        @Nullable Object fileName,
        @Nullable Object folderPath,
        String type,
        @Nullable Object version) {
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = version;
    }

    private AmazonS3CompatibleLocationResponse() {
        this.bucketName = null;
        this.fileName = null;
        this.folderPath = null;
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3CompatibleLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object bucketName;
        private @Nullable Object fileName;
        private @Nullable Object folderPath;
        private String type;
        private @Nullable Object version;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3CompatibleLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setBucketName(@Nullable Object bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable Object version) {
            this.version = version;
            return this;
        }

        public AmazonS3CompatibleLocationResponse build() {
            return new AmazonS3CompatibleLocationResponse(bucketName, fileName, folderPath, type, version);
        }
    }
}
