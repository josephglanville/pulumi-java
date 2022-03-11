// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
