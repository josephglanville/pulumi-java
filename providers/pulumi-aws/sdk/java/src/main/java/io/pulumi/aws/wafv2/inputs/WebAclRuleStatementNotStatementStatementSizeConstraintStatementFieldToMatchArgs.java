// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs Empty = new WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
