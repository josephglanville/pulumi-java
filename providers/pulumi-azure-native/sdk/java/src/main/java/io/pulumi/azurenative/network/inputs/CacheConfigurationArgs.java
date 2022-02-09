// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.DynamicCompressionEnabled;
import io.pulumi.azurenative.network.enums.FrontDoorQuery;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CacheConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheConfigurationArgs Empty = new CacheConfigurationArgs();

    @InputImport(name="cacheDuration")
    private final @Nullable Input<String> cacheDuration;

    public Input<String> getCacheDuration() {
        return this.cacheDuration == null ? Input.empty() : this.cacheDuration;
    }

    @InputImport(name="dynamicCompression")
    private final @Nullable Input<Either<String,DynamicCompressionEnabled>> dynamicCompression;

    public Input<Either<String,DynamicCompressionEnabled>> getDynamicCompression() {
        return this.dynamicCompression == null ? Input.empty() : this.dynamicCompression;
    }

    @InputImport(name="queryParameterStripDirective")
    private final @Nullable Input<Either<String,FrontDoorQuery>> queryParameterStripDirective;

    public Input<Either<String,FrontDoorQuery>> getQueryParameterStripDirective() {
        return this.queryParameterStripDirective == null ? Input.empty() : this.queryParameterStripDirective;
    }

    @InputImport(name="queryParameters")
    private final @Nullable Input<String> queryParameters;

    public Input<String> getQueryParameters() {
        return this.queryParameters == null ? Input.empty() : this.queryParameters;
    }

    public CacheConfigurationArgs(
        @Nullable Input<String> cacheDuration,
        @Nullable Input<Either<String,DynamicCompressionEnabled>> dynamicCompression,
        @Nullable Input<Either<String,FrontDoorQuery>> queryParameterStripDirective,
        @Nullable Input<String> queryParameters) {
        this.cacheDuration = cacheDuration;
        this.dynamicCompression = dynamicCompression;
        this.queryParameterStripDirective = queryParameterStripDirective;
        this.queryParameters = queryParameters;
    }

    private CacheConfigurationArgs() {
        this.cacheDuration = Input.empty();
        this.dynamicCompression = Input.empty();
        this.queryParameterStripDirective = Input.empty();
        this.queryParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cacheDuration;
        private @Nullable Input<Either<String,DynamicCompressionEnabled>> dynamicCompression;
        private @Nullable Input<Either<String,FrontDoorQuery>> queryParameterStripDirective;
        private @Nullable Input<String> queryParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheDuration = defaults.cacheDuration;
    	      this.dynamicCompression = defaults.dynamicCompression;
    	      this.queryParameterStripDirective = defaults.queryParameterStripDirective;
    	      this.queryParameters = defaults.queryParameters;
        }

        public Builder setCacheDuration(@Nullable Input<String> cacheDuration) {
            this.cacheDuration = cacheDuration;
            return this;
        }

        public Builder setCacheDuration(@Nullable String cacheDuration) {
            this.cacheDuration = Input.ofNullable(cacheDuration);
            return this;
        }

        public Builder setDynamicCompression(@Nullable Input<Either<String,DynamicCompressionEnabled>> dynamicCompression) {
            this.dynamicCompression = dynamicCompression;
            return this;
        }

        public Builder setDynamicCompression(@Nullable Either<String,DynamicCompressionEnabled> dynamicCompression) {
            this.dynamicCompression = Input.ofNullable(dynamicCompression);
            return this;
        }

        public Builder setQueryParameterStripDirective(@Nullable Input<Either<String,FrontDoorQuery>> queryParameterStripDirective) {
            this.queryParameterStripDirective = queryParameterStripDirective;
            return this;
        }

        public Builder setQueryParameterStripDirective(@Nullable Either<String,FrontDoorQuery> queryParameterStripDirective) {
            this.queryParameterStripDirective = Input.ofNullable(queryParameterStripDirective);
            return this;
        }

        public Builder setQueryParameters(@Nullable Input<String> queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }

        public Builder setQueryParameters(@Nullable String queryParameters) {
            this.queryParameters = Input.ofNullable(queryParameters);
            return this;
        }

        public CacheConfigurationArgs build() {
            return new CacheConfigurationArgs(cacheDuration, dynamicCompression, queryParameterStripDirective, queryParameters);
        }
    }
}
