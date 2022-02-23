// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of Oracle Cloud Storage dataset.
 * 
 */
public final class OracleCloudStorageLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleCloudStorageLocationArgs Empty = new OracleCloudStorageLocationArgs();

    /**
     * Specify the bucketName of Oracle Cloud Storage. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="bucketName")
      private final @Nullable Input<Object> bucketName;

    public Input<Object> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileName")
      private final @Nullable Input<Object> fileName;

    public Input<Object> getFileName() {
        return this.fileName == null ? Input.empty() : this.fileName;
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="folderPath")
      private final @Nullable Input<Object> folderPath;

    public Input<Object> getFolderPath() {
        return this.folderPath == null ? Input.empty() : this.folderPath;
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'OracleCloudStorageLocation'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Specify the version of Oracle Cloud Storage. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<Object> version;

    public Input<Object> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public OracleCloudStorageLocationArgs(
        @Nullable Input<Object> bucketName,
        @Nullable Input<Object> fileName,
        @Nullable Input<Object> folderPath,
        Input<String> type,
        @Nullable Input<Object> version) {
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = version;
    }

    private OracleCloudStorageLocationArgs() {
        this.bucketName = Input.empty();
        this.fileName = Input.empty();
        this.folderPath = Input.empty();
        this.type = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleCloudStorageLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> bucketName;
        private @Nullable Input<Object> fileName;
        private @Nullable Input<Object> folderPath;
        private Input<String> type;
        private @Nullable Input<Object> version;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleCloudStorageLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setBucketName(@Nullable Input<Object> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder setBucketName(@Nullable Object bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder setFileName(@Nullable Input<Object> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = Input.ofNullable(fileName);
            return this;
        }

        public Builder setFolderPath(@Nullable Input<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = Input.ofNullable(folderPath);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setVersion(@Nullable Input<Object> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Object version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public OracleCloudStorageLocationArgs build() {
            return new OracleCloudStorageLocationArgs(bucketName, fileName, folderPath, type, version);
        }
    }
}
