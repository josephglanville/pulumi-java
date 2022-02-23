// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Blob source.
 * 
 */
public final class BlobSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlobSourceResponse Empty = new BlobSourceResponse();

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
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="recursive")
      private final @Nullable Object recursive;

    public Optional<Object> getRecursive() {
        return this.recursive == null ? Optional.empty() : Optional.ofNullable(this.recursive);
    }

    /**
     * Number of header lines to skip from each blob. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="skipHeaderLineCount")
      private final @Nullable Object skipHeaderLineCount;

    public Optional<Object> getSkipHeaderLineCount() {
        return this.skipHeaderLineCount == null ? Optional.empty() : Optional.ofNullable(this.skipHeaderLineCount);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
      private final @Nullable Object sourceRetryCount;

    public Optional<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
      private final @Nullable Object sourceRetryWait;

    public Optional<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Treat empty as null. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="treatEmptyAsNull")
      private final @Nullable Object treatEmptyAsNull;

    public Optional<Object> getTreatEmptyAsNull() {
        return this.treatEmptyAsNull == null ? Optional.empty() : Optional.ofNullable(this.treatEmptyAsNull);
    }

    /**
     * Copy source type.
     * Expected value is 'BlobSource'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public BlobSourceResponse(
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object recursive,
        @Nullable Object skipHeaderLineCount,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        @Nullable Object treatEmptyAsNull,
        String type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.recursive = recursive;
        this.skipHeaderLineCount = skipHeaderLineCount;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.treatEmptyAsNull = treatEmptyAsNull;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BlobSourceResponse() {
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.recursive = null;
        this.skipHeaderLineCount = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.treatEmptyAsNull = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object recursive;
        private @Nullable Object skipHeaderLineCount;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private @Nullable Object treatEmptyAsNull;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobSourceResponse defaults) {
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

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setRecursive(@Nullable Object recursive) {
            this.recursive = recursive;
            return this;
        }

        public Builder setSkipHeaderLineCount(@Nullable Object skipHeaderLineCount) {
            this.skipHeaderLineCount = skipHeaderLineCount;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setTreatEmptyAsNull(@Nullable Object treatEmptyAsNull) {
            this.treatEmptyAsNull = treatEmptyAsNull;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public BlobSourceResponse build() {
            return new BlobSourceResponse(disableMetricsCollection, maxConcurrentConnections, recursive, skipHeaderLineCount, sourceRetryCount, sourceRetryWait, treatEmptyAsNull, type);
        }
    }
}
