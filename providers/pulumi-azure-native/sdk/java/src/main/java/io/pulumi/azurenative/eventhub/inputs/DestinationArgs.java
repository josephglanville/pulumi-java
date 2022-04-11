// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Capture storage details for capture description
 * 
 */
public final class DestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DestinationArgs Empty = new DestinationArgs();

    /**
     * Blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
     * 
     */
    @Import(name="archiveNameFormat")
      private final @Nullable Output<String> archiveNameFormat;

    public Output<String> getArchiveNameFormat() {
        return this.archiveNameFormat == null ? Codegen.empty() : this.archiveNameFormat;
    }

    /**
     * Blob container Name
     * 
     */
    @Import(name="blobContainer")
      private final @Nullable Output<String> blobContainer;

    public Output<String> getBlobContainer() {
        return this.blobContainer == null ? Codegen.empty() : this.blobContainer;
    }

    /**
     * Name for capture destination
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Resource id of the storage account to be used to create the blobs
     * 
     */
    @Import(name="storageAccountResourceId")
      private final @Nullable Output<String> storageAccountResourceId;

    public Output<String> getStorageAccountResourceId() {
        return this.storageAccountResourceId == null ? Codegen.empty() : this.storageAccountResourceId;
    }

    public DestinationArgs(
        @Nullable Output<String> archiveNameFormat,
        @Nullable Output<String> blobContainer,
        @Nullable Output<String> name,
        @Nullable Output<String> storageAccountResourceId) {
        this.archiveNameFormat = archiveNameFormat;
        this.blobContainer = blobContainer;
        this.name = name;
        this.storageAccountResourceId = storageAccountResourceId;
    }

    private DestinationArgs() {
        this.archiveNameFormat = Codegen.empty();
        this.blobContainer = Codegen.empty();
        this.name = Codegen.empty();
        this.storageAccountResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> archiveNameFormat;
        private @Nullable Output<String> blobContainer;
        private @Nullable Output<String> name;
        private @Nullable Output<String> storageAccountResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveNameFormat = defaults.archiveNameFormat;
    	      this.blobContainer = defaults.blobContainer;
    	      this.name = defaults.name;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
        }

        public Builder archiveNameFormat(@Nullable Output<String> archiveNameFormat) {
            this.archiveNameFormat = archiveNameFormat;
            return this;
        }
        public Builder archiveNameFormat(@Nullable String archiveNameFormat) {
            this.archiveNameFormat = Codegen.ofNullable(archiveNameFormat);
            return this;
        }
        public Builder blobContainer(@Nullable Output<String> blobContainer) {
            this.blobContainer = blobContainer;
            return this;
        }
        public Builder blobContainer(@Nullable String blobContainer) {
            this.blobContainer = Codegen.ofNullable(blobContainer);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder storageAccountResourceId(@Nullable Output<String> storageAccountResourceId) {
            this.storageAccountResourceId = storageAccountResourceId;
            return this;
        }
        public Builder storageAccountResourceId(@Nullable String storageAccountResourceId) {
            this.storageAccountResourceId = Codegen.ofNullable(storageAccountResourceId);
            return this;
        }        public DestinationArgs build() {
            return new DestinationArgs(archiveNameFormat, blobContainer, name, storageAccountResourceId);
        }
    }
}
