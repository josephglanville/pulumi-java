// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure BlobFS source.
 * 
 */
public final class AzureBlobFSSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobFSSourceArgs Empty = new AzureBlobFSSourceArgs();

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
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Output.empty() : this.maxConcurrentConnections;
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
      private final @Nullable Output<Object> recursive;

    public Output<Object> getRecursive() {
        return this.recursive == null ? Output.empty() : this.recursive;
    }

    /**
     * Number of header lines to skip from each blob. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="skipHeaderLineCount")
      private final @Nullable Output<Object> skipHeaderLineCount;

    public Output<Object> getSkipHeaderLineCount() {
        return this.skipHeaderLineCount == null ? Output.empty() : this.skipHeaderLineCount;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Output<Object> sourceRetryCount;

    public Output<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Output.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Output<Object> sourceRetryWait;

    public Output<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Output.empty() : this.sourceRetryWait;
    }

    /**
     * Treat empty as null. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="treatEmptyAsNull")
      private final @Nullable Output<Object> treatEmptyAsNull;

    public Output<Object> getTreatEmptyAsNull() {
        return this.treatEmptyAsNull == null ? Output.empty() : this.treatEmptyAsNull;
    }

    /**
     * Copy source type.
     * Expected value is 'AzureBlobFSSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AzureBlobFSSourceArgs(
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> recursive,
        @Nullable Output<Object> skipHeaderLineCount,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        @Nullable Output<Object> treatEmptyAsNull,
        Output<String> type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.recursive = recursive;
        this.skipHeaderLineCount = skipHeaderLineCount;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.treatEmptyAsNull = treatEmptyAsNull;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureBlobFSSourceArgs() {
        this.disableMetricsCollection = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.recursive = Output.empty();
        this.skipHeaderLineCount = Output.empty();
        this.sourceRetryCount = Output.empty();
        this.sourceRetryWait = Output.empty();
        this.treatEmptyAsNull = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> recursive;
        private @Nullable Output<Object> skipHeaderLineCount;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private @Nullable Output<Object> treatEmptyAsNull;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.recursive = defaults.recursive;
    	      this.skipHeaderLineCount = defaults.skipHeaderLineCount;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.treatEmptyAsNull = defaults.treatEmptyAsNull;
    	      this.type = defaults.type;
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Output.ofNullable(disableMetricsCollection);
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
        public Builder recursive(@Nullable Output<Object> recursive) {
            this.recursive = recursive;
            return this;
        }
        public Builder recursive(@Nullable Object recursive) {
            this.recursive = Output.ofNullable(recursive);
            return this;
        }
        public Builder skipHeaderLineCount(@Nullable Output<Object> skipHeaderLineCount) {
            this.skipHeaderLineCount = skipHeaderLineCount;
            return this;
        }
        public Builder skipHeaderLineCount(@Nullable Object skipHeaderLineCount) {
            this.skipHeaderLineCount = Output.ofNullable(skipHeaderLineCount);
            return this;
        }
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Output.ofNullable(sourceRetryCount);
            return this;
        }
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Output.ofNullable(sourceRetryWait);
            return this;
        }
        public Builder treatEmptyAsNull(@Nullable Output<Object> treatEmptyAsNull) {
            this.treatEmptyAsNull = treatEmptyAsNull;
            return this;
        }
        public Builder treatEmptyAsNull(@Nullable Object treatEmptyAsNull) {
            this.treatEmptyAsNull = Output.ofNullable(treatEmptyAsNull);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AzureBlobFSSourceArgs build() {
            return new AzureBlobFSSourceArgs(disableMetricsCollection, maxConcurrentConnections, recursive, skipHeaderLineCount, sourceRetryCount, sourceRetryWait, treatEmptyAsNull, type);
        }
    }
}
