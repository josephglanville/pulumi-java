// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor
    private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch(
        @OutputCustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments,
        @OutputCustomType.Parameter("body") @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body,
        @OutputCustomType.Parameter("method") @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method,
        @OutputCustomType.Parameter("queryString") @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString,
        @OutputCustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader,
        @OutputCustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @OutputCustomType.Parameter("uriPath") @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
