// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs() {
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

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
