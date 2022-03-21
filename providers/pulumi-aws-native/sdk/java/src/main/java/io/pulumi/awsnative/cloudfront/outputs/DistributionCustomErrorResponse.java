// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionCustomErrorResponse {
    private final @Nullable Double errorCachingMinTTL;
    private final Integer errorCode;
    private final @Nullable Integer responseCode;
    private final @Nullable String responsePagePath;

    @CustomType.Constructor
    private DistributionCustomErrorResponse(
        @CustomType.Parameter("errorCachingMinTTL") @Nullable Double errorCachingMinTTL,
        @CustomType.Parameter("errorCode") Integer errorCode,
        @CustomType.Parameter("responseCode") @Nullable Integer responseCode,
        @CustomType.Parameter("responsePagePath") @Nullable String responsePagePath) {
        this.errorCachingMinTTL = errorCachingMinTTL;
        this.errorCode = errorCode;
        this.responseCode = responseCode;
        this.responsePagePath = responsePagePath;
    }

    public Optional<Double> getErrorCachingMinTTL() {
        return Optional.ofNullable(this.errorCachingMinTTL);
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }
    public Optional<Integer> getResponseCode() {
        return Optional.ofNullable(this.responseCode);
    }
    public Optional<String> getResponsePagePath() {
        return Optional.ofNullable(this.responsePagePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCustomErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double errorCachingMinTTL;
        private Integer errorCode;
        private @Nullable Integer responseCode;
        private @Nullable String responsePagePath;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCustomErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCachingMinTTL = defaults.errorCachingMinTTL;
    	      this.errorCode = defaults.errorCode;
    	      this.responseCode = defaults.responseCode;
    	      this.responsePagePath = defaults.responsePagePath;
        }

        public Builder errorCachingMinTTL(@Nullable Double errorCachingMinTTL) {
            this.errorCachingMinTTL = errorCachingMinTTL;
            return this;
        }
        public Builder errorCode(Integer errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        public Builder responseCode(@Nullable Integer responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        public Builder responsePagePath(@Nullable String responsePagePath) {
            this.responsePagePath = responsePagePath;
            return this;
        }        public DistributionCustomErrorResponse build() {
            return new DistributionCustomErrorResponse(errorCachingMinTTL, errorCode, responseCode, responsePagePath);
        }
    }
}
