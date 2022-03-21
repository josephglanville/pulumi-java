// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionCookies;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionForwardedValues extends io.pulumi.resources.InvokeArgs {

    public static final DistributionForwardedValues Empty = new DistributionForwardedValues();

    @Import(name="cookies")
      private final @Nullable DistributionCookies cookies;

    public Optional<DistributionCookies> getCookies() {
        return this.cookies == null ? Optional.empty() : Optional.ofNullable(this.cookies);
    }

    @Import(name="headers")
      private final @Nullable List<String> headers;

    public List<String> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }

    @Import(name="queryString", required=true)
      private final Boolean queryString;

    public Boolean getQueryString() {
        return this.queryString;
    }

    @Import(name="queryStringCacheKeys")
      private final @Nullable List<String> queryStringCacheKeys;

    public List<String> getQueryStringCacheKeys() {
        return this.queryStringCacheKeys == null ? List.of() : this.queryStringCacheKeys;
    }

    public DistributionForwardedValues(
        @Nullable DistributionCookies cookies,
        @Nullable List<String> headers,
        Boolean queryString,
        @Nullable List<String> queryStringCacheKeys) {
        this.cookies = cookies;
        this.headers = headers;
        this.queryString = Objects.requireNonNull(queryString, "expected parameter 'queryString' to be non-null");
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    private DistributionForwardedValues() {
        this.cookies = null;
        this.headers = List.of();
        this.queryString = null;
        this.queryStringCacheKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionForwardedValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DistributionCookies cookies;
        private @Nullable List<String> headers;
        private Boolean queryString;
        private @Nullable List<String> queryStringCacheKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionForwardedValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.queryString = defaults.queryString;
    	      this.queryStringCacheKeys = defaults.queryStringCacheKeys;
        }

        public Builder cookies(@Nullable DistributionCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        public Builder queryString(Boolean queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }
        public Builder queryStringCacheKeys(@Nullable List<String> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }
        public Builder queryStringCacheKeys(String... queryStringCacheKeys) {
            return queryStringCacheKeys(List.of(queryStringCacheKeys));
        }        public DistributionForwardedValues build() {
            return new DistributionForwardedValues(cookies, headers, queryString, queryStringCacheKeys);
        }
    }
}
