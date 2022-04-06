// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * Inspect all query arguments.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}