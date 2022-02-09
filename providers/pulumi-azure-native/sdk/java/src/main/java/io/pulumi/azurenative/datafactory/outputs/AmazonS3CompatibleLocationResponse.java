// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AmazonS3CompatibleLocationResponse {
    private final @Nullable Object bucketName;
    private final @Nullable Object fileName;
    private final @Nullable Object folderPath;
    private final String type;
    private final @Nullable Object version;

    @OutputCustomType.Constructor({"bucketName","fileName","folderPath","type","version"})
    private AmazonS3CompatibleLocationResponse(
        @Nullable Object bucketName,
        @Nullable Object fileName,
        @Nullable Object folderPath,
        String type,
        @Nullable Object version) {
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    public Optional<Object> getBucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    public Optional<Object> getFileName() {
        return Optional.ofNullable(this.fileName);
    }
    public Optional<Object> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    public String getType() {
        return this.type;
    }
    public Optional<Object> getVersion() {
        return Optional.ofNullable(this.version);
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
