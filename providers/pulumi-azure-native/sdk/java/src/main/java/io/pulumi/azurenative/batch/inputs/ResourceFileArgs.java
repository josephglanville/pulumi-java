// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Output;
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
      private final @Nullable Output<String> autoStorageContainerName;

    public Output<String> getAutoStorageContainerName() {
        return this.autoStorageContainerName == null ? Output.empty() : this.autoStorageContainerName;
    }

    /**
     * The property is valid only when autoStorageContainerName or storageContainerUrl is used. This prefix can be a partial filename or a subdirectory. If a prefix is not specified, all the files in the container will be downloaded.
     * 
     */
    @InputImport(name="blobPrefix")
      private final @Nullable Output<String> blobPrefix;

    public Output<String> getBlobPrefix() {
        return this.blobPrefix == null ? Output.empty() : this.blobPrefix;
    }

    /**
     * This property applies only to files being downloaded to Linux compute nodes. It will be ignored if it is specified for a resourceFile which will be downloaded to a Windows node. If this property is not specified for a Linux node, then a default value of 0770 is applied to the file.
     * 
     */
    @InputImport(name="fileMode")
      private final @Nullable Output<String> fileMode;

    public Output<String> getFileMode() {
        return this.fileMode == null ? Output.empty() : this.fileMode;
    }

    /**
     * If the httpUrl property is specified, the filePath is required and describes the path which the file will be downloaded to, including the filename. Otherwise, if the autoStorageContainerName or storageContainerUrl property is specified, filePath is optional and is the directory to download the files to. In the case where filePath is used as a directory, any directory structure already associated with the input data will be retained in full and appended to the specified filePath directory. The specified relative path cannot break out of the task's working directory (for example by using '..').
     * 
     */
    @InputImport(name="filePath")
      private final @Nullable Output<String> filePath;

    public Output<String> getFilePath() {
        return this.filePath == null ? Output.empty() : this.filePath;
    }

    /**
     * The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. If the URL is Azure Blob Storage, it must be readable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    @InputImport(name="httpUrl")
      private final @Nullable Output<String> httpUrl;

    public Output<String> getHttpUrl() {
        return this.httpUrl == null ? Output.empty() : this.httpUrl;
    }

    /**
     * The autoStorageContainerName, storageContainerUrl and httpUrl properties are mutually exclusive and one of them must be specified. This URL must be readable and listable using anonymous access; that is, the Batch service does not present any credentials when downloading the blob. There are two ways to get such a URL for a blob in Azure storage: include a Shared Access Signature (SAS) granting read and list permissions on the blob, or set the ACL for the blob or its container to allow public access.
     * 
     */
    @InputImport(name="storageContainerUrl")
      private final @Nullable Output<String> storageContainerUrl;

    public Output<String> getStorageContainerUrl() {
        return this.storageContainerUrl == null ? Output.empty() : this.storageContainerUrl;
    }

    public ResourceFileArgs(
        @Nullable Output<String> autoStorageContainerName,
        @Nullable Output<String> blobPrefix,
        @Nullable Output<String> fileMode,
        @Nullable Output<String> filePath,
        @Nullable Output<String> httpUrl,
        @Nullable Output<String> storageContainerUrl) {
        this.autoStorageContainerName = autoStorageContainerName;
        this.blobPrefix = blobPrefix;
        this.fileMode = fileMode;
        this.filePath = filePath;
        this.httpUrl = httpUrl;
        this.storageContainerUrl = storageContainerUrl;
    }

    private ResourceFileArgs() {
        this.autoStorageContainerName = Output.empty();
        this.blobPrefix = Output.empty();
        this.fileMode = Output.empty();
        this.filePath = Output.empty();
        this.httpUrl = Output.empty();
        this.storageContainerUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoStorageContainerName;
        private @Nullable Output<String> blobPrefix;
        private @Nullable Output<String> fileMode;
        private @Nullable Output<String> filePath;
        private @Nullable Output<String> httpUrl;
        private @Nullable Output<String> storageContainerUrl;

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

        public Builder autoStorageContainerName(@Nullable Output<String> autoStorageContainerName) {
            this.autoStorageContainerName = autoStorageContainerName;
            return this;
        }

        public Builder autoStorageContainerName(@Nullable String autoStorageContainerName) {
            this.autoStorageContainerName = Output.ofNullable(autoStorageContainerName);
            return this;
        }

        public Builder blobPrefix(@Nullable Output<String> blobPrefix) {
            this.blobPrefix = blobPrefix;
            return this;
        }

        public Builder blobPrefix(@Nullable String blobPrefix) {
            this.blobPrefix = Output.ofNullable(blobPrefix);
            return this;
        }

        public Builder fileMode(@Nullable Output<String> fileMode) {
            this.fileMode = fileMode;
            return this;
        }

        public Builder fileMode(@Nullable String fileMode) {
            this.fileMode = Output.ofNullable(fileMode);
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

        public Builder httpUrl(@Nullable Output<String> httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }

        public Builder httpUrl(@Nullable String httpUrl) {
            this.httpUrl = Output.ofNullable(httpUrl);
            return this;
        }

        public Builder storageContainerUrl(@Nullable Output<String> storageContainerUrl) {
            this.storageContainerUrl = storageContainerUrl;
            return this;
        }

        public Builder storageContainerUrl(@Nullable String storageContainerUrl) {
            this.storageContainerUrl = Output.ofNullable(storageContainerUrl);
            return this;
        }
        public ResourceFileArgs build() {
            return new ResourceFileArgs(autoStorageContainerName, blobPrefix, fileMode, filePath, httpUrl, storageContainerUrl);
        }
    }
}
