// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLCustomHTTPHeader;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom response.
 * 
 */
public final class WebACLCustomResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebACLCustomResponse Empty = new WebACLCustomResponse();

    /**
     * Custom response body key.
     * 
     */
    @InputImport(name="customResponseBodyKey")
      private final @Nullable String customResponseBodyKey;

    public Optional<String> getCustomResponseBodyKey() {
        return this.customResponseBodyKey == null ? Optional.empty() : Optional.ofNullable(this.customResponseBodyKey);
    }

    @InputImport(name="responseCode", required=true)
      private final Integer responseCode;

    public Integer getResponseCode() {
        return this.responseCode;
    }

    /**
     * Collection of HTTP headers.
     * 
     */
    @InputImport(name="responseHeaders")
      private final @Nullable List<WebACLCustomHTTPHeader> responseHeaders;

    public List<WebACLCustomHTTPHeader> getResponseHeaders() {
        return this.responseHeaders == null ? List.of() : this.responseHeaders;
    }

    public WebACLCustomResponse(
        @Nullable String customResponseBodyKey,
        Integer responseCode,
        @Nullable List<WebACLCustomHTTPHeader> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = Objects.requireNonNull(responseCode, "expected parameter 'responseCode' to be non-null");
        this.responseHeaders = responseHeaders;
    }

    private WebACLCustomResponse() {
        this.customResponseBodyKey = null;
        this.responseCode = null;
        this.responseHeaders = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customResponseBodyKey;
        private Integer responseCode;
        private @Nullable List<WebACLCustomHTTPHeader> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCustomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder setCustomResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        public Builder setResponseCode(Integer responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }

        public Builder setResponseHeaders(@Nullable List<WebACLCustomHTTPHeader> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public WebACLCustomResponse build() {
            return new WebACLCustomResponse(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}
