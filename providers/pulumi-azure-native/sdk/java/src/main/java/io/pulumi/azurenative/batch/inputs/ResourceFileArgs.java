// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceFileArgs Empty = new ResourceFileArgs();

    /**
     * The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified.
     * 
     */
    @InputImport(name="autoStorageContainerName")
      private final @Nullable Input<String> autoStorageContainerName;

    public Input<String> getAutoStorageContainerName() {
        return this.autoStorageContainerName == null ? Input.empty() : this.autoStorageContainerName;
    }

    /**
     * The property is valid only when autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     * 
     */
    @InputImport(name="blobPrefix")
      private final @Nullable Input<String> blobPrefix;

    public Input<String> getBlobPrefix() {
        return this.blobPrefix == null ? Input.empty() : this.blobPrefix;
    }

    /**
     * This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
     * 
     */
    @InputImport(name="fileMode")
      private final @Nullable Input<String> fileMode;

    public Input<String> getFileMode() {
        return this.fileMode == null ? Input.empty() : this.fileMode;
    }

    /**
     * If the httpUrl property is specified, the filePath is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In the case where filePath is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task's working directory (for example by using '..').
     * 
     */
    @InputImport(name="filePath")
      private final @Nullable Input<String> filePath;

    public Input<String> getFilePath() {
        return this.filePath == null ? Input.empty() : this.filePath;
    }

    /**
     * The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    @InputImport(name="httpUrl")
      private final @Nullable Input<String> httpUrl;

    public Input<String> getHttpUrl() {
        return this.httpUrl == null ? Input.empty() : this.httpUrl;
    }

    /**
     * The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    @InputImport(name="storageContainerUrl")
      private final @Nullable Input<String> storageContainerUrl;

    public Input<String> getStorageContainerUrl() {
        return this.storageContainerUrl == null ? Input.empty() : this.storageContainerUrl;
    }

    public ResourceFileArgs(
        @Nullable Input<String> autoStorageContainerName,
        @Nullable Input<String> blobPrefix,
        @Nullable Input<String> fileMode,
        @Nullable Input<String> filePath,
        @Nullable Input<String> httpUrl,
        @Nullable Input<String> storageContainerUrl) {
        this.autoStorageContainerName = autoStorageContainerName;
        this.blobPrefix = blobPrefix;
        this.fileMode = fileMode;
        this.filePath = filePath;
        this.httpUrl = httpUrl;
        this.storageContainerUrl = storageContainerUrl;
    }

    private ResourceFileArgs() {
        this.autoStorageContainerName = Input.empty();
        this.blobPrefix = Input.empty();
        this.fileMode = Input.empty();
        this.filePath = Input.empty();
        this.httpUrl = Input.empty();
        this.storageContainerUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> autoStorageContainerName;
        private @Nullable Input<String> blobPrefix;
        private @Nullable Input<String> fileMode;
        private @Nullable Input<String> filePath;
        private @Nullable Input<String> httpUrl;
        private @Nullable Input<String> storageContainerUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoStorageContainerName = defaults.autoStorageContainerName;
    	      this.blobPrefix = defaults.blobPrefix;
    	      this.fileMode = defaults.fileMode;
    	      this.filePath = defaults.filePath;
    	      this.httpUrl = defaults.httpUrl;
    	      this.storageContainerUrl = defaults.storageContainerUrl;
        }

        public Builder setAutoStorageContainerName(@Nullable Input<String> autoStorageContainerName) {
            this.autoStorageContainerName = autoStorageContainerName;
            return this;
        }

        public Builder setAutoStorageContainerName(@Nullable String autoStorageContainerName) {
            this.autoStorageContainerName = Input.ofNullable(autoStorageContainerName);
            return this;
        }

        public Builder setBlobPrefix(@Nullable Input<String> blobPrefix) {
            this.blobPrefix = blobPrefix;
            return this;
        }

        public Builder setBlobPrefix(@Nullable String blobPrefix) {
            this.blobPrefix = Input.ofNullable(blobPrefix);
            return this;
        }

        public Builder setFileMode(@Nullable Input<String> fileMode) {
            this.fileMode = fileMode;
            return this;
        }

        public Builder setFileMode(@Nullable String fileMode) {
            this.fileMode = Input.ofNullable(fileMode);
            return this;
        }

        public Builder setFilePath(@Nullable Input<String> filePath) {
            this.filePath = filePath;
            return this;
        }

        public Builder setFilePath(@Nullable String filePath) {
            this.filePath = Input.ofNullable(filePath);
            return this;
        }

        public Builder setHttpUrl(@Nullable Input<String> httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }

        public Builder setHttpUrl(@Nullable String httpUrl) {
            this.httpUrl = Input.ofNullable(httpUrl);
            return this;
        }

        public Builder setStorageContainerUrl(@Nullable Input<String> storageContainerUrl) {
            this.storageContainerUrl = storageContainerUrl;
            return this;
        }

        public Builder setStorageContainerUrl(@Nullable String storageContainerUrl) {
            this.storageContainerUrl = Input.ofNullable(storageContainerUrl);
            return this;
        }
        public ResourceFileArgs build() {
            return new ResourceFileArgs(autoStorageContainerName, blobPrefix, fileMode, filePath, httpUrl, storageContainerUrl);
        }
    }
}
