// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
