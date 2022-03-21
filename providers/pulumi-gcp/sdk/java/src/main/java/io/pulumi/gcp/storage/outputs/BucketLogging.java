// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLogging {
    /**
     * The bucket that will receive log objects.
     * 
     */
    private final String logBucket;
    /**
     * The object prefix for log objects. If it's not provided,
     * by default GCS sets this to this bucket's name.
     * 
     */
    private final @Nullable String logObjectPrefix;

    @CustomType.Constructor
    private BucketLogging(
        @CustomType.Parameter("logBucket") String logBucket,
        @CustomType.Parameter("logObjectPrefix") @Nullable String logObjectPrefix) {
        this.logBucket = logBucket;
        this.logObjectPrefix = logObjectPrefix;
    }

    /**
     * The bucket that will receive log objects.
     * 
    */
    public String getLogBucket() {
        return this.logBucket;
    }
    /**
     * The object prefix for log objects. If it's not provided,
     * by default GCS sets this to this bucket's name.
     * 
    */
    public Optional<String> getLogObjectPrefix() {
        return Optional.ofNullable(this.logObjectPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logBucket;
        private @Nullable String logObjectPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logBucket = defaults.logBucket;
    	      this.logObjectPrefix = defaults.logObjectPrefix;
        }

        public Builder logBucket(String logBucket) {
            this.logBucket = Objects.requireNonNull(logBucket);
            return this;
        }
        public Builder logObjectPrefix(@Nullable String logObjectPrefix) {
            this.logObjectPrefix = logObjectPrefix;
            return this;
        }        public BucketLogging build() {
            return new BucketLogging(logBucket, logObjectPrefix);
        }
    }
}
