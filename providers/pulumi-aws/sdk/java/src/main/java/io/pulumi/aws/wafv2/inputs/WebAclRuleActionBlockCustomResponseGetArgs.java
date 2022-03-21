// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleActionBlockCustomResponseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionBlockCustomResponseGetArgs Empty = new WebAclRuleActionBlockCustomResponseGetArgs();

    /**
     * References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    @Import(name="customResponseBodyKey")
      private final @Nullable Output<String> customResponseBodyKey;

    public Output<String> getCustomResponseBodyKey() {
        return this.customResponseBodyKey == null ? Output.empty() : this.customResponseBodyKey;
    }

    /**
     * The HTTP status code to return to the client.
     * 
     */
    @Import(name="responseCode", required=true)
      private final Output<Integer> responseCode;

    public Output<Integer> getResponseCode() {
        return this.responseCode;
    }

    /**
     * The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="responseHeaders")
      private final @Nullable Output<List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders;

    public Output<List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs>> getResponseHeaders() {
        return this.responseHeaders == null ? Output.empty() : this.responseHeaders;
    }

    public WebAclRuleActionBlockCustomResponseGetArgs(
        @Nullable Output<String> customResponseBodyKey,
        Output<Integer> responseCode,
        @Nullable Output<List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = Objects.requireNonNull(responseCode, "expected parameter 'responseCode' to be non-null");
        this.responseHeaders = responseHeaders;
    }

    private WebAclRuleActionBlockCustomResponseGetArgs() {
        this.customResponseBodyKey = Output.empty();
        this.responseCode = Output.empty();
        this.responseHeaders = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionBlockCustomResponseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customResponseBodyKey;
        private Output<Integer> responseCode;
        private @Nullable Output<List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionBlockCustomResponseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder customResponseBodyKey(@Nullable Output<String> customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }
        public Builder customResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = Output.ofNullable(customResponseBodyKey);
            return this;
        }
        public Builder responseCode(Output<Integer> responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }
        public Builder responseCode(Integer responseCode) {
            this.responseCode = Output.of(Objects.requireNonNull(responseCode));
            return this;
        }
        public Builder responseHeaders(@Nullable Output<List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public Builder responseHeaders(@Nullable List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs> responseHeaders) {
            this.responseHeaders = Output.ofNullable(responseHeaders);
            return this;
        }
        public Builder responseHeaders(WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }        public WebAclRuleActionBlockCustomResponseGetArgs build() {
            return new WebAclRuleActionBlockCustomResponseGetArgs(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}
