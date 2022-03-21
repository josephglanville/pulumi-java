// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
