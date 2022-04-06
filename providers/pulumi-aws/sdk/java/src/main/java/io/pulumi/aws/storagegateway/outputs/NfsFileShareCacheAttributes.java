// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NfsFileShareCacheAttributes {
    /**
     * Refreshes a file share's cache by using Time To Live (TTL).
     * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
     * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
     * 
     */
    private final @Nullable Integer cacheStaleTimeoutInSeconds;

    @CustomType.Constructor
    private NfsFileShareCacheAttributes(@CustomType.Parameter("cacheStaleTimeoutInSeconds") @Nullable Integer cacheStaleTimeoutInSeconds) {
        this.cacheStaleTimeoutInSeconds = cacheStaleTimeoutInSeconds;
    }

    /**
     * Refreshes a file share's cache by using Time To Live (TTL).
     * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
     * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
     * 
    */
    public Optional<Integer> getCacheStaleTimeoutInSeconds() {
        return Optional.ofNullable(this.cacheStaleTimeoutInSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsFileShareCacheAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cacheStaleTimeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsFileShareCacheAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheStaleTimeoutInSeconds = defaults.cacheStaleTimeoutInSeconds;
        }

        public Builder cacheStaleTimeoutInSeconds(@Nullable Integer cacheStaleTimeoutInSeconds) {
            this.cacheStaleTimeoutInSeconds = cacheStaleTimeoutInSeconds;
            return this;
        }        public NfsFileShareCacheAttributes build() {
            return new NfsFileShareCacheAttributes(cacheStaleTimeoutInSeconds);
        }
    }
}