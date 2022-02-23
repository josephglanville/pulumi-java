// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamParquetSerDeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamParquetSerDeArgs Empty = new DeliveryStreamParquetSerDeArgs();

    @InputImport(name="blockSizeBytes")
      private final @Nullable Input<Integer> blockSizeBytes;

    public Input<Integer> getBlockSizeBytes() {
        return this.blockSizeBytes == null ? Input.empty() : this.blockSizeBytes;
    }

    @InputImport(name="compression")
      private final @Nullable Input<String> compression;

    public Input<String> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    @InputImport(name="enableDictionaryCompression")
      private final @Nullable Input<Boolean> enableDictionaryCompression;

    public Input<Boolean> getEnableDictionaryCompression() {
        return this.enableDictionaryCompression == null ? Input.empty() : this.enableDictionaryCompression;
    }

    @InputImport(name="maxPaddingBytes")
      private final @Nullable Input<Integer> maxPaddingBytes;

    public Input<Integer> getMaxPaddingBytes() {
        return this.maxPaddingBytes == null ? Input.empty() : this.maxPaddingBytes;
    }

    @InputImport(name="pageSizeBytes")
      private final @Nullable Input<Integer> pageSizeBytes;

    public Input<Integer> getPageSizeBytes() {
        return this.pageSizeBytes == null ? Input.empty() : this.pageSizeBytes;
    }

    @InputImport(name="writerVersion")
      private final @Nullable Input<String> writerVersion;

    public Input<String> getWriterVersion() {
        return this.writerVersion == null ? Input.empty() : this.writerVersion;
    }

    public DeliveryStreamParquetSerDeArgs(
        @Nullable Input<Integer> blockSizeBytes,
        @Nullable Input<String> compression,
        @Nullable Input<Boolean> enableDictionaryCompression,
        @Nullable Input<Integer> maxPaddingBytes,
        @Nullable Input<Integer> pageSizeBytes,
        @Nullable Input<String> writerVersion) {
        this.blockSizeBytes = blockSizeBytes;
        this.compression = compression;
        this.enableDictionaryCompression = enableDictionaryCompression;
        this.maxPaddingBytes = maxPaddingBytes;
        this.pageSizeBytes = pageSizeBytes;
        this.writerVersion = writerVersion;
    }

    private DeliveryStreamParquetSerDeArgs() {
        this.blockSizeBytes = Input.empty();
        this.compression = Input.empty();
        this.enableDictionaryCompression = Input.empty();
        this.maxPaddingBytes = Input.empty();
        this.pageSizeBytes = Input.empty();
        this.writerVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamParquetSerDeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> blockSizeBytes;
        private @Nullable Input<String> compression;
        private @Nullable Input<Boolean> enableDictionaryCompression;
        private @Nullable Input<Integer> maxPaddingBytes;
        private @Nullable Input<Integer> pageSizeBytes;
        private @Nullable Input<String> writerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamParquetSerDeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeBytes = defaults.blockSizeBytes;
    	      this.compression = defaults.compression;
    	      this.enableDictionaryCompression = defaults.enableDictionaryCompression;
    	      this.maxPaddingBytes = defaults.maxPaddingBytes;
    	      this.pageSizeBytes = defaults.pageSizeBytes;
    	      this.writerVersion = defaults.writerVersion;
        }

        public Builder setBlockSizeBytes(@Nullable Input<Integer> blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        public Builder setBlockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = Input.ofNullable(blockSizeBytes);
            return this;
        }

        public Builder setCompression(@Nullable Input<String> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setEnableDictionaryCompression(@Nullable Input<Boolean> enableDictionaryCompression) {
            this.enableDictionaryCompression = enableDictionaryCompression;
            return this;
        }

        public Builder setEnableDictionaryCompression(@Nullable Boolean enableDictionaryCompression) {
            this.enableDictionaryCompression = Input.ofNullable(enableDictionaryCompression);
            return this;
        }

        public Builder setMaxPaddingBytes(@Nullable Input<Integer> maxPaddingBytes) {
            this.maxPaddingBytes = maxPaddingBytes;
            return this;
        }

        public Builder setMaxPaddingBytes(@Nullable Integer maxPaddingBytes) {
            this.maxPaddingBytes = Input.ofNullable(maxPaddingBytes);
            return this;
        }

        public Builder setPageSizeBytes(@Nullable Input<Integer> pageSizeBytes) {
            this.pageSizeBytes = pageSizeBytes;
            return this;
        }

        public Builder setPageSizeBytes(@Nullable Integer pageSizeBytes) {
            this.pageSizeBytes = Input.ofNullable(pageSizeBytes);
            return this;
        }

        public Builder setWriterVersion(@Nullable Input<String> writerVersion) {
            this.writerVersion = writerVersion;
            return this;
        }

        public Builder setWriterVersion(@Nullable String writerVersion) {
            this.writerVersion = Input.ofNullable(writerVersion);
            return this;
        }
        public DeliveryStreamParquetSerDeArgs build() {
            return new DeliveryStreamParquetSerDeArgs(blockSizeBytes, compression, enableDictionaryCompression, maxPaddingBytes, pageSizeBytes, writerVersion);
        }
    }
}
