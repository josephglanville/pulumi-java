// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.MetadataItemResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Blob sink.
 * 
 */
public final class BlobSinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlobSinkResponse Empty = new BlobSinkResponse();

    /**
     * Blob writer add header. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="blobWriterAddHeader")
      private final @Nullable Object blobWriterAddHeader;

    public Optional<Object> getBlobWriterAddHeader() {
        return this.blobWriterAddHeader == null ? Optional.empty() : Optional.ofNullable(this.blobWriterAddHeader);
    }

    /**
     * Blob writer date time format. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="blobWriterDateTimeFormat")
      private final @Nullable Object blobWriterDateTimeFormat;

    public Optional<Object> getBlobWriterDateTimeFormat() {
        return this.blobWriterDateTimeFormat == null ? Optional.empty() : Optional.ofNullable(this.blobWriterDateTimeFormat);
    }

    /**
     * Blob writer overwrite files. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="blobWriterOverwriteFiles")
      private final @Nullable Object blobWriterOverwriteFiles;

    public Optional<Object> getBlobWriterOverwriteFiles() {
        return this.blobWriterOverwriteFiles == null ? Optional.empty() : Optional.ofNullable(this.blobWriterOverwriteFiles);
    }

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @InputImport(name="copyBehavior")
      private final @Nullable Object copyBehavior;

    public Optional<Object> getCopyBehavior() {
        return this.copyBehavior == null ? Optional.empty() : Optional.ofNullable(this.copyBehavior);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Specify the custom metadata to be added to sink data. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable List<MetadataItemResponse> metadata;

    public List<MetadataItemResponse> getMetadata() {
        return this.metadata == null ? List.of() : this.metadata;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sinkRetryCount")
      private final @Nullable Object sinkRetryCount;

    public Optional<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sinkRetryWait")
      private final @Nullable Object sinkRetryWait;

    public Optional<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Copy sink type.
     * Expected value is 'BlobSink'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="writeBatchSize")
      private final @Nullable Object writeBatchSize;

    public Optional<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Optional.empty() : Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="writeBatchTimeout")
      private final @Nullable Object writeBatchTimeout;

    public Optional<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Optional.empty() : Optional.ofNullable(this.writeBatchTimeout);
    }

    public BlobSinkResponse(
        @Nullable Object blobWriterAddHeader,
        @Nullable Object blobWriterDateTimeFormat,
        @Nullable Object blobWriterOverwriteFiles,
        @Nullable Object copyBehavior,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable List<MetadataItemResponse> metadata,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout) {
        this.blobWriterAddHeader = blobWriterAddHeader;
        this.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
        this.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.metadata = metadata;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private BlobSinkResponse() {
        this.blobWriterAddHeader = null;
        this.blobWriterDateTimeFormat = null;
        this.blobWriterOverwriteFiles = null;
        this.copyBehavior = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.metadata = List.of();
        this.sinkRetryCount = null;
        this.sinkRetryWait = null;
        this.type = null;
        this.writeBatchSize = null;
        this.writeBatchTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object blobWriterAddHeader;
        private @Nullable Object blobWriterDateTimeFormat;
        private @Nullable Object blobWriterOverwriteFiles;
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable List<MetadataItemResponse> metadata;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobWriterAddHeader = defaults.blobWriterAddHeader;
    	      this.blobWriterDateTimeFormat = defaults.blobWriterDateTimeFormat;
    	      this.blobWriterOverwriteFiles = defaults.blobWriterOverwriteFiles;
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.metadata = defaults.metadata;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder setBlobWriterAddHeader(@Nullable Object blobWriterAddHeader) {
            this.blobWriterAddHeader = blobWriterAddHeader;
            return this;
        }

        public Builder setBlobWriterDateTimeFormat(@Nullable Object blobWriterDateTimeFormat) {
            this.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
            return this;
        }

        public Builder setBlobWriterOverwriteFiles(@Nullable Object blobWriterOverwriteFiles) {
            this.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
            return this;
        }

        public Builder setCopyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMetadata(@Nullable List<MetadataItemResponse> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public BlobSinkResponse build() {
            return new BlobSinkResponse(blobWriterAddHeader, blobWriterDateTimeFormat, blobWriterOverwriteFiles, copyBehavior, disableMetricsCollection, maxConcurrentConnections, metadata, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
