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
 * The location of azure blobFS dataset.
 * 
 */
public final class AzureBlobFSLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobFSLocationArgs Empty = new AzureBlobFSLocationArgs();

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
     * Specify the fileSystem of azure blobFS. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileSystem")
      private final @Nullable Input<Object> fileSystem;

    public Input<Object> getFileSystem() {
        return this.fileSystem == null ? Input.empty() : this.fileSystem;
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
     * Expected value is 'AzureBlobFSLocation'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureBlobFSLocationArgs(
        @Nullable Input<Object> fileName,
        @Nullable Input<Object> fileSystem,
        @Nullable Input<Object> folderPath,
        Input<String> type) {
        this.fileName = fileName;
        this.fileSystem = fileSystem;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureBlobFSLocationArgs() {
        this.fileName = Input.empty();
        this.fileSystem = Input.empty();
        this.folderPath = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> fileName;
        private @Nullable Input<Object> fileSystem;
        private @Nullable Input<Object> folderPath;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.fileSystem = defaults.fileSystem;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder setFileName(@Nullable Input<Object> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = Input.ofNullable(fileName);
            return this;
        }

        public Builder setFileSystem(@Nullable Input<Object> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder setFileSystem(@Nullable Object fileSystem) {
            this.fileSystem = Input.ofNullable(fileSystem);
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
        public AzureBlobFSLocationArgs build() {
            return new AzureBlobFSLocationArgs(fileName, fileSystem, folderPath, type);
        }
    }
}
