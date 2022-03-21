// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamOrcSerDe {
    private final @Nullable Integer blockSizeBytes;
    private final @Nullable List<String> bloomFilterColumns;
    private final @Nullable Double bloomFilterFalsePositiveProbability;
    private final @Nullable String compression;
    private final @Nullable Double dictionaryKeyThreshold;
    private final @Nullable Boolean enablePadding;
    private final @Nullable String formatVersion;
    private final @Nullable Double paddingTolerance;
    private final @Nullable Integer rowIndexStride;
    private final @Nullable Integer stripeSizeBytes;

    @CustomType.Constructor
    private DeliveryStreamOrcSerDe(
        @CustomType.Parameter("blockSizeBytes") @Nullable Integer blockSizeBytes,
        @CustomType.Parameter("bloomFilterColumns") @Nullable List<String> bloomFilterColumns,
        @CustomType.Parameter("bloomFilterFalsePositiveProbability") @Nullable Double bloomFilterFalsePositiveProbability,
        @CustomType.Parameter("compression") @Nullable String compression,
        @CustomType.Parameter("dictionaryKeyThreshold") @Nullable Double dictionaryKeyThreshold,
        @CustomType.Parameter("enablePadding") @Nullable Boolean enablePadding,
        @CustomType.Parameter("formatVersion") @Nullable String formatVersion,
        @CustomType.Parameter("paddingTolerance") @Nullable Double paddingTolerance,
        @CustomType.Parameter("rowIndexStride") @Nullable Integer rowIndexStride,
        @CustomType.Parameter("stripeSizeBytes") @Nullable Integer stripeSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
        this.bloomFilterColumns = bloomFilterColumns;
        this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
        this.compression = compression;
        this.dictionaryKeyThreshold = dictionaryKeyThreshold;
        this.enablePadding = enablePadding;
        this.formatVersion = formatVersion;
        this.paddingTolerance = paddingTolerance;
        this.rowIndexStride = rowIndexStride;
        this.stripeSizeBytes = stripeSizeBytes;
    }

    public Optional<Integer> getBlockSizeBytes() {
        return Optional.ofNullable(this.blockSizeBytes);
    }
    public List<String> getBloomFilterColumns() {
        return this.bloomFilterColumns == null ? List.of() : this.bloomFilterColumns;
    }
    public Optional<Double> getBloomFilterFalsePositiveProbability() {
        return Optional.ofNullable(this.bloomFilterFalsePositiveProbability);
    }
    public Optional<String> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    public Optional<Double> getDictionaryKeyThreshold() {
        return Optional.ofNullable(this.dictionaryKeyThreshold);
    }
    public Optional<Boolean> getEnablePadding() {
        return Optional.ofNullable(this.enablePadding);
    }
    public Optional<String> getFormatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }
    public Optional<Double> getPaddingTolerance() {
        return Optional.ofNullable(this.paddingTolerance);
    }
    public Optional<Integer> getRowIndexStride() {
        return Optional.ofNullable(this.rowIndexStride);
    }
    public Optional<Integer> getStripeSizeBytes() {
        return Optional.ofNullable(this.stripeSizeBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOrcSerDe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer blockSizeBytes;
        private @Nullable List<String> bloomFilterColumns;
        private @Nullable Double bloomFilterFalsePositiveProbability;
        private @Nullable String compression;
        private @Nullable Double dictionaryKeyThreshold;
        private @Nullable Boolean enablePadding;
        private @Nullable String formatVersion;
        private @Nullable Double paddingTolerance;
        private @Nullable Integer rowIndexStride;
        private @Nullable Integer stripeSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOrcSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeBytes = defaults.blockSizeBytes;
    	      this.bloomFilterColumns = defaults.bloomFilterColumns;
    	      this.bloomFilterFalsePositiveProbability = defaults.bloomFilterFalsePositiveProbability;
    	      this.compression = defaults.compression;
    	      this.dictionaryKeyThreshold = defaults.dictionaryKeyThreshold;
    	      this.enablePadding = defaults.enablePadding;
    	      this.formatVersion = defaults.formatVersion;
    	      this.paddingTolerance = defaults.paddingTolerance;
    	      this.rowIndexStride = defaults.rowIndexStride;
    	      this.stripeSizeBytes = defaults.stripeSizeBytes;
        }

        public Builder blockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }
        public Builder bloomFilterColumns(@Nullable List<String> bloomFilterColumns) {
            this.bloomFilterColumns = bloomFilterColumns;
            return this;
        }
        public Builder bloomFilterColumns(String... bloomFilterColumns) {
            return bloomFilterColumns(List.of(bloomFilterColumns));
        }
        public Builder bloomFilterFalsePositiveProbability(@Nullable Double bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
            return this;
        }
        public Builder compression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }
        public Builder dictionaryKeyThreshold(@Nullable Double dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = dictionaryKeyThreshold;
            return this;
        }
        public Builder enablePadding(@Nullable Boolean enablePadding) {
            this.enablePadding = enablePadding;
            return this;
        }
        public Builder formatVersion(@Nullable String formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }
        public Builder paddingTolerance(@Nullable Double paddingTolerance) {
            this.paddingTolerance = paddingTolerance;
            return this;
        }
        public Builder rowIndexStride(@Nullable Integer rowIndexStride) {
            this.rowIndexStride = rowIndexStride;
            return this;
        }
        public Builder stripeSizeBytes(@Nullable Integer stripeSizeBytes) {
            this.stripeSizeBytes = stripeSizeBytes;
            return this;
        }        public DeliveryStreamOrcSerDe build() {
            return new DeliveryStreamOrcSerDe(blockSizeBytes, bloomFilterColumns, bloomFilterFalsePositiveProbability, compression, dictionaryKeyThreshold, enablePadding, formatVersion, paddingTolerance, rowIndexStride, stripeSizeBytes);
        }
    }
}
