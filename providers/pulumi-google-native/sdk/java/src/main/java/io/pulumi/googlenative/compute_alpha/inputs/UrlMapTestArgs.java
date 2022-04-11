// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.inputs.UrlMapTestHeaderArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message for the expected URL mappings.
 * 
 */
public final class UrlMapTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlMapTestArgs Empty = new UrlMapTestArgs();

    /**
     * The weight to use for the supplied host and path when using advanced routing rules that involve traffic splitting.
     * 
     */
    @Import(name="backendServiceWeight")
      private final @Nullable Output<Integer> backendServiceWeight;

    public Output<Integer> getBackendServiceWeight() {
        return this.backendServiceWeight == null ? Codegen.empty() : this.backendServiceWeight;
    }

    /**
     * Description of this test case.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    @Import(name="expectedOutputUrl")
      private final @Nullable Output<String> expectedOutputUrl;

    public Output<String> getExpectedOutputUrl() {
        return this.expectedOutputUrl == null ? Codegen.empty() : this.expectedOutputUrl;
    }

    /**
     * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer's redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    @Import(name="expectedRedirectResponseCode")
      private final @Nullable Output<Integer> expectedRedirectResponseCode;

    public Output<Integer> getExpectedRedirectResponseCode() {
        return this.expectedRedirectResponseCode == null ? Codegen.empty() : this.expectedRedirectResponseCode;
    }

    /**
     * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<List<UrlMapTestHeaderArgs>> headers;

    public Output<List<UrlMapTestHeaderArgs>> getHeaders() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    /**
     * Path portion of the URL.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    public UrlMapTestArgs(
        @Nullable Output<Integer> backendServiceWeight,
        @Nullable Output<String> description,
        @Nullable Output<String> expectedOutputUrl,
        @Nullable Output<Integer> expectedRedirectResponseCode,
        @Nullable Output<List<UrlMapTestHeaderArgs>> headers,
        @Nullable Output<String> host,
        @Nullable Output<String> path,
        @Nullable Output<String> service) {
        this.backendServiceWeight = backendServiceWeight;
        this.description = description;
        this.expectedOutputUrl = expectedOutputUrl;
        this.expectedRedirectResponseCode = expectedRedirectResponseCode;
        this.headers = headers;
        this.host = host;
        this.path = path;
        this.service = service;
    }

    private UrlMapTestArgs() {
        this.backendServiceWeight = Codegen.empty();
        this.description = Codegen.empty();
        this.expectedOutputUrl = Codegen.empty();
        this.expectedRedirectResponseCode = Codegen.empty();
        this.headers = Codegen.empty();
        this.host = Codegen.empty();
        this.path = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> backendServiceWeight;
        private @Nullable Output<String> description;
        private @Nullable Output<String> expectedOutputUrl;
        private @Nullable Output<Integer> expectedRedirectResponseCode;
        private @Nullable Output<List<UrlMapTestHeaderArgs>> headers;
        private @Nullable Output<String> host;
        private @Nullable Output<String> path;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendServiceWeight = defaults.backendServiceWeight;
    	      this.description = defaults.description;
    	      this.expectedOutputUrl = defaults.expectedOutputUrl;
    	      this.expectedRedirectResponseCode = defaults.expectedRedirectResponseCode;
    	      this.headers = defaults.headers;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder backendServiceWeight(@Nullable Output<Integer> backendServiceWeight) {
            this.backendServiceWeight = backendServiceWeight;
            return this;
        }
        public Builder backendServiceWeight(@Nullable Integer backendServiceWeight) {
            this.backendServiceWeight = Codegen.ofNullable(backendServiceWeight);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder expectedOutputUrl(@Nullable Output<String> expectedOutputUrl) {
            this.expectedOutputUrl = expectedOutputUrl;
            return this;
        }
        public Builder expectedOutputUrl(@Nullable String expectedOutputUrl) {
            this.expectedOutputUrl = Codegen.ofNullable(expectedOutputUrl);
            return this;
        }
        public Builder expectedRedirectResponseCode(@Nullable Output<Integer> expectedRedirectResponseCode) {
            this.expectedRedirectResponseCode = expectedRedirectResponseCode;
            return this;
        }
        public Builder expectedRedirectResponseCode(@Nullable Integer expectedRedirectResponseCode) {
            this.expectedRedirectResponseCode = Codegen.ofNullable(expectedRedirectResponseCode);
            return this;
        }
        public Builder headers(@Nullable Output<List<UrlMapTestHeaderArgs>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable List<UrlMapTestHeaderArgs> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder headers(UrlMapTestHeaderArgs... headers) {
            return headers(List.of(headers));
        }
        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Codegen.ofNullable(host);
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
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }        public UrlMapTestArgs build() {
            return new UrlMapTestArgs(backendServiceWeight, description, expectedOutputUrl, expectedRedirectResponseCode, headers, host, path, service);
        }
    }
}
