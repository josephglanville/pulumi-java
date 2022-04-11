// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Codegen.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Codegen.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Codegen.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Codegen.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Codegen.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs() {
        this.allQueryArguments = Codegen.empty();
        this.body = Codegen.empty();
        this.method = Codegen.empty();
        this.queryString = Codegen.empty();
        this.singleHeader = Codegen.empty();
        this.singleQueryArgument = Codegen.empty();
        this.uriPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Codegen.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Codegen.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Codegen.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Codegen.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Codegen.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
