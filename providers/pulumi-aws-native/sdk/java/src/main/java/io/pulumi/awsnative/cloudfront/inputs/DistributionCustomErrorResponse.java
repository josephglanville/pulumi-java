// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionCustomErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final DistributionCustomErrorResponse Empty = new DistributionCustomErrorResponse();

    @Import(name="errorCachingMinTTL")
      private final @Nullable Double errorCachingMinTTL;

    public Optional<Double> getErrorCachingMinTTL() {
        return this.errorCachingMinTTL == null ? Optional.empty() : Optional.ofNullable(this.errorCachingMinTTL);
    }

    @Import(name="errorCode", required=true)
      private final Integer errorCode;

    public Integer getErrorCode() {
        return this.errorCode;
    }

    @Import(name="responseCode")
      private final @Nullable Integer responseCode;

    public Optional<Integer> getResponseCode() {
        return this.responseCode == null ? Optional.empty() : Optional.ofNullable(this.responseCode);
    }

    @Import(name="responsePagePath")
      private final @Nullable String responsePagePath;

    public Optional<String> getResponsePagePath() {
        return this.responsePagePath == null ? Optional.empty() : Optional.ofNullable(this.responsePagePath);
    }

    public DistributionCustomErrorResponse(
        @Nullable Double errorCachingMinTTL,
        Integer errorCode,
        @Nullable Integer responseCode,
        @Nullable String responsePagePath) {
        this.errorCachingMinTTL = errorCachingMinTTL;
        this.errorCode = Objects.requireNonNull(errorCode, "expected parameter 'errorCode' to be non-null");
        this.responseCode = responseCode;
        this.responsePagePath = responsePagePath;
    }

    private DistributionCustomErrorResponse() {
        this.errorCachingMinTTL = null;
        this.errorCode = null;
        this.responseCode = null;
        this.responsePagePath = null;
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
