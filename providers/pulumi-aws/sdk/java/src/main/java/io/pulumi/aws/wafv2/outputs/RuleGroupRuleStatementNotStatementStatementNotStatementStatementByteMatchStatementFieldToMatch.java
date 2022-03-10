// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor
    private RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatch(
        @OutputCustomType.Parameter("allQueryArguments") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @OutputCustomType.Parameter("body") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody body,
        @OutputCustomType.Parameter("method") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod method,
        @OutputCustomType.Parameter("queryString") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString queryString,
        @OutputCustomType.Parameter("singleHeader") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader,
        @OutputCustomType.Parameter("singleQueryArgument") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @OutputCustomType.Parameter("uriPath") @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath uriPath) {
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
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatch build() {
            return new RuleGroupRuleStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
