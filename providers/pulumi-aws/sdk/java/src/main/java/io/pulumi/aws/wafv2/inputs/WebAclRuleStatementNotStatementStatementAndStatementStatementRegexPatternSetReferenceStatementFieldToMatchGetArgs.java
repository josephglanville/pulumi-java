// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs() {
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

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
