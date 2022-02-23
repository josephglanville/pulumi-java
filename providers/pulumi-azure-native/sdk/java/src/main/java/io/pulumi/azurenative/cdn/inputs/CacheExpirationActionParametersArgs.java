// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.CacheBehavior;
import io.pulumi.azurenative.cdn.enums.CacheType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the cache expiration action.
 * 
 */
public final class CacheExpirationActionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheExpirationActionParametersArgs Empty = new CacheExpirationActionParametersArgs();

    /**
     * Caching behavior for the requests
     * 
     */
    @InputImport(name="cacheBehavior", required=true)
      private final Input<Either<String,CacheBehavior>> cacheBehavior;

    public Input<Either<String,CacheBehavior>> getCacheBehavior() {
        return this.cacheBehavior;
    }

    /**
     * The duration for which the content needs to be cached. Allowed format is [d.]hh:mm:ss
     * 
     */
    @InputImport(name="cacheDuration")
      private final @Nullable Input<String> cacheDuration;

    public Input<String> getCacheDuration() {
        return this.cacheDuration == null ? Input.empty() : this.cacheDuration;
    }

    /**
     * The level at which the content needs to be cached.
     * 
     */
    @InputImport(name="cacheType", required=true)
      private final Input<Either<String,CacheType>> cacheType;

    public Input<Either<String,CacheType>> getCacheType() {
        return this.cacheType;
    }

    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public CacheExpirationActionParametersArgs(
        Input<Either<String,CacheBehavior>> cacheBehavior,
        @Nullable Input<String> cacheDuration,
        Input<Either<String,CacheType>> cacheType,
        Input<String> odataType) {
        this.cacheBehavior = Objects.requireNonNull(cacheBehavior, "expected parameter 'cacheBehavior' to be non-null");
        this.cacheDuration = cacheDuration;
        this.cacheType = Objects.requireNonNull(cacheType, "expected parameter 'cacheType' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private CacheExpirationActionParametersArgs() {
        this.cacheBehavior = Input.empty();
        this.cacheDuration = Input.empty();
        this.cacheType = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheExpirationActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,CacheBehavior>> cacheBehavior;
        private @Nullable Input<String> cacheDuration;
        private Input<Either<String,CacheType>> cacheType;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheExpirationActionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheBehavior = defaults.cacheBehavior;
    	      this.cacheDuration = defaults.cacheDuration;
    	      this.cacheType = defaults.cacheType;
    	      this.odataType = defaults.odataType;
        }

        public Builder setCacheBehavior(Input<Either<String,CacheBehavior>> cacheBehavior) {
            this.cacheBehavior = Objects.requireNonNull(cacheBehavior);
            return this;
        }

        public Builder setCacheBehavior(Either<String,CacheBehavior> cacheBehavior) {
            this.cacheBehavior = Input.of(Objects.requireNonNull(cacheBehavior));
            return this;
        }

        public Builder setCacheDuration(@Nullable Input<String> cacheDuration) {
            this.cacheDuration = cacheDuration;
            return this;
        }

        public Builder setCacheDuration(@Nullable String cacheDuration) {
            this.cacheDuration = Input.ofNullable(cacheDuration);
            return this;
        }

        public Builder setCacheType(Input<Either<String,CacheType>> cacheType) {
            this.cacheType = Objects.requireNonNull(cacheType);
            return this;
        }

        public Builder setCacheType(Either<String,CacheType> cacheType) {
            this.cacheType = Input.of(Objects.requireNonNull(cacheType));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public CacheExpirationActionParametersArgs build() {
            return new CacheExpirationActionParametersArgs(cacheBehavior, cacheDuration, cacheType, odataType);
        }
    }
}
