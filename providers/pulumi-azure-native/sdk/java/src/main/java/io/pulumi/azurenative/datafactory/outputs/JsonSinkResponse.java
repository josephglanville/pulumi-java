// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSWriteSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobStorageWriteSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreWriteSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFileStorageWriteSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.FileServerWriteSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.JsonWriteSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.SftpWriteSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JsonSinkResponse {
    private final @Nullable Object disableMetricsCollection;
    private final @Nullable JsonWriteSettingsResponse formatSettings;
    private final @Nullable Object maxConcurrentConnections;
    private final @Nullable Object sinkRetryCount;
    private final @Nullable Object sinkRetryWait;
    private final @Nullable Object storeSettings;
    private final String type;
    private final @Nullable Object writeBatchSize;
    private final @Nullable Object writeBatchTimeout;

    @OutputCustomType.Constructor({"disableMetricsCollection","formatSettings","maxConcurrentConnections","sinkRetryCount","sinkRetryWait","storeSettings","type","writeBatchSize","writeBatchTimeout"})
    private JsonSinkResponse(
        @Nullable Object disableMetricsCollection,
        @Nullable JsonWriteSettingsResponse formatSettings,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        @Nullable Object storeSettings,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.formatSettings = formatSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type);
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    public Optional<JsonWriteSettingsResponse> getFormatSettings() {
        return Optional.ofNullable(this.formatSettings);
    }
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    public Optional<Object> getSinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    public Optional<Object> getSinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    public Optional<Object> getStoreSettings() {
        return Optional.ofNullable(this.storeSettings);
    }
    public String getType() {
        return this.type;
    }
    public Optional<Object> getWriteBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    public Optional<Object> getWriteBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable JsonWriteSettingsResponse formatSettings;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private @Nullable Object storeSettings;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.formatSettings = defaults.formatSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setFormatSettings(@Nullable JsonWriteSettingsResponse formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
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

        public Builder setStoreSettings(@Nullable Object storeSettings) {
            this.storeSettings = storeSettings;
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

        public JsonSinkResponse build() {
            return new JsonSinkResponse(disableMetricsCollection, formatSettings, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, storeSettings, type, writeBatchSize, writeBatchTimeout);
        }
    }
}