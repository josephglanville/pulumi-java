// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}