// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
