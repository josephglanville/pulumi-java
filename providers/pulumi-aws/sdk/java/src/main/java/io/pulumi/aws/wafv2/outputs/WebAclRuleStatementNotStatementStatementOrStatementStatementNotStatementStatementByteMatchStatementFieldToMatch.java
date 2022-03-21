// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
