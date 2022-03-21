// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeImportCommandArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Databricks Delta Lake sink.
 * 
 */
public final class AzureDatabricksDeltaLakeSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDatabricksDeltaLakeSinkArgs Empty = new AzureDatabricksDeltaLakeSinkArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Output.empty() : this.disableMetricsCollection;
    }

    /**
     * Azure Databricks Delta Lake import settings.
     * 
     */
    @Import(name="importSettings")
      private final @Nullable Output<AzureDatabricksDeltaLakeImportCommandArgs> importSettings;

    public Output<AzureDatabricksDeltaLakeImportCommandArgs> getImportSettings() {
        return this.importSettings == null ? Output.empty() : this.importSettings;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Output.empty() : this.maxConcurrentConnections;
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
      private final @Nullable Output<Object> preCopyScript;

    public Output<Object> getPreCopyScript() {
        return this.preCopyScript == null ? Output.empty() : this.preCopyScript;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Output<Object> sinkRetryCount;

    public Output<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Output.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Output<Object> sinkRetryWait;

    public Output<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Output.empty() : this.sinkRetryWait;
    }

    /**
     * Copy sink type.
     * Expected value is 'AzureDatabricksDeltaLakeSink'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Output<Object> writeBatchSize;

    public Output<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Output.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Output<Object> writeBatchTimeout;

    public Output<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Output.empty() : this.writeBatchTimeout;
    }

    public AzureDatabricksDeltaLakeSinkArgs(
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<AzureDatabricksDeltaLakeImportCommandArgs> importSettings,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> preCopyScript,
        @Nullable Output<Object> sinkRetryCount,
        @Nullable Output<Object> sinkRetryWait,
        Output<String> type,
        @Nullable Output<Object> writeBatchSize,
        @Nullable Output<Object> writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.importSettings = importSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.preCopyScript = preCopyScript;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private AzureDatabricksDeltaLakeSinkArgs() {
        this.disableMetricsCollection = Output.empty();
        this.importSettings = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.preCopyScript = Output.empty();
        this.sinkRetryCount = Output.empty();
        this.sinkRetryWait = Output.empty();
        this.type = Output.empty();
        this.writeBatchSize = Output.empty();
        this.writeBatchTimeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksDeltaLakeSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<AzureDatabricksDeltaLakeImportCommandArgs> importSettings;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> preCopyScript;
        private @Nullable Output<Object> sinkRetryCount;
        private @Nullable Output<Object> sinkRetryWait;
        private Output<String> type;
        private @Nullable Output<Object> writeBatchSize;
        private @Nullable Output<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksDeltaLakeSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.importSettings = defaults.importSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.preCopyScript = defaults.preCopyScript;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Output.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder importSettings(@Nullable Output<AzureDatabricksDeltaLakeImportCommandArgs> importSettings) {
            this.importSettings = importSettings;
            return this;
        }
        public Builder importSettings(@Nullable AzureDatabricksDeltaLakeImportCommandArgs importSettings) {
            this.importSettings = Output.ofNullable(importSettings);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Output.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder preCopyScript(@Nullable Output<Object> preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }
        public Builder preCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = Output.ofNullable(preCopyScript);
            return this;
        }
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Output.ofNullable(sinkRetryCount);
            return this;
        }
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Output.ofNullable(sinkRetryWait);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Output.ofNullable(writeBatchSize);
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Output.ofNullable(writeBatchTimeout);
            return this;
        }        public AzureDatabricksDeltaLakeSinkArgs build() {
            return new AzureDatabricksDeltaLakeSinkArgs(disableMetricsCollection, importSettings, maxConcurrentConnections, preCopyScript, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
