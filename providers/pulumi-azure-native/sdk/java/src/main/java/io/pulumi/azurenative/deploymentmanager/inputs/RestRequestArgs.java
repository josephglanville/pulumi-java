// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.enums.RestRequestMethod;
import io.pulumi.azurenative.deploymentmanager.inputs.ApiKeyAuthenticationArgs;
import io.pulumi.azurenative.deploymentmanager.inputs.RolloutIdentityAuthenticationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The properties that make up a REST request
 * 
 */
public final class RestRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestRequestArgs Empty = new RestRequestArgs();

    /**
     * The authentication information required in the request to the health provider.
     * 
     */
    @InputImport(name="authentication", required=true)
      private final Input<Either<ApiKeyAuthenticationArgs,RolloutIdentityAuthenticationArgs>> authentication;

    public Input<Either<ApiKeyAuthenticationArgs,RolloutIdentityAuthenticationArgs>> getAuthentication() {
        return this.authentication;
    }

    /**
     * The HTTP method to use for the request.
     * 
     */
    @InputImport(name="method", required=true)
      private final Input<RestRequestMethod> method;

    public Input<RestRequestMethod> getMethod() {
        return this.method;
    }

    /**
     * The HTTP URI to use for the request.
     * 
     */
    @InputImport(name="uri", required=true)
      private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public RestRequestArgs(
        Input<Either<ApiKeyAuthenticationArgs,RolloutIdentityAuthenticationArgs>> authentication,
        Input<RestRequestMethod> method,
        Input<String> uri) {
        this.authentication = Objects.requireNonNull(authentication, "expected parameter 'authentication' to be non-null");
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private RestRequestArgs() {
        this.authentication = Input.empty();
        this.method = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<ApiKeyAuthenticationArgs,RolloutIdentityAuthenticationArgs>> authentication;
        private Input<RestRequestMethod> method;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RestRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.method = defaults.method;
    	      this.uri = defaults.uri;
        }

        public Builder setAuthentication(Input<Either<ApiKeyAuthenticationArgs,RolloutIdentityAuthenticationArgs>> authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setAuthentication(Either<ApiKeyAuthenticationArgs,RolloutIdentityAuthenticationArgs> authentication) {
            this.authentication = Input.of(Objects.requireNonNull(authentication));
            return this;
        }

        public Builder setMethod(Input<RestRequestMethod> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setMethod(RestRequestMethod method) {
            this.method = Input.of(Objects.requireNonNull(method));
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }
        public RestRequestArgs build() {
            return new RestRequestArgs(authentication, method, uri);
        }
    }
}
