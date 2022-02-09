// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.ApiKeyAuthenticationResponse;
import io.pulumi.azurenative.deploymentmanager.inputs.RolloutIdentityAuthenticationResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RestRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestRequestResponse Empty = new RestRequestResponse();

    @InputImport(name="authentication", required=true)
    private final Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication;

    public Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> getAuthentication() {
        return this.authentication;
    }

    @InputImport(name="method", required=true)
    private final String method;

    public String getMethod() {
        return this.method;
    }

    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    public RestRequestResponse(
        Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication,
        String method,
        String uri) {
        this.authentication = Objects.requireNonNull(authentication, "expected parameter 'authentication' to be non-null");
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private RestRequestResponse() {
        this.authentication = null;
        this.method = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication;
        private String method;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RestRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.method = defaults.method;
    	      this.uri = defaults.uri;
        }

        public Builder setAuthentication(Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setMethod(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public RestRequestResponse build() {
            return new RestRequestResponse(authentication, method, uri);
        }
    }
}
