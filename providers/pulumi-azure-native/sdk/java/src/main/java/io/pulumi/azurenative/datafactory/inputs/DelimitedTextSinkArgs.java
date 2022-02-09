// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSWriteSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageWriteSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreWriteSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageWriteSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.DelimitedTextWriteSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.FileServerWriteSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.SftpWriteSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DelimitedTextSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelimitedTextSinkArgs Empty = new DelimitedTextSinkArgs();

    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    @InputImport(name="formatSettings")
    private final @Nullable Input<DelimitedTextWriteSettingsArgs> formatSettings;

    public Input<DelimitedTextWriteSettingsArgs> getFormatSettings() {
        return this.formatSettings == null ? Input.empty() : this.formatSettings;
    }

    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    @InputImport(name="sinkRetryCount")
    private final @Nullable Input<Object> sinkRetryCount;

    public Input<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Input.empty() : this.sinkRetryCount;
    }

    @InputImport(name="sinkRetryWait")
    private final @Nullable Input<Object> sinkRetryWait;

    public Input<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Input.empty() : this.sinkRetryWait;
    }

    @InputImport(name="storeSettings")
    private final @Nullable Input<Object> storeSettings;

    public Input<Object> getStoreSettings() {
        return this.storeSettings == null ? Input.empty() : this.storeSettings;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="writeBatchSize")
    private final @Nullable Input<Object> writeBatchSize;

    public Input<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Input.empty() : this.writeBatchSize;
    }

    @InputImport(name="writeBatchTimeout")
    private final @Nullable Input<Object> writeBatchTimeout;

    public Input<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Input.empty() : this.writeBatchTimeout;
    }

    public DelimitedTextSinkArgs(
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<DelimitedTextWriteSettingsArgs> formatSettings,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> sinkRetryCount,
        @Nullable Input<Object> sinkRetryWait,
        @Nullable Input<Object> storeSettings,
        Input<String> type,
        @Nullable Input<Object> writeBatchSize,
        @Nullable Input<Object> writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.formatSettings = formatSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private DelimitedTextSinkArgs() {
        this.disableMetricsCollection = Input.empty();
        this.formatSettings = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.sinkRetryCount = Input.empty();
        this.sinkRetryWait = Input.empty();
        this.storeSettings = Input.empty();
        this.type = Input.empty();
        this.writeBatchSize = Input.empty();
        this.writeBatchTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<DelimitedTextWriteSettingsArgs> formatSettings;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> sinkRetryCount;
        private @Nullable Input<Object> sinkRetryWait;
        private @Nullable Input<Object> storeSettings;
        private Input<String> type;
        private @Nullable Input<Object> writeBatchSize;
        private @Nullable Input<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextSinkArgs defaults) {
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

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setFormatSettings(@Nullable Input<DelimitedTextWriteSettingsArgs> formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }

        public Builder setFormatSettings(@Nullable DelimitedTextWriteSettingsArgs formatSettings) {
            this.formatSettings = Input.ofNullable(formatSettings);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Input<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Input.ofNullable(sinkRetryCount);
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Input<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Input.ofNullable(sinkRetryWait);
            return this;
        }

        public Builder setStoreSettings(@Nullable Input<Object> storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }

        public Builder setStoreSettings(@Nullable Object storeSettings) {
            this.storeSettings = Input.ofNullable(storeSettings);
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

        public Builder setWriteBatchSize(@Nullable Input<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Input.ofNullable(writeBatchSize);
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Input<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Input.ofNullable(writeBatchTimeout);
            return this;
        }

        public DelimitedTextSinkArgs build() {
            return new DelimitedTextSinkArgs(disableMetricsCollection, formatSettings, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, storeSettings, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
