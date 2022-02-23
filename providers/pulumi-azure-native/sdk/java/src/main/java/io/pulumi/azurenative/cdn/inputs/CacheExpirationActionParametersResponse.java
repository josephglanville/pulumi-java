// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the cache expiration action.
 * 
 */
public final class CacheExpirationActionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheExpirationActionParametersResponse Empty = new CacheExpirationActionParametersResponse();

    /**
     * Caching behavior for the requests
     * 
     */
    @InputImport(name="cacheBehavior", required=true)
      private final String cacheBehavior;

    public String getCacheBehavior() {
        return this.cacheBehavior;
    }

    /**
     * The duration for which the content needs to be cached. Allowed format is [d.]hh:mm:ss
     * 
     */
    @InputImport(name="cacheDuration")
      private final @Nullable String cacheDuration;

    public Optional<String> getCacheDuration() {
        return this.cacheDuration == null ? Optional.empty() : Optional.ofNullable(this.cacheDuration);
    }

    /**
     * The level at which the content needs to be cached.
     * 
     */
    @InputImport(name="cacheType", required=true)
      private final String cacheType;

    public String getCacheType() {
        return this.cacheType;
    }

    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public CacheExpirationActionParametersResponse(
        String cacheBehavior,
        @Nullable String cacheDuration,
        String cacheType,
        String odataType) {
        this.cacheBehavior = Objects.requireNonNull(cacheBehavior, "expected parameter 'cacheBehavior' to be non-null");
        this.cacheDuration = cacheDuration;
        this.cacheType = Objects.requireNonNull(cacheType, "expected parameter 'cacheType' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private CacheExpirationActionParametersResponse() {
        this.cacheBehavior = null;
        this.cacheDuration = null;
        this.cacheType = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheExpirationActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheBehavior;
        private @Nullable String cacheDuration;
        private String cacheType;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheExpirationActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheBehavior = defaults.cacheBehavior;
    	      this.cacheDuration = defaults.cacheDuration;
    	      this.cacheType = defaults.cacheType;
    	      this.odataType = defaults.odataType;
        }

        public Builder setCacheBehavior(String cacheBehavior) {
            this.cacheBehavior = Objects.requireNonNull(cacheBehavior);
            return this;
        }

        public Builder setCacheDuration(@Nullable String cacheDuration) {
            this.cacheDuration = cacheDuration;
            return this;
        }

        public Builder setCacheType(String cacheType) {
            this.cacheType = Objects.requireNonNull(cacheType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public CacheExpirationActionParametersResponse build() {
            return new CacheExpirationActionParametersResponse(cacheBehavior, cacheDuration, cacheType, odataType);
        }
    }
}
