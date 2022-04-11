// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DiskCreateOption;
import io.pulumi.azurenative.compute.inputs.ImageDiskReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data used when creating a disk.
 * 
 */
public final class CreationDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreationDataArgs Empty = new CreationDataArgs();

    /**
     * This enumerates the possible sources of a disk's creation.
     * 
     */
    @Import(name="createOption", required=true)
      private final Output<Either<String,DiskCreateOption>> createOption;

    public Output<Either<String,DiskCreateOption>> getCreateOption() {
        return this.createOption;
    }

    /**
     * Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
     * 
     */
    @Import(name="galleryImageReference")
      private final @Nullable Output<ImageDiskReferenceArgs> galleryImageReference;

    public Output<ImageDiskReferenceArgs> getGalleryImageReference() {
        return this.galleryImageReference == null ? Codegen.empty() : this.galleryImageReference;
    }

    /**
     * Disk source information.
     * 
     */
    @Import(name="imageReference")
      private final @Nullable Output<ImageDiskReferenceArgs> imageReference;

    public Output<ImageDiskReferenceArgs> getImageReference() {
        return this.imageReference == null ? Codegen.empty() : this.imageReference;
    }

    /**
     * Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
     * 
     */
    @Import(name="logicalSectorSize")
      private final @Nullable Output<Integer> logicalSectorSize;

    public Output<Integer> getLogicalSectorSize() {
        return this.logicalSectorSize == null ? Codegen.empty() : this.logicalSectorSize;
    }

    /**
     * If createOption is Copy, this is the ARM id of the source snapshot or disk.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable Output<String> sourceResourceId;

    public Output<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Codegen.empty() : this.sourceResourceId;
    }

    /**
     * If createOption is Import, this is the URI of a blob to be imported into a managed disk.
     * 
     */
    @Import(name="sourceUri")
      private final @Nullable Output<String> sourceUri;

    public Output<String> getSourceUri() {
        return this.sourceUri == null ? Codegen.empty() : this.sourceUri;
    }

    /**
     * Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
     * 
     */
    @Import(name="storageAccountId")
      private final @Nullable Output<String> storageAccountId;

    public Output<String> getStorageAccountId() {
        return this.storageAccountId == null ? Codegen.empty() : this.storageAccountId;
    }

    /**
     * If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     */
    @Import(name="uploadSizeBytes")
      private final @Nullable Output<Double> uploadSizeBytes;

    public Output<Double> getUploadSizeBytes() {
        return this.uploadSizeBytes == null ? Codegen.empty() : this.uploadSizeBytes;
    }

    public CreationDataArgs(
        Output<Either<String,DiskCreateOption>> createOption,
        @Nullable Output<ImageDiskReferenceArgs> galleryImageReference,
        @Nullable Output<ImageDiskReferenceArgs> imageReference,
        @Nullable Output<Integer> logicalSectorSize,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<String> sourceUri,
        @Nullable Output<String> storageAccountId,
        @Nullable Output<Double> uploadSizeBytes) {
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.galleryImageReference = galleryImageReference;
        this.imageReference = imageReference;
        this.logicalSectorSize = logicalSectorSize;
        this.sourceResourceId = sourceResourceId;
        this.sourceUri = sourceUri;
        this.storageAccountId = storageAccountId;
        this.uploadSizeBytes = uploadSizeBytes;
    }

    private CreationDataArgs() {
        this.createOption = Codegen.empty();
        this.galleryImageReference = Codegen.empty();
        this.imageReference = Codegen.empty();
        this.logicalSectorSize = Codegen.empty();
        this.sourceResourceId = Codegen.empty();
        this.sourceUri = Codegen.empty();
        this.storageAccountId = Codegen.empty();
        this.uploadSizeBytes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,DiskCreateOption>> createOption;
        private @Nullable Output<ImageDiskReferenceArgs> galleryImageReference;
        private @Nullable Output<ImageDiskReferenceArgs> imageReference;
        private @Nullable Output<Integer> logicalSectorSize;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<String> sourceUri;
        private @Nullable Output<String> storageAccountId;
        private @Nullable Output<Double> uploadSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createOption = defaults.createOption;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.imageReference = defaults.imageReference;
    	      this.logicalSectorSize = defaults.logicalSectorSize;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.sourceUri = defaults.sourceUri;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.uploadSizeBytes = defaults.uploadSizeBytes;
        }

        public Builder createOption(Output<Either<String,DiskCreateOption>> createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }
        public Builder createOption(Either<String,DiskCreateOption> createOption) {
            this.createOption = Output.of(Objects.requireNonNull(createOption));
            return this;
        }
        public Builder galleryImageReference(@Nullable Output<ImageDiskReferenceArgs> galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }
        public Builder galleryImageReference(@Nullable ImageDiskReferenceArgs galleryImageReference) {
            this.galleryImageReference = Codegen.ofNullable(galleryImageReference);
            return this;
        }
        public Builder imageReference(@Nullable Output<ImageDiskReferenceArgs> imageReference) {
            this.imageReference = imageReference;
            return this;
        }
        public Builder imageReference(@Nullable ImageDiskReferenceArgs imageReference) {
            this.imageReference = Codegen.ofNullable(imageReference);
            return this;
        }
        public Builder logicalSectorSize(@Nullable Output<Integer> logicalSectorSize) {
            this.logicalSectorSize = logicalSectorSize;
            return this;
        }
        public Builder logicalSectorSize(@Nullable Integer logicalSectorSize) {
            this.logicalSectorSize = Codegen.ofNullable(logicalSectorSize);
            return this;
        }
        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Codegen.ofNullable(sourceResourceId);
            return this;
        }
        public Builder sourceUri(@Nullable Output<String> sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public Builder sourceUri(@Nullable String sourceUri) {
            this.sourceUri = Codegen.ofNullable(sourceUri);
            return this;
        }
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }
        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Codegen.ofNullable(storageAccountId);
            return this;
        }
        public Builder uploadSizeBytes(@Nullable Output<Double> uploadSizeBytes) {
            this.uploadSizeBytes = uploadSizeBytes;
            return this;
        }
        public Builder uploadSizeBytes(@Nullable Double uploadSizeBytes) {
            this.uploadSizeBytes = Codegen.ofNullable(uploadSizeBytes);
            return this;
        }        public CreationDataArgs build() {
            return new CreationDataArgs(createOption, galleryImageReference, imageReference, logicalSectorSize, sourceResourceId, sourceUri, storageAccountId, uploadSizeBytes);
        }
    }
}
