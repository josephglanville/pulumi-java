// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleConditionHostHeaderArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleConditionHttpHeaderArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleConditionHttpRequestMethodArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleConditionPathPatternArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleConditionQueryStringArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleConditionSourceIpArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionArgs Empty = new ListenerRuleConditionArgs();

    /**
     * Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
     * 
     */
    @Import(name="hostHeader")
      private final @Nullable Output<ListenerRuleConditionHostHeaderArgs> hostHeader;

    public Output<ListenerRuleConditionHostHeaderArgs> getHostHeader() {
        return this.hostHeader == null ? Output.empty() : this.hostHeader;
    }

    /**
     * HTTP headers to match. HTTP Header block fields documented below.
     * 
     */
    @Import(name="httpHeader")
      private final @Nullable Output<ListenerRuleConditionHttpHeaderArgs> httpHeader;

    public Output<ListenerRuleConditionHttpHeaderArgs> getHttpHeader() {
        return this.httpHeader == null ? Output.empty() : this.httpHeader;
    }

    /**
     * Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * 
     */
    @Import(name="httpRequestMethod")
      private final @Nullable Output<ListenerRuleConditionHttpRequestMethodArgs> httpRequestMethod;

    public Output<ListenerRuleConditionHttpRequestMethodArgs> getHttpRequestMethod() {
        return this.httpRequestMethod == null ? Output.empty() : this.httpRequestMethod;
    }

    /**
     * Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query_string` condition.
     * 
     */
    @Import(name="pathPattern")
      private final @Nullable Output<ListenerRuleConditionPathPatternArgs> pathPattern;

    public Output<ListenerRuleConditionPathPatternArgs> getPathPattern() {
        return this.pathPattern == null ? Output.empty() : this.pathPattern;
    }

    /**
     * Query strings to match. Query String block fields documented below.
     * 
     */
    @Import(name="queryStrings")
      private final @Nullable Output<List<ListenerRuleConditionQueryStringArgs>> queryStrings;

    public Output<List<ListenerRuleConditionQueryStringArgs>> getQueryStrings() {
        return this.queryStrings == null ? Output.empty() : this.queryStrings;
    }

    /**
     * Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http_header` condition instead.
     * 
     */
    @Import(name="sourceIp")
      private final @Nullable Output<ListenerRuleConditionSourceIpArgs> sourceIp;

    public Output<ListenerRuleConditionSourceIpArgs> getSourceIp() {
        return this.sourceIp == null ? Output.empty() : this.sourceIp;
    }

    public ListenerRuleConditionArgs(
        @Nullable Output<ListenerRuleConditionHostHeaderArgs> hostHeader,
        @Nullable Output<ListenerRuleConditionHttpHeaderArgs> httpHeader,
        @Nullable Output<ListenerRuleConditionHttpRequestMethodArgs> httpRequestMethod,
        @Nullable Output<ListenerRuleConditionPathPatternArgs> pathPattern,
        @Nullable Output<List<ListenerRuleConditionQueryStringArgs>> queryStrings,
        @Nullable Output<ListenerRuleConditionSourceIpArgs> sourceIp) {
        this.hostHeader = hostHeader;
        this.httpHeader = httpHeader;
        this.httpRequestMethod = httpRequestMethod;
        this.pathPattern = pathPattern;
        this.queryStrings = queryStrings;
        this.sourceIp = sourceIp;
    }

    private ListenerRuleConditionArgs() {
        this.hostHeader = Output.empty();
        this.httpHeader = Output.empty();
        this.httpRequestMethod = Output.empty();
        this.pathPattern = Output.empty();
        this.queryStrings = Output.empty();
        this.sourceIp = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerRuleConditionHostHeaderArgs> hostHeader;
        private @Nullable Output<ListenerRuleConditionHttpHeaderArgs> httpHeader;
        private @Nullable Output<ListenerRuleConditionHttpRequestMethodArgs> httpRequestMethod;
        private @Nullable Output<ListenerRuleConditionPathPatternArgs> pathPattern;
        private @Nullable Output<List<ListenerRuleConditionQueryStringArgs>> queryStrings;
        private @Nullable Output<ListenerRuleConditionSourceIpArgs> sourceIp;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostHeader = defaults.hostHeader;
    	      this.httpHeader = defaults.httpHeader;
    	      this.httpRequestMethod = defaults.httpRequestMethod;
    	      this.pathPattern = defaults.pathPattern;
    	      this.queryStrings = defaults.queryStrings;
    	      this.sourceIp = defaults.sourceIp;
        }

        public Builder hostHeader(@Nullable Output<ListenerRuleConditionHostHeaderArgs> hostHeader) {
            this.hostHeader = hostHeader;
            return this;
        }
        public Builder hostHeader(@Nullable ListenerRuleConditionHostHeaderArgs hostHeader) {
            this.hostHeader = Output.ofNullable(hostHeader);
            return this;
        }
        public Builder httpHeader(@Nullable Output<ListenerRuleConditionHttpHeaderArgs> httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }
        public Builder httpHeader(@Nullable ListenerRuleConditionHttpHeaderArgs httpHeader) {
            this.httpHeader = Output.ofNullable(httpHeader);
            return this;
        }
        public Builder httpRequestMethod(@Nullable Output<ListenerRuleConditionHttpRequestMethodArgs> httpRequestMethod) {
            this.httpRequestMethod = httpRequestMethod;
            return this;
        }
        public Builder httpRequestMethod(@Nullable ListenerRuleConditionHttpRequestMethodArgs httpRequestMethod) {
            this.httpRequestMethod = Output.ofNullable(httpRequestMethod);
            return this;
        }
        public Builder pathPattern(@Nullable Output<ListenerRuleConditionPathPatternArgs> pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }
        public Builder pathPattern(@Nullable ListenerRuleConditionPathPatternArgs pathPattern) {
            this.pathPattern = Output.ofNullable(pathPattern);
            return this;
        }
        public Builder queryStrings(@Nullable Output<List<ListenerRuleConditionQueryStringArgs>> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }
        public Builder queryStrings(@Nullable List<ListenerRuleConditionQueryStringArgs> queryStrings) {
            this.queryStrings = Output.ofNullable(queryStrings);
            return this;
        }
        public Builder queryStrings(ListenerRuleConditionQueryStringArgs... queryStrings) {
            return queryStrings(List.of(queryStrings));
        }
        public Builder sourceIp(@Nullable Output<ListenerRuleConditionSourceIpArgs> sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public Builder sourceIp(@Nullable ListenerRuleConditionSourceIpArgs sourceIp) {
            this.sourceIp = Output.ofNullable(sourceIp);
            return this;
        }        public ListenerRuleConditionArgs build() {
            return new ListenerRuleConditionArgs(hostHeader, httpHeader, httpRequestMethod, pathPattern, queryStrings, sourceIp);
        }
    }
}
