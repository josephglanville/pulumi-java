// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckAuthInfoArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigHttpCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigHttpCheckArgs Empty = new UptimeCheckConfigHttpCheckArgs();

    @InputImport(name="authInfo")
    private final @Nullable Input<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo;

    public Input<UptimeCheckConfigHttpCheckAuthInfoArgs> getAuthInfo() {
        return this.authInfo == null ? Input.empty() : this.authInfo;
    }

    @InputImport(name="body")
    private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    @InputImport(name="contentType")
    private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    @InputImport(name="headers")
    private final @Nullable Input<Map<String,String>> headers;

    public Input<Map<String,String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    @InputImport(name="maskHeaders")
    private final @Nullable Input<Boolean> maskHeaders;

    public Input<Boolean> getMaskHeaders() {
        return this.maskHeaders == null ? Input.empty() : this.maskHeaders;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="requestMethod")
    private final @Nullable Input<String> requestMethod;

    public Input<String> getRequestMethod() {
        return this.requestMethod == null ? Input.empty() : this.requestMethod;
    }

    @InputImport(name="useSsl")
    private final @Nullable Input<Boolean> useSsl;

    public Input<Boolean> getUseSsl() {
        return this.useSsl == null ? Input.empty() : this.useSsl;
    }

    @InputImport(name="validateSsl")
    private final @Nullable Input<Boolean> validateSsl;

    public Input<Boolean> getValidateSsl() {
        return this.validateSsl == null ? Input.empty() : this.validateSsl;
    }

    public UptimeCheckConfigHttpCheckArgs(
        @Nullable Input<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo,
        @Nullable Input<String> body,
        @Nullable Input<String> contentType,
        @Nullable Input<Map<String,String>> headers,
        @Nullable Input<Boolean> maskHeaders,
        @Nullable Input<String> path,
        @Nullable Input<Integer> port,
        @Nullable Input<String> requestMethod,
        @Nullable Input<Boolean> useSsl,
        @Nullable Input<Boolean> validateSsl) {
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
        this.authInfo = Input.empty();
        this.body = Input.empty();
        this.contentType = Input.empty();
        this.headers = Input.empty();
        this.maskHeaders = Input.empty();
        this.path = Input.empty();
        this.port = Input.empty();
        this.requestMethod = Input.empty();
        this.useSsl = Input.empty();
        this.validateSsl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigHttpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo;
        private @Nullable Input<String> body;
        private @Nullable Input<String> contentType;
        private @Nullable Input<Map<String,String>> headers;
        private @Nullable Input<Boolean> maskHeaders;
        private @Nullable Input<String> path;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> requestMethod;
        private @Nullable Input<Boolean> useSsl;
        private @Nullable Input<Boolean> validateSsl;

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

        public Builder setAuthInfo(@Nullable Input<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        public Builder setAuthInfo(@Nullable UptimeCheckConfigHttpCheckAuthInfoArgs authInfo) {
            this.authInfo = Input.ofNullable(authInfo);
            return this;
        }

        public Builder setBody(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setHeaders(@Nullable Input<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setMaskHeaders(@Nullable Input<Boolean> maskHeaders) {
            this.maskHeaders = maskHeaders;
            return this;
        }

        public Builder setMaskHeaders(@Nullable Boolean maskHeaders) {
            this.maskHeaders = Input.ofNullable(maskHeaders);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setRequestMethod(@Nullable Input<String> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setRequestMethod(@Nullable String requestMethod) {
            this.requestMethod = Input.ofNullable(requestMethod);
            return this;
        }

        public Builder setUseSsl(@Nullable Input<Boolean> useSsl) {
            this.useSsl = useSsl;
            return this;
        }

        public Builder setUseSsl(@Nullable Boolean useSsl) {
            this.useSsl = Input.ofNullable(useSsl);
            return this;
        }

        public Builder setValidateSsl(@Nullable Input<Boolean> validateSsl) {
            this.validateSsl = validateSsl;
            return this;
        }

        public Builder setValidateSsl(@Nullable Boolean validateSsl) {
            this.validateSsl = Input.ofNullable(validateSsl);
            return this;
        }

        public UptimeCheckConfigHttpCheckArgs build() {
            return new UptimeCheckConfigHttpCheckArgs(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}