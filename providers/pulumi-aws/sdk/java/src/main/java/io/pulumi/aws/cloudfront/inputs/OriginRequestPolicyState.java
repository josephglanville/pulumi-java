// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginRequestPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyState Empty = new OriginRequestPolicyState();

    /**
     * Comment to describe the origin request policy.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    @Import(name="cookiesConfig")
      private final @Nullable Output<OriginRequestPolicyCookiesConfigGetArgs> cookiesConfig;

    public Output<OriginRequestPolicyCookiesConfigGetArgs> getCookiesConfig() {
        return this.cookiesConfig == null ? Output.empty() : this.cookiesConfig;
    }

    /**
     * The current version of the origin request policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    @Import(name="headersConfig")
      private final @Nullable Output<OriginRequestPolicyHeadersConfigGetArgs> headersConfig;

    public Output<OriginRequestPolicyHeadersConfigGetArgs> getHeadersConfig() {
        return this.headersConfig == null ? Output.empty() : this.headersConfig;
    }

    /**
     * Unique name to identify the origin request policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    @Import(name="queryStringsConfig")
      private final @Nullable Output<OriginRequestPolicyQueryStringsConfigGetArgs> queryStringsConfig;

    public Output<OriginRequestPolicyQueryStringsConfigGetArgs> getQueryStringsConfig() {
        return this.queryStringsConfig == null ? Output.empty() : this.queryStringsConfig;
    }

    public OriginRequestPolicyState(
        @Nullable Output<String> comment,
        @Nullable Output<OriginRequestPolicyCookiesConfigGetArgs> cookiesConfig,
        @Nullable Output<String> etag,
        @Nullable Output<OriginRequestPolicyHeadersConfigGetArgs> headersConfig,
        @Nullable Output<String> name,
        @Nullable Output<OriginRequestPolicyQueryStringsConfigGetArgs> queryStringsConfig) {
        this.comment = comment;
        this.cookiesConfig = cookiesConfig;
        this.etag = etag;
        this.headersConfig = headersConfig;
        this.name = name;
        this.queryStringsConfig = queryStringsConfig;
    }

    private OriginRequestPolicyState() {
        this.comment = Output.empty();
        this.cookiesConfig = Output.empty();
        this.etag = Output.empty();
        this.headersConfig = Output.empty();
        this.name = Output.empty();
        this.queryStringsConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private @Nullable Output<OriginRequestPolicyCookiesConfigGetArgs> cookiesConfig;
        private @Nullable Output<String> etag;
        private @Nullable Output<OriginRequestPolicyHeadersConfigGetArgs> headersConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<OriginRequestPolicyQueryStringsConfigGetArgs> queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.etag = defaults.etag;
    	      this.headersConfig = defaults.headersConfig;
    	      this.name = defaults.name;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }
        public Builder cookiesConfig(@Nullable Output<OriginRequestPolicyCookiesConfigGetArgs> cookiesConfig) {
            this.cookiesConfig = cookiesConfig;
            return this;
        }
        public Builder cookiesConfig(@Nullable OriginRequestPolicyCookiesConfigGetArgs cookiesConfig) {
            this.cookiesConfig = Output.ofNullable(cookiesConfig);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder headersConfig(@Nullable Output<OriginRequestPolicyHeadersConfigGetArgs> headersConfig) {
            this.headersConfig = headersConfig;
            return this;
        }
        public Builder headersConfig(@Nullable OriginRequestPolicyHeadersConfigGetArgs headersConfig) {
            this.headersConfig = Output.ofNullable(headersConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder queryStringsConfig(@Nullable Output<OriginRequestPolicyQueryStringsConfigGetArgs> queryStringsConfig) {
            this.queryStringsConfig = queryStringsConfig;
            return this;
        }
        public Builder queryStringsConfig(@Nullable OriginRequestPolicyQueryStringsConfigGetArgs queryStringsConfig) {
            this.queryStringsConfig = Output.ofNullable(queryStringsConfig);
            return this;
        }        public OriginRequestPolicyState build() {
            return new OriginRequestPolicyState(comment, cookiesConfig, etag, headersConfig, name, queryStringsConfig);
        }
    }
}
