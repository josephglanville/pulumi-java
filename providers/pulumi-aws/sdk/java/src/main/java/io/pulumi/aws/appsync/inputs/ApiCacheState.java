// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiCacheState extends io.pulumi.resources.ResourceArgs {

    public static final ApiCacheState Empty = new ApiCacheState();

    /**
     * Caching behavior. Valid values are `FULL_REQUEST_CACHING` and `PER_RESOLVER_CACHING`.
     * 
     */
    @Import(name="apiCachingBehavior")
      private final @Nullable Output<String> apiCachingBehavior;

    public Output<String> getApiCachingBehavior() {
        return this.apiCachingBehavior == null ? Output.empty() : this.apiCachingBehavior;
    }

    /**
     * The GraphQL API ID.
     * 
     */
    @Import(name="apiId")
      private final @Nullable Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId == null ? Output.empty() : this.apiId;
    }

    /**
     * At-rest encryption flag for cache. You cannot update this setting after creation.
     * 
     */
    @Import(name="atRestEncryptionEnabled")
      private final @Nullable Output<Boolean> atRestEncryptionEnabled;

    public Output<Boolean> getAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled == null ? Output.empty() : this.atRestEncryptionEnabled;
    }

    /**
     * Transit encryption flag when connecting to cache. You cannot update this setting after creation.
     * 
     */
    @Import(name="transitEncryptionEnabled")
      private final @Nullable Output<Boolean> transitEncryptionEnabled;

    public Output<Boolean> getTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled == null ? Output.empty() : this.transitEncryptionEnabled;
    }

    /**
     * TTL in seconds for cache entries.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<Integer> ttl;

    public Output<Integer> getTtl() {
        return this.ttl == null ? Output.empty() : this.ttl;
    }

    /**
     * The cache instance type. Valid values are `SMALL`, `MEDIUM`, `LARGE`, `XLARGE`, `LARGE_2X`, `LARGE_4X`, `LARGE_8X`, `LARGE_12X`, `T2_SMALL`, `T2_MEDIUM`, `R4_LARGE`, `R4_XLARGE`, `R4_2XLARGE`, `R4_4XLARGE`, `R4_8XLARGE`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ApiCacheState(
        @Nullable Output<String> apiCachingBehavior,
        @Nullable Output<String> apiId,
        @Nullable Output<Boolean> atRestEncryptionEnabled,
        @Nullable Output<Boolean> transitEncryptionEnabled,
        @Nullable Output<Integer> ttl,
        @Nullable Output<String> type) {
        this.apiCachingBehavior = apiCachingBehavior;
        this.apiId = apiId;
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
        this.transitEncryptionEnabled = transitEncryptionEnabled;
        this.ttl = ttl;
        this.type = type;
    }

    private ApiCacheState() {
        this.apiCachingBehavior = Output.empty();
        this.apiId = Output.empty();
        this.atRestEncryptionEnabled = Output.empty();
        this.transitEncryptionEnabled = Output.empty();
        this.ttl = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiCacheState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiCachingBehavior;
        private @Nullable Output<String> apiId;
        private @Nullable Output<Boolean> atRestEncryptionEnabled;
        private @Nullable Output<Boolean> transitEncryptionEnabled;
        private @Nullable Output<Integer> ttl;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiCacheState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiCachingBehavior = defaults.apiCachingBehavior;
    	      this.apiId = defaults.apiId;
    	      this.atRestEncryptionEnabled = defaults.atRestEncryptionEnabled;
    	      this.transitEncryptionEnabled = defaults.transitEncryptionEnabled;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        public Builder apiCachingBehavior(@Nullable Output<String> apiCachingBehavior) {
            this.apiCachingBehavior = apiCachingBehavior;
            return this;
        }
        public Builder apiCachingBehavior(@Nullable String apiCachingBehavior) {
            this.apiCachingBehavior = Output.ofNullable(apiCachingBehavior);
            return this;
        }
        public Builder apiId(@Nullable Output<String> apiId) {
            this.apiId = apiId;
            return this;
        }
        public Builder apiId(@Nullable String apiId) {
            this.apiId = Output.ofNullable(apiId);
            return this;
        }
        public Builder atRestEncryptionEnabled(@Nullable Output<Boolean> atRestEncryptionEnabled) {
            this.atRestEncryptionEnabled = atRestEncryptionEnabled;
            return this;
        }
        public Builder atRestEncryptionEnabled(@Nullable Boolean atRestEncryptionEnabled) {
            this.atRestEncryptionEnabled = Output.ofNullable(atRestEncryptionEnabled);
            return this;
        }
        public Builder transitEncryptionEnabled(@Nullable Output<Boolean> transitEncryptionEnabled) {
            this.transitEncryptionEnabled = transitEncryptionEnabled;
            return this;
        }
        public Builder transitEncryptionEnabled(@Nullable Boolean transitEncryptionEnabled) {
            this.transitEncryptionEnabled = Output.ofNullable(transitEncryptionEnabled);
            return this;
        }
        public Builder ttl(@Nullable Output<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = Output.ofNullable(ttl);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public ApiCacheState build() {
            return new ApiCacheState(apiCachingBehavior, apiId, atRestEncryptionEnabled, transitEncryptionEnabled, ttl, type);
        }
    }
}
