// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationRedactedFieldGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldGetArgs Empty = new WebAclLoggingConfigurationRedactedFieldGetArgs();

    /**
     * Redact all query arguments.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments;

    @Deprecated /* Not supported by WAFv2 API */
    public Output<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Redact the request body, which immediately follows the request headers.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @Import(name="body")
      private final @Nullable Output<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body;

    @Deprecated /* Not supported by WAFv2 API */
    public Output<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Redact the HTTP method. Must be specified as an empty configuration block `{}`. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method;

    public Output<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Redact the query string. Must be specified as an empty configuration block `{}`. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString;

    public Output<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Redact a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader;

    public Output<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Redact a single query argument. See Single Query Argument below for details.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument;

    @Deprecated /* Not supported by WAFv2 API */
    public Output<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Redact the request URI path. Must be specified as an empty configuration block `{}`. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath;

    public Output<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclLoggingConfigurationRedactedFieldGetArgs(
        @Nullable Output<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body,
        @Nullable Output<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method,
        @Nullable Output<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString,
        @Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader,
        @Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclLoggingConfigurationRedactedFieldGetArgs() {
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

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body;
        private @Nullable Output<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method;
        private @Nullable Output<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString;
        private @Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclLoggingConfigurationRedactedFieldBodyGetArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclLoggingConfigurationRedactedFieldMethodGetArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclLoggingConfigurationRedactedFieldUriPathGetArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }        public WebAclLoggingConfigurationRedactedFieldGetArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
