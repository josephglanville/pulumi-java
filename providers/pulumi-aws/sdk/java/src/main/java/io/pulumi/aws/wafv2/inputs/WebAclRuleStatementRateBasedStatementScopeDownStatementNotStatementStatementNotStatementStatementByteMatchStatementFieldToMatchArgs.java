// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs() {
        this.allQueryArguments = Output.empty();
        this.body = Output.empty();
        this.method = Output.empty();
        this.queryString = Output.empty();
        this.singleHeader = Output.empty();
        this.singleQueryArgument = Output.empty();
        this.uriPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}