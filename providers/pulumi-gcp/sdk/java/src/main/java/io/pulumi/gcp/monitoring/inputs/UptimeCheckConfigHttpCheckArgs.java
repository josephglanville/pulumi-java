// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckAuthInfoArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigHttpCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigHttpCheckArgs Empty = new UptimeCheckConfigHttpCheckArgs();

    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * Structure is documented below.
     * 
     */
    @Import(name="authInfo")
      private final @Nullable Output<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo;

    public Output<UptimeCheckConfigHttpCheckAuthInfoArgs> getAuthInfo() {
        return this.authInfo == null ? Codegen.empty() : this.authInfo;
    }

    /**
     * The request body associated with the HTTP POST request. If contentType is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the requestMethod is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note - As with all bytes fields JSON representations are base64 encoded. e.g. "foo=bar" in URL-encoded form is "foo%3Dbar" and in base64 encoding is "Zm9vJTI1M0RiYXI=".
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> getBody() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * The content type to use for the check.
     * Possible values are `TYPE_UNSPECIFIED` and `URL_ENCODED`.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * The list of headers to send as part of the uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<Map<String,String>> headers;

    public Output<Map<String,String>> getHeaders() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to True then the headers will be obscured with ******.
     * 
     */
    @Import(name="maskHeaders")
      private final @Nullable Output<Boolean> maskHeaders;

    public Output<Boolean> getMaskHeaders() {
        return this.maskHeaders == null ? Codegen.empty() : this.maskHeaders;
    }

    /**
     * The path to the page to run the check against. Will be combined with the host (specified within the MonitoredResource) and port to construct the full URL. Optional (defaults to "/").
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then requestMethod defaults to GET.
     * Default value is `GET`.
     * Possible values are `METHOD_UNSPECIFIED`, `GET`, and `POST`.
     * 
     */
    @Import(name="requestMethod")
      private final @Nullable Output<String> requestMethod;

    public Output<String> getRequestMethod() {
        return this.requestMethod == null ? Codegen.empty() : this.requestMethod;
    }

    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    @Import(name="useSsl")
      private final @Nullable Output<Boolean> useSsl;

    public Output<Boolean> getUseSsl() {
        return this.useSsl == null ? Codegen.empty() : this.useSsl;
    }

    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitoredResource is set to uptime_url. If useSsl is false, setting validateSsl to true has no effect.
     * 
     */
    @Import(name="validateSsl")
      private final @Nullable Output<Boolean> validateSsl;

    public Output<Boolean> getValidateSsl() {
        return this.validateSsl == null ? Codegen.empty() : this.validateSsl;
    }

    public UptimeCheckConfigHttpCheckArgs(
        @Nullable Output<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo,
        @Nullable Output<String> body,
        @Nullable Output<String> contentType,
        @Nullable Output<Map<String,String>> headers,
        @Nullable Output<Boolean> maskHeaders,
        @Nullable Output<String> path,
        @Nullable Output<Integer> port,
        @Nullable Output<String> requestMethod,
        @Nullable Output<Boolean> useSsl,
        @Nullable Output<Boolean> validateSsl) {
        this.authInfo = authInfo;
        this.body = body;
        this.contentType = contentType;
        this.headers = headers;
        this.maskHeaders = maskHeaders;
        this.path = path;
        this.port = port;
        this.requestMethod = requestMethod;
        this.useSsl = useSsl;
        this.validateSsl = validateSsl;
    }

    private UptimeCheckConfigHttpCheckArgs() {
        this.authInfo = Codegen.empty();
        this.body = Codegen.empty();
        this.contentType = Codegen.empty();
        this.headers = Codegen.empty();
        this.maskHeaders = Codegen.empty();
        this.path = Codegen.empty();
        this.port = Codegen.empty();
        this.requestMethod = Codegen.empty();
        this.useSsl = Codegen.empty();
        this.validateSsl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigHttpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo;
        private @Nullable Output<String> body;
        private @Nullable Output<String> contentType;
        private @Nullable Output<Map<String,String>> headers;
        private @Nullable Output<Boolean> maskHeaders;
        private @Nullable Output<String> path;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> requestMethod;
        private @Nullable Output<Boolean> useSsl;
        private @Nullable Output<Boolean> validateSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigHttpCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.body = defaults.body;
    	      this.contentType = defaults.contentType;
    	      this.headers = defaults.headers;
    	      this.maskHeaders = defaults.maskHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.requestMethod = defaults.requestMethod;
    	      this.useSsl = defaults.useSsl;
    	      this.validateSsl = defaults.validateSsl;
        }

        public Builder authInfo(@Nullable Output<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo) {
            this.authInfo = authInfo;
            return this;
        }
        public Builder authInfo(@Nullable UptimeCheckConfigHttpCheckAuthInfoArgs authInfo) {
            this.authInfo = Codegen.ofNullable(authInfo);
            return this;
        }
        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder maskHeaders(@Nullable Output<Boolean> maskHeaders) {
            this.maskHeaders = maskHeaders;
            return this;
        }
        public Builder maskHeaders(@Nullable Boolean maskHeaders) {
            this.maskHeaders = Codegen.ofNullable(maskHeaders);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder requestMethod(@Nullable Output<String> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Builder requestMethod(@Nullable String requestMethod) {
            this.requestMethod = Codegen.ofNullable(requestMethod);
            return this;
        }
        public Builder useSsl(@Nullable Output<Boolean> useSsl) {
            this.useSsl = useSsl;
            return this;
        }
        public Builder useSsl(@Nullable Boolean useSsl) {
            this.useSsl = Codegen.ofNullable(useSsl);
            return this;
        }
        public Builder validateSsl(@Nullable Output<Boolean> validateSsl) {
            this.validateSsl = validateSsl;
            return this;
        }
        public Builder validateSsl(@Nullable Boolean validateSsl) {
            this.validateSsl = Codegen.ofNullable(validateSsl);
            return this;
        }        public UptimeCheckConfigHttpCheckArgs build() {
            return new UptimeCheckConfigHttpCheckArgs(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}
